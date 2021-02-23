package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2214nY;
import com.google.android.gms.internal.ads.DY;
import com.google.android.gms.internal.ads.LY;
import org.json.JSONObject;

final /* synthetic */ class d implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    static final C2214nY f5445a = new d();

    private d() {
    }

    public final LY a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            p.g().i().a(jSONObject.getString("appSettingsJson"));
        }
        return DY.a(null);
    }
}
