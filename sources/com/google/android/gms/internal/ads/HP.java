package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONException;
import org.json.JSONObject;

public final class HP implements KO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Location f7140a;

    public HP(Location location) {
        this.f7140a = location;
    }

    public final /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (this.f7140a != null) {
                JSONObject jSONObject2 = new JSONObject();
                Float valueOf = Float.valueOf(this.f7140a.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.f7140a.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.f7140a.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.f7140a.getLongitude() * 1.0E7d));
                jSONObject2.put("radius", valueOf);
                jSONObject2.put("lat", valueOf3);
                jSONObject2.put("long", valueOf4);
                jSONObject2.put("time", valueOf2);
                jSONObject.put("uule", jSONObject2);
            }
        } catch (JSONException e2) {
            fa.e("Failed adding location to the request JSON.", e2);
        }
    }
}
