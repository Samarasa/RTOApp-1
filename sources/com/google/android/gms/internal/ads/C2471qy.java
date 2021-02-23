package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qy  reason: case insensitive filesystem */
public final class C2471qy implements Xga<C3108zx<C1868id>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f11932a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2263oC> f11933b;

    public C2471qy(C1762gy gyVar, C1876iha<C2263oC> iha) {
        this.f11932a = gyVar;
        this.f11933b = iha;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11933b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
