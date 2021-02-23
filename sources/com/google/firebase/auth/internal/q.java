package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c.b.b.b.b.a.a;
import c.b.b.b.d.d.ra;
import c.b.d.e;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3306p;
import com.google.firebase.auth.F;
import com.google.firebase.auth.W;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private Context f14395a;

    /* renamed from: b  reason: collision with root package name */
    private String f14396b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f14397c = this.f14395a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.f14396b}), 0);

    /* renamed from: d  reason: collision with root package name */
    private a f14398d = new a("StorageHelpers", new String[0]);

    public q(Context context, String str) {
        C0563t.a(context);
        C0563t.b(str);
        this.f14396b = str;
        this.f14395a = context.getApplicationContext();
    }

    private final D a(JSONObject jSONObject) {
        JSONArray jSONArray;
        F a2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(z.a(jSONArray2.getString(i)));
            }
            D d2 = new D(e.a(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                d2.a(ra.b(string));
            }
            if (!z) {
                d2.b();
            }
            d2.a(str);
            if (jSONObject.has("userMetadata") && (a2 = F.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                d2.a(a2);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i2));
                    arrayList2.add("phone".equals(jSONObject2.optString("factorIdKey")) ? F.a(jSONObject2) : null);
                }
                d2.b(arrayList2);
            }
            return d2;
        } catch (com.google.firebase.auth.a.a | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e2) {
            this.f14398d.a(e2);
            return null;
        }
    }

    private final String c(C3306p pVar) {
        JSONObject jSONObject = new JSONObject();
        if (!D.class.isAssignableFrom(pVar.getClass())) {
            return null;
        }
        D d2 = (D) pVar;
        try {
            jSONObject.put("cachedTokenState", d2.u());
            jSONObject.put("applicationName", d2.j().d());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (d2.y() != null) {
                JSONArray jSONArray = new JSONArray();
                List<z> y = d2.y();
                for (int i = 0; i < y.size(); i++) {
                    jSONArray.put(y.get(i).b());
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", d2.i());
            jSONObject.put("version", "2");
            if (d2.x() != null) {
                jSONObject.put("userMetadata", ((F) d2.x()).c());
            }
            List<W> a2 = ((H) d2.w()).a();
            if (a2 != null && !a2.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    jSONArray2.put(a2.get(i2).a());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            this.f14398d.b("Failed to turn object into JSON", e2, new Object[0]);
            throw new com.google.firebase.auth.a.a(e2);
        }
    }

    public final C3306p a() {
        String string = this.f14397c.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return a(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void a(C3306p pVar) {
        C0563t.a(pVar);
        String c2 = c(pVar);
        if (!TextUtils.isEmpty(c2)) {
            this.f14397c.edit().putString("com.google.firebase.auth.FIREBASE_USER", c2).apply();
        }
    }

    public final void a(C3306p pVar, ra raVar) {
        C0563t.a(pVar);
        C0563t.a(raVar);
        this.f14397c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{pVar.h()}), raVar.k()).apply();
    }

    public final void a(String str) {
        this.f14397c.edit().remove(str).apply();
    }

    public final ra b(C3306p pVar) {
        C0563t.a(pVar);
        String string = this.f14397c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{pVar.h()}), (String) null);
        if (string != null) {
            return ra.b(string);
        }
        return null;
    }
}
