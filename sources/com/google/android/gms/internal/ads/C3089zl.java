package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zl  reason: case insensitive filesystem */
final class C3089zl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2734ul f13107a;

    C3089zl(C2734ul ulVar) {
        this.f13107a = ulVar;
    }

    public final void run() {
        if (this.f13107a.s != null) {
            this.f13107a.s.f();
        }
    }
}
