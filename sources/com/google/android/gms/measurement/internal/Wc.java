package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Wc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13454a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13455b;

    Wc(Hc hc, AtomicReference atomicReference) {
        this.f13455b = hc;
        this.f13454a = atomicReference;
    }

    public final void run() {
        synchronized (this.f13454a) {
            try {
                this.f13454a.set(Double.valueOf(this.f13455b.m().c(this.f13455b.q().B(), C3202q.N)));
                this.f13454a.notify();
            } catch (Throwable th) {
                this.f13454a.notify();
                throw th;
            }
        }
    }
}
