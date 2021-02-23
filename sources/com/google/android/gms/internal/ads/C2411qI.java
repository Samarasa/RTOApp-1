package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qI  reason: case insensitive filesystem */
final /* synthetic */ class C2411qI implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final UC f11832a;

    private C2411qI(UC uc) {
        this.f11832a = uc;
    }

    static Runnable a(UC uc) {
        return new C2411qI(uc);
    }

    public final void run() {
        this.f11832a.a();
    }
}
