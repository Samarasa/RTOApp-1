package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.jea  reason: case insensitive filesystem */
final class C1941jea extends Fda<Double> implements Fea<Double>, C2652tfa, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C1941jea f10962b;

    /* renamed from: c  reason: collision with root package name */
    private double[] f10963c;

    /* renamed from: d  reason: collision with root package name */
    private int f10964d;

    static {
        C1941jea jea = new C1941jea(new double[0], 0);
        f10962b = jea;
        jea.o();
    }

    C1941jea() {
        this(new double[10], 0);
    }

    private C1941jea(double[] dArr, int i) {
        this.f10963c = dArr;
        this.f10964d = i;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f10964d) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private final String k(int i) {
        int i2 = this.f10964d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(double d2) {
        c();
        int i = this.f10964d;
        double[] dArr = this.f10963c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f10963c = dArr2;
        }
        double[] dArr3 = this.f10963c;
        int i2 = this.f10964d;
        this.f10964d = i2 + 1;
        dArr3[i2] = d2;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i < 0 || i > (i2 = this.f10964d)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        double[] dArr = this.f10963c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f10963c, i, dArr2, i + 1, this.f10964d - i);
            this.f10963c = dArr2;
        }
        this.f10963c[i] = doubleValue;
        this.f10964d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        Aea.a(collection);
        if (!(collection instanceof C1941jea)) {
            return super.addAll(collection);
        }
        C1941jea jea = (C1941jea) collection;
        int i = jea.f10964d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10964d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f10963c;
            if (i3 > dArr.length) {
                this.f10963c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(jea.f10963c, 0, this.f10963c, this.f10964d, jea.f10964d);
            this.f10964d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ Fea c(int i) {
        if (i >= this.f10964d) {
            return new C1941jea(Arrays.copyOf(this.f10963c, i), this.f10964d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1941jea)) {
            return super.equals(obj);
        }
        C1941jea jea = (C1941jea) obj;
        if (this.f10964d != jea.f10964d) {
            return false;
        }
        double[] dArr = jea.f10963c;
        for (int i = 0; i < this.f10964d; i++) {
            if (Double.doubleToLongBits(this.f10963c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        j(i);
        return Double.valueOf(this.f10963c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10964d; i2++) {
            i = (i * 31) + Aea.a(Double.doubleToLongBits(this.f10963c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f10963c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        double[] dArr = this.f10963c;
        double d2 = dArr[i];
        int i2 = this.f10964d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f10964d--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f10964d; i++) {
            if (obj.equals(Double.valueOf(this.f10963c[i]))) {
                double[] dArr = this.f10963c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f10964d - i) - 1);
                this.f10964d--;
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
            double[] dArr = this.f10963c;
            System.arraycopy(dArr, i2, dArr, i, this.f10964d - i2);
            this.f10964d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        j(i);
        double[] dArr = this.f10963c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f10964d;
    }
}
