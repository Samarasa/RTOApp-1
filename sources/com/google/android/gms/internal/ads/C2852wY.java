package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.wY  reason: case insensitive filesystem */
final class C2852wY<V> extends C2710uY<V> {

    /* renamed from: h  reason: collision with root package name */
    private final LY<V> f12633h;

    C2852wY(LY<V> ly) {
        C1434cX.a(ly);
        this.f12633h = ly;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.f12633h.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f12633h.cancel(z);
    }

    public final V get() {
        return this.f12633h.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return this.f12633h.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f12633h.isCancelled();
    }

    public final boolean isDone() {
        return this.f12633h.isDone();
    }

    public final String toString() {
        return this.f12633h.toString();
    }
}
