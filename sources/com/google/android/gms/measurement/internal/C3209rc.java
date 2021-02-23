package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.rc  reason: case insensitive filesystem */
final class C3209rc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3192o f13742a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13743b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13744c;

    C3209rc(C3150gc gcVar, C3192o oVar, String str) {
        this.f13744c = gcVar;
        this.f13742a = oVar;
        this.f13743b = str;
    }

    public final void run() {
        this.f13744c.f13582a.r();
        this.f13744c.f13582a.a(this.f13742a, this.f13743b);
    }
}
