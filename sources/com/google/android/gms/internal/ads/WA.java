package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class WA {

    /* renamed from: a  reason: collision with root package name */
    private final PY f9105a;

    /* renamed from: b  reason: collision with root package name */
    private final _A f9106b;

    /* renamed from: c  reason: collision with root package name */
    private final C2333pB f9107c;

    public WA(PY py, _A _a, C2333pB pBVar) {
        this.f9105a = py;
        this.f9106b = _a;
        this.f9107c = pBVar;
    }

    public final LY<C0877Lz> a(OS os, C2988yS ySVar, JSONObject jSONObject) {
        JSONObject optJSONObject;
        LY a2;
        JSONObject jSONObject2 = jSONObject;
        OS os2 = os;
        LY a3 = this.f9105a.a(new VA(this, os, ySVar, jSONObject2));
        LY<List<C1190Ya>> b2 = this.f9106b.b(jSONObject2, "images");
        LY<C1190Ya> a4 = this.f9106b.a(jSONObject2, "secondary_image");
        LY<C1190Ya> a5 = this.f9106b.a(jSONObject2, "app_icon");
        LY<C1060Ta> c2 = this.f9106b.c(jSONObject2, "attribution");
        LY<C2313on> c3 = this.f9106b.c(jSONObject2);
        _A _a = this.f9106b;
        if (jSONObject2.optBoolean("enable_omid") && (optJSONObject = jSONObject2.optJSONObject("omid_settings")) != null) {
            String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                a2 = DY.a(DY.a(null), new C1483dB(_a, optString), (Executor) C1252_k.f9703e);
                LY ly = a2;
                LY<List<C2404qB>> a6 = this.f9107c.a(jSONObject2, "custom_assets");
                return DY.a((LY<? extends V>[]) new LY[]{a3, b2, a4, a5, c2, c3, ly, a6}).a(new YA(this, a3, b2, a5, a4, c2, jSONObject, c3, ly, a6), this.f9105a);
            }
        }
        a2 = DY.a(null);
        LY ly2 = a2;
        LY<List<C2404qB>> a62 = this.f9107c.a(jSONObject2, "custom_assets");
        return DY.a((LY<? extends V>[]) new LY[]{a3, b2, a4, a5, c2, c3, ly2, a62}).a(new YA(this, a3, b2, a5, a4, c2, jSONObject, c3, ly2, a62), this.f9105a);
    }
}
