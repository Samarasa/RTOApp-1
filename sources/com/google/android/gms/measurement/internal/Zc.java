package com.google.android.gms.measurement.internal;

final class Zc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13482a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13483b;

    Zc(Hc hc, boolean z) {
        this.f13483b = hc;
        this.f13482a = z;
    }

    public final void run() {
        this.f13483b.d(this.f13482a);
    }
}
