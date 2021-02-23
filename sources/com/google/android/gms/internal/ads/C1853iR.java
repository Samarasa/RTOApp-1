package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iR  reason: case insensitive filesystem */
final class C1853iR<R extends C1475cu<? extends C3103zs>> {

    /* renamed from: a  reason: collision with root package name */
    private final JT f10805a;

    /* renamed from: b  reason: collision with root package name */
    private final C2207nR f10806b;

    /* renamed from: c  reason: collision with root package name */
    private final C2420qR<R> f10807c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f10808d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C2136mR f10809e;

    public C1853iR(JT jt, C2207nR nRVar, C2420qR<R> qRVar, Executor executor) {
        this.f10805a = jt;
        this.f10806b = nRVar;
        this.f10807c = qRVar;
        this.f10808d = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final WT b() {
        SS a2 = ((C1475cu) this.f10807c.a(this.f10806b).a()).a();
        return this.f10805a.a(a2.f8618d, a2.f8620f, a2.j);
    }

    public final LY<C2136mR> a() {
        LY ly;
        C2136mR mRVar = this.f10809e;
        if (mRVar != null) {
            return DY.a(mRVar);
        }
        if (!C0774Ia.f7301a.a().booleanValue()) {
            this.f10809e = new C2136mR((C2515ri) null, b(), (C1994kR) null);
            ly = DY.a(this.f10809e);
        } else {
            ly = C2710uY.c(((C1475cu) this.f10807c.a(this.f10806b).a(new YQ(this.f10805a.a().j)).a()).b().a(this.f10805a.a())).a(new C1923jR(this), this.f10808d).a(ZF.class, new C1994kR(this), this.f10808d);
        }
        return DY.a(ly, C1782hR.f10670a, this.f10808d);
    }
}
