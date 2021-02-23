package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.B;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.internal.ads.C0684Eo;
import com.google.android.gms.internal.ads.C0737Gp;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Fo  reason: case insensitive filesystem */
public abstract class C0710Fo implements C1681fq {

    /* renamed from: a  reason: collision with root package name */
    private static C0710Fo f6930a;

    @Deprecated
    public static C0710Fo a(Context context, int i) {
        synchronized (C0710Fo.class) {
            if (f6930a == null) {
                return a(new C1200Yk(203404000, i, true, false), context, (C0737Gp.a) new C1325ap());
            }
            C0710Fo fo = f6930a;
            return fo;
        }
    }

    public static C0710Fo a(Context context, C0675Ef ef, int i) {
        C0710Fo a2 = a(context, i);
        a2.f().a(ef);
        return a2;
    }

    @Deprecated
    private static C0710Fo a(C1200Yk yk, Context context, C0737Gp.a aVar) {
        C0710Fo fo;
        synchronized (C0710Fo.class) {
            if (f6930a == null) {
                C2813vp vpVar = new C2813vp();
                C0684Eo.a aVar2 = new C0684Eo.a();
                aVar2.a(yk);
                aVar2.a(context);
                vpVar.a(new C0684Eo(aVar2));
                vpVar.a(new C0737Gp(aVar));
                f6930a = vpVar.a();
                F.a(context);
                p.g().a(context, yk);
                p.i().a(context);
                p.c().a(context);
                p.c().b(context);
                p.c();
                oa.q(context);
                B.a(context);
                p.f().a(context);
                p.x().a(context);
                if (((Boolean) Qqa.e().a(F.ze)).booleanValue()) {
                    new _G(context, yk, new Soa(new Woa(context)), new JG(new HG(context), f6930a.d())).a();
                }
            }
            fo = f6930a;
        }
        return fo;
    }

    /* access modifiers changed from: protected */
    public abstract C1355bP a(PP pp);

    public final C1355bP a(C2515ri riVar, int i) {
        return a(new PP(riVar, i));
    }

    public abstract Executor a();

    public abstract ScheduledExecutorService b();

    public abstract Executor c();

    public abstract PY d();

    public abstract C0587Av e();

    public abstract C1555eD f();

    public abstract C0945Op g();

    public abstract C1129Vr h();

    public abstract C1329ar i();

    public abstract C2250nr j();

    public abstract C1993kQ k();

    public abstract C0746Gy l();

    public abstract GR m();

    public abstract C1409bz n();

    public abstract C2830wC o();

    public abstract C2633tS p();

    public abstract C2697uL q();

    public abstract C2626tL r();

    public abstract C2410qH s();

    public abstract C1855iT<VB> t();
}
