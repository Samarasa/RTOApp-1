package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.e.a;
import com.google.android.gms.ads.e.b;
import com.google.android.gms.ads.e.c;
import com.google.android.gms.ads.t;
import com.google.android.gms.common.internal.C0563t;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class dsa {

    /* renamed from: a  reason: collision with root package name */
    private static dsa f10204a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c> f10205b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Object f10206c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private C2889wra f10207d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f10208e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f10209f = false;

    /* renamed from: g  reason: collision with root package name */
    private com.google.android.gms.ads.h.c f10210g;

    /* renamed from: h  reason: collision with root package name */
    private t f10211h = new t.a().a();
    private b i;

    class a extends C0699Fd {
        private a() {
        }

        /* synthetic */ a(dsa dsa, hsa hsa) {
            this();
        }

        public final void c(List<C3002yd> list) {
            int i = 0;
            boolean unused = dsa.this.f10208e = false;
            boolean unused2 = dsa.this.f10209f = true;
            b a2 = dsa.a(list);
            ArrayList a3 = dsa.d().f10205b;
            int size = a3.size();
            while (i < size) {
                Object obj = a3.get(i);
                i++;
                ((c) obj).onInitializationComplete(a2);
            }
            dsa.d().f10205b.clear();
        }
    }

    private dsa() {
    }

    /* access modifiers changed from: private */
    public static b a(List<C3002yd> list) {
        HashMap hashMap = new HashMap();
        for (C3002yd next : list) {
            hashMap.put(next.f12935a, new C0751Hd(next.f12936b ? a.C0071a.READY : a.C0071a.NOT_READY, next.f12938d, next.f12937c));
        }
        return new C0725Gd(hashMap);
    }

    private final void a(t tVar) {
        try {
            this.f10207d.a(new C1551e(tVar));
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to set request configuration parcel.", e2);
        }
    }

    private final void b(Context context) {
        if (this.f10207d == null) {
            this.f10207d = (C2889wra) new Kqa(Qqa.b(), context).a(context, false);
        }
    }

    public static dsa d() {
        dsa dsa;
        synchronized (dsa.class) {
            if (f10204a == null) {
                f10204a = new dsa();
            }
            dsa = f10204a;
        }
        return dsa;
    }

    public final b a() {
        synchronized (this.f10206c) {
            C0563t.b(this.f10207d != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.i != null) {
                    b bVar = this.i;
                    return bVar;
                }
                b a2 = a(this.f10207d.Ta());
                return a2;
            } catch (RemoteException unused) {
                C1018Rk.b("Unable to get Initialization status.");
                return null;
            }
        }
    }

    public final com.google.android.gms.ads.h.c a(Context context) {
        synchronized (this.f10206c) {
            if (this.f10210g != null) {
                com.google.android.gms.ads.h.c cVar = this.f10210g;
                return cVar;
            }
            this.f10210g = new C1526dj(context, (C0964Pi) new Oqa(Qqa.b(), context, new C0701Ff()).a(context, false));
            com.google.android.gms.ads.h.c cVar2 = this.f10210g;
            return cVar2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5, java.lang.String r6, com.google.android.gms.ads.e.c r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f10206c
            monitor-enter(r0)
            boolean r1 = r4.f10208e     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0014
            if (r7 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.dsa r5 = d()     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList<com.google.android.gms.ads.e.c> r5 = r5.f10205b     // Catch:{ all -> 0x00c7 }
            r5.add(r7)     // Catch:{ all -> 0x00c7 }
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x0014:
            boolean r1 = r4.f10209f     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0023
            if (r7 == 0) goto L_0x0021
            com.google.android.gms.ads.e.b r5 = r4.a()     // Catch:{ all -> 0x00c7 }
            r7.onInitializationComplete(r5)     // Catch:{ all -> 0x00c7 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x0023:
            r1 = 1
            r4.f10208e = r1     // Catch:{ all -> 0x00c7 }
            if (r7 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.dsa r1 = d()     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList<com.google.android.gms.ads.e.c> r1 = r1.f10205b     // Catch:{ all -> 0x00c7 }
            r1.add(r7)     // Catch:{ all -> 0x00c7 }
        L_0x0031:
            if (r5 == 0) goto L_0x00bf
            com.google.android.gms.internal.ads.zf r1 = com.google.android.gms.internal.ads.C3077zf.a()     // Catch:{ RemoteException -> 0x00b7 }
            r1.a(r5, r6)     // Catch:{ RemoteException -> 0x00b7 }
            r4.b(r5)     // Catch:{ RemoteException -> 0x00b7 }
            if (r7 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.wra r1 = r4.f10207d     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.dsa$a r2 = new com.google.android.gms.internal.ads.dsa$a     // Catch:{ RemoteException -> 0x00b7 }
            r3 = 0
            r2.<init>(r4, r3)     // Catch:{ RemoteException -> 0x00b7 }
            r1.a((com.google.android.gms.internal.ads.C0621Cd) r2)     // Catch:{ RemoteException -> 0x00b7 }
        L_0x004a:
            com.google.android.gms.internal.ads.wra r1 = r4.f10207d     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.Ff r2 = new com.google.android.gms.internal.ads.Ff     // Catch:{ RemoteException -> 0x00b7 }
            r2.<init>()     // Catch:{ RemoteException -> 0x00b7 }
            r1.a((com.google.android.gms.internal.ads.C0675Ef) r2)     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.wra r1 = r4.f10207d     // Catch:{ RemoteException -> 0x00b7 }
            r1.p()     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.wra r1 = r4.f10207d     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.gsa r2 = new com.google.android.gms.internal.ads.gsa     // Catch:{ RemoteException -> 0x00b7 }
            r2.<init>(r4, r5)     // Catch:{ RemoteException -> 0x00b7 }
            c.b.b.b.c.a r2 = c.b.b.b.c.b.a(r2)     // Catch:{ RemoteException -> 0x00b7 }
            r1.b(r6, r2)     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.ads.t r6 = r4.f10211h     // Catch:{ RemoteException -> 0x00b7 }
            int r6 = r6.b()     // Catch:{ RemoteException -> 0x00b7 }
            r1 = -1
            if (r6 != r1) goto L_0x0078
            com.google.android.gms.ads.t r6 = r4.f10211h     // Catch:{ RemoteException -> 0x00b7 }
            int r6 = r6.c()     // Catch:{ RemoteException -> 0x00b7 }
            if (r6 == r1) goto L_0x007d
        L_0x0078:
            com.google.android.gms.ads.t r6 = r4.f10211h     // Catch:{ RemoteException -> 0x00b7 }
            r4.a((com.google.android.gms.ads.t) r6)     // Catch:{ RemoteException -> 0x00b7 }
        L_0x007d:
            com.google.android.gms.internal.ads.F.a(r5)     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.F.Ed     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ RemoteException -> 0x00b7 }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ RemoteException -> 0x00b7 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ RemoteException -> 0x00b7 }
            boolean r5 = r5.booleanValue()     // Catch:{ RemoteException -> 0x00b7 }
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = r4.c()     // Catch:{ RemoteException -> 0x00b7 }
            java.lang.String r6 = "0"
            boolean r5 = r5.endsWith(r6)     // Catch:{ RemoteException -> 0x00b7 }
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."
            com.google.android.gms.internal.ads.C1018Rk.b(r5)     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.isa r5 = new com.google.android.gms.internal.ads.isa     // Catch:{ RemoteException -> 0x00b7 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x00b7 }
            r4.i = r5     // Catch:{ RemoteException -> 0x00b7 }
            if (r7 == 0) goto L_0x00bd
            android.os.Handler r5 = com.google.android.gms.internal.ads.C0758Hk.f7186a     // Catch:{ RemoteException -> 0x00b7 }
            com.google.android.gms.internal.ads.fsa r6 = new com.google.android.gms.internal.ads.fsa     // Catch:{ RemoteException -> 0x00b7 }
            r6.<init>(r4, r7)     // Catch:{ RemoteException -> 0x00b7 }
            r5.post(r6)     // Catch:{ RemoteException -> 0x00b7 }
            goto L_0x00bd
        L_0x00b7:
            r5 = move-exception
            java.lang.String r6 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.C1018Rk.c(r6, r5)     // Catch:{ all -> 0x00c7 }
        L_0x00bd:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x00bf:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = "Context cannot be null."
            r5.<init>(r6)     // Catch:{ all -> 0x00c7 }
            throw r5     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dsa.a(android.content.Context, java.lang.String, com.google.android.gms.ads.e.c):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(c cVar) {
        cVar.onInitializationComplete(this.i);
    }

    public final t b() {
        return this.f10211h;
    }

    public final String c() {
        String c2;
        synchronized (this.f10206c) {
            C0563t.b(this.f10207d != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c2 = C2000kX.c(this.f10207d.hb());
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to get version string.", e2);
                return BuildConfig.FLAVOR;
            }
        }
        return c2;
    }
}
