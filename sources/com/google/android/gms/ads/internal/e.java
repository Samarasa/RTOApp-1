package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1200Yk;
import com.google.android.gms.internal.ads.C1220Ze;
import com.google.android.gms.internal.ads.C1252_k;
import com.google.android.gms.internal.ads.C1376bf;
import com.google.android.gms.internal.ads.C1447cf;
import com.google.android.gms.internal.ads.C1459cl;
import com.google.android.gms.internal.ads.C1730gf;
import com.google.android.gms.internal.ads.C2945xk;
import com.google.android.gms.internal.ads.DY;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.LY;
import com.google.android.gms.internal.ads.Qqa;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f5446a;

    /* renamed from: b  reason: collision with root package name */
    private long f5447b = 0;

    private final void a(Context context, C1200Yk yk, boolean z, C2945xk xkVar, String str, String str2, Runnable runnable) {
        if (p.j().b() - this.f5447b < 5000) {
            C1018Rk.d("Not retrying to fetch app settings");
            return;
        }
        this.f5447b = p.j().b();
        boolean z2 = true;
        if (xkVar != null) {
            if (!(p.j().a() - xkVar.a() > ((Long) Qqa.e().a(F.Bc)).longValue()) && xkVar.b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                C1018Rk.d("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f5446a = applicationContext;
                C1730gf b2 = p.p().b(this.f5446a, yk);
                C1447cf<JSONObject> cfVar = C1376bf.f9933b;
                C1220Ze<I, O> a2 = b2.a("google.afma.config.fetchAppSettings", cfVar, cfVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    LY<O> b3 = a2.b(jSONObject);
                    LY<O> a3 = DY.a(b3, d.f5445a, (Executor) C1252_k.f9704f);
                    if (runnable != null) {
                        b3.a(runnable, C1252_k.f9704f);
                    }
                    C1459cl.a(a3, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e2) {
                    C1018Rk.b("Error requesting application settings", e2);
                }
            } else {
                C1018Rk.d("App settings could not be fetched. Required parameters missing");
            }
        }
    }

    public final void a(Context context, C1200Yk yk, String str, C2945xk xkVar) {
        a(context, yk, false, xkVar, xkVar != null ? xkVar.d() : null, str, (Runnable) null);
    }

    public final void a(Context context, C1200Yk yk, String str, Runnable runnable) {
        a(context, yk, true, (C2945xk) null, str, (String) null, runnable);
    }
}
