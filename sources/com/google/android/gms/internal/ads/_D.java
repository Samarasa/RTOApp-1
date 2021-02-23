package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class _D implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<WD> f9622a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f9623b;

    private _D(C1876iha<WD> iha, C1876iha<Executor> iha2) {
        this.f9622a = iha;
        this.f9623b = iha2;
    }

    public static _D a(C1876iha<WD> iha, C1876iha<Executor> iha2) {
        return new _D(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9622a.get(), this.f9623b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
