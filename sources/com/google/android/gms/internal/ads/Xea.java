package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class Xea extends Fda<Long> implements Gea, C2652tfa, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Xea f9261b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f9262c;

    /* renamed from: d  reason: collision with root package name */
    private int f9263d;

    static {
        Xea xea = new Xea(new long[0], 0);
        f9261b = xea;
        xea.o();
    }

    Xea() {
        this(new long[10], 0);
    }

    private Xea(long[] jArr, int i) {
        this.f9262c = jArr;
        this.f9263d = i;
    }

    public static Xea d() {
        return f9261b;
    }

    private final void k(int i) {
        if (i < 0 || i >= this.f9263d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f9263d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.f9263d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        long[] jArr = this.f9262c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9262c, i, jArr2, i + 1, this.f9263d - i);
            this.f9262c = jArr2;
        }
        this.f9262c[i] = longValue;
        this.f9263d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        Aea.a(collection);
        if (!(collection instanceof Xea)) {
            return super.addAll(collection);
        }
        Xea xea = (Xea) collection;
        int i = xea.f9263d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9263d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9262c;
            if (i3 > jArr.length) {
                this.f9262c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(xea.f9262c, 0, this.f9262c, this.f9263d, xea.f9263d);
            this.f9263d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(long j) {
        c();
        int i = this.f9263d;
        long[] jArr = this.f9262c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9262c = jArr2;
        }
        long[] jArr3 = this.f9262c;
        int i2 = this.f9263d;
        this.f9263d = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xea)) {
            return super.equals(obj);
        }
        Xea xea = (Xea) obj;
        if (this.f9263d != xea.f9263d) {
            return false;
        }
        long[] jArr = xea.f9262c;
        for (int i = 0; i < this.f9263d; i++) {
            if (this.f9262c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final Gea c(int i) {
        if (i >= this.f9263d) {
            return new Xea(Arrays.copyOf(this.f9262c, i), this.f9263d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(j(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9263d; i2++) {
            i = (i * 31) + Aea.a(this.f9262c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9262c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final long j(int i) {
        k(i);
        return this.f9262c[i];
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        k(i);
        long[] jArr = this.f9262c;
        long j = jArr[i];
        int i2 = this.f9263d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9263d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f9263d; i++) {
            if (obj.equals(Long.valueOf(this.f9262c[i]))) {
                long[] jArr = this.f9262c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f9263d - i) - 1);
                this.f9263d--;
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
            long[] jArr = this.f9262c;
            System.arraycopy(jArr, i2, jArr, i, this.f9263d - i2);
            this.f9263d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        k(i);
        long[] jArr = this.f9262c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f9263d;
    }
}
