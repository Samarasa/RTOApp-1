package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ps  reason: case insensitive filesystem */
public final class C2394ps implements C1900iv, C2739una {

    /* renamed from: a  reason: collision with root package name */
    private final C2988yS f11796a;

    /* renamed from: b  reason: collision with root package name */
    private final C0846Ku f11797b;

    /* renamed from: c  reason: collision with root package name */
    private final C2184mv f11798c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f11799d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f11800e = new AtomicBoolean();

    public C2394ps(C2988yS ySVar, C0846Ku ku, C2184mv mvVar) {
        this.f11796a = ySVar;
        this.f11797b = ku;
        this.f11798c = mvVar;
    }

    private final void I() {
        if (this.f11799d.compareAndSet(false, true)) {
            this.f11797b.I();
        }
    }

    public final synchronized void H() {
        if (this.f11796a.f12918e != 1) {
            I();
        }
    }

    public final void a(C2810vna vna) {
        if (this.f11796a.f12918e == 1 && vna.m) {
            I();
        }
        if (vna.m && this.f11800e.compareAndSet(false, true)) {
            this.f11798c.Ub();
        }
    }
}
