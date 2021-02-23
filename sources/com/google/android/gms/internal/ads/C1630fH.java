package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.fH  reason: case insensitive filesystem */
final /* synthetic */ class C1630fH implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1701gH f10368a;

    C1630fH(C1701gH gHVar) {
        this.f10368a = gHVar;
    }

    public final Object call() {
        return this.f10368a.getWritableDatabase();
    }
}
