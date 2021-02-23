package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.t  reason: case insensitive filesystem */
final class C2614t extends C2331p<Float> {
    C2614t(int i, String str, Float f2) {
        super(1, str, f2, (C2543s) null);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(a(), ((Float) c()).floatValue()));
    }

    public final /* synthetic */ Object a(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) c();
        }
        String valueOf2 = String.valueOf(a());
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(a(), (double) ((Float) c()).floatValue()));
    }

    public final /* synthetic */ void a(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(a(), ((Float) obj).floatValue());
    }
}
