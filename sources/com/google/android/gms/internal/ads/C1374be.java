package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.be  reason: case insensitive filesystem */
final class C1374be {

    /* renamed from: a  reason: collision with root package name */
    private final C1586ee f9928a;

    private C1374be(C1586ee eeVar) {
        this.f9928a = eeVar;
    }

    @JavascriptInterface
    public final void notify(String str) {
        this.f9928a.b(str);
    }
}
