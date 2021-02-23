package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zT  reason: case insensitive filesystem */
public final class C3060zT implements Xga<C2705uT> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f13051a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f13052b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2874wk> f13053c;

    public C3060zT(C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C2874wk> iha3) {
        this.f13051a = iha;
        this.f13052b = iha2;
        this.f13053c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new C2705uT(this.f13051a.get(), this.f13052b.get(), this.f13053c.get());
    }
}
