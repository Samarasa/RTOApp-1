package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class NU<O> {

    /* renamed from: a  reason: collision with root package name */
    private final E f7969a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7970b;

    /* renamed from: c  reason: collision with root package name */
    private final LY<?> f7971c;

    /* renamed from: d  reason: collision with root package name */
    private final List<LY<?>> f7972d;

    /* renamed from: e  reason: collision with root package name */
    private final LY<O> f7973e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ HU f7974f;

    private NU(HU hu, E e2, String str, LY<?> ly, List<LY<?>> list, LY<O> ly2) {
        this.f7974f = hu;
        this.f7969a = e2;
        this.f7970b = str;
        this.f7971c = ly;
        this.f7972d = list;
        this.f7973e = ly2;
    }

    /* synthetic */ NU(HU hu, Object obj, String str, LY ly, List list, LY ly2, FU fu) {
        this(hu, obj, (String) null, ly, list, ly2);
    }

    private final <O2> NU<O2> a(C2214nY<O, O2> nYVar, Executor executor) {
        return new NU(this.f7974f, this.f7969a, this.f7970b, this.f7971c, this.f7972d, DY.a(this.f7973e, nYVar, executor));
    }

    public final DU<E, O> a() {
        E e2 = this.f7969a;
        String str = this.f7970b;
        if (str == null) {
            str = this.f7974f.b(e2);
        }
        DU<E, O> du = new DU<>(e2, str, this.f7973e);
        this.f7974f.f7147d.c(du);
        this.f7971c.a(new RU(this, du), C1252_k.f9704f);
        DY.a(du, new QU(this, du), (Executor) C1252_k.f9704f);
        return du;
    }

    public final NU<O> a(long j, TimeUnit timeUnit) {
        HU hu = this.f7974f;
        return new NU(hu, this.f7969a, this.f7970b, this.f7971c, this.f7972d, DY.a(this.f7973e, j, timeUnit, hu.f7146c));
    }

    public final <O2> NU<O2> a(BU<O, O2> bu) {
        return a(new MU(bu));
    }

    public final <O2> NU<O2> a(LY<O2> ly) {
        return a(new PU(ly), (Executor) C1252_k.f9704f);
    }

    public final <O2> NU<O2> a(C2214nY<O, O2> nYVar) {
        return a(nYVar, (Executor) this.f7974f.f7145b);
    }

    public final <T extends Throwable> NU<O> a(Class<T> cls, BU<T, O> bu) {
        return a(cls, new OU(bu));
    }

    public final <T extends Throwable> NU<O> a(Class<T> cls, C2214nY<T, O> nYVar) {
        HU hu = this.f7974f;
        return new NU(hu, this.f7969a, this.f7970b, this.f7971c, this.f7972d, DY.a(this.f7973e, cls, nYVar, (Executor) hu.f7145b));
    }

    public final NU<O> a(E e2) {
        return this.f7974f.a(e2, a());
    }

    public final NU<O> a(String str) {
        return new NU(this.f7974f, this.f7969a, str, this.f7971c, this.f7972d, this.f7973e);
    }
}
