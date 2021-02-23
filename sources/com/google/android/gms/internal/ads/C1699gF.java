package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gF  reason: case insensitive filesystem */
public final class C1699gF implements Xga<C3108zx<C0795Iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<TF> f10508a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f10509b;

    private C1699gF(C1876iha<TF> iha, C1876iha<Executor> iha2) {
        this.f10508a = iha;
        this.f10509b = iha2;
    }

    public static C1699gF a(C1876iha<TF> iha, C1876iha<Executor> iha2) {
        return new C1699gF(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f10508a.get(), this.f10509b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
