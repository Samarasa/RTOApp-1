package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class CM implements Xga<C2840wM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f6412a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2874wk> f6413b;

    private CM(C1876iha<Executor> iha, C1876iha<C2874wk> iha2) {
        this.f6412a = iha;
        this.f6413b = iha2;
    }

    public static CM a(C1876iha<Executor> iha, C1876iha<C2874wk> iha2) {
        return new CM(iha, iha2);
    }

    public static C2840wM a(Executor executor, C2874wk wkVar) {
        return new C2840wM(executor, wkVar);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6412a.get(), this.f6413b.get());
    }
}
