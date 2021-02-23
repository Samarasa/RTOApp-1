package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import org.json.JSONObject;

final /* synthetic */ class EF implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    private final FF f6675a;

    /* renamed from: b  reason: collision with root package name */
    private final C1682fqa f6676b;

    EF(FF ff, C1682fqa fqa) {
        this.f6675a = ff;
        this.f6676b = fqa;
    }

    public final LY a(Object obj) {
        C1682fqa fqa = this.f6676b;
        String str = (String) obj;
        String str2 = fqa.f10466a;
        String str3 = fqa.f10467b;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", BuildConfig.FLAVOR);
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return DY.a(jSONObject);
    }
}
