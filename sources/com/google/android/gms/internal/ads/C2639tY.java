package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.tY  reason: case insensitive filesystem */
abstract class C2639tY<T> extends KY<T> {

    /* renamed from: d  reason: collision with root package name */
    private final Executor f12209d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C2497rY f12210e;

    C2639tY(C2497rY rYVar, Executor executor) {
        this.f12210e = rYVar;
        C1434cX.a(executor);
        this.f12209d = executor;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(T t);

    /* access modifiers changed from: package-private */
    public final void a(T t, Throwable th) {
        C2639tY unused = this.f12210e.p = null;
        if (th == null) {
            a(t);
        } else if (th instanceof ExecutionException) {
            this.f12210e.a(th.getCause());
        } else if (th instanceof CancellationException) {
            this.f12210e.cancel(false);
        } else {
            this.f12210e.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f12210e.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            this.f12209d.execute(this);
        } catch (RejectedExecutionException e2) {
            this.f12210e.a((Throwable) e2);
        }
    }
}
