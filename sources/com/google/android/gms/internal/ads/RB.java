package com.google.android.gms.internal.ads;

import android.content.Context;

public final class RB implements Xga<PB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f8444a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0877Lz> f8445b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1765hA> f8446c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C3110zz> f8447d;

    private RB(C1876iha<Context> iha, C1876iha<C0877Lz> iha2, C1876iha<C1765hA> iha3, C1876iha<C3110zz> iha4) {
        this.f8444a = iha;
        this.f8445b = iha2;
        this.f8446c = iha3;
        this.f8447d = iha4;
    }

    public static RB a(C1876iha<Context> iha, C1876iha<C0877Lz> iha2, C1876iha<C1765hA> iha3, C1876iha<C3110zz> iha4) {
        return new RB(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new PB(this.f8444a.get(), this.f8445b.get(), this.f8446c.get(), this.f8447d.get());
    }
}
