package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dl  reason: case insensitive filesystem */
final class C1530dl extends C1435cY {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10176a;

    private C1530dl(Executor executor) {
        this.f10176a = executor;
    }

    /* synthetic */ C1530dl(Executor executor, C1226Zk zk) {
        this(executor);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        this.f10176a.execute(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
