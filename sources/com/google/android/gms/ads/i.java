package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.C1824hqa;
import com.google.android.gms.internal.ads.C2745uqa;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final C2745uqa f5432a;

    /* renamed from: b  reason: collision with root package name */
    private final C0490a f5433b;

    private i(C2745uqa uqa) {
        this.f5432a = uqa;
        C1824hqa hqa = uqa.f12445c;
        this.f5433b = hqa == null ? null : hqa.g();
    }

    public static i a(C2745uqa uqa) {
        if (uqa != null) {
            return new i(uqa);
        }
        return null;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f5432a.f12443a);
        jSONObject.put("Latency", this.f5432a.f12444b);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f5432a.f12446d.keySet()) {
            jSONObject2.put(str, this.f5432a.f12446d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C0490a aVar = this.f5433b;
        jSONObject.put("Ad Error", aVar == null ? "null" : aVar.e());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
