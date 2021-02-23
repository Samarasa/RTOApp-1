package com.google.android.gms.measurement.internal;

final class Sd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3176ke f13414a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f13415b;

    Sd(Nd nd, C3176ke keVar, Runnable runnable) {
        this.f13414a = keVar;
        this.f13415b = runnable;
    }

    public final void run() {
        this.f13414a.r();
        this.f13414a.a(this.f13415b);
        this.f13414a.q();
    }
}
