package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.N;
import com.google.android.gms.ads.y;
import java.util.concurrent.Executor;

public final class YH implements AH<C0583Ar, C1925jT, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9336a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f9337b;

    /* renamed from: c  reason: collision with root package name */
    private final C1181Xr f9338c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f9339d;

    public YH(Context context, C1200Yk yk, C1181Xr xr, Executor executor) {
        this.f9336a = context;
        this.f9337b = yk;
        this.f9338c = xr;
        this.f9339d = executor;
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C1925jT, C2127mI> uHVar) {
        C2462qqa qqa = os.f8087a.f7415a.f8619e;
        C2462qqa qqa2 = qqa.n ? new C2462qqa(this.f9336a, y.a(qqa.f11918e, qqa.f11915b)) : XS.a(this.f9336a, ySVar.t);
        if (this.f9337b.f9458c < 4100000) {
            ((C1925jT) uHVar.f12306b).a(this.f9336a, qqa2, os.f8087a.f7415a.f8618d, ySVar.u.toString(), (C0831Kf) uHVar.f12307c);
        } else {
            ((C1925jT) uHVar.f12306b).a(this.f9336a, qqa2, os.f8087a.f7415a.f8618d, ySVar.u.toString(), M.a((N) ySVar.r), (C0831Kf) uHVar.f12307c);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C1181Xr xr = this.f9338c;
        C0974Ps ps = new C0974Ps(os, ySVar, uHVar.f12305a);
        View c2 = ((C1925jT) uHVar.f12306b).c();
        C1925jT jTVar = (C1925jT) uHVar.f12306b;
        jTVar.getClass();
        C3101zr a2 = xr.a(ps, new C0661Dr(c2, (C2313on) null, XH.a(jTVar), ySVar.t.get(0)));
        a2.j().a(((C1925jT) uHVar.f12306b).c());
        a2.a().a(new C2248nq((C1925jT) uHVar.f12306b), this.f9339d);
        ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.f());
        return a2.i();
    }
}
