package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qp  reason: case insensitive filesystem */
final /* synthetic */ class C0997Qp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0945Op f8391a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f8392b;

    C0997Qp(C0945Op op, Runnable runnable) {
        this.f8391a = op;
        this.f8392b = runnable;
    }

    public final void run() {
        this.f8391a.a(this.f8392b);
    }
}
