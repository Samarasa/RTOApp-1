package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class XD implements Xga<C3108zx<C2963xu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<WD> f9204a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f9205b;

    private XD(C1876iha<WD> iha, C1876iha<Executor> iha2) {
        this.f9204a = iha;
        this.f9205b = iha2;
    }

    public static XD a(C1876iha<WD> iha, C1876iha<Executor> iha2) {
        return new XD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9204a.get(), this.f9205b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
