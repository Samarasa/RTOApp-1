package c.b.b.b.d.f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class Ob extends Za<Integer> implements Rb, Hc, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Ob f4248b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4249c;

    /* renamed from: d  reason: collision with root package name */
    private int f4250d;

    static {
        Ob ob = new Ob(new int[0], 0);
        f4248b = ob;
        ob.m();
    }

    Ob() {
        this(new int[10], 0);
    }

    private Ob(int[] iArr, int i) {
        this.f4249c = iArr;
        this.f4250d = i;
    }

    public static Ob d() {
        return f4248b;
    }

    private final void k(int i) {
        if (i < 0 || i >= this.f4250d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f4250d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.f4250d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        int[] iArr = this.f4249c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f4249c, i, iArr2, i + 1, this.f4250d - i);
            this.f4249c = iArr2;
        }
        this.f4249c[i] = intValue;
        this.f4250d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        Nb.a(collection);
        if (!(collection instanceof Ob)) {
            return super.addAll(collection);
        }
        Ob ob = (Ob) collection;
        int i = ob.f4250d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4250d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f4249c;
            if (i3 > iArr.length) {
                this.f4249c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(ob.f4249c, 0, this.f4249c, this.f4250d, ob.f4250d);
            this.f4250d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final Rb a(int i) {
        if (i >= this.f4250d) {
            return new Ob(Arrays.copyOf(this.f4249c, i), this.f4250d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ob)) {
            return super.equals(obj);
        }
        Ob ob = (Ob) obj;
        if (this.f4250d != ob.f4250d) {
            return false;
        }
        int[] iArr = ob.f4249c;
        for (int i = 0; i < this.f4250d; i++) {
            if (this.f4249c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        k(i);
        return this.f4249c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4250d; i2++) {
            i = (i * 31) + this.f4249c[i2];
        }
        return i;
    }

    public final void j(int i) {
        c();
        int i2 = this.f4250d;
        int[] iArr = this.f4249c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4249c = iArr2;
        }
        int[] iArr3 = this.f4249c;
        int i3 = this.f4250d;
        this.f4250d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        k(i);
        int[] iArr = this.f4249c;
        int i2 = iArr[i];
        int i3 = this.f4250d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f4250d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4250d; i++) {
            if (obj.equals(Integer.valueOf(this.f4249c[i]))) {
                int[] iArr = this.f4249c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f4250d - i) - 1);
                this.f4250d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            int[] iArr = this.f4249c;
            System.arraycopy(iArr, i2, iArr, i, this.f4250d - i2);
            this.f4250d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        k(i);
        int[] iArr = this.f4249c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f4250d;
    }
}
