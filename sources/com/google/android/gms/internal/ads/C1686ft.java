package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ft  reason: case insensitive filesystem */
public final class C1686ft implements Xga<C3108zx<C1540dqa>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1474ct f10471a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2111lt> f10472b;

    private C1686ft(C1474ct ctVar, C1876iha<C2111lt> iha) {
        this.f10471a = ctVar;
        this.f10472b = iha;
    }

    public static C1686ft a(C1474ct ctVar, C1876iha<C2111lt> iha) {
        return new C1686ft(ctVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f10472b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
