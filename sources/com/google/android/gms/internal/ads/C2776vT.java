package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vT  reason: case insensitive filesystem */
public final class C2776vT implements Xga<C2563sT> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12500a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0732Gk> f12501b;

    private C2776vT(C1876iha<Context> iha, C1876iha<C0732Gk> iha2) {
        this.f12500a = iha;
        this.f12501b = iha2;
    }

    public static C2776vT a(C1876iha<Context> iha, C1876iha<C0732Gk> iha2) {
        return new C2776vT(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C2563sT(this.f12500a.get(), this.f12501b.get());
    }
}
