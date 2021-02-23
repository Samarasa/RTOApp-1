package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0502h;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Op  reason: case insensitive filesystem */
public final class C0945Op extends C2818vra {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8152a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f8153b;

    /* renamed from: c  reason: collision with root package name */
    private final C1555eD f8154c;

    /* renamed from: d  reason: collision with root package name */
    private final C2906xH<C1925jT, C2340pI> f8155d;

    /* renamed from: e  reason: collision with root package name */
    private final C2696uK f8156e;

    /* renamed from: f  reason: collision with root package name */
    private final FE f8157f;

    /* renamed from: g  reason: collision with root package name */
    private final C1017Rj f8158g;

    /* renamed from: h  reason: collision with root package name */
    private final C1697gD f8159h;
    private boolean i = false;

    C0945Op(Context context, C1200Yk yk, C1555eD eDVar, C2906xH<C1925jT, C2340pI> xHVar, C2696uK uKVar, FE fe, C1017Rj rj, C1697gD gDVar) {
        this.f8152a = context;
        this.f8153b = yk;
        this.f8154c = eDVar;
        this.f8155d = xHVar;
        this.f8156e = uKVar;
        this.f8157f = fe;
        this.f8158g = rj;
        this.f8159h = gDVar;
    }

    public final void B(String str) {
        this.f8156e.a(str);
    }

    public final void Fa() {
        this.f8157f.a();
    }

    public final List<C3002yd> Ta() {
        return this.f8157f.c();
    }

    public final synchronized void a(float f2) {
        p.h().a(f2);
    }

    public final void a(a aVar, String str) {
        if (aVar == null) {
            C1018Rk.b("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.Q(aVar);
        if (context == null) {
            C1018Rk.b("Context is null. Failed to open debug menu.");
            return;
        }
        C0502h hVar = new C0502h(context);
        hVar.a(str);
        hVar.b(this.f8153b.f9456a);
        hVar.a();
    }

    public final void a(C0621Cd cd) {
        this.f8157f.a(cd);
    }

    public final void a(C0675Ef ef) {
        this.f8154c.a(ef);
    }

    public final void a(C1551e eVar) {
        this.f8158g.a(this.f8152a, eVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        C0563t.a("Adapters must be initialized on the main thread.");
        Map<String, C0649Df> e2 = p.g().i().m().e();
        if (e2 != null && !e2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C1018Rk.c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f8154c.a()) {
                HashMap hashMap = new HashMap();
                for (C0649Df df : e2.values()) {
                    for (C0571Af next : df.f6580a) {
                        String str = next.k;
                        for (String next2 : next.f6152c) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        C2693uH<C1925jT, C2340pI> a2 = this.f8155d.a(str2, jSONObject);
                        if (a2 != null) {
                            C1925jT jTVar = (C1925jT) a2.f12306b;
                            if (!jTVar.d()) {
                                if (jTVar.k()) {
                                    jTVar.a(this.f8152a, (C1455cj) (C2340pI) a2.f12307c, (List<String>) (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    C1018Rk.a(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (WS e3) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        C1018Rk.c(sb.toString(), e3);
                    }
                }
            }
        }
    }

    public final void b(String str, a aVar) {
        String str2;
        F.a(this.f8152a);
        if (((Boolean) Qqa.e().a(F.Ac)).booleanValue()) {
            p.c();
            str2 = oa.n(this.f8152a);
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) Qqa.e().a(F.yc)).booleanValue() | ((Boolean) Qqa.e().a(F.ta)).booleanValue();
            C0919Np np = null;
            if (((Boolean) Qqa.e().a(F.ta)).booleanValue()) {
                booleanValue = true;
                np = new C0919Np(this, (Runnable) b.Q(aVar));
            }
            if (booleanValue) {
                p.k().a(this.f8152a, this.f8153b, str, (Runnable) np);
            }
        }
    }

    public final synchronized boolean fb() {
        return p.h().b();
    }

    public final synchronized void g(boolean z) {
        p.h().a(z);
    }

    public final String hb() {
        return this.f8153b.f9456a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void p() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.i     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.internal.ads.C1018Rk.d(r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)
            return
        L_0x000c:
            android.content.Context r0 = r3.f8152a     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.F.a(r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.ads.internal.p.g()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.f8152a     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.Yk r2 = r3.f8153b     // Catch:{ all -> 0x005d }
            r0.a((android.content.Context) r1, (com.google.android.gms.internal.ads.C1200Yk) r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.woa r0 = com.google.android.gms.ads.internal.p.i()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.f8152a     // Catch:{ all -> 0x005d }
            r0.a((android.content.Context) r1)     // Catch:{ all -> 0x005d }
            r0 = 1
            r3.i = r0     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.FE r0 = r3.f8157f     // Catch:{ all -> 0x005d }
            r0.b()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.lb     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.uK r0 = r3.f8156e     // Catch:{ all -> 0x005d }
            r0.a()     // Catch:{ all -> 0x005d }
        L_0x0044:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.zc     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.gD r0 = r3.f8159h     // Catch:{ all -> 0x005d }
            r0.a()     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r3)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0945Op.p():void");
    }

    public final synchronized float pb() {
        return p.h().a();
    }

    public final synchronized void z(String str) {
        F.a(this.f8152a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) Qqa.e().a(F.yc)).booleanValue()) {
                p.k().a(this.f8152a, this.f8153b, str, (Runnable) null);
            }
        }
    }
}
