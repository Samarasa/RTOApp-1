package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.fa;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iP  reason: case insensitive filesystem */
public final class C1851iP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f10798a;

    public C1851iP(JSONObject jSONObject) {
        this.f10798a = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject a2 = M.a((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f10798a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            fa.f("Failed putting app indexing json.");
        }
    }
}
