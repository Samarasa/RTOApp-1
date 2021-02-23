package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xi  reason: case insensitive filesystem */
public final class C2941xi {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f12803a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12804b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12805c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12806d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12807e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12808f;

    /* renamed from: g  reason: collision with root package name */
    private final String f12809g;

    /* renamed from: h  reason: collision with root package name */
    private String f12810h;
    private final int i;
    private final boolean j;
    private final JSONObject k;
    private final String l;
    private final boolean m;
    private final String n;

    public C2941xi(JSONObject jSONObject) {
        this.f12810h = jSONObject.optString("url");
        this.f12804b = jSONObject.optString("base_uri");
        this.f12805c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i2 = 1;
        this.f12807e = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f12808f = jSONObject.optString("request_id");
        this.f12806d = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        this.f12803a = optString2 == null ? null : Arrays.asList(optString2.split(","));
        this.i = jSONObject.optInt("valid", 0) == 1 ? -2 : i2;
        this.f12809g = jSONObject.optString("fetched_ad");
        this.j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.l = jSONObject.optString("analytics_query_ad_event_id");
        this.m = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.n = jSONObject.optString("pool_key");
    }

    public final int a() {
        return this.i;
    }

    public final String b() {
        return this.f12810h;
    }

    public final List<String> c() {
        return this.f12803a;
    }

    public final String d() {
        return this.f12804b;
    }

    public final String e() {
        return this.f12805c;
    }

    public final boolean f() {
        return this.f12807e;
    }

    public final JSONObject g() {
        return this.k;
    }

    public final String h() {
        return this.n;
    }
}
