package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1151Wn;
import com.google.android.gms.internal.ads.C2242nn;
import com.google.android.gms.internal.ads.C2313on;
import com.google.android.gms.internal.ads.Soa;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.ads.internal.util.b  reason: case insensitive filesystem */
public class C0495b extends za {
    public final WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    public final C2242nn a(C2313on onVar, Soa soa, boolean z) {
        return new C1151Wn(onVar, soa, z);
    }

    public final CookieManager c(Context context) {
        if (wa.c()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C1018Rk.b("Failed to obtain CookieManager.", th);
            p.g().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int d() {
        return 16974374;
    }
}
