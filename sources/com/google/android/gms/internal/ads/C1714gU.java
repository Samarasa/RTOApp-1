package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gU  reason: case insensitive filesystem */
final class C1714gU implements AY<TT<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1289aU f10542a;

    C1714gU(C1289aU aUVar) {
        this.f10542a = aUVar;
    }

    public final /* synthetic */ void a(Object obj) {
        TT tt = (TT) obj;
        synchronized (this.f10542a) {
            this.f10542a.f9794g.a(tt);
            if (this.f10542a.f9792e != C1997kU.f11062b) {
                this.f10542a.f9793f.a(this.f10542a.f9789b.c(), tt);
            }
            if (this.f10542a.f9792e == C1997kU.f11061a) {
                this.f10542a.c(this.f10542a.f9789b);
            }
            int unused = this.f10542a.f9792e = C1997kU.f11061a;
            this.f10542a.f9790c.a(tt);
        }
    }

    public final void a(Throwable th) {
        synchronized (this.f10542a) {
            this.f10542a.f9794g.a(th);
            this.f10542a.f9790c.a(th);
        }
    }
}
