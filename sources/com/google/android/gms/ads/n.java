package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends C0490a {

    /* renamed from: e  reason: collision with root package name */
    private final u f5717e;

    public n(int i, String str, String str2, C0490a aVar, u uVar) {
        super(i, str, str2, aVar);
        this.f5717e = uVar;
    }

    public final JSONObject e() {
        JSONObject e2 = super.e();
        u f2 = f();
        e2.put("Response Info", f2 == null ? "null" : f2.c());
        return e2;
    }

    public final u f() {
        if (((Boolean) Qqa.e().a(F.Ff)).booleanValue()) {
            return this.f5717e;
        }
        return null;
    }

    public final String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
