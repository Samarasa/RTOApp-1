package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oe  reason: case insensitive filesystem */
final class C2295oe implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f11598a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2011ke f11599b;

    C2295oe(C2011ke keVar, String str) {
        this.f11599b = keVar;
        this.f11598a = str;
    }

    public final void run() {
        this.f11599b.f11075a.loadData(this.f11598a, "text/html", "UTF-8");
    }
}
