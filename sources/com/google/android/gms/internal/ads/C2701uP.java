package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.uP  reason: case insensitive filesystem */
final /* synthetic */ class C2701uP implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2488rP f12323a;

    C2701uP(C2488rP rPVar) {
        this.f12323a = rPVar;
    }

    public final Object call() {
        C2488rP rPVar = this.f12323a;
        return new C2559sP(rPVar.f11961a.a(rPVar.f11963c));
    }
}
