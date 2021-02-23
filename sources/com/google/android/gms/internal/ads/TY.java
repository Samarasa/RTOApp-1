package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class TY extends QY implements PY, ScheduledExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f8791b;

    TY(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        C1434cX.a(scheduledExecutorService);
        this.f8791b = scheduledExecutorService;
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C1294aZ a2 = C1294aZ.a(runnable, null);
        return new SY(a2, this.f8791b.schedule(a2, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        C1294aZ a2 = C1294aZ.a(callable);
        return new SY(a2, this.f8791b.schedule(a2, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        VY vy = new VY(runnable);
        return new SY(vy, this.f8791b.scheduleAtFixedRate(vy, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        VY vy = new VY(runnable);
        return new SY(vy, this.f8791b.scheduleWithFixedDelay(vy, j, j2, timeUnit));
    }
}
