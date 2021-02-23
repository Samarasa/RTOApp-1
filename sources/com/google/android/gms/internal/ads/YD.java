package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class YD implements Xga<C3108zx<C0795Iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<WD> f9324a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f9325b;

    private YD(C1876iha<WD> iha, C1876iha<Executor> iha2) {
        this.f9324a = iha;
        this.f9325b = iha2;
    }

    public static YD a(C1876iha<WD> iha, C1876iha<Executor> iha2) {
        return new YD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9324a.get(), this.f9325b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
