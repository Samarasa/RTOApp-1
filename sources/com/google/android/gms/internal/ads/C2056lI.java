package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lI  reason: case insensitive filesystem */
final /* synthetic */ class C2056lI implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1914jI f11153a;

    /* renamed from: b  reason: collision with root package name */
    private final OS f11154b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f11155c;

    C2056lI(C1914jI jIVar, OS os, C2988yS ySVar) {
        this.f11153a = jIVar;
        this.f11154b = os;
        this.f11155c = ySVar;
    }

    public final void run() {
        this.f11153a.d(this.f11154b, this.f11155c);
    }
}
