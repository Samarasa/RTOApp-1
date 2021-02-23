package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.KO;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class XN<S extends KO<?>> implements JO<S> {

    /* renamed from: a  reason: collision with root package name */
    private final JO<S> f9229a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9230b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f9231c;

    public XN(JO<S> jo, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f9229a = jo;
        this.f9230b = j;
        this.f9231c = scheduledExecutorService;
    }

    public final LY<S> a() {
        LY<S> a2 = this.f9229a.a();
        long j = this.f9230b;
        if (j > 0) {
            a2 = DY.a(a2, j, TimeUnit.MILLISECONDS, this.f9231c);
        }
        return DY.a(a2, Throwable.class, WN.f9138a, (Executor) C1252_k.f9704f);
    }
}
