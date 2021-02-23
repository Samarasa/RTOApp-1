package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.pt  reason: case insensitive filesystem */
public final class C2395pt implements Xga<C3108zx<C2608su>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2390pq> f11801a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11802b;

    private C2395pt(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        this.f11801a = iha;
        this.f11802b = iha2;
    }

    public static C2395pt a(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        return new C2395pt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11801a.get(), this.f11802b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
