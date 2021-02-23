package c.b.b.b.d.f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.b.b.b.d.f.wb  reason: case insensitive filesystem */
final class C0444wb extends Za<Double> implements Tb<Double>, Hc, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C0444wb f4620b;

    /* renamed from: c  reason: collision with root package name */
    private double[] f4621c;

    /* renamed from: d  reason: collision with root package name */
    private int f4622d;

    static {
        C0444wb wbVar = new C0444wb(new double[0], 0);
        f4620b = wbVar;
        wbVar.m();
    }

    C0444wb() {
        this(new double[10], 0);
    }

    private C0444wb(double[] dArr, int i) {
        this.f4621c = dArr;
        this.f4622d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4622d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private final String h(int i) {
        int i2 = this.f4622d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Tb a(int i) {
        if (i >= this.f4622d) {
            return new C0444wb(Arrays.copyOf(this.f4621c, i), this.f4622d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(double d2) {
        c();
        int i = this.f4622d;
        double[] dArr = this.f4621c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f4621c = dArr2;
        }
        double[] dArr3 = this.f4621c;
        int i2 = this.f4622d;
        this.f4622d = i2 + 1;
        dArr3[i2] = d2;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i < 0 || i > (i2 = this.f4622d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        double[] dArr = this.f4621c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f4621c, i, dArr2, i + 1, this.f4622d - i);
            this.f4621c = dArr2;
        }
        this.f4621c[i] = doubleValue;
        this.f4622d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        Nb.a(collection);
        if (!(collection instanceof C0444wb)) {
            return super.addAll(collection);
        }
        C0444wb wbVar = (C0444wb) collection;
        int i = wbVar.f4622d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4622d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f4621c;
            if (i3 > dArr.length) {
                this.f4621c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(wbVar.f4621c, 0, this.f4621c, this.f4622d, wbVar.f4622d);
            this.f4622d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0444wb)) {
            return super.equals(obj);
        }
        C0444wb wbVar = (C0444wb) obj;
        if (this.f4622d != wbVar.f4622d) {
            return false;
        }
        double[] dArr = wbVar.f4621c;
        for (int i = 0; i < this.f4622d; i++) {
            if (Double.doubleToLongBits(this.f4621c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.f4621c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4622d; i2++) {
            i = (i * 31) + Nb.a(Double.doubleToLongBits(this.f4621c[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        double[] dArr = this.f4621c;
        double d2 = dArr[i];
        int i2 = this.f4622d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f4622d--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4622d; i++) {
            if (obj.equals(Double.valueOf(this.f4621c[i]))) {
                double[] dArr = this.f4621c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f4622d - i) - 1);
                this.f4622d--;
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
            double[] dArr = this.f4621c;
            System.arraycopy(dArr, i2, dArr, i, this.f4622d - i2);
            this.f4622d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        b(i);
        double[] dArr = this.f4621c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f4622d;
    }
}
