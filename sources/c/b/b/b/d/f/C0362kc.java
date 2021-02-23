package c.b.b.b.d.f;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: c.b.b.b.d.f.kc  reason: case insensitive filesystem */
final class C0362kc extends Za<Long> implements Ub, Hc, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C0362kc f4494b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f4495c;

    /* renamed from: d  reason: collision with root package name */
    private int f4496d;

    static {
        C0362kc kcVar = new C0362kc(new long[0], 0);
        f4494b = kcVar;
        kcVar.m();
    }

    C0362kc() {
        this(new long[10], 0);
    }

    private C0362kc(long[] jArr, int i) {
        this.f4495c = jArr;
        this.f4496d = i;
    }

    public static C0362kc d() {
        return f4494b;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f4496d) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private final String k(int i) {
        int i2 = this.f4496d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(long j) {
        c();
        int i = this.f4496d;
        long[] jArr = this.f4495c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f4495c = jArr2;
        }
        long[] jArr3 = this.f4495c;
        int i2 = this.f4496d;
        this.f4496d = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.f4496d)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        long[] jArr = this.f4495c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f4495c, i, jArr2, i + 1, this.f4496d - i);
            this.f4495c = jArr2;
        }
        this.f4495c[i] = longValue;
        this.f4496d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        Nb.a(collection);
        if (!(collection instanceof C0362kc)) {
            return super.addAll(collection);
        }
        C0362kc kcVar = (C0362kc) collection;
        int i = kcVar.f4496d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4496d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f4495c;
            if (i3 > jArr.length) {
                this.f4495c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(kcVar.f4495c, 0, this.f4495c, this.f4496d, kcVar.f4496d);
            this.f4496d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i) {
        j(i);
        return this.f4495c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0362kc)) {
            return super.equals(obj);
        }
        C0362kc kcVar = (C0362kc) obj;
        if (this.f4496d != kcVar.f4496d) {
            return false;
        }
        long[] jArr = kcVar.f4495c;
        for (int i = 0; i < this.f4496d; i++) {
            if (this.f4495c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    /* renamed from: h */
    public final Ub a(int i) {
        if (i >= this.f4496d) {
            return new C0362kc(Arrays.copyOf(this.f4495c, i), this.f4496d);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4496d; i2++) {
            i = (i * 31) + Nb.a(this.f4495c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        long[] jArr = this.f4495c;
        long j = jArr[i];
        int i2 = this.f4496d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f4496d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4496d; i++) {
            if (obj.equals(Long.valueOf(this.f4495c[i]))) {
                long[] jArr = this.f4495c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f4496d - i) - 1);
                this.f4496d--;
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
            long[] jArr = this.f4495c;
            System.arraycopy(jArr, i2, jArr, i, this.f4496d - i2);
            this.f4496d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        j(i);
        long[] jArr = this.f4495c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f4496d;
    }
}
