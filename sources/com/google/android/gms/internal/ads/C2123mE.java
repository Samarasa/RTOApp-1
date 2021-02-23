package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mE  reason: case insensitive filesystem */
final /* synthetic */ class C2123mE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2194nE f11278a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11279b;

    C2123mE(C2194nE nEVar, String str) {
        this.f11278a = nEVar;
        this.f11279b = str;
    }

    public final void run() {
        C2194nE nEVar = this.f11278a;
        nEVar.f11429d.a(this.f11279b);
    }
}
