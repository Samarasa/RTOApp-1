package com.google.android.gms.internal.ads;

final /* synthetic */ class FH implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final UC f6820a;

    private FH(UC uc) {
        this.f6820a = uc;
    }

    static Runnable a(UC uc) {
        return new FH(uc);
    }

    public final void run() {
        this.f6820a.a();
    }
}
