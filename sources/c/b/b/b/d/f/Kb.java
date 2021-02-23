package c.b.b.b.d.f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class Kb extends Za<Float> implements Tb<Float>, Hc, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Kb f4202b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f4203c;

    /* renamed from: d  reason: collision with root package name */
    private int f4204d;

    static {
        Kb kb = new Kb(new float[0], 0);
        f4202b = kb;
        kb.m();
    }

    Kb() {
        this(new float[10], 0);
    }

    private Kb(float[] fArr, int i) {
        this.f4203c = fArr;
        this.f4204d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4204d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private final String h(int i) {
        int i2 = this.f4204d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Tb a(int i) {
        if (i >= this.f4204d) {
            return new Kb(Arrays.copyOf(this.f4203c, i), this.f4204d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(float f2) {
        c();
        int i = this.f4204d;
        float[] fArr = this.f4203c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f4203c = fArr2;
        }
        float[] fArr3 = this.f4203c;
        int i2 = this.f4204d;
        this.f4204d = i2 + 1;
        fArr3[i2] = f2;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.f4204d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        float[] fArr = this.f4203c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f4203c, i, fArr2, i + 1, this.f4204d - i);
            this.f4203c = fArr2;
        }
        this.f4203c[i] = floatValue;
        this.f4204d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        Nb.a(collection);
        if (!(collection instanceof Kb)) {
            return super.addAll(collection);
        }
        Kb kb = (Kb) collection;
        int i = kb.f4204d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4204d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f4203c;
            if (i3 > fArr.length) {
                this.f4203c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(kb.f4203c, 0, this.f4203c, this.f4204d, kb.f4204d);
            this.f4204d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kb)) {
            return super.equals(obj);
        }
        Kb kb = (Kb) obj;
        if (this.f4204d != kb.f4204d) {
            return false;
        }
        float[] fArr = kb.f4203c;
        for (int i = 0; i < this.f4204d; i++) {
            if (Float.floatToIntBits(this.f4203c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.f4203c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4204d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f4203c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        float[] fArr = this.f4203c;
        float f2 = fArr[i];
        int i2 = this.f4204d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f4204d--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4204d; i++) {
            if (obj.equals(Float.valueOf(this.f4203c[i]))) {
                float[] fArr = this.f4203c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f4204d - i) - 1);
                this.f4204d--;
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
            float[] fArr = this.f4203c;
            System.arraycopy(fArr, i2, fArr, i, this.f4204d - i2);
            this.f4204d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        b(i);
        float[] fArr = this.f4203c;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f4204d;
    }
}
