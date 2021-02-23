package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.w  reason: case insensitive filesystem */
final class C2827w extends C2331p<String> {
    C2827w(int i, String str, String str2) {
        super(1, str, str2, (C2543s) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(a(), (String) c());
    }

    public final /* synthetic */ Object a(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (String) c();
        }
        String valueOf2 = String.valueOf(a());
        return bundle.getString(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(a(), (String) c());
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(a(), (String) obj);
    }
}
