package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.da  reason: case insensitive filesystem */
final class C3130da implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f13540a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ B f13541b;

    C3130da(B b2, long j) {
        this.f13541b = b2;
        this.f13540a = j;
    }

    public final void run() {
        this.f13541b.b(this.f13540a);
    }
}
