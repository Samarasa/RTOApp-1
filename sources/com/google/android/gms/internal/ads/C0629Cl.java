package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cl  reason: case insensitive filesystem */
final class C0629Cl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2734ul f6465a;

    C0629Cl(C2734ul ulVar) {
        this.f6465a = ulVar;
    }

    public final void run() {
        if (this.f6465a.s != null) {
            this.f6465a.s.g();
        }
    }
}
