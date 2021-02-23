package g.a.e;

import h.e;
import h.g;
import h.v;
import h.w;
import h.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    long f15149a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f15150b;

    /* renamed from: c  reason: collision with root package name */
    final int f15151c;

    /* renamed from: d  reason: collision with root package name */
    final n f15152d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f15153e;

    /* renamed from: f  reason: collision with root package name */
    private List<c> f15154f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15155g;

    /* renamed from: h  reason: collision with root package name */
    private final b f15156h;
    final a i;
    final c j = new c();
    final c k = new c();
    b l = null;

    final class a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final e f15157a = new e();

        /* renamed from: b  reason: collision with root package name */
        boolean f15158b;

        /* renamed from: c  reason: collision with root package name */
        boolean f15159c;

        a() {
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) {
            long min;
            synchronized (t.this) {
                t.this.k.h();
                while (t.this.f15150b <= 0 && !this.f15159c && !this.f15158b && t.this.l == null) {
                    try {
                        t.this.k();
                    } catch (Throwable th) {
                        t.this.k.k();
                        throw th;
                    }
                }
                t.this.k.k();
                t.this.b();
                min = Math.min(t.this.f15150b, this.f15157a.o());
                t.this.f15150b -= min;
            }
            t.this.k.h();
            try {
                t.this.f15152d.a(t.this.f15151c, z && min == this.f15157a.o(), this.f15157a, min);
            } finally {
                t.this.k.k();
            }
        }

        public void b(e eVar, long j) {
            this.f15157a.b(eVar, j);
            while (this.f15157a.o() >= 16384) {
                a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f15157a.o() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f15157a.o() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f15160d;
            r0.f15152d.a(r0.f15151c, true, (h.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f15160d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f15158b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f15160d.f15152d.flush();
            r8.f15160d.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f15160d.i.f15159c != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                g.a.e.t r0 = g.a.e.t.this
                monitor-enter(r0)
                boolean r1 = r8.f15158b     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                g.a.e.t r0 = g.a.e.t.this
                g.a.e.t$a r0 = r0.i
                boolean r0 = r0.f15159c
                r1 = 1
                if (r0 != 0) goto L_0x003a
                h.e r0 = r8.f15157a
                long r2 = r0.o()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                h.e r0 = r8.f15157a
                long r2 = r0.o()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.a(r1)
                goto L_0x001f
            L_0x002d:
                g.a.e.t r0 = g.a.e.t.this
                g.a.e.n r2 = r0.f15152d
                int r3 = r0.f15151c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a((int) r3, (boolean) r4, (h.e) r5, (long) r6)
            L_0x003a:
                g.a.e.t r2 = g.a.e.t.this
                monitor-enter(r2)
                r8.f15158b = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                g.a.e.t r0 = g.a.e.t.this
                g.a.e.n r0 = r0.f15152d
                r0.flush()
                g.a.e.t r0 = g.a.e.t.this
                r0.a()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.e.t.a.close():void");
        }

        public void flush() {
            synchronized (t.this) {
                t.this.b();
            }
            while (this.f15157a.o() > 0) {
                a(false);
                t.this.f15152d.flush();
            }
        }

        public y timeout() {
            return t.this.k;
        }
    }

    private final class b implements w {

        /* renamed from: a  reason: collision with root package name */
        private final e f15161a = new e();

        /* renamed from: b  reason: collision with root package name */
        private final e f15162b = new e();

        /* renamed from: c  reason: collision with root package name */
        private final long f15163c;

        /* renamed from: d  reason: collision with root package name */
        boolean f15164d;

        /* renamed from: e  reason: collision with root package name */
        boolean f15165e;

        b(long j) {
            this.f15163c = j;
        }

        private void a() {
            if (!this.f15164d) {
                b bVar = t.this.l;
                if (bVar != null) {
                    throw new A(bVar);
                }
                return;
            }
            throw new IOException("stream closed");
        }

        private void c() {
            t.this.j.h();
            while (this.f15162b.o() == 0 && !this.f15165e && !this.f15164d && t.this.l == null) {
                try {
                    t.this.k();
                } finally {
                    t.this.j.k();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r10 = r7.f15166f.f15152d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r7.f15166f.f15152d.m += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r7.f15166f.f15152d.m < ((long) (r7.f15166f.f15152d.o.c() / 2))) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
            r7.f15166f.f15152d.b(0, r7.f15166f.f15152d.m);
            r7.f15166f.f15152d.m = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
            monitor-exit(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
            return r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long a(h.e r8, long r9) {
            /*
                r7 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x009e
                g.a.e.t r2 = g.a.e.t.this
                monitor-enter(r2)
                r7.c()     // Catch:{ all -> 0x009b }
                r7.a()     // Catch:{ all -> 0x009b }
                h.e r3 = r7.f15162b     // Catch:{ all -> 0x009b }
                long r3 = r3.o()     // Catch:{ all -> 0x009b }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r8 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x009b }
                return r8
            L_0x001d:
                h.e r3 = r7.f15162b     // Catch:{ all -> 0x009b }
                h.e r4 = r7.f15162b     // Catch:{ all -> 0x009b }
                long r4 = r4.o()     // Catch:{ all -> 0x009b }
                long r9 = java.lang.Math.min(r9, r4)     // Catch:{ all -> 0x009b }
                long r8 = r3.a((h.e) r8, (long) r9)     // Catch:{ all -> 0x009b }
                g.a.e.t r10 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                long r3 = r10.f15149a     // Catch:{ all -> 0x009b }
                long r3 = r3 + r8
                r10.f15149a = r3     // Catch:{ all -> 0x009b }
                g.a.e.t r10 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                long r3 = r10.f15149a     // Catch:{ all -> 0x009b }
                g.a.e.t r10 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                g.a.e.n r10 = r10.f15152d     // Catch:{ all -> 0x009b }
                g.a.e.z r10 = r10.o     // Catch:{ all -> 0x009b }
                int r10 = r10.c()     // Catch:{ all -> 0x009b }
                int r10 = r10 / 2
                long r5 = (long) r10     // Catch:{ all -> 0x009b }
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 < 0) goto L_0x005c
                g.a.e.t r10 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                g.a.e.n r10 = r10.f15152d     // Catch:{ all -> 0x009b }
                g.a.e.t r3 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                int r3 = r3.f15151c     // Catch:{ all -> 0x009b }
                g.a.e.t r4 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                long r4 = r4.f15149a     // Catch:{ all -> 0x009b }
                r10.b((int) r3, (long) r4)     // Catch:{ all -> 0x009b }
                g.a.e.t r10 = g.a.e.t.this     // Catch:{ all -> 0x009b }
                r10.f15149a = r0     // Catch:{ all -> 0x009b }
            L_0x005c:
                monitor-exit(r2)     // Catch:{ all -> 0x009b }
                g.a.e.t r10 = g.a.e.t.this
                g.a.e.n r10 = r10.f15152d
                monitor-enter(r10)
                g.a.e.t r2 = g.a.e.t.this     // Catch:{ all -> 0x0098 }
                g.a.e.n r2 = r2.f15152d     // Catch:{ all -> 0x0098 }
                long r3 = r2.m     // Catch:{ all -> 0x0098 }
                long r3 = r3 + r8
                r2.m = r3     // Catch:{ all -> 0x0098 }
                g.a.e.t r2 = g.a.e.t.this     // Catch:{ all -> 0x0098 }
                g.a.e.n r2 = r2.f15152d     // Catch:{ all -> 0x0098 }
                long r2 = r2.m     // Catch:{ all -> 0x0098 }
                g.a.e.t r4 = g.a.e.t.this     // Catch:{ all -> 0x0098 }
                g.a.e.n r4 = r4.f15152d     // Catch:{ all -> 0x0098 }
                g.a.e.z r4 = r4.o     // Catch:{ all -> 0x0098 }
                int r4 = r4.c()     // Catch:{ all -> 0x0098 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x0098 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x0096
                g.a.e.t r2 = g.a.e.t.this     // Catch:{ all -> 0x0098 }
                g.a.e.n r2 = r2.f15152d     // Catch:{ all -> 0x0098 }
                r3 = 0
                g.a.e.t r4 = g.a.e.t.this     // Catch:{ all -> 0x0098 }
                g.a.e.n r4 = r4.f15152d     // Catch:{ all -> 0x0098 }
                long r4 = r4.m     // Catch:{ all -> 0x0098 }
                r2.b((int) r3, (long) r4)     // Catch:{ all -> 0x0098 }
                g.a.e.t r2 = g.a.e.t.this     // Catch:{ all -> 0x0098 }
                g.a.e.n r2 = r2.f15152d     // Catch:{ all -> 0x0098 }
                r2.m = r0     // Catch:{ all -> 0x0098 }
            L_0x0096:
                monitor-exit(r10)     // Catch:{ all -> 0x0098 }
                return r8
            L_0x0098:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0098 }
                throw r8
            L_0x009b:
                r8 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x009b }
                throw r8
            L_0x009e:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.e.t.b.a(h.e, long):long");
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (t.this) {
                    z = this.f15165e;
                    z2 = true;
                    z3 = this.f15162b.o() + j > this.f15163c;
                }
                if (z3) {
                    gVar.skip(j);
                    t.this.b(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    gVar.skip(j);
                    return;
                } else {
                    long a2 = gVar.a(this.f15161a, j);
                    if (a2 != -1) {
                        j -= a2;
                        synchronized (t.this) {
                            if (this.f15162b.o() != 0) {
                                z2 = false;
                            }
                            this.f15162b.a((w) this.f15161a);
                            if (z2) {
                                t.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() {
            synchronized (t.this) {
                this.f15164d = true;
                this.f15162b.a();
                t.this.notifyAll();
            }
            t.this.a();
        }

        public y timeout() {
            return t.this.j;
        }
    }

    class c extends h.c {
        c() {
        }

        /* access modifiers changed from: protected */
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void j() {
            t.this.b(b.CANCEL);
        }

        public void k() {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    t(int i2, n nVar, boolean z, boolean z2, List<c> list) {
        if (nVar == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f15151c = i2;
            this.f15152d = nVar;
            this.f15150b = (long) nVar.p.c();
            this.f15156h = new b((long) nVar.o.c());
            this.i = new a();
            this.f15156h.f15165e = z2;
            this.i.f15159c = z;
            this.f15153e = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    private boolean d(b bVar) {
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            if (this.f15156h.f15165e && this.i.f15159c) {
                return false;
            }
            this.l = bVar;
            notifyAll();
            this.f15152d.e(this.f15151c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z;
        boolean g2;
        synchronized (this) {
            z = !this.f15156h.f15165e && this.f15156h.f15164d && (this.i.f15159c || this.i.f15158b);
            g2 = g();
        }
        if (z) {
            a(b.CANCEL);
        } else if (!g2) {
            this.f15152d.e(this.f15151c);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        this.f15150b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public void a(b bVar) {
        if (d(bVar)) {
            this.f15152d.b(this.f15151c, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(g gVar, int i2) {
        this.f15156h.a(gVar, (long) i2);
    }

    /* access modifiers changed from: package-private */
    public void a(List<c> list) {
        boolean z;
        synchronized (this) {
            z = true;
            this.f15155g = true;
            if (this.f15154f == null) {
                this.f15154f = list;
                z = g();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f15154f);
                arrayList.add((Object) null);
                arrayList.addAll(list);
                this.f15154f = arrayList;
            }
        }
        if (!z) {
            this.f15152d.e(this.f15151c);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a aVar = this.i;
        if (aVar.f15158b) {
            throw new IOException("stream closed");
        } else if (!aVar.f15159c) {
            b bVar = this.l;
            if (bVar != null) {
                throw new A(bVar);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    public void b(b bVar) {
        if (d(bVar)) {
            this.f15152d.c(this.f15151c, bVar);
        }
    }

    public int c() {
        return this.f15151c;
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(b bVar) {
        if (this.l == null) {
            this.l = bVar;
            notifyAll();
        }
    }

    public v d() {
        synchronized (this) {
            if (!this.f15155g) {
                if (!f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.i;
    }

    public w e() {
        return this.f15156h;
    }

    public boolean f() {
        return this.f15152d.f15116b == ((this.f15151c & 1) == 1);
    }

    public synchronized boolean g() {
        if (this.l != null) {
            return false;
        }
        return (!this.f15156h.f15165e && !this.f15156h.f15164d) || (!this.i.f15159c && !this.i.f15158b) || !this.f15155g;
    }

    public y h() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        boolean g2;
        synchronized (this) {
            this.f15156h.f15165e = true;
            g2 = g();
            notifyAll();
        }
        if (!g2) {
            this.f15152d.e(this.f15151c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r2.j.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<g.a.e.c> j() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0035
            g.a.e.t$c r0 = r2.j     // Catch:{ all -> 0x003d }
            r0.h()     // Catch:{ all -> 0x003d }
        L_0x000c:
            java.util.List<g.a.e.c> r0 = r2.f15154f     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0018
            g.a.e.b r0 = r2.l     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0018
            r2.k()     // Catch:{ all -> 0x002e }
            goto L_0x000c
        L_0x0018:
            g.a.e.t$c r0 = r2.j     // Catch:{ all -> 0x003d }
            r0.k()     // Catch:{ all -> 0x003d }
            java.util.List<g.a.e.c> r0 = r2.f15154f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0026
            r1 = 0
            r2.f15154f = r1     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            return r0
        L_0x0026:
            g.a.e.A r0 = new g.a.e.A     // Catch:{ all -> 0x003d }
            g.a.e.b r1 = r2.l     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x002e:
            r0 = move-exception
            g.a.e.t$c r1 = r2.j     // Catch:{ all -> 0x003d }
            r1.k()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "servers cannot read response headers"
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0041
        L_0x0040:
            throw r0
        L_0x0041:
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.e.t.j():java.util.List");
    }

    /* access modifiers changed from: package-private */
    public void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public y l() {
        return this.k;
    }
}
