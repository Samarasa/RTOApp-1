package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;
import com.google.android.gms.internal.ads.C3103zs;

final class WQ<R extends C1475cu<AdT>, AdT extends C3103zs> implements C1856iU<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2278oR<R, TT<AdT>> f9140a;

    public WQ(C2278oR<R, TT<AdT>> oRVar) {
        this.f9140a = oRVar;
    }

    public final LY<TT<AdT>> a(C1785hU hUVar) {
        VQ vq = (VQ) hUVar;
        return this.f9140a.a(vq.f9042b, vq.f9041a);
    }

    public final void a(TT<AdT> tt) {
        tt.f8779a = ((C1475cu) this.f9140a.a()).b();
    }

    public final void a(Throwable th) {
    }
}
