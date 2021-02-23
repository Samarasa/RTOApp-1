package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.my  reason: case insensitive filesystem */
public final class C2187my implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f11414a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f11415b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f11416c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2988yS> f11417d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<SS> f11418e;

    private C2187my(C1762gy gyVar, C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C2988yS> iha3, C1876iha<SS> iha4) {
        this.f11414a = gyVar;
        this.f11415b = iha;
        this.f11416c = iha2;
        this.f11417d = iha3;
        this.f11418e = iha4;
    }

    public static C2187my a(C1762gy gyVar, C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C2988yS> iha3, C1876iha<SS> iha4) {
        return new C2187my(gyVar, iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(new C1691fy(this.f11415b.get(), this.f11416c.get(), this.f11417d.get(), this.f11418e.get()), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
