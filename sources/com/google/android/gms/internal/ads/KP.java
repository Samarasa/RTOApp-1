package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class KP implements JO<LP> {

    /* renamed from: a  reason: collision with root package name */
    private C0677Eh f7545a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f7546b;

    /* renamed from: c  reason: collision with root package name */
    private Context f7547c;

    public KP(C0677Eh eh, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f7545a = eh;
        this.f7546b = scheduledExecutorService;
        this.f7547c = context;
    }

    public final LY<LP> a() {
        return DY.a(DY.a(this.f7545a.a(this.f7547c), ((Long) Qqa.e().a(F.Cc)).longValue(), TimeUnit.MILLISECONDS, this.f7546b), NP.f7961a, (Executor) C1252_k.f9699a);
    }
}
