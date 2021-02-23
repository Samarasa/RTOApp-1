package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.oc  reason: case insensitive filesystem */
final class C3195oc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3192o f13701a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xe f13702b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13703c;

    C3195oc(C3150gc gcVar, C3192o oVar, xe xeVar) {
        this.f13703c = gcVar;
        this.f13701a = oVar;
        this.f13702b = xeVar;
    }

    public final void run() {
        C3192o b2 = this.f13703c.b(this.f13701a, this.f13702b);
        this.f13703c.f13582a.r();
        this.f13703c.f13582a.a(b2, this.f13702b);
    }
}
