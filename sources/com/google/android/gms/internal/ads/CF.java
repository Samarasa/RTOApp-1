package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class CF implements Xga<C2975yF> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<SS> f6389a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<UE> f6390b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<PY> f6391c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f6392d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<PG> f6393e;

    private CF(C1876iha<SS> iha, C1876iha<UE> iha2, C1876iha<PY> iha3, C1876iha<ScheduledExecutorService> iha4, C1876iha<PG> iha5) {
        this.f6389a = iha;
        this.f6390b = iha2;
        this.f6391c = iha3;
        this.f6392d = iha4;
        this.f6393e = iha5;
    }

    public static CF a(C1876iha<SS> iha, C1876iha<UE> iha2, C1876iha<PY> iha3, C1876iha<ScheduledExecutorService> iha4, C1876iha<PG> iha5) {
        return new CF(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new C2975yF(this.f6389a.get(), this.f6390b.get(), this.f6391c.get(), this.f6392d.get(), this.f6393e.get());
    }
}
