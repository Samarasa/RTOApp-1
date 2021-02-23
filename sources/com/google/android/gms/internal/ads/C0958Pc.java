package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pc  reason: case insensitive filesystem */
final class C0958Pc implements C1088Uc<C2313on> {
    C0958Pc() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        if (map.keySet().contains("start")) {
            onVar.t().P();
        } else if (map.keySet().contains("stop")) {
            onVar.t().Q();
        } else if (map.keySet().contains("cancel")) {
            onVar.t().R();
        }
    }
}
