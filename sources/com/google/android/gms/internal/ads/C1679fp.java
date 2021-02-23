package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fp  reason: case insensitive filesystem */
final class C1679fp extends C1355bP {

    /* renamed from: a  reason: collision with root package name */
    private final PP f10458a;

    /* renamed from: b  reason: collision with root package name */
    private C1876iha<XO> f10459b;

    /* renamed from: c  reason: collision with root package name */
    private C1876iha<String> f10460c;

    /* renamed from: d  reason: collision with root package name */
    private C1876iha<C1780hP> f10461d;

    /* renamed from: e  reason: collision with root package name */
    private C1876iha<Integer> f10462e;

    /* renamed from: f  reason: collision with root package name */
    private C1876iha<C2063lP> f10463f;

    /* renamed from: g  reason: collision with root package name */
    private C1876iha<C2488rP> f10464g;

    /* renamed from: h  reason: collision with root package name */
    private C1876iha<AP> f10465h;
    private C1876iha<Boolean> i;
    private C1876iha<ApplicationInfo> j;
    private C1876iha<GP> k;
    private C1876iha<KP> l;
    private C1876iha<YP> m;
    private C1876iha<String> n;
    private C1876iha<SD> o;
    private C1876iha<SD> p;
    private C1876iha<SD> q;
    private C1876iha<SD> r;
    private C1876iha<Map<SU, SD>> s;
    private C1876iha<Set<C3108zx<C1290aV>>> t;
    private C1876iha<Set<C3108zx<C1290aV>>> u;
    private C1876iha v;
    private C1876iha<VU> w;
    private final /* synthetic */ C1256_o x;

    private C1679fp(C1256_o _oVar, PP pp) {
        this.x = _oVar;
        this.f10458a = pp;
        this.f10459b = new C1426cP(C1539dq.f10202a, this.x.k, this.x.f9729f, C2706uU.a());
        this.f10460c = new OP(pp);
        this.f10461d = new C1921jP(C1126Vo.f9091a, this.x.k, this.f10460c, C2706uU.a());
        this.f10462e = new TP(pp);
        this.f10463f = new C2347pP(C1539dq.f10202a, this.f10462e, this.x.k, this.x.I, this.x.f9729f, C2706uU.a());
        this.f10464g = new C2630tP(C1205Yp.f9499a, C2706uU.a(), this.x.k);
        this.f10465h = new DP(C1257_p.f9733a, C2706uU.a(), this.f10460c);
        this.i = new QP(pp);
        this.j = new RP(pp);
        this.k = new IP(this.x.K, this.x.f9729f, this.i, this.j);
        this.l = new MP(C1398bq.f9985a, this.x.f9729f, this.x.k);
        this.m = new _P(C2706uU.a());
        this.n = new SP(pp);
        this.o = Yga.a(GD.a());
        this.p = Yga.a(ED.a());
        this.q = Yga.a(ID.a());
        this.r = Yga.a(KD.a());
        C1310aha a2 = Zga.a(4);
        a2.a(SU.GMS_SIGNALS, this.o);
        C1310aha aha = a2;
        aha.a(SU.BUILD_URL, this.p);
        C1310aha aha2 = aha;
        aha2.a(SU.HTTP, this.q);
        C1310aha aha3 = aha2;
        aha3.a(SU.PRE_PROCESS, this.r);
        this.s = aha3.a();
        this.t = Yga.a(new MD(this.n, this.x.k, C2706uU.a(), this.s));
        C1735gha a3 = C1593eha.a(0, 1);
        a3.b(this.t);
        this.u = a3.a();
        this.v = C1432cV.a(this.u);
        this.w = Yga.a(_U.a(C2706uU.a(), this.x.f9729f, this.v));
    }

    private final FP d() {
        C2189n nVar = new C2189n();
        C1452cha.a(nVar, "Cannot return null from a non-@Nullable @Provides method");
        PY b2 = C2706uU.b();
        List<String> e2 = this.f10458a.e();
        C1452cha.a(e2, "Cannot return null from a non-@Nullable @Provides method");
        return new FP(nVar, b2, e2);
    }

    private final C1497dP e() {
        C2590sk a2 = C1610eq.a();
        PY b2 = C2706uU.b();
        String b3 = this.f10458a.b();
        C1452cha.a(b3, "Cannot return null from a non-@Nullable @Provides method");
        return new C1497dP(a2, b2, b3, this.f10458a.c());
    }

    public final MO<JSONObject> a() {
        PY b2 = C2706uU.b();
        XN xn = new XN(new AP(C1327aq.a(), C2706uU.b(), OP.a(this.f10458a)), 0, (ScheduledExecutorService) this.x.f9729f.get());
        C1452cha.a(xn, "Cannot return null from a non-@Nullable @Provides method");
        XN xn2 = new XN(new GP(C0815Jp.a(this.x.f9725b), (ScheduledExecutorService) this.x.f9729f.get(), this.f10458a.d(), RP.a(this.f10458a)), ((Long) Qqa.e().a(F.uc)).longValue(), (ScheduledExecutorService) this.x.f9729f.get());
        C1452cha.a(xn2, "Cannot return null from a non-@Nullable @Provides method");
        XN xn3 = new XN(new KP(C1469cq.a(), (ScheduledExecutorService) this.x.f9729f.get(), C0762Ho.a(this.x.f9726c)), ((Long) Qqa.e().a(F.Cc)).longValue(), (ScheduledExecutorService) this.x.f9729f.get());
        C1452cha.a(xn3, "Cannot return null from a non-@Nullable @Provides method");
        XN xn4 = new XN(new XO(C1610eq.a(), C0762Ho.a(this.x.f9726c), (ScheduledExecutorService) this.x.f9729f.get(), C2706uU.b()), 0, (ScheduledExecutorService) this.x.f9729f.get());
        C1452cha.a(xn4, "Cannot return null from a non-@Nullable @Provides method");
        XN xn5 = new XN(new YP(C2706uU.b()), 0, (ScheduledExecutorService) this.x.f9729f.get());
        C1452cha.a(xn5, "Cannot return null from a non-@Nullable @Provides method");
        JO<? extends KO<JSONObject>> a2 = VP.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return NO.a((Executor) b2, BX.a(xn, xn2, xn3, xn4, xn5, a2, new C1780hP((C2728ui) null, C0762Ho.a(this.x.f9726c), OP.a(this.f10458a), C2706uU.b()), new C2488rP(C1231Zp.a(), C2706uU.b(), C0762Ho.a(this.x.f9726c)), d(), e(), new C2063lP(C1610eq.a(), this.f10458a.h(), C0762Ho.a(this.x.f9726c), (C2874wk) this.x.I.get(), (ScheduledExecutorService) this.x.f9729f.get(), C2706uU.b()), (JO) this.x.J.get()));
    }

    public final MO<JSONObject> b() {
        return WP.a(C1327aq.a(), this.x.J.get(), e(), d(), Yga.b(this.f10459b), Yga.b(this.f10461d), Yga.b(this.f10463f), Yga.b(this.f10464g), Yga.b(this.f10465h), Yga.b(this.k), Yga.b(this.l), Yga.b(this.m), C2706uU.b(), (ScheduledExecutorService) this.x.f9729f.get());
    }

    public final VU c() {
        return this.w.get();
    }
}
