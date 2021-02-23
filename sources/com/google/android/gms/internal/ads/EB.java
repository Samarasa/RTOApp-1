package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class EB implements Xga<BB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f6665a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0894Mq> f6666b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C3037yx> f6667c;

    public EB(C1876iha<Executor> iha, C1876iha<C0894Mq> iha2, C1876iha<C3037yx> iha3) {
        this.f6665a = iha;
        this.f6666b = iha2;
        this.f6667c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new BB(this.f6665a.get(), this.f6666b.get(), this.f6667c.get());
    }
}
