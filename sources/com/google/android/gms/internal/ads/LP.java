package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

public final class LP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f7671a;

    public LP(Bundle bundle) {
        this.f7671a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f7671a != null) {
            try {
                M.a(M.a(jSONObject, "device"), "play_store").put("parental_controls", p.c().a(this.f7671a));
            } catch (JSONException unused) {
                fa.f("Failed putting parental controls bundle.");
            }
        }
    }
}
