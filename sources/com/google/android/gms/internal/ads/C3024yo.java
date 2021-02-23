package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.m;

/* renamed from: com.google.android.gms.internal.ads.yo  reason: case insensitive filesystem */
final class C3024yo {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f12982a;

    private C3024yo() {
    }

    @TargetApi(19)
    static void a(WebView webView, String str) {
        if (!m.f() || !a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }

    @TargetApi(19)
    private static boolean a(WebView webView) {
        boolean booleanValue;
        synchronized (C3024yo.class) {
            if (f12982a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    f12982a = true;
                } catch (IllegalStateException unused) {
                    f12982a = false;
                }
            }
            booleanValue = f12982a.booleanValue();
        }
        return booleanValue;
    }
}
