package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.concurrent.Callable;
import org.json.JSONObject;

final /* synthetic */ class VA implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final WA f8997a;

    /* renamed from: b  reason: collision with root package name */
    private final OS f8998b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f8999c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f9000d;

    VA(WA wa, OS os, C2988yS ySVar, JSONObject jSONObject) {
        this.f8997a = wa;
        this.f8998b = os;
        this.f8999c = ySVar;
        this.f9000d = jSONObject;
    }

    public final Object call() {
        OS os = this.f8998b;
        C2988yS ySVar = this.f8999c;
        JSONObject jSONObject = this.f9000d;
        C0877Lz lz = new C0877Lz();
        lz.a(jSONObject.optInt("template_id", -1));
        lz.a(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        lz.b(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        SS ss = os.f8087a.f7415a;
        if (ss.f8621g.contains(Integer.toString(lz.o()))) {
            if (lz.o() == 3) {
                if (lz.e() == null) {
                    throw new C1986kJ(C2351pT.INTERNAL_ERROR, "No custom template id for custom template ad response.");
                } else if (!ss.f8622h.contains(lz.e())) {
                    throw new C1986kJ(C2351pT.INTERNAL_ERROR, "Unexpected custom template id in the response.");
                }
            }
            lz.a(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (ySVar.H) {
                p.c();
                String c2 = oa.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 3 + String.valueOf(optString).length());
                sb.append(c2);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            lz.a("headline", optString);
            lz.a("body", jSONObject.optString("body", (String) null));
            lz.a("call_to_action", jSONObject.optString("call_to_action", (String) null));
            lz.a("store", jSONObject.optString("store", (String) null));
            lz.a("price", jSONObject.optString("price", (String) null));
            lz.a("advertiser", jSONObject.optString("advertiser", (String) null));
            return lz;
        }
        C2351pT pTVar = C2351pT.INTERNAL_ERROR;
        int o = lz.o();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(o);
        throw new C1986kJ(pTVar, sb2.toString());
    }
}
