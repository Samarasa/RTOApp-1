package c.b.b.b.d.f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.b.b.b.d.f.cb  reason: case insensitive filesystem */
final class C0306cb extends Za<Boolean> implements Tb<Boolean>, Hc, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C0306cb f4388b;

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f4389c;

    /* renamed from: d  reason: collision with root package name */
    private int f4390d;

    static {
        C0306cb cbVar = new C0306cb(new boolean[0], 0);
        f4388b = cbVar;
        cbVar.m();
    }

    C0306cb() {
        this(new boolean[10], 0);
    }

    private C0306cb(boolean[] zArr, int i) {
        this.f4389c = zArr;
        this.f4390d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4390d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private final String h(int i) {
        int i2 = this.f4390d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Tb a(int i) {
        if (i >= this.f4390d) {
            return new C0306cb(Arrays.copyOf(this.f4389c, i), this.f4390d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(boolean z) {
        c();
        int i = this.f4390d;
        boolean[] zArr = this.f4389c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f4389c = zArr2;
        }
        boolean[] zArr3 = this.f4389c;
        int i2 = this.f4390d;
        this.f4390d = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.f4390d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        boolean[] zArr = this.f4389c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f4389c, i, zArr2, i + 1, this.f4390d - i);
            this.f4389c = zArr2;
        }
        this.f4389c[i] = booleanValue;
        this.f4390d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Nb.a(collection);
        if (!(collection instanceof C0306cb)) {
            return super.addAll(collection);
        }
        C0306cb cbVar = (C0306cb) collection;
        int i = cbVar.f4390d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4390d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f4389c;
            if (i3 > zArr.length) {
                this.f4389c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(cbVar.f4389c, 0, this.f4389c, this.f4390d, cbVar.f4390d);
            this.f4390d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0306cb)) {
            return super.equals(obj);
        }
        C0306cb cbVar = (C0306cb) obj;
        if (this.f4390d != cbVar.f4390d) {
            return false;
        }
        boolean[] zArr = cbVar.f4389c;
        for (int i = 0; i < this.f4390d; i++) {
            if (this.f4389c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.f4389c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4390d; i2++) {
            i = (i * 31) + Nb.a(this.f4389c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        boolean[] zArr = this.f4389c;
        boolean z = zArr[i];
        int i2 = this.f4390d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f4390d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4390d; i++) {
            if (obj.equals(Boolean.valueOf(this.f4389c[i]))) {
                boolean[] zArr = this.f4389c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f4390d - i) - 1);
                this.f4390d--;
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
            boolean[] zArr = this.f4389c;
            System.arraycopy(zArr, i2, zArr, i, this.f4390d - i2);
            this.f4390d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i);
        boolean[] zArr = this.f4389c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f4390d;
    }
}
