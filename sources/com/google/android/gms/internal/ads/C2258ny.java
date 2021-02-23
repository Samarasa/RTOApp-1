package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;

/* renamed from: com.google.android.gms.internal.ads.ny  reason: case insensitive filesystem */
public final class C2258ny implements Xga<C3108zx<q>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f11554a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0928Ny> f11555b;

    private C2258ny(C1762gy gyVar, C1876iha<C0928Ny> iha) {
        this.f11554a = gyVar;
        this.f11555b = iha;
    }

    public static C2258ny a(C1762gy gyVar, C1876iha<C0928Ny> iha) {
        return new C2258ny(gyVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11555b.get(), C1252_k.f9703e);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
