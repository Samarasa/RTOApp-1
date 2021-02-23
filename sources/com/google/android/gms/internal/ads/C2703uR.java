package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uR  reason: case insensitive filesystem */
public final class C2703uR implements Xga<C2278oR<C1400br, C1754gr>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12325a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<GT> f12326b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<XT> f12327c;

    public C2703uR(C1876iha<Context> iha, C1876iha<GT> iha2, C1876iha<XT> iha3) {
        this.f12325a = iha;
        this.f12326b = iha2;
        this.f12327c = iha3;
    }

    public final /* synthetic */ Object get() {
        C2278oR<C1400br, C1754gr> a2 = C2561sR.a(this.f12325a.get(), this.f12326b.get(), this.f12327c.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
