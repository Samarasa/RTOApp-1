package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.It  reason: case insensitive filesystem */
public final class C0793It implements Xga<C3108zx<C1540dqa>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<UD> f7363a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7364b;

    private C0793It(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        this.f7363a = iha;
        this.f7364b = iha2;
    }

    public static C0793It a(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        return new C0793It(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f7363a.get(), this.f7364b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
