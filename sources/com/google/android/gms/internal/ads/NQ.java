package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;
import com.google.android.gms.internal.ads.C3103zs;
import java.util.concurrent.Executor;

public final class NQ<R extends C1475cu<AdT>, AdT extends C3103zs> implements C2278oR<R, TT<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private R f7962a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7963b = OY.a();

    public final LY<TT<AdT>> a(C2349pR pRVar, C2420qR<R> qRVar) {
        C1404bu<R> a2 = qRVar.a(pRVar.f11707b);
        a2.a(new C2845wR(true));
        this.f7962a = (C1475cu) a2.a();
        C1156Ws b2 = this.f7962a.b();
        TT tt = new TT();
        C2515ri riVar = pRVar.f11706a;
        return C2710uY.c(riVar != null ? b2.a(riVar) : b2.a()).a(new QQ(this, tt, b2), this.f7963b).a(new PQ(tt), this.f7963b);
    }

    public final /* synthetic */ Object a() {
        return this.f7962a;
    }
}
