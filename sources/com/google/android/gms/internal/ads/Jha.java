package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1766hB;
import java.util.concurrent.ExecutionException;

public final class Jha extends C1808hia {
    private static final C2020kia<WK> i = new C2020kia<>();
    private final Context j;
    private C0615Bx k = null;

    public Jha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3, Context context, C0615Bx bx) {
        super(wha, str, str2, aVar, i2, 27);
        this.j = context;
        this.k = bx;
    }

    private static String a(C0615Bx bx) {
        if (bx == null || !bx.s() || Bha.b(bx.o().o())) {
            return null;
        }
        return bx.o().o();
    }

    private final String c() {
        try {
            if (this.f10707b.n() != null) {
                this.f10707b.n().get();
            }
            C1766hB m = this.f10707b.m();
            if (m == null || !m.p()) {
                return null;
            }
            return m.o();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        if (com.google.android.gms.internal.ads.Bha.b(r1) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.kia<com.google.android.gms.internal.ads.WK> r0 = i
            android.content.Context r1 = r10.j
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.WK r1 = (com.google.android.gms.internal.ads.WK) r1     // Catch:{ all -> 0x0112 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f9128b     // Catch:{ all -> 0x0112 }
            boolean r4 = com.google.android.gms.internal.ads.Bha.b(r4)     // Catch:{ all -> 0x0112 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.f9128b     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0112 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.f9128b     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.Bx r1 = r10.k     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = a(r1)     // Catch:{ all -> 0x0112 }
            boolean r1 = com.google.android.gms.internal.ads.Bha.b(r1)     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.fz r1 = com.google.android.gms.internal.ads.C1692fz.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x0112 }
            goto L_0x0082
        L_0x0048:
            com.google.android.gms.internal.ads.Bx r1 = r10.k     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = a(r1)     // Catch:{ all -> 0x0112 }
            boolean r4 = com.google.android.gms.internal.ads.Bha.b(r4)     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x006a
            if (r1 == 0) goto L_0x006a
            boolean r4 = r1.q()     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.Cx r1 = r1.r()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.fz r1 = r1.o()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.fz r4 = com.google.android.gms.internal.ads.C1692fz.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x0112 }
            if (r1 != r4) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0112 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.wha r1 = r10.f10707b     // Catch:{ all -> 0x0112 }
            boolean r1 = r1.k()     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.fz r1 = com.google.android.gms.internal.ads.C1692fz.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x0112 }
            goto L_0x0082
        L_0x0080:
            com.google.android.gms.internal.ads.fz r1 = com.google.android.gms.internal.ads.C1692fz.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x0112 }
        L_0x0082:
            com.google.android.gms.internal.ads.fz r4 = com.google.android.gms.internal.ads.C1692fz.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x0112 }
            if (r1 != r4) goto L_0x0088
            r4 = 1
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0112 }
            java.lang.reflect.Method r5 = r10.f10711f     // Catch:{ all -> 0x0112 }
            r6 = 0
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0112 }
            android.content.Context r9 = r10.j     // Catch:{ all -> 0x0112 }
            r8[r2] = r9     // Catch:{ all -> 0x0112 }
            r8[r3] = r4     // Catch:{ all -> 0x0112 }
            java.lang.Object r2 = r5.invoke(r6, r8)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.WK r4 = new com.google.android.gms.internal.ads.WK     // Catch:{ all -> 0x0112 }
            r4.<init>(r2)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = r4.f9128b     // Catch:{ all -> 0x0112 }
            boolean r2 = com.google.android.gms.internal.ads.Bha.b(r2)     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x00b6
            java.lang.String r2 = r4.f9128b     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "E"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00db
        L_0x00b6:
            int[] r2 = com.google.android.gms.internal.ads.Mha.f7878a     // Catch:{ all -> 0x0112 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0112 }
            r1 = r2[r1]     // Catch:{ all -> 0x0112 }
            if (r1 == r3) goto L_0x00d0
            if (r1 == r7) goto L_0x00c3
            goto L_0x00db
        L_0x00c3:
            java.lang.String r1 = r10.c()     // Catch:{ all -> 0x0112 }
            boolean r2 = com.google.android.gms.internal.ads.Bha.b(r1)     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x00db
        L_0x00cd:
            r4.f9128b = r1     // Catch:{ all -> 0x0112 }
            goto L_0x00db
        L_0x00d0:
            com.google.android.gms.internal.ads.Bx r1 = r10.k     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.Dx r1 = r1.o()     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = r1.o()     // Catch:{ all -> 0x0112 }
            goto L_0x00cd
        L_0x00db:
            r0.set(r4)     // Catch:{ all -> 0x0112 }
        L_0x00de:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.WK r1 = (com.google.android.gms.internal.ads.WK) r1     // Catch:{ all -> 0x0112 }
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            com.google.android.gms.internal.ads.hB$a r2 = r10.f10710e
            monitor-enter(r2)
            if (r1 == 0) goto L_0x010d
            com.google.android.gms.internal.ads.hB$a r0 = r10.f10710e     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r1.f9128b     // Catch:{ all -> 0x010f }
            r0.e((java.lang.String) r3)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.ads.hB$a r0 = r10.f10710e     // Catch:{ all -> 0x010f }
            long r3 = r1.f9129c     // Catch:{ all -> 0x010f }
            r0.A(r3)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.ads.hB$a r0 = r10.f10710e     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r1.f9130d     // Catch:{ all -> 0x010f }
            r0.g((java.lang.String) r3)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.ads.hB$a r0 = r10.f10710e     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r1.f9131e     // Catch:{ all -> 0x010f }
            r0.h((java.lang.String) r3)     // Catch:{ all -> 0x010f }
            com.google.android.gms.internal.ads.hB$a r0 = r10.f10710e     // Catch:{ all -> 0x010f }
            java.lang.String r1 = r1.f9132f     // Catch:{ all -> 0x010f }
            r0.i((java.lang.String) r1)     // Catch:{ all -> 0x010f }
        L_0x010d:
            monitor-exit(r2)     // Catch:{ all -> 0x010f }
            return
        L_0x010f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010f }
            throw r0
        L_0x0112:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            goto L_0x0116
        L_0x0115:
            throw r1
        L_0x0116:
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Jha.a():void");
    }
}
