package com.google.android.gms.internal.ads;

public final class Rla {
    private static int a(Nma nma) {
        int i = 0;
        while (nma.j() != 0) {
            int g2 = nma.g();
            i += g2;
            if (g2 != 255) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(long r16, com.google.android.gms.internal.ads.Nma r18, com.google.android.gms.internal.ads.C1599eka[] r19) {
        /*
            r0 = r18
            r1 = r19
        L_0x0004:
            int r2 = r18.j()
            r3 = 1
            if (r2 <= r3) goto L_0x0092
            int r2 = a(r18)
            int r4 = a(r18)
            r5 = -1
            if (r4 == r5) goto L_0x0082
            int r5 = r18.j()
            if (r4 <= r5) goto L_0x001d
            goto L_0x0082
        L_0x001d:
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 0
            if (r2 != r5) goto L_0x004f
            if (r4 >= r7) goto L_0x0027
            goto L_0x004f
        L_0x0027:
            int r2 = r18.b()
            int r5 = r18.g()
            int r9 = r18.h()
            int r10 = r18.d()
            int r11 = r18.g()
            r0.c(r2)
            r2 = 181(0xb5, float:2.54E-43)
            if (r5 != r2) goto L_0x004f
            r2 = 49
            if (r9 != r2) goto L_0x004f
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r10 != r2) goto L_0x004f
            if (r11 != r6) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x007e
            r0.d(r7)
            int r2 = r18.g()
            r2 = r2 & 31
            r0.d(r3)
            int r2 = r2 * 3
            int r3 = r18.b()
            int r5 = r1.length
        L_0x0065:
            if (r8 >= r5) goto L_0x007b
            r9 = r1[r8]
            r0.c(r3)
            r9.a(r0, r2)
            r12 = 1
            r14 = 0
            r15 = 0
            r10 = r16
            r13 = r2
            r9.a(r10, r12, r13, r14, r15)
            int r8 = r8 + 1
            goto L_0x0065
        L_0x007b:
            int r2 = r2 + 10
            int r4 = r4 - r2
        L_0x007e:
            r0.d(r4)
            goto L_0x0004
        L_0x0082:
            java.lang.String r2 = "CeaUtil"
            java.lang.String r3 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r2, r3)
            int r2 = r18.c()
            r0.c(r2)
            goto L_0x0004
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Rla.a(long, com.google.android.gms.internal.ads.Nma, com.google.android.gms.internal.ads.eka[]):void");
    }
}
