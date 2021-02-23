package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ed  reason: case insensitive filesystem */
public final class C1584ed implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10284a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C1726gd> f10285b = new HashMap();

    public final <EngineT extends C2578se> LY<JSONObject> a(EngineT enginet, String str, JSONObject jSONObject) {
        C1742gl glVar = new C1742gl();
        p.c();
        String a2 = oa.a();
        a(a2, (C1726gd) new C1514dd(this, glVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", a2);
            jSONObject2.put("args", jSONObject);
            enginet.b(str, jSONObject2);
        } catch (Exception e2) {
            glVar.a((Throwable) e2);
        }
        return glVar;
    }

    public final void a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f10284a) {
            C1726gd remove = this.f10285b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                C1018Rk.d(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.b(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (fa.a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        fa.f(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e2) {
                    remove.b(e2.getMessage());
                }
            }
        }
    }

    public final void a(String str, C1726gd gdVar) {
        synchronized (this.f10284a) {
            this.f10285b.put(str, gdVar);
        }
    }
}
