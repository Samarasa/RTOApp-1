package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.tc  reason: case insensitive filesystem */
final class C3219tc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ re f13767a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xe f13768b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13769c;

    C3219tc(C3150gc gcVar, re reVar, xe xeVar) {
        this.f13769c = gcVar;
        this.f13767a = reVar;
        this.f13768b = xeVar;
    }

    public final void run() {
        this.f13769c.f13582a.r();
        if (this.f13767a.a() == null) {
            this.f13769c.f13582a.b(this.f13767a, this.f13768b);
        } else {
            this.f13769c.f13582a.a(this.f13767a, this.f13768b);
        }
    }
}
