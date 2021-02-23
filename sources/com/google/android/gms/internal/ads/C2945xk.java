package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xk  reason: case insensitive filesystem */
public final class C2945xk {

    /* renamed from: a  reason: collision with root package name */
    private final long f12824a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f12825b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f12826c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, C0649Df> f12827d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f12828e;

    /* renamed from: f  reason: collision with root package name */
    private String f12829f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f12830g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12831h;

    public C2945xk(String str, long j) {
        JSONObject optJSONObject;
        this.f12831h = false;
        this.f12829f = str;
        this.f12824a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f12830g = new JSONObject(str);
                if (this.f12830g.optInt("status", -1) != 1) {
                    this.f12831h = false;
                    C1018Rk.d("App settings could not be fetched successfully.");
                    return;
                }
                this.f12831h = true;
                this.f12828e = this.f12830g.optString("app_id");
                JSONArray optJSONArray = this.f12830g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f12826c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.f12827d.put(optString2, new C0649Df(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.f12830g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f12825b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e2) {
                C1018Rk.c("Exception occurred while processing app setting json", e2);
                p.g().a((Throwable) e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long a() {
        return this.f12824a;
    }

    public final boolean b() {
        return this.f12831h;
    }

    public final String c() {
        return this.f12829f;
    }

    public final String d() {
        return this.f12828e;
    }

    public final Map<String, C0649Df> e() {
        return this.f12827d;
    }

    public final JSONObject f() {
        return this.f12830g;
    }
}
