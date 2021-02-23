package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.N;
import org.json.JSONObject;

public final class GS implements N {

    /* renamed from: a  reason: collision with root package name */
    public final String f7020a = this.f7023d.optString("ad_html", (String) null);

    /* renamed from: b  reason: collision with root package name */
    public final String f7021b = this.f7023d.optString("ad_base_url", (String) null);

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f7022c = this.f7023d.optJSONObject("ad_json");

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f7023d;

    GS(JsonReader jsonReader) {
        this.f7023d = M.c(jsonReader);
    }

    public final void a(JsonWriter jsonWriter) {
        M.a(jsonWriter, this.f7023d);
    }
}
