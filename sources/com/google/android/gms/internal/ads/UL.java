package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.M;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public final class UL {

    /* renamed from: a  reason: collision with root package name */
    public final String f8884a;

    /* renamed from: b  reason: collision with root package name */
    public String f8885b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f8886c = new Bundle();

    public UL(JsonReader jsonReader) {
        Map hashMap = new HashMap();
        jsonReader.beginObject();
        Map map = hashMap;
        String str = BuildConfig.FLAVOR;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? BuildConfig.FLAVOR : nextName;
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c2 = 1;
                }
            } else if (nextName.equals("params")) {
                c2 = 0;
            }
            if (c2 == 0) {
                str = jsonReader.nextString();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                map = M.b(jsonReader);
            }
        }
        this.f8884a = str;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                this.f8886c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final UL a(Bundle bundle) {
        try {
            this.f8885b = p.c().a(bundle).toString();
        } catch (JSONException unused) {
            this.f8885b = "{}";
        }
        return this;
    }
}
