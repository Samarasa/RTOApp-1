package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.pJ  reason: case insensitive filesystem */
public final class C2341pJ implements AH<C2405qC, C0624Cg, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11691a;

    /* renamed from: b  reason: collision with root package name */
    private final C2617tC f11692b;

    public C2341pJ(Context context, C2617tC tCVar) {
        this.f11691a = context;
        this.f11692b = tCVar;
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C0624Cg, C2127mI> uHVar) {
        try {
            ((C0624Cg) uHVar.f12306b).k(ySVar.U);
            if (os.f8087a.f7415a.n.f6849a == KS.f7552c) {
                ((C0624Cg) uHVar.f12306b).b(ySVar.O, ySVar.u.toString(), os.f8087a.f7415a.f8618d, b.a(this.f11691a), new C2482rJ(this, uHVar), (C0831Kf) uHVar.f12307c);
            } else {
                ((C0624Cg) uHVar.f12306b).a(ySVar.O, ySVar.u.toString(), os.f8087a.f7415a.f8618d, b.a(this.f11691a), (C0598Bg) new C2482rJ(this, uHVar), (C0831Kf) uHVar.f12307c);
            }
        } catch (RemoteException e2) {
            fa.e("Remote exception loading a rewarded RTB ad", e2);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C2907xI xIVar = new C2907xI(ySVar, (C0624Cg) uHVar.f12306b, true);
        C2546sC a2 = this.f11692b.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C2475rC(xIVar));
        xIVar.a(a2.d());
        ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.n());
        return a2.k();
    }
}
