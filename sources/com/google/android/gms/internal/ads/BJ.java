package com.google.android.gms.internal.ads;

final /* synthetic */ class BJ implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final UC f6261a;

    private BJ(UC uc) {
        this.f6261a = uc;
    }

    static Runnable a(UC uc) {
        return new BJ(uc);
    }

    public final void run() {
        this.f6261a.a();
    }
}
