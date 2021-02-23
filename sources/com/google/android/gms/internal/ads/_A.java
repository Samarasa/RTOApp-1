package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class _A {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9613a;

    /* renamed from: b  reason: collision with root package name */
    private final RA f9614b;

    /* renamed from: c  reason: collision with root package name */
    private final Qba f9615c;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f9616d;

    /* renamed from: e  reason: collision with root package name */
    private final b f9617e;

    /* renamed from: f  reason: collision with root package name */
    private final Soa f9618f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f9619g;

    /* renamed from: h  reason: collision with root package name */
    private final C1368bb f9620h;
    private final C2545sB i;
    private final ScheduledExecutorService j;

    public _A(Context context, RA ra, Qba qba, C1200Yk yk, b bVar, Soa soa, Executor executor, SS ss, C2545sB sBVar, ScheduledExecutorService scheduledExecutorService) {
        this.f9613a = context;
        this.f9614b = ra;
        this.f9615c = qba;
        this.f9616d = yk;
        this.f9617e = bVar;
        this.f9618f = soa;
        this.f9619g = executor;
        this.f9620h = ss.i;
        this.i = sBVar;
        this.j = scheduledExecutorService;
    }

    private static <T> LY<T> a(LY<T> ly, T t) {
        return DY.a(ly, Exception.class, new C1624fB((Object) null), (Executor) C1252_k.f9704f);
    }

    private final LY<List<C1190Ya>> a(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return DY.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(a(jSONArray.optJSONObject(i2), z));
        }
        return DY.a(DY.a(arrayList), ZA.f9515a, this.f9619g);
    }

    private final LY<C1190Ya> a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return DY.a(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return DY.a(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return DY.a(new C1190Ya((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return a(jSONObject.optBoolean("require"), DY.a(this.f9614b.a(optString, optDouble, optBoolean), new C1341bB(optString, optDouble, optInt, optInt2), this.f9619g), (Object) null);
    }

    private static <T> LY<T> a(boolean z, LY<T> ly, T t) {
        return z ? DY.a(ly, new C1553eB(ly), (Executor) C1252_k.f9704f) : a(ly, (Object) null);
    }

    public static List<ksa> a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return C2709uX.i();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return C2709uX.i();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            ksa d2 = d(optJSONArray.optJSONObject(i2));
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return C2709uX.a(arrayList);
    }

    public static ksa b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return d(optJSONObject);
    }

    private static ksa d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new ksa(optString, optString2);
    }

    private static Integer d(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(String str, Object obj) {
        p.d();
        C2313on a2 = C2951xn.a(this.f9613a, C1819ho.b(), "native-omid", false, false, this.f9615c, (C1862ia) null, this.f9616d, (T) null, (k) null, this.f9617e, this.f9618f, (C2670toa) null, false, (C2988yS) null, (DS) null);
        C1813hl c2 = C1813hl.c(a2);
        a2.t().a((Cdo) new C2191nB(c2));
        a2.loadData(str, "text/html", "UTF-8");
        return c2;
    }

    public final LY<C1190Ya> a(JSONObject jSONObject, String str) {
        return a(jSONObject.optJSONObject(str), this.f9620h.f9910b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1060Ta a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer d2 = d(jSONObject, "bg_color");
        Integer d3 = d(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new C1060Ta(optString, list, d2, d3, num, optInt3 + optInt2, this.f9620h.f9913e, optBoolean);
    }

    public final LY<List<C1190Ya>> b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        C1368bb bbVar = this.f9620h;
        return a(optJSONArray, bbVar.f9910b, bbVar.f9912d);
    }

    public final LY<C2313on> c(JSONObject jSONObject) {
        JSONObject a2 = M.a(jSONObject, "html_containers", "instream");
        if (a2 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return DY.a(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                C1018Rk.d("Required field 'vast_xml' is missing");
                return DY.a(null);
            }
            return a(DY.a(this.i.a(optJSONObject), (long) ((Integer) Qqa.e().a(F.gc)).intValue(), TimeUnit.SECONDS, this.j), (Object) null);
        }
        LY<C2313on> a3 = this.i.a(a2.optString("base_url"), a2.optString("html"));
        return DY.a(a3, new C1412cB(a3), (Executor) C1252_k.f9704f);
    }

    public final LY<C1060Ta> c(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return DY.a(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return a(optJSONObject.optBoolean("require"), DY.a(a(optJSONArray, false, true), new C1270aB(this, optJSONObject), this.f9619g), (Object) null);
    }
}
