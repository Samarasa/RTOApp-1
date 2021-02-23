package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.fa;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class CP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f6416a;

    public CP(List<String> list) {
        this.f6416a = list;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f6416a));
        } catch (JSONException unused) {
            fa.f("Failed putting experiment ids.");
        }
    }
}
