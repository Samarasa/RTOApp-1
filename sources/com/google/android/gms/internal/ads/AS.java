package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class AS {

    /* renamed from: a  reason: collision with root package name */
    private int f6113a;

    /* renamed from: b  reason: collision with root package name */
    private String f6114b;

    AS(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = 3;
        String str = BuildConfig.FLAVOR;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c2 = 0;
                }
            } else if (nextName.equals("description")) {
                c2 = 1;
            }
            if (c2 == 0) {
                i = jsonReader.nextInt();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f6113a = i;
        this.f6114b = str;
    }

    public final String a() {
        return this.f6114b;
    }
}
