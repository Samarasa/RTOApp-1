package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class FY<V> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Future<V> f6860a;

    /* renamed from: b  reason: collision with root package name */
    private final AY<? super V> f6861b;

    FY(Future<V> future, AY<? super V> ay) {
        this.f6860a = future;
        this.f6861b = ay;
    }

    public final void run() {
        Throwable a2;
        Future<V> future = this.f6860a;
        if (!(future instanceof C1507dZ) || (a2 = C1719gZ.a((C1507dZ) future)) == null) {
            try {
                this.f6861b.a(DY.a(this.f6860a));
            } catch (ExecutionException e2) {
                this.f6861b.a(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.f6861b.a(e3);
            }
        } else {
            this.f6861b.a(a2);
        }
    }

    public final String toString() {
        YW a2 = WW.a(this);
        a2.a(this.f6861b);
        return a2.toString();
    }
}
