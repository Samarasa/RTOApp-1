package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.M;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Oz  reason: case insensitive filesystem */
public final class C0955Oz extends C0981Pz {

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8171b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8172c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8173d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8174e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8175f;

    public C0955Oz(C2988yS ySVar, JSONObject jSONObject) {
        super(ySVar);
        this.f8171b = M.a(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f8172c = M.a(false, jSONObject, "allow_pub_owned_ad_view");
        this.f8173d = M.a(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f8174e = M.a(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.f8175f = z;
    }

    public final boolean a() {
        return this.f8174e;
    }

    public final JSONObject b() {
        JSONObject jSONObject = this.f8171b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f8291a.y);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean c() {
        return this.f8175f;
    }

    public final boolean d() {
        return this.f8172c;
    }

    public final boolean e() {
        return this.f8173d;
    }
}
