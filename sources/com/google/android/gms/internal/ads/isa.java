package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.e.b;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class isa implements b {

    /* renamed from: a  reason: collision with root package name */
    private final dsa f10859a;

    isa(dsa dsa) {
        this.f10859a = dsa;
    }

    public final Map a() {
        dsa dsa = this.f10859a;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new hsa(dsa));
        return hashMap;
    }
}
