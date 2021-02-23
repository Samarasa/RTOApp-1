package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.re  reason: case insensitive filesystem */
final class C2507re implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f11995a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2011ke f11996b;

    C2507re(C2011ke keVar, String str) {
        this.f11996b = keVar;
        this.f11995a = str;
    }

    public final void run() {
        this.f11996b.f11075a.loadData(this.f11995a, "text/html", "UTF-8");
    }
}
