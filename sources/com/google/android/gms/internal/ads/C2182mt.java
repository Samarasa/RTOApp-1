package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mt  reason: case insensitive filesystem */
public final class C2182mt implements Xga<C3108zx<C1540dqa>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2390pq> f11408a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11409b;

    private C2182mt(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        this.f11408a = iha;
        this.f11409b = iha2;
    }

    public static C2182mt a(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        return new C2182mt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11408a.get(), this.f11409b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
