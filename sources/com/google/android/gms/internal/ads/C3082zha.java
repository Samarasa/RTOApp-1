package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zha  reason: case insensitive filesystem */
final class C3082zha {

    /* renamed from: a  reason: collision with root package name */
    static C2286oZ f13092a;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r9 = r9.a("Yv/QAPSCUDlFANE2NHMbvShNPv936wVUF2MbIpB/68GL9aQmjKsPYkuORAEbfgnY", "bGYe82pRgk3yFFeIap/06A6dOEaZWsntOa5Lvaa8feA=");
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(com.google.android.gms.internal.ads.C2869wha r9) {
        /*
            com.google.android.gms.internal.ads.oZ r0 = f13092a
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.ads.p<java.lang.String> r0 = com.google.android.gms.internal.ads.F.Nb
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r2.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x001c
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0037
        L_0x001c:
            if (r9 != 0) goto L_0x0020
        L_0x001e:
            r0 = r2
            goto L_0x0034
        L_0x0020:
            java.lang.String r0 = "Yv/QAPSCUDlFANE2NHMbvShNPv936wVUF2MbIpB/68GL9aQmjKsPYkuORAEbfgnY"
            java.lang.String r4 = "bGYe82pRgk3yFFeIap/06A6dOEaZWsntOa5Lvaa8feA="
            java.lang.reflect.Method r9 = r9.a((java.lang.String) r0, (java.lang.String) r4)
            if (r9 != 0) goto L_0x002b
            goto L_0x001e
        L_0x002b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r9 = r9.invoke(r2, r0)
            java.lang.String r9 = (java.lang.String) r9
            r0 = r9
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            return r3
        L_0x0037:
            byte[] r9 = com.google.android.gms.internal.ads.C2695uJ.a((java.lang.String) r0, (boolean) r1)     // Catch:{ IllegalArgumentException -> 0x0120 }
            com.google.android.gms.internal.ads.tZ r9 = com.google.android.gms.internal.ads.C2924xZ.a(r9)     // Catch:{  }
            com.google.android.gms.internal.ads.wca r0 = com.google.android.gms.internal.ads.C2997yaa.f12930c     // Catch:{  }
            java.util.List r0 = r0.o()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0049:
            boolean r4 = r0.hasNext()     // Catch:{  }
            if (r4 == 0) goto L_0x0115
            java.lang.Object r4 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.eca r4 = (com.google.android.gms.internal.ads.C1583eca) r4     // Catch:{  }
            java.lang.String r5 = r4.o()     // Catch:{  }
            boolean r5 = r5.isEmpty()     // Catch:{  }
            if (r5 != 0) goto L_0x010d
            java.lang.String r5 = r4.p()     // Catch:{  }
            boolean r5 = r5.isEmpty()     // Catch:{  }
            if (r5 != 0) goto L_0x0105
            java.lang.String r5 = r4.s()     // Catch:{  }
            boolean r5 = r5.isEmpty()     // Catch:{  }
            if (r5 != 0) goto L_0x00fd
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkAead"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkMac"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkHybridDecrypt"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkHybridEncrypt"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkPublicKeySign"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkPublicKeyVerify"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkStreamingAead"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.s()     // Catch:{  }
            java.lang.String r6 = "TinkDeterministicAead"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 == 0) goto L_0x00d5
            goto L_0x0049
        L_0x00d5:
            java.lang.String r5 = r4.s()     // Catch:{  }
            com.google.android.gms.internal.ads.iZ r5 = com.google.android.gms.internal.ads.DZ.a((java.lang.String) r5)     // Catch:{  }
            com.google.android.gms.internal.ads.CZ r6 = r5.a()     // Catch:{  }
            com.google.android.gms.internal.ads.DZ.a(r6)     // Catch:{  }
            java.lang.String r6 = r4.o()     // Catch:{  }
            java.lang.String r7 = r4.p()     // Catch:{  }
            int r8 = r4.q()     // Catch:{  }
            com.google.android.gms.internal.ads.lZ r5 = r5.a(r6, r7, r8)     // Catch:{  }
            boolean r4 = r4.r()     // Catch:{  }
            com.google.android.gms.internal.ads.DZ.a(r5, (boolean) r4)     // Catch:{  }
            goto L_0x0049
        L_0x00fd:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r9.<init>(r0)     // Catch:{  }
            throw r9     // Catch:{  }
        L_0x0105:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r9.<init>(r0)     // Catch:{  }
            throw r9     // Catch:{  }
        L_0x010d:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r9.<init>(r0)     // Catch:{  }
            throw r9     // Catch:{  }
        L_0x0115:
            com.google.android.gms.internal.ads.oZ r9 = com.google.android.gms.internal.ads.C3068zaa.a(r9, r2)     // Catch:{  }
            f13092a = r9     // Catch:{  }
            com.google.android.gms.internal.ads.oZ r9 = f13092a
            if (r9 == 0) goto L_0x0120
            return r1
        L_0x0120:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3082zha.a(com.google.android.gms.internal.ads.wha):boolean");
    }
}
