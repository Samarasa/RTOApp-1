package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import c.b.b.b.b.j;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Di  reason: case insensitive filesystem */
public final class C0652Di extends C0704Fi {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6604a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f6605b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f6606c;

    /* renamed from: d  reason: collision with root package name */
    private final C1220Ze<JSONObject, JSONObject> f6607d;

    public C0652Di(Context context, C1220Ze<JSONObject, JSONObject> ze) {
        this.f6605b = context.getApplicationContext();
        this.f6607d = ze;
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", C1200Yk.g().f9456a);
            jSONObject.put("mf", C0670Ea.f6710a.a());
            jSONObject.put("cl", "334274230");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", j.f3888a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final LY<Void> a() {
        synchronized (this.f6604a) {
            if (this.f6606c == null) {
                this.f6606c = this.f6605b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (p.j().a() - this.f6606c.getLong("js_last_update", 0) < C0670Ea.f6711b.a().longValue()) {
            return DY.a(null);
        }
        return DY.a(this.f6607d.b(a(this.f6605b)), new C0626Ci(this), (Executor) C1252_k.f9704f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(JSONObject jSONObject) {
        F.a(this.f6605b, 1, jSONObject);
        this.f6606c.edit().putLong("js_last_update", p.j().a()).apply();
        return null;
    }
}
