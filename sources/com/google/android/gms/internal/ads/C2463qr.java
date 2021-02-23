package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qr  reason: case insensitive filesystem */
public final class C2463qr extends C3103zs {

    /* renamed from: h  reason: collision with root package name */
    private final C2313on f11922h;
    private final int i;
    private final C1258_q j;
    private final C0876Ly k;
    private boolean l = false;

    C2463qr(C3032ys ysVar, C2313on onVar, int i2, C1258_q _qVar, C0876Ly ly) {
        super(ysVar);
        this.f11922h = onVar;
        this.i = i2;
        this.j = _qVar;
        this.k = ly;
    }

    public final void a() {
        super.a();
        C2313on onVar = this.f11922h;
        if (onVar != null) {
            onVar.destroy();
        }
    }

    public final void a(long j2, int i2) {
        this.j.a(j2, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e A[SYNTHETIC, Splitter:B:16:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.app.Activity r6, com.google.android.gms.internal.ads.C2387poa r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.ia
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.ads.internal.p.c()
            boolean r0 = com.google.android.gms.ads.internal.util.oa.g((android.content.Context) r6)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.C1018Rk.d(r0)
            com.google.android.gms.internal.ads.pT r0 = com.google.android.gms.internal.ads.C2351pT.APP_NOT_FOREGROUND
            r3 = 0
            com.google.android.gms.internal.ads.hqa r0 = com.google.android.gms.internal.ads.C2209nT.a(r0, r3, r3)
            r7.i(r0)
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.ja
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.AV r0 = new com.google.android.gms.internal.ads.AV
            android.content.Context r3 = r6.getApplicationContext()
            com.google.android.gms.ads.internal.util.Q r4 = com.google.android.gms.ads.internal.p.q()
            android.os.Looper r4 = r4.b()
            r0.<init>(r3, r4)
            com.google.android.gms.internal.ads.OS r3 = r5.f13128a
            com.google.android.gms.internal.ads.MS r3 = r3.f8088b
            com.google.android.gms.internal.ads.DS r3 = r3.f7844b
            java.lang.String r3 = r3.f6547b
            r0.a(r3)
            goto L_0x006a
        L_0x005b:
            boolean r0 = r5.l
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.C1018Rk.d(r0)
        L_0x0064:
            boolean r0 = r5.l
            if (r0 != 0) goto L_0x006a
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            if (r0 != 0) goto L_0x006e
            return
        L_0x006e:
            com.google.android.gms.internal.ads.Ly r0 = r5.k     // Catch:{ Oy -> 0x0076 }
            r0.a(r2, r6)     // Catch:{ Oy -> 0x0076 }
            r5.l = r1
            return
        L_0x0076:
            r6 = move-exception
            com.google.android.gms.internal.ads.hqa r6 = com.google.android.gms.internal.ads.C2209nT.a(r6)
            r7.i(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2463qr.a(android.app.Activity, com.google.android.gms.internal.ads.poa):void");
    }

    public final void a(C1536doa doa) {
        C2313on onVar = this.f11922h;
        if (onVar != null) {
            onVar.a(doa);
        }
    }

    public final int g() {
        return this.i;
    }
}
