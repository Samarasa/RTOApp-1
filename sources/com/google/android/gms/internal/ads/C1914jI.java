package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.jI  reason: case insensitive filesystem */
public final class C1914jI implements C2480rH<C0583Ar> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1181Xr f10894a;

    /* renamed from: b  reason: collision with root package name */
    private final PH f10895b;

    /* renamed from: c  reason: collision with root package name */
    private final PY f10896c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C2821vu f10897d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f10898e;

    public C1914jI(C1181Xr xr, PH ph, C2821vu vuVar, ScheduledExecutorService scheduledExecutorService, PY py) {
        this.f10894a = xr;
        this.f10895b = ph;
        this.f10897d = vuVar;
        this.f10898e = scheduledExecutorService;
        this.f10896c = py;
    }

    public final boolean a(OS os, C2988yS ySVar) {
        return os.f8087a.f7415a.a() != null && this.f10895b.a(os, ySVar);
    }

    public final LY<C0583Ar> b(OS os, C2988yS ySVar) {
        return this.f10896c.a(new C1844iI(this, os, ySVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C0583Ar c(OS os, C2988yS ySVar) {
        return this.f10894a.a(new C0974Ps(os, ySVar, (String) null), new C2039ks(os.f8087a.f7415a.a(), new C2056lI(this, os, ySVar))).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(OS os, C2988yS ySVar) {
        DY.a(DY.a(this.f10895b.b(os, ySVar), (long) ySVar.M, TimeUnit.SECONDS, this.f10898e), new C1985kI(this), (Executor) this.f10896c);
    }
}
