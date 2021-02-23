package com.google.android.gms.internal.ads;

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
import sun.misc.Unsafe;

public class YX<V> extends C1507dZ implements LY<V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9365a;

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f9366b = Logger.getLogger(YX.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final a f9367c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f9368d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f9369e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile d f9370f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public volatile k f9371g;

    static abstract class a {
        private a() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(k kVar, k kVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(k kVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(YX<?> yx, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(YX<?> yx, k kVar, k kVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(YX<?> yx, Object obj, Object obj2);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final b f9372a = new b(new ZX("Failure occurred while trying to finish a future."));

        /* renamed from: b  reason: collision with root package name */
        final Throwable f9373b;

        b(Throwable th) {
            C1434cX.a(th);
            this.f9373b = th;
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final c f9374a;

        /* renamed from: b  reason: collision with root package name */
        static final c f9375b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f9376c;

        /* renamed from: d  reason: collision with root package name */
        final Throwable f9377d;

        static {
            if (YX.f9365a) {
                f9375b = null;
                f9374a = null;
                return;
            }
            f9375b = new c(false, (Throwable) null);
            f9374a = new c(true, (Throwable) null);
        }

        c(boolean z, Throwable th) {
            this.f9376c = z;
            this.f9377d = th;
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final d f9378a = new d((Runnable) null, (Executor) null);

        /* renamed from: b  reason: collision with root package name */
        final Runnable f9379b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f9380c;

        /* renamed from: d  reason: collision with root package name */
        d f9381d;

        d(Runnable runnable, Executor executor) {
            this.f9379b = runnable;
            this.f9380c = executor;
        }
    }

    static final class e<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final YX<V> f9382a;

        /* renamed from: b  reason: collision with root package name */
        final LY<? extends V> f9383b;

        e(YX<V> yx, LY<? extends V> ly) {
            this.f9382a = yx;
            this.f9383b = ly;
        }

        public final void run() {
            if (this.f9382a.f9369e == this) {
                if (YX.f9367c.a((YX<?>) this.f9382a, (Object) this, YX.c((LY<?>) this.f9383b))) {
                    YX.e(this.f9382a);
                }
            }
        }
    }

    static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, Thread> f9384a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f9385b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<YX, k> f9386c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<YX, d> f9387d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<YX, Object> f9388e;

        f(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<YX, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<YX, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<YX, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f9384a = atomicReferenceFieldUpdater;
            this.f9385b = atomicReferenceFieldUpdater2;
            this.f9386c = atomicReferenceFieldUpdater3;
            this.f9387d = atomicReferenceFieldUpdater4;
            this.f9388e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar, k kVar2) {
            this.f9385b.lazySet(kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar, Thread thread) {
            this.f9384a.lazySet(kVar, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, d dVar, d dVar2) {
            return this.f9387d.compareAndSet(yx, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, k kVar, k kVar2) {
            return this.f9386c.compareAndSet(yx, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, Object obj, Object obj2) {
            return this.f9388e.compareAndSet(yx, obj, obj2);
        }
    }

    interface g<V> extends LY<V> {
    }

    static final class h extends a {
        private h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar, k kVar2) {
            kVar.f9397c = kVar2;
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar, Thread thread) {
            kVar.f9396b = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, d dVar, d dVar2) {
            synchronized (yx) {
                if (yx.f9370f != dVar) {
                    return false;
                }
                d unused = yx.f9370f = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, k kVar, k kVar2) {
            synchronized (yx) {
                if (yx.f9371g != kVar) {
                    return false;
                }
                k unused = yx.f9371g = kVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, Object obj, Object obj2) {
            synchronized (yx) {
                if (yx.f9369e != obj) {
                    return false;
                }
                Object unused = yx.f9369e = obj2;
                return true;
            }
        }
    }

    static final class i extends a {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f9389a;

        /* renamed from: b  reason: collision with root package name */
        static final long f9390b;

        /* renamed from: c  reason: collision with root package name */
        static final long f9391c;

        /* renamed from: d  reason: collision with root package name */
        static final long f9392d;

        /* renamed from: e  reason: collision with root package name */
        static final long f9393e;

        /* renamed from: f  reason: collision with root package name */
        static final long f9394f;

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads._X());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.android.gms.internal.ads._X r0 = new com.google.android.gms.internal.ads._X     // Catch:{ PrivilegedActionException -> 0x005f }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
            L_0x0010:
                java.lang.Class<com.google.android.gms.internal.ads.YX> r1 = com.google.android.gms.internal.ads.YX.class
                java.lang.String r2 = "g"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f9391c = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "f"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f9390b = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "e"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f9392d = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.YX$k> r1 = com.google.android.gms.internal.ads.YX.k.class
                java.lang.String r2 = "b"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f9393e = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.YX$k> r1 = com.google.android.gms.internal.ads.YX.k.class
                java.lang.String r2 = "c"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f9394f = r1     // Catch:{ Exception -> 0x0055 }
                f9389a = r0     // Catch:{ Exception -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                com.google.android.gms.internal.ads.C2142mX.b(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.YX.i.<clinit>():void");
        }

        private i() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar, k kVar2) {
            f9389a.putObject(kVar, f9394f, kVar2);
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar, Thread thread) {
            f9389a.putObject(kVar, f9393e, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, d dVar, d dVar2) {
            return f9389a.compareAndSwapObject(yx, f9390b, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, k kVar, k kVar2) {
            return f9389a.compareAndSwapObject(yx, f9391c, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(YX<?> yx, Object obj, Object obj2) {
            return f9389a.compareAndSwapObject(yx, f9392d, obj, obj2);
        }
    }

    static abstract class j<V> extends YX<V> implements g<V> {
        j() {
        }

        public final V get(long j, TimeUnit timeUnit) {
            return YX.super.get(j, timeUnit);
        }
    }

    static final class k {

        /* renamed from: a  reason: collision with root package name */
        static final k f9395a = new k(false);

        /* renamed from: b  reason: collision with root package name */
        volatile Thread f9396b;

        /* renamed from: c  reason: collision with root package name */
        volatile k f9397c;

        k() {
            YX.f9367c.a(this, Thread.currentThread());
        }

        private k(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar) {
            YX.f9367c.a(this, kVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        a aVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f9365a = z;
        try {
            aVar = new i();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th;
            th2 = th3;
            aVar = new h();
        }
        f9367c = aVar;
        if (th2 != null) {
            f9366b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            f9366b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    protected YX() {
    }

    private final void a(k kVar) {
        kVar.f9396b = null;
        while (true) {
            k kVar2 = this.f9371g;
            if (kVar2 != k.f9395a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.f9397c;
                    if (kVar2.f9396b != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.f9397c = kVar4;
                        if (kVar3.f9396b == null) {
                        }
                    } else if (f9367c.a((YX<?>) this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    private final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object b2 = b(this);
            sb.append("SUCCESS, result=[");
            a(sb, b2);
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
            sb.append(str);
        }
    }

    private final void a(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e2) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e2.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    private static V b(Object obj) {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f9377d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f9373b);
        } else if (obj == f9368d) {
            return null;
        } else {
            return obj;
        }
    }

    private static <V> V b(Future<V> future) {
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

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f9366b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e2);
        }
    }

    /* access modifiers changed from: private */
    public static Object c(LY<?> ly) {
        Throwable a2;
        if (ly instanceof g) {
            Object obj = ((YX) ly).f9369e;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f9376c) {
                return obj;
            }
            Throwable th = cVar.f9377d;
            return th != null ? new c(false, th) : c.f9375b;
        } else if ((ly instanceof C1507dZ) && (a2 = C1719gZ.a((C1507dZ) ly)) != null) {
            return new b(a2);
        } else {
            boolean isCancelled = ly.isCancelled();
            if ((!f9365a) && isCancelled) {
                return c.f9375b;
            }
            try {
                Object b2 = b(ly);
                if (!isCancelled) {
                    return b2 == null ? f9368d : b2;
                }
                String valueOf = String.valueOf(ly);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new c(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new b(e2.getCause());
                }
                String valueOf2 = String.valueOf(ly);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new c(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new c(false, e3);
                }
                String valueOf3 = String.valueOf(ly);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new b(new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void e(YX<?> yx) {
        YX<V> yx2;
        d dVar;
        d dVar2;
        d dVar3 = null;
        YX<?> yx3 = yx;
        while (true) {
            k kVar = yx3.f9371g;
            if (f9367c.a(yx3, kVar, k.f9395a)) {
                while (kVar != null) {
                    Thread thread = kVar.f9396b;
                    if (thread != null) {
                        kVar.f9396b = null;
                        LockSupport.unpark(thread);
                    }
                    kVar = kVar.f9397c;
                }
                yx3.b();
                do {
                    dVar = yx3.f9370f;
                } while (!f9367c.a(yx3, dVar, d.f9378a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f9381d;
                    dVar3.f9381d = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f9381d;
                    Runnable runnable = dVar2.f9379b;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        YX<V> yx4 = eVar.f9382a;
                        if (yx4.f9369e == eVar) {
                            if (f9367c.a((YX<?>) yx4, (Object) eVar, c((LY<?>) eVar.f9383b))) {
                                yx2 = yx4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, dVar2.f9380c);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
            yx2 = yx3;
            yx3 = yx2;
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable a() {
        if (!(this instanceof g)) {
            return null;
        }
        Object obj = this.f9369e;
        if (obj instanceof b) {
            return ((b) obj).f9373b;
        }
        return null;
    }

    public void a(Runnable runnable, Executor executor) {
        d dVar;
        C1434cX.a(runnable, (Object) "Runnable was null.");
        C1434cX.a(executor, (Object) "Executor was null.");
        if (isDone() || (dVar = this.f9370f) == d.f9378a) {
            b(runnable, executor);
        }
        d dVar2 = new d(runnable, executor);
        do {
            dVar2.f9381d = dVar;
            if (!f9367c.a((YX<?>) this, dVar, dVar2)) {
                dVar = this.f9370f;
            } else {
                return;
            }
        } while (dVar != d.f9378a);
        b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final void a(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(e());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(LY<? extends V> ly) {
        e eVar;
        b bVar;
        C1434cX.a(ly);
        Object obj = this.f9369e;
        if (obj == null) {
            if (ly.isDone()) {
                if (!f9367c.a((YX<?>) this, (Object) null, c((LY<?>) ly))) {
                    return false;
                }
                e(this);
                return true;
            }
            eVar = new e(this, ly);
            if (f9367c.a((YX<?>) this, (Object) null, (Object) eVar)) {
                try {
                    ly.a(eVar, C2568sY.INSTANCE);
                } catch (Throwable unused) {
                    bVar = b.f9372a;
                }
                return true;
            }
            obj = this.f9369e;
        }
        if (obj instanceof c) {
            ly.cancel(((c) obj).f9376c);
        }
        return false;
        f9367c.a((YX<?>) this, (Object) eVar, (Object) bVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(V v) {
        if (v == null) {
            v = f9368d;
        }
        if (!f9367c.a((YX<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        C1434cX.a(th);
        if (!f9367c.a((YX<?>) this, (Object) null, (Object) new b(th))) {
            return false;
        }
        e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public boolean cancel(boolean z) {
        Object obj = this.f9369e;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        c cVar = f9365a ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f9374a : c.f9375b;
        boolean z2 = false;
        Object obj2 = obj;
        YX yx = this;
        while (true) {
            if (f9367c.a((YX<?>) yx, obj2, (Object) cVar)) {
                if (z) {
                    yx.c();
                }
                e(yx);
                if (!(obj2 instanceof e)) {
                    return true;
                }
                LY<? extends V> ly = ((e) obj2).f9383b;
                if (ly instanceof g) {
                    yx = (YX) ly;
                    obj2 = yx.f9369e;
                    if (!(obj2 == null) && !(obj2 instanceof e)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    ly.cancel(z);
                    return true;
                }
            } else {
                obj2 = yx.f9369e;
                if (!(obj2 instanceof e)) {
                    return z2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        Object obj = this.f9369e;
        return (obj instanceof c) && ((c) obj).f9376c;
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9369e;
            if ((obj2 != null) && (!(obj2 instanceof e))) {
                return b(obj2);
            }
            k kVar = this.f9371g;
            if (kVar != k.f9395a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f9367c.a((YX<?>) this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9369e;
                            } else {
                                a(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return b(obj);
                    }
                    kVar = this.f9371g;
                } while (kVar != k.f9395a);
            }
            return b(this.f9369e);
        }
        throw new InterruptedException();
    }

    public V get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f9369e;
            if ((obj != null) && (!(obj instanceof e))) {
                return b(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                k kVar = this.f9371g;
                if (kVar != k.f9395a) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (f9367c.a((YX<?>) this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f9369e;
                                    if ((obj2 != null) && (!(obj2 instanceof e))) {
                                        return b(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(kVar2);
                        } else {
                            kVar = this.f9371g;
                        }
                    } while (kVar != k.f9395a);
                }
                return b(this.f9369e);
            }
            while (nanos > 0) {
                Object obj3 = this.f9369e;
                if ((obj3 != null) && (!(obj3 instanceof e))) {
                    return b(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String yx = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(yx).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(yx);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f9369e instanceof c;
    }

    public boolean isDone() {
        Object obj = this.f9369e;
        boolean z = true;
        boolean z2 = obj != null;
        if (obj instanceof e) {
            z = false;
        }
        return z2 & z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x001e
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L_0x0026
        L_0x001e:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
        L_0x0026:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L_0x00be
        L_0x004d:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L_0x0057
        L_0x0053:
            r6.a((java.lang.StringBuilder) r0)
            goto L_0x00be
        L_0x0057:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f9369e
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.YX.e
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.ads.YX$e r3 = (com.google.android.gms.internal.ads.YX.e) r3
            com.google.android.gms.internal.ads.LY<? extends V> r3 = r3.f9383b
            r6.a((java.lang.StringBuilder) r0, (java.lang.Object) r3)
        L_0x0072:
            r0.append(r2)
            goto L_0x00b0
        L_0x0076:
            java.lang.String r3 = r6.d()     // Catch:{ RuntimeException -> 0x0081, StackOverflowError -> 0x007f }
            java.lang.String r3 = com.google.android.gms.internal.ads.C2000kX.a((java.lang.String) r3)     // Catch:{ RuntimeException -> 0x0081, StackOverflowError -> 0x007f }
            goto L_0x00a5
        L_0x007f:
            r3 = move-exception
            goto L_0x0082
        L_0x0081:
            r3 = move-exception
        L_0x0082:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Exception thrown from implementation: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x00a5:
            if (r3 == 0) goto L_0x00b0
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            goto L_0x0072
        L_0x00b0:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto L_0x00be
            int r3 = r0.length()
            r0.delete(r1, r3)
            goto L_0x0053
        L_0x00be:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.YX.toString():java.lang.String");
    }
}
