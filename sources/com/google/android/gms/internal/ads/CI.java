package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class CI implements Xga<AI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f6404a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f6405b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0616By> f6406c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Executor> f6407d;

    public CI(C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C0616By> iha3, C1876iha<Executor> iha4) {
        this.f6404a = iha;
        this.f6405b = iha2;
        this.f6406c = iha3;
        this.f6407d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new AI(this.f6404a.get(), this.f6405b.get(), this.f6406c.get(), this.f6407d.get());
    }
}
