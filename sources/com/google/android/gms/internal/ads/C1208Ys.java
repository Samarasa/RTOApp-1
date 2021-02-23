package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ys  reason: case insensitive filesystem */
public final class C1208Ys implements Xga<C3108zx<C2255nv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2822vv> f9506a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f9507b;

    private C1208Ys(C1876iha<C2822vv> iha, C1876iha<Executor> iha2) {
        this.f9506a = iha;
        this.f9507b = iha2;
    }

    public static C1208Ys a(C1876iha<C2822vv> iha, C1876iha<Executor> iha2) {
        return new C1208Ys(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9506a.get(), this.f9507b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
