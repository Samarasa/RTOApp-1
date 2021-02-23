package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.YX;

final class VY extends YX.j<Void> implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f9051h;

    public VY(Runnable runnable) {
        C1434cX.a(runnable);
        this.f9051h = runnable;
    }

    public final void run() {
        try {
            this.f9051h.run();
        } catch (Throwable th) {
            a(th);
            C2142mX.c(th);
            throw null;
        }
    }
}
