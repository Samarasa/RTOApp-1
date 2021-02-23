package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.c.b;

public final class BI implements AH<C1337ay, C0624Cg, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6259a;

    /* renamed from: b  reason: collision with root package name */
    private final C0616By f6260b;

    public BI(Context context, C0616By by) {
        this.f6259a = context;
        this.f6260b = by;
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C0624Cg, C2127mI> uHVar) {
        try {
            ((C0624Cg) uHVar.f12306b).k(ySVar.U);
            ((C0624Cg) uHVar.f12306b).a(ySVar.O, ySVar.u.toString(), os.f8087a.f7415a.f8618d, b.a(this.f6259a), (C2795vg) new DI(this, uHVar), (C0831Kf) uHVar.f12307c);
        } catch (RemoteException e2) {
            throw new WS(e2);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C2907xI xIVar = new C2907xI(ySVar, (C0624Cg) uHVar.f12306b, false);
        C1479cy a2 = this.f6260b.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C1762gy(xIVar));
        xIVar.a(a2.d());
        ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.g());
        return a2.j();
    }
}
