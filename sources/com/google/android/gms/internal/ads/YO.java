package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

public final class YO implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0070a f9350a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9351b;

    public YO(a.C0070a aVar, String str) {
        this.f9350a = aVar;
        this.f9351b = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject a2 = M.a((JSONObject) obj, "pii");
            if (this.f9350a == null || TextUtils.isEmpty(this.f9350a.a())) {
                a2.put("pdid", this.f9351b);
                a2.put("pdidtype", "ssaid");
                return;
            }
            a2.put("rdid", this.f9350a.a());
            a2.put("is_lat", this.f9350a.b());
            a2.put("idtype", "adid");
        } catch (JSONException e2) {
            fa.e("Failed putting Ad ID.", e2);
        }
    }
}
