package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cA  reason: case insensitive filesystem */
public final class C1411cA implements Xga<C0877Lz> {

    /* renamed from: a  reason: collision with root package name */
    private final C1189Xz f9994a;

    private C1411cA(C1189Xz xz) {
        this.f9994a = xz;
    }

    public static C1411cA a(C1189Xz xz) {
        return new C1411cA(xz);
    }

    public static C0877Lz b(C1189Xz xz) {
        C0877Lz a2 = xz.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f9994a);
    }
}
