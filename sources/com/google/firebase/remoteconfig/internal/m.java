package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.json.JSONException;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f14761a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f14762b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: c  reason: collision with root package name */
    static final Pattern f14763c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: d  reason: collision with root package name */
    private final f f14764d;

    /* renamed from: e  reason: collision with root package name */
    private final f f14765e;

    public m(f fVar, f fVar2) {
        this.f14764d = fVar;
        this.f14765e = fVar2;
    }

    private static h a(f fVar) {
        return fVar.c();
    }

    private static String a(f fVar, String str) {
        h a2 = a(fVar);
        if (a2 == null) {
            return null;
        }
        try {
            return a2.c().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void a(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    public String a(String str) {
        String a2 = a(this.f14764d, str);
        if (a2 != null) {
            return a2;
        }
        String a3 = a(this.f14765e, str);
        if (a3 != null) {
            return a3;
        }
        a(str, "String");
        return BuildConfig.FLAVOR;
    }
}
