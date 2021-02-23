package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class IH implements C2480rH<C1754gr> {

    /* renamed from: a  reason: collision with root package name */
    private final C1400br f7255a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7256b;

    /* renamed from: c  reason: collision with root package name */
    private final DC f7257c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7258d;

    public IH(C1400br brVar, Context context, Executor executor, DC dc) {
        this.f7256b = context;
        this.f7255a = brVar;
        this.f7258d = executor;
        this.f7257c = dc;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(OS os, C2988yS ySVar, Object obj) {
        C2462qqa a2 = XS.a(this.f7256b, ySVar.t);
        C2313on a3 = this.f7257c.a(a2, ySVar, os.f8088b.f7844b, ySVar.T);
        C1076Tq a4 = this.f7255a.a(new C0974Ps(os, ySVar, (String) null), new C1050Sq(a3.getView(), a3, XS.a(a2), ySVar.V, ySVar.Z, ySVar.J));
        a4.h().a(a3, false);
        a4.d().a(new KH(a3), C1252_k.f9704f);
        a4.h();
        GS gs = ySVar.r;
        return DY.a(FC.a(a3, gs.f7021b, gs.f7020a), new NH(a4), (Executor) C1252_k.f9704f);
    }

    public final boolean a(OS os, C2988yS ySVar) {
        GS gs = ySVar.r;
        return (gs == null || gs.f7020a == null) ? false : true;
    }

    public final LY<C1754gr> b(OS os, C2988yS ySVar) {
        return DY.a(DY.a(null), new LH(this, os, ySVar), this.f7258d);
    }
}
