package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oq  reason: case insensitive filesystem */
public final class C2319oq implements C1823hq {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11644a;

    public C2319oq(Context context) {
        this.f11644a = context;
    }

    public final void a(Map<String, String> map) {
        CookieManager c2;
        String str = map.get("cookie");
        if (!TextUtils.isEmpty(str) && (c2 = p.e().c(this.f11644a)) != null) {
            c2.setCookie((String) Qqa.e().a(F.ra), str);
        }
    }
}
