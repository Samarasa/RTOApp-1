package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ad  reason: case insensitive filesystem */
final class C3115ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f13502a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13503b;

    C3115ad(Hc hc, long j) {
        this.f13503b = hc;
        this.f13502a = j;
    }

    public final void run() {
        this.f13503b.l().q.a(this.f13502a);
        this.f13503b.h().A().a("Minimum session duration set", Long.valueOf(this.f13502a));
    }
}
