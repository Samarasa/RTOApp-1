package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xP  reason: case insensitive filesystem */
public final class C2914xP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f12760a;

    /* renamed from: b  reason: collision with root package name */
    private String f12761b;

    public C2914xP(String str, String str2) {
        this.f12760a = str;
        this.f12761b = str2;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject a2 = M.a((JSONObject) obj, "pii");
            a2.put("doritos", this.f12760a);
            a2.put("doritos_v2", this.f12761b);
        } catch (JSONException unused) {
            fa.f("Failed putting doritos string.");
        }
    }
}
