package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads._d  reason: case insensitive filesystem */
final /* synthetic */ class C1245_d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1115Vd f9676a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9677b;

    C1245_d(C1115Vd vd, String str) {
        this.f9676a = vd;
        this.f9677b = str;
    }

    public final void run() {
        this.f9676a.f(this.f9677b);
    }
}
