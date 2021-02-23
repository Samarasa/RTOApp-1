package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ap  reason: case insensitive filesystem */
final class C0581Ap implements C2421qS {

    /* renamed from: a  reason: collision with root package name */
    private C1876iha<Context> f6193a;

    /* renamed from: b  reason: collision with root package name */
    private C1876iha<C2278oR<C2617tC, C2405qC>> f6194b;

    /* renamed from: c  reason: collision with root package name */
    private C1876iha<JR> f6195c;

    /* renamed from: d  reason: collision with root package name */
    private C1876iha<NS> f6196d;

    /* renamed from: e  reason: collision with root package name */
    private C1876iha<C1570eS> f6197e;

    /* renamed from: f  reason: collision with root package name */
    private C1876iha<C2562sS> f6198f;

    /* renamed from: g  reason: collision with root package name */
    private C1876iha<String> f6199g;

    /* renamed from: h  reason: collision with root package name */
    private C1876iha<C2137mS> f6200h;
    private final /* synthetic */ C1256_o i;

    private C0581Ap(C1256_o _oVar, Context context, String str) {
        this.i = _oVar;
        this.f6193a = _ga.a(context);
        this.f6194b = new C2632tR(this.f6193a, this.i.da, this.i.ea);
        this.f6195c = Yga.a(C1358bS.a(this.i.da));
        this.f6196d = Yga.a(QS.a());
        this.f6197e = Yga.a(new C2208nS(this.f6193a, this.i.f9727d, this.i.y, this.f6194b, this.f6195c, TS.a(), this.f6196d));
        this.f6198f = Yga.a(new C2917xS(this.f6197e, this.f6195c, this.f6196d));
        this.f6199g = _ga.b(str);
        this.f6200h = Yga.a(new C2491rS(this.f6199g, this.f6197e, this.f6193a, this.f6195c, this.f6196d));
    }

    public final C2137mS a() {
        return this.f6200h.get();
    }

    public final C2562sS b() {
        return this.f6198f.get();
    }
}
