package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Sc  reason: case insensitive filesystem */
final class C1036Sc implements C1088Uc<C2313on> {
    C1036Sc() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        if (map.keySet().contains("start")) {
            onVar.b(true);
        }
        if (map.keySet().contains("stop")) {
            onVar.b(false);
        }
    }
}
