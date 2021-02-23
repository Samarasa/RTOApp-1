package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.hc  reason: case insensitive filesystem */
final class C3156hc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Ic f13596a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3144fc f13597b;

    C3156hc(C3144fc fcVar, Ic ic) {
        this.f13597b = fcVar;
        this.f13596a = ic;
    }

    public final void run() {
        this.f13597b.a(this.f13596a);
        this.f13597b.a();
    }
}
