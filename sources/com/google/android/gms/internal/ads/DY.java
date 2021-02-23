package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.IY;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class DY extends GY {
    @SafeVarargs
    public static <V> EY<V> a(LY<? extends V>... lyArr) {
        return new EY<>(false, C2709uX.a((E[]) lyArr), (CY) null);
    }

    public static <V> LY<V> a(LY<V> ly, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return ly.isDone() ? ly : XY.a(ly, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> LY<O> a(LY<I> ly, UW<? super I, ? extends O> uw, Executor executor) {
        return C1364bY.a(ly, uw, executor);
    }

    public static <I, O> LY<O> a(LY<I> ly, C2214nY<? super I, ? extends O> nYVar, Executor executor) {
        return C1364bY.a(ly, nYVar, executor);
    }

    public static <V, X extends Throwable> LY<V> a(LY<? extends V> ly, Class<X> cls, C2214nY<? super X, ? extends V> nYVar, Executor executor) {
        return WX.a(ly, cls, nYVar, executor);
    }

    public static <O> LY<O> a(C2001kY<O> kYVar, Executor executor) {
        C1294aZ aZVar = new C1294aZ(kYVar);
        executor.execute(aZVar);
        return aZVar;
    }

    public static <V> LY<List<V>> a(Iterable<? extends LY<? extends V>> iterable) {
        return new C2356pY(C2709uX.a(iterable), true);
    }

    public static <V> LY<V> a(V v) {
        return v == null ? IY.f7296a : new IY(v);
    }

    public static <V> LY<V> a(Throwable th) {
        C1434cX.a(th);
        return new IY.a(th);
    }

    public static <V> V a(Future<V> future) {
        if (future.isDone()) {
            return C1577eZ.a(future);
        }
        throw new IllegalStateException(C2000kX.a("Future was expected to be done: %s", future));
    }

    public static <V> void a(LY<V> ly, AY<? super V> ay, Executor executor) {
        C1434cX.a(ay);
        ly.a(new FY(ly, ay), executor);
    }

    public static <V> EY<V> b(Iterable<? extends LY<? extends V>> iterable) {
        return new EY<>(false, C2709uX.a(iterable), (CY) null);
    }

    @SafeVarargs
    public static <V> EY<V> b(LY<? extends V>... lyArr) {
        return new EY<>(true, C2709uX.a((E[]) lyArr), (CY) null);
    }

    public static <V> V b(Future<V> future) {
        C1434cX.a(future);
        try {
            return C1577eZ.a(future);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new C2781vY((Error) cause);
            }
            throw new C1365bZ(cause);
        }
    }

    public static <V> EY<V> c(Iterable<? extends LY<? extends V>> iterable) {
        return new EY<>(true, C2709uX.a(iterable), (CY) null);
    }
}
