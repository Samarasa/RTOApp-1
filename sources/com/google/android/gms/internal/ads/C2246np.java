package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.np  reason: case insensitive filesystem */
final class C2246np implements C2064lQ {

    /* renamed from: a  reason: collision with root package name */
    private C1876iha<Context> f11525a;

    /* renamed from: b  reason: collision with root package name */
    private C1876iha<String> f11526b;

    /* renamed from: c  reason: collision with root package name */
    private C1876iha<C2278oR<C1400br, C1754gr>> f11527c;

    /* renamed from: d  reason: collision with root package name */
    private C1876iha<C2631tQ> f11528d;

    /* renamed from: e  reason: collision with root package name */
    private C1876iha<C1498dQ> f11529e;

    /* renamed from: f  reason: collision with root package name */
    private C1876iha<C1639fQ> f11530f;

    /* renamed from: g  reason: collision with root package name */
    private C1876iha<C2278oR<C2037kr, C2463qr>> f11531g;

    /* renamed from: h  reason: collision with root package name */
    private C1876iha<GQ> f11532h;
    private C1876iha<IQ> i;
    private final /* synthetic */ C1256_o j;

    private C2246np(C1256_o _oVar, Context context, String str) {
        this.j = _oVar;
        this.f11525a = _ga.a(context);
        this.f11526b = _ga.a(str);
        this.f11527c = new C2703uR(this.f11525a, this.j.da, this.j.ea);
        this.f11528d = Yga.a(new DQ(this.j.da));
        this.f11529e = Yga.a(new C1427cQ(this.f11525a, this.j.f9727d, this.j.y, this.f11527c, this.f11528d, TS.a()));
        this.f11530f = Yga.a(new C1852iQ(this.j.y, this.f11525a, this.f11526b, this.f11529e, this.f11528d, this.j.l));
        this.f11531g = new C2490rR(this.f11525a, this.j.da, this.j.ea);
        this.f11532h = Yga.a(new FQ(this.f11525a, this.j.f9727d, this.j.y, this.f11531g, this.f11528d, TS.a()));
        this.i = Yga.a(new OQ(this.j.y, this.f11525a, this.f11526b, this.f11532h, this.f11528d));
    }

    public final C1639fQ a() {
        return this.f11530f.get();
    }

    public final IQ b() {
        return this.i.get();
    }
}
