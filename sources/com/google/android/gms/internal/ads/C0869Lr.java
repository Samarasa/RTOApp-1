package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Lr  reason: case insensitive filesystem */
public final class C0869Lr implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f7764a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f7765b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f7766c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2988yS> f7767d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<SS> f7768e;

    public C0869Lr(C0661Dr dr, C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C2988yS> iha3, C1876iha<SS> iha4) {
        this.f7764a = dr;
        this.f7765b = iha;
        this.f7766c = iha2;
        this.f7767d = iha3;
        this.f7768e = iha4;
    }

    public static C3108zx<C1900iv> a(C0661Dr dr, Context context, C1200Yk yk, C2988yS ySVar, SS ss) {
        C3108zx<C1900iv> zxVar = new C3108zx<>(new C0739Gr(context, yk, ySVar, ss), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7764a, this.f7765b.get(), this.f7766c.get(), this.f7767d.get(), this.f7768e.get());
    }
}
