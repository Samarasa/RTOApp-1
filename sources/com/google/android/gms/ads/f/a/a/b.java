package com.google.android.gms.ads.f.a.a;

import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f5395a;

    public b(JSONObject jSONObject) {
        this.f5395a = jSONObject;
    }

    public a a() {
        int optInt = this.f5395a.optInt("media_type", -1);
        return optInt != 0 ? optInt != 1 ? a.UNKNOWN : a.VIDEO : a.DISPLAY;
    }

    public String b() {
        if (c.f5396a[a().ordinal()] != 1) {
            return "javascript";
        }
        return null;
    }
}
