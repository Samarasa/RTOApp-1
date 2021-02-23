package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fs  reason: case insensitive filesystem */
final /* synthetic */ class C1685fs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f10468a;

    C1685fs(AtomicReference atomicReference) {
        this.f10468a = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.f10468a.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
