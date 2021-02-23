package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jja  reason: case insensitive filesystem */
final class C1951jja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Jja f10983a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1739gja f10984b;

    C1951jja(C1739gja gja, Jja jja) {
        this.f10984b = gja;
        this.f10983a = jja;
    }

    public final void run() {
        this.f10983a.a();
        this.f10984b.f10570b.a(this.f10983a);
    }
}
