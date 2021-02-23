package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f14728a;

    private c(o oVar) {
        this.f14728a = oVar;
    }

    public static Callable a(o oVar) {
        return new c(oVar);
    }

    public Object call() {
        return this.f14728a.c();
    }
}
