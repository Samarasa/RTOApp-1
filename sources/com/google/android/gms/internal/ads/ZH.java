package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import c.b.b.b.c.b;

public final class ZH implements AH<C0583Ar, C0624Cg, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9528a;

    /* renamed from: b  reason: collision with root package name */
    private final C1181Xr f9529b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f9530c;

    public ZH(Context context, C1181Xr xr) {
        this.f9528a = context;
        this.f9529b = xr;
    }

    static final /* synthetic */ Sra a(C2693uH uHVar) {
        try {
            return ((C0624Cg) uHVar.f12306b).getVideoController();
        } catch (RemoteException e2) {
            throw new WS(e2);
        }
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C0624Cg, C2127mI> uHVar) {
        try {
            ((C0624Cg) uHVar.f12306b).k(ySVar.U);
            ((C0624Cg) uHVar.f12306b).a(ySVar.O, ySVar.u.toString(), os.f8087a.f7415a.f8618d, b.a(this.f9528a), new C1490dI(this, uHVar), (C0831Kf) uHVar.f12307c, os.f8087a.f7415a.f8619e);
        } catch (RemoteException e2) {
            throw new WS(e2);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C3101zr a2 = this.f9529b.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C0661Dr(this.f9530c, (C2313on) null, new C1348bI(uHVar), ySVar.t.get(0)));
        a2.j().a(this.f9530c);
        ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.g());
        return a2.i();
    }
}
