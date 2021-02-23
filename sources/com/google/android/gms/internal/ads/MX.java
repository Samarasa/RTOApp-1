package com.google.android.gms.internal.ads;

final class MX extends C2709uX<Object> {

    /* renamed from: c  reason: collision with root package name */
    private final transient Object[] f7855c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f7856d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f7857e;

    MX(Object[] objArr, int i, int i2) {
        this.f7855c = objArr;
        this.f7856d = i;
        this.f7857e = i2;
    }

    public final Object get(int i) {
        C1434cX.a(i, this.f7857e);
        return this.f7855c[(i * 2) + this.f7856d];
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return true;
    }

    public final int size() {
        return this.f7857e;
    }
}
