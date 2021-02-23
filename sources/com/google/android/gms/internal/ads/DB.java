package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class DB implements C2739una {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f6497a;

    DB(C2313on onVar) {
        this.f6497a = onVar;
    }

    public final void a(C2810vna vna) {
        C2313on onVar = this.f6497a;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", vna.m ? "1" : "0");
        onVar.a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }
}
