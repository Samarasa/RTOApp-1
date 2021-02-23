package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;
import com.google.android.gms.internal.ads.C1963jpa;
import com.google.android.gms.internal.ads.C3103zs;
import java.util.concurrent.Executor;

public final class SQ<R extends C1475cu<AdT>, AdT extends C3103zs> implements C2278oR<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2278oR<R, AdT> f8609a;

    /* renamed from: b  reason: collision with root package name */
    private final C2278oR<R, C1286aR<AdT>> f8610b;

    /* renamed from: c  reason: collision with root package name */
    private final C1289aU<AdT> f8611c;

    /* renamed from: d  reason: collision with root package name */
    private R f8612d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f8613e;

    public SQ(C2278oR<R, AdT> oRVar, C2278oR<R, C1286aR<AdT>> oRVar2, C1289aU<AdT> aUVar, Executor executor) {
        this.f8609a = oRVar;
        this.f8610b = oRVar2;
        this.f8611c = aUVar;
        this.f8613e = executor;
    }

    private final LY<AdT> a(TT<AdT> tt, C2349pR pRVar, C2420qR<R> qRVar) {
        C1404bu<R> a2 = qRVar.a(pRVar.f11707b);
        if (tt.f8781c != null) {
            C1475cu cuVar = (C1475cu) a2.a();
            if (cuVar.c() != null) {
                tt.f8781c.e().a(cuVar.c());
            }
            return DY.a(tt.f8781c);
        }
        a2.a(tt.f8780b);
        LY<AdT> a3 = this.f8609a.a(pRVar, new UQ(a2));
        this.f8612d = (C1475cu) this.f8609a.a();
        return a3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized R a() {
        return this.f8612d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2349pR pRVar, VQ vq, C2420qR qRVar, C1286aR aRVar) {
        if (aRVar != null) {
            VQ vq2 = new VQ(vq.f9041a, vq.f9042b, vq.f9043c, vq.f9044d, vq.f9045e, vq.f9046f, aRVar.f9782a);
            if (aRVar.f9784c != null) {
                this.f8612d = null;
                this.f8611c.a((C1785hU) vq2);
                return a(aRVar.f9784c, pRVar, qRVar);
            }
            LY<C1572eU<AdT>> b2 = this.f8611c.b((C1785hU) vq2);
            if (b2 != null) {
                this.f8612d = (C1475cu) qRVar.a(pRVar.f11707b).a();
                return DY.a(b2, new TQ(this, qRVar), this.f8613e);
            }
            this.f8611c.a((C1785hU) vq2);
            pRVar = new C2349pR(pRVar.f11707b, aRVar.f9783b);
        }
        LY<AdT> a2 = this.f8609a.a(pRVar, qRVar);
        this.f8612d = (C1475cu) this.f8609a.a();
        return a2;
    }

    public final synchronized LY<AdT> a(C2349pR pRVar, C2420qR<R> qRVar) {
        SS a2;
        C2420qR<R> qRVar2;
        C2349pR pRVar2;
        a2 = ((C1475cu) qRVar.a(pRVar.f11707b).a()).a();
        qRVar2 = qRVar;
        pRVar2 = pRVar;
        return C2710uY.c(this.f8610b.a(pRVar, qRVar)).a(new RQ(this, pRVar, new VQ(qRVar2, pRVar2, a2.f8618d, a2.f8620f, this.f8613e, a2.j, (WT) null), qRVar), this.f8613e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2420qR qRVar, C1572eU eUVar) {
        C1785hU hUVar;
        if (eUVar == null || eUVar.f10269a == null || (hUVar = eUVar.f10270b) == null) {
            throw new VE(C2351pT.INTERNAL_ERROR, "Empty prefetch");
        }
        C1963jpa.c o = C1963jpa.o();
        C1963jpa.a.C0081a o2 = C1963jpa.a.o();
        o2.a(C1963jpa.b.IN_MEMORY);
        o2.a(C1963jpa.d.o());
        o.a(o2);
        eUVar.f10269a.f8779a.c().a((C1963jpa) o.k());
        return a(eUVar.f10269a, ((VQ) hUVar).f9042b, qRVar);
    }
}
