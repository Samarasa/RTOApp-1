package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class DH implements C2480rH<C2463qr> {

    /* renamed from: a  reason: collision with root package name */
    private final C2037kr f6515a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6516b;

    /* renamed from: c  reason: collision with root package name */
    private final DC f6517c;

    /* renamed from: d  reason: collision with root package name */
    private final SS f6518d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f6519e;

    /* renamed from: f  reason: collision with root package name */
    private final C1200Yk f6520f;

    public DH(C2037kr krVar, Context context, Executor executor, DC dc, SS ss, C1200Yk yk) {
        this.f6516b = context;
        this.f6515a = krVar;
        this.f6519e = executor;
        this.f6517c = dc;
        this.f6518d = ss;
        this.f6520f = yk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2988yS ySVar, OS os, UC uc, Object obj) {
        LY<?> ly;
        C2313on a2 = this.f6517c.a(this.f6518d.f8619e, ySVar, os.f8088b.f7844b, ySVar.T);
        a2.d(ySVar.Q);
        uc.a(this.f6516b, a2.getView());
        C1742gl glVar = new C1742gl();
        C1895ir a3 = this.f6515a.a(new C0974Ps(os, ySVar, (String) null), new C1762gy(new JH(this.f6516b, this.f6520f, glVar, ySVar, a2, this.f6518d), a2), new C2108lr(ySVar.V));
        a3.i().a(a2, false);
        glVar.a(a3);
        a3.d().a(new EH(a2), C1252_k.f9704f);
        if (!((Boolean) Qqa.e().a(F.Ee)).booleanValue() || !ySVar.T) {
            a3.i();
            GS gs = ySVar.r;
            ly = FC.a(a2, gs.f7021b, gs.f7020a);
        } else {
            ly = DY.a(null);
        }
        return DY.a(ly, new HH(this, a2, ySVar, a3), this.f6519e);
    }

    public final boolean a(OS os, C2988yS ySVar) {
        GS gs = ySVar.r;
        return (gs == null || gs.f7020a == null) ? false : true;
    }

    public final LY<C2463qr> b(OS os, C2988yS ySVar) {
        UC uc = new UC();
        LY<C2463qr> a2 = DY.a(DY.a(null), new CH(this, ySVar, os, uc), this.f6519e);
        a2.a(FH.a(uc), this.f6519e);
        return a2;
    }
}
