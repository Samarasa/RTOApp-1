package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;
import com.google.android.gms.internal.ads.C3103zs;
import java.util.concurrent.Executor;

public final class XQ<R extends C1475cu<AdT>, AdT extends C3103zs> implements C2278oR<R, C1286aR<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final JT f9237a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f9238b;

    /* renamed from: c  reason: collision with root package name */
    private AY<Void> f9239c = new C1357bR(this);

    public XQ(JT jt, Executor executor) {
        this.f9237a = jt;
        this.f9238b = executor;
    }

    public final LY<C1286aR<AdT>> a(C2349pR pRVar, C2420qR<R> qRVar) {
        return C2710uY.c(new C1853iR(this.f9237a, pRVar.f11707b, qRVar, this.f9238b).a()).a(new _Q(this, pRVar, qRVar), this.f9238b).a(Exception.class, new ZQ(this), this.f9238b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2349pR pRVar, C2420qR qRVar, C2136mR mRVar) {
        WT wt = mRVar.f11303b;
        C2515ri riVar = mRVar.f11302a;
        TT<?> a2 = wt != null ? this.f9237a.a(wt) : null;
        if (wt == null) {
            return DY.a(null);
        }
        if (!(a2 == null || riVar == null)) {
            DY.a(((C1475cu) qRVar.a(pRVar.f11707b).a()).b().c(riVar), this.f9239c, this.f9238b);
        }
        return DY.a(new C1286aR(wt, riVar, a2));
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }
}
