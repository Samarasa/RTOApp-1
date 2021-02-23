package com.google.android.gms.measurement.internal;

final class Wd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f13456a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Ud f13457b;

    Wd(Ud ud, long j) {
        this.f13457b = ud;
        this.f13456a = j;
    }

    public final void run() {
        this.f13457b.b(this.f13456a);
    }
}
