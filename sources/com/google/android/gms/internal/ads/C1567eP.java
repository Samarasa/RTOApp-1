package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eP  reason: case insensitive filesystem */
public final class C1567eP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final String f10258a;

    public C1567eP(String str) {
        this.f10258a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f10258a);
        } catch (JSONException e2) {
            fa.e("Failed putting Ad ID.", e2);
        }
    }
}
