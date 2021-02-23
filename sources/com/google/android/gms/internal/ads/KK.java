package com.google.android.gms.internal.ads;

final /* synthetic */ class KK implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MK f7543a;

    private KK(MK mk) {
        this.f7543a = mk;
    }

    static Runnable a(MK mk) {
        return new KK(mk);
    }

    public final void run() {
        this.f7543a.H();
    }
}
