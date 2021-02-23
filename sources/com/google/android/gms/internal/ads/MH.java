package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class MH implements Xga<IH> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1400br> f7812a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f7813b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f7814c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<DC> f7815d;

    public MH(C1876iha<C1400br> iha, C1876iha<Context> iha2, C1876iha<Executor> iha3, C1876iha<DC> iha4) {
        this.f7812a = iha;
        this.f7813b = iha2;
        this.f7814c = iha3;
        this.f7815d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new IH(this.f7812a.get(), this.f7813b.get(), this.f7814c.get(), this.f7815d.get());
    }
}
