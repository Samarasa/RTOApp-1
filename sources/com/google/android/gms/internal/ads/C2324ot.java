package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ot  reason: case insensitive filesystem */
public final class C2324ot implements Xga<C3108zx<C0768Hu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2390pq> f11649a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11650b;

    private C2324ot(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        this.f11649a = iha;
        this.f11650b = iha2;
    }

    public static C2324ot a(C1876iha<C2390pq> iha, C1876iha<Executor> iha2) {
        return new C2324ot(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11649a.get(), this.f11650b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
