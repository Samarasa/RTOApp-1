package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gD  reason: case insensitive filesystem */
public final class C1697gD {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, JSONObject>> f10502a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f10503b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10504c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f10505d;

    public C1697gD(Executor executor) {
        this.f10503b = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void d() {
        Map map;
        this.f10504c = true;
        C2945xk m = p.g().i().m();
        if (m != null) {
            JSONObject f2 = m.f();
            if (f2 != null) {
                this.f10505d = f2.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f2.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f10502a.containsKey(optString2)) {
                                    map = this.f10502a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f10502a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final JSONObject a(String str, String str2) {
        if (!((Boolean) Qqa.e().a(F.zc)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f10504c) {
            d();
        }
        Map map = this.f10502a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a2 = C1909jD.a(this.f10505d, str, str2);
        if (a2 == null) {
            return null;
        }
        return (JSONObject) map.get(a2);
    }

    public final void a() {
        p.g().i().a((Runnable) new C1626fD(this));
        this.f10503b.execute(new C1839iD(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f10503b.execute(new C1768hD(this));
    }
}
