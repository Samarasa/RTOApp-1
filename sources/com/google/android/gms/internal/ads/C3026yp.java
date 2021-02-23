package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yp  reason: case insensitive filesystem */
final class C3026yp implements HR {

    /* renamed from: a  reason: collision with root package name */
    private C1876iha<Context> f12984a;

    /* renamed from: b  reason: collision with root package name */
    private C1876iha<C2462qqa> f12985b;

    /* renamed from: c  reason: collision with root package name */
    private C1876iha<String> f12986c;

    /* renamed from: d  reason: collision with root package name */
    private C1876iha<MK> f12987d;

    /* renamed from: e  reason: collision with root package name */
    private C1876iha<JR> f12988e;

    /* renamed from: f  reason: collision with root package name */
    private C1876iha<C2987yR> f12989f;

    /* renamed from: g  reason: collision with root package name */
    private C1876iha<C1422cL> f12990g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ C1256_o f12991h;

    private C3026yp(C1256_o _oVar, Context context, String str, C2462qqa qqa) {
        this.f12991h = _oVar;
        this.f12984a = _ga.a(context);
        this.f12985b = _ga.a(qqa);
        this.f12986c = _ga.a(str);
        this.f12987d = Yga.a(VK.a());
        this.f12988e = Yga.a(C1358bS.a(this.f12991h.da));
        this.f12989f = Yga.a(new ER(this.f12984a, this.f12991h.f9727d, this.f12991h.y, this.f12987d, this.f12988e, TS.a()));
        this.f12990g = Yga.a(new C1563eL(this.f12984a, this.f12985b, this.f12986c, this.f12989f, this.f12987d, this.f12988e));
    }

    public final C1422cL a() {
        return this.f12990g.get();
    }
}
