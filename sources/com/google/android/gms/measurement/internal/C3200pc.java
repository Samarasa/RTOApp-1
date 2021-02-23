package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.pc  reason: case insensitive filesystem */
final class C3200pc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13711a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13712b;

    C3200pc(C3150gc gcVar, xe xeVar) {
        this.f13712b = gcVar;
        this.f13711a = xeVar;
    }

    public final void run() {
        this.f13712b.f13582a.r();
        this.f13712b.f13582a.a(this.f13711a);
    }
}
