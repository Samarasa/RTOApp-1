package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Uc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13432a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13433b;

    Uc(Hc hc, AtomicReference atomicReference) {
        this.f13433b = hc;
        this.f13432a = atomicReference;
    }

    public final void run() {
        synchronized (this.f13432a) {
            try {
                this.f13432a.set(Long.valueOf(this.f13433b.m().a(this.f13433b.q().B(), C3202q.L)));
                this.f13432a.notify();
            } catch (Throwable th) {
                this.f13432a.notify();
                throw th;
            }
        }
    }
}
