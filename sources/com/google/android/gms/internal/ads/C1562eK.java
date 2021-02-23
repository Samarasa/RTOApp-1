package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.g;

/* renamed from: com.google.android.gms.internal.ads.eK  reason: case insensitive filesystem */
public final class C1562eK<AdT> implements C2480rH<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final C1508da f10244a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f10245b;

    /* renamed from: c  reason: collision with root package name */
    private final VU f10246c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1916jK<AdT> f10247d;

    public C1562eK(VU vu, PY py, C1508da daVar, C1916jK<AdT> jKVar) {
        this.f10246c = vu;
        this.f10245b = py;
        this.f10244a = daVar;
        this.f10247d = jKVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(V v) {
        this.f10244a.a(v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.OS r1, com.google.android.gms.internal.ads.C2988yS r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.da r1 = r0.f10244a
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.GS r1 = r2.r
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f7020a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1562eK.a(com.google.android.gms.internal.ads.OS, com.google.android.gms.internal.ads.yS):boolean");
    }

    public final LY<AdT> b(OS os, C2988yS ySVar) {
        C1742gl glVar = new C1742gl();
        C2129mK mKVar = new C2129mK();
        mKVar.a((g) new C1704gK(this, glVar, os, ySVar, mKVar));
        GS gs = ySVar.r;
        return this.f10246c.a(SU.CUSTOM_RENDER_SYN).a((EU) new C1775hK(this, new V(mKVar, gs.f7021b, gs.f7020a)), this.f10245b).a(SU.CUSTOM_RENDER_ACK).a(glVar).a();
    }
}
