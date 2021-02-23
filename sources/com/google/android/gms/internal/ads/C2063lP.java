package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.lP  reason: case insensitive filesystem */
public final class C2063lP implements JO<C2134mP> {

    /* renamed from: a  reason: collision with root package name */
    private final C2590sk f11168a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11169b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11170c;

    /* renamed from: d  reason: collision with root package name */
    private final C2874wk f11171d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f11172e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f11173f;

    public C2063lP(C2590sk skVar, int i, Context context, C2874wk wkVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f11168a = skVar;
        this.f11169b = i;
        this.f11170c = context;
        this.f11171d = wkVar;
        this.f11172e = scheduledExecutorService;
        this.f11173f = executor;
    }

    public final LY<C2134mP> a() {
        return C2710uY.c(DY.a(new C2276oP(this), this.f11173f)).a(C2205nP.f11455a, this.f11173f).a(((Long) Qqa.e().a(F.Aa)).longValue(), TimeUnit.MILLISECONDS, this.f11172e).a(Exception.class, new C2418qP(this), OY.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2134mP a(Exception exc) {
        this.f11171d.a((Throwable) exc, "AttestationTokenSignal");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY b() {
        return this.f11168a.a(this.f11170c, this.f11169b);
    }
}
