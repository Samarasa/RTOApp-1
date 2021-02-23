package com.google.android.gms.measurement.internal;

final class Mb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13348a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Jb f13349b;

    Mb(Jb jb, boolean z) {
        this.f13349b = jb;
        this.f13348a = z;
    }

    public final void run() {
        this.f13349b.f13314a.a(this.f13348a);
    }
}
