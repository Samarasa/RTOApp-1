package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.c.b;

public final class SI implements AH<C3110zz, C0624Cg, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8594a;

    /* renamed from: b  reason: collision with root package name */
    private final C1240Zy f8595b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C1195Yf f8596c;

    public SI(Context context, C1240Zy zy) {
        this.f8594a = context;
        this.f8595b = zy;
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C0624Cg, C2127mI> uHVar) {
        try {
            ((C0624Cg) uHVar.f12306b).k(ySVar.U);
            ((C0624Cg) uHVar.f12306b).a(ySVar.O, ySVar.u.toString(), os.f8087a.f7415a.f8618d, b.a(this.f8594a), (C2866wg) new VI(this, uHVar), (C0831Kf) uHVar.f12307c);
        } catch (RemoteException e2) {
            throw new WS(e2);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        if (os.f8087a.f7415a.f8621g.contains(Integer.toString(6))) {
            C0877Lz a2 = C0877Lz.a(this.f8596c);
            if (os.f8087a.f7415a.f8621g.contains(Integer.toString(a2.o()))) {
                C0903Mz a3 = this.f8595b.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C1189Xz(a2), new JA((C1039Sf) null, (C1013Rf) null, this.f8596c));
                ((C2127mI) uHVar.f12307c).a((C0831Kf) a3.g());
                return a3.h();
            }
            throw new C1986kJ(C2351pT.INTERNAL_ERROR, "No corresponding native ad listener");
        }
        throw new C1986kJ(C2351pT.INVALID_REQUEST, "Unified must be used for RTB.");
    }
}
