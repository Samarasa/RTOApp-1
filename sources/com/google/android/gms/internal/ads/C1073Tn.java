package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.Tn  reason: case insensitive filesystem */
public final class C1073Tn extends C1047Sn {
    public C1073Tn(C2313on onVar, Soa soa, boolean z) {
        super(onVar, soa, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, (Map<String, String>) null);
    }
}
