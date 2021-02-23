package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mla  reason: case insensitive filesystem */
final class C2168mla implements Vja, C2877wla, Jla, C3021yma<C2664tla> {
    private boolean[] A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    /* access modifiers changed from: private */
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f11358a;

    /* renamed from: b  reason: collision with root package name */
    private final C2170mma f11359b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11360c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f11361d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2948xla f11362e;

    /* renamed from: f  reason: collision with root package name */
    private final Cla f11363f;

    /* renamed from: g  reason: collision with root package name */
    private final C2028kma f11364g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f11365h = null;
    /* access modifiers changed from: private */
    public final long i;
    private final C2808vma j;
    private final C2593sla k;
    private final Ema l;
    private final Runnable m;
    /* access modifiers changed from: private */
    public final Runnable n;
    /* access modifiers changed from: private */
    public final Handler o;
    /* access modifiers changed from: private */
    public final SparseArray<Hla> p;
    /* access modifiers changed from: private */
    public Ala q;
    private C1458cka r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private Pla x;
    private long y;
    private boolean[] z;

    public C2168mla(Uri uri, C2170mma mma, Tja[] tjaArr, int i2, Handler handler, C2948xla xla, Cla cla, C2028kma kma, String str, int i3) {
        this.f11358a = uri;
        this.f11359b = mma;
        this.f11360c = i2;
        this.f11361d = handler;
        this.f11362e = xla;
        this.f11363f = cla;
        this.f11364g = kma;
        this.i = (long) i3;
        this.j = new C2808vma("Loader:ExtractorMediaPeriod");
        this.k = new C2593sla(tjaArr, this);
        this.l = new Ema();
        this.m = new C2381pla(this);
        this.n = new C2310ola(this);
        this.o = new Handler();
        this.E = -9223372036854775807L;
        this.p = new SparseArray<>();
        this.C = -1;
    }

