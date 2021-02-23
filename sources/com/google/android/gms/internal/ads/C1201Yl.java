package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yl  reason: case insensitive filesystem */
public final class C1201Yl {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9468a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9469b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9470c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9471d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9472e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9473f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9474g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9475h;
    public final int i;
    public final boolean j;
    public final int k;

    public C1201Yl(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f9468a = a(jSONObject, "aggressive_media_codec_release", F.B);
        this.f9469b = b(jSONObject, "byte_buffer_precache_limit", F.j);
        this.f9470c = b(jSONObject, "exo_cache_buffer_size", F.q);
        this.f9471d = b(jSONObject, "exo_connect_timeout_millis", F.f6791f);
        this.f9472e = c(jSONObject, "exo_player_version", F.f6790e);
        this.f9473f = b(jSONObject, "exo_read_timeout_millis", F.f6792g);
        this.f9474g = b(jSONObject, "load_check_interval_bytes", F.f6793h);
        this.f9475h = b(jSONObject, "player_precache_limit", F.i);
        this.i = b(jSONObject, "socket_receive_buffer_size", F.k);
        this.j = a(jSONObject, "use_cache_data_source", F.Lc);
        this.k = b(jSONObject, "min_retry_count", F.m);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.p<java.lang.Boolean>, com.google.android.gms.internal.ads.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.C2331p<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.B r0 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r3 = r0.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = a((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1201Yl.a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.p):boolean");
    }

    private static boolean a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.p<java.lang.Integer>, com.google.android.gms.internal.ads.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C2331p<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.B r0 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r0.a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1201Yl.b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.p):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.p, com.google.android.gms.internal.ads.p<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C2331p<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.B r0 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r0.a(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1201Yl.c(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.p):java.lang.String");
    }
}
