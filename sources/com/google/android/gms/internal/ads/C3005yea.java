package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.yea  reason: case insensitive filesystem */
final class C3005yea extends Fda<Integer> implements Eea, C2652tfa, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C3005yea f12941b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f12942c;

    /* renamed from: d  reason: collision with root package name */
    private int f12943d;

    static {
        C3005yea yea = new C3005yea(new int[0], 0);
        f12941b = yea;
        yea.o();
    }

    C3005yea() {
        this(new int[10], 0);
    }

    private C3005yea(int[] iArr, int i) {
        this.f12942c = iArr;
        this.f12943d = i;
    }

    public static C3005yea d() {
        return f12941b;
    }

    private final void k(int i) {
        if (i < 0 || i >= this.f12943d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f12943d;
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
        if (i < 0 || i > (i2 = this.f12943d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        int[] iArr = this.f12942c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f12942c, i, iArr2, i + 1, this.f12943d - i);
            this.f12942c = iArr2;
        }
        this.f12942c[i] = intValue;
        this.f12943d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        Aea.a(collection);
        if (!(collection instanceof C3005yea)) {
            return super.addAll(collection);
        }
        C3005yea yea = (C3005yea) collection;
        int i = yea.f12943d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12943d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f12942c;
            if (i3 > iArr.length) {
                this.f12942c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(yea.f12942c, 0, this.f12942c, this.f12943d, yea.f12943d);
            this.f12943d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        c();
        int i2 = this.f12943d;
        int[] iArr = this.f12942c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f12942c = iArr2;
        }
        int[] iArr3 = this.f12942c;
        int i3 = this.f12943d;
        this.f12943d = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3005yea)) {
            return super.equals(obj);
        }
        C3005yea yea = (C3005yea) obj;
        if (this.f12943d != yea.f12943d) {
            return false;
        }
        int[] iArr = yea.f12942c;
        for (int i = 0; i < this.f12943d; i++) {
            if (this.f12942c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Eea c(int i) {
        if (i >= this.f12943d) {
            return new C3005yea(Arrays.copyOf(this.f12942c, i), this.f12943d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(j(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12943d; i2++) {
            i = (i * 31) + this.f12942c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f12942c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    public final int j(int i) {
        k(i);
        return this.f12942c[i];
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        k(i);
        int[] iArr = this.f12942c;
        int i2 = iArr[i];
        int i3 = this.f12943d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f12943d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f12943d; i++) {
            if (obj.equals(Integer.valueOf(this.f12942c[i]))) {
                int[] iArr = this.f12942c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f12943d - i) - 1);
                this.f12943d--;
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
            int[] iArr = this.f12942c;
            System.arraycopy(iArr, i2, iArr, i, this.f12943d - i2);
            this.f12943d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        k(i);
        int[] iArr = this.f12942c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f12943d;
    }
}
