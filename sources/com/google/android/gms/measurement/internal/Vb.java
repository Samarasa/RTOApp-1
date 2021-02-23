package com.google.android.gms.measurement.internal;

final class Vb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3144fc f13440a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bb f13441b;

    Vb(Wb wb, C3144fc fcVar, Bb bb) {
        this.f13440a = fcVar;
        this.f13441b = bb;
    }

    public final void run() {
        if (this.f13440a.s() == null) {
            this.f13441b.t().a("Install Referrer Reporter is null");
            return;
        }
        Rb s = this.f13440a.s();
        s.f13402a.e();
        s.a(s.f13402a.f().getPackageName());
    }
}
