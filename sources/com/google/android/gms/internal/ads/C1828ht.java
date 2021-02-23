package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ht  reason: case insensitive filesystem */
public final class C1828ht implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1474ct f10749a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2111lt> f10750b;

    private C1828ht(C1474ct ctVar, C1876iha<C2111lt> iha) {
        this.f10749a = ctVar;
        this.f10750b = iha;
    }

    public static C1828ht a(C1474ct ctVar, C1876iha<C2111lt> iha) {
        return new C1828ht(ctVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f10750b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
