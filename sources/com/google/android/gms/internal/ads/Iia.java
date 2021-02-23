package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;

final class Iia implements Handler.Callback, Ala, Cla, C1674fma {
    private int A;
    private Jia B;
    private long C;
    private Hia D;
    private Hia E;
    private Hia F;
    private Via G;

    /* renamed from: a  reason: collision with root package name */
    private final Uia[] f7313a;

    /* renamed from: b  reason: collision with root package name */
    private final Tia[] f7314b;

    /* renamed from: c  reason: collision with root package name */
    private final C1745gma f7315c;

    /* renamed from: d  reason: collision with root package name */
    private final Pia f7316d;

    /* renamed from: e  reason: collision with root package name */
    private final Oma f7317e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f7318f;

    /* renamed from: g  reason: collision with root package name */
    private final HandlerThread f7319g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f7320h;
    private final C3084zia i;
    private final C1314aja j;
    private final Yia k;
    private Kia l;
    private Ria m;
    private Uia n;
    private Gma o;
    private C3090zla p;
    private Uia[] q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w = 0;
    private int x;
    private int y;
    private long z;

    public Iia(Uia[] uiaArr, C1745gma gma, Pia pia, boolean z2, int i2, Handler handler, Kia kia, C3084zia zia) {
        this.f7313a = uiaArr;
        this.f7315c = gma;
        this.f7316d = pia;
        this.s = z2;
        this.f7320h = handler;
        this.v = 1;
        this.l = kia;
        this.i = zia;
        this.f7314b = new Tia[uiaArr.length];
        for (int i3 = 0; i3 < uiaArr.length; i3++) {
            uiaArr[i3].setIndex(i3);
            this.f7314b[i3] = uiaArr[i3].x();
        }
        this.f7317e = new Oma();
        this.q = new Uia[0];
        this.j = new C1314aja();
        this.k = new Yia();
        gma.a((C1674fma) this);
        this.m = Ria.f8504a;
        this.f7319g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f7319g.start();
        this.f7318f = new Handler(this.f7319g.getLooper(), this);
    }

    private final int a(int i2, Via via, Via via2) {
        int c2 = via.c();
        int i3 = i2;
        int i4 = -1;
        for (int i5 = 0; i5 < c2 && i4 == -1; i5++) {
            i3 = via.a(i3, this.k, this.j, this.w);
            i4 = via2.a(via.a(i3, this.k, true).f9446b);
        }
        return i4;
    }

    private final long a(int i2, long j2) {
        Hia hia;
        e();
        this.t = false;
        a(2);
        Hia hia2 = this.F;
        if (hia2 == null) {
            Hia hia3 = this.D;
            if (hia3 != null) {
                hia3.a();
            }
            hia = null;
        } else {
            hia = null;
            while (hia2 != null) {
                if (hia2.f7183g != i2 || !hia2.j) {
                    hia2.a();
                } else {
                    hia = hia2;
                }
                hia2 = hia2.l;
            }
        }
        Hia hia4 = this.F;
        if (!(hia4 == hia && hia4 == this.E)) {
            for (Uia A2 : this.q) {
                A2.A();
            }
            this.q = new Uia[0];
            this.o = null;
            this.n = null;
            this.F = null;
        }
        if (hia != null) {
            hia.l = null;
            this.D = hia;
            this.E = hia;
            b(hia);
            Hia hia5 = this.F;
            if (hia5.k) {
                j2 = hia5.f7177a.b(j2);
            }
            a(j2);
            i();
        } else {
            this.D = null;
            this.E = null;
            this.F = null;
            a(j2);
        }
        this.f7318f.sendEmptyMessage(2);
        return j2;
    }

