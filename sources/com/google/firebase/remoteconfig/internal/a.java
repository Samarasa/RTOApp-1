package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final f f14723a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14724b;

    private a(f fVar, h hVar) {
        this.f14723a = fVar;
        this.f14724b = hVar;
    }

    public static Callable a(f fVar, h hVar) {
        return new a(fVar, hVar);
    }

    public Object call() {
        return this.f14723a.f14733d.a(this.f14724b);
    }
}
