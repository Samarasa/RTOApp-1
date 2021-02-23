package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.ads.KO;
import java.util.concurrent.atomic.AtomicReference;

public final class VM<S extends KO<?>> implements JO<S> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<YM<S>> f9034a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final e f9035b;

    /* renamed from: c  reason: collision with root package name */
    private final JO<S> f9036c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9037d;

    public VM(JO<S> jo, long j, e eVar) {
        this.f9035b = eVar;
        this.f9036c = jo;
        this.f9037d = j;
    }

    public final LY<S> a() {
        YM ym = this.f9034a.get();
        if (ym == null || ym.a()) {
            ym = new YM(this.f9036c.a(), this.f9037d, this.f9035b);
            this.f9034a.set(ym);
        }
        return ym.f9345a;
    }
}
