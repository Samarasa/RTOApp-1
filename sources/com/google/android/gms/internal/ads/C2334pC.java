package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pC  reason: case insensitive filesystem */
final /* synthetic */ class C2334pC implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f11677a;

    private C2334pC(C2313on onVar) {
        this.f11677a = onVar;
    }

    static Runnable a(C2313on onVar) {
        return new C2334pC(onVar);
    }

    public final void run() {
        this.f11677a.destroy();
    }
}
