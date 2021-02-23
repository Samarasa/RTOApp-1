package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class FG implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<NG> f6818a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6819b;

    private FG(C1876iha<NG> iha, C1876iha<Executor> iha2) {
        this.f6818a = iha;
        this.f6819b = iha2;
    }

    public static FG a(C1876iha<NG> iha, C1876iha<Executor> iha2) {
        return new FG(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6818a.get(), this.f6819b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
