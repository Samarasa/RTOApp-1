package g;

import g.G;
import g.a.e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private int f15295a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f15296b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f15297c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f15298d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<G.a> f15299e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<G.a> f15300f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final Deque<G> f15301g = new ArrayDeque();

    private <T> void a(Deque<T> deque, T t, boolean z) {
        int b2;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    c();
                }
                b2 = b();
                runnable = this.f15297c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b2 == 0 && runnable != null) {
            runnable.run();
        }
    }

    private int b(G.a aVar) {
        int i = 0;
        for (G.a c2 : this.f15300f) {
            if (c2.c().equals(aVar.c())) {
                i++;
            }
        }
        return i;
    }

    private void c() {
        if (this.f15300f.size() < this.f15295a && !this.f15299e.isEmpty()) {
            Iterator<G.a> it = this.f15299e.iterator();
            while (it.hasNext()) {
                G.a next = it.next();
                if (b(next) < this.f15296b) {
                    it.remove();
                    this.f15300f.add(next);
                    a().execute(next);
                }
                if (this.f15300f.size() >= this.f15295a) {
                    return;
                }
            }
        }
    }

    public synchronized ExecutorService a() {
        if (this.f15298d == null) {
            this.f15298d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp Dispatcher", false));
        }
        return this.f15298d;
    }

    /* access modifiers changed from: package-private */
    public void a(G.a aVar) {
        a(this.f15300f, aVar, true);
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(G g2) {
        this.f15301g.add(g2);
    }

    public synchronized int b() {
        return this.f15300f.size() + this.f15301g.size();
    }

    /* access modifiers changed from: package-private */
    public void b(G g2) {
        a(this.f15301g, g2, false);
    }
}
