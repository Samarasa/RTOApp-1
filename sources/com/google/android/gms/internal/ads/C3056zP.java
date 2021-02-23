package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zP  reason: case insensitive filesystem */
final /* synthetic */ class C3056zP implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final LY f13043a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f13044b;

    C3056zP(LY ly, LY ly2) {
        this.f13043a = ly;
        this.f13044b = ly2;
    }

    public final Object call() {
        return new C2914xP((String) this.f13043a.get(), (String) this.f13044b.get());
    }
}
