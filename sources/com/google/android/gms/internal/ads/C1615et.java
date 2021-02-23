package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.et  reason: case insensitive filesystem */
public final class C1615et implements Xga<C3108zx<C2608su>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1474ct f10335a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2111lt> f10336b;

    private C1615et(C1474ct ctVar, C1876iha<C2111lt> iha) {
        this.f10335a = ctVar;
        this.f10336b = iha;
    }

    public static C1615et a(C1474ct ctVar, C1876iha<C2111lt> iha) {
        return new C1615et(ctVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f10336b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
