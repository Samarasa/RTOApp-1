package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.cY  reason: case insensitive filesystem */
public abstract class C1435cY extends AbstractExecutorService implements PY {
    /* renamed from: a */
    public final LY<?> submit(Runnable runnable) {
        return (LY) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> LY<T> submit(Callable<T> callable) {
        return (LY) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return C1294aZ.a(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return C1294aZ.a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (LY) super.submit(runnable, obj);
    }
}
