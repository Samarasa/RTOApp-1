package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Xc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13460a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13461b;

    Xc(Hc hc, AtomicReference atomicReference) {
        this.f13461b = hc;
        this.f13460a = atomicReference;
    }

    public final void run() {
        synchronized (this.f13460a) {
            try {
                this.f13460a.set(Integer.valueOf(this.f13461b.m().b(this.f13461b.q().B(), C3202q.M)));
                this.f13460a.notify();
            } catch (Throwable th) {
                this.f13460a.notify();
                throw th;
            }
        }
    }
}
