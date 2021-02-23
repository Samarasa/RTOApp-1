package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class OY {
    public static PY a(ExecutorService executorService) {
        return executorService instanceof PY ? (PY) executorService : executorService instanceof ScheduledExecutorService ? new TY((ScheduledExecutorService) executorService) : new QY(executorService);
    }

    public static Executor a() {
        return C2568sY.INSTANCE;
    }

    static Executor a(Executor executor, YX<?> yx) {
        C1434cX.a(executor);
        C1434cX.a(yx);
        return executor == C2568sY.INSTANCE ? executor : new RY(executor, yx);
    }
}
