package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.ha;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads._t  reason: case insensitive filesystem */
public final class C1261_t implements Xga<C1183Xt> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f9739a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f9740b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<ApplicationInfo> f9741c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<String> f9742d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<List<String>> f9743e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<PackageInfo> f9744f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<LY<String>> f9745g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<ha> f9746h;
    private final C1876iha<String> i;
    private final C1876iha<MO<Bundle>> j;

    private C1261_t(C1876iha<VU> iha, C1876iha<C1200Yk> iha2, C1876iha<ApplicationInfo> iha3, C1876iha<String> iha4, C1876iha<List<String>> iha5, C1876iha<PackageInfo> iha6, C1876iha<LY<String>> iha7, C1876iha<ha> iha8, C1876iha<String> iha9, C1876iha<MO<Bundle>> iha10) {
        this.f9739a = iha;
        this.f9740b = iha2;
        this.f9741c = iha3;
        this.f9742d = iha4;
        this.f9743e = iha5;
        this.f9744f = iha6;
        this.f9745g = iha7;
        this.f9746h = iha8;
        this.i = iha9;
        this.j = iha10;
    }

    public static C1261_t a(C1876iha<VU> iha, C1876iha<C1200Yk> iha2, C1876iha<ApplicationInfo> iha3, C1876iha<String> iha4, C1876iha<List<String>> iha5, C1876iha<PackageInfo> iha6, C1876iha<LY<String>> iha7, C1876iha<ha> iha8, C1876iha<String> iha9, C1876iha<MO<Bundle>> iha10) {
        return new C1261_t(iha, iha2, iha3, iha4, iha5, iha6, iha7, iha8, iha9, iha10);
    }

    public final /* synthetic */ Object get() {
        return new C1183Xt(this.f9739a.get(), this.f9740b.get(), this.f9741c.get(), this.f9742d.get(), this.f9743e.get(), this.f9744f.get(), Yga.b(this.f9745g), this.f9746h.get(), this.i.get(), this.j.get());
    }
}
