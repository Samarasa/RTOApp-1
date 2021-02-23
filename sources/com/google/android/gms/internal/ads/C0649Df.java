package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Df  reason: case insensitive filesystem */
public final class C0649Df {

    /* renamed from: a  reason: collision with root package name */
    public final List<C0571Af> f6580a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6581b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f6582c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f6583d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f6584e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f6585f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f6586g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f6587h;
    private final String i;
    private final long j;
    private final String k;
    private final int l;
    private final int m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private int s;
    private int t;
    private boolean u;

    public C0649Df(JSONObject jSONObject) {
        if (C1018Rk.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            fa.f(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                C0571Af af = new C0571Af(jSONArray.getJSONObject(i3));
                boolean z = true;
                if ("banner".equalsIgnoreCase(af.v)) {
                    this.u = true;
                }
                arrayList.add(af);
                if (i2 < 0) {
                    Iterator<String> it = af.f6152c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i2 = i3;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.s = i2;
        this.t = jSONArray.length();
        this.f6580a = Collections.unmodifiableList(arrayList);
        this.i = jSONObject.optString("qdata");
        this.m = jSONObject.optInt("fs_model_type", -1);
        long j2 = -1;
        this.n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f6581b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            p.u();
            this.f6582c = C0623Cf.a(optJSONObject, "click_urls");
            p.u();
            this.f6583d = C0623Cf.a(optJSONObject, "imp_urls");
            p.u();
            this.f6584e = C0623Cf.a(optJSONObject, "downloaded_imp_urls");
            p.u();
            this.f6585f = C0623Cf.a(optJSONObject, "nofill_urls");
            p.u();
            this.f6586g = C0623Cf.a(optJSONObject, "remote_ping_urls");
            this.f6587h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.j = optLong > 0 ? 1000 * optLong : j2;
            C1809hj a2 = C1809hj.a(optJSONObject.optJSONArray("rewards"));
            if (a2 == null) {
                this.k = null;
                this.l = 0;
            } else {
                this.k = a2.f10714a;
                this.l = a2.f10715b;
            }
            this.o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.r = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f6581b = -1;
        this.f6582c = null;
        this.f6583d = null;
        this.f6584e = null;
        this.f6585f = null;
        this.f6586g = null;
        this.j = -1;
        this.k = null;
        this.l = 0;
        this.o = false;
        this.f6587h = false;
        this.p = false;
        this.q = false;
        this.r = false;
    }
}
