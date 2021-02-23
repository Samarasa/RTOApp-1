package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ge  reason: case insensitive filesystem */
final /* synthetic */ class C0726Ge implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1870ie f7046a;

    private C0726Ge(C1870ie ieVar) {
        this.f7046a = ieVar;
    }

    static Runnable a(C1870ie ieVar) {
        return new C0726Ge(ieVar);
    }

    public final void run() {
        this.f7046a.destroy();
    }
}
