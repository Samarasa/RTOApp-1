package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wP  reason: case insensitive filesystem */
final class C2843wP implements JO<KO<JSONObject>> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f12620a;

    C2843wP(Context context) {
        this.f12620a = C0652Di.a(context);
    }

    public final LY<KO<JSONObject>> a() {
        return DY.a(new C2772vP(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f12620a);
        } catch (JSONException unused) {
            fa.f("Failed putting version constants.");
        }
    }
}