    private final Pair<Integer, Long> a(Jia jia) {
        Via via = jia.f7455a;
        if (via.a()) {
            via = this.G;
        }
        try {
            Pair<Integer, Long> b2 = b(via, jia.f7456b, jia.f7457c);
            Via via2 = this.G;
            if (via2 == via) {
                return b2;
            }
            int a2 = via2.a(via.a(((Integer) b2.first).intValue(), this.k, true).f9446b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), (Long) b2.second);
            }
            int a3 = a(((Integer) b2.first).intValue(), via, this.G);
            if (a3 == -1) {
                return null;
            }
            this.G.a(a3, this.k, false);
            return b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new Qia(this.G, jia.f7456b, jia.f7457c);
        }
    }

    private final Pair<Integer, Long> a(Via via, int i2, long j2, long j3) {
        Cma.a(i2, 0, via.b());
        via.a(i2, this.j, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long j4 = j2 + 0;
        long j5 = via.a(0, this.k, false).f9448d;
        if (j5 != -9223372036854775807L) {
            int i3 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j4));
    }

    private final void a(int i2) {
        if (this.v != i2) {
            this.v = i2;
            this.f7320h.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    private final void a(long j2) {
        Hia hia = this.F;
        this.C = j2 + (hia == null ? 60000000 : hia.b());
        this.f7317e.a(this.C);
        for (Uia a2 : this.q) {
            a2.a(this.C);
        }
    }

    private final void a(long j2, long j3) {
        this.f7318f.removeMessages(2);
        long elapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f7318f.sendEmptyMessage(2);
        } else {
            this.f7318f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private static void a(Hia hia) {
        while (hia != null) {
            hia.a();
            hia = hia.l;
        }
    }

    private static void a(Uia uia) {
        if (uia.getState() == 2) {
            uia.stop();
        }
    }

    private final void a(Object obj, int i2) {
        this.l = new Kia(0, 0);
        b(obj, i2);
        this.l = new Kia(0, -9223372036854775807L);
        a(4);
        c(false);
    }

    private final void a(boolean[] zArr, int i2) {
        this.q = new Uia[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Uia[] uiaArr = this.f7313a;
            if (i3 < uiaArr.length) {
                Uia uia = uiaArr[i3];
                C1391bma a2 = this.F.m.f10840b.a(i3);
                if (a2 != null) {
                    int i5 = i4 + 1;
                    this.q[i4] = uia;
                    if (uia.getState() == 0) {
                        Xia xia = this.F.m.f10842d[i3];
                        boolean z2 = this.s && this.v == 3;
                        boolean z3 = !zArr[i3] && z2;
                        Lia[] liaArr = new Lia[a2.length()];
                        for (int i6 = 0; i6 < liaArr.length; i6++) {
                            liaArr[i6] = a2.a(i6);
                        }
                        Hia hia = this.F;
                        uia.a(xia, liaArr, hia.f7180d[i3], this.C, z3, hia.b());
                        Gma y2 = uia.y();
                        if (y2 != null) {
                            if (this.o == null) {
                                this.o = y2;
                                this.n = uia;
                                this.o.a(this.m);
                            } else {
                                throw Aia.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z2) {
                            uia.start();
                        }
                    }
                    i4 = i5;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    private final Pair<Integer, Long> b(int i2, long j2) {
        return b(this.G, 0, -9223372036854775807L);
    }

    private final Pair<Integer, Long> b(Via via, int i2, long j2) {
        return a(via, i2, j2, 0);
    }

    private final void b(Hia hia) {
        if (this.F != hia) {
            boolean[] zArr = new boolean[this.f7313a.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Uia[] uiaArr = this.f7313a;
                if (i2 < uiaArr.length) {
                    Uia uia = uiaArr[i2];
                    zArr[i2] = uia.getState() != 0;
                    C1391bma a2 = hia.m.f10840b.a(i2);
                    if (a2 != null) {
                        i3++;
                    }
                    if (zArr[i2] && (a2 == null || (uia.B() && uia.z() == this.F.f7180d[i2]))) {
                        if (uia == this.n) {
                            this.f7317e.a(this.o);
                            this.o = null;
                            this.n = null;
                        }
                        a(uia);
                        uia.A();
                    }
                    i2++;
                } else {
                    this.F = hia;
                    this.f7320h.obtainMessage(3, hia.m).sendToTarget();
                    a(zArr, i3);
                    return;
                }
            }
        }
    }

    private final void b(Object obj, int i2) {
        this.f7320h.obtainMessage(6, new Mia(this.G, obj, this.l, i2)).sendToTarget();
    }

    private final void b(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            this.f7320h.obtainMessage(2, z2 ? 1 : 0, 0).sendToTarget();
        }
    }

    private final boolean b(int i2) {
        this.G.a(i2, this.k, false);
        this.G.a(0, this.j, false);
        return this.G.a(i2, this.k, this.j, this.w) == -1;
    }

    private final boolean b(long j2) {
        if (j2 == -9223372036854775807L || this.l.f7590c < j2) {
            return true;
        }
        Hia hia = this.F.l;
        return hia != null && hia.j;
    }

    private final void c(boolean z2) {
        this.f7318f.removeMessages(2);
        this.t = false;
        this.f7317e.d();
        this.o = null;
        this.n = null;
        this.C = 60000000;
        for (Uia uia : this.q) {
            try {
                a(uia);
                uia.A();
            } catch (Aia | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.q = new Uia[0];
        Hia hia = this.F;
        if (hia == null) {
            hia = this.D;
        }
        a(hia);
        this.D = null;
        this.E = null;
        this.F = null;
        b(false);
        if (z2) {
            C3090zla zla = this.p;
            if (zla != null) {
                zla.b();
                this.p = null;
            }
            this.G = null;
        }
    }

    private final void d() {
        this.t = false;
        this.f7317e.a();
        for (Uia start : this.q) {
            start.start();
        }
    }

    private final void e() {
        this.f7317e.d();
        for (Uia a2 : this.q) {
            a(a2);
        }
    }

    private final void f() {
        Hia hia = this.F;
        if (hia != null) {
            long c2 = hia.f7177a.c();
            if (c2 != -9223372036854775807L) {
                a(c2);
            } else {
                Uia uia = this.n;
                if (uia == null || uia.u()) {
                    this.C = this.f7317e.c();
                } else {
                    this.C = this.o.c();
                    this.f7317e.a(this.C);
                }
                c2 = this.C - this.F.b();
            }
            this.l.f7590c = c2;
            this.z = SystemClock.elapsedRealtime() * 1000;
            long a2 = this.q.length == 0 ? Long.MIN_VALUE : this.F.f7177a.a();
            Kia kia = this.l;
            if (a2 == Long.MIN_VALUE) {
                a2 = this.G.a(this.F.f7183g, this.k, false).f9448d;
            }
            kia.f7591d = a2;
        }
    }

    private final void g() {
        c(true);
        this.f7316d.d();
        a(1);
    }

    private final void h() {
        Hia hia = this.D;
        if (hia != null && !hia.j) {
            Hia hia2 = this.E;
            if (hia2 == null || hia2.l == hia) {
                Uia[] uiaArr = this.q;
                int length = uiaArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (uiaArr[i2].v()) {
                        i2++;
                    } else {
                        return;
                    }
                }
                this.D.f7177a.d();
            }
        }
    }

    private final void i() {
        Hia hia = this.D;
        long b2 = !hia.j ? 0 : hia.f7177a.b();
        if (b2 == Long.MIN_VALUE) {
            b(false);
            return;
        }
        long b3 = this.C - this.D.b();
        boolean a2 = this.f7316d.a(b2 - b3);
        b(a2);
        if (a2) {
            this.D.f7177a.a(b3);
        }
    }

    public final void a() {
        this.f7318f.sendEmptyMessage(10);
    }

    public final /* synthetic */ void a(Lla lla) {
        this.f7318f.obtainMessage(9, (C2877wla) lla).sendToTarget();
    }

    public final void a(Via via, int i2, long j2) {
        this.f7318f.obtainMessage(3, new Jia(via, i2, j2)).sendToTarget();
    }

    public final void a(Via via, Object obj) {
        this.f7318f.obtainMessage(7, Pair.create(via, obj)).sendToTarget();
    }

    public final void a(C2877wla wla) {
        this.f7318f.obtainMessage(8, wla).sendToTarget();
    }

    public final void a(C3090zla zla, boolean z2) {
        this.f7318f.obtainMessage(0, 1, 0, zla).sendToTarget();
    }

    public final void a(boolean z2) {
        this.f7318f.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final void a(Eia... eiaArr) {
        if (this.r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.x++;
        this.f7318f.obtainMessage(11, eiaArr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.r     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f7318f     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.r     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f7319g     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0028
        L_0x0027:
            throw r0
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Iia.b():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(com.google.android.gms.internal.ads.Eia... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.r     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.x     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.x = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f7318f     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.y     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0035
        L_0x0034:
            throw r4
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Iia.b(com.google.android.gms.internal.ads.Eia[]):void");
    }

    public final void c() {
        this.f7318f.sendEmptyMessage(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0386, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x044b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x044c, code lost:
        r2 = r0;
        r8.l = new com.google.android.gms.internal.ads.Kia(r3, r4);
        r3 = r8.f7320h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0456, code lost:
        if (r1 != false) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0458, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x045a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x045b, code lost:
        r3.obtainMessage(4, r1, 0, r8.l).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0464, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x08a5, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x08aa, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x08ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x08af, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r2 = r8.f7320h;
        r1 = com.google.android.gms.internal.ads.Aia.a(r1);
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cd, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
        monitor-enter(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.y++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x028d A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0290 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0294 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0352 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0366 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x052f A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0536 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0550 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0553 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x058e A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05a2 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x05be A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }, LOOP:8: B:333:0x05be->B:337:0x05d0, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0720 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x07d9 A[Catch:{ all -> 0x044b, all -> 0x0386, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x08ae A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ Aia -> 0x08dc, IOException -> 0x08ca, RuntimeException -> 0x08ae }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x086d;
                case 1: goto L_0x0842;
                case 2: goto L_0x0465;
                case 3: goto L_0x03ae;
                case 4: goto L_0x038e;
                case 5: goto L_0x038a;
                case 6: goto L_0x0373;
                case 7: goto L_0x0219;
                case 8: goto L_0x01e3;
                case 9: goto L_0x01d0;
                case 10: goto L_0x00dd;
                case 11: goto L_0x009f;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.w = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0026:
            if (r2 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.Hia r3 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.Hia r4 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != r4) goto L_0x0037
            r4 = r3
            r3 = r2
            r2 = 1
            goto L_0x003a
        L_0x0037:
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x003a:
            com.google.android.gms.internal.ads.Via r11 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r12 = r3.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r13 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.aja r14 = r8.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r11 = r11.a((int) r12, (com.google.android.gms.internal.ads.Yia) r13, (com.google.android.gms.internal.ads.C1314aja) r14, (int) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r12 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 == 0) goto L_0x0065
            if (r11 == r5) goto L_0x0065
            com.google.android.gms.internal.ads.Hia r12 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r12 = r12.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 != r11) goto L_0x0065
            com.google.android.gms.internal.ads.Hia r3 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r11 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 != r11) goto L_0x005a
            r11 = 1
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r4 = r4 | r11
            com.google.android.gms.internal.ads.Hia r11 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 != r11) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            r2 = r2 | r11
            goto L_0x003a
        L_0x0065:
            com.google.android.gms.internal.ads.Hia r5 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r5 == 0) goto L_0x0070
            com.google.android.gms.internal.ads.Hia r5 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            a((com.google.android.gms.internal.ads.Hia) r5)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.l = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0070:
            int r5 = r3.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r5 = r8.b((int) r5)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.i = r5     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x007c
            r8.D = r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x007c:
            if (r4 != 0) goto L_0x0095
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r3.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r8.a((int) r2, (long) r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r5 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5.<init>(r2, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r5     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0095:
            int r2 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != r15) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            r8.a((int) r7)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x009e:
            return r10
        L_0x009f:
            java.lang.Object r1 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Eia[] r1 = (com.google.android.gms.internal.ads.Eia[]) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r1.length     // Catch:{ all -> 0x00cc }
        L_0x00a4:
            if (r9 >= r2) goto L_0x00b4
            r3 = r1[r9]     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.Bia r4 = r3.f6731a     // Catch:{ all -> 0x00cc }
            int r5 = r3.f6732b     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.f6733c     // Catch:{ all -> 0x00cc }
            r4.a(r5, r3)     // Catch:{ all -> 0x00cc }
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00b4:
            com.google.android.gms.internal.ads.zla r1 = r8.p     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00bd
            android.os.Handler r1 = r8.f7318f     // Catch:{ all -> 0x00cc }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00cc }
        L_0x00bd:
            monitor-enter(r34)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = r8.y     // Catch:{ all -> 0x00c8 }
            int r1 = r1 + r10
            r8.y = r1     // Catch:{ all -> 0x00c8 }
            r34.notifyAll()     // Catch:{ all -> 0x00c8 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            return r10
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            throw r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x00cc:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r8.y     // Catch:{ all -> 0x00d9 }
            int r2 = r2 + r10
            r8.y = r2     // Catch:{ all -> 0x00d9 }
            r34.notifyAll()     // Catch:{ all -> 0x00d9 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x00dd:
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x01cf
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x01cf
            boolean r3 = r1.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 != 0) goto L_0x00ec
            goto L_0x01cf
        L_0x00ec:
            boolean r3 = r1.d()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 != 0) goto L_0x00fa
            com.google.android.gms.internal.ads.Hia r3 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != r3) goto L_0x00f7
            r2 = 0
        L_0x00f7:
            com.google.android.gms.internal.ads.Hia r1 = r1.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x00e4
        L_0x00fa:
            if (r2 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.Hia r2 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == r3) goto L_0x0104
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            a((com.google.android.gms.internal.ads.Hia) r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.l = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.D = r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.E = r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Uia[] r3 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r3 = r3.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean[] r3 = new boolean[r3]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r4 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r5 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r5.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r4 = r4.a(r11, r2, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r2 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r2.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.Kia r2 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.f7590c = r4     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((long) r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0136:
            com.google.android.gms.internal.ads.Uia[] r2 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean[] r2 = new boolean[r2]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r4 = 0
            r5 = 0
        L_0x013d:
            com.google.android.gms.internal.ads.Uia[] r11 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r11 = r11.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r4 >= r11) goto L_0x0189
            com.google.android.gms.internal.ads.Uia[] r11 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11 = r11[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r12 = r11.getState()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 == 0) goto L_0x014e
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            r2[r4] = r12     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r12 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Mla[] r12 = r12.f7180d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r12 = r12[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 == 0) goto L_0x015b
            int r5 = r5 + 1
        L_0x015b:
            boolean r13 = r2[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r13 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.Mla r13 = r11.z()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 == r13) goto L_0x017d
            com.google.android.gms.internal.ads.Uia r13 = r8.n     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r11 != r13) goto L_0x0176
            if (r12 != 0) goto L_0x0172
            com.google.android.gms.internal.ads.Oma r12 = r8.f7317e     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Gma r13 = r8.o     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r12.a((com.google.android.gms.internal.ads.Gma) r13)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0172:
            r8.o = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.n = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0176:
            a((com.google.android.gms.internal.ads.Uia) r11)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11.A()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0186
        L_0x017d:
            boolean r12 = r3[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 == 0) goto L_0x0186
            long r12 = r8.C     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11.a(r12)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0189:
            android.os.Handler r3 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.ima r1 = r1.m     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((boolean[]) r2, (int) r5)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x01c4
        L_0x0198:
            r8.D = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x019c:
            com.google.android.gms.internal.ads.Hia r1 = r1.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x01a4
            r1.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x019c
        L_0x01a4:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.l = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r1 = r1.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x01c4
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r1 = r1.f7184h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r4 = r8.C     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r3.b()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.a((long) r1, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x01c4:
            r34.i()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r34.f()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r1 = r8.f7318f     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendEmptyMessage(r7)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x01cf:
            return r10
        L_0x01d0:
            java.lang.Object r1 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r1 = (com.google.android.gms.internal.ads.C2877wla) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r2 = r2.f7177a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == r1) goto L_0x01df
            goto L_0x01e2
        L_0x01df:
            r34.i()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x01e2:
            return r10
        L_0x01e3:
            java.lang.Object r1 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r1 = (com.google.android.gms.internal.ads.C2877wla) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x0218
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r2 = r2.f7177a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == r1) goto L_0x01f2
            goto L_0x0218
        L_0x01f2:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.j = r10     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.d()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r2 = r1.f7184h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r2 = r1.a((long) r2, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.f7184h = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.E = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r1 = r1.f7184h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((long) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.b((com.google.android.gms.internal.ads.Hia) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0215:
            r34.i()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0218:
            return r10
        L_0x0219:
            java.lang.Object r1 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r3 = r1.first     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r3 = (com.google.android.gms.internal.ads.Via) r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.G = r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r1 = r1.second     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x0288
            int r3 = r8.A     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 <= 0) goto L_0x0258
            com.google.android.gms.internal.ads.Jia r3 = r8.B     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.util.Pair r3 = r8.a((com.google.android.gms.internal.ads.Jia) r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r4 = r8.A     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.A = r9     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.B = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 != 0) goto L_0x0240
        L_0x023b:
            r8.a((java.lang.Object) r1, (int) r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0372
        L_0x0240:
            com.google.android.gms.internal.ads.Kia r7 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r11 = r3.first     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r11 = r11.intValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r3 = r3.second     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r14 = r3.longValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r7.<init>(r11, r14)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r7     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0289
        L_0x0258:
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r3.f7589b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x0288
            com.google.android.gms.internal.ads.Via r3 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r3 = r3.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 == 0) goto L_0x026d
            r8.a((java.lang.Object) r1, (int) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0372
        L_0x026d:
            android.util.Pair r3 = r8.b((int) r9, (long) r12)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r4 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r7 = r3.first     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r7 = r7.intValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r3 = r3.second     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r14 = r3.longValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r4.<init>(r7, r14)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r4     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0288:
            r4 = 0
        L_0x0289:
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 == 0) goto L_0x0290
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0292
        L_0x0290:
            com.google.android.gms.internal.ads.Hia r3 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0292:
            if (r3 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.Via r7 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r11 = r3.f7178b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r7 = r7.a(r11)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 != r5) goto L_0x02f2
            int r6 = r3.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r7 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r8.a((int) r6, (com.google.android.gms.internal.ads.Via) r2, (com.google.android.gms.internal.ads.Via) r7)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != r5) goto L_0x02a9
            goto L_0x023b
        L_0x02a9:
            com.google.android.gms.internal.ads.Via r6 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r7 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r6.a((int) r2, (com.google.android.gms.internal.ads.Yia) r7, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.util.Pair r2 = r8.b((int) r9, (long) r12)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r6 = r2.first     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r6 = r6.intValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r2 = r2.second     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r2.longValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r7 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a((int) r6, (com.google.android.gms.internal.ads.Yia) r7, (boolean) r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r2 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r2 = r2.f9446b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.f7183g = r5     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x02d1:
            com.google.android.gms.internal.ads.Hia r7 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == 0) goto L_0x02e5
            com.google.android.gms.internal.ads.Hia r3 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r7 = r3.f7178b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r7 = r7.equals(r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == 0) goto L_0x02e1
            r7 = r6
            goto L_0x02e2
        L_0x02e1:
            r7 = -1
        L_0x02e2:
            r3.f7183g = r7     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x02d1
        L_0x02e5:
            long r2 = r8.a((int) r6, (long) r11)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r5 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5.<init>(r6, r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r5     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x036f
        L_0x02f2:
            boolean r2 = r8.b((int) r7)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.a((int) r7, (boolean) r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 != r2) goto L_0x02ff
            r2 = 1
            goto L_0x0300
        L_0x02ff:
            r2 = 0
        L_0x0300:
            com.google.android.gms.internal.ads.Kia r11 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r11 = r11.f7588a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == r11) goto L_0x0319
            com.google.android.gms.internal.ads.Kia r11 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r12 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r13 = r11.f7589b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r12.<init>(r7, r13)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r13 = r11.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r12.f7590c = r13     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r13 = r11.f7591d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r12.f7591d = r13     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r12     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0319:
            com.google.android.gms.internal.ads.Hia r11 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r11 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.Hia r11 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r12 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r13 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.aja r14 = r8.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r15 = r8.w     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r7 = r12.a((int) r7, (com.google.android.gms.internal.ads.Yia) r13, (com.google.android.gms.internal.ads.C1314aja) r14, (int) r15)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == r5) goto L_0x0350
            java.lang.Object r12 = r11.f7178b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r13 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r14 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r13 = r13.a((int) r7, (com.google.android.gms.internal.ads.Yia) r14, (boolean) r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r13 = r13.f9446b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r12 = r12.equals(r13)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r12 == 0) goto L_0x0350
            boolean r3 = r8.b((int) r7)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11.a((int) r7, (boolean) r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r11 != r3) goto L_0x034c
            r3 = 1
            goto L_0x034d
        L_0x034c:
            r3 = 0
        L_0x034d:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0319
        L_0x0350:
            if (r2 != 0) goto L_0x0366
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r5 = r3.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r5 = r8.a((int) r2, (long) r5)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r3 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.<init>(r2, r5)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x036f
        L_0x0366:
            r8.D = r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.l = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            a((com.google.android.gms.internal.ads.Hia) r11)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x036f:
            r8.b((java.lang.Object) r1, (int) r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0372:
            return r10
        L_0x0373:
            r8.c(r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Pia r1 = r8.f7316d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.c()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((int) r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            monitor-enter(r34)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.r = r10     // Catch:{ all -> 0x0386 }
            r34.notifyAll()     // Catch:{ all -> 0x0386 }
            monitor-exit(r34)     // Catch:{ all -> 0x0386 }
            return r10
        L_0x0386:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x0386 }
            throw r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x038a:
            r34.g()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            return r10
        L_0x038e:
            java.lang.Object r1 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Ria r1 = (com.google.android.gms.internal.ads.Ria) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Gma r2 = r8.o     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x039d
            com.google.android.gms.internal.ads.Gma r2 = r8.o     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Ria r1 = r2.a(r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x03a2
        L_0x039d:
            com.google.android.gms.internal.ads.Oma r2 = r8.f7317e     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a((com.google.android.gms.internal.ads.Ria) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x03a2:
            r8.m = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r2 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            return r10
        L_0x03ae:
            java.lang.Object r1 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Jia r1 = (com.google.android.gms.internal.ads.Jia) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x03bf
            int r2 = r8.A     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2 + r10
            r8.A = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.B = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x044a
        L_0x03bf:
            android.util.Pair r2 = r8.a((com.google.android.gms.internal.ads.Jia) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x03e5
            com.google.android.gms.internal.ads.Kia r1 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.<init>(r9, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r1 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r2 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r1.obtainMessage(r15, r10, r9, r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r1 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.<init>(r9, r12)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((int) r15)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.c(r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x044a
        L_0x03e5:
            long r3 = r1.f7457c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03ed
            r1 = 1
            goto L_0x03ee
        L_0x03ed:
            r1 = 0
        L_0x03ee:
            java.lang.Object r3 = r2.first     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r3 = r3.intValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r2 = r2.second     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r4 = r2.longValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r2 = r8.l     // Catch:{ all -> 0x044b }
            int r2 = r2.f7588a     // Catch:{ all -> 0x044b }
            if (r3 != r2) goto L_0x0429
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.Kia r2 = r8.l     // Catch:{ all -> 0x044b }
            long r13 = r2.f7590c     // Catch:{ all -> 0x044b }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0429
            com.google.android.gms.internal.ads.Kia r2 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.<init>(r3, r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r2 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x041e
            r1 = 1
            goto L_0x041f
        L_0x041e:
            r1 = 0
        L_0x041f:
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0425:
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x044a
        L_0x0429:
            long r6 = r8.a((int) r3, (long) r4)     // Catch:{ all -> 0x044b }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0433
            r2 = 1
            goto L_0x0434
        L_0x0433:
            r2 = 0
        L_0x0434:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.Kia r2 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.<init>(r3, r6)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r2 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0442
            r1 = 1
            goto L_0x0443
        L_0x0442:
            r1 = 0
        L_0x0443:
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0425
        L_0x044a:
            return r10
        L_0x044b:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.Kia r6 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r6.<init>(r3, r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r6     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r3 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x045a
            r1 = 1
            goto L_0x045b
        L_0x045a:
            r1 = 0
        L_0x045b:
            com.google.android.gms.internal.ads.Kia r4 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            throw r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0465:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r1 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != 0) goto L_0x0475
            com.google.android.gms.internal.ads.zla r1 = r8.p     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r14 = r5
            goto L_0x06d1
        L_0x0475:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != 0) goto L_0x047e
            com.google.android.gms.internal.ads.Kia r1 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = r1.f7588a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x04bc
        L_0x047e:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = r1.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r2 = r2.i     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x04c9
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r2 = r2.c()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x04c9
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r7 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r2 = r2.a((int) r1, (com.google.android.gms.internal.ads.Yia) r7, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r14 = r2.f9448d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x049f
            goto L_0x04c9
        L_0x049f:
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x04b0
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.f7179c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r7 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r7 = r7.f7179c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x04c9
        L_0x04b0:
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r7 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.aja r14 = r8.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r15 = r8.w     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = r2.a((int) r1, (com.google.android.gms.internal.ads.Yia) r7, (com.google.android.gms.internal.ads.C1314aja) r14, (int) r15)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x04bc:
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.c()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 < r2) goto L_0x04cc
            com.google.android.gms.internal.ads.zla r1 = r8.p     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x04c9:
            r14 = r5
            goto L_0x059e
        L_0x04cc:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x04d6
            com.google.android.gms.internal.ads.Kia r2 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r2.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x04d4:
            r14 = r5
            goto L_0x052b
        L_0x04d6:
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r7 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a((int) r1, (com.google.android.gms.internal.ads.Yia) r7, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.aja r7 = r8.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a((int) r9, (com.google.android.gms.internal.ads.C1314aja) r7, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x04e7
            goto L_0x04d4
        L_0x04e7:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r1 = r1.b()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r7 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r14 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r14 = r14.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r15 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r7 = r7.a((int) r14, (com.google.android.gms.internal.ads.Yia) r15, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r14 = r7.f9448d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r1 = r1 + r14
            long r14 = r8.C     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.Via r7 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.a(r2, r3, r4, r6)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x059e
            java.lang.Object r2 = r1.first     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.intValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r1 = r1.second     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r1.longValue()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1 = r2
        L_0x052b:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x0536
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x0533:
            r23 = r5
            goto L_0x054c
        L_0x0536:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r5 = r2.b()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r7 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r7 = r7.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r11 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r2 = r2.a((int) r7, (com.google.android.gms.internal.ads.Yia) r11, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r12 = r2.f9448d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r5 = r5 + r12
            goto L_0x0533
        L_0x054c:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x0553
            r29 = 0
            goto L_0x055a
        L_0x0553:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.f7179c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2 + r10
            r29 = r2
        L_0x055a:
            boolean r31 = r8.b((int) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r5 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a((int) r1, (com.google.android.gms.internal.ads.Yia) r5, (boolean) r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = new com.google.android.gms.internal.ads.Hia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Uia[] r5 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Tia[] r6 = r8.f7314b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.gma r7 = r8.f7315c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Pia r11 = r8.f7316d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.zla r12 = r8.p     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r13 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            java.lang.Object r13 = r13.f9446b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0592
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.l = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0592:
            r8.D = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r1 = r1.f7177a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.a(r8, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.b((boolean) r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x059e:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x05b7
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r1 = r1.c()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x05ab
            goto L_0x05b7
        L_0x05ab:
            com.google.android.gms.internal.ads.Hia r1 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x05ba
            boolean r1 = r8.u     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != 0) goto L_0x05ba
            r34.i()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x05ba
        L_0x05b7:
            r8.b((boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x05ba:
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x06d1
        L_0x05be:
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == r2) goto L_0x05fb
            long r1 = r8.C     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r3.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r3.f7182f     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x05fb
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r1.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.b((com.google.android.gms.internal.ads.Hia) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r1 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r3.f7184h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.<init>(r2, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r34.f()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r1 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = 5
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x05be
        L_0x05fb:
            com.google.android.gms.internal.ads.Hia r1 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r1 = r1.i     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0625
            r1 = 0
        L_0x0602:
            com.google.android.gms.internal.ads.Uia[] r2 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 >= r2) goto L_0x06d1
            com.google.android.gms.internal.ads.Uia[] r2 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = r2[r1]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Mla[] r3 = r3.f7180d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3 = r3[r1]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 == 0) goto L_0x0622
            com.google.android.gms.internal.ads.Mla r4 = r2.z()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r4 != r3) goto L_0x0622
            boolean r3 = r2.v()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 == 0) goto L_0x0622
            r2.w()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0622:
            int r1 = r1 + 1
            goto L_0x0602
        L_0x0625:
            r1 = 0
        L_0x0626:
            com.google.android.gms.internal.ads.Uia[] r2 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 >= r2) goto L_0x0648
            com.google.android.gms.internal.ads.Uia[] r2 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = r2[r1]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Mla[] r3 = r3.f7180d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3 = r3[r1]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Mla r4 = r2.z()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r4 != r3) goto L_0x06d1
            if (r3 == 0) goto L_0x0645
            boolean r2 = r2.v()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x0645
            goto L_0x06d1
        L_0x0645:
            int r1 = r1 + 1
            goto L_0x0626
        L_0x0648:
            com.google.android.gms.internal.ads.Hia r1 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r1.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x06d1
            com.google.android.gms.internal.ads.Hia r1 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r1.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r1 = r1.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x06d1
            com.google.android.gms.internal.ads.Hia r1 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.ima r1 = r1.m     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r2.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.E = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.ima r2 = r2.m     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r3 = r3.f7177a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r3.c()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0677
            r3 = 1
            goto L_0x0678
        L_0x0677:
            r3 = 0
        L_0x0678:
            r4 = 0
        L_0x0679:
            com.google.android.gms.internal.ads.Uia[] r5 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r5 = r5.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r4 >= r5) goto L_0x06d1
            com.google.android.gms.internal.ads.Uia[] r5 = r8.f7313a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5 = r5[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.dma r6 = r1.f10840b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.bma r6 = r6.a(r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r6 == 0) goto L_0x06ce
            if (r3 != 0) goto L_0x06cb
            boolean r6 = r5.B()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r6 != 0) goto L_0x06ce
            com.google.android.gms.internal.ads.dma r6 = r2.f10840b     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.bma r6 = r6.a(r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Xia[] r7 = r1.f10842d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r7 = r7[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Xia[] r11 = r2.f10842d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11 = r11[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r6 == 0) goto L_0x06cb
            boolean r7 = r11.equals(r7)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == 0) goto L_0x06cb
            int r7 = r6.length()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Lia[] r7 = new com.google.android.gms.internal.ads.Lia[r7]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11 = 0
        L_0x06af:
            int r12 = r7.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r11 >= r12) goto L_0x06bb
            com.google.android.gms.internal.ads.Lia r12 = r6.a(r11)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r7[r11] = r12     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r11 = r11 + 1
            goto L_0x06af
        L_0x06bb:
            com.google.android.gms.internal.ads.Hia r6 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Mla[] r6 = r6.f7180d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r6 = r6[r4]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r11 = r8.E     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r11.b()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5.a(r7, r6, r11)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x06ce
        L_0x06cb:
            r5.w()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x06ce:
            int r4 = r4 + 1
            goto L_0x0679
        L_0x06d1:
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = 10
            if (r1 != 0) goto L_0x06df
            r34.h()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((long) r14, (long) r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0841
        L_0x06df:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.Qma.a(r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r34.f()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r1 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r1 = r1.f7177a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Kia r4 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r4 = r4.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.c(r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Uia[] r1 = r8.q     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r4 = r1.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x06f8:
            if (r5 >= r4) goto L_0x072f
            r11 = r1[r5]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r12 = r8.C     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r2 = r8.z     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r11.a(r12, r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == 0) goto L_0x070d
            boolean r2 = r11.u()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x070d
            r7 = 1
            goto L_0x070e
        L_0x070d:
            r7 = 0
        L_0x070e:
            boolean r2 = r11.t()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x071d
            boolean r2 = r11.u()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x071b
            goto L_0x071d
        L_0x071b:
            r2 = 0
            goto L_0x071e
        L_0x071d:
            r2 = 1
        L_0x071e:
            if (r2 != 0) goto L_0x0723
            r11.C()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0723:
            if (r6 == 0) goto L_0x0729
            if (r2 == 0) goto L_0x0729
            r6 = 1
            goto L_0x072a
        L_0x0729:
            r6 = 0
        L_0x072a:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x06f8
        L_0x072f:
            if (r6 != 0) goto L_0x0734
            r34.h()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0734:
            com.google.android.gms.internal.ads.Gma r1 = r8.o     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0759
            com.google.android.gms.internal.ads.Gma r1 = r8.o     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Ria r1 = r1.b()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Ria r2 = r8.m     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r2 = r1.equals(r2)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x0759
            r8.m = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Oma r2 = r8.f7317e     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Gma r3 = r8.o     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a((com.google.android.gms.internal.ads.Gma) r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r2 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendToTarget()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0759:
            com.google.android.gms.internal.ads.Via r1 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r2.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r3 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r1 = r1.a((int) r2, (com.google.android.gms.internal.ads.Yia) r3, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r1 = r1.f9448d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r7 == 0) goto L_0x078a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x077a
            com.google.android.gms.internal.ads.Kia r3 = r8.l     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r3 = r3.f7590c     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x078a
        L_0x077a:
            com.google.android.gms.internal.ads.Hia r3 = r8.F     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r3 = r3.i     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 == 0) goto L_0x078a
            r3 = 4
            r8.a((int) r3)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r34.e()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r4 = 2
            goto L_0x080a
        L_0x078a:
            int r3 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r4 = 2
            if (r3 != r4) goto L_0x07ef
            com.google.android.gms.internal.ads.Uia[] r3 = r8.q     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r3 = r3.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 <= 0) goto L_0x07dd
            if (r6 == 0) goto L_0x07db
            boolean r1 = r8.t     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r2 = r2.j     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 != 0) goto L_0x07a3
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r2 = r2.f7184h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x07ab
        L_0x07a3:
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.wla r2 = r2.f7177a     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r2 = r2.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x07ab:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07c7
            com.google.android.gms.internal.ads.Hia r2 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r2 = r2.i     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r2 == 0) goto L_0x07b9
            r1 = 1
            goto L_0x07d7
        L_0x07b9:
            com.google.android.gms.internal.ads.Via r2 = r8.G     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r3 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r3 = r3.f7183g     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r5 = r8.k     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Yia r2 = r2.a((int) r3, (com.google.android.gms.internal.ads.Yia) r5, (boolean) r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r2 = r2.f9448d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x07c7:
            com.google.android.gms.internal.ads.Pia r5 = r8.f7316d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Hia r6 = r8.D     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r8.C     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r6 = r6.b()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.a(r2, r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x07d7:
            if (r1 == 0) goto L_0x07db
            r1 = 1
            goto L_0x07e1
        L_0x07db:
            r1 = 0
            goto L_0x07e1
        L_0x07dd:
            boolean r1 = r8.b((long) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x07e1:
            if (r1 == 0) goto L_0x080a
            r1 = 3
            r8.a((int) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            boolean r1 = r8.s     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x080a
            r34.d()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x080a
        L_0x07ef:
            int r3 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5 = 3
            if (r3 != r5) goto L_0x080a
            com.google.android.gms.internal.ads.Uia[] r3 = r8.q     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r3 = r3.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r3 <= 0) goto L_0x07fa
            goto L_0x07fe
        L_0x07fa:
            boolean r6 = r8.b((long) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x07fe:
            if (r6 != 0) goto L_0x080a
            boolean r1 = r8.s     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.t = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((int) r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r34.e()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x080a:
            int r1 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != r4) goto L_0x081b
            com.google.android.gms.internal.ads.Uia[] r1 = r8.q     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r2 = r1.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0811:
            if (r9 >= r2) goto L_0x081b
            r3 = r1[r9]     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.C()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r9 = r9 + 1
            goto L_0x0811
        L_0x081b:
            boolean r1 = r8.s     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0824
            int r1 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = 3
            if (r1 == r2) goto L_0x0828
        L_0x0824:
            int r1 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != r4) goto L_0x082e
        L_0x0828:
            r1 = 10
            r8.a((long) r14, (long) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x083e
        L_0x082e:
            com.google.android.gms.internal.ads.Uia[] r1 = r8.q     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = r1.length     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0839
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.a((long) r14, (long) r1)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x083e
        L_0x0839:
            android.os.Handler r1 = r8.f7318f     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.removeMessages(r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x083e:
            com.google.android.gms.internal.ads.Qma.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0841:
            return r10
        L_0x0842:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0849
            r1 = 1
            goto L_0x084a
        L_0x0849:
            r1 = 0
        L_0x084a:
            r8.t = r9     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.s = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != 0) goto L_0x0857
            r34.e()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r34.f()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x086c
        L_0x0857:
            int r1 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2 = 3
            if (r1 != r2) goto L_0x0865
            r34.d()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r1 = r8.f7318f     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0861:
            r1.sendEmptyMessage(r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x086c
        L_0x0865:
            int r1 = r8.v     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 != r4) goto L_0x086c
            android.os.Handler r1 = r8.f7318f     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            goto L_0x0861
        L_0x086c:
            return r10
        L_0x086d:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.zla r2 = (com.google.android.gms.internal.ads.C3090zla) r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            int r1 = r1.arg1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0878
            r1 = 1
            goto L_0x0879
        L_0x0878:
            r1 = 0
        L_0x0879:
            android.os.Handler r3 = r8.f7320h     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.sendEmptyMessage(r9)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.c(r10)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.Pia r3 = r8.f7316d     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r3.a()     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            if (r1 == 0) goto L_0x0894
            com.google.android.gms.internal.ads.Kia r1 = new com.google.android.gms.internal.ads.Kia     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.l = r1     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
        L_0x0894:
            r8.p = r2     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            com.google.android.gms.internal.ads.zia r1 = r8.i     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r2.a(r1, r10, r8)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r8.a((int) r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            android.os.Handler r1 = r8.f7318f     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            r1.sendEmptyMessage(r4)     // Catch:{ Aia -> 0x08a9, IOException -> 0x08a4, RuntimeException -> 0x08ae }
            return r10
        L_0x08a4:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08ce
        L_0x08a9:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08e0
        L_0x08ae:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f7320h
            com.google.android.gms.internal.ads.Aia r1 = com.google.android.gms.internal.ads.Aia.a((java.lang.RuntimeException) r1)
            r3 = 8
        L_0x08bf:
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.g()
            return r10
        L_0x08ca:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08ce:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Source error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.f7320h
            com.google.android.gms.internal.ads.Aia r1 = com.google.android.gms.internal.ads.Aia.a((java.io.IOException) r1)
            goto L_0x08bf
        L_0x08dc:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08e0:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Renderer error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.f7320h
            goto L_0x08bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Iia.handleMessage(android.os.Message):boolean");
    }
}
