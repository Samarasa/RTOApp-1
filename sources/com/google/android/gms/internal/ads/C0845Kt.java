package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kt  reason: case insensitive filesystem */
public final class C0845Kt implements Xga<C3108zx<C0950Ou>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2749ut f7632a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1131Vt> f7633b;

    private C0845Kt(C2749ut utVar, C1876iha<C1131Vt> iha) {
        this.f7632a = utVar;
        this.f7633b = iha;
    }

    public static C0845Kt a(C2749ut utVar, C1876iha<C1131Vt> iha) {
        return new C0845Kt(utVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f7633b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
