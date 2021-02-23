package c.b.b.b.d.f;

import java.util.Arrays;
import java.util.RandomAccess;

final class Jc<E> extends Za<E> implements RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Jc<Object> f4195b;

    /* renamed from: c  reason: collision with root package name */
    private E[] f4196c;

    /* renamed from: d  reason: collision with root package name */
    private int f4197d;

    static {
        Jc<Object> jc = new Jc<>(new Object[0], 0);
        f4195b = jc;
        jc.m();
    }

    private Jc(E[] eArr, int i) {
        this.f4196c = eArr;
        this.f4197d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4197d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    public static <E> Jc<E> d() {
        return f4195b;
    }

    private final String h(int i) {
        int i2 = this.f4197d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Tb a(int i) {
        if (i >= this.f4197d) {
            return new Jc(Arrays.copyOf(this.f4196c, i), this.f4197d);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e2) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.f4197d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        E[] eArr = this.f4196c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f4196c, i, eArr2, i + 1, this.f4197d - i);
            this.f4196c = eArr2;
        }
        this.f4196c[i] = e2;
        this.f4197d++;
        this.modCount++;
    }

    public final boolean add(E e2) {
        c();
        int i = this.f4197d;
        E[] eArr = this.f4196c;
        if (i == eArr.length) {
            this.f4196c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4196c;
        int i2 = this.f4197d;
        this.f4197d = i2 + 1;
        eArr2[i2] = e2;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        b(i);
        return this.f4196c[i];
    }

    public final E remove(int i) {
        c();
        b(i);
        E[] eArr = this.f4196c;
        E e2 = eArr[i];
        int i2 = this.f4197d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f4197d--;
        this.modCount++;
        return e2;
    }

    public final E set(int i, E e2) {
        c();
        b(i);
        E[] eArr = this.f4196c;
        E e3 = eArr[i];
        eArr[i] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f4197d;
    }
}
