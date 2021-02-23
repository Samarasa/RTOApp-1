package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.uY  reason: case insensitive filesystem */
public class C2710uY<V> extends HY<V> {
    C2710uY() {
    }

    public static <V> C2710uY<V> c(LY<V> ly) {
        return ly instanceof C2710uY ? (C2710uY) ly : new C2852wY(ly);
    }

    public final C2710uY<V> a(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (C2710uY) DY.a(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> C2710uY<T> a(UW<? super V, T> uw, Executor executor) {
        C1434cX.a(uw);
        C1506dY dYVar = new C1506dY(this, uw);
        a(dYVar, OY.a(executor, dYVar));
        return dYVar;
    }

    public final <T> C2710uY<T> a(C2214nY<? super V, T> nYVar, Executor executor) {
        C1434cX.a(executor);
        C1576eY eYVar = new C1576eY(this, nYVar);
        a(eYVar, OY.a(executor, eYVar));
        return eYVar;
    }

    public final <X extends Throwable> C2710uY<V> a(Class<X> cls, UW<? super X, ? extends V> uw, Executor executor) {
        C1293aY aYVar = new C1293aY(this, cls, uw);
        a(aYVar, OY.a(executor, aYVar));
        return aYVar;
    }

    public final <X extends Throwable> C2710uY<V> a(Class<X> cls, C2214nY<? super X, ? extends V> nYVar, Executor executor) {
        VX vx = new VX(this, cls, nYVar);
        a(vx, OY.a(executor, vx));
        return vx;
    }
}
