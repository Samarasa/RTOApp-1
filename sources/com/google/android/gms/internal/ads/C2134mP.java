package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mP  reason: case insensitive filesystem */
public final class C2134mP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f11300a;

    public C2134mP(String str) {
        this.f11300a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject a2 = M.a((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f11300a)) {
                a2.put("attok", this.f11300a);
            }
        } catch (JSONException e2) {
            fa.e("Failed putting attestation token.", e2);
        }
    }
}
