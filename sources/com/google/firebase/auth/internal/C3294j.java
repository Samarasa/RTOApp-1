package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import b.e.b;
import c.b.b.b.b.a.a;
import c.b.b.b.d.d.B;
import c.b.b.b.d.d.C0276l;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.firebase.auth.internal.j  reason: case insensitive filesystem */
final class C3294j {

    /* renamed from: a  reason: collision with root package name */
    private static final a f14385a = new a("JSONParser", new String[0]);

    private static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> a(String str) {
        C0563t.b(str);
        List<String> a2 = C0276l.a('.').a((CharSequence) str);
        if (a2.size() < 2) {
            a aVar = f14385a;
            String valueOf = String.valueOf(str);
            aVar.a(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "), new Object[0]);
        } else {
            try {
                Map<String, Object> b2 = b(new String(c.b(a2.get(1)), "UTF-8"));
                return b2 == null ? B.a() : b2;
            } catch (UnsupportedEncodingException e2) {
                f14385a.a("Unable to decode token", e2, new Object[0]);
            }
        }
        return B.a();
    }

    private static Map<String, Object> a(JSONObject jSONObject) {
        b bVar = new b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }

    public static Map<String, Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return a(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new com.google.firebase.auth.a.a(e2);
        }
    }
}
