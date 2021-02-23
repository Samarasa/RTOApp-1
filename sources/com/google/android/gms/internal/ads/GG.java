package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class GG implements Xga<C3108zx<C2963xu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<NG> f6989a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6990b;

    private GG(C1876iha<NG> iha, C1876iha<Executor> iha2) {
        this.f6989a = iha;
        this.f6990b = iha2;
    }

    public static GG a(C1876iha<NG> iha, C1876iha<Executor> iha2) {
        return new GG(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6989a.get(), this.f6990b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
