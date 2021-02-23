package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ic  reason: case insensitive filesystem */
final class C3162ic implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Ge f13607a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13608b;

    C3162ic(C3150gc gcVar, Ge ge) {
        this.f13608b = gcVar;
        this.f13607a = ge;
    }

    public final void run() {
        this.f13608b.f13582a.r();
        if (this.f13607a.f13269c.a() == null) {
            this.f13608b.f13582a.b(this.f13607a);
        } else {
            this.f13608b.f13582a.a(this.f13607a);
        }
    }
}
