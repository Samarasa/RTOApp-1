package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Tt  reason: case insensitive filesystem */
public final class C1079Tt implements Xga<C1053St> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0846Ku> f8838a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2988yS> f8839b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f8840c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Executor> f8841d;

    private C1079Tt(C1876iha<C0846Ku> iha, C1876iha<C2988yS> iha2, C1876iha<ScheduledExecutorService> iha3, C1876iha<Executor> iha4) {
        this.f8838a = iha;
        this.f8839b = iha2;
        this.f8840c = iha3;
        this.f8841d = iha4;
    }

    public static C1079Tt a(C1876iha<C0846Ku> iha, C1876iha<C2988yS> iha2, C1876iha<ScheduledExecutorService> iha3, C1876iha<Executor> iha4) {
        return new C1079Tt(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new C1053St(this.f8838a.get(), this.f8839b.get(), this.f8840c.get(), this.f8841d.get());
    }
}
