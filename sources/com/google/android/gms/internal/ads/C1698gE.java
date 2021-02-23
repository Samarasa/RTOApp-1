package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gE  reason: case insensitive filesystem */
public final class C1698gE implements Xga<C1627fE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1981kE> f10506a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f10507b;

    public C1698gE(C1876iha<C1981kE> iha, C1876iha<Executor> iha2) {
        this.f10506a = iha;
        this.f10507b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C1627fE(this.f10506a.get(), this.f10507b.get());
    }
}
