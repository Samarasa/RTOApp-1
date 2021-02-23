package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ft  reason: case insensitive filesystem */
public final class C0715Ft implements Xga<C3108zx<C3107zw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<UD> f6964a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6965b;

    private C0715Ft(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        this.f6964a = iha;
        this.f6965b = iha2;
    }

    public static C0715Ft a(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        return new C0715Ft(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6964a.get(), this.f6965b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
