package g;

import g.a.b.c;
import g.a.b.d;
import g.a.b.g;
import g.a.e;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.m  reason: case insensitive filesystem */
public final class C3352m {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f15267a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp ConnectionPool", true));

    /* renamed from: b  reason: collision with root package name */
    private final int f15268b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15269c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f15270d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<c> f15271e;

    /* renamed from: f  reason: collision with root package name */
    final d f15272f;

    /* renamed from: g  reason: collision with root package name */
    boolean f15273g;

    public C3352m() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C3352m(int i, long j, TimeUnit timeUnit) {
        this.f15270d = new C3351l(this);
        this.f15271e = new ArrayDeque();
        this.f15272f = new d();
        this.f15268b = i;
        this.f15269c = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    private int a(c cVar, long j) {
        List<Reference<g>> list = cVar.n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                g.a.f.e.a().a("A connection to " + cVar.a().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f14984a);
                list.remove(i);
                cVar.k = true;
                if (list.isEmpty()) {
                    cVar.o = j - this.f15269c;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            c cVar = null;
            int i = 0;
            int i2 = 0;
            for (c next : this.f15271e) {
                if (a(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.o;
                    if (j3 > j2) {
                        cVar = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f15269c) {
                if (i <= this.f15268b) {
                    if (i > 0) {
                        long j4 = this.f15269c - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f15269c;
                        return j5;
                    } else {
                        this.f15273g = false;
                        return -1;
                    }
                }
            }
            this.f15271e.remove(cVar);
            e.a(cVar.d());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public c a(C3339a aVar, g gVar, N n) {
        for (c next : this.f15271e) {
            if (next.a(aVar, n)) {
                gVar.a(next);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Socket a(C3339a aVar, g gVar) {
        for (c next : this.f15271e) {
            if (next.a(aVar, (N) null) && next.c() && next != gVar.b()) {
                return gVar.b(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean a(c cVar) {
        if (cVar.k || this.f15268b == 0) {
            this.f15271e.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar) {
        if (!this.f15273g) {
            this.f15273g = true;
            f15267a.execute(this.f15270d);
        }
        this.f15271e.add(cVar);
    }
}
