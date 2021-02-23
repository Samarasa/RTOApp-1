package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wj  reason: case insensitive filesystem */
final /* synthetic */ class C1147Wj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1017Rj f9163a;

    /* renamed from: b  reason: collision with root package name */
    private final C1811hk f9164b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9165c;

    C1147Wj(C1017Rj rj, C1811hk hkVar, String str) {
        this.f9163a = rj;
        this.f9164b = hkVar;
        this.f9165c = str;
    }

    public final void run() {
        this.f9163a.a(this.f9164b, this.f9165c);
    }
}
