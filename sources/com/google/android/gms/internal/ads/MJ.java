package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class MJ implements Xga<JJ> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f7818a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7819b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2617tC> f7820c;

    public MJ(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<C2617tC> iha3) {
        this.f7818a = iha;
        this.f7819b = iha2;
        this.f7820c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new JJ(this.f7818a.get(), this.f7819b.get(), this.f7820c.get());
    }
}
