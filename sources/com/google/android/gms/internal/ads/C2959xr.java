package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.xr  reason: case insensitive filesystem */
public final class C2959xr implements Xga<C0587Av> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f12857a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<e> f12858b;

    public C2959xr(C1876iha<ScheduledExecutorService> iha, C1876iha<e> iha2) {
        this.f12857a = iha;
        this.f12858b = iha2;
    }

    public static C0587Av a(ScheduledExecutorService scheduledExecutorService, e eVar) {
        C0587Av av = new C0587Av(scheduledExecutorService, eVar);
        C1452cha.a(av, "Cannot return null from a non-@Nullable @Provides method");
        return av;
    }

    public final /* synthetic */ Object get() {
        return a(this.f12857a.get(), this.f12858b.get());
    }
}
