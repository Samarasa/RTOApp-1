package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.nI  reason: case insensitive filesystem */
public final class C2198nI implements Xga<C1914jI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1181Xr> f11442a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PH> f11443b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2821vu> f11444c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f11445d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<PY> f11446e;

    public C2198nI(C1876iha<C1181Xr> iha, C1876iha<PH> iha2, C1876iha<C2821vu> iha3, C1876iha<ScheduledExecutorService> iha4, C1876iha<PY> iha5) {
        this.f11442a = iha;
        this.f11443b = iha2;
        this.f11444c = iha3;
        this.f11445d = iha4;
        this.f11446e = iha5;
    }

    public final /* synthetic */ Object get() {
        return new C1914jI(this.f11442a.get(), this.f11443b.get(), this.f11444c.get(), this.f11445d.get(), this.f11446e.get());
    }
}
