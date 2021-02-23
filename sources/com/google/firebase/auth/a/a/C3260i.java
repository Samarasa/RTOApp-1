package com.google.firebase.auth.a.a;

import android.content.Context;
import c.b.b.b.d.d.Ia;
import c.b.b.b.d.d.na;
import c.b.b.b.d.d.pa;
import c.b.b.b.d.d.va;
import c.b.b.b.g.C0468a;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import c.b.d.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3277b;
import com.google.firebase.auth.C3278c;
import com.google.firebase.auth.C3279d;
import com.google.firebase.auth.C3306p;
import com.google.firebase.auth.C3311v;
import com.google.firebase.auth.internal.C3287c;
import com.google.firebase.auth.internal.C3291g;
import com.google.firebase.auth.internal.C3297m;
import com.google.firebase.auth.internal.D;
import com.google.firebase.auth.internal.F;
import com.google.firebase.auth.internal.u;
import com.google.firebase.auth.internal.z;
import com.google.firebase.auth.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.auth.a.a.i  reason: case insensitive filesystem */
public final class C3260i extends C3253b<X> {

    /* renamed from: c  reason: collision with root package name */
    private final Context f14321c;

    /* renamed from: d  reason: collision with root package name */
    private final X f14322d;

    /* renamed from: e  reason: collision with root package name */
    private final Future<C3252a<X>> f14323e = a();

    C3260i(Context context, X x) {
        this.f14321c = context;
        this.f14322d = x;
    }

    private final <ResultT> i<ResultT> a(i<ResultT> iVar, C3256e<N, ResultT> eVar) {
        return iVar.a((C0468a<ResultT, i<TContinuationResult>>) new C3259h(this, eVar));
    }

    static D a(e eVar, na naVar) {
        C0563t.a(eVar);
        C0563t.a(naVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z(naVar, "firebase"));
        List<va> v = naVar.v();
        if (v != null && !v.isEmpty()) {
            for (int i = 0; i < v.size(); i++) {
                arrayList.add(new z(v.get(i)));
            }
        }
        D d2 = new D(eVar, arrayList);
        d2.a(new F(naVar.l(), naVar.k()));
        d2.a(naVar.u());
        d2.a(naVar.w());
        d2.b(C3297m.a(naVar.x()));
        return d2;
    }

    public final i<C3278c> a(e eVar, C3277b bVar, String str, C3287c cVar) {
        E e2 = new E(bVar, str);
        e2.a(eVar);
        e2.a(cVar);
        E e3 = e2;
        return a(b(e3), e3);
    }

    public final i<C3278c> a(e eVar, C3279d dVar, C3287c cVar) {
        I i = new I(dVar);
        i.a(eVar);
        i.a(cVar);
        I i2 = i;
        return a(b(i2), i2);
    }

    public final i<C3278c> a(e eVar, C3287c cVar, String str) {
        C c2 = new C(str);
        c2.a(eVar);
        c2.a(cVar);
        C c3 = c2;
        return a(b(c3), c3);
    }

    public final i<C3278c> a(e eVar, C3306p pVar, C3277b bVar, u uVar) {
        C0563t.a(eVar);
        C0563t.a(bVar);
        C0563t.a(pVar);
        C0563t.a(uVar);
        List<String> a2 = pVar.a();
        if (a2 != null && a2.contains(bVar.g())) {
            return l.a((Exception) O.a(new Status(17015)));
        }
        if (bVar instanceof C3279d) {
            C3279d dVar = (C3279d) bVar;
            if (!dVar.k()) {
                C3264m mVar = new C3264m(dVar);
                mVar.a(eVar);
                mVar.a(pVar);
                mVar.a(uVar);
                mVar.a((C3291g) uVar);
                C3264m mVar2 = mVar;
                return a(b(mVar2), mVar2);
            }
            C3269s sVar = new C3269s(dVar);
            sVar.a(eVar);
            sVar.a(pVar);
            sVar.a(uVar);
            sVar.a((C3291g) uVar);
            C3269s sVar2 = sVar;
            return a(b(sVar2), sVar2);
        } else if (bVar instanceof C3311v) {
            C3268q qVar = new C3268q((C3311v) bVar);
            qVar.a(eVar);
            qVar.a(pVar);
            qVar.a(uVar);
            qVar.a((C3291g) uVar);
            C3268q qVar2 = qVar;
            return a(b(qVar2), qVar2);
        } else {
            C0563t.a(eVar);
            C0563t.a(bVar);
            C0563t.a(pVar);
            C0563t.a(uVar);
            C3266o oVar = new C3266o(bVar);
            oVar.a(eVar);
            oVar.a(pVar);
            oVar.a(uVar);
            oVar.a((C3291g) uVar);
            C3266o oVar2 = oVar;
            return a(b(oVar2), oVar2);
        }
    }

    public final i<C3278c> a(e eVar, C3306p pVar, C3277b bVar, String str, u uVar) {
        C3271u uVar2 = new C3271u(bVar, str);
        uVar2.a(eVar);
        uVar2.a(pVar);
        uVar2.a(uVar);
        uVar2.a((C3291g) uVar);
        C3271u uVar3 = uVar2;
        return a(b(uVar3), uVar3);
    }

    public final i<C3278c> a(e eVar, C3306p pVar, C3279d dVar, u uVar) {
        C3273w wVar = new C3273w(dVar);
        wVar.a(eVar);
        wVar.a(pVar);
        wVar.a(uVar);
        wVar.a((C3291g) uVar);
        C3273w wVar2 = wVar;
        return a(b(wVar2), wVar2);
    }

    public final i<C3278c> a(e eVar, C3306p pVar, C3311v vVar, String str, u uVar) {
        A a2 = new A(vVar, str);
        a2.a(eVar);
        a2.a(pVar);
        a2.a(uVar);
        a2.a((C3291g) uVar);
        A a3 = a2;
        return a(b(a3), a3);
    }

    public final i<r> a(e eVar, C3306p pVar, String str, u uVar) {
        C3262k kVar = new C3262k(str);
        kVar.a(eVar);
        kVar.a(pVar);
        kVar.a(uVar);
        kVar.a((C3291g) uVar);
        C3262k kVar2 = kVar;
        return a(a(kVar2), kVar2);
    }

    public final i<C3278c> a(e eVar, C3306p pVar, String str, String str2, String str3, u uVar) {
        C3275y yVar = new C3275y(str, str2, str3);
        yVar.a(eVar);
        yVar.a(pVar);
        yVar.a(uVar);
        yVar.a((C3291g) uVar);
        C3275y yVar2 = yVar;
        return a(b(yVar2), yVar2);
    }

    public final i<C3278c> a(e eVar, C3311v vVar, String str, C3287c cVar) {
        K k = new K(vVar, str);
        k.a(eVar);
        k.a(cVar);
        K k2 = k;
        return a(b(k2), k2);
    }

    public final i<C3278c> a(e eVar, String str, String str2, String str3, C3287c cVar) {
        G g2 = new G(str, str2, str3);
        g2.a(eVar);
        g2.a(cVar);
        G g3 = g2;
        return a(b(g3), g3);
    }

    /* access modifiers changed from: package-private */
    public final Future<C3252a<X>> a() {
        Future<C3252a<X>> future = this.f14323e;
        if (future != null) {
            return future;
        }
        return pa.a().a(Ia.f3968a).submit(new L(this.f14322d, this.f14321c));
    }
}
