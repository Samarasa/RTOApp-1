package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1405bv;

public final class YJ<AdT, AdapterT, ListenerT extends C1405bv> implements Xga<TJ<AdT, AdapterT, ListenerT>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f9340a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f9341b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2906xH<AdapterT, ListenerT>> f9342c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<AH<AdT, AdapterT, ListenerT>> f9343d;

    private YJ(C1876iha<VU> iha, C1876iha<PY> iha2, C1876iha<C2906xH<AdapterT, ListenerT>> iha3, C1876iha<AH<AdT, AdapterT, ListenerT>> iha4) {
        this.f9340a = iha;
        this.f9341b = iha2;
        this.f9342c = iha3;
        this.f9343d = iha4;
    }

    public static <AdT, AdapterT, ListenerT extends C1405bv> YJ<AdT, AdapterT, ListenerT> a(C1876iha<VU> iha, C1876iha<PY> iha2, C1876iha<C2906xH<AdapterT, ListenerT>> iha3, C1876iha<AH<AdT, AdapterT, ListenerT>> iha4) {
        return new YJ<>(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new TJ(this.f9340a.get(), this.f9341b.get(), this.f9342c.get(), this.f9343d.get());
    }
}
