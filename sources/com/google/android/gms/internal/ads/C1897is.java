package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.is  reason: case insensitive filesystem */
final /* synthetic */ class C1897is implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1756gs f10857a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f10858b;

    C1897is(C1756gs gsVar, Runnable runnable) {
        this.f10857a = gsVar;
        this.f10858b = runnable;
    }

    public final void run() {
        this.f10857a.a(this.f10858b);
    }
}
