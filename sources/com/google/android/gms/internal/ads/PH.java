package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.C0502h;
import java.util.concurrent.Executor;

public final class PH implements C2480rH<C0583Ar> {

    /* renamed from: a  reason: collision with root package name */
    private final C1181Xr f8194a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8195b;

    /* renamed from: c  reason: collision with root package name */
    private final DC f8196c;

    /* renamed from: d  reason: collision with root package name */
    private final SS f8197d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f8198e;

    /* renamed from: f  reason: collision with root package name */
    private final UW<C2988yS, C0502h> f8199f;

    public PH(C1181Xr xr, Context context, Executor executor, DC dc, SS ss, UW<C2988yS, C0502h> uw) {
        this.f8195b = context;
        this.f8194a = xr;
        this.f8198e = executor;
        this.f8196c = dc;
        this.f8197d = ss;
        this.f8199f = uw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(OS os, C2988yS ySVar, Object obj) {
        C2462qqa a2 = XS.a(this.f8195b, ySVar.t);
        C2313on a3 = this.f8196c.a(a2, ySVar, os.f8088b.f7844b, ySVar.T);
        a3.d(ySVar.Q);
        View vc = (!((Boolean) Qqa.e().a(F.f0if)).booleanValue() || !ySVar.ca) ? new VC(this.f8195b, a3.getView(), this.f8199f.apply(ySVar)) : C2323os.a(this.f8195b, a3.getView(), ySVar);
        C1181Xr xr = this.f8194a;
        C0974Ps ps = new C0974Ps(os, ySVar, (String) null);
        a3.getClass();
        C3101zr a4 = xr.a(ps, new C0661Dr(vc, a3, RH.a(a3), XS.a(a2)));
        a4.h().a(a3, false);
        a4.d().a(new QH(a3), C1252_k.f9704f);
        a4.h();
        GS gs = ySVar.r;
        LY<?> a5 = FC.a(a3, gs.f7021b, gs.f7020a);
        if (ySVar.H) {
            a3.getClass();
            a5.a(UH.a(a3), this.f8198e);
        }
        a5.a(new SH(this, a3), this.f8198e);
        return DY.a(a5, new WH(a4), (Executor) C1252_k.f9704f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2313on onVar) {
        onVar.A();
        C0813Jn e2 = onVar.e();
        C1905j jVar = this.f8197d.f8616b;
        if (jVar != null && e2 != null) {
            e2.b(jVar);
        }
    }

    public final boolean a(OS os, C2988yS ySVar) {
        GS gs = ySVar.r;
        return (gs == null || gs.f7020a == null) ? false : true;
    }

    public final LY<C0583Ar> b(OS os, C2988yS ySVar) {
        return DY.a(DY.a(null), new OH(this, os, ySVar), this.f8198e);
    }
}
