package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class _U implements Xga<VU> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f9663a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f9664b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<UU> f9665c;

    private _U(C1876iha<PY> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<UU> iha3) {
        this.f9663a = iha;
        this.f9664b = iha2;
        this.f9665c = iha3;
    }

    public static _U a(C1876iha<PY> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<UU> iha3) {
        return new _U(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new VU(this.f9663a.get(), this.f9664b.get(), this.f9665c.get());
    }
}
