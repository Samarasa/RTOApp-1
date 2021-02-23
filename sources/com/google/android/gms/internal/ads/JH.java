package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.ads.internal.p;

final class JH implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7386a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f7387b;

    /* renamed from: c  reason: collision with root package name */
    private final LY<C1895ir> f7388c;

    /* renamed from: d  reason: collision with root package name */
    private final C2988yS f7389d;

    /* renamed from: e  reason: collision with root package name */
    private final C2313on f7390e;

    /* renamed from: f  reason: collision with root package name */
    private final SS f7391f;

    JH(Context context, C1200Yk yk, LY<C1895ir> ly, C2988yS ySVar, C2313on onVar, SS ss) {
        this.f7386a = context;
        this.f7387b = yk;
        this.f7388c = ly;
        this.f7389d = ySVar;
        this.f7390e = onVar;
        this.f7391f = ss;
    }

    public final void a(boolean z, Context context) {
        int i;
        this.f7390e.c(true);
        i iVar = new i(true, true, false, 0.0f, -1, z, this.f7389d.J, false);
        p.b();
        C3109zy j = ((C1895ir) DY.b(this.f7388c)).j();
        C2313on onVar = this.f7390e;
        int i2 = this.f7389d.L;
        if (i2 == -1) {
            C3100zqa zqa = this.f7391f.j;
            if (zqa != null) {
                int i3 = zqa.f13127a;
                if (i3 == 1) {
                    p.e();
                    i = 7;
                } else if (i3 == 2) {
                    p.e();
                    i = 6;
                }
                C1200Yk yk = this.f7387b;
                C2988yS ySVar = this.f7389d;
                String str = ySVar.A;
                GS gs = ySVar.r;
                Context context2 = context;
                com.google.android.gms.ads.internal.overlay.p.a(context2, new AdOverlayInfoParcel((C1540dqa) null, (q) j, (v) null, onVar, i, yk, str, iVar, gs.f7021b, gs.f7020a), true);
            }
            C1018Rk.a("Error setting app open orientation; no targeting orientation available.");
            i2 = this.f7389d.L;
        }
        i = i2;
        C1200Yk yk2 = this.f7387b;
        C2988yS ySVar2 = this.f7389d;
        String str2 = ySVar2.A;
        GS gs2 = ySVar2.r;
        Context context22 = context;
        com.google.android.gms.ads.internal.overlay.p.a(context22, new AdOverlayInfoParcel((C1540dqa) null, (q) j, (v) null, onVar, i, yk2, str2, iVar, gs2.f7021b, gs2.f7020a), true);
    }
}
