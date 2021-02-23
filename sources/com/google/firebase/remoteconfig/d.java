package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final e f14704a;

    /* renamed from: b  reason: collision with root package name */
    private final l f14705b;

    private d(e eVar, l lVar) {
        this.f14704a = eVar;
        this.f14705b = lVar;
    }

    public static Callable a(e eVar, l lVar) {
        return new d(eVar, lVar);
    }

    public Object call() {
        return this.f14704a.k.a(this.f14705b);
    }
}
