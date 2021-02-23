package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lG  reason: case insensitive filesystem */
public final class C2054lG extends C1807hi {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11146a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11147b;

    /* renamed from: c  reason: collision with root package name */
    private final C0678Ei f11148c;

    /* renamed from: d  reason: collision with root package name */
    private final C0704Fi f11149d;

    /* renamed from: e  reason: collision with root package name */
    private final C1681fq f11150e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, C2905xG> f11151f;

    public C2054lG(Context context, Executor executor, C0678Ei ei, C1681fq fqVar, C0704Fi fi, HashMap<String, C2905xG> hashMap) {
        F.a(context);
        this.f11146a = context;
        this.f11147b = executor;
        this.f11148c = ei;
        this.f11149d = fi;
        this.f11150e = fqVar;
        this.f11151f = hashMap;
    }

    private static LY<C2941xi> a(LY<JSONObject> ly, VU vu, C1730gf gfVar) {
        return vu.a(SU.BUILD_URL, ly).a(gfVar.a("AFMA_getAdDictionary", C1376bf.f9933b, C2550sG.f12067a)).a();
    }

    private static LY<JSONObject> a(C2515ri riVar, VU vu, C1355bP bPVar) {
        C2338pG pGVar = new C2338pG(bPVar);
        return vu.a(SU.GMS_SIGNALS, DY.a(riVar.f12015a)).a(pGVar).a(C2267oG.f11570a).a();
    }

    private final void a(LY<InputStream> ly, C2090li liVar) {
        DY.a(DY.a(ly, new C2834wG(this), (Executor) C1252_k.f9699a), new C2976yG(this, liVar), (Executor) C1252_k.f9704f);
    }

