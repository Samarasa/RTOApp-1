package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ina  reason: case insensitive filesystem */
final class C1888ina implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Jja f10844a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1959jna f10845b;

    C1888ina(C1959jna jna, Jja jja) {
        this.f10845b = jna;
        this.f10844a = jja;
    }

    public final void run() {
        this.f10845b.f11000b.b(this.f10844a);
    }
}
