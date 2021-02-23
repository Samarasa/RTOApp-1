package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Hq  reason: case insensitive filesystem */
public final class C0764Hq implements Xga<C2673tq> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2526rna> f7221a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2084lf> f7222b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f7223c;

    private C0764Hq(C1876iha<C2526rna> iha, C1876iha<C2084lf> iha2, C1876iha<Executor> iha3) {
        this.f7221a = iha;
        this.f7222b = iha2;
        this.f7223c = iha3;
    }

    public static C0764Hq a(C1876iha<C2526rna> iha, C1876iha<C2084lf> iha2, C1876iha<Executor> iha3) {
        return new C0764Hq(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        C2673tq tqVar = new C2673tq(this.f7221a.get().a(), this.f7222b.get(), this.f7223c.get());
        C1452cha.a(tqVar, "Cannot return null from a non-@Nullable @Provides method");
        return tqVar;
    }
}
