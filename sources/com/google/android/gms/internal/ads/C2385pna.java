package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.pna  reason: case insensitive filesystem */
final class C2385pna implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Surface f11766a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1959jna f11767b;

    C2385pna(C1959jna jna, Surface surface) {
        this.f11767b = jna;
        this.f11766a = surface;
    }

    public final void run() {
        this.f11767b.f11000b.a(this.f11766a);
    }
}
