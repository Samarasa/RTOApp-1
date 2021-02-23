package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.pD  reason: case insensitive filesystem */
public final class C2335pD implements Xga<C3108zx<C1540dqa>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2973yD> f11678a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11679b;

    private C2335pD(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        this.f11678a = iha;
        this.f11679b = iha2;
    }

    public static C2335pD a(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        return new C2335pD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11678a.get(), this.f11679b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
