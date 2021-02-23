package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class HB implements Xga<C2545sB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<SS> f7116a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7117b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<DC> f7118c;

    public HB(C1876iha<SS> iha, C1876iha<Executor> iha2, C1876iha<DC> iha3) {
        this.f7116a = iha;
        this.f7117b = iha2;
        this.f7118c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new C2545sB(this.f7116a.get(), this.f7117b.get(), this.f7118c.get());
    }
}
