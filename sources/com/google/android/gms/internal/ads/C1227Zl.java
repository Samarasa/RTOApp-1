package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.oa;

/* renamed from: com.google.android.gms.internal.ads.Zl  reason: case insensitive filesystem */
final class C1227Zl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private C0811Jl f9583a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9584b = false;

    C1227Zl(C0811Jl jl) {
        this.f9583a = jl;
    }

    private final void c() {
        oa.f5628a.removeCallbacks(this);
        oa.f5628a.postDelayed(this, 250);
    }

    public final void a() {
        this.f9584b = true;
        this.f9583a.o();
    }

    public final void b() {
        this.f9584b = false;
        c();
    }

    public final void run() {
        if (!this.f9584b) {
            this.f9583a.o();
            c();
        }
    }
}
