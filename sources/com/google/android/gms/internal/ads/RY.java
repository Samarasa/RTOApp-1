package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class RY implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Executor f8475a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ YX f8476b;

    RY(Executor executor, YX yx) {
        this.f8475a = executor;
        this.f8476b = yx;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f8475a.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.f8476b.a((Throwable) e2);
        }
    }
}
