package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.pd  reason: case insensitive filesystem */
final class C3201pd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3175kd f13713a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3191nd f13714b;

    C3201pd(C3191nd ndVar, C3175kd kdVar) {
        this.f13714b = ndVar;
        this.f13713a = kdVar;
    }

    public final void run() {
        this.f13714b.a(this.f13713a, false);
        C3191nd ndVar = this.f13714b;
        ndVar.f13688c = null;
        ndVar.r().a((C3175kd) null);
    }
}
