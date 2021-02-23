package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mja  reason: case insensitive filesystem */
final class C2164mja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f11351a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1739gja f11352b;

    C2164mja(C1739gja gja, int i) {
        this.f11352b = gja;
        this.f11351a = i;
    }

    public final void run() {
        this.f11352b.f10570b.a(this.f11351a);
    }
}
