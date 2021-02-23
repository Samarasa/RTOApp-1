package com.google.android.gms.internal.ads;

import android.content.Context;

public final class WF implements Xga<TF> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f9115a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1017Rj> f9116b;

    private WF(C1876iha<Context> iha, C1876iha<C1017Rj> iha2) {
        this.f9115a = iha;
        this.f9116b = iha2;
    }

    public static WF a(C1876iha<Context> iha, C1876iha<C1017Rj> iha2) {
        return new WF(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new TF(this.f9115a.get(), this.f9116b.get());
    }
}
