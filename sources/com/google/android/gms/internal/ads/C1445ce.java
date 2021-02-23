package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ce  reason: case insensitive filesystem */
public final /* synthetic */ class C1445ce {
    public static void a(C1516de deVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        deVar.a(sb.toString());
    }

    public static void a(C1516de deVar, String str, Map map) {
        try {
            deVar.a(str, p.c().a((Map<String, ?>) map));
        } catch (JSONException unused) {
            C1018Rk.d("Could not convert parameters to JSON.");
        }
    }

    public static void a(C1516de deVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        deVar.a(str, jSONObject.toString());
    }

    public static void b(C1516de deVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C1018Rk.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        deVar.a(sb.toString());
    }
}
