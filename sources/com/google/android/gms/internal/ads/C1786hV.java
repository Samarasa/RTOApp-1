package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.hV  reason: case insensitive filesystem */
public final class C1786hV implements Xga<C1503dV> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1703gJ> f10673a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f10674b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<String> f10675c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<String> f10676d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<Context> f10677e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<NS> f10678f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<e> f10679g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<Qba> f10680h;

    private C1786hV(C1876iha<C1703gJ> iha, C1876iha<C1200Yk> iha2, C1876iha<String> iha3, C1876iha<String> iha4, C1876iha<Context> iha5, C1876iha<NS> iha6, C1876iha<e> iha7, C1876iha<Qba> iha8) {
        this.f10673a = iha;
        this.f10674b = iha2;
        this.f10675c = iha3;
        this.f10676d = iha4;
        this.f10677e = iha5;
        this.f10678f = iha6;
        this.f10679g = iha7;
        this.f10680h = iha8;
    }

    public static C1786hV a(C1876iha<C1703gJ> iha, C1876iha<C1200Yk> iha2, C1876iha<String> iha3, C1876iha<String> iha4, C1876iha<Context> iha5, C1876iha<NS> iha6, C1876iha<e> iha7, C1876iha<Qba> iha8) {
        return new C1786hV(iha, iha2, iha3, iha4, iha5, iha6, iha7, iha8);
    }

    public final /* synthetic */ Object get() {
        return new C1503dV(this.f10673a.get(), this.f10674b.get(), this.f10675c.get(), this.f10676d.get(), this.f10677e.get(), this.f10678f.get(), this.f10679g.get(), this.f10680h.get());
    }
}
