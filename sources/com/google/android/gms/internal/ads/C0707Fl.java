package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fl  reason: case insensitive filesystem */
final class C0707Fl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2734ul f6901a;

    C0707Fl(C2734ul ulVar) {
        this.f6901a = ulVar;
    }

    public final void run() {
        if (this.f6901a.s != null) {
            this.f6901a.s.c();
        }
    }
}
