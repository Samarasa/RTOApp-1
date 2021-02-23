package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Sc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13412a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13413b;

    Sc(Hc hc, AtomicReference atomicReference) {
        this.f13413b = hc;
        this.f13412a = atomicReference;
    }

    public final void run() {
        synchronized (this.f13412a) {
            try {
                this.f13412a.set(this.f13413b.m().g(this.f13413b.q().B()));
                this.f13412a.notify();
            } catch (Throwable th) {
                this.f13412a.notify();
                throw th;
            }
        }
    }
}
