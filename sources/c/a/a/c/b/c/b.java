package c.a.a.c.b.c;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements ExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private static final long f3119a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f3120b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f3121c;

    private static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final String f3122a;

        /* renamed from: b  reason: collision with root package name */
        final C0047b f3123b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f3124c;

        /* renamed from: d  reason: collision with root package name */
        private int f3125d;

        a(String str, C0047b bVar, boolean z) {
            this.f3122a = str;
            this.f3123b = bVar;
            this.f3124c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            a aVar;
            aVar = new a(this, runnable, "glide-" + this.f3122a + "-thread-" + this.f3125d);
            this.f3125d = this.f3125d + 1;
            return aVar;
        }
    }

    /* renamed from: c.a.a.c.b.c.b$b  reason: collision with other inner class name */
    public interface C0047b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0047b f3126a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final C0047b f3127b = new d();

        /* renamed from: c  reason: collision with root package name */
        public static final C0047b f3128c = new e();

        /* renamed from: d  reason: collision with root package name */
        public static final C0047b f3129d = f3127b;

        void a(Throwable th);
    }

    b(ExecutorService executorService) {
        this.f3121c = executorService;
    }

    public static int a() {
        if (f3120b == 0) {
            f3120b = Math.min(4, g.a());
        }
        return f3120b;
    }

    public static b a(int i, C0047b bVar) {
        return new b(new ThreadPoolExecutor(0, i, f3119a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a("animation", bVar, true)));
    }

    public static b a(int i, String str, C0047b bVar) {
        return new b(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(str, bVar, true)));
    }

    public static b b() {
        return a(a() >= 4 ? 2 : 1, C0047b.f3129d);
    }

    public static b b(int i, String str, C0047b bVar) {
        return new b(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a(str, bVar, false)));
    }

    public static b c() {
        return a(1, "disk-cache", C0047b.f3129d);
    }

    public static b d() {
        return b(a(), "source", C0047b.f3129d);
    }

    public static b e() {
        return new b(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f3119a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a("source-unlimited", C0047b.f3129d, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3121c.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f3121c.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3121c.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3121c.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f3121c.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3121c.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f3121c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f3121c.isTerminated();
    }

    public void shutdown() {
        this.f3121c.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f3121c.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f3121c.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3121c.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3121c.submit(callable);
    }

    public String toString() {
        return this.f3121c.toString();
    }
}
