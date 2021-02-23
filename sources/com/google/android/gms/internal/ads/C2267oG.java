package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oG  reason: case insensitive filesystem */
final /* synthetic */ class C2267oG implements BU {

    /* renamed from: a  reason: collision with root package name */
    static final BU f11570a = new C2267oG();

    private C2267oG() {
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        fa.f("Ad request signals:");
        fa.f(jSONObject.toString(2));
        return jSONObject;
    }
}
