package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xC  reason: case insensitive filesystem */
public final class C2901xC implements Xga<C3108zx<C2608su>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2540rx> f12730a;

    public C2901xC(C1876iha<C2540rx> iha) {
        this.f12730a = iha;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12730a.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
