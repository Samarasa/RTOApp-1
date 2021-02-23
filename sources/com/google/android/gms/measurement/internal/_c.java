package com.google.android.gms.measurement.internal;

final class _c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f13491a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13492b;

    _c(Hc hc, long j) {
        this.f13492b = hc;
        this.f13491a = j;
    }

    public final void run() {
        this.f13492b.l().r.a(this.f13491a);
        this.f13492b.h().A().a("Session timeout duration set", Long.valueOf(this.f13491a));
    }
}
