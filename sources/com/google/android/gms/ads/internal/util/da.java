package com.google.android.gms.ads.internal.util;

final class da implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0493a f5579a;

    da(C0493a aVar) {
        this.f5579a = aVar;
    }

    public final void run() {
        Thread unused = this.f5579a.f5564b = Thread.currentThread();
        this.f5579a.a();
    }
}
