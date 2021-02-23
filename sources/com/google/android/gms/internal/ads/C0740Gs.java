package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Gs  reason: case insensitive filesystem */
public final class C0740Gs {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7105a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f7106b;

    /* renamed from: c  reason: collision with root package name */
    private final LY<C0714Fs> f7107c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f7108d = true;

    public C0740Gs(Executor executor, ScheduledExecutorService scheduledExecutorService, LY<C0714Fs> ly) {
        this.f7105a = executor;
        this.f7106b = scheduledExecutorService;
        this.f7107c = ly;
    }

    /* access modifiers changed from: private */
    public final void a(List<? extends LY<? extends C3103zs>> list, AY<C3103zs> ay) {
        if (list == null || list.isEmpty()) {
            this.f7105a.execute(new C0818Js(ay));
            return;
        }
        LY<O> a2 = DY.a(null);
        for (LY ls : list) {
            a2 = DY.a(DY.a(a2, Throwable.class, new C0792Is(ay), this.f7105a), new C0870Ls(this, ay, ls), this.f7105a);
        }
        DY.a(a2, new C0896Ms(this, ay), this.f7105a);
    }

    /* access modifiers changed from: private */
    public final void c() {
        C1252_k.f9703e.execute(new C0844Ks(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(AY ay, LY ly, C3103zs zsVar) {
        if (zsVar != null) {
            ay.a(zsVar);
        }
        return DY.a(ly, C0904Na.f7980b.a().longValue(), TimeUnit.MILLISECONDS, this.f7106b);
    }

    public final void a(AY<C3103zs> ay) {
        DY.a(this.f7107c, new C0922Ns(this, ay), this.f7105a);
    }

    public final boolean a() {
        return this.f7108d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f7108d = false;
    }
}
