package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class QY extends C1435cY {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f8355a;

    QY(ExecutorService executorService) {
        C1434cX.a(executorService);
        this.f8355a = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f8355a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f8355a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f8355a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f8355a.isTerminated();
    }

    public final void shutdown() {
        this.f8355a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f8355a.shutdownNow();
    }
}
