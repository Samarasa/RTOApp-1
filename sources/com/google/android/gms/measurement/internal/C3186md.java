package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.md  reason: case insensitive filesystem */
final class C3186md implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13675a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3175kd f13676b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3175kd f13677c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3191nd f13678d;

    C3186md(C3191nd ndVar, boolean z, C3175kd kdVar, C3175kd kdVar2) {
        this.f13678d = ndVar;
        this.f13675a = z;
        this.f13676b = kdVar;
        this.f13677c = kdVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (com.google.android.gms.measurement.internal.se.c(r10.f13676b.f13637a, r10.f13677c.f13637a) != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.Ie r0 = r0.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C3202q.aa
            boolean r0 = r0.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0027
            boolean r0 = r10.f13675a
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.kd r0 = r0.f13688c
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0035
            com.google.android.gms.measurement.internal.nd r3 = r10.f13678d
            com.google.android.gms.measurement.internal.kd r4 = r3.f13688c
            r3.a((com.google.android.gms.measurement.internal.C3175kd) r4, (boolean) r2)
            goto L_0x0035
        L_0x0027:
            boolean r0 = r10.f13675a
            if (r0 == 0) goto L_0x0034
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.kd r3 = r0.f13688c
            if (r3 == 0) goto L_0x0034
            r0.a((com.google.android.gms.measurement.internal.C3175kd) r3, (boolean) r2)
        L_0x0034:
            r0 = 0
        L_0x0035:
            com.google.android.gms.measurement.internal.kd r3 = r10.f13676b
            if (r3 == 0) goto L_0x005b
            long r4 = r3.f13639c
            com.google.android.gms.measurement.internal.kd r6 = r10.f13677c
            long r7 = r6.f13639c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x005b
            java.lang.String r3 = r3.f13638b
            java.lang.String r4 = r6.f13638b
            boolean r3 = com.google.android.gms.measurement.internal.se.c((java.lang.String) r3, (java.lang.String) r4)
            if (r3 == 0) goto L_0x005b
            com.google.android.gms.measurement.internal.kd r3 = r10.f13676b
            java.lang.String r3 = r3.f13637a
            com.google.android.gms.measurement.internal.kd r4 = r10.f13677c
            java.lang.String r4 = r4.f13637a
            boolean r3 = com.google.android.gms.measurement.internal.se.c((java.lang.String) r3, (java.lang.String) r4)
            if (r3 != 0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            if (r1 == 0) goto L_0x00bf
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.kd r3 = r10.f13677c
            com.google.android.gms.measurement.internal.C3191nd.a((com.google.android.gms.measurement.internal.C3175kd) r3, (android.os.Bundle) r1, (boolean) r2)
            com.google.android.gms.measurement.internal.kd r2 = r10.f13676b
            if (r2 == 0) goto L_0x0087
            java.lang.String r2 = r2.f13637a
            if (r2 == 0) goto L_0x0075
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L_0x0075:
            com.google.android.gms.measurement.internal.kd r2 = r10.f13676b
            java.lang.String r2 = r2.f13638b
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.kd r2 = r10.f13676b
            long r2 = r2.f13639c
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L_0x0087:
            com.google.android.gms.measurement.internal.nd r2 = r10.f13678d
            com.google.android.gms.measurement.internal.Ie r2 = r2.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.aa
            boolean r2 = r2.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.Ud r0 = r0.u()
            com.google.android.gms.measurement.internal.be r0 = r0.f13436e
            long r2 = r0.b()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.se r0 = r0.k()
            r0.a((android.os.Bundle) r1, (long) r2)
        L_0x00b2:
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.Hc r0 = r0.p()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.b((java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r1)
        L_0x00bf:
            com.google.android.gms.measurement.internal.nd r0 = r10.f13678d
            com.google.android.gms.measurement.internal.kd r1 = r10.f13677c
            r0.f13688c = r1
            com.google.android.gms.measurement.internal.od r0 = r0.r()
            com.google.android.gms.measurement.internal.kd r1 = r10.f13677c
            r0.a((com.google.android.gms.measurement.internal.C3175kd) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3186md.run():void");
    }
}
