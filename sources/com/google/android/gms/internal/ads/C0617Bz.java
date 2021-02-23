package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bz  reason: case insensitive filesystem */
final /* synthetic */ class C0617Bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1085Tz f6380a;

    private C0617Bz(C1085Tz tz) {
        this.f6380a = tz;
    }

    static Runnable a(C1085Tz tz) {
        return new C0617Bz(tz);
    }

    public final void run() {
        this.f6380a.a();
    }
}
