package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.Mn  reason: case insensitive filesystem */
final /* synthetic */ class C0891Mn implements C0943On {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f7899a;

    C0891Mn(C2313on onVar) {
        this.f7899a = onVar;
    }

    public final void a(Uri uri) {
        C1323ao t = this.f7899a.t();
        if (t == null) {
            C1018Rk.b("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            t.a(uri);
        }
    }
}
