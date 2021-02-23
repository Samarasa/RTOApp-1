package com.google.android.gms.measurement.internal;

final class Oc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Gc f13373a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13374b;

    Oc(Hc hc, Gc gc) {
        this.f13374b = hc;
        this.f13373a = gc;
    }

    public final void run() {
        this.f13374b.a(this.f13373a);
    }
}
