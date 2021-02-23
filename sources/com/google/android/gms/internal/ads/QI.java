package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.N;
import java.util.concurrent.Executor;

public final class QI implements AH<C3110zz, C1925jT, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8313a;

    /* renamed from: b  reason: collision with root package name */
    private final C1240Zy f8314b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f8315c;

    public QI(Context context, C1240Zy zy, Executor executor) {
        this.f8313a = context;
        this.f8314b = zy;
        this.f8315c = executor;
    }

    private static boolean a(OS os, int i) {
        return os.f8087a.f7415a.f8621g.contains(Integer.toString(i));
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C1925jT, C2127mI> uHVar) {
        SS ss = os.f8087a.f7415a;
        ((C1925jT) uHVar.f12306b).a(this.f8313a, os.f8087a.f7415a.f8618d, ySVar.u.toString(), M.a((N) ySVar.r), (C0831Kf) uHVar.f12307c, ss.i, ss.f8621g);
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C0877Lz lz;
        C1013Rf i = ((C1925jT) uHVar.f12306b).i();
        C1039Sf j = ((C1925jT) uHVar.f12306b).j();
        C1195Yf l = ((C1925jT) uHVar.f12306b).l();
        if (l != null && a(os, 6)) {
            lz = C0877Lz.a(l);
        } else if (i != null && a(os, 6)) {
            lz = C0877Lz.b(i);
        } else if (i != null && a(os, 2)) {
            lz = C0877Lz.a(i);
        } else if (j != null && a(os, 6)) {
            lz = C0877Lz.b(j);
        } else if (j == null || !a(os, 1)) {
            throw new C1986kJ(C2351pT.INTERNAL_ERROR, "No native ad mappers");
        } else {
            lz = C0877Lz.a(j);
        }
        if (os.f8087a.f7415a.f8621g.contains(Integer.toString(lz.o()))) {
            C0903Mz a2 = this.f8314b.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C1189Xz(lz), new JA(j, i, l));
            ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.f());
            a2.a().a(new C2248nq((C1925jT) uHVar.f12306b), this.f8315c);
            return a2.h();
        }
        throw new C1986kJ(C2351pT.INTERNAL_ERROR, "No corresponding native ad listener");
    }
}
