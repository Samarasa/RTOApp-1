package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gt  reason: case insensitive filesystem */
public final class C1757gt implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1474ct f10600a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2111lt> f10601b;

    private C1757gt(C1474ct ctVar, C1876iha<C2111lt> iha) {
        this.f10600a = ctVar;
        this.f10601b = iha;
    }

    public static C1757gt a(C1474ct ctVar, C1876iha<C2111lt> iha) {
        return new C1757gt(ctVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f10601b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
