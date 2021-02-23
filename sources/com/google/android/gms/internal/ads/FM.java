package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class FM implements JO<GM> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6833a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f6834b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6835c;

    public FM(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f6833a = context;
        this.f6834b = scheduledExecutorService;
        this.f6835c = executor;
    }

    public final LY<GM> a() {
        if (!((Boolean) Qqa.e().a(F.Ee)).booleanValue()) {
            return DY.a(null);
        }
        C1742gl glVar = new C1742gl();
        try {
            new IM(glVar).a(false);
        } catch (Throwable unused) {
            C1018Rk.b("ArCoreApk is not ready.");
            glVar.a(false);
        }
        return DY.a(DY.a(DY.a(glVar, 200, TimeUnit.MILLISECONDS, this.f6834b), new HM(this), this.f6835c), Throwable.class, KM.f7544a, this.f6835c);
    }
}
