package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class FJ implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6822a;

    /* renamed from: b  reason: collision with root package name */
    private final DC f6823b;

    /* renamed from: c  reason: collision with root package name */
    private final SS f6824c;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f6825d;

    /* renamed from: e  reason: collision with root package name */
    private final C2988yS f6826e;

    /* renamed from: f  reason: collision with root package name */
    private final LY<C2546sC> f6827f;

    /* renamed from: g  reason: collision with root package name */
    private final C2313on f6828g;

    private FJ(Context context, DC dc, SS ss, C1200Yk yk, C2988yS ySVar, LY<C2546sC> ly, C2313on onVar) {
        this.f6822a = context;
        this.f6823b = dc;
        this.f6824c = ss;
        this.f6825d = yk;
        this.f6826e = ySVar;
        this.f6827f = ly;
        this.f6828g = onVar;
    }

    public final void a(boolean z, Context context) {
        C2313on onVar;
        C2546sC sCVar = (C2546sC) DY.b(this.f6827f);
        try {
            C2988yS ySVar = this.f6826e;
            if (this.f6828g.F()) {
                if (((Boolean) Qqa.e().a(F.pa)).booleanValue()) {
                    C2313on a2 = this.f6823b.a(this.f6824c.f8619e);
                    C1655fd.a(a2, (C1868id) sCVar.l());
                    UC uc = new UC();
                    uc.a(this.f6822a, a2.getView());
                    sCVar.h().a(a2, true);
                    a2.t().a((Cdo) new EJ(uc, a2));
                    C1323ao t = a2.t();
                    a2.getClass();
                    t.a(HJ.a(a2));
                    a2.a(ySVar.r.f7021b, ySVar.r.f7020a, (String) null);
                    onVar = a2;
                    onVar.c(true);
                    p.c();
                    boolean m = oa.m(this.f6822a);
                    C2988yS ySVar2 = this.f6826e;
                    i iVar = new i(false, m, false, 0.0f, -1, z, ySVar2.J, ySVar2.K);
                    p.b();
                    C3109zy i = sCVar.i();
                    C2988yS ySVar3 = this.f6826e;
                    int i2 = ySVar3.L;
                    C1200Yk yk = this.f6825d;
                    String str = ySVar3.A;
                    GS gs = ySVar3.r;
                    String str2 = gs.f7021b;
                    com.google.android.gms.ads.internal.overlay.p.a(context, new AdOverlayInfoParcel((C1540dqa) null, (q) i, (v) null, onVar, i2, yk, str, iVar, str2, gs.f7020a), true);
                }
            }
            onVar = this.f6828g;
            onVar.c(true);
            p.c();
            boolean m2 = oa.m(this.f6822a);
            C2988yS ySVar22 = this.f6826e;
            i iVar2 = new i(false, m2, false, 0.0f, -1, z, ySVar22.J, ySVar22.K);
            p.b();
            C3109zy i3 = sCVar.i();
            C2988yS ySVar32 = this.f6826e;
            int i22 = ySVar32.L;
            C1200Yk yk2 = this.f6825d;
            String str3 = ySVar32.A;
            GS gs2 = ySVar32.r;
            String str22 = gs2.f7021b;
            com.google.android.gms.ads.internal.overlay.p.a(context, new AdOverlayInfoParcel((C1540dqa) null, (q) i3, (v) null, onVar, i22, yk2, str3, iVar2, str22, gs2.f7020a), true);
        } catch (C0605Bn e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }
}
