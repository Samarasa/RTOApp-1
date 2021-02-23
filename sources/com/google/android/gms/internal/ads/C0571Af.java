package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Af  reason: case insensitive filesystem */
public final class C0571Af {

    /* renamed from: a  reason: collision with root package name */
    private final String f6150a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6151b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f6152c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6153d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6154e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f6155f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f6156g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f6157h;
    private final List<String> i;
    private final List<String> j;
    public final String k;
    private final List<String> l;
    private final List<String> m;
    private final List<String> n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final List<String> t;
    private final String u;
    public final String v;
    private final long w;

    public C0571Af(JSONObject jSONObject) {
        List<String> list;
        this.f6151b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f6152c = Collections.unmodifiableList(arrayList);
        this.f6153d = jSONObject.optString("allocation_id", (String) null);
        p.u();
        this.f6155f = C0623Cf.a(jSONObject, "clickurl");
        p.u();
        this.f6156g = C0623Cf.a(jSONObject, "imp_urls");
        p.u();
        this.f6157h = C0623Cf.a(jSONObject, "downloaded_imp_urls");
        p.u();
        this.j = C0623Cf.a(jSONObject, "fill_urls");
        p.u();
        this.l = C0623Cf.a(jSONObject, "video_start_urls");
        p.u();
        this.n = C0623Cf.a(jSONObject, "video_complete_urls");
        p.u();
        this.m = C0623Cf.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            p.u();
            list = C0623Cf.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.i = list;
        this.f6150a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f6154e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", (String) null);
        this.r = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        p.u();
        this.t = C0623Cf.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", (String) null);
        this.w = jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
