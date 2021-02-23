package com.google.android.gms.internal.ads;

import android.content.Context;

public final class TO implements JO<UO> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f8773a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8774b;

    public TO(PY py, Context context) {
        this.f8773a = py;
        this.f8774b = context;
    }

    public final LY<UO> a() {
        return this.f8773a.a(new WO(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.UO b() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f8774b
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = r0.getNetworkOperator()
            boolean r1 = com.google.android.gms.common.util.m.n()
            r3 = 0
            if (r1 == 0) goto L_0x0029
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.F.Kf
            com.google.android.gms.internal.ads.B r4 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r1 = r4.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0029
            r4 = 0
            goto L_0x002e
        L_0x0029:
            int r1 = r0.getNetworkType()
            r4 = r1
        L_0x002e:
            int r5 = r0.getPhoneType()
            r0 = -2
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r1 = r8.f8774b
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.google.android.gms.ads.internal.util.oa.a((android.content.Context) r1, (java.lang.String) r6)
            r6 = -1
            if (r1 == 0) goto L_0x0067
            android.content.Context r0 = r8.f8774b
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x005e
            int r6 = r1.getType()
            android.net.NetworkInfo$DetailedState r1 = r1.getDetailedState()
            int r1 = r1.ordinal()
            goto L_0x005f
        L_0x005e:
            r1 = -1
        L_0x005f:
            boolean r0 = r0.isActiveNetworkMetered()
            r7 = r1
            r3 = r6
            r6 = r0
            goto L_0x006a
        L_0x0067:
            r3 = -2
            r6 = 0
            r7 = -1
        L_0x006a:
            com.google.android.gms.internal.ads.UO r0 = new com.google.android.gms.internal.ads.UO
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TO.b():com.google.android.gms.internal.ads.UO");
    }
}
