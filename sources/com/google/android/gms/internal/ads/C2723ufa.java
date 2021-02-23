package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.ufa  reason: case insensitive filesystem */
final class C2723ufa<E> extends Fda<E> implements RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C2723ufa<Object> f12362b;

    /* renamed from: c  reason: collision with root package name */
    private E[] f12363c;

    /* renamed from: d  reason: collision with root package name */
    private int f12364d;

    static {
        C2723ufa<Object> ufa = new C2723ufa<>(new Object[0], 0);
        f12362b = ufa;
        ufa.o();
    }

    private C2723ufa(E[] eArr, int i) {
        this.f12363c = eArr;
        this.f12364d = i;
    }

    public static <E> C2723ufa<E> d() {
        return f12362b;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f12364d) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private final String k(int i) {
        int i2 = this.f12364d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void add(int i, E e2) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.f12364d)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        E[] eArr = this.f12363c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f12363c, i, eArr2, i + 1, this.f12364d - i);
            this.f12363c = eArr2;
        }
        this.f12363c[i] = e2;
        this.f12364d++;
        this.modCount++;
    }

    public final boolean add(E e2) {
        c();
        int i = this.f12364d;
        E[] eArr = this.f12363c;
        if (i == eArr.length) {
            this.f12363c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12363c;
        int i2 = this.f12364d;
        this.f12364d = i2 + 1;
        eArr2[i2] = e2;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ Fea c(int i) {
        if (i >= this.f12364d) {
            return new C2723ufa(Arrays.copyOf(this.f12363c, i), this.f12364d);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        j(i);
        return this.f12363c[i];
    }

    public final E remove(int i) {
        c();
        j(i);
        E[] eArr = this.f12363c;
        E e2 = eArr[i];
        int i2 = this.f12364d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f12364d--;
        this.modCount++;
        return e2;
    }

    public final E set(int i, E e2) {
        c();
        j(i);
        E[] eArr = this.f12363c;
        E e3 = eArr[i];
        eArr[i] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f12364d;
    }
}
