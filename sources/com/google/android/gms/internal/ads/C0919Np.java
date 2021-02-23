package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Np  reason: case insensitive filesystem */
final /* synthetic */ class C0919Np implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0945Op f8027a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f8028b;

    C0919Np(C0945Op op, Runnable runnable) {
        this.f8027a = op;
        this.f8028b = runnable;
    }

    public final void run() {
        C1252_k.f9703e.execute(new C0997Qp(this.f8027a, this.f8028b));
    }
}
