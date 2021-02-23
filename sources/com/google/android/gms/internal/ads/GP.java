package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class GP implements JO<HP> {

    /* renamed from: a  reason: collision with root package name */
    private C2651tf f7016a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f7017b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7018c;

    /* renamed from: d  reason: collision with root package name */
    private ApplicationInfo f7019d;

    public GP(C2651tf tfVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f7016a = tfVar;
        this.f7017b = scheduledExecutorService;
        this.f7018c = z;
        this.f7019d = applicationInfo;
    }

    public final LY<HP> a() {
        if (!C2570sa.f12101b.a().booleanValue()) {
            return DY.a((Throwable) new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.f7018c) {
            return DY.a((Throwable) new Exception("Auto Collect Location is false."));
        }
        return DY.a(DY.a(this.f7016a.a(this.f7019d), ((Long) Qqa.e().a(F.uc)).longValue(), TimeUnit.MILLISECONDS, this.f7017b), JP.f7406a, (Executor) C1252_k.f9699a);
    }
}
