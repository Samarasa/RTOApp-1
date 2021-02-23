package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ZP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f9549a;

    public ZP(Map<String, Object> map) {
        this.f9549a = map;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", p.c().a((Map<String, ?>) this.f9549a));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            fa.f(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
