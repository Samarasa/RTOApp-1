package com.google.android.gms.internal.ads;

public final class YC implements Xga<C3108zx<C0950Ou>> {

    /* renamed from: a  reason: collision with root package name */
    private final ZC f9322a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<XC> f9323b;

    private YC(ZC zc, C1876iha<XC> iha) {
        this.f9322a = zc;
        this.f9323b = iha;
    }

    public static YC a(ZC zc, C1876iha<XC> iha) {
        return new YC(zc, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9323b.get(), C1252_k.f9703e);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
