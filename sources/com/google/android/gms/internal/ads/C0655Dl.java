package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dl  reason: case insensitive filesystem */
final class C0655Dl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2734ul f6625a;

    C0655Dl(C2734ul ulVar) {
        this.f6625a = ulVar;
    }

    public final void run() {
        if (this.f6625a.s != null) {
            this.f6625a.s.c();
            this.f6625a.s.e();
        }
    }
}
