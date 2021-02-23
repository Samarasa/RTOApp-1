package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.S;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bc  reason: case insensitive filesystem */
public final class C0594Bc {

    /* renamed from: a  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6318a = C0672Ec.f6718a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6319b = C0646Dc.f6573a;

    /* renamed from: c  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6320c = C0724Gc.f7043a;

    /* renamed from: d  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6321d = C0698Fc.f6873a;

    /* renamed from: e  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6322e = new C0828Kc();

    /* renamed from: f  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6323f = new C0880Mc();

    /* renamed from: g  reason: collision with root package name */
    public static final C1088Uc<C2313on> f6324g = C0776Ic.f7306a;

    /* renamed from: h  reason: collision with root package name */
    public static final C1088Uc<Object> f6325h = new C0854Lc();
    public static final C1088Uc<C2313on> i = new C0932Oc();
    public static final C1088Uc<C2313on> j = C0750Hc.f7160a;
    public static final C1088Uc<C2313on> k = new C0906Nc();
    public static final C1088Uc<C2313on> l = new C0984Qc();
    public static final C1088Uc<C1175Xl> m = new C0812Jm();
    public static final C1088Uc<C1175Xl> n = new C0890Mm();
    public static final C1088Uc<C2313on> o = new C0620Cc();
    public static final C1584ed p = new C1584ed();
    public static final C1088Uc<C2313on> q = new C0958Pc();
    public static final C1088Uc<C2313on> r = new C1036Sc();
    public static final C1088Uc<C2313on> s = new C1010Rc();
    public static final C1088Uc<C2313on> t = new C0802Jc();

    public static <T extends C1021Rn & C1255_n & C1394bo> String a(T t2, String str) {
        Uri parse = Uri.parse(str);
        try {
            Qba G = ((C1255_n) t2).G();
            if (G != null && G.a(parse)) {
                parse = G.a(parse, t2.getContext(), ((C1394bo) t2).getView(), t2.f());
            }
        } catch (C2506rda unused) {
            String valueOf = String.valueOf(str);
            C1018Rk.d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        return C1740gk.a(parse, t2.getContext());
    }

    static final /* synthetic */ void a(C1021Rn rn, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C1018Rk.d("URL missing from httpTrack GMSG.");
        } else {
            new S(rn.getContext(), ((C1229Zn) rn).B().f9456a, str).b();
        }
    }

    static final /* synthetic */ void a(C1255_n _nVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            Qba G = _nVar.G();
            if (G != null) {
                G.a().a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            C1018Rk.d("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.Rn, com.google.android.gms.internal.ads.dn] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void a(com.google.android.gms.internal.ads.C1534dn r2, java.util.Map r3) {
        /*
            java.lang.String r0 = "u"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0010
            java.lang.String r2 = "URL missing from click GMSG."
            com.google.android.gms.internal.ads.C1018Rk.d(r2)
            return
        L_0x0010:
            java.lang.String r3 = a(r2, (java.lang.String) r3)
            com.google.android.gms.ads.internal.util.S r0 = new com.google.android.gms.ads.internal.util.S
            r1 = r2
            com.google.android.gms.internal.ads.Rn r1 = (com.google.android.gms.internal.ads.C1021Rn) r1
            android.content.Context r1 = r1.getContext()
            com.google.android.gms.internal.ads.Zn r2 = (com.google.android.gms.internal.ads.C1229Zn) r2
            com.google.android.gms.internal.ads.Yk r2 = r2.B()
            java.lang.String r2 = r2.f9456a
            r0.<init>(r1, r2, r3)
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0594Bc.a(com.google.android.gms.internal.ads.dn, java.util.Map):void");
    }

    static final /* synthetic */ void b(C1021Rn rn, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = rn.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                URISyntaxException uRISyntaxException = e2;
                                String valueOf = String.valueOf(optString7);
                                C1018Rk.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e3) {
                            jSONException = e3;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        str = "Error parsing the intent data.";
                        C1018Rk.b(str, jSONException);
                    }
                }
                ((C1141Wd) rn).a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((C1141Wd) rn).a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((C1141Wd) rn).a("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void c(C1021Rn rn, Map map) {
        if (!((Boolean) Qqa.e().a(F.Af)).booleanValue()) {
            C1018Rk.d("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            C1018Rk.d("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Boolean.valueOf(rn.getContext().getPackageManager().getLaunchIntentForPackage(str) != null));
        ((C1141Wd) rn).a("openableApp", (Map<String, ?>) hashMap);
    }

    static final /* synthetic */ void d(C1021Rn rn, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C1018Rk.d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = rn.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((C1141Wd) rn).a("openableURLs", (Map<String, ?>) hashMap);
    }
}
