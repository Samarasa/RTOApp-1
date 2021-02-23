package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ay  reason: case insensitive filesystem */
public final class C1337ay extends C3103zs {

    /* renamed from: h  reason: collision with root package name */
    private final Context f9862h;
    private final WeakReference<C2313on> i;
    private final C2257nx j;
    private final C0876Ly k;
    private final C1052Ss l;
    private final AV m;
    private final C0586Au n;
    private boolean o = false;

    C1337ay(C3032ys ysVar, Context context, C2313on onVar, C2257nx nxVar, C0876Ly ly, C1052Ss ss, AV av, C0586Au au) {
        super(ysVar);
        this.f9862h = context;
        this.i = new WeakReference<>(onVar);
        this.j = nxVar;
        this.k = ly;
        this.l = ss;
        this.m = av;
        this.n = au;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.ia
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r0 = r4.f9862h
            boolean r0 = com.google.android.gms.ads.internal.util.oa.g((android.content.Context) r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.C1018Rk.d(r0)
            com.google.android.gms.internal.ads.Au r0 = r4.n
            r0.L()
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.ja
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.AV r0 = r4.m
            com.google.android.gms.internal.ads.OS r3 = r4.f13128a
            com.google.android.gms.internal.ads.MS r3 = r3.f8088b
            com.google.android.gms.internal.ads.DS r3 = r3.f7844b
            java.lang.String r3 = r3.f6547b
            r0.a(r3)
            goto L_0x004f
        L_0x0049:
            boolean r0 = r4.o
            if (r0 != 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0053
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.nx r0 = r4.j
            r0.Y()
            com.google.android.gms.internal.ads.Ly r0 = r4.k     // Catch:{ Oy -> 0x0067 }
            android.content.Context r3 = r4.f9862h     // Catch:{ Oy -> 0x0067 }
            r0.a(r5, r3)     // Catch:{ Oy -> 0x0067 }
            com.google.android.gms.internal.ads.nx r5 = r4.j     // Catch:{ Oy -> 0x0067 }
            r5.X()     // Catch:{ Oy -> 0x0067 }
            r4.o = r1
            return r1
        L_0x0067:
            r5 = move-exception
            com.google.android.gms.internal.ads.Au r0 = r4.n
            r0.a(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1337ay.a(boolean):boolean");
    }

    public final void finalize() {
        try {
            C2313on onVar = (C2313on) this.i.get();
            if (((Boolean) Qqa.e().a(F.Ye)).booleanValue()) {
                if (!this.o && onVar != null) {
                    PY py = C1252_k.f9703e;
                    onVar.getClass();
                    py.execute(C1620ey.a(onVar));
                }
            } else if (onVar != null) {
                onVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.l.a();
    }
}
