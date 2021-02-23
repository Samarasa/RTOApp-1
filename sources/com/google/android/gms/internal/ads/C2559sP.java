package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sP  reason: case insensitive filesystem */
public final class C2559sP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f12081a;

    public C2559sP(JSONObject jSONObject) {
        this.f12081a = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f12081a);
        } catch (JSONException unused) {
            fa.f("Unable to get cache_state");
        }
    }
}
