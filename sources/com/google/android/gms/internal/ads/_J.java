package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class _J implements C2480rH<C0583Ar> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9640a;

    /* renamed from: b  reason: collision with root package name */
    private final C1181Xr f9641b;

    /* renamed from: c  reason: collision with root package name */
    private final C1508da f9642c;

    /* renamed from: d  reason: collision with root package name */
    private final PY f9643d;

    /* renamed from: e  reason: collision with root package name */
    private final VU f9644e;

    public _J(Context context, C1181Xr xr, VU vu, PY py, C1508da daVar) {
        this.f9640a = context;
        this.f9641b = xr;
        this.f9644e = vu;
        this.f9643d = py;
        this.f9642c = daVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(V v) {
        this.f9642c.a(v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.OS r1, com.google.android.gms.internal.ads.C2988yS r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.da r1 = r0.f9642c
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads._J.a(com.google.android.gms.internal.ads.OS, com.google.android.gms.internal.ads.yS):boolean");
    }

    public final LY<C0583Ar> b(OS os, C2988yS ySVar) {
        C3101zr a2 = this.f9641b.a(new C0974Ps(os, ySVar, (String) null), (C0661Dr) new C1279aK(this, new View(this.f9640a), (C2313on) null, ZJ.f9535a, ySVar.t.get(0)));
        C1492dK k = a2.k();
        GS gs = ySVar.r;
        return this.f9644e.a(SU.CUSTOM_RENDER_SYN).a((EU) new C1350bK(this, new V(k, gs.f7021b, gs.f7020a)), this.f9643d).a(SU.CUSTOM_RENDER_ACK).a(DY.a(a2.i())).a();
    }
}
