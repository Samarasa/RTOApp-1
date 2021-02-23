package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.u  reason: case insensitive filesystem */
final class C3333u {

    /* renamed from: a  reason: collision with root package name */
    private static final long f14604a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b  reason: collision with root package name */
    final String f14605b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14606c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14607d;

    private C3333u(String str, String str2, long j) {
        this.f14605b = str;
        this.f14606c = str2;
        this.f14607d = j;
    }

    static C3333u a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C3333u(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C3333u(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static String a(C3333u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar.f14605b;
    }

    static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        return System.currentTimeMillis() > this.f14607d + f14604a || !str.equals(this.f14606c);
    }
}