    private final void a(C2664tla tla) {
        if (this.C == -1) {
            this.C = tla.i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = r9.r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.tla r6 = new com.google.android.gms.internal.ads.tla
            android.net.Uri r2 = r9.f11358a
            com.google.android.gms.internal.ads.mma r3 = r9.f11359b
            com.google.android.gms.internal.ads.sla r4 = r9.k
            com.google.android.gms.internal.ads.Ema r5 = r9.l
            r0 = r6
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r9.t
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r9.m()
            com.google.android.gms.internal.ads.Cma.b(r0)
            long r3 = r9.y
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r7 = r9.E
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r0 = 1
            r9.G = r0
            r9.E = r1
            return
        L_0x0031:
            com.google.android.gms.internal.ads.cka r0 = r9.r
            long r3 = r9.E
            long r3 = r0.a(r3)
            long r7 = r9.E
            r6.a(r3, r7)
            r9.E = r1
        L_0x0040:
            int r0 = r9.k()
            r9.F = r0
            int r0 = r9.f11360c
            r3 = -1
            if (r0 != r3) goto L_0x0067
            boolean r0 = r9.t
            if (r0 == 0) goto L_0x0066
            long r3 = r9.C
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.cka r0 = r9.r
            if (r0 == 0) goto L_0x0064
            long r3 = r0.c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 6
            goto L_0x0067
        L_0x0066:
            r0 = 3
        L_0x0067:
            com.google.android.gms.internal.ads.vma r1 = r9.j
            r1.a(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2168mla.i():void");
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void j() {
        /*
            r8 = this;
            boolean r0 = r8.H
            if (r0 != 0) goto L_0x009d
            boolean r0 = r8.t
            if (r0 != 0) goto L_0x009d
            com.google.android.gms.internal.ads.cka r0 = r8.r
            if (r0 == 0) goto L_0x009d
            boolean r0 = r8.s
            if (r0 != 0) goto L_0x0012
            goto L_0x009d
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.Hla> r0 = r8.p
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.Hla> r3 = r8.p
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.Hla r3 = (com.google.android.gms.internal.ads.Hla) r3
            com.google.android.gms.internal.ads.Lia r3 = r3.e()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.Ema r2 = r8.l
            r2.c()
            com.google.android.gms.internal.ads.Qla[] r2 = new com.google.android.gms.internal.ads.Qla[r0]
            boolean[] r3 = new boolean[r0]
            r8.A = r3
            boolean[] r3 = new boolean[r0]
            r8.z = r3
            com.google.android.gms.internal.ads.cka r3 = r8.r
            long r3 = r3.c()
            r8.y = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.Hla> r5 = r8.p
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.Hla r5 = (com.google.android.gms.internal.ads.Hla) r5
            com.google.android.gms.internal.ads.Lia r5 = r5.e()
            com.google.android.gms.internal.ads.Qla r6 = new com.google.android.gms.internal.ads.Qla
            com.google.android.gms.internal.ads.Lia[] r7 = new com.google.android.gms.internal.ads.Lia[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f7712f
            boolean r6 = com.google.android.gms.internal.ads.Jma.b(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.Jma.a(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.A
            r5[r3] = r4
            boolean r5 = r8.B
            r4 = r4 | r5
            r8.B = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.Pla r0 = new com.google.android.gms.internal.ads.Pla
            r0.<init>(r2)
            r8.x = r0
            r8.t = r4
            com.google.android.gms.internal.ads.Cla r0 = r8.f11363f
            com.google.android.gms.internal.ads.Nla r1 = new com.google.android.gms.internal.ads.Nla
            long r2 = r8.y
            com.google.android.gms.internal.ads.cka r4 = r8.r
            boolean r4 = r4.b()
            r1.<init>(r2, r4)
            r2 = 0
            r0.a(r1, r2)
            com.google.android.gms.internal.ads.Ala r0 = r8.q
            r0.a(r8)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2168mla.j():void");
    }

    private final int k() {
        int size = this.p.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.p.valueAt(i3).c();
        }
        return i2;
    }

    private final long l() {
        int size = this.p.size();
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, this.p.valueAt(i2).b());
        }
        return j2;
    }

    private final boolean m() {
        return this.E != -9223372036854775807L;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2, Nia nia, Ija ija, boolean z2) {
        if (this.v || m()) {
            return -3;
        }
        return this.p.valueAt(i2).a(nia, ija, z2, this.G, this.D);
    }

    public final /* synthetic */ int a(Bma bma, long j2, long j3, IOException iOException) {
        C1458cka cka;
        C2664tla tla = (C2664tla) bma;
        a(tla);
        Handler handler = this.f11361d;
        if (!(handler == null || this.f11362e == null)) {
            handler.post(new C2452qla(this, iOException));
        }
        if (iOException instanceof Sla) {
            return 3;
        }
        boolean z2 = k() > this.F;
        if (this.C == -1 && ((cka = this.r) == null || cka.c() == -9223372036854775807L)) {
            this.D = 0;
            this.v = this.t;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.valueAt(i2).a(!this.t || this.z[i2]);
            }
            tla.a(0, 0);
        }
        this.F = k();
        return z2 ? 1 : 0;
    }

    public final long a() {
        long j2;
        if (this.G) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.E;
        }
        if (this.B) {
            j2 = Long.MAX_VALUE;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.A[i2]) {
                    j2 = Math.min(j2, this.p.valueAt(i2).b());
                }
            }
        } else {
            j2 = l();
        }
        return j2 == Long.MIN_VALUE ? this.D : j2;
    }

