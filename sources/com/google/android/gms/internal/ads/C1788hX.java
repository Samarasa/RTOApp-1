package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hX  reason: case insensitive filesystem */
final class C1788hX implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ HV f10682a;

    C1788hX(HV hv) {
        this.f10682a = hv;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|(2:16|17)|18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.HV r0 = r7.f10682a
            java.lang.Boolean r0 = r0.f7152e
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.HV.f7148a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.HV r1 = r7.f10682a     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = r1.f7152e     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0014:
            r1 = 0
            com.google.android.gms.internal.ads.pa<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.F.Db     // Catch:{ IllegalStateException -> 0x0022 }
            java.lang.Object r2 = r2.a()     // Catch:{ IllegalStateException -> 0x0022 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IllegalStateException -> 0x0022 }
            boolean r2 = r2.booleanValue()     // Catch:{ IllegalStateException -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.Woa r3 = new com.google.android.gms.internal.ads.Woa     // Catch:{ Throwable -> 0x0038 }
            com.google.android.gms.internal.ads.HV r4 = r7.f10682a     // Catch:{ Throwable -> 0x0038 }
            com.google.android.gms.internal.ads.wha r4 = r4.f7151d     // Catch:{ Throwable -> 0x0038 }
            android.content.Context r4 = r4.f12651b     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r5 = "ADSHIELD"
            r6 = 0
            r3.<init>(r4, r5, r6)     // Catch:{ Throwable -> 0x0038 }
            com.google.android.gms.internal.ads.HV.f7149b = r3     // Catch:{ Throwable -> 0x0038 }
        L_0x0037:
            r1 = r2
        L_0x0038:
            com.google.android.gms.internal.ads.HV r2 = r7.f10682a     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0049 }
            r2.f7152e = r1     // Catch:{ all -> 0x0049 }
            android.os.ConditionVariable r1 = com.google.android.gms.internal.ads.HV.f7148a     // Catch:{ all -> 0x0049 }
            r1.open()     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1788hX.run():void");
    }
}