    public final LY<InputStream> D(String str) {
        if (!C0774Ia.f7301a.a().booleanValue()) {
            return DY.a((Throwable) new Exception("Split request is disabled."));
        }
        C2763vG vGVar = new C2763vG(this);
        if (this.f11151f.remove(str) != null) {
            return DY.a(vGVar);
        }
        String valueOf = String.valueOf(str);
        return DY.a((Throwable) new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Zb() {
        C1459cl.a(this.f11149d.a(), "persistFlags");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.LY<java.io.InputStream> a(com.google.android.gms.internal.ads.C2515ri r11, int r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.Ye r0 = com.google.android.gms.ads.internal.p.p()
            android.content.Context r1 = r10.f11146a
            com.google.android.gms.internal.ads.Yk r2 = com.google.android.gms.internal.ads.C1200Yk.g()
            com.google.android.gms.internal.ads.gf r0 = r0.a(r1, r2)
            com.google.android.gms.internal.ads.fq r1 = r10.f11150e
            com.google.android.gms.internal.ads.bP r1 = r1.a(r11, r12)
            com.google.android.gms.internal.ads._e<com.google.android.gms.internal.ads.AG> r2 = com.google.android.gms.internal.ads.AG.f6091a
            com.google.android.gms.internal.ads.af<java.io.InputStream> r3 = com.google.android.gms.internal.ads.C1376bf.f9934c
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.Ze r2 = r0.a(r4, r2, r3)
            com.google.android.gms.internal.ads.BG r9 = new com.google.android.gms.internal.ads.BG
            android.content.Context r4 = r10.f11146a
            com.google.android.gms.internal.ads.Yk r3 = r11.f12016b
            java.lang.String r5 = r3.f9456a
            com.google.android.gms.internal.ads.Ei r6 = r10.f11148c
            java.lang.String r7 = r11.f12021g
            r3 = r9
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.VU r12 = r1.c()
            com.google.android.gms.internal.ads.pa<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C0774Ia.f7301a
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = r11.k
            if (r3 == 0) goto L_0x006c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x006c
            java.lang.String r3 = "Request contained a PoolKey but split request is disabled."
        L_0x004e:
            com.google.android.gms.ads.internal.util.fa.f(r3)
            goto L_0x006c
        L_0x0052:
            java.lang.String r3 = r11.k
            if (r3 == 0) goto L_0x006c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x006c
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.ads.xG> r3 = r10.f11151f
            java.lang.String r4 = r11.k
            java.lang.Object r3 = r3.remove(r4)
            r4 = r3
            com.google.android.gms.internal.ads.xG r4 = (com.google.android.gms.internal.ads.C2905xG) r4
            if (r4 != 0) goto L_0x006c
            java.lang.String r3 = "Request contained a PoolKey but no matching parameters were found."
            goto L_0x004e
        L_0x006c:
            r3 = 1
            r5 = 0
            r6 = 2
            if (r4 != 0) goto L_0x00b7
            com.google.android.gms.internal.ads.LY r11 = a((com.google.android.gms.internal.ads.C2515ri) r11, (com.google.android.gms.internal.ads.VU) r12, (com.google.android.gms.internal.ads.C1355bP) r1)
            com.google.android.gms.internal.ads.LY r0 = a((com.google.android.gms.internal.ads.LY<org.json.JSONObject>) r11, (com.google.android.gms.internal.ads.VU) r12, (com.google.android.gms.internal.ads.C1730gf) r0)
            com.google.android.gms.internal.ads.SU r1 = com.google.android.gms.internal.ads.SU.HTTP
            com.google.android.gms.internal.ads.LY[] r4 = new com.google.android.gms.internal.ads.LY[r6]
            r4[r5] = r0
            r4[r3] = r11
            com.google.android.gms.internal.ads.JU r1 = r12.a(r1, (com.google.android.gms.internal.ads.LY<?>[]) r4)
            com.google.android.gms.internal.ads.kG r4 = new com.google.android.gms.internal.ads.kG
            r4.<init>(r11, r0)
            com.google.android.gms.internal.ads.NU r1 = r1.a(r4)
            com.google.android.gms.internal.ads.NU r1 = r1.a(r9)
            com.google.android.gms.internal.ads.DU r1 = r1.a()
            com.google.android.gms.internal.ads.SU r4 = com.google.android.gms.internal.ads.SU.PRE_PROCESS
            r7 = 3
            com.google.android.gms.internal.ads.LY[] r7 = new com.google.android.gms.internal.ads.LY[r7]
            r7[r5] = r11
            r7[r3] = r0
            r7[r6] = r1
            com.google.android.gms.internal.ads.JU r12 = r12.a(r4, (com.google.android.gms.internal.ads.LY<?>[]) r7)
            com.google.android.gms.internal.ads.nG r3 = new com.google.android.gms.internal.ads.nG
            r3.<init>(r1, r11, r0)
            com.google.android.gms.internal.ads.NU r11 = r12.a(r3)
        L_0x00ae:
            com.google.android.gms.internal.ads.NU r11 = r11.a(r2)
            com.google.android.gms.internal.ads.DU r11 = r11.a()
            return r11
        L_0x00b7:
            com.google.android.gms.internal.ads.EG r11 = new com.google.android.gms.internal.ads.EG
            org.json.JSONObject r0 = r4.f12736b
            com.google.android.gms.internal.ads.xi r1 = r4.f12735a
            r11.<init>(r0, r1)
            com.google.android.gms.internal.ads.SU r0 = com.google.android.gms.internal.ads.SU.HTTP
            com.google.android.gms.internal.ads.LY r11 = com.google.android.gms.internal.ads.DY.a(r11)
            com.google.android.gms.internal.ads.NU r11 = r12.a(r0, r11)
            com.google.android.gms.internal.ads.NU r11 = r11.a(r9)
            com.google.android.gms.internal.ads.DU r11 = r11.a()
            com.google.android.gms.internal.ads.LY r0 = com.google.android.gms.internal.ads.DY.a(r4)
            com.google.android.gms.internal.ads.SU r1 = com.google.android.gms.internal.ads.SU.PRE_PROCESS
            com.google.android.gms.internal.ads.LY[] r4 = new com.google.android.gms.internal.ads.LY[r6]
            r4[r5] = r11
            r4[r3] = r0
            com.google.android.gms.internal.ads.JU r12 = r12.a(r1, (com.google.android.gms.internal.ads.LY<?>[]) r4)
            com.google.android.gms.internal.ads.mG r1 = new com.google.android.gms.internal.ads.mG
            r1.<init>(r11, r0)
            com.google.android.gms.internal.ads.NU r11 = r12.a(r1)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2054lG.a(com.google.android.gms.internal.ads.ri, int):com.google.android.gms.internal.ads.LY");
    }

    public final C1249_h a(C1197Yh yh) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream a(LY ly, LY ly2) {
        String h2 = ((C2941xi) ly.get()).h();
        this.f11151f.put(h2, new C2905xG((C2941xi) ly.get(), (JSONObject) ly2.get()));
        return new ByteArrayInputStream(h2.getBytes(SW.f8637c));
    }

    public final void a(C1197Yh yh, C1948ji jiVar) {
    }

    public final void a(C2515ri riVar, C2090li liVar) {
        LY<InputStream> a2 = a(riVar, Binder.getCallingUid());
        a(a2, liVar);
        a2.a(new C2409qG(this), this.f11147b);
    }

    public final void a(String str, C2090li liVar) {
        a(D(str), liVar);
    }

    public final LY<InputStream> b(C2515ri riVar, int i) {
        if (!C0774Ia.f7301a.a().booleanValue()) {
            return DY.a((Throwable) new Exception("Split request is disabled."));
        }
        QT qt = riVar.j;
        if (qt == null) {
            return DY.a((Throwable) new Exception("Pool configuration missing from request."));
        }
        if (qt.f8345g == 0 || qt.f8346h == 0) {
            return DY.a((Throwable) new Exception("Caching is disabled."));
        }
        C1730gf a2 = p.p().a(this.f11146a, C1200Yk.g());
        C1355bP a3 = this.f11150e.a(riVar, i);
        VU c2 = a3.c();
        LY<JSONObject> a4 = a(riVar, c2, a3);
        LY<C2941xi> a5 = a(a4, c2, a2);
        return c2.a(SU.GET_URL_AND_CACHE_KEY, (LY<?>[]) new LY[]{a4, a5}).a(new C2692uG(this, a5, a4)).a();
    }

    public final void b(C2515ri riVar, C2090li liVar) {
        a(b(riVar, Binder.getCallingUid()), liVar);
    }

    public final LY<InputStream> c(C2515ri riVar, int i) {
        C1730gf a2 = p.p().a(this.f11146a, C1200Yk.g());
        if (!C0930Oa.f8101a.a().booleanValue()) {
            return DY.a((Throwable) new Exception("Signal collection disabled."));
        }
        C1355bP a3 = this.f11150e.a(riVar, i);
        MO<JSONObject> b2 = a3.b();
        return a3.c().a(SU.GET_SIGNALS, DY.a(riVar.f12015a)).a(new C2621tG(b2)).a(SU.JS_SIGNALS).a(a2.a("google.afma.request.getSignals", C1376bf.f9933b, C1376bf.f9934c)).a();
    }

    public final void c(C2515ri riVar, C2090li liVar) {
        a(c(riVar, Binder.getCallingUid()), liVar);
    }
}
