package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f14791a;

    private m(o oVar) {
        this.f14791a = oVar;
    }

    public static Callable a(o oVar) {
        return new m(oVar);
    }

    public Object call() {
        return this.f14791a.a();
    }
}
