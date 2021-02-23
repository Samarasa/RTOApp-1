package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ce  reason: case insensitive filesystem */
final /* synthetic */ class C0622Ce implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1870ie f6442a;

    private C0622Ce(C1870ie ieVar) {
        this.f6442a = ieVar;
    }

    static Runnable a(C1870ie ieVar) {
        return new C0622Ce(ieVar);
    }

    public final void run() {
        this.f6442a.destroy();
    }
}
