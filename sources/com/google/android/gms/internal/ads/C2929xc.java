package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.M;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xc  reason: case insensitive filesystem */
public final class C2929xc implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final C2858wc f12779a;

    public C2929xc(C2858wc wcVar) {
        this.f12779a = wcVar;
    }

    public final void a(Object obj, Map<String, String> map) {
        if (this.f12779a != null) {
            String str = map.get("name");
            if (str == null) {
                C1018Rk.c("Ad metadata with no name parameter.");
                str = BuildConfig.FLAVOR;
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = M.a(new JSONObject(map.get("info")));
                } catch (JSONException e2) {
                    C1018Rk.b("Failed to convert ad metadata to JSON.", e2);
                }
            }
            if (bundle == null) {
                C1018Rk.b("Failed to convert ad metadata to Bundle.");
            } else {
                this.f12779a.a(str, bundle);
            }
        }
    }
}
