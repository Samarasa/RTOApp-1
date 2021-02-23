package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.gr  reason: case insensitive filesystem */
public final class C1754gr extends C3103zs {

    /* renamed from: h  reason: collision with root package name */
    private final View f10596h;
    private final C2313on i;
    private final BS j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private C2174moa n;
    private final C1258_q o;

    C1754gr(C3032ys ysVar, View view, C2313on onVar, BS bs, int i2, boolean z, boolean z2, C1258_q _qVar) {
        super(ysVar);
        this.f10596h = view;
        this.i = onVar;
        this.j = bs;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.o = _qVar;
    }

    public final void a(long j2, int i2) {
        this.o.a(j2, i2);
    }

    public final void a(C1536doa doa) {
        C2313on onVar = this.i;
        if (onVar != null) {
            onVar.a(doa);
        }
    }

    public final void a(C2174moa moa) {
        this.n = moa;
    }

    public final boolean g() {
        C2313on onVar = this.i;
        return (onVar == null || onVar.t() == null || !this.i.t().T()) ? false : true;
    }

    public final int h() {
        return this.k;
    }

    public final boolean i() {
        return this.l;
    }

    public final boolean j() {
        return this.m;
    }

    public final BS k() {
        return XS.a(this.f13129b.q, this.j);
    }

    public final View l() {
        return this.f10596h;
    }

    public final boolean m() {
        C2313on onVar = this.i;
        return onVar != null && onVar.D();
    }

    public final C2174moa n() {
        return this.n;
    }
}
