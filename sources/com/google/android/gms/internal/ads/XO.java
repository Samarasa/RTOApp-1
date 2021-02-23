package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.c.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class XO implements JO<YO> {

    /* renamed from: a  reason: collision with root package name */
    private final C2590sk f9232a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9233b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f9234c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f9235d;

    public XO(C2590sk skVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f9232a = skVar;
        this.f9233b = context;
        this.f9234c = scheduledExecutorService;
        this.f9235d = executor;
    }

    public final LY<YO> a() {
        if (!((Boolean) Qqa.e().a(F.za)).booleanValue()) {
            return DY.a((Throwable) new Exception("Did not ad Ad ID into query param."));
        }
        return C2710uY.c(this.f9232a.a(this.f9233b)).a(_O.f9651a, this.f9235d).a(((Long) Qqa.e().a(F.Aa)).longValue(), TimeUnit.MILLISECONDS, this.f9234c).a(Throwable.class, new ZO(this), this.f9235d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ YO a(Throwable th) {
        Qqa.a();
        return new YO((a.C0070a) null, C0758Hk.b(this.f9233b));
    }
}
