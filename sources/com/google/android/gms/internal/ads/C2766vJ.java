package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vJ  reason: case insensitive filesystem */
public final class C2766vJ implements Xga<C2341pJ> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12481a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2617tC> f12482b;

    public C2766vJ(C1876iha<Context> iha, C1876iha<C2617tC> iha2) {
        this.f12481a = iha;
        this.f12482b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C2341pJ(this.f12481a.get(), this.f12482b.get());
    }
}
