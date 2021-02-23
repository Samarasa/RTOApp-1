package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ee  reason: case insensitive filesystem */
final class C3140ee extends C3147g {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C3176ke f13559e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C3152ge f13560f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3140ee(C3152ge geVar, C3244yc ycVar, C3176ke keVar) {
        super(ycVar);
        this.f13560f = geVar;
        this.f13559e = keVar;
    }

    public final void a() {
        this.f13560f.u();
        this.f13560f.h().B().a("Starting upload from DelayedRunnable");
        this.f13559e.q();
    }
}
