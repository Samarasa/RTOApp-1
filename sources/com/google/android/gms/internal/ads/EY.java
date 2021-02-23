package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class EY<V> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6707a;

    /* renamed from: b  reason: collision with root package name */
    private final C2709uX<LY<? extends V>> f6708b;

    private EY(boolean z, C2709uX<LY<? extends V>> uXVar) {
        this.f6707a = z;
        this.f6708b = uXVar;
    }

    /* synthetic */ EY(boolean z, C2709uX uXVar, CY cy) {
        this(z, uXVar);
    }

    public final <C> LY<C> a(Callable<C> callable, Executor executor) {
        return new C2497rY(this.f6708b, this.f6707a, executor, callable);
    }
}
