package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class PI implements Xga<QI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f8200a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1240Zy> f8201b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f8202c;

    public PI(C1876iha<Context> iha, C1876iha<C1240Zy> iha2, C1876iha<Executor> iha3) {
        this.f8200a = iha;
        this.f8201b = iha2;
        this.f8202c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new QI(this.f8200a.get(), this.f8201b.get(), this.f8202c.get());
    }
}
