package g.a.e;

import g.a.e;
import g.a.e.s;
import h.f;
import h.g;
import h.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class n implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final ExecutorService f15115a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp Http2Connection", true));

    /* renamed from: b  reason: collision with root package name */
    final boolean f15116b;

    /* renamed from: c  reason: collision with root package name */
    final b f15117c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Integer, t> f15118d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    final String f15119e;

    /* renamed from: f  reason: collision with root package name */
    int f15120f;

    /* renamed from: g  reason: collision with root package name */
    int f15121g;

    /* renamed from: h  reason: collision with root package name */
    boolean f15122h;
    private final ExecutorService i;
    private Map<Integer, w> j;
    final y k;
    private int l;
    long m = 0;
    long n;
    z o = new z();
    final z p = new z();
    boolean q = false;
    final Socket r;
    final u s;
    final c t;
    final Set<Integer> u = new LinkedHashSet();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Socket f15123a;

        /* renamed from: b  reason: collision with root package name */
        String f15124b;

        /* renamed from: c  reason: collision with root package name */
        g f15125c;

        /* renamed from: d  reason: collision with root package name */
        f f15126d;

        /* renamed from: e  reason: collision with root package name */
        b f15127e = b.f15130a;

        /* renamed from: f  reason: collision with root package name */
        y f15128f = y.f15184a;

        /* renamed from: g  reason: collision with root package name */
        boolean f15129g;

        public a(boolean z) {
            this.f15129g = z;
        }

        public a a(b bVar) {
            this.f15127e = bVar;
            return this;
        }

        public a a(Socket socket, String str, g gVar, f fVar) {
            this.f15123a = socket;
            this.f15124b = str;
            this.f15125c = gVar;
            this.f15126d = fVar;
            return this;
        }

        public n a() {
            return new n(this);
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15130a = new o();

        public void a(n nVar) {
        }

        public abstract void a(t tVar);
    }

    class c extends g.a.b implements s.b {

        /* renamed from: b  reason: collision with root package name */
        final s f15131b;

        c(s sVar) {
            super("OkHttp %s", n.this.f15119e);
            this.f15131b = sVar;
        }

        private void a(z zVar) {
            n.f15115a.execute(new r(this, "OkHttp %s ACK Settings", new Object[]{n.this.f15119e}, zVar));
        }

        public void a() {
        }

        public void a(int i, int i2, int i3, boolean z) {
        }

        public void a(int i, int i2, List<c> list) {
            n.this.a(i2, list);
        }

        public void a(int i, long j) {
            if (i == 0) {
                synchronized (n.this) {
                    n.this.n += j;
                    n.this.notifyAll();
                }
                return;
            }
            t b2 = n.this.b(i);
            if (b2 != null) {
                synchronized (b2) {
                    b2.a(j);
                }
            }
        }

        public void a(int i, b bVar) {
            if (n.this.c(i)) {
                n.this.a(i, bVar);
                return;
            }
            t e2 = n.this.e(i);
            if (e2 != null) {
                e2.c(bVar);
            }
        }

        public void a(int i, b bVar, h hVar) {
            t[] tVarArr;
            hVar.n();
            synchronized (n.this) {
                tVarArr = (t[]) n.this.f15118d.values().toArray(new t[n.this.f15118d.size()]);
                n.this.f15122h = true;
            }
            for (t tVar : tVarArr) {
                if (tVar.c() > i && tVar.f()) {
                    tVar.c(b.REFUSED_STREAM);
                    n.this.e(tVar.c());
                }
            }
        }

        public void a(boolean z, int i, int i2) {
            if (z) {
                w d2 = n.this.d(i);
                if (d2 != null) {
                    d2.b();
                    return;
                }
                return;
            }
            n.this.b(true, i, i2, (w) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
            r0.a(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
            r0.i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r10, int r11, int r12, java.util.List<g.a.e.c> r13) {
            /*
                r9 = this;
                g.a.e.n r12 = g.a.e.n.this
                boolean r12 = r12.c(r11)
                if (r12 == 0) goto L_0x000e
                g.a.e.n r12 = g.a.e.n.this
                r12.a(r11, r13, r10)
                return
            L_0x000e:
                g.a.e.n r12 = g.a.e.n.this
                monitor-enter(r12)
                g.a.e.n r0 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                boolean r0 = r0.f15122h     // Catch:{ all -> 0x0078 }
                if (r0 == 0) goto L_0x0019
                monitor-exit(r12)     // Catch:{ all -> 0x0078 }
                return
            L_0x0019:
                g.a.e.n r0 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                g.a.e.t r0 = r0.b(r11)     // Catch:{ all -> 0x0078 }
                if (r0 != 0) goto L_0x006e
                g.a.e.n r0 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                int r0 = r0.f15120f     // Catch:{ all -> 0x0078 }
                if (r11 > r0) goto L_0x0029
                monitor-exit(r12)     // Catch:{ all -> 0x0078 }
                return
            L_0x0029:
                int r0 = r11 % 2
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                int r1 = r1.f15121g     // Catch:{ all -> 0x0078 }
                r2 = 2
                int r1 = r1 % r2
                if (r0 != r1) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x0078 }
                return
            L_0x0035:
                g.a.e.t r0 = new g.a.e.t     // Catch:{ all -> 0x0078 }
                g.a.e.n r5 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                r6 = 0
                r3 = r0
                r4 = r11
                r7 = r10
                r8 = r13
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0078 }
                g.a.e.n r10 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                r10.f15120f = r11     // Catch:{ all -> 0x0078 }
                g.a.e.n r10 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                java.util.Map<java.lang.Integer, g.a.e.t> r10 = r10.f15118d     // Catch:{ all -> 0x0078 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0078 }
                r10.put(r13, r0)     // Catch:{ all -> 0x0078 }
                java.util.concurrent.ExecutorService r10 = g.a.e.n.f15115a     // Catch:{ all -> 0x0078 }
                g.a.e.p r13 = new g.a.e.p     // Catch:{ all -> 0x0078 }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0078 }
                r3 = 0
                g.a.e.n r4 = g.a.e.n.this     // Catch:{ all -> 0x0078 }
                java.lang.String r4 = r4.f15119e     // Catch:{ all -> 0x0078 }
                r2[r3] = r4     // Catch:{ all -> 0x0078 }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0078 }
                r2[r3] = r11     // Catch:{ all -> 0x0078 }
                r13.<init>(r9, r1, r2, r0)     // Catch:{ all -> 0x0078 }
                r10.execute(r13)     // Catch:{ all -> 0x0078 }
                monitor-exit(r12)     // Catch:{ all -> 0x0078 }
                return
            L_0x006e:
                monitor-exit(r12)     // Catch:{ all -> 0x0078 }
                r0.a((java.util.List<g.a.e.c>) r13)
                if (r10 == 0) goto L_0x0077
                r0.i()
            L_0x0077:
                return
            L_0x0078:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x0078 }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.e.n.c.a(boolean, int, int, java.util.List):void");
        }

        public void a(boolean z, int i, g gVar, int i2) {
            if (n.this.c(i)) {
                n.this.a(i, gVar, i2, z);
                return;
            }
            t b2 = n.this.b(i);
            if (b2 == null) {
                n.this.c(i, b.PROTOCOL_ERROR);
                gVar.skip((long) i2);
                return;
            }
            b2.a(gVar, i2);
            if (z) {
                b2.i();
            }
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r11, g.a.e.z r12) {
            /*
                r10 = this;
                g.a.e.n r0 = g.a.e.n.this
                monitor-enter(r0)
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                g.a.e.z r1 = r1.p     // Catch:{ all -> 0x0092 }
                int r1 = r1.c()     // Catch:{ all -> 0x0092 }
                if (r11 == 0) goto L_0x0014
                g.a.e.n r11 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                g.a.e.z r11 = r11.p     // Catch:{ all -> 0x0092 }
                r11.a()     // Catch:{ all -> 0x0092 }
            L_0x0014:
                g.a.e.n r11 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                g.a.e.z r11 = r11.p     // Catch:{ all -> 0x0092 }
                r11.a((g.a.e.z) r12)     // Catch:{ all -> 0x0092 }
                r10.a(r12)     // Catch:{ all -> 0x0092 }
                g.a.e.n r11 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                g.a.e.z r11 = r11.p     // Catch:{ all -> 0x0092 }
                int r11 = r11.c()     // Catch:{ all -> 0x0092 }
                r12 = -1
                r2 = 0
                r4 = 1
                r5 = 0
                if (r11 == r12) goto L_0x0064
                if (r11 == r1) goto L_0x0064
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x0092 }
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                boolean r1 = r1.q     // Catch:{ all -> 0x0092 }
                if (r1 != 0) goto L_0x0040
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                r1.f(r11)     // Catch:{ all -> 0x0092 }
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                r1.q = r4     // Catch:{ all -> 0x0092 }
            L_0x0040:
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                java.util.Map<java.lang.Integer, g.a.e.t> r1 = r1.f15118d     // Catch:{ all -> 0x0092 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0092 }
                if (r1 != 0) goto L_0x0065
                g.a.e.n r1 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                java.util.Map<java.lang.Integer, g.a.e.t> r1 = r1.f15118d     // Catch:{ all -> 0x0092 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0092 }
                g.a.e.n r5 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                java.util.Map<java.lang.Integer, g.a.e.t> r5 = r5.f15118d     // Catch:{ all -> 0x0092 }
                int r5 = r5.size()     // Catch:{ all -> 0x0092 }
                g.a.e.t[] r5 = new g.a.e.t[r5]     // Catch:{ all -> 0x0092 }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x0092 }
                r5 = r1
                g.a.e.t[] r5 = (g.a.e.t[]) r5     // Catch:{ all -> 0x0092 }
                goto L_0x0065
            L_0x0064:
                r11 = r2
            L_0x0065:
                java.util.concurrent.ExecutorService r1 = g.a.e.n.f15115a     // Catch:{ all -> 0x0092 }
                g.a.e.q r6 = new g.a.e.q     // Catch:{ all -> 0x0092 }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0092 }
                g.a.e.n r8 = g.a.e.n.this     // Catch:{ all -> 0x0092 }
                java.lang.String r8 = r8.f15119e     // Catch:{ all -> 0x0092 }
                r9 = 0
                r4[r9] = r8     // Catch:{ all -> 0x0092 }
                r6.<init>(r10, r7, r4)     // Catch:{ all -> 0x0092 }
                r1.execute(r6)     // Catch:{ all -> 0x0092 }
                monitor-exit(r0)     // Catch:{ all -> 0x0092 }
                if (r5 == 0) goto L_0x0091
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x0091
                int r0 = r5.length
            L_0x0082:
                if (r9 >= r0) goto L_0x0091
                r1 = r5[r9]
                monitor-enter(r1)
                r1.a((long) r11)     // Catch:{ all -> 0x008e }
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                int r9 = r9 + 1
                goto L_0x0082
            L_0x008e:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r11
            L_0x0091:
                return
            L_0x0092:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0092 }
                goto L_0x0096
            L_0x0095:
                throw r11
            L_0x0096:
                goto L_0x0095
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.e.n.c.a(boolean, g.a.e.z):void");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = g.a.e.b.PROTOCOL_ERROR;
            r0 = g.a.e.b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r2 = r4.f15132c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r4 = this;
                g.a.e.b r0 = g.a.e.b.INTERNAL_ERROR
                g.a.e.s r1 = r4.f15131b     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.a((g.a.e.s.b) r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                g.a.e.s r1 = r4.f15131b     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.a((boolean) r2, (g.a.e.s.b) r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                g.a.e.b r1 = g.a.e.b.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                g.a.e.b r0 = g.a.e.b.CANCEL     // Catch:{ IOException -> 0x001c }
                g.a.e.n r2 = g.a.e.n.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                g.a.e.b r1 = g.a.e.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                g.a.e.b r0 = g.a.e.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                g.a.e.n r2 = g.a.e.n.this     // Catch:{ IOException -> 0x0025 }
            L_0x0022:
                r2.a((g.a.e.b) r1, (g.a.e.b) r0)     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                g.a.e.s r0 = r4.f15131b
                g.a.e.a((java.io.Closeable) r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                g.a.e.n r3 = g.a.e.n.this     // Catch:{ IOException -> 0x0031 }
                r3.a((g.a.e.b) r1, (g.a.e.b) r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                g.a.e.s r0 = r4.f15131b
                g.a.e.a((java.io.Closeable) r0)
                goto L_0x0038
            L_0x0037:
                throw r2
            L_0x0038:
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.e.n.c.b():void");
        }
    }

    n(a aVar) {
        this.k = aVar.f15128f;
        boolean z = aVar.f15129g;
        this.f15116b = z;
        this.f15117c = aVar.f15127e;
        int i2 = 2;
        this.f15121g = z ? 1 : 2;
        if (aVar.f15129g) {
            this.f15121g += 2;
        }
        this.l = aVar.f15129g ? 1 : i2;
        if (aVar.f15129g) {
            this.o.a(7, 16777216);
        }
        this.f15119e = aVar.f15124b;
        this.i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.a(e.a("OkHttp %s Push Observer", this.f15119e), true));
        this.p.a(7, 65535);
        this.p.a(5, 16384);
        this.n = (long) this.p.c();
        this.r = aVar.f15123a;
        this.s = new u(aVar.f15126d, this.f15116b);
        this.t = new c(new s(aVar.f15125c, this.f15116b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g.a.e.t b(int r11, java.util.List<g.a.e.c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            g.a.e.u r7 = r10.s
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x006c }
            boolean r0 = r10.f15122h     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0063
            int r8 = r10.f15121g     // Catch:{ all -> 0x0069 }
            int r0 = r10.f15121g     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 2
            r10.f15121g = r0     // Catch:{ all -> 0x0069 }
            g.a.e.t r9 = new g.a.e.t     // Catch:{ all -> 0x0069 }
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0069 }
            if (r13 == 0) goto L_0x0030
            long r0 = r10.n     // Catch:{ all -> 0x0069 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0030
            long r0 = r9.f15150b     // Catch:{ all -> 0x0069 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r13 = 0
            goto L_0x0031
        L_0x0030:
            r13 = 1
        L_0x0031:
            boolean r0 = r9.g()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0040
            java.util.Map<java.lang.Integer, g.a.e.t> r0 = r10.f15118d     // Catch:{ all -> 0x0069 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0069 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0069 }
        L_0x0040:
            monitor-exit(r10)     // Catch:{ all -> 0x0069 }
            if (r11 != 0) goto L_0x0049
            g.a.e.u r0 = r10.s     // Catch:{ all -> 0x006c }
            r0.a((boolean) r6, (int) r8, (int) r11, (java.util.List<g.a.e.c>) r12)     // Catch:{ all -> 0x006c }
            goto L_0x0052
        L_0x0049:
            boolean r0 = r10.f15116b     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x005b
            g.a.e.u r0 = r10.s     // Catch:{ all -> 0x006c }
            r0.a((int) r11, (int) r8, (java.util.List<g.a.e.c>) r12)     // Catch:{ all -> 0x006c }
        L_0x0052:
            monitor-exit(r7)     // Catch:{ all -> 0x006c }
            if (r13 == 0) goto L_0x005a
            g.a.e.u r11 = r10.s
            r11.flush()
        L_0x005a:
            return r9
        L_0x005b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006c }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x006c }
            throw r11     // Catch:{ all -> 0x006c }
        L_0x0063:
            g.a.e.a r11 = new g.a.e.a     // Catch:{ all -> 0x0069 }
            r11.<init>()     // Catch:{ all -> 0x0069 }
            throw r11     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0069 }
            throw r11     // Catch:{ all -> 0x006c }
        L_0x006c:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.e.n.b(int, java.util.List, boolean):g.a.e.t");
    }

    public t a(List<c> list, boolean z) {
        return b(0, list, z);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, b bVar) {
        this.i.execute(new m(this, "OkHttp %s Push Reset[%s]", new Object[]{this.f15119e, Integer.valueOf(i2)}, i2, bVar));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, g gVar, int i3, boolean z) {
        h.e eVar = new h.e();
        long j2 = (long) i3;
        gVar.c(j2);
        gVar.a(eVar, j2);
        if (eVar.o() == j2) {
            this.i.execute(new l(this, "OkHttp %s Push Data[%s]", new Object[]{this.f15119e, Integer.valueOf(i2)}, i2, eVar, i3, z));
            return;
        }
        throw new IOException(eVar.o() + " != " + i3);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, List<c> list) {
        synchronized (this) {
            if (this.u.contains(Integer.valueOf(i2))) {
                c(i2, b.PROTOCOL_ERROR);
                return;
            }
            this.u.add(Integer.valueOf(i2));
            this.i.execute(new j(this, "OkHttp %s Push Request[%s]", new Object[]{this.f15119e, Integer.valueOf(i2)}, i2, list));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, List<c> list, boolean z) {
        this.i.execute(new k(this, "OkHttp %s Push Headers[%s]", new Object[]{this.f15119e, Integer.valueOf(i2)}, i2, list, z));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.n), r8.s.r());
        r6 = (long) r3;
        r8.n -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r9, boolean r10, h.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            g.a.e.u r12 = r8.s
            r12.a((boolean) r10, (int) r9, (h.e) r11, (int) r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0062
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.n     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, g.a.e.t> r3 = r8.f15118d     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.n     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            g.a.e.u r3 = r8.s     // Catch:{ all -> 0x0058 }
            int r3 = r3.r()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.n     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.n = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            g.a.e.u r4 = r8.s
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.a((boolean) r5, (int) r9, (h.e) r11, (int) r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0060
        L_0x005a:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0060:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.e.n.a(int, boolean, h.e, long):void");
    }

    public void a(b bVar) {
        synchronized (this.s) {
            synchronized (this) {
                if (!this.f15122h) {
                    this.f15122h = true;
                    int i2 = this.f15120f;
                    this.s.a(i2, bVar, e.f15033a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, b bVar2) {
        t[] tVarArr;
        w[] wVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f15118d.isEmpty()) {
                tVarArr = (t[]) this.f15118d.values().toArray(new t[this.f15118d.size()]);
                this.f15118d.clear();
            } else {
                tVarArr = null;
            }
            if (this.j != null) {
                this.j = null;
                wVarArr = (w[]) this.j.values().toArray(new w[this.j.size()]);
            }
        }
        if (tVarArr != null) {
            IOException iOException = e;
            for (t a2 : tVarArr) {
                try {
                    a2.a(bVar2);
                } catch (IOException e3) {
                    if (iOException != null) {
                        iOException = e3;
                    }
                }
            }
            e = iOException;
        }
        if (wVarArr != null) {
            for (w a3 : wVarArr) {
                a3.a();
            }
        }
        try {
            this.s.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.r.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (z) {
            this.s.a();
            this.s.b(this.o);
            int c2 = this.o.c();
            if (c2 != 65535) {
                this.s.b(0, (long) (c2 - 65535));
            }
        }
        new Thread(this.t).start();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i2, int i3, w wVar) {
        synchronized (this.s) {
            if (wVar != null) {
                wVar.c();
            }
            this.s.a(z, i2, i3);
        }
    }

    public synchronized boolean a() {
        return this.f15122h;
    }

    /* access modifiers changed from: package-private */
    public synchronized t b(int i2) {
        return this.f15118d.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, long j2) {
        f15115a.execute(new h(this, "OkHttp Window Update %s stream %d", new Object[]{this.f15119e, Integer.valueOf(i2)}, i2, j2));
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, b bVar) {
        this.s.a(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z, int i2, int i3, w wVar) {
        f15115a.execute(new i(this, "OkHttp %s ping %08x%08x", new Object[]{this.f15119e, Integer.valueOf(i2), Integer.valueOf(i3)}, z, i2, i3, wVar));
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, b bVar) {
        f15115a.execute(new g(this, "OkHttp %s stream %d", new Object[]{this.f15119e, Integer.valueOf(i2)}, i2, bVar));
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public void close() {
        a(b.NO_ERROR, b.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public synchronized w d(int i2) {
        return this.j != null ? this.j.remove(Integer.valueOf(i2)) : null;
    }

    /* access modifiers changed from: package-private */
    public synchronized t e(int i2) {
        t remove;
        remove = this.f15118d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void f(long j2) {
        this.n += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public void flush() {
        this.s.flush();
    }

    public synchronized int r() {
        return this.p.b(Integer.MAX_VALUE);
    }

    public void s() {
        a(true);
    }
}
