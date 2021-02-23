package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ZD implements Xga<C3108zx<C1290aV>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1910jE> f9518a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f9519b;

    private ZD(C1876iha<C1910jE> iha, C1876iha<Executor> iha2) {
        this.f9518a = iha;
        this.f9519b = iha2;
    }

    public static ZD a(C1876iha<C1910jE> iha, C1876iha<Executor> iha2) {
        return new ZD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9518a.get(), this.f9519b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
