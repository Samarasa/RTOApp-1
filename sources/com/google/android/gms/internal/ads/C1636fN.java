package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.ha;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fN  reason: case insensitive filesystem */
public final class C1636fN implements JO<C1707gN> {

    /* renamed from: a  reason: collision with root package name */
    private C2651tf f10387a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f10388b;

    /* renamed from: c  reason: collision with root package name */
    private ha f10389c;

    /* renamed from: d  reason: collision with root package name */
    private ApplicationInfo f10390d;

    /* renamed from: e  reason: collision with root package name */
    SS f10391e;

    public C1636fN(C2651tf tfVar, ScheduledExecutorService scheduledExecutorService, ha haVar, ApplicationInfo applicationInfo, SS ss) {
        this.f10387a = tfVar;
        this.f10388b = scheduledExecutorService;
        this.f10389c = haVar;
        this.f10390d = applicationInfo;
        this.f10391e = ss;
    }

    public final LY<C1707gN> a() {
        LY<V> ly;
        if (C2570sa.f12100a.a().booleanValue() && this.f10389c.a()) {
            ly = DY.a(DY.a(this.f10387a.a(this.f10390d), ((Long) Qqa.e().a(F.uc)).longValue(), TimeUnit.MILLISECONDS, this.f10388b), Throwable.class, C1990kN.f11047a, (Executor) C1252_k.f9704f);
        } else {
            ly = DY.a(null);
        }
        return DY.a(DY.a(ly, new C1778hN(this), (Executor) this.f10388b), C1849iN.f10795a, (Executor) C1252_k.f9699a);
    }
}
