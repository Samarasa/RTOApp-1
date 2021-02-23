package androidx.work.impl.utils.a;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class b<V> implements c.b.c.a.a.a<V> {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f1965a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f1966b = Logger.getLogger(b.class.getName());

    /* renamed from: c  reason: collision with root package name */
    static final a f1967c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f1968d = new Object();

    /* renamed from: e  reason: collision with root package name */
    volatile Object f1969e;

    /* renamed from: f  reason: collision with root package name */
    volatile d f1970f;

    /* renamed from: g  reason: collision with root package name */
    volatile h f1971g;

    private static abstract class a {
        private a() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(h hVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, Object obj, Object obj2);
    }

    /* renamed from: androidx.work.impl.utils.a.b$b  reason: collision with other inner class name */
    private static final class C0024b {

        /* renamed from: a  reason: collision with root package name */
        static final C0024b f1972a;

        /* renamed from: b  reason: collision with root package name */
        static final C0024b f1973b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f1974c;

        /* renamed from: d  reason: collision with root package name */
        final Throwable f1975d;

        static {
            if (b.f1965a) {
                f1973b = null;
                f1972a = null;
                return;
            }
            f1973b = new C0024b(false, (Throwable) null);
            f1972a = new C0024b(true, (Throwable) null);
        }

        C0024b(boolean z, Throwable th) {
            this.f1974c = z;
            this.f1975d = th;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final c f1976a = new c(new c("Failure occurred while trying to finish a future."));

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1977b;

        c(Throwable th) {
            b.a(th);
            this.f1977b = th;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final d f1978a = new d((Runnable) null, (Executor) null);

        /* renamed from: b  reason: collision with root package name */
        final Runnable f1979b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f1980c;

        /* renamed from: d  reason: collision with root package name */
        d f1981d;

        d(Runnable runnable, Executor executor) {
            this.f1979b = runnable;
            this.f1980c = executor;
        }
    }

    private static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f1982a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f1983b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, h> f1984c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, d> f1985d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, Object> f1986e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1982a = atomicReferenceFieldUpdater;
            this.f1983b = atomicReferenceFieldUpdater2;
            this.f1984c = atomicReferenceFieldUpdater3;
            this.f1985d = atomicReferenceFieldUpdater4;
            this.f1986e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, h hVar2) {
            this.f1983b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, Thread thread) {
            this.f1982a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: package-private */
        public boolean a(b<?> bVar, d dVar, d dVar2) {
            return this.f1985d.compareAndSet(bVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean a(b<?> bVar, h hVar, h hVar2) {
            return this.f1984c.compareAndSet(bVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean a(b<?> bVar, Object obj, Object obj2) {
            return this.f1986e.compareAndSet(bVar, obj, obj2);
        }
    }

    private static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b<V> f1987a;

        /* renamed from: b  reason: collision with root package name */
        final c.b.c.a.a.a<? extends V> f1988b;

        f(b<V> bVar, c.b.c.a.a.a<? extends V> aVar) {
            this.f1987a = bVar;
            this.f1988b = aVar;
        }

        public void run() {
            if (this.f1987a.f1969e == this) {
                if (b.f1967c.a((b<?>) this.f1987a, (Object) this, b.a((c.b.c.a.a.a<?>) this.f1988b))) {
                    b.a((b<?>) this.f1987a);
                }
            }
        }
    }

    private static final class g extends a {
        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, h hVar2) {
            hVar.f1991c = hVar2;
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, Thread thread) {
            hVar.f1990b = thread;
        }

        /* access modifiers changed from: package-private */
        public boolean a(b<?> bVar, d dVar, d dVar2) {
            synchronized (bVar) {
                if (bVar.f1970f != dVar) {
                    return false;
                }
                bVar.f1970f = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(b<?> bVar, h hVar, h hVar2) {
            synchronized (bVar) {
                if (bVar.f1971g != hVar) {
                    return false;
                }
                bVar.f1971g = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f1969e != obj) {
                    return false;
                }
                bVar.f1969e = obj2;
                return true;
            }
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        static final h f1989a = new h(false);

        /* renamed from: b  reason: collision with root package name */
        volatile Thread f1990b;

        /* renamed from: c  reason: collision with root package name */
        volatile h f1991c;

        h() {
            b.f1967c.a(this, Thread.currentThread());
        }

        h(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            Thread thread = this.f1990b;
            if (thread != null) {
                this.f1990b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            b.f1967c.a(this, hVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.work.impl.utils.a.b$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: androidx.work.impl.utils.a.b$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: androidx.work.impl.utils.a.b$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.a.b$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            f1965a = r0
            java.lang.Class<androidx.work.impl.utils.a.b> r0 = androidx.work.impl.utils.a.b.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f1966b = r0
            androidx.work.impl.utils.a.b$e r0 = new androidx.work.impl.utils.a.b$e     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.b$h> r1 = androidx.work.impl.utils.a.b.h.class
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r3)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.b$h> r1 = androidx.work.impl.utils.a.b.h.class
            java.lang.Class<androidx.work.impl.utils.a.b$h> r3 = androidx.work.impl.utils.a.b.h.class
            java.lang.String r4 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r4)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.b> r1 = androidx.work.impl.utils.a.b.class
            java.lang.Class<androidx.work.impl.utils.a.b$h> r4 = androidx.work.impl.utils.a.b.h.class
            java.lang.String r5 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r4, r5)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.b> r1 = androidx.work.impl.utils.a.b.class
            java.lang.Class<androidx.work.impl.utils.a.b$d> r5 = androidx.work.impl.utils.a.b.d.class
            java.lang.String r6 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r5, r6)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.b> r1 = androidx.work.impl.utils.a.b.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.String r7 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r6, r7)     // Catch:{ Throwable -> 0x0054 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0054 }
            r1 = 0
            goto L_0x005b
        L_0x0054:
            r0 = move-exception
            r1 = r0
            androidx.work.impl.utils.a.b$g r0 = new androidx.work.impl.utils.a.b$g
            r0.<init>()
        L_0x005b:
            f1967c = r0
            java.lang.Class<java.util.concurrent.locks.LockSupport> r0 = java.util.concurrent.locks.LockSupport.class
            if (r1 == 0) goto L_0x006a
            java.util.logging.Logger r0 = f1966b
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r0.log(r2, r3, r1)
        L_0x006a:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f1968d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.a.b.<clinit>():void");
    }

    protected b() {
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f1970f;
        } while (!f1967c.a((b<?>) this, dVar2, d.f1978a));
        d dVar3 = dVar2;
        d dVar4 = dVar;
        d dVar5 = dVar3;
        while (dVar5 != null) {
            d dVar6 = dVar5.f1981d;
            dVar5.f1981d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    static Object a(c.b.c.a.a.a<?> aVar) {
        if (aVar instanceof b) {
            Object obj = ((b) aVar).f1969e;
            if (!(obj instanceof C0024b)) {
                return obj;
            }
            C0024b bVar = (C0024b) obj;
            if (!bVar.f1974c) {
                return obj;
            }
            Throwable th = bVar.f1975d;
            return th != null ? new C0024b(false, th) : C0024b.f1973b;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1965a) && isCancelled) {
            return C0024b.f1973b;
        }
        try {
            Object a2 = a(aVar);
            return a2 == null ? f1968d : a2;
        } catch (ExecutionException e2) {
            return new c(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new C0024b(false, e3);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e3));
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private static <V> V a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private void a(h hVar) {
        hVar.f1990b = null;
        while (true) {
            h hVar2 = this.f1971g;
            if (hVar2 != h.f1989a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f1991c;
                    if (hVar2.f1990b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f1991c = hVar4;
                        if (hVar3.f1990b == null) {
                        }
                    } else if (!f1967c.a((b<?>) this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    static void a(b<?> bVar) {
        d dVar = null;
        b<V> bVar2 = bVar;
        while (true) {
            bVar2.d();
            bVar2.a();
            d a2 = bVar2.a(dVar);
            while (true) {
                if (a2 != null) {
                    dVar = a2.f1981d;
                    Runnable runnable = a2.f1979b;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        b<V> bVar3 = fVar.f1987a;
                        if (bVar3.f1969e == fVar) {
                            if (f1967c.a((b<?>) bVar3, (Object) fVar, a((c.b.c.a.a.a<?>) fVar.f1988b))) {
                                bVar2 = bVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, a2.f1980c);
                    }
                    a2 = dVar;
                } else {
                    return;
                }
            }
        }
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object a2 = a(this);
            sb.append("SUCCESS, result=[");
            sb.append(d(a2));
            sb.append(str);
            return;
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f1966b;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    private V c(Object obj) {
        if (obj instanceof C0024b) {
            throw a("Task was cancelled.", ((C0024b) obj).f1975d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f1977b);
        } else if (obj == f1968d) {
            return null;
        } else {
            return obj;
        }
    }

    private String d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void d() {
        h hVar;
        do {
            hVar = this.f1971g;
        } while (!f1967c.a((b<?>) this, hVar, h.f1989a));
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f1991c;
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void a(Runnable runnable, Executor executor) {
        a(runnable);
        a(executor);
        d dVar = this.f1970f;
        if (dVar != d.f1978a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f1981d = dVar;
                if (!f1967c.a((b<?>) this, dVar, dVar2)) {
                    dVar = this.f1970f;
                } else {
                    return;
                }
            } while (dVar != d.f1978a);
        }
        b(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        a(th);
        if (!f1967c.a((b<?>) this, (Object) null, (Object) new c(th))) {
            return false;
        }
        a((b<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public boolean b(c.b.c.a.a.a<? extends V> aVar) {
        f fVar;
        c cVar;
        a(aVar);
        Object obj = this.f1969e;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f1967c.a((b<?>) this, (Object) null, a((c.b.c.a.a.a<?>) aVar))) {
                    return false;
                }
                a((b<?>) this);
                return true;
            }
            fVar = new f(this, aVar);
            if (f1967c.a((b<?>) this, (Object) null, (Object) fVar)) {
                try {
                    aVar.a(fVar, d.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.f1976a;
                }
                return true;
            }
            obj = this.f1969e;
        }
        if (obj instanceof C0024b) {
            aVar.cancel(((C0024b) obj).f1974c);
        }
        return false;
        f1967c.a((b<?>) this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(V v) {
        if (v == null) {
            v = f1968d;
        }
        if (!f1967c.a((b<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        a((b<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public String c() {
        Object obj = this.f1969e;
        if (obj instanceof f) {
            return "setFuture=[" + d(((f) obj).f1988b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final boolean cancel(boolean z) {
        Object obj = this.f1969e;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        C0024b bVar = f1965a ? new C0024b(z, new CancellationException("Future.cancel() was called.")) : z ? C0024b.f1972a : C0024b.f1973b;
        boolean z2 = false;
        Object obj2 = obj;
        b bVar2 = this;
        while (true) {
            if (f1967c.a((b<?>) bVar2, obj2, (Object) bVar)) {
                if (z) {
                    bVar2.b();
                }
                a((b<?>) bVar2);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                c.b.c.a.a.a<? extends V> aVar = ((f) obj2).f1988b;
                if (aVar instanceof b) {
                    bVar2 = (b) aVar;
                    obj2 = bVar2.f1969e;
                    if (!(obj2 == null) && !(obj2 instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    aVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = bVar2.f1969e;
                if (!(obj2 instanceof f)) {
                    return z2;
                }
            }
        }
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1969e;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return c(obj2);
            }
            h hVar = this.f1971g;
            if (hVar != h.f1989a) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1967c.a((b<?>) this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1969e;
                            } else {
                                a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return c(obj);
                    }
                    hVar = this.f1971g;
                } while (hVar != h.f1989a);
            }
            return c(this.f1969e);
        }
        throw new InterruptedException();
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f1969e;
            if ((obj != null) && (!(obj instanceof f))) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f1971g;
                if (hVar != h.f1989a) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f1967c.a((b<?>) this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1969e;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(hVar2);
                        } else {
                            hVar = this.f1971g;
                        }
                    } while (hVar != h.f1989a);
                }
                return c(this.f1969e);
            }
            while (nanos > 0) {
                Object obj3 = this.f1969e;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + bVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f1969e instanceof C0024b;
    }

    public final boolean isDone() {
        Object obj = this.f1969e;
        boolean z = true;
        boolean z2 = obj != null;
        if (obj instanceof f) {
            z = false;
        }
        return z2 & z;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = c();
                } catch (RuntimeException e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
