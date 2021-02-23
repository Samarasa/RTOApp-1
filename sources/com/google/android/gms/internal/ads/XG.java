package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C2034kpa;
import com.google.android.gms.internal.ads.C2743upa;
import com.google.android.gms.internal.ads.C2885wpa;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class XG {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<C2885wpa.c> f9209a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9210b;

    /* renamed from: c  reason: collision with root package name */
    private final C1183Xt f9211c;

    /* renamed from: d  reason: collision with root package name */
    private final TelephonyManager f9212d;

    /* renamed from: e  reason: collision with root package name */
    private final PG f9213e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final JG f9214f;

    /* renamed from: g  reason: collision with root package name */
    private Rpa f9215g;

    static {
        SparseArray<C2885wpa.c> sparseArray = new SparseArray<>();
        f9209a = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), C2885wpa.c.CONNECTED);
        f9209a.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), C2885wpa.c.CONNECTING);
        f9209a.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), C2885wpa.c.CONNECTING);
        f9209a.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), C2885wpa.c.CONNECTING);
        f9209a.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), C2885wpa.c.DISCONNECTING);
        f9209a.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), C2885wpa.c.DISCONNECTED);
        f9209a.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), C2885wpa.c.DISCONNECTED);
        f9209a.put(NetworkInfo.DetailedState.FAILED.ordinal(), C2885wpa.c.DISCONNECTED);
        f9209a.put(NetworkInfo.DetailedState.IDLE.ordinal(), C2885wpa.c.DISCONNECTED);
        f9209a.put(NetworkInfo.DetailedState.SCANNING.ordinal(), C2885wpa.c.DISCONNECTED);
        f9209a.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), C2885wpa.c.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            f9209a.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), C2885wpa.c.CONNECTING);
        }
        f9209a.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), C2885wpa.c.CONNECTING);
    }

    XG(Context context, C1183Xt xt, PG pg, JG jg) {
        this.f9210b = context;
        this.f9211c = xt;
        this.f9213e = pg;
        this.f9214f = jg;
        this.f9212d = (TelephonyManager) context.getSystemService("phone");
    }

    /* access modifiers changed from: private */
    public final C2743upa a(Bundle bundle) {
        C2743upa.a aVar;
        C2743upa.b o = C2743upa.o();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.f9215g = Rpa.ENUM_TRUE;
        } else {
            this.f9215g = Rpa.ENUM_FALSE;
            o.a(i != 0 ? i != 1 ? C2743upa.c.NETWORKTYPE_UNSPECIFIED : C2743upa.c.WIFI : C2743upa.c.CELL);
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    aVar = C2743upa.a.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    aVar = C2743upa.a.THREE_G;
                    break;
                case 13:
                    aVar = C2743upa.a.LTE;
                    break;
                default:
                    aVar = C2743upa.a.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            o.a(aVar);
        }
        return (C2743upa) o.k();
    }

    /* access modifiers changed from: private */
    public final byte[] a(boolean z, ArrayList<C2034kpa.a> arrayList, C2743upa upa, C2885wpa.c cVar) {
        C2885wpa.a.C0085a q = C2885wpa.a.q();
        q.a((Iterable<? extends C2034kpa.a>) arrayList);
        boolean z2 = true;
        q.c(b(p.e().b(this.f9210b.getContentResolver()) != 0));
        q.d(p.e().a(this.f9210b, this.f9212d));
        q.b(this.f9213e.b());
        q.c(this.f9213e.d());
        q.a(this.f9213e.a());
        q.a(cVar);
        q.a(upa);
        q.e(this.f9215g);
        q.a(b(z));
        q.a(p.j().a());
        if (p.e().a(this.f9210b.getContentResolver()) == 0) {
            z2 = false;
        }
        q.b(b(z2));
        return ((C2885wpa.a) q.k()).f();
    }

    private static Rpa b(boolean z) {
        return z ? Rpa.ENUM_TRUE : Rpa.ENUM_FALSE;
    }

    /* access modifiers changed from: private */
    public static C2885wpa.c b(Bundle bundle) {
        return f9209a.get(C1359bT.a(C1359bT.a(bundle, "device"), "network").getInt("active_network_state", -1), C2885wpa.c.UNSPECIFIED);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.C2034kpa.a> c(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L_0x000d
            java.util.List r7 = (java.util.List) r7
            goto L_0x0017
        L_0x000d:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x003d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x0024:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L_0x0024
        L_0x0038:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0041
        L_0x003d:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0041:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x004a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L_0x0080;
                case -1052618729: goto L_0x0076;
                case -239580146: goto L_0x006c;
                case 604727084: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0089
        L_0x0062:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 1
            goto L_0x0089
        L_0x006c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 3
            goto L_0x0089
        L_0x0076:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 2
            goto L_0x0089
        L_0x0080:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x009d
            if (r2 == r6) goto L_0x009a
            if (r2 == r5) goto L_0x0097
            if (r2 == r4) goto L_0x0094
            com.google.android.gms.internal.ads.kpa$a r1 = com.google.android.gms.internal.ads.C2034kpa.a.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x009f
        L_0x0094:
            com.google.android.gms.internal.ads.kpa$a r1 = com.google.android.gms.internal.ads.C2034kpa.a.REWARD_BASED_VIDEO_AD
            goto L_0x009f
        L_0x0097:
            com.google.android.gms.internal.ads.kpa$a r1 = com.google.android.gms.internal.ads.C2034kpa.a.NATIVE_APP_INSTALL
            goto L_0x009f
        L_0x009a:
            com.google.android.gms.internal.ads.kpa$a r1 = com.google.android.gms.internal.ads.C2034kpa.a.INTERSTITIAL
            goto L_0x009f
        L_0x009d:
            com.google.android.gms.internal.ads.kpa$a r1 = com.google.android.gms.internal.ads.C2034kpa.a.BANNER
        L_0x009f:
            r0.add(r1)
            goto L_0x004a
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XG.c(android.os.Bundle):java.util.ArrayList");
    }

    public final void a(boolean z) {
        DY.a(this.f9211c.a(), new WG(this, z), (Executor) C1252_k.f9704f);
    }
}
