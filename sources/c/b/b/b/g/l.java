package c.b.b.b.g;

import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class l {

    interface a extends C0470c, C0472e, C0473f<Object> {
    }

    private static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f4714a;

        private b() {
            this.f4714a = new CountDownLatch(1);
        }

        /* synthetic */ b(H h2) {
            this();
        }

        public final void a() {
            this.f4714a.await();
        }

        public final void a(Exception exc) {
            this.f4714a.countDown();
        }

        public final void a(Object obj) {
            this.f4714a.countDown();
        }

        public final boolean a(long j, TimeUnit timeUnit) {
            return this.f4714a.await(j, timeUnit);
        }

        public final void b() {
            this.f4714a.countDown();
        }
    }

    public static <TResult> i<TResult> a(Exception exc) {
        D d2 = new D();
        d2.a(exc);
        return d2;
    }

    public static <TResult> i<TResult> a(TResult tresult) {
        D d2 = new D();
        d2.a(tresult);
        return d2;
    }

    public static <TResult> i<TResult> a(Executor executor, Callable<TResult> callable) {
        C0563t.a(executor, (Object) "Executor must not be null");
        C0563t.a(callable, (Object) "Callback must not be null");
        D d2 = new D();
        executor.execute(new H(d2, callable));
        return d2;
    }

    public static <TResult> TResult a(i<TResult> iVar) {
        C0563t.a();
        C0563t.a(iVar, (Object) "Task must not be null");
        if (iVar.d()) {
            return b(iVar);
        }
        b bVar = new b((H) null);
        a((i<?>) iVar, (a) bVar);
        bVar.a();
        return b(iVar);
    }

    public static <TResult> TResult a(i<TResult> iVar, long j, TimeUnit timeUnit) {
        C0563t.a();
        C0563t.a(iVar, (Object) "Task must not be null");
        C0563t.a(timeUnit, (Object) "TimeUnit must not be null");
        if (iVar.d()) {
            return b(iVar);
        }
        b bVar = new b((H) null);
        a((i<?>) iVar, (a) bVar);
        if (bVar.a(j, timeUnit)) {
            return b(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void a(i<?> iVar, a aVar) {
        iVar.a(k.f4712b, (C0473f<? super Object>) aVar);
        iVar.a(k.f4712b, (C0472e) aVar);
        iVar.a(k.f4712b, (C0470c) aVar);
    }

    private static <TResult> TResult b(i<TResult> iVar) {
        if (iVar.e()) {
            return iVar.b();
        }
        if (iVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.a());
    }
}
