package g.a.b;

import g.C3339a;
import g.C3352m;
import g.E;
import g.N;
import g.a.c.c;
import g.a.e;
import g.a.e.A;
import g.a.e.C3340a;
import g.a.e.b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final C3339a f14976a;

    /* renamed from: b  reason: collision with root package name */
    private N f14977b;

    /* renamed from: c  reason: collision with root package name */
    private final C3352m f14978c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14979d;

    /* renamed from: e  reason: collision with root package name */
    private final f f14980e;

    /* renamed from: f  reason: collision with root package name */
    private int f14981f;

    /* renamed from: g  reason: collision with root package name */
    private c f14982g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14983h;
    private boolean i;
    private c j;

    public static final class a extends WeakReference<g> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f14984a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f14984a = obj;
        }
    }

    public g(C3352m mVar, C3339a aVar, Object obj) {
        this.f14978c = mVar;
        this.f14976a = aVar;
        this.f14980e = new f(aVar, f());
        this.f14979d = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        r1 = r6.f14980e.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        r2 = r6.f14978c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r6.i != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
        g.a.a.f14935a.a(r6.f14978c, r6.f14976a, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r6.f14982g == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        r7 = r6.f14982g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004e, code lost:
        r6.f14977b = r1;
        r6.f14981f = 0;
        r0 = new g.a.b.c(r6.f14978c, r1);
        a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
        r0.a(r7, r8, r9, r10);
        f().a(r0.a());
        r7 = r6.f14978c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        g.a.a.f14935a.b(r6.f14978c, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r0.c() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        r4 = g.a.a.f14935a.a(r6.f14978c, r6.f14976a, r6);
        r0 = r6.f14982g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        g.a.e.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0097, code lost:
        throw new java.io.IOException("Canceled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g.a.b.c a(int r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            g.m r0 = r6.f14978c
            monitor-enter(r0)
            boolean r1 = r6.f14983h     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x00ab
            g.a.c.c r1 = r6.j     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.i     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x009b
            g.a.b.c r1 = r6.f14982g     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.k     // Catch:{ all -> 0x00b3 }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return r1
        L_0x0019:
            g.a.a r1 = g.a.a.f14935a     // Catch:{ all -> 0x00b3 }
            g.m r2 = r6.f14978c     // Catch:{ all -> 0x00b3 }
            g.a r3 = r6.f14976a     // Catch:{ all -> 0x00b3 }
            r4 = 0
            r1.a(r2, r3, r6, r4)     // Catch:{ all -> 0x00b3 }
            g.a.b.c r1 = r6.f14982g     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x002b
            g.a.b.c r7 = r6.f14982g     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return r7
        L_0x002b:
            g.N r1 = r6.f14977b     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0036
            g.a.b.f r0 = r6.f14980e
            g.N r1 = r0.b()
        L_0x0036:
            g.m r2 = r6.f14978c
            monitor-enter(r2)
            boolean r0 = r6.i     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0090
            g.a.a r0 = g.a.a.f14935a     // Catch:{ all -> 0x0098 }
            g.m r3 = r6.f14978c     // Catch:{ all -> 0x0098 }
            g.a r5 = r6.f14976a     // Catch:{ all -> 0x0098 }
            r0.a(r3, r5, r6, r1)     // Catch:{ all -> 0x0098 }
            g.a.b.c r0 = r6.f14982g     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x004e
            g.a.b.c r7 = r6.f14982g     // Catch:{ all -> 0x0098 }
            monitor-exit(r2)     // Catch:{ all -> 0x0098 }
            return r7
        L_0x004e:
            r6.f14977b = r1     // Catch:{ all -> 0x0098 }
            r0 = 0
            r6.f14981f = r0     // Catch:{ all -> 0x0098 }
            g.a.b.c r0 = new g.a.b.c     // Catch:{ all -> 0x0098 }
            g.m r3 = r6.f14978c     // Catch:{ all -> 0x0098 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0098 }
            r6.a((g.a.b.c) r0)     // Catch:{ all -> 0x0098 }
            monitor-exit(r2)     // Catch:{ all -> 0x0098 }
            r0.a((int) r7, (int) r8, (int) r9, (boolean) r10)
            g.a.b.d r7 = r6.f()
            g.N r8 = r0.a()
            r7.a(r8)
            g.m r7 = r6.f14978c
            monitor-enter(r7)
            g.a.a r8 = g.a.a.f14935a     // Catch:{ all -> 0x008d }
            g.m r9 = r6.f14978c     // Catch:{ all -> 0x008d }
            r8.b(r9, r0)     // Catch:{ all -> 0x008d }
            boolean r8 = r0.c()     // Catch:{ all -> 0x008d }
            if (r8 == 0) goto L_0x0088
            g.a.a r8 = g.a.a.f14935a     // Catch:{ all -> 0x008d }
            g.m r9 = r6.f14978c     // Catch:{ all -> 0x008d }
            g.a r10 = r6.f14976a     // Catch:{ all -> 0x008d }
            java.net.Socket r4 = r8.a((g.C3352m) r9, (g.C3339a) r10, (g.a.b.g) r6)     // Catch:{ all -> 0x008d }
            g.a.b.c r0 = r6.f14982g     // Catch:{ all -> 0x008d }
        L_0x0088:
            monitor-exit(r7)     // Catch:{ all -> 0x008d }
            g.a.e.a((java.net.Socket) r4)
            return r0
        L_0x008d:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x008d }
            throw r8
        L_0x0090:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0098 }
            java.lang.String r8 = "Canceled"
            r7.<init>(r8)     // Catch:{ all -> 0x0098 }
            throw r7     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0098 }
            throw r7
        L_0x009b:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = "Canceled"
            r7.<init>(r8)     // Catch:{ all -> 0x00b3 }
            throw r7     // Catch:{ all -> 0x00b3 }
        L_0x00a3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = "codec != null"
            r7.<init>(r8)     // Catch:{ all -> 0x00b3 }
            throw r7     // Catch:{ all -> 0x00b3 }
        L_0x00ab:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = "released"
            r7.<init>(r8)     // Catch:{ all -> 0x00b3 }
            throw r7     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.b.g.a(int, int, int, boolean):g.a.b.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.a(r8) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g.a.b.c a(int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
            r3 = this;
        L_0x0000:
            g.a.b.c r0 = r3.a(r4, r5, r6, r7)
            g.m r1 = r3.f14978c
            monitor-enter(r1)
            int r2 = r0.l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.a((boolean) r8)
            if (r1 != 0) goto L_0x0018
            r3.d()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x001c:
            throw r4
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.b.g.a(int, int, int, boolean, boolean):g.a.b.c");
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.j = null;
        }
        if (z2) {
            this.f14983h = true;
        }
        c cVar = this.f14982g;
        if (cVar != null) {
            if (z) {
                cVar.k = true;
            }
            if (this.j == null && (this.f14983h || this.f14982g.k)) {
                c(this.f14982g);
                if (this.f14982g.n.isEmpty()) {
                    this.f14982g.o = System.nanoTime();
                    if (g.a.a.f14935a.a(this.f14978c, this.f14982g)) {
                        socket = this.f14982g.d();
                        this.f14982g = null;
                        return socket;
                    }
                }
                socket = null;
                this.f14982g = null;
                return socket;
            }
        }
        return null;
    }

    private void c(c cVar) {
        int size = cVar.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (cVar.n.get(i2).get() == this) {
                cVar.n.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private d f() {
        return g.a.a.f14935a.a(this.f14978c);
    }

    public c a() {
        c cVar;
        synchronized (this.f14978c) {
            cVar = this.j;
        }
        return cVar;
    }

    public c a(E e2, boolean z) {
        try {
            c a2 = a(e2.e(), e2.v(), e2.z(), e2.w(), z).a(e2, this);
            synchronized (this.f14978c) {
                this.j = a2;
            }
            return a2;
        } catch (IOException e3) {
            throw new e(e3);
        }
    }

    public void a(c cVar) {
        if (this.f14982g == null) {
            this.f14982g = cVar;
            cVar.n.add(new a(this, this.f14979d));
            return;
        }
        throw new IllegalStateException();
    }

    public void a(IOException iOException) {
        boolean z;
        Socket a2;
        synchronized (this.f14978c) {
            if (iOException instanceof A) {
                A a3 = (A) iOException;
                if (a3.f15041a == b.REFUSED_STREAM) {
                    this.f14981f++;
                }
                if (a3.f15041a == b.REFUSED_STREAM) {
                    if (this.f14981f > 1) {
                    }
                    z = false;
                    a2 = a(z, false, true);
                }
            } else {
                if (this.f14982g != null && (!this.f14982g.c() || (iOException instanceof C3340a))) {
                    if (this.f14982g.l == 0) {
                        if (!(this.f14977b == null || iOException == null)) {
                            this.f14980e.a(this.f14977b, iOException);
                        }
                    }
                    z = true;
                    a2 = a(z, false, true);
                }
                z = false;
                a2 = a(z, false, true);
            }
            this.f14977b = null;
            z = true;
            a2 = a(z, false, true);
        }
        e.a(a2);
    }

    public void a(boolean z, c cVar) {
        Socket a2;
        synchronized (this.f14978c) {
            if (cVar != null) {
                if (cVar == this.j) {
                    if (!z) {
                        this.f14982g.l++;
                    }
                    a2 = a(z, false, true);
                }
            }
            throw new IllegalStateException("expected " + this.j + " but was " + cVar);
        }
        e.a(a2);
    }

    public synchronized c b() {
        return this.f14982g;
    }

    public Socket b(c cVar) {
        if (this.j == null && this.f14982g.n.size() == 1) {
            Socket a2 = a(true, false, false);
            this.f14982g = cVar;
            cVar.n.add(this.f14982g.n.get(0));
            return a2;
        }
        throw new IllegalStateException();
    }

    public boolean c() {
        return this.f14977b != null || this.f14980e.a();
    }

    public void d() {
        Socket a2;
        synchronized (this.f14978c) {
            a2 = a(true, false, false);
        }
        e.a(a2);
    }

    public void e() {
        Socket a2;
        synchronized (this.f14978c) {
            a2 = a(false, true, false);
        }
        e.a(a2);
    }

    public String toString() {
        c b2 = b();
        return b2 != null ? b2.toString() : this.f14976a.toString();
    }
}
