package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

public final class LU {

    /* renamed from: a  reason: collision with root package name */
    private final E f7677a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ HU f7678b;

    private LU(HU hu, E e2) {
        this.f7678b = hu;
        this.f7677a = e2;
    }

    private final <O> NU<O> a(Callable<O> callable, PY py) {
        return new NU(this.f7678b, this.f7677a, (String) null, HU.f7144a, Collections.emptyList(), py.a(callable), (FU) null);
    }

    public final NU<?> a(EU eu, PY py) {
        return a(new KU(eu), py);
    }

    public final <O> NU<O> a(LY<O> ly) {
        return new NU(this.f7678b, this.f7677a, (String) null, HU.f7144a, Collections.emptyList(), ly, (FU) null);
    }

    public final <O> NU<O> a(Callable<O> callable) {
        return a(callable, this.f7678b.f7145b);
    }
}
