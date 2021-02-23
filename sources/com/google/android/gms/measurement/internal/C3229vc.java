package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.vc  reason: case insensitive filesystem */
final class C3229vc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13798a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13799b;

    C3229vc(C3150gc gcVar, xe xeVar) {
        this.f13799b = gcVar;
        this.f13798a = xeVar;
    }

    public final void run() {
        this.f13799b.f13582a.r();
        this.f13799b.f13582a.b(this.f13798a);
    }
}
