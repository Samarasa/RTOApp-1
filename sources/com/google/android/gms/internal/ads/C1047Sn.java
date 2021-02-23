package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.Sn  reason: case insensitive filesystem */
public class C1047Sn extends C2242nn {
    public C1047Sn(C2313on onVar, Soa soa, boolean z) {
        super(onVar, soa, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof C2313on)) {
            C1018Rk.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        C2313on onVar = (C2313on) webView;
        C0835Kj kj = this.u;
        if (kj != null) {
            kj.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (onVar.t() != null) {
            onVar.t().V();
        }
        String str2 = (String) Qqa.e().a(onVar.m().e() ? F.I : onVar.j() ? F.H : F.G);
        p.c();
        return oa.c(onVar.getContext(), onVar.B().f9456a, str2);
    }
}
