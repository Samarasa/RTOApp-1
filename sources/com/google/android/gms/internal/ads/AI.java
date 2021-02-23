package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.N;
import java.util.concurrent.Executor;

public final class AI implements AH<C1337ay, C1925jT, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6095a;

    /* renamed from: b  reason: collision with root package name */
    private final C0616By f6096b;

    /* renamed from: c  reason: collision with root package name */
    private final C1200Yk f6097c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f6098d;

    public AI(Context context, C1200Yk yk, C0616By by, Executor executor) {
        this.f6095a = context;
        this.f6097c = yk;
        this.f6096b = by;
        this.f6098d = executor;
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C1925jT, C2127mI> uHVar) {
        if (this.f6097c.f9458c < 4100000) {
            ((C1925jT) uHVar.f12306b).a(this.f6095a, os.f8087a.f7415a.f8618d, ySVar.u.toString(), (C0831Kf) uHVar.f12307c);
        } else {
            ((C1925jT) uHVar.f12306b).a(this.f6095a, os.f8087a.f7415a.f8618d, ySVar.u.toString(), M.a((N) ySVar.r), (C0831Kf) uHVar.f12307c);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C1479cy a2 = this.f6096b.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C1762gy(new C3049zI(uHVar)));
        a2.a().a(new C2248nq((C1925jT) uHVar.f12306b), this.f6098d);
        ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.f());
        return a2.j();
    }
}
