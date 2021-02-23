package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.xc  reason: case insensitive filesystem */
final class C3239xc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Ge f13816a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xe f13817b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13818c;

    C3239xc(C3150gc gcVar, Ge ge, xe xeVar) {
        this.f13818c = gcVar;
        this.f13816a = ge;
        this.f13817b = xeVar;
    }

    public final void run() {
        this.f13818c.f13582a.r();
        if (this.f13816a.f13269c.a() == null) {
            this.f13818c.f13582a.b(this.f13816a, this.f13817b);
        } else {
            this.f13818c.f13582a.a(this.f13816a, this.f13817b);
        }
    }
}
