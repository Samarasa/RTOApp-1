package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.tea  reason: case insensitive filesystem */
final class C2650tea extends Fda<Float> implements Fea<Float>, C2652tfa, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C2650tea f12221b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f12222c;

    /* renamed from: d  reason: collision with root package name */
    private int f12223d;

    static {
        C2650tea tea = new C2650tea(new float[0], 0);
        f12221b = tea;
        tea.o();
    }

    C2650tea() {
        this(new float[10], 0);
    }

    private C2650tea(float[] fArr, int i) {
        this.f12222c = fArr;
        this.f12223d = i;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f12223d) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private final String k(int i) {
        int i2 = this.f12223d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(float f2) {
        c();
        int i = this.f12223d;
        float[] fArr = this.f12222c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f12222c = fArr2;
        }
        float[] fArr3 = this.f12222c;
        int i2 = this.f12223d;
        this.f12223d = i2 + 1;
        fArr3[i2] = f2;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.f12223d)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        float[] fArr = this.f12222c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f12222c, i, fArr2, i + 1, this.f12223d - i);
            this.f12222c = fArr2;
        }
        this.f12222c[i] = floatValue;
        this.f12223d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        Aea.a(collection);
        if (!(collection instanceof C2650tea)) {
            return super.addAll(collection);
        }
        C2650tea tea = (C2650tea) collection;
        int i = tea.f12223d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12223d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f12222c;
            if (i3 > fArr.length) {
                this.f12222c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(tea.f12222c, 0, this.f12222c, this.f12223d, tea.f12223d);
            this.f12223d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ Fea c(int i) {
        if (i >= this.f12223d) {
            return new C2650tea(Arrays.copyOf(this.f12222c, i), this.f12223d);
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
        if (!(obj instanceof C2650tea)) {
            return super.equals(obj);
        }
        C2650tea tea = (C2650tea) obj;
        if (this.f12223d != tea.f12223d) {
            return false;
        }
        float[] fArr = tea.f12222c;
        for (int i = 0; i < this.f12223d; i++) {
            if (Float.floatToIntBits(this.f12222c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        j(i);
        return Float.valueOf(this.f12222c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12223d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f12222c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f12222c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        float[] fArr = this.f12222c;
        float f2 = fArr[i];
        int i2 = this.f12223d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f12223d--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f12223d; i++) {
            if (obj.equals(Float.valueOf(this.f12222c[i]))) {
                float[] fArr = this.f12222c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f12223d - i) - 1);
                this.f12223d--;
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
            float[] fArr = this.f12222c;
            System.arraycopy(fArr, i2, fArr, i, this.f12223d - i2);
            this.f12223d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        j(i);
        float[] fArr = this.f12222c;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f12223d;
    }
}
