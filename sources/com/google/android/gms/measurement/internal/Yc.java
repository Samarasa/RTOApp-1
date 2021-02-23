package com.google.android.gms.measurement.internal;

final class Yc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13471a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13472b;

    Yc(Hc hc, boolean z) {
        this.f13472b = hc;
        this.f13471a = z;
    }

    public final void run() {
        boolean c2 = this.f13472b.f13807a.c();
        boolean b2 = this.f13472b.f13807a.b();
        this.f13472b.f13807a.a(this.f13471a);
        if (b2 == this.f13471a) {
            this.f13472b.f13807a.h().B().a("Default data collection state already set to", Boolean.valueOf(this.f13471a));
        }
        if (this.f13472b.f13807a.c() == c2 || this.f13472b.f13807a.c() != this.f13472b.f13807a.b()) {
            this.f13472b.f13807a.h().y().a("Default data collection is different than actual status", Boolean.valueOf(this.f13471a), Boolean.valueOf(c2));
        }
        this.f13472b.M();
    }
}
