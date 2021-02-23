package com.google.android.gms.measurement.internal;

final class Ea implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13231a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f13232b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ B f13233c;

    Ea(B b2, String str, long j) {
        this.f13233c = b2;
        this.f13231a = str;
        this.f13232b = j;
    }

    public final void run() {
        this.f13233c.d(this.f13231a, this.f13232b);
    }
}
