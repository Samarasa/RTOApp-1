package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qt  reason: case insensitive filesystem */
public final class C2466qt implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2390pq> f11928a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11929b;

    private C2466qt(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        this.f11928a = iha;
        this.f11929b = iha2;
    }

    public static C2466qt a(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        return new C2466qt(iha, iha2);
    }

    public static C3108zx<C1900iv> a(C2390pq pqVar, Executor executor) {
        C3108zx<C1900iv> zxVar = new C3108zx<>(pqVar, executor);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }

    public final /* synthetic */ Object get() {
        return a(this.f11928a.get(), this.f11929b.get());
    }
}
