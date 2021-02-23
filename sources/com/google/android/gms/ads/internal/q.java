package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1200Yk;
import com.google.android.gms.internal.ads.C2249nqa;
import com.google.android.gms.internal.ads.C2641ta;
import com.google.android.gms.internal.ads.EO;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5537a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5538b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f5539c = new TreeMap();

    /* renamed from: d  reason: collision with root package name */
    private String f5540d;

    /* renamed from: e  reason: collision with root package name */
    private String f5541e;

    public q(Context context, String str) {
        this.f5537a = context.getApplicationContext();
        this.f5538b = str;
    }

    public final String a() {
        return this.f5540d;
    }

    public final void a(C2249nqa nqa, C1200Yk yk) {
        this.f5540d = nqa.j.f10489a;
        Bundle bundle = nqa.m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String a2 = C2641ta.f12214c.a();
            for (String str : bundle2.keySet()) {
                if (a2.equals(str)) {
                    this.f5541e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f5539c.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.f5539c.put("SDKVersion", yk.f9456a);
            if (C2641ta.f12212a.a().booleanValue()) {
                try {
                    Bundle a3 = EO.a(this.f5537a, new JSONArray(C2641ta.f12213b.a()));
                    for (String str2 : a3.keySet()) {
                        this.f5539c.put(str2, a3.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    C1018Rk.b("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }

    public final String b() {
        return this.f5541e;
    }

    public final String c() {
        return this.f5538b;
    }

    public final Map<String, String> d() {
        return this.f5539c;
    }
}
