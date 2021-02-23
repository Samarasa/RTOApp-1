package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class DU<E, V> implements LY<V> {

    /* renamed from: a  reason: collision with root package name */
    private final E f6556a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6557b;

    /* renamed from: c  reason: collision with root package name */
    private final LY<V> f6558c;

    public DU(E e2, String str, LY<V> ly) {
        this.f6556a = e2;
        this.f6557b = str;
        this.f6558c = ly;
    }

    public final E a() {
        return this.f6556a;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.f6558c.a(runnable, executor);
    }

    public final String b() {
        return this.f6557b;
    }

    public final boolean cancel(boolean z) {
        return this.f6558c.cancel(z);
    }

    public final V get() {
        return this.f6558c.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return this.f6558c.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f6558c.isCancelled();
    }

    public final boolean isDone() {
        return this.f6558c.isDone();
    }

    public final String toString() {
        String str = this.f6557b;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
