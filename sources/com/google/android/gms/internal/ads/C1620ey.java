package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ey  reason: case insensitive filesystem */
final /* synthetic */ class C1620ey implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f10349a;

    private C1620ey(C2313on onVar) {
        this.f10349a = onVar;
    }

    static Runnable a(C2313on onVar) {
        return new C1620ey(onVar);
    }

    public final void run() {
        this.f10349a.destroy();
    }
}
