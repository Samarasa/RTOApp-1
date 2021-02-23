package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe  reason: case insensitive filesystem */
final class C2437qe implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f11864a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2011ke f11865b;

    C2437qe(C2011ke keVar, String str) {
        this.f11865b = keVar;
        this.f11864a = str;
    }

    public final void run() {
        this.f11865b.f11075a.loadUrl(this.f11864a);
    }
}
