package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rt  reason: case insensitive filesystem */
public final class C2536rt implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2390pq> f12052a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f12053b;

    private C2536rt(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        this.f12052a = iha;
        this.f12053b = iha2;
    }

    public static C2536rt a(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        return new C2536rt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12052a.get(), this.f12053b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
