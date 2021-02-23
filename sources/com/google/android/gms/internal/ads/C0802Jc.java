package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jc  reason: case insensitive filesystem */
final class C0802Jc implements C1088Uc<C2313on> {
    C0802Jc() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        JSONObject c2;
        C2313on onVar = (C2313on) obj;
        C1242_a q = onVar.q();
        if (q == null || (c2 = q.c()) == null) {
            onVar.a("nativeAdViewSignalsReady", new JSONObject());
        } else {
            onVar.a("nativeAdViewSignalsReady", c2);
        }
    }
}
