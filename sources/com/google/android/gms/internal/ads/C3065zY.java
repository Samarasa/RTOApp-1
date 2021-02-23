package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.zY  reason: case insensitive filesystem */
public abstract class C3065zY<V> extends C2496rX implements Future<V> {
    protected C3065zY() {
    }

    /* access modifiers changed from: protected */
    public abstract Future<? extends V> b();

    public boolean cancel(boolean z) {
        return b().cancel(z);
    }

    public V get() {
        return b().get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return b().get(j, timeUnit);
    }

    public boolean isCancelled() {
        return b().isCancelled();
    }

    public boolean isDone() {
        return b().isDone();
    }
}
