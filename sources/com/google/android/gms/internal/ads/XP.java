package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class XP implements KO {

    /* renamed from: a  reason: collision with root package name */
    static final KO f9236a = new XP();

    private XP() {
    }

    public final void a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
