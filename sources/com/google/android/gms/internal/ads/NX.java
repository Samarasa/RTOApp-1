package com.google.android.gms.internal.ads;

final class NX<E> extends BX<E> {

    /* renamed from: c  reason: collision with root package name */
    private final transient E f7977c;

    /* renamed from: d  reason: collision with root package name */
    private transient int f7978d;

    NX(E e2) {
        C1434cX.a(e2);
        this.f7977c = e2;
    }

    NX(E e2, int i) {
        this.f7977c = e2;
        this.f7978d = i;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.f7977c;
        return i + 1;
    }

    /* renamed from: c */
    public final QX<E> iterator() {
        return new DX(this.f7977c);
    }

    public final boolean contains(Object obj) {
        return this.f7977c.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        int i = this.f7978d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f7977c.hashCode();
        this.f7978d = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f7978d != 0;
    }

    /* access modifiers changed from: package-private */
    public final C2709uX<E> j() {
        return C2709uX.a(this.f7977c);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f7977c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
