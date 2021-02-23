package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.gl  reason: case insensitive filesystem */
public class C1742gl<T> implements LY<T> {

    /* renamed from: a  reason: collision with root package name */
    private final UY<T> f10578a = UY.h();

    private static boolean a(boolean z) {
        if (!z) {
            p.g().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public void a(Runnable runnable, Executor executor) {
        this.f10578a.a(runnable, executor);
    }

    public final boolean a(T t) {
        boolean a2 = this.f10578a.a(t);
        a(a2);
        return a2;
    }

    public final boolean a(Throwable th) {
        boolean a2 = this.f10578a.a(th);
        a(a2);
        return a2;
    }

    public boolean cancel(boolean z) {
        return this.f10578a.cancel(z);
    }

    public T get() {
        return this.f10578a.get();
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.f10578a.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f10578a.isCancelled();
    }

    public boolean isDone() {
        return this.f10578a.isDone();
    }
}