    public final long a(C1391bma[] bmaArr, boolean[] zArr, Mla[] mlaArr, boolean[] zArr2, long j2) {
        Cma.b(this.t);
        for (int i2 = 0; i2 < bmaArr.length; i2++) {
            if (mlaArr[i2] != null && (bmaArr[i2] == null || !zArr[i2])) {
                int a2 = mlaArr[i2].f12560a;
                Cma.b(this.z[a2]);
                this.w--;
                this.z[a2] = false;
                this.p.valueAt(a2).a();
                mlaArr[i2] = null;
            }
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < bmaArr.length; i3++) {
            if (mlaArr[i3] == null && bmaArr[i3] != null) {
                C1391bma bma = bmaArr[i3];
                Cma.b(bma.length() == 1);
                Cma.b(bma.b(0) == 0);
                int a3 = this.x.a(bma.a());
                Cma.b(!this.z[a3]);
                this.w++;
                this.z[a3] = true;
                mlaArr[i3] = new C2806vla(this, a3);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (!this.u) {
            int size = this.p.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.z[i4]) {
                    this.p.valueAt(i4).a();
                }
            }
        }
        if (this.w == 0) {
            this.v = false;
            if (this.j.a()) {
                this.j.b();
            }
        } else if (!this.u ? j2 != 0 : z2) {
            j2 = b(j2);
            for (int i5 = 0; i5 < mlaArr.length; i5++) {
                if (mlaArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.u = true;
        return j2;
    }

    public final C1599eka a(int i2, int i3) {
        Hla hla = this.p.get(i2);
        if (hla != null) {
            return hla;
        }
        Hla hla2 = new Hla(this.f11364g);
        hla2.a((Jla) this);
        this.p.put(i2, hla2);
        return hla2;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        Hla valueAt = this.p.valueAt(i2);
        if (!this.G || j2 <= valueAt.b()) {
            valueAt.a(j2, true);
        } else {
            valueAt.f();
        }
    }

    public final void a(Ala ala, long j2) {
        this.q = ala;
        this.l.b();
        i();
    }

    public final /* synthetic */ void a(Bma bma, long j2, long j3) {
        a((C2664tla) bma);
        this.G = true;
        if (this.y == -9223372036854775807L) {
            long l2 = l();
            this.y = l2 == Long.MIN_VALUE ? 0 : l2 + 10000;
            this.f11363f.a(new Nla(this.y, this.r.b()), (Object) null);
        }
        this.q.a(this);
    }

    public final /* synthetic */ void a(Bma bma, long j2, long j3, boolean z2) {
        a((C2664tla) bma);
        if (!z2 && this.w > 0) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.valueAt(i2).a(this.z[i2]);
            }
            this.q.a(this);
        }
    }

    public final void a(Lia lia) {
        this.o.post(this.m);
    }

    public final void a(C1458cka cka) {
        this.r = cka;
        this.o.post(this.m);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        if (!this.G) {
            return !m() && this.p.valueAt(i2).d();
        }
        return true;
    }

    public final boolean a(long j2) {
        if (this.G) {
            return false;
        }
        if (this.t && this.w == 0) {
            return false;
        }
        boolean b2 = this.l.b();
        if (this.j.a()) {
            return b2;
        }
        i();
        return true;
    }

    public final long b() {
        if (this.w == 0) {
            return Long.MIN_VALUE;
        }
        return a();
    }

    public final long b(long j2) {
        if (!this.r.b()) {
            j2 = 0;
        }
        this.D = j2;
        int size = this.p.size();
        boolean z2 = !m();
        int i2 = 0;
        while (z2 && i2 < size) {
            if (this.z[i2]) {
                z2 = this.p.valueAt(i2).a(j2, false);
            }
            i2++;
        }
        if (!z2) {
            this.E = j2;
            this.G = false;
            if (this.j.a()) {
                this.j.b();
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    this.p.valueAt(i3).a(this.z[i3]);
                }
            }
        }
        this.v = false;
        return j2;
    }

    public final long c() {
        if (!this.v) {
            return -9223372036854775807L;
        }
        this.v = false;
        return this.D;
    }

    public final void c(long j2) {
    }

    public final void d() {
        this.j.a(Integer.MIN_VALUE);
    }

    public final Pla e() {
        return this.x;
    }

    public final void f() {
        this.s = true;
        this.o.post(this.m);
    }

    public final void g() {
        this.j.a((Runnable) new C2522rla(this, this.k));
        this.o.removeCallbacksAndMessages((Object) null);
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.j.a(Integer.MIN_VALUE);
    }
}
