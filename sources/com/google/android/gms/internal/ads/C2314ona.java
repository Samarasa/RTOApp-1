package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ona  reason: case insensitive filesystem */
final class C2314ona implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Jja f11637a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1959jna f11638b;

    C2314ona(C1959jna jna, Jja jja) {
        this.f11638b = jna;
        this.f11637a = jja;
    }

    public final void run() {
        this.f11637a.a();
        this.f11638b.f11000b.c(this.f11637a);
    }
}
