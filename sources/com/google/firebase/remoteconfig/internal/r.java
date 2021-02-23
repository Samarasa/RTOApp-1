package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c.b.e.C0480e;
import c.b.e.n;
import com.google.firebase.remoteconfig.a.b;
import com.google.firebase.remoteconfig.a.h;
import com.google.firebase.remoteconfig.a.j;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.o;
import e.a.a.d;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f14776a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final ThreadLocal<DateFormat> f14777b = new q();

    /* renamed from: c  reason: collision with root package name */
    private final Context f14778c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14779d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f14780e;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private h f14781a;

        /* renamed from: b  reason: collision with root package name */
        private h f14782b;

        /* renamed from: c  reason: collision with root package name */
        private h f14783c;

        private a() {
        }

        /* synthetic */ a(q qVar) {
            this();
        }

        /* access modifiers changed from: private */
        public h a() {
            return this.f14782b;
        }

        /* access modifiers changed from: private */
        public void a(h hVar) {
            this.f14782b = hVar;
        }

        /* access modifiers changed from: private */
        public h b() {
            return this.f14783c;
        }

        /* access modifiers changed from: private */
        public void b(h hVar) {
            this.f14783c = hVar;
        }

        /* access modifiers changed from: private */
        public h c() {
            return this.f14781a;
        }

        /* access modifiers changed from: private */
        public void c(h hVar) {
            this.f14781a = hVar;
        }
    }

    public r(Context context, String str) {
        this.f14778c = context;
        this.f14779d = str;
        this.f14780e = context.getSharedPreferences("com.google.firebase.remoteconfig_legacy_settings", 0);
    }

    private d a(C0480e eVar) {
        try {
            C0480e.d it = eVar.iterator();
            byte[] bArr = new byte[eVar.size()];
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = ((Byte) it.next()).byteValue();
            }
            return d.a(bArr);
        } catch (n e2) {
            Log.d("FirebaseRemoteConfig", "Payload was not defined or could not be deserialized.", e2);
            return null;
        }
    }

    private Map<String, h> a(b bVar) {
        HashMap hashMap = new HashMap();
        Date date = new Date(bVar.l());
        JSONArray b2 = b(bVar.j());
        for (h next : bVar.k()) {
            String j = next.j();
            if (j.startsWith("configns:")) {
                j = j.substring(9);
            }
            h.a e2 = h.e();
            e2.a(a(next.i()));
            e2.a(date);
            if (j.equals("firebase")) {
                e2.a(b2);
            }
            try {
                hashMap.put(j, e2.a());
            } catch (JSONException unused) {
                Log.d("FirebaseRemoteConfig", "A set of legacy configs could not be converted.");
            }
        }
        return hashMap;
    }

    private Map<String, String> a(List<com.google.firebase.remoteconfig.a.d> list) {
        HashMap hashMap = new HashMap();
        for (com.google.firebase.remoteconfig.a.d next : list) {
            hashMap.put(next.i(), next.j().a(f14776a));
        }
        return hashMap;
    }

    private JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("experimentId", dVar.i());
        jSONObject.put("variantId", dVar.n());
        jSONObject.put("experimentStartTime", f14777b.get().format(new Date(dVar.j())));
        jSONObject.put("triggerEvent", dVar.l());
        jSONObject.put("triggerTimeoutMillis", dVar.m());
        jSONObject.put("timeToLiveMillis", dVar.k());
        return jSONObject;
    }

    private void a(Map<String, a> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            a aVar = (a) next.getValue();
            f a2 = a(str, "fetch");
            f a3 = a(str, "activate");
            f a4 = a(str, "defaults");
            if (aVar.c() != null) {
                a2.a(aVar.c());
            }
            if (aVar.a() != null) {
                a3.a(aVar.a());
            }
            if (aVar.b() != null) {
                a4.a(aVar.b());
            }
        }
    }

    private Map<String, a> b() {
        j c2 = c();
        HashMap hashMap = new HashMap();
        if (c2 == null) {
            return hashMap;
        }
        Map<String, h> a2 = a(c2.i());
        Map<String, h> a3 = a(c2.k());
        Map<String, h> a4 = a(c2.j());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(a2.keySet());
        hashSet.addAll(a3.keySet());
        hashSet.addAll(a4.keySet());
        for (String str : hashSet) {
            a aVar = new a((q) null);
            if (a2.containsKey(str)) {
                aVar.a(a2.get(str));
            }
            if (a3.containsKey(str)) {
                aVar.c(a3.get(str));
            }
            if (a4.containsKey(str)) {
                aVar.b(a4.get(str));
            }
            hashMap.put(str, aVar);
        }
        return hashMap;
    }

    private JSONArray b(List<C0480e> list) {
        JSONArray jSONArray = new JSONArray();
        for (C0480e a2 : list) {
            d a3 = a(a2);
            if (a3 != null) {
                try {
                    jSONArray.put(a(a3));
                } catch (JSONException e2) {
                    Log.d("FirebaseRemoteConfig", "A legacy ABT experiment could not be parsed.", e2);
                }
            }
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0031 A[SYNTHETIC, Splitter:B:24:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0043 A[SYNTHETIC, Splitter:B:35:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004f A[SYNTHETIC, Splitter:B:42:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.firebase.remoteconfig.a.j c() {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close persisted config file."
            java.lang.String r1 = "FirebaseRemoteConfig"
            android.content.Context r2 = r7.f14778c
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            java.lang.String r4 = "persisted_config"
            java.io.FileInputStream r2 = r2.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x003a, IOException -> 0x0028, all -> 0x0023 }
            com.google.firebase.remoteconfig.a.j r3 = com.google.firebase.remoteconfig.a.j.a(r2)     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x001f }
            if (r2 == 0) goto L_0x001e
            r2.close()     // Catch:{ IOException -> 0x001a }
            goto L_0x001e
        L_0x001a:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x001e:
            return r3
        L_0x001f:
            r4 = move-exception
            goto L_0x002a
        L_0x0021:
            r4 = move-exception
            goto L_0x003c
        L_0x0023:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x004d
        L_0x0028:
            r4 = move-exception
            r2 = r3
        L_0x002a:
            java.lang.String r5 = "Cannot initialize from persisted config."
            android.util.Log.d(r1, r5, r4)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x0039:
            return r3
        L_0x003a:
            r4 = move-exception
            r2 = r3
        L_0x003c:
            java.lang.String r5 = "Persisted config file was not found."
            android.util.Log.d(r1, r5, r4)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x004b:
            return r3
        L_0x004c:
            r3 = move-exception
        L_0x004d:
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x0057:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.r.c():com.google.firebase.remoteconfig.a.j");
    }

    /* access modifiers changed from: package-private */
    public f a(String str, String str2) {
        return o.a(this.f14778c, this.f14779d, str, str2);
    }

    public boolean a() {
        if (!this.f14780e.getBoolean("save_legacy_configs", true)) {
            return false;
        }
        a(b());
        this.f14780e.edit().putBoolean("save_legacy_configs", false).commit();
        return true;
    }
}
