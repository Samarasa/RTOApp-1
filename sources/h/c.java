package h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c extends y {

    /* renamed from: e  reason: collision with root package name */
    private static final long f15320e = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: f  reason: collision with root package name */
    private static final long f15321f = TimeUnit.MILLISECONDS.toNanos(f15320e);

    /* renamed from: g  reason: collision with root package name */
    static c f15322g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15323h;
    private c i;
    private long j;

    private static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.j();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<h.c> r0 = h.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                h.c r1 = h.c.g()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                h.c r2 = h.c.f15322g     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                h.c.f15322g = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.j()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: h.c.a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[EDGE_INSN: B:34:0x0054->B:23:0x0054 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(h.c r6, long r7, boolean r9) {
        /*
            java.lang.Class<h.c> r0 = h.c.class
            monitor-enter(r0)
            h.c r1 = f15322g     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0016
            h.c r1 = new h.c     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            f15322g = r1     // Catch:{ all -> 0x006b }
            h.c$a r1 = new h.c$a     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            r1.start()     // Catch:{ all -> 0x006b }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006b }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.c()     // Catch:{ all -> 0x006b }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x006b }
        L_0x002b:
            long r7 = r7 + r1
            r6.j = r7     // Catch:{ all -> 0x006b }
            goto L_0x003c
        L_0x002f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            if (r9 == 0) goto L_0x0065
            long r7 = r6.c()     // Catch:{ all -> 0x006b }
            r6.j = r7     // Catch:{ all -> 0x006b }
        L_0x003c:
            long r7 = r6.b((long) r1)     // Catch:{ all -> 0x006b }
            h.c r9 = f15322g     // Catch:{ all -> 0x006b }
        L_0x0042:
            h.c r3 = r9.i     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0054
            h.c r3 = r9.i     // Catch:{ all -> 0x006b }
            long r3 = r3.b((long) r1)     // Catch:{ all -> 0x006b }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            h.c r9 = r9.i     // Catch:{ all -> 0x006b }
            goto L_0x0042
        L_0x0054:
            h.c r7 = r9.i     // Catch:{ all -> 0x006b }
            r6.i = r7     // Catch:{ all -> 0x006b }
            r9.i = r6     // Catch:{ all -> 0x006b }
            h.c r6 = f15322g     // Catch:{ all -> 0x006b }
            if (r9 != r6) goto L_0x0063
            java.lang.Class<h.c> r6 = h.c.class
            r6.notify()     // Catch:{ all -> 0x006b }
        L_0x0063:
            monitor-exit(r0)
            return
        L_0x0065:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x006b }
            r6.<init>()     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x006f
        L_0x006e:
            throw r6
        L_0x006f:
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.a(h.c, long, boolean):void");
    }

    private static synchronized boolean a(c cVar) {
        boolean z;
        synchronized (c.class) {
            c cVar2 = f15322g;
            while (true) {
                if (cVar2 == null) {
                    z = true;
                    break;
                } else if (cVar2.i == cVar) {
                    cVar2.i = cVar.i;
                    cVar.i = null;
                    z = false;
                    break;
                } else {
                    cVar2 = cVar2.i;
                }
            }
        }
        return z;
    }

    private long b(long j2) {
        return this.j - j2;
    }

    static c g() {
        c cVar = f15322g.i;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            c.class.wait(f15320e);
            if (f15322g.i != null || System.nanoTime() - nanoTime < f15321f) {
                return null;
            }
            return f15322g;
        }
        long b2 = cVar.b(System.nanoTime());
        if (b2 > 0) {
            long j2 = b2 / 1000000;
            c.class.wait(j2, (int) (b2 - (1000000 * j2)));
            return null;
        }
        f15322g.i = cVar.i;
        cVar.i = null;
        return cVar;
    }

    public final v a(v vVar) {
        return new a(this, vVar);
    }

    public final w a(w wVar) {
        return new b(this, wVar);
    }

    /* access modifiers changed from: package-private */
    public final IOException a(IOException iOException) {
        return !i() ? iOException : b(iOException);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (i() && z) {
            throw b((IOException) null);
        }
    }

    /* access modifiers changed from: protected */
    public IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void h() {
        if (!this.f15323h) {
            long f2 = f();
            boolean d2 = d();
            if (f2 != 0 || d2) {
                this.f15323h = true;
                a(this, f2, d2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean i() {
        if (!this.f15323h) {
            return false;
        }
        this.f15323h = false;
        return a(this);
    }

    /* access modifiers changed from: protected */
    public void j() {
    }
}
