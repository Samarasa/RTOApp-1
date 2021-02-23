package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oy  reason: case insensitive filesystem */
public final class C2329oy implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f11658a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0928Ny> f11659b;

    private C2329oy(C1762gy gyVar, C1876iha<C0928Ny> iha) {
        this.f11658a = gyVar;
        this.f11659b = iha;
    }

    public static C2329oy a(C1762gy gyVar, C1876iha<C0928Ny> iha) {
        return new C2329oy(gyVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11659b.get(), C1252_k.f9703e);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
