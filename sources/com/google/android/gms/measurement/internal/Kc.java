package com.google.android.gms.measurement.internal;

final /* synthetic */ class Kc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Hc f13329a;

    Kc(Hc hc) {
        this.f13329a = hc;
    }

    public final void run() {
        Hc hc = this.f13329a;
        hc.c();
        if (hc.l().A.a()) {
            hc.h().A().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a2 = hc.l().B.a();
        hc.l().B.a(1 + a2);
        if (a2 >= 5) {
            hc.h().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            hc.l().A.a(true);
            return;
        }
        hc.f13807a.n();
    }
}
