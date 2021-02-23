package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j  reason: case insensitive filesystem */
final class C3165j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3244yc f13610a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3147g f13611b;

    C3165j(C3147g gVar, C3244yc ycVar) {
        this.f13611b = gVar;
        this.f13610a = ycVar;
    }

    public final void run() {
        this.f13610a.i();
        if (He.a()) {
            this.f13610a.g().a((Runnable) this);
            return;
        }
        boolean b2 = this.f13611b.b();
        long unused = this.f13611b.f13579d = 0;
        if (b2) {
            this.f13611b.a();
        }
    }
}
