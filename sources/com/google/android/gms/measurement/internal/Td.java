package com.google.android.gms.measurement.internal;

final class Td implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f13426a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Ud f13427b;

    Td(Ud ud, long j) {
        this.f13427b = ud;
        this.f13426a = j;
    }

    public final void run() {
        this.f13427b.a(this.f13426a);
    }
}
