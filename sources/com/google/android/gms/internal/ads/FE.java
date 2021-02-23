package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FE {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6806a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f6807b = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f6808c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1742gl<Boolean> f6809d = new C1742gl<>();

    /* renamed from: e  reason: collision with root package name */
    private final Context f6810e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<Context> f6811f;

    /* renamed from: g  reason: collision with root package name */
    private final C1555eD f6812g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Executor f6813h;
    private final Executor i;
    private final ScheduledExecutorService j;
    /* access modifiers changed from: private */
    public final C2265oE k;
    private final C1200Yk l;
    private Map<String, C3002yd> m = new ConcurrentHashMap();
    private boolean n = true;

    public FE(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, C1555eD eDVar, ScheduledExecutorService scheduledExecutorService, C2265oE oEVar, C1200Yk yk) {
        this.f6812g = eDVar;
        this.f6810e = context;
        this.f6811f = weakReference;
        this.f6813h = executor2;
        this.j = scheduledExecutorService;
        this.i = executor;
        this.k = oEVar;
        this.l = yk;
        this.f6808c = p.j().b();
        a("com.google.android.gms.ads.MobileAds", false, BuildConfig.FLAVOR, 0);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                C1742gl glVar = new C1742gl();
                LY a2 = DY.a(glVar, ((Long) Qqa.e().a(F.tb)).longValue(), TimeUnit.SECONDS, this.j);
                this.k.a(next);
                long b2 = p.j().b();
                Iterator<String> it = keys;
                ME me = r1;
                ME me2 = new ME(this, obj, glVar, next, b2);
                a2.a(me, this.f6813h);
                arrayList.add(a2);
                TE te = new TE(this, obj, next, b2, glVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", BuildConfig.FLAVOR);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, BuildConfig.FLAVOR));
                                }
                            }
                            arrayList2.add(new C0803Jd(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                a(next, false, BuildConfig.FLAVOR, 0);
                try {
                    this.i.execute(new OE(this, this.f6812g.a(next, new JSONObject()), te, arrayList2, next));
                } catch (WS unused2) {
                    try {
                        te.n("Failed to create Adapter.");
                    } catch (RemoteException e2) {
                        C1018Rk.b(BuildConfig.FLAVOR, e2);
                    }
                }
                keys = it;
            }
            DY.b(arrayList).a(new LE(this), this.f6813h);
        } catch (JSONException e3) {
            fa.e("Malformed CLD response", e3);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str, boolean z, String str2, int i2) {
        this.m.put(str, new C3002yd(str, z, i2, str2));
    }

    private final synchronized LY<String> g() {
        String c2 = p.g().i().m().c();
        if (!TextUtils.isEmpty(c2)) {
            return DY.a(c2);
        }
        C1742gl glVar = new C1742gl();
        p.g().i().a((Runnable) new KE(this, glVar));
        return glVar;
    }

    public final void a() {
        this.n = false;
    }

    public final void a(C0621Cd cd) {
        this.f6809d.a(new IE(this, cd), this.i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1742gl glVar) {
        this.f6813h.execute(new NE(this, glVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.C1018Rk.b(com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig.FLAVOR, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.n(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.C1925jT r2, com.google.android.gms.internal.ads.C0595Bd r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f6811f     // Catch:{ WS -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ WS -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ WS -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f6810e     // Catch:{ WS -> 0x0011 }
        L_0x000d:
            r2.a((android.content.Context) r0, (com.google.android.gms.internal.ads.C0595Bd) r3, (java.util.List<com.google.android.gms.internal.ads.C0803Jd>) r4)     // Catch:{ WS -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.n(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.C1018Rk.b(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FE.a(com.google.android.gms.internal.ads.jT, com.google.android.gms.internal.ads.Bd, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, C1742gl glVar, String str, long j2) {
        synchronized (obj) {
            if (!glVar.isDone()) {
                a(str, false, "Timeout.", (int) (p.j().b() - j2));
                this.k.a(str, "timeout");
                glVar.a(false);
            }
        }
    }

    public final void b() {
        if (((Boolean) Qqa.e().a(F.rb)).booleanValue() && !C0696Fa.f6863a.a().booleanValue()) {
            if (this.l.f9458c >= ((Integer) Qqa.e().a(F.sb)).intValue() && this.n) {
                if (!this.f6806a) {
                    synchronized (this) {
                        if (!this.f6806a) {
                            this.k.a();
                            this.f6809d.a(new HE(this), this.f6813h);
                            this.f6806a = true;
                            LY<String> g2 = g();
                            this.j.schedule(new JE(this), ((Long) Qqa.e().a(F.ub)).longValue(), TimeUnit.SECONDS);
                            DY.a(g2, new RE(this), this.f6813h);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f6806a) {
            a("com.google.android.gms.ads.MobileAds", true, BuildConfig.FLAVOR, 0);
            this.f6809d.a(false);
            this.f6806a = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(C0621Cd cd) {
        try {
            cd.c(c());
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final List<C3002yd> c() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.m.keySet()) {
            C3002yd ydVar = this.m.get(next);
            arrayList.add(new C3002yd(next, ydVar.f12936b, ydVar.f12937c, ydVar.f12938d));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d() {
        this.f6809d.a(true);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        synchronized (this) {
            if (!this.f6807b) {
                a("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (p.j().b() - this.f6808c));
                this.f6809d.a((Throwable) new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        this.k.b();
    }
}
