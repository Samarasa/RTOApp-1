package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qc  reason: case insensitive filesystem */
final class C0984Qc implements C1088Uc<C2313on> {
    C0984Qc() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            onVar.P();
        } else if ("resume".equals(str)) {
            onVar.Q();
        }
    }
}
