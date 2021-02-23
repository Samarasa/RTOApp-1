package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class PJ implements C2906xH<C0624Cg, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final C2554sK f8203a;

    public PJ(C2554sK sKVar) {
        this.f8203a = sKVar;
    }

    public final C2693uH<C0624Cg, C2127mI> a(String str, JSONObject jSONObject) {
        C0624Cg b2 = this.f8203a.b(str);
        if (b2 == null) {
            return null;
        }
        return new C2693uH<>(b2, new C2127mI(), str);
    }
}
