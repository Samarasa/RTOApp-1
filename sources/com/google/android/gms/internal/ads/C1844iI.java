package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.iI  reason: case insensitive filesystem */
final /* synthetic */ class C1844iI implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1914jI f10782a;

    /* renamed from: b  reason: collision with root package name */
    private final OS f10783b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f10784c;

    C1844iI(C1914jI jIVar, OS os, C2988yS ySVar) {
        this.f10782a = jIVar;
        this.f10783b = os;
        this.f10784c = ySVar;
    }

    public final Object call() {
        return this.f10782a.c(this.f10783b, this.f10784c);
    }
}
