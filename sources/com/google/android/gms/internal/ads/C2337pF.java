package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pF  reason: case insensitive filesystem */
public final class C2337pF implements Xga<C2195nF> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f11680a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f11681b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<NF> f11682c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2054lG> f11683d;

    public C2337pF(C1876iha<ScheduledExecutorService> iha, C1876iha<PY> iha2, C1876iha<NF> iha3, C1876iha<C2054lG> iha4) {
        this.f11680a = iha;
        this.f11681b = iha2;
        this.f11682c = iha3;
        this.f11683d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new C2195nF(this.f11680a.get(), this.f11681b.get(), this.f11682c.get(), Yga.b(this.f11683d));
    }
}
