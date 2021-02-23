package com.google.android.gms.measurement.internal;

final class Md implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3218tb f13358a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hd f13359b;

    Md(Hd hd, C3218tb tbVar) {
        this.f13359b = hd;
        this.f13358a = tbVar;
    }

    public final void run() {
        synchronized (this.f13359b) {
            boolean unused = this.f13359b.f13289a = false;
            if (!this.f13359b.f13291c.B()) {
                this.f13359b.f13291c.h().A().a("Connected to remote service");
                this.f13359b.f13291c.a(this.f13358a);
            }
        }
    }
}
