package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.r;
import java.util.concurrent.Callable;

final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final r f14792a;

    private n(r rVar) {
        this.f14792a = rVar;
    }

    public static Callable a(r rVar) {
        return new n(rVar);
    }

    public Object call() {
        return Boolean.valueOf(this.f14792a.a());
    }
}
