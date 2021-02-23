package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zJ  reason: case insensitive filesystem */
public final class C3050zJ implements C2480rH<C2405qC> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13028a;

    /* renamed from: b  reason: collision with root package name */
    private final DC f13029b;

    /* renamed from: c  reason: collision with root package name */
    private final C2617tC f13030c;

    /* renamed from: d  reason: collision with root package name */
    private final SS f13031d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f13032e;

    /* renamed from: f  reason: collision with root package name */
    private final C1200Yk f13033f;

    public C3050zJ(Context context, C1200Yk yk, SS ss, Executor executor, C2617tC tCVar, DC dc) {
        this.f13028a = context;
        this.f13031d = ss;
        this.f13030c = tCVar;
        this.f13032e = executor;
        this.f13033f = yk;
        this.f13029b = dc;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2988yS ySVar, OS os, UC uc, Object obj) {
        LY<?> ly;
        C2988yS ySVar2 = ySVar;
        OS os2 = os;
        C2313on a2 = this.f13029b.a(this.f13031d.f8619e, ySVar2, os2.f8088b.f7844b, ySVar2.T);
        a2.d(ySVar2.Q);
        uc.a(this.f13028a, a2.getView());
        C1742gl glVar = new C1742gl();
        C2617tC tCVar = this.f13030c;
        C0974Ps ps = new C0974Ps(os2, ySVar2, (String) null);
        FJ fj = r1;
        FJ fj2 = new FJ(this.f13028a, this.f13029b, this.f13031d, this.f13033f, ySVar, glVar, a2);
        C2546sC a3 = tCVar.a(ps, new C2475rC(fj, a2));
        glVar.a(a3);
        C1655fd.a(a2, (C1868id) a3.l());
        a3.d().a(new AJ(a2), C1252_k.f9704f);
        a3.h().a(a2, true);
        if (!((Boolean) Qqa.e().a(F.Ee)).booleanValue() || !ySVar2.T) {
            a3.h();
            GS gs = ySVar2.r;
            ly = FC.a(a2, gs.f7021b, gs.f7020a);
        } else {
            ly = DY.a(null);
        }
        return DY.a(ly, new DJ(this, a2, ySVar2, a3), this.f13032e);
    }

    public final boolean a(OS os, C2988yS ySVar) {
        GS gs = ySVar.r;
        return (gs == null || gs.f7020a == null) ? false : true;
    }

    public final LY<C2405qC> b(OS os, C2988yS ySVar) {
        UC uc = new UC();
        LY<C2405qC> a2 = DY.a(DY.a(null), new C2979yJ(this, ySVar, os, uc), this.f13032e);
        a2.a(BJ.a(uc), this.f13032e);
        return a2;
    }
}
