package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ws  reason: case insensitive filesystem */
public final class C1156Ws<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C2762vF f9179a;

    /* renamed from: b  reason: collision with root package name */
    private final FF f9180b;

    /* renamed from: c  reason: collision with root package name */
    private final SS f9181c;

    /* renamed from: d  reason: collision with root package name */
    private final VU f9182d;

    /* renamed from: e  reason: collision with root package name */
    private final C1893iq f9183e;

    /* renamed from: f  reason: collision with root package name */
    private final C1915jJ<T> f9184f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C0692Ew f9185g;

    /* renamed from: h  reason: collision with root package name */
    private final OS f9186h;
    private final C1346bG i;
    private final C1183Xt j;
    private final Executor k;
    private final VF l;
    private final C3048zH m;

    C1156Ws(C2762vF vFVar, FF ff, SS ss, VU vu, C1893iq iqVar, C1915jJ<T> jJVar, C0692Ew ew, OS os, C1346bG bGVar, C1183Xt xt, Executor executor, VF vf, C3048zH zHVar) {
        this.f9179a = vFVar;
        this.f9180b = ff;
        this.f9181c = ss;
        this.f9182d = vu;
        this.f9183e = iqVar;
        this.f9184f = jJVar;
        this.f9185g = ew;
        this.f9186h = os;
        this.i = bGVar;
        this.j = xt;
        this.k = executor;
        this.l = vf;
        this.m = zHVar;
    }

    private final LY<OS> b(LY<C2515ri> ly) {
        NU<I> a2;
        C2214nY nYVar;
        NU<O2> a3;
        LU a4;
        LY a5;
        if (this.f9186h != null) {
            a4 = this.f9182d.a(SU.SERVER_TRANSACTION);
            a5 = DY.a(this.f9186h);
        } else {
            p.i().a();
            if (this.f9181c.f8618d.s != null) {
                a4 = this.f9182d.a(SU.SERVER_TRANSACTION);
                a5 = this.f9180b.a();
            } else {
                if (((Boolean) Qqa.e().a(F.yf)).booleanValue()) {
                    a2 = this.f9182d.a(SU.SERVER_TRANSACTION, ly);
                    VF vf = this.l;
                    vf.getClass();
                    nYVar = C1260_s.a(vf);
                } else {
                    a2 = this.f9182d.a(SU.SERVER_TRANSACTION, ly);
                    nYVar = this.f9179a;
                }
                a3 = a2.a((C2214nY<I, O2>) nYVar);
                return a3.a();
            }
        }
        a3 = a4.a(a5);
        return a3.a();
    }

    public final LY<OS> a() {
        return b(this.j.b());
    }

    public final LY<T> a(LY<OS> ly) {
        NU<O2> a2;
        if (((Boolean) Qqa.e().a(F.Od)).booleanValue()) {
            a2 = this.f9182d.a(SU.RENDERER, ly).a(this.f9183e).a(this.f9184f);
        } else {
            a2 = this.f9182d.a(SU.RENDERER, ly).a(this.f9183e).a(this.f9184f).a((long) ((Integer) Qqa.e().a(F.Pd)).intValue(), TimeUnit.SECONDS);
        }
        return a2.a();
    }

    public final LY<C2515ri> a(QT qt) {
        DU<E, O2> a2 = this.f9182d.a(SU.GET_CACHE_KEY, this.j.b()).a(new C1234Zs(this, qt)).a();
        DY.a(a2, new C1403bt(this), this.k);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(QT qt, C2515ri riVar) {
        riVar.j = qt;
        return this.i.a(riVar);
    }

    public final LY<OS> a(C2515ri riVar) {
        return b((LY<C2515ri>) DY.a(riVar));
    }

    public final C1824hqa a(Throwable th) {
        return C2209nT.a(th, this.m);
    }

    public final LY<T> b() {
        return a(a());
    }

    public final LY<T> b(C2515ri riVar) {
        return a(a(riVar));
    }

    public final C0692Ew c() {
        return this.f9185g;
    }

    public final LY<Void> c(C2515ri riVar) {
        DU<E, I> a2 = this.f9182d.a(SU.NOTIFY_CACHE_HIT, this.i.b(riVar)).a();
        DY.a(a2, new C1332at(this), this.k);
        return a2;
    }
}
