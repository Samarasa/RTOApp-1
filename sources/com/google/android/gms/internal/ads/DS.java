package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.M;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Collections;
import java.util.List;

public final class DS {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f6546a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6547b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6548c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6549d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6550e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6551f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6552g;

    /* renamed from: h  reason: collision with root package name */
    public final AS f6553h;

    DS(JsonReader jsonReader) {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = BuildConfig.FLAVOR;
        int i = 0;
        AS as = null;
        boolean z = false;
        long j = 0;
        int i2 = 0;
        String str2 = str;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = M.a(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (!((Boolean) Qqa.e().a(F.Df)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    jsonReader.skipValue();
                } else {
                    as = new AS(jsonReader);
                }
            }
        }
        jsonReader.endObject();
        this.f6546a = emptyList;
        this.f6548c = i;
        this.f6547b = str;
        this.f6549d = str2;
        this.f6550e = i2;
        this.f6551f = j;
        this.f6553h = as;
        this.f6552g = z;
    }
}
