package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads._x  reason: case insensitive filesystem */
public final class C1265_x implements C2670toa {

    /* renamed from: a  reason: collision with root package name */
    private IW f9750a;

    public final void a(Activity activity, WebView webView) {
        try {
            this.f9750a = new IW(activity, webView);
        } catch (RuntimeException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            C1018Rk.b(sb.toString());
        }
    }

    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f9750a != null) {
            IW.a(webView, str, bitmap);
        }
    }

    public final void a(String str, String str2) {
        if (this.f9750a == null) {
            C1018Rk.b("ArWebView is not initialized.");
        } else {
            IW.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
        }
    }

    public final View getView() {
        return this.f9750a;
    }

    public final WebView getWebView() {
        if (this.f9750a == null) {
            return null;
        }
        return IW.getWebView();
    }
}
