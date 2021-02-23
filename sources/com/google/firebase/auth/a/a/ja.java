package com.google.firebase.auth.a.a;

final class ja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ia f14325a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ da f14326b;

    ja(da daVar, ia iaVar) {
        this.f14326b = daVar;
        this.f14325a = iaVar;
    }

    public final void run() {
        synchronized (this.f14326b.f14314a.f14309h) {
            if (!this.f14326b.f14314a.f14309h.isEmpty()) {
                this.f14325a.a(this.f14326b.f14314a.f14309h.get(0), new Object[0]);
            }
        }
    }
}
