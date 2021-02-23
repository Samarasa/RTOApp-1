package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Jc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13317a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13318b;

    Jc(Hc hc, AtomicReference atomicReference) {
        this.f13318b = hc;
        this.f13317a = atomicReference;
    }

    public final void run() {
        synchronized (this.f13317a) {
            try {
                this.f13317a.set(Boolean.valueOf(this.f13318b.m().f(this.f13318b.q().B())));
                this.f13317a.notify();
            } catch (Throwable th) {
                this.f13317a.notify();
                throw th;
            }
        }
    }
}
