package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.b.b.b.c.a;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.q;
import com.google.android.gms.ads.v;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lc  reason: case insensitive filesystem */
public final class C2078lc extends j {

    /* renamed from: a  reason: collision with root package name */
    private final C2007kc f11197a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b.C0072b> f11198b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C2147mb f11199c;

    /* renamed from: d  reason: collision with root package name */
    private final v f11200d = new v();

    /* renamed from: e  reason: collision with root package name */
    private final b.a f11201e;

    /* renamed from: f  reason: collision with root package name */
    private final List<q> f11202f = new ArrayList();

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[Catch:{ RemoteException -> 0x00bf }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2078lc(com.google.android.gms.internal.ads.C2007kc r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f11198b = r1
            com.google.android.gms.ads.v r1 = new com.google.android.gms.ads.v
            r1.<init>()
            r5.f11200d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f11202f = r1
            r5.f11197a = r6
            r6 = 0
            com.google.android.gms.internal.ads.kc r1 = r5.f11197a     // Catch:{ RemoteException -> 0x005e }
            java.util.List r1 = r1.y()     // Catch:{ RemoteException -> 0x005e }
            if (r1 == 0) goto L_0x0062
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x005e }
        L_0x0029:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x005e }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x005e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005e }
            if (r3 == 0) goto L_0x0050
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005e }
            if (r2 == 0) goto L_0x0050
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005e }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C2076lb     // Catch:{ RemoteException -> 0x005e }
            if (r4 == 0) goto L_0x0049
            r2 = r3
            com.google.android.gms.internal.ads.lb r2 = (com.google.android.gms.internal.ads.C2076lb) r2     // Catch:{ RemoteException -> 0x005e }
            goto L_0x0051
        L_0x0049:
            com.google.android.gms.internal.ads.nb r3 = new com.google.android.gms.internal.ads.nb     // Catch:{ RemoteException -> 0x005e }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005e }
            r2 = r3
            goto L_0x0051
        L_0x0050:
            r2 = r6
        L_0x0051:
            if (r2 == 0) goto L_0x0029
            java.util.List<com.google.android.gms.ads.formats.b$b> r3 = r5.f11198b     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.ads.mb r4 = new com.google.android.gms.internal.ads.mb     // Catch:{ RemoteException -> 0x005e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x005e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x005e }
            goto L_0x0029
        L_0x005e:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x0062:
            com.google.android.gms.internal.ads.kc r1 = r5.f11197a     // Catch:{ RemoteException -> 0x0091 }
            java.util.List r1 = r1.vb()     // Catch:{ RemoteException -> 0x0091 }
            if (r1 == 0) goto L_0x0095
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0091 }
        L_0x006e:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x0091 }
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x0091 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0091 }
            if (r3 == 0) goto L_0x0083
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.Era r2 = com.google.android.gms.internal.ads.Gra.a(r2)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x0084
        L_0x0083:
            r2 = r6
        L_0x0084:
            if (r2 == 0) goto L_0x006e
            java.util.List<com.google.android.gms.ads.q> r3 = r5.f11202f     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.Ira r4 = new com.google.android.gms.internal.ads.Ira     // Catch:{ RemoteException -> 0x0091 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0091 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x006e
        L_0x0091:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x0095:
            com.google.android.gms.internal.ads.kc r1 = r5.f11197a     // Catch:{ RemoteException -> 0x00a3 }
            com.google.android.gms.internal.ads.lb r1 = r1.U()     // Catch:{ RemoteException -> 0x00a3 }
            if (r1 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.mb r2 = new com.google.android.gms.internal.ads.mb     // Catch:{ RemoteException -> 0x00a3 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x00a3 }
            goto L_0x00a8
        L_0x00a3:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x00a7:
            r2 = r6
        L_0x00a8:
            r5.f11199c = r2
            com.google.android.gms.internal.ads.kc r1 = r5.f11197a     // Catch:{ RemoteException -> 0x00bf }
            com.google.android.gms.internal.ads.eb r1 = r1.x()     // Catch:{ RemoteException -> 0x00bf }
            if (r1 == 0) goto L_0x00c3
            com.google.android.gms.internal.ads.fb r1 = new com.google.android.gms.internal.ads.fb     // Catch:{ RemoteException -> 0x00bf }
            com.google.android.gms.internal.ads.kc r2 = r5.f11197a     // Catch:{ RemoteException -> 0x00bf }
            com.google.android.gms.internal.ads.eb r2 = r2.x()     // Catch:{ RemoteException -> 0x00bf }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x00bf }
            r6 = r1
            goto L_0x00c3
        L_0x00bf:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x00c3:
            r5.f11201e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2078lc.<init>(com.google.android.gms.internal.ads.kc):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final a l() {
        try {
            return this.f11197a.B();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final void a() {
        try {
            this.f11197a.destroy();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final String b() {
        try {
            return this.f11197a.R();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final String c() {
        try {
            return this.f11197a.v();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final String d() {
        try {
            return this.f11197a.s();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final String e() {
        try {
            return this.f11197a.r();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final b.C0072b f() {
        return this.f11199c;
    }

    public final List<b.C0072b> g() {
        return this.f11198b;
    }

    public final String h() {
        try {
            return this.f11197a.E();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final Double i() {
        try {
            double G = this.f11197a.G();
            if (G == -1.0d) {
                return null;
            }
            return Double.valueOf(G);
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final String j() {
        try {
            return this.f11197a.S();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final v k() {
        try {
            if (this.f11197a.getVideoController() != null) {
                this.f11200d.a(this.f11197a.getVideoController());
            }
        } catch (RemoteException e2) {
            C1018Rk.b("Exception occurred while getting video controller", e2);
        }
        return this.f11200d;
    }

    public final Object m() {
        try {
            a w = this.f11197a.w();
            if (w != null) {
                return c.b.b.b.c.b.Q(w);
            }
            return null;
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }
}
