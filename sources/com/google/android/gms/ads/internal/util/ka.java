package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.m;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1252_k;
import com.google.android.gms.internal.ads.C2925xa;
import com.google.android.gms.internal.ads.C2945xk;
import com.google.android.gms.internal.ads.LY;
import com.google.android.gms.internal.ads.Lna;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ka implements ha {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5607a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f5608b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Runnable> f5609c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private LY<?> f5610d;

    /* renamed from: e  reason: collision with root package name */
    private Lna f5611e = null;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f5612f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences.Editor f5613g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5614h = false;
    private boolean i = true;
    private String j;
    private String k;
    private boolean l = false;
    private String m = BuildConfig.FLAVOR;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private int q = -1;
    private int r = 0;
    private Set<String> s = Collections.emptySet();
    private JSONObject t = new JSONObject();
    private boolean u = true;
    private boolean v = true;
    private String w = null;
    private int x = -1;

    private final void o() {
        LY<?> ly = this.f5610d;
        if (ly != null && !ly.isDone()) {
            try {
                this.f5610d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                C1018Rk.c("Interrupted while waiting for preferences loaded.", e2);
            } catch (CancellationException | ExecutionException | TimeoutException e3) {
                C1018Rk.b("Fail to initialize AdSharedPreferenceManager.", e3);
            }
        }
    }

    private final void p() {
        C1252_k.f9699a.execute(new ma(this));
    }

    public final void a(int i2) {
        o();
        synchronized (this.f5607a) {
            if (this.r != i2) {
                this.r = i2;
                if (this.f5613g != null) {
                    this.f5613g.putInt("version_code", i2);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    public final void a(long j2) {
        o();
        synchronized (this.f5607a) {
            if (this.o != j2) {
                this.o = j2;
                if (this.f5613g != null) {
                    this.f5613g.putLong("app_last_background_time_ms", j2);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f5607a) {
            this.f5612f = sharedPreferences;
            this.f5613g = edit;
            if (m.i() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.f5614h = z;
            this.i = this.f5612f.getBoolean("use_https", this.i);
            this.u = this.f5612f.getBoolean("content_url_opted_out", this.u);
            this.j = this.f5612f.getString("content_url_hashes", this.j);
            this.l = this.f5612f.getBoolean("auto_collect_location", this.l);
            this.v = this.f5612f.getBoolean("content_vertical_opted_out", this.v);
            this.k = this.f5612f.getString("content_vertical_hashes", this.k);
            this.r = this.f5612f.getInt("version_code", this.r);
            this.m = this.f5612f.getString("app_settings_json", this.m);
            this.n = this.f5612f.getLong("app_settings_last_update_ms", this.n);
            this.o = this.f5612f.getLong("app_last_background_time_ms", this.o);
            this.q = this.f5612f.getInt("request_in_session_count", this.q);
            this.p = this.f5612f.getLong("first_ad_req_time_ms", this.p);
            this.s = this.f5612f.getStringSet("never_pool_slots", this.s);
            this.w = this.f5612f.getString("display_cutout", this.w);
            this.x = this.f5612f.getInt("app_measurement_npa", this.x);
            try {
                this.t = new JSONObject(this.f5612f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                C1018Rk.c("Could not convert native advanced settings to json object", e2);
            }
            p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4.length() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = "admob__".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = new java.lang.String("admob__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2.f5610d = com.google.android.gms.internal.ads.C1252_k.f9699a.a((java.lang.Runnable) new com.google.android.gms.ads.internal.util.ja(r2, r3, r4));
        r2.f5608b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = "admob";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5607a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.f5612f     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0025
        L_0x000f:
            java.lang.String r0 = "admob__"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0025
        L_0x0020:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0025:
            com.google.android.gms.internal.ads.PY r0 = com.google.android.gms.internal.ads.C1252_k.f9699a
            com.google.android.gms.ads.internal.util.ja r1 = new com.google.android.gms.ads.internal.util.ja
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.LY r3 = r0.a((java.lang.Runnable) r1)
            r2.f5610d = r3
            r2.f5608b = r5
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.ka.a(android.content.Context, java.lang.String, boolean):void");
    }

    public final void a(Runnable runnable) {
        this.f5609c.add(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            r5.o()
            java.lang.Object r0 = r5.f5607a
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.p.j()     // Catch:{ all -> 0x0051 }
            long r1 = r1.a()     // Catch:{ all -> 0x0051 }
            r5.n = r1     // Catch:{ all -> 0x0051 }
            if (r6 == 0) goto L_0x004f
            java.lang.String r3 = r5.m     // Catch:{ all -> 0x0051 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x001b
            goto L_0x004f
        L_0x001b:
            r5.m = r6     // Catch:{ all -> 0x0051 }
            android.content.SharedPreferences$Editor r3 = r5.f5613g     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f5613g     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0051 }
            android.content.SharedPreferences$Editor r6 = r5.f5613g     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "app_settings_last_update_ms"
            r6.putLong(r3, r1)     // Catch:{ all -> 0x0051 }
            android.content.SharedPreferences$Editor r6 = r5.f5613g     // Catch:{ all -> 0x0051 }
            r6.apply()     // Catch:{ all -> 0x0051 }
        L_0x0034:
            r5.p()     // Catch:{ all -> 0x0051 }
            java.util.List<java.lang.Runnable> r6 = r5.f5609c     // Catch:{ all -> 0x0051 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0051 }
        L_0x003d:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004d
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0051 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0051 }
            r1.run()     // Catch:{ all -> 0x0051 }
            goto L_0x003d
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0054:
            throw r6
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.ka.a(java.lang.String):void");
    }

    public final void a(String str, String str2, boolean z) {
        o();
        synchronized (this.f5607a) {
            JSONArray optJSONArray = this.t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i2++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", p.j().a());
                optJSONArray.put(length, jSONObject);
                this.t.put(str, optJSONArray);
            } catch (JSONException e2) {
                C1018Rk.c("Could not update native advanced settings", e2);
            }
            if (this.f5613g != null) {
                this.f5613g.putString("native_advanced_settings", this.t.toString());
                this.f5613g.apply();
            }
            p();
        }
    }

    public final void a(boolean z) {
        o();
        synchronized (this.f5607a) {
            if (this.v != z) {
                this.v = z;
                if (this.f5613g != null) {
                    this.f5613g.putBoolean("content_vertical_opted_out", z);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    public final boolean a() {
        boolean z;
        o();
        synchronized (this.f5607a) {
            z = this.l;
        }
        return z;
    }

    public final String b() {
        String str;
        o();
        synchronized (this.f5607a) {
            str = this.k;
        }
        return str;
    }

    public final void b(int i2) {
        o();
        synchronized (this.f5607a) {
            if (this.q != i2) {
                this.q = i2;
                if (this.f5613g != null) {
                    this.f5613g.putInt("request_in_session_count", i2);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    public final void b(long j2) {
        o();
        synchronized (this.f5607a) {
            if (this.p != j2) {
                this.p = j2;
                if (this.f5613g != null) {
                    this.f5613g.putLong("first_ad_req_time_ms", j2);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    public final void b(String str) {
        o();
        synchronized (this.f5607a) {
            if (!TextUtils.equals(this.w, str)) {
                this.w = str;
                if (this.f5613g != null) {
                    this.f5613g.putString("display_cutout", str);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    public final void b(boolean z) {
        o();
        synchronized (this.f5607a) {
            if (this.u != z) {
                this.u = z;
                if (this.f5613g != null) {
                    this.f5613g.putBoolean("content_url_opted_out", z);
                    this.f5613g.apply();
                }
                p();
            }
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject;
        o();
        synchronized (this.f5607a) {
            jSONObject = this.t;
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r4) {
        /*
            r3 = this;
            r3.o()
            java.lang.Object r0 = r3.f5607a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0028
            java.lang.String r1 = r3.j     // Catch:{ all -> 0x002a }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0011
            goto L_0x0028
        L_0x0011:
            r3.j = r4     // Catch:{ all -> 0x002a }
            android.content.SharedPreferences$Editor r1 = r3.f5613g     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f5613g     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x002a }
            android.content.SharedPreferences$Editor r4 = r3.f5613g     // Catch:{ all -> 0x002a }
            r4.apply()     // Catch:{ all -> 0x002a }
        L_0x0023:
            r3.p()     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.ka.c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.String r4) {
        /*
            r3 = this;
            r3.o()
            java.lang.Object r0 = r3.f5607a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0028
            java.lang.String r1 = r3.k     // Catch:{ all -> 0x002a }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0011
            goto L_0x0028
        L_0x0011:
            r3.k = r4     // Catch:{ all -> 0x002a }
            android.content.SharedPreferences$Editor r1 = r3.f5613g     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f5613g     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x002a }
            android.content.SharedPreferences$Editor r4 = r3.f5613g     // Catch:{ all -> 0x002a }
            r4.apply()     // Catch:{ all -> 0x002a }
        L_0x0023:
            r3.p()     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.ka.d(java.lang.String):void");
    }

    public final boolean d() {
        boolean z;
        o();
        synchronized (this.f5607a) {
            z = this.v;
        }
        return z;
    }

    public final long e() {
        long j2;
        o();
        synchronized (this.f5607a) {
            j2 = this.p;
        }
        return j2;
    }

    public final String f() {
        String str;
        o();
        synchronized (this.f5607a) {
            str = this.j;
        }
        return str;
    }

    public final int g() {
        int i2;
        o();
        synchronized (this.f5607a) {
            i2 = this.q;
        }
        return i2;
    }

    public final String h() {
        String str;
        o();
        synchronized (this.f5607a) {
            str = this.w;
        }
        return str;
    }

    public final boolean i() {
        boolean z;
        o();
        synchronized (this.f5607a) {
            z = this.u;
        }
        return z;
    }

    public final long j() {
        long j2;
        o();
        synchronized (this.f5607a) {
            j2 = this.o;
        }
        return j2;
    }

    public final void k() {
        o();
        synchronized (this.f5607a) {
            this.t = new JSONObject();
            if (this.f5613g != null) {
                this.f5613g.remove("native_advanced_settings");
                this.f5613g.apply();
            }
            p();
        }
    }

    public final Lna l() {
        if (!this.f5608b) {
            return null;
        }
        if ((i() && d()) || !C2925xa.f12772b.a().booleanValue()) {
            return null;
        }
        synchronized (this.f5607a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f5611e == null) {
                this.f5611e = new Lna();
            }
            this.f5611e.b();
            C1018Rk.c("start fetching content...");
            Lna lna = this.f5611e;
            return lna;
        }
    }

    public final C2945xk m() {
        C2945xk xkVar;
        o();
        synchronized (this.f5607a) {
            xkVar = new C2945xk(this.m, this.n);
        }
        return xkVar;
    }

    public final int n() {
        int i2;
        o();
        synchronized (this.f5607a) {
            i2 = this.r;
        }
        return i2;
    }
}
