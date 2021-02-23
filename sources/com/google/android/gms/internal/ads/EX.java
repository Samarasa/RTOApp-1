package com.google.android.gms.internal.ads;

final class EX<E> extends C2709uX<E> {

    /* renamed from: c  reason: collision with root package name */
    static final C2709uX<Object> f6704c = new EX(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f6705d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f6706e;

    EX(Object[] objArr, int i) {
        this.f6705d = objArr;
        this.f6706e = i;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.f6705d, 0, objArr, i, this.f6706e);
        return i + this.f6706e;
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.f6705d;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.f6706e;
    }

    public final E get(int i) {
        C1434cX.a(i, this.f6706e);
        return this.f6705d[i];
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return false;
    }

    public final int size() {
        return this.f6706e;
    }
}
