package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zG  reason: case insensitive filesystem */
final class C3047zG implements C1246_e<AG> {
    C3047zG() {
    }

    public final /* synthetic */ JSONObject a(Object obj) {
        AG ag = (AG) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", ag.f6094d.d());
        jSONObject2.put("signals", ag.f6093c);
        jSONObject3.put("body", ag.f6092b.f6513c);
        jSONObject3.put("headers", p.c().a((Map<String, ?>) ag.f6092b.f6512b));
        jSONObject3.put("response_code", ag.f6092b.f6511a);
        jSONObject3.put("latency", ag.f6092b.f6514d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", ag.f6094d.g());
        return jSONObject;
    }
}
