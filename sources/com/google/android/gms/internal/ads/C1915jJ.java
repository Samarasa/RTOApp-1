package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.jJ  reason: case insensitive filesystem */
public final class C1915jJ<AdT> implements C2214nY<OS, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final VU f10899a;

    /* renamed from: b  reason: collision with root package name */
    private final C2821vu f10900b;

    /* renamed from: c  reason: collision with root package name */
    private final C1503dV f10901c;

    /* renamed from: d  reason: collision with root package name */
    private final C1644fV f10902d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f10903e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f10904f;

    /* renamed from: g  reason: collision with root package name */
    private final C0584As<AdT> f10905g;

    /* renamed from: h  reason: collision with root package name */
    private final C1703gJ f10906h;
    private final C3048zH i;

    public C1915jJ(VU vu, C1703gJ gJVar, C2821vu vuVar, C1503dV dVVar, C1644fV fVVar, C0584As<AdT> as, Executor executor, ScheduledExecutorService scheduledExecutorService, C3048zH zHVar) {
        this.f10899a = vu;
        this.f10906h = gJVar;
        this.f10900b = vuVar;
        this.f10901c = dVVar;
        this.f10902d = fVVar;
        this.f10905g = as;
        this.f10903e = executor;
        this.f10904f = scheduledExecutorService;
        this.i = zHVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(OS os, C2988yS ySVar, C2480rH rHVar, Throwable th) {
        C1703gJ gJVar = this.f10906h;
        DS ds = os.f8088b.f7844b;
        LY a2 = DY.a(rHVar.b(os, ySVar), (long) ySVar.M, TimeUnit.MILLISECONDS, this.f10904f);
        gJVar.a(ds, ySVar, a2);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.LY a(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.OS r10 = (com.google.android.gms.internal.ads.OS) r10
            com.google.android.gms.internal.ads.MS r0 = r10.f8088b
            com.google.android.gms.internal.ads.DS r0 = r0.f7844b
            int r0 = r0.f6550e
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0044
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.Md
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "No fill."
            goto L_0x0046
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0046
        L_0x0030:
            r3 = 46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Received error HTTP response code: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "No ad config."
        L_0x0046:
            com.google.android.gms.internal.ads.MS r3 = r10.f8088b
            com.google.android.gms.internal.ads.DS r3 = r3.f7844b
            com.google.android.gms.internal.ads.AS r3 = r3.f6553h
            if (r3 == 0) goto L_0x0052
            java.lang.String r0 = r3.a()
        L_0x0052:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.F.Ef
            com.google.android.gms.internal.ads.B r4 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.MS r3 = r10.f8088b
            com.google.android.gms.internal.ads.DS r3 = r3.f7844b
            int r3 = r3.f6550e
            if (r3 < r1) goto L_0x006e
            if (r3 < r2) goto L_0x007a
        L_0x006e:
            com.google.android.gms.internal.ads.kJ r10 = new com.google.android.gms.internal.ads.kJ
            com.google.android.gms.internal.ads.pT r1 = com.google.android.gms.internal.ads.C2351pT.NO_FILL
            r10.<init>(r1, r0)
            com.google.android.gms.internal.ads.LY r10 = com.google.android.gms.internal.ads.DY.a((java.lang.Throwable) r10)
            return r10
        L_0x007a:
            com.google.android.gms.internal.ads.VU r1 = r9.f10899a
            com.google.android.gms.internal.ads.SU r2 = com.google.android.gms.internal.ads.SU.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.LU r1 = r1.a(r2)
            com.google.android.gms.internal.ads.kJ r2 = new com.google.android.gms.internal.ads.kJ
            com.google.android.gms.internal.ads.pT r3 = com.google.android.gms.internal.ads.C2351pT.NO_FILL
            r2.<init>(r3, r0)
            com.google.android.gms.internal.ads.LY r0 = com.google.android.gms.internal.ads.DY.a((java.lang.Throwable) r2)
            com.google.android.gms.internal.ads.NU r0 = r1.a(r0)
            com.google.android.gms.internal.ads.DU r0 = r0.a()
            com.google.android.gms.internal.ads.vu r1 = r9.f10900b
            com.google.android.gms.internal.ads.qq r2 = new com.google.android.gms.internal.ads.qq
            com.google.android.gms.internal.ads.fV r3 = r9.f10902d
            com.google.android.gms.internal.ads.dV r4 = r9.f10901c
            r2.<init>(r10, r3, r4)
            java.util.concurrent.Executor r3 = r9.f10903e
            r1.a(r2, r3)
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.F.Ff
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L_0x0107
            com.google.android.gms.internal.ads.MS r1 = r10.f8088b
            java.util.List<com.google.android.gms.internal.ads.yS> r1 = r1.f7843a
            java.util.Iterator r1 = r1.iterator()
        L_0x00c0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0107
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.yS r3 = (com.google.android.gms.internal.ads.C2988yS) r3
            com.google.android.gms.internal.ads.zH r4 = r9.i
            r4.a(r3)
            java.util.List<java.lang.String> r4 = r3.f12914a
            java.util.Iterator r4 = r4.iterator()
        L_0x00d7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f5
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.As<AdT> r6 = r9.f10905g
            int r7 = r3.f12915b
            com.google.android.gms.internal.ads.rH r5 = r6.a(r7, r5)
            if (r5 == 0) goto L_0x00d7
            boolean r5 = r5.a(r10, r3)
            if (r5 == 0) goto L_0x00d7
            r4 = 1
            goto L_0x00f6
        L_0x00f5:
            r4 = 0
        L_0x00f6:
            if (r4 != 0) goto L_0x00c0
            com.google.android.gms.internal.ads.zH r4 = r9.i
            r5 = 0
            com.google.android.gms.internal.ads.pT r7 = com.google.android.gms.internal.ads.C2351pT.INTERNAL_ERROR
            r8 = 0
            com.google.android.gms.internal.ads.hqa r7 = com.google.android.gms.internal.ads.C2209nT.a(r7, r8, r8)
            r4.a(r3, r5, r7)
            goto L_0x00c0
        L_0x0107:
            com.google.android.gms.internal.ads.MS r1 = r10.f8088b
            java.util.List<com.google.android.gms.internal.ads.yS> r1 = r1.f7843a
            java.util.Iterator r1 = r1.iterator()
        L_0x010f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x017e
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.yS r3 = (com.google.android.gms.internal.ads.C2988yS) r3
            java.util.List<java.lang.String> r4 = r3.f12914a
            java.util.Iterator r4 = r4.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.As<AdT> r6 = r9.f10905g
            int r7 = r3.f12915b
            com.google.android.gms.internal.ads.rH r6 = r6.a(r7, r5)
            if (r6 == 0) goto L_0x0121
            boolean r7 = r6.a(r10, r3)
            if (r7 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.VU r4 = r9.f10899a
            com.google.android.gms.internal.ads.SU r7 = com.google.android.gms.internal.ads.SU.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.NU r0 = r4.a(r7, r0)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            int r4 = r4 + 26
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            java.lang.String r4 = "render-config-"
            r7.append(r4)
            r7.append(r2)
            java.lang.String r4 = "-"
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            com.google.android.gms.internal.ads.NU r0 = r0.a((java.lang.String) r4)
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.mJ r5 = new com.google.android.gms.internal.ads.mJ
            r5.<init>(r9, r10, r3, r6)
            com.google.android.gms.internal.ads.NU r0 = r0.a(r4, r5)
            com.google.android.gms.internal.ads.DU r0 = r0.a()
        L_0x017b:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x017e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1915jJ.a(java.lang.Object):com.google.android.gms.internal.ads.LY");
    }
}
