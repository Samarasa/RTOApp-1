package com.google.android.gms.internal.ads;

final class Fla {

    /* renamed from: a  reason: collision with root package name */
    private int f6902a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private int[] f6903b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f6904c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f6905d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f6906e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f6907f;

    /* renamed from: g  reason: collision with root package name */
    private C1529dka[] f6908g;

    /* renamed from: h  reason: collision with root package name */
    private Lia[] f6909h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private Lia q;

    public Fla() {
        int i2 = this.f6902a;
        this.f6903b = new int[i2];
        this.f6904c = new long[i2];
        this.f6907f = new long[i2];
        this.f6906e = new int[i2];
        this.f6905d = new int[i2];
        this.f6908g = new C1529dka[i2];
        this.f6909h = new Lia[i2];
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.p = true;
        this.o = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(com.google.android.gms.internal.ads.Nia r5, com.google.android.gms.internal.ads.Ija r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.Lia r9, com.google.android.gms.internal.ads.Ila r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.e()     // Catch:{ all -> 0x00a6 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.a(r5)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.Lia r6 = r4.q     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.Lia r6 = r4.q     // Catch:{ all -> 0x00a6 }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            com.google.android.gms.internal.ads.Lia r6 = r4.q     // Catch:{ all -> 0x00a6 }
            r5.f7998a = r6     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            if (r7 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.Lia[] r7 = r4.f6909h     // Catch:{ all -> 0x00a6 }
            int r8 = r4.k     // Catch:{ all -> 0x00a6 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a6 }
            if (r7 == r9) goto L_0x002f
            goto L_0x009c
        L_0x002f:
            java.nio.ByteBuffer r5 = r6.f7322c     // Catch:{ all -> 0x00a6 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            monitor-exit(r4)
            return r2
        L_0x003c:
            long[] r5 = r4.f6907f     // Catch:{ all -> 0x00a6 }
            int r9 = r4.k     // Catch:{ all -> 0x00a6 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r6.f7323d = r0     // Catch:{ all -> 0x00a6 }
            int[] r5 = r4.f6906e     // Catch:{ all -> 0x00a6 }
            int r9 = r4.k     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r6.a(r5)     // Catch:{ all -> 0x00a6 }
            int[] r5 = r4.f6905d     // Catch:{ all -> 0x00a6 }
            int r9 = r4.k     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.f7335a = r5     // Catch:{ all -> 0x00a6 }
            long[] r5 = r4.f6904c     // Catch:{ all -> 0x00a6 }
            int r9 = r4.k     // Catch:{ all -> 0x00a6 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.f7336b = r0     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.dka[] r5 = r4.f6908g     // Catch:{ all -> 0x00a6 }
            int r9 = r4.k     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.f7338d = r5     // Catch:{ all -> 0x00a6 }
            long r0 = r4.m     // Catch:{ all -> 0x00a6 }
            long r5 = r6.f7323d     // Catch:{ all -> 0x00a6 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a6 }
            r4.m = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.i     // Catch:{ all -> 0x00a6 }
            int r5 = r5 - r8
            r4.i = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.k     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r8
            r4.k = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.j     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r8
            r4.j = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.k     // Catch:{ all -> 0x00a6 }
            int r6 = r4.f6902a     // Catch:{ all -> 0x00a6 }
            if (r5 != r6) goto L_0x0086
            r4.k = r7     // Catch:{ all -> 0x00a6 }
        L_0x0086:
            int r5 = r4.i     // Catch:{ all -> 0x00a6 }
            if (r5 <= 0) goto L_0x0092
            long[] r5 = r4.f6904c     // Catch:{ all -> 0x00a6 }
            int r6 = r4.k     // Catch:{ all -> 0x00a6 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a6 }
            r5 = r6
            goto L_0x0098
        L_0x0092:
            long r5 = r10.f7336b     // Catch:{ all -> 0x00a6 }
            int r7 = r10.f7335a     // Catch:{ all -> 0x00a6 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a6 }
            long r5 = r5 + r7
        L_0x0098:
            r10.f7337c = r5     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r3
        L_0x009c:
            com.google.android.gms.internal.ads.Lia[] r6 = r4.f6909h     // Catch:{ all -> 0x00a6 }
            int r7 = r4.k     // Catch:{ all -> 0x00a6 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a6 }
            r5.f7998a = r6     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r1
        L_0x00a6:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fla.a(com.google.android.gms.internal.ads.Nia, com.google.android.gms.internal.ads.Ija, boolean, boolean, com.google.android.gms.internal.ads.Lia, com.google.android.gms.internal.ads.Ila):int");
    }

    public final synchronized long a() {
        return Math.max(this.m, this.n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.e()     // Catch:{ all -> 0x0061 }
            r1 = -1
            if (r0 == 0) goto L_0x005f
            long[] r0 = r8.f6907f     // Catch:{ all -> 0x0061 }
            int r3 = r8.k     // Catch:{ all -> 0x0061 }
            r3 = r0[r3]     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005f
        L_0x0014:
            long r3 = r8.n     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.k     // Catch:{ all -> 0x0061 }
            r3 = -1
            r11 = -1
            r4 = 0
        L_0x0024:
            int r5 = r8.l     // Catch:{ all -> 0x0061 }
            if (r0 == r5) goto L_0x0041
            long[] r5 = r8.f6907f     // Catch:{ all -> 0x0061 }
            r6 = r5[r0]     // Catch:{ all -> 0x0061 }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            int[] r5 = r8.f6906e     // Catch:{ all -> 0x0061 }
            r5 = r5[r0]     // Catch:{ all -> 0x0061 }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0039
            r11 = r4
        L_0x0039:
            int r0 = r0 + 1
            int r5 = r8.f6902a     // Catch:{ all -> 0x0061 }
            int r0 = r0 % r5
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0041:
            if (r11 != r3) goto L_0x0045
            monitor-exit(r8)
            return r1
        L_0x0045:
            int r9 = r8.k     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            int r10 = r8.f6902a     // Catch:{ all -> 0x0061 }
            int r9 = r9 % r10
            r8.k = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.j     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            r8.j = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.i     // Catch:{ all -> 0x0061 }
            int r9 = r9 - r11
            r8.i = r9     // Catch:{ all -> 0x0061 }
            long[] r9 = r8.f6904c     // Catch:{ all -> 0x0061 }
            int r10 = r8.k     // Catch:{ all -> 0x0061 }
            r10 = r9[r10]     // Catch:{ all -> 0x0061 }
            monitor-exit(r8)
            return r10
        L_0x005f:
            monitor-exit(r8)
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0065
        L_0x0064:
            throw r9
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fla.a(long, boolean):long");
    }

    public final synchronized void a(long j2) {
        this.n = Math.max(this.n, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ea, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.C1529dka r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.o     // Catch:{ all -> 0x00eb }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.o = r1     // Catch:{ all -> 0x00eb }
        L_0x000e:
            boolean r0 = r5.p     // Catch:{ all -> 0x00eb }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.Cma.b(r0)     // Catch:{ all -> 0x00eb }
            r5.a((long) r6)     // Catch:{ all -> 0x00eb }
            long[] r0 = r5.f6907f     // Catch:{ all -> 0x00eb }
            int r3 = r5.l     // Catch:{ all -> 0x00eb }
            r0[r3] = r6     // Catch:{ all -> 0x00eb }
            long[] r6 = r5.f6904c     // Catch:{ all -> 0x00eb }
            int r7 = r5.l     // Catch:{ all -> 0x00eb }
            r6[r7] = r9     // Catch:{ all -> 0x00eb }
            int[] r6 = r5.f6905d     // Catch:{ all -> 0x00eb }
            int r7 = r5.l     // Catch:{ all -> 0x00eb }
            r6[r7] = r11     // Catch:{ all -> 0x00eb }
            int[] r6 = r5.f6906e     // Catch:{ all -> 0x00eb }
            int r7 = r5.l     // Catch:{ all -> 0x00eb }
            r6[r7] = r8     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.dka[] r6 = r5.f6908g     // Catch:{ all -> 0x00eb }
            int r7 = r5.l     // Catch:{ all -> 0x00eb }
            r6[r7] = r12     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.Lia[] r6 = r5.f6909h     // Catch:{ all -> 0x00eb }
            int r7 = r5.l     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.Lia r8 = r5.q     // Catch:{ all -> 0x00eb }
            r6[r7] = r8     // Catch:{ all -> 0x00eb }
            int[] r6 = r5.f6903b     // Catch:{ all -> 0x00eb }
            int r7 = r5.l     // Catch:{ all -> 0x00eb }
            r6[r7] = r1     // Catch:{ all -> 0x00eb }
            int r6 = r5.i     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r2
            r5.i = r6     // Catch:{ all -> 0x00eb }
            int r6 = r5.i     // Catch:{ all -> 0x00eb }
            int r7 = r5.f6902a     // Catch:{ all -> 0x00eb }
            if (r6 != r7) goto L_0x00dc
            int r6 = r5.f6902a     // Catch:{ all -> 0x00eb }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00eb }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00eb }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00eb }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00eb }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.dka[] r12 = new com.google.android.gms.internal.ads.C1529dka[r6]     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.Lia[] r0 = new com.google.android.gms.internal.ads.Lia[r6]     // Catch:{ all -> 0x00eb }
            int r2 = r5.f6902a     // Catch:{ all -> 0x00eb }
            int r3 = r5.k     // Catch:{ all -> 0x00eb }
            int r2 = r2 - r3
            long[] r3 = r5.f6904c     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00eb }
            long[] r3 = r5.f6907f     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00eb }
            int[] r3 = r5.f6906e     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00eb }
            int[] r3 = r5.f6905d     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.dka[] r3 = r5.f6908g     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.Lia[] r3 = r5.f6909h     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00eb }
            int[] r3 = r5.f6903b     // Catch:{ all -> 0x00eb }
            int r4 = r5.k     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00eb }
            int r3 = r5.k     // Catch:{ all -> 0x00eb }
            long[] r4 = r5.f6904c     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00eb }
            long[] r4 = r5.f6907f     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00eb }
            int[] r4 = r5.f6906e     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00eb }
            int[] r4 = r5.f6905d     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.dka[] r4 = r5.f6908g     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.Lia[] r4 = r5.f6909h     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00eb }
            int[] r4 = r5.f6903b     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00eb }
            r5.f6904c = r8     // Catch:{ all -> 0x00eb }
            r5.f6907f = r9     // Catch:{ all -> 0x00eb }
            r5.f6906e = r10     // Catch:{ all -> 0x00eb }
            r5.f6905d = r11     // Catch:{ all -> 0x00eb }
            r5.f6908g = r12     // Catch:{ all -> 0x00eb }
            r5.f6909h = r0     // Catch:{ all -> 0x00eb }
            r5.f6903b = r7     // Catch:{ all -> 0x00eb }
            r5.k = r1     // Catch:{ all -> 0x00eb }
            int r7 = r5.f6902a     // Catch:{ all -> 0x00eb }
            r5.l = r7     // Catch:{ all -> 0x00eb }
            int r7 = r5.f6902a     // Catch:{ all -> 0x00eb }
            r5.i = r7     // Catch:{ all -> 0x00eb }
            r5.f6902a = r6     // Catch:{ all -> 0x00eb }
            monitor-exit(r5)
            return
        L_0x00dc:
            int r6 = r5.l     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r2
            r5.l = r6     // Catch:{ all -> 0x00eb }
            int r6 = r5.l     // Catch:{ all -> 0x00eb }
            int r7 = r5.f6902a     // Catch:{ all -> 0x00eb }
            if (r6 != r7) goto L_0x00e9
            r5.l = r1     // Catch:{ all -> 0x00eb }
        L_0x00e9:
            monitor-exit(r5)
            return
        L_0x00eb:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fla.a(long, int, long, int, com.google.android.gms.internal.ads.dka):void");
    }

    public final synchronized boolean a(Lia lia) {
        if (lia == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (Tma.a((Object) lia, (Object) this.q)) {
            return false;
        }
        this.q = lia;
        return true;
    }

    public final void b() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.i = 0;
        this.o = true;
    }

    public final void c() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int d() {
        return this.j + this.i;
    }

    public final synchronized boolean e() {
        return this.i != 0;
    }

    public final synchronized Lia f() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long g() {
        if (!e()) {
            return -1;
        }
        int i2 = ((this.k + this.i) - 1) % this.f6902a;
        this.k = (this.k + this.i) % this.f6902a;
        this.j += this.i;
        this.i = 0;
        return this.f6904c[i2] + ((long) this.f6905d[i2]);
    }
}
