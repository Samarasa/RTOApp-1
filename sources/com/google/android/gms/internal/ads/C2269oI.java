package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oI  reason: case insensitive filesystem */
public final class C2269oI implements C2480rH<C1337ay> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11573a;

    /* renamed from: b  reason: collision with root package name */
    private final DC f11574b;

    /* renamed from: c  reason: collision with root package name */
    private final C0616By f11575c;

    /* renamed from: d  reason: collision with root package name */
    private final SS f11576d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11577e;

    /* renamed from: f  reason: collision with root package name */
    private final C1200Yk f11578f;

    public C2269oI(Context context, C1200Yk yk, SS ss, Executor executor, C0616By by, DC dc) {
        this.f11573a = context;
        this.f11576d = ss;
        this.f11575c = by;
        this.f11577e = executor;
        this.f11578f = yk;
        this.f11574b = dc;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2988yS ySVar, OS os, UC uc, Object obj) {
        LY<?> ly;
        C2313on a2 = this.f11574b.a(this.f11576d.f8619e, ySVar, os.f8088b.f7844b, ySVar.T);
        a2.d(ySVar.Q);
        uc.a(this.f11573a, a2.getView());
        C1742gl glVar = new C1742gl();
        C1479cy a3 = this.f11575c.a(new C0974Ps(os, ySVar, (String) null), new C1762gy(new C2765vI(this.f11573a, this.f11578f, glVar, ySVar, a2), a2));
        glVar.a(a3);
        a3.d().a(new C2694uI(a2), C1252_k.f9704f);
        a3.h().a(a2, true);
        if (!((Boolean) Qqa.e().a(F.Ee)).booleanValue() || !ySVar.T) {
            a3.h();
            GS gs = ySVar.r;
            ly = FC.a(a2, gs.f7021b, gs.f7020a);
        } else {
            ly = DY.a(null);
        }
        return DY.a(ly, new C2552sI(this, a2, ySVar, a3), this.f11577e);
    }

    public final boolean a(OS os, C2988yS ySVar) {
        GS gs = ySVar.r;
        return (gs == null || gs.f7020a == null) ? false : true;
    }

    public final LY<C1337ay> b(OS os, C2988yS ySVar) {
        UC uc = new UC();
        LY<C1337ay> a2 = DY.a(DY.a(null), new C2481rI(this, ySVar, os, uc), this.f11577e);
        a2.a(C2411qI.a(uc), this.f11577e);
        return a2;
    }
}
