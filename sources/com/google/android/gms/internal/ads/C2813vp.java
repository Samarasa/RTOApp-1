package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vp  reason: case insensitive filesystem */
public final class C2813vp {

    /* renamed from: a  reason: collision with root package name */
    private C0684Eo f12579a;

    /* renamed from: b  reason: collision with root package name */
    private C0737Gp f12580b;

    /* renamed from: c  reason: collision with root package name */
    private C1361bV f12581c;

    /* renamed from: d  reason: collision with root package name */
    private C1049Sp f12582d;

    /* renamed from: e  reason: collision with root package name */
    private C2280oT f12583e;

    private C2813vp() {
    }

    public final C0710Fo a() {
        C1452cha.a(this.f12579a, C0684Eo.class);
        C1452cha.a(this.f12580b, C0737Gp.class);
        if (this.f12581c == null) {
            this.f12581c = new C1361bV();
        }
        if (this.f12582d == null) {
            this.f12582d = new C1049Sp();
        }
        if (this.f12583e == null) {
            this.f12583e = new C2280oT();
        }
        return new C1256_o(this.f12579a, this.f12580b, this.f12581c, this.f12582d, this.f12583e);
    }

    public final C2813vp a(C0684Eo eo) {
        C1452cha.a(eo);
        this.f12579a = eo;
        return this;
    }

    public final C2813vp a(C0737Gp gp) {
        C1452cha.a(gp);
        this.f12580b = gp;
        return this;
    }
}
