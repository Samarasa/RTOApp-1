package com.google.android.gms.measurement.internal;

final class Kd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3218tb f13330a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hd f13331b;

    Kd(Hd hd, C3218tb tbVar) {
        this.f13331b = hd;
        this.f13330a = tbVar;
    }

    public final void run() {
        synchronized (this.f13331b) {
            boolean unused = this.f13331b.f13289a = false;
            if (!this.f13331b.f13291c.B()) {
                this.f13331b.f13291c.h().B().a("Connected to service");
                this.f13331b.f13291c.a(this.f13330a);
            }
        }
    }
}
