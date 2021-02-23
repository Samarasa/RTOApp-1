package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yY  reason: case insensitive filesystem */
public abstract class C2994yY<V> extends C3065zY<V> implements LY<V> {
    protected C2994yY() {
    }

    public void a(Runnable runnable, Executor executor) {
        c().a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public abstract LY<? extends V> c();
}
