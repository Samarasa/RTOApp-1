package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class YK implements C0613Bv {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<Mra> f9344a = new AtomicReference<>();

    public final void a(Mra mra) {
        this.f9344a.set(mra);
    }

    public final void a(C2603sqa sqa) {
        C1569eR.a(this.f9344a, new C1280aL(sqa));
    }
}
