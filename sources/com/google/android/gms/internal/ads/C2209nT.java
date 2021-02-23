package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.internal.util.C0513t;

/* renamed from: com.google.android.gms.internal.ads.nT  reason: case insensitive filesystem */
public final class C2209nT {
    public static C1824hqa a(C2351pT pTVar, C1824hqa hqa) {
        if (pTVar.equals(C2351pT.MEDIATION_SHOW_ERROR)) {
            if (((Integer) Qqa.e().a(F.Cf)).intValue() > 0) {
                return hqa;
            }
        }
        return a(pTVar, (String) null, hqa);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C1824hqa a(com.google.android.gms.internal.ads.C2351pT r6, java.lang.String r7, com.google.android.gms.internal.ads.C1824hqa r8) {
        /*
            if (r7 != 0) goto L_0x0043
            int[] r7 = com.google.android.gms.internal.ads.C2138mT.f11310a
            int r0 = r6.ordinal()
            r7 = r7[r0]
            java.lang.String r0 = "No fill."
            switch(r7) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0030;
                case 8: goto L_0x002d;
                case 9: goto L_0x002a;
                case 10: goto L_0x0027;
                case 11: goto L_0x000f;
                case 12: goto L_0x0012;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r7 = "Internal error."
            goto L_0x0043
        L_0x0012:
            com.google.android.gms.internal.ads.p<java.lang.Integer> r7 = com.google.android.gms.internal.ads.F.Gf
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r7 = r1.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 > 0) goto L_0x0036
            java.lang.String r7 = "The mediation adapter did not return an ad."
            goto L_0x0043
        L_0x0027:
            java.lang.String r7 = "The ad can not be shown when app is not in foreground."
            goto L_0x0043
        L_0x002a:
            java.lang.String r7 = "The ad has already been shown."
            goto L_0x0043
        L_0x002d:
            java.lang.String r7 = "The ad is not ready."
            goto L_0x0043
        L_0x0030:
            java.lang.String r7 = "A mediation adapter failed to show the ad."
            goto L_0x0043
        L_0x0033:
            java.lang.String r7 = "App ID missing."
            goto L_0x0043
        L_0x0036:
            r7 = r0
            goto L_0x0043
        L_0x0038:
            java.lang.String r7 = "Network error."
            goto L_0x0043
        L_0x003b:
            java.lang.String r7 = "Invalid request: Invalid ad size."
            goto L_0x0043
        L_0x003e:
            java.lang.String r7 = "Invalid request: Invalid ad unit ID."
            goto L_0x0043
        L_0x0041:
            java.lang.String r7 = "Invalid request."
        L_0x0043:
            r2 = r7
            com.google.android.gms.internal.ads.hqa r7 = new com.google.android.gms.internal.ads.hqa
            int[] r0 = com.google.android.gms.internal.ads.C2138mT.f11310a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            switch(r0) {
                case 1: goto L_0x009d;
                case 2: goto L_0x009d;
                case 3: goto L_0x009d;
                case 4: goto L_0x009b;
                case 5: goto L_0x0099;
                case 6: goto L_0x0094;
                case 7: goto L_0x0091;
                case 8: goto L_0x009b;
                case 9: goto L_0x009d;
                case 10: goto L_0x0099;
                case 11: goto L_0x009e;
                case 12: goto L_0x007a;
                case 13: goto L_0x009e;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r8 = r8 + 18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r8 = "Unknown SdkError: "
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x007a:
            com.google.android.gms.internal.ads.p<java.lang.Integer> r6 = com.google.android.gms.internal.ads.F.Gf
            com.google.android.gms.internal.ads.B r0 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 > 0) goto L_0x0099
            r6 = 9
            r1 = 9
            goto L_0x009e
        L_0x0091:
            r6 = 4
            r1 = 4
            goto L_0x009e
        L_0x0094:
            r6 = 8
            r1 = 8
            goto L_0x009e
        L_0x0099:
            r1 = 3
            goto L_0x009e
        L_0x009b:
            r1 = 2
            goto L_0x009e
        L_0x009d:
            r1 = 1
        L_0x009e:
            r5 = 0
            java.lang.String r3 = "com.google.android.gms.ads"
            r0 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2209nT.a(com.google.android.gms.internal.ads.pT, java.lang.String, com.google.android.gms.internal.ads.hqa):com.google.android.gms.internal.ads.hqa");
    }

    public static C1824hqa a(Throwable th) {
        if (th instanceof C2835wH) {
            C2835wH wHVar = (C2835wH) th;
            return a(wHVar.a(), wHVar.b());
        } else if (th instanceof VE) {
            return th.getMessage() == null ? a(((VE) th).a(), (String) null, (C1824hqa) null) : a(((VE) th).a(), th.getMessage(), (C1824hqa) null);
        } else {
            if (!(th instanceof C0513t)) {
                return a(C2351pT.INTERNAL_ERROR, (String) null, (C1824hqa) null);
            }
            C0513t tVar = (C0513t) th;
            return new C1824hqa(tVar.a(), C2000kX.c(tVar.getMessage()), "com.google.android.gms.ads", (C1824hqa) null, (IBinder) null);
        }
    }

    public static C1824hqa a(Throwable th, C3048zH zHVar) {
        C1824hqa hqa;
        C1824hqa a2 = a(th);
        int i = a2.f10744a;
        if ((i == 3 || i == 0) && (hqa = a2.f10747d) != null && !hqa.f10746c.equals("com.google.android.gms.ads")) {
            a2.f10747d = null;
        }
        if (((Boolean) Qqa.e().a(F.Ff)).booleanValue() && zHVar != null) {
            a2.f10748e = zHVar.b();
        }
        return a2;
    }
}
