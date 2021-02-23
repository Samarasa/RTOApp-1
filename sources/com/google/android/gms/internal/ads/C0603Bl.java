package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bl  reason: case insensitive filesystem */
final class C0603Bl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2734ul f6356a;

    C0603Bl(C2734ul ulVar) {
        this.f6356a = ulVar;
    }

    public final void run() {
        if (this.f6356a.s != null) {
            this.f6356a.s.b();
        }
    }
}
