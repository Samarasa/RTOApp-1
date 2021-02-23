package com.google.android.gms.internal.ads;

import android.content.Context;

public final class YG implements Xga<XG> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f9332a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1183Xt> f9333b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<PG> f9334c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<JG> f9335d;

    private YG(C1876iha<Context> iha, C1876iha<C1183Xt> iha2, C1876iha<PG> iha3, C1876iha<JG> iha4) {
        this.f9332a = iha;
        this.f9333b = iha2;
        this.f9334c = iha3;
        this.f9335d = iha4;
    }

    public static YG a(C1876iha<Context> iha, C1876iha<C1183Xt> iha2, C1876iha<PG> iha3, C1876iha<JG> iha4) {
        return new YG(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new XG(this.f9332a.get(), this.f9333b.get(), this.f9334c.get(), this.f9335d.get());
    }
}
