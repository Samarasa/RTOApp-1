package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class FI implements C2906xH<C1925jT, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1555eD f6821a;

    public FI(C1555eD eDVar) {
        this.f6821a = eDVar;
    }

    public final C2693uH<C1925jT, C2127mI> a(String str, JSONObject jSONObject) {
        C1925jT a2 = this.f6821a.a(str, jSONObject);
        if (a2 == null) {
            return null;
        }
        return new C2693uH<>(a2, new C2127mI(), str);
    }
}
