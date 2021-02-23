package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class JU {

    /* renamed from: a  reason: collision with root package name */
    private final E f7416a;

    /* renamed from: b  reason: collision with root package name */
    private final List<LY<?>> f7417b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ HU f7418c;

    private JU(HU hu, E e2, List<LY<?>> list) {
        this.f7418c = hu;
        this.f7416a = e2;
        this.f7417b = list;
    }

    public final <O> NU<O> a(Callable<O> callable) {
        EY<V> c2 = DY.c(this.f7417b);
        LY<C> a2 = c2.a(IU.f7294a, C1252_k.f9704f);
        HU hu = this.f7418c;
        return new NU(hu, this.f7416a, (String) null, a2, this.f7417b, c2.a(callable, hu.f7145b), (FU) null);
    }
}
