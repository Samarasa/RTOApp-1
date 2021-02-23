package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nD  reason: case insensitive filesystem */
public final class C2193nD implements Xga<C3108zx<C2963xu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2973yD> f11424a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11425b;

    private C2193nD(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        this.f11424a = iha;
        this.f11425b = iha2;
    }

    public static C2193nD a(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        return new C2193nD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11424a.get(), this.f11425b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
