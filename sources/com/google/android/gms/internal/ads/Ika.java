package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

public final class Ika implements Tja, C1458cka {

    /* renamed from: a  reason: collision with root package name */
    private static final Zja f7326a = new Lka();

    /* renamed from: b  reason: collision with root package name */
    private static final int f7327b = Tma.c("qt  ");

    /* renamed from: c  reason: collision with root package name */
    private final Nma f7328c = new Nma(Ima.f7340a);

    /* renamed from: d  reason: collision with root package name */
    private final Nma f7329d = new Nma(4);

    /* renamed from: e  reason: collision with root package name */
    private final Nma f7330e = new Nma(16);

    /* renamed from: f  reason: collision with root package name */
    private final Stack<C2591ska> f7331f = new Stack<>();

    /* renamed from: g  reason: collision with root package name */
    private int f7332g;

    /* renamed from: h  reason: collision with root package name */
    private int f7333h;
    private long i;
    private int j;
    private Nma k;
    private int l;
    private int m;
    private Vja n;
    private Kka[] o;
    private long p;
    private boolean q;

    private final void b(long j2) {
        C1389bla bla;
        Yja yja;
        Mka a2;
        while (!this.f7331f.isEmpty() && this.f7331f.peek().Qa == j2) {
            C2591ska pop = this.f7331f.pop();
            if (pop.Pa == C2379pka.B) {
                ArrayList arrayList = new ArrayList();
                C1389bla bla2 = null;
                Yja yja2 = new Yja();
                C2520rka d2 = pop.d(C2379pka.Aa);
                if (!(d2 == null || (bla2 = C2733uka.a(d2, this.q)) == null)) {
                    yja2.a(bla2);
                }
                long j3 = Long.MAX_VALUE;
                long j4 = -9223372036854775807L;
                int i2 = 0;
                while (i2 < pop.Sa.size()) {
                    C2591ska ska = pop.Sa.get(i2);
                    if (ska.Pa == C2379pka.D && (a2 = C2733uka.a(ska, pop.d(C2379pka.C), -9223372036854775807L, (Lja) null, this.q)) != null) {
                        Rka a3 = C2733uka.a(a2, ska.e(C2379pka.E).e(C2379pka.F).e(C2379pka.G), yja2);
                        if (a3.f8522a != 0) {
                            Kka kka = new Kka(a2, a3, this.n.a(i2, a2.f7886b));
                            Lia a4 = a2.f7890f.a(a3.f8525d + 30);
                            if (a2.f7886b == 1) {
                                if (yja2.a()) {
                                    a4 = a4.a(yja2.f9454c, yja2.f9455d);
                                }
                                if (bla2 != null) {
                                    a4 = a4.a(bla2);
                                }
                            }
                            kka.f7600c.a(a4);
                            bla = bla2;
                            yja = yja2;
                            j4 = Math.max(j4, a2.f7889e);
                            arrayList.add(kka);
                            long j5 = a3.f8523b[0];
                            if (j5 < j3) {
                                j3 = j5;
                            }
                            i2++;
                            yja2 = yja;
                            bla2 = bla;
                        }
                    }
                    bla = bla2;
                    yja = yja2;
                    i2++;
                    yja2 = yja;
                    bla2 = bla;
                }
                this.p = j4;
                this.o = (Kka[]) arrayList.toArray(new Kka[arrayList.size()]);
                this.n.f();
                this.n.a(this);
                this.f7331f.clear();
                this.f7332g = 2;
            } else if (!this.f7331f.isEmpty()) {
                this.f7331f.peek().a(pop);
            }
        }
        if (this.f7332g != 2) {
            d();
        }
    }

    private final void d() {
        this.f7332g = 0;
        this.j = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x018c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0299 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.Wja r24, com.google.android.gms.internal.ads._ja r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f7332g
            r4 = -1
            r5 = 8
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x018d
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x010d
            if (r3 != r10) goto L_0x0107
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001e:
            com.google.android.gms.internal.ads.Kka[] r14 = r0.o
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003a
            r14 = r14[r3]
            int r15 = r14.f7601d
            com.google.android.gms.internal.ads.Rka r14 = r14.f7599b
            int r11 = r14.f8522a
            if (r15 == r11) goto L_0x0037
            long[] r11 = r14.f8523b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            r5 = r3
            r12 = r14
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != r4) goto L_0x003d
            return r4
        L_0x003d:
            r3 = r14[r5]
            com.google.android.gms.internal.ads.eka r4 = r3.f7600c
            int r5 = r3.f7601d
            com.google.android.gms.internal.ads.Rka r11 = r3.f7599b
            long[] r12 = r11.f8523b
            r13 = r12[r5]
            int[] r11 = r11.f8524c
            r11 = r11[r5]
            com.google.android.gms.internal.ads.Mka r12 = r3.f7598a
            int r12 = r12.f7891g
            if (r12 != r6) goto L_0x0059
            r16 = 8
            long r13 = r13 + r16
            int r11 = r11 + -8
        L_0x0059:
            long r16 = r24.getPosition()
            long r16 = r13 - r16
            int r12 = r0.l
            r18 = r11
            long r10 = (long) r12
            long r10 = r16 + r10
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 < 0) goto L_0x0104
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x0072
            goto L_0x0104
        L_0x0072:
            int r2 = (int) r10
            r1.c(r2)
            com.google.android.gms.internal.ads.Mka r2 = r3.f7598a
            int r2 = r2.k
            if (r2 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.Nma r8 = r0.f7329d
            byte[] r8 = r8.f8013a
            r8[r7] = r7
            r8[r6] = r7
            r9 = 2
            r8[r9] = r7
            r8 = 4
            int r11 = 4 - r2
            r8 = r18
        L_0x008c:
            int r9 = r0.l
            if (r9 >= r8) goto L_0x00c9
            int r9 = r0.m
            if (r9 != 0) goto L_0x00ba
            com.google.android.gms.internal.ads.Nma r9 = r0.f7329d
            byte[] r9 = r9.f8013a
            r1.readFully(r9, r11, r2)
            com.google.android.gms.internal.ads.Nma r9 = r0.f7329d
            r9.c(r7)
            com.google.android.gms.internal.ads.Nma r9 = r0.f7329d
            int r9 = r9.o()
            r0.m = r9
            com.google.android.gms.internal.ads.Nma r9 = r0.f7328c
            r9.c(r7)
            com.google.android.gms.internal.ads.Nma r9 = r0.f7328c
            r10 = 4
            r4.a(r9, r10)
            int r9 = r0.l
            int r9 = r9 + r10
            r0.l = r9
            int r8 = r8 + r11
            goto L_0x008c
        L_0x00ba:
            int r9 = r4.a(r1, r9, r7)
            int r10 = r0.l
            int r10 = r10 + r9
            r0.l = r10
            int r10 = r0.m
            int r10 = r10 - r9
            r0.m = r10
            goto L_0x008c
        L_0x00c9:
            r20 = r8
            goto L_0x00e7
        L_0x00cc:
            int r2 = r0.l
            r11 = r18
            if (r2 >= r11) goto L_0x00e5
            int r2 = r11 - r2
            int r2 = r4.a(r1, r2, r7)
            int r8 = r0.l
            int r8 = r8 + r2
            r0.l = r8
            int r8 = r0.m
            int r8 = r8 - r2
            r0.m = r8
            r18 = r11
            goto L_0x00cc
        L_0x00e5:
            r20 = r11
        L_0x00e7:
            com.google.android.gms.internal.ads.Rka r1 = r3.f7599b
            long[] r2 = r1.f8526e
            r17 = r2[r5]
            int[] r1 = r1.f8527f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.a(r17, r19, r20, r21, r22)
            int r1 = r3.f7601d
            int r1 = r1 + r6
            r3.f7601d = r1
            r0.l = r7
            r0.m = r7
            return r7
        L_0x0104:
            r2.f9698a = r13
            return r6
        L_0x0107:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x010d:
            long r3 = r0.i
            int r10 = r0.j
            long r10 = (long) r10
            long r3 = r3 - r10
            long r10 = r24.getPosition()
            long r10 = r10 + r3
            com.google.android.gms.internal.ads.Nma r12 = r0.k
            if (r12 == 0) goto L_0x016d
            byte[] r8 = r12.f8013a
            int r9 = r0.j
            int r4 = (int) r3
            r1.readFully(r8, r9, r4)
            int r3 = r0.f7333h
            int r4 = com.google.android.gms.internal.ads.C2379pka.f11744a
            if (r3 != r4) goto L_0x0150
            com.google.android.gms.internal.ads.Nma r3 = r0.k
            r3.c(r5)
            int r4 = r3.d()
            int r5 = f7327b
            if (r4 != r5) goto L_0x0139
        L_0x0137:
            r3 = 1
            goto L_0x014d
        L_0x0139:
            r4 = 4
            r3.d(r4)
        L_0x013d:
            int r4 = r3.j()
            if (r4 <= 0) goto L_0x014c
            int r4 = r3.d()
            int r5 = f7327b
            if (r4 != r5) goto L_0x013d
            goto L_0x0137
        L_0x014c:
            r3 = 0
        L_0x014d:
            r0.q = r3
            goto L_0x0175
        L_0x0150:
            java.util.Stack<com.google.android.gms.internal.ads.ska> r3 = r0.f7331f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0175
            java.util.Stack<com.google.android.gms.internal.ads.ska> r3 = r0.f7331f
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.ska r3 = (com.google.android.gms.internal.ads.C2591ska) r3
            com.google.android.gms.internal.ads.rka r4 = new com.google.android.gms.internal.ads.rka
            int r5 = r0.f7333h
            com.google.android.gms.internal.ads.Nma r8 = r0.k
            r4.<init>(r5, r8)
            r3.a((com.google.android.gms.internal.ads.C2520rka) r4)
            goto L_0x0175
        L_0x016d:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0177
            int r4 = (int) r3
            r1.c(r4)
        L_0x0175:
            r3 = 0
            goto L_0x017f
        L_0x0177:
            long r8 = r24.getPosition()
            long r8 = r8 + r3
            r2.f9698a = r8
            r3 = 1
        L_0x017f:
            r0.b(r10)
            if (r3 == 0) goto L_0x018a
            int r3 = r0.f7332g
            r4 = 2
            if (r3 == r4) goto L_0x018a
            r7 = 1
        L_0x018a:
            if (r7 == 0) goto L_0x0006
            return r6
        L_0x018d:
            int r3 = r0.j
            if (r3 != 0) goto L_0x01b5
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            byte[] r3 = r3.f8013a
            boolean r3 = r1.a(r3, r7, r5, r6)
            if (r3 != 0) goto L_0x019e
            r6 = 0
            goto L_0x0297
        L_0x019e:
            r0.j = r5
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            r3.c(r7)
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            long r8 = r3.l()
            r0.i = r8
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            int r3 = r3.d()
            r0.f7333h = r3
        L_0x01b5:
            long r8 = r0.i
            r10 = 1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01d1
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            byte[] r3 = r3.f8013a
            r1.readFully(r3, r5, r5)
            int r3 = r0.j
            int r3 = r3 + r5
            r0.j = r3
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            long r8 = r3.p()
            r0.i = r8
        L_0x01d1:
            int r3 = r0.f7333h
            int r8 = com.google.android.gms.internal.ads.C2379pka.B
            if (r3 == r8) goto L_0x01ee
            int r8 = com.google.android.gms.internal.ads.C2379pka.D
            if (r3 == r8) goto L_0x01ee
            int r8 = com.google.android.gms.internal.ads.C2379pka.E
            if (r3 == r8) goto L_0x01ee
            int r8 = com.google.android.gms.internal.ads.C2379pka.F
            if (r3 == r8) goto L_0x01ee
            int r8 = com.google.android.gms.internal.ads.C2379pka.G
            if (r3 == r8) goto L_0x01ee
            int r8 = com.google.android.gms.internal.ads.C2379pka.P
            if (r3 != r8) goto L_0x01ec
            goto L_0x01ee
        L_0x01ec:
            r3 = 0
            goto L_0x01ef
        L_0x01ee:
            r3 = 1
        L_0x01ef:
            if (r3 == 0) goto L_0x021b
            long r7 = r24.getPosition()
            long r9 = r0.i
            long r7 = r7 + r9
            int r3 = r0.j
            long r9 = (long) r3
            long r7 = r7 - r9
            java.util.Stack<com.google.android.gms.internal.ads.ska> r3 = r0.f7331f
            com.google.android.gms.internal.ads.ska r5 = new com.google.android.gms.internal.ads.ska
            int r9 = r0.f7333h
            r5.<init>(r9, r7)
            r3.add(r5)
            long r9 = r0.i
            int r3 = r0.j
            long r11 = (long) r3
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0216
            r0.b(r7)
            goto L_0x0297
        L_0x0216:
            r23.d()
            goto L_0x0297
        L_0x021b:
            int r3 = r0.f7333h
            int r8 = com.google.android.gms.internal.ads.C2379pka.R
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.C
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.S
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.T
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.ma
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.na
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.oa
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.Q
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.pa
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.qa
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.ra
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.sa
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.ta
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.O
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.f11744a
            if (r3 == r8) goto L_0x0260
            int r8 = com.google.android.gms.internal.ads.C2379pka.Aa
            if (r3 != r8) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r3 = 0
            goto L_0x0261
        L_0x0260:
            r3 = 1
        L_0x0261:
            if (r3 == 0) goto L_0x0292
            int r3 = r0.j
            if (r3 != r5) goto L_0x0269
            r3 = 1
            goto L_0x026a
        L_0x0269:
            r3 = 0
        L_0x026a:
            com.google.android.gms.internal.ads.Cma.b(r3)
            long r8 = r0.i
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0278
            r3 = 1
            goto L_0x0279
        L_0x0278:
            r3 = 0
        L_0x0279:
            com.google.android.gms.internal.ads.Cma.b(r3)
            com.google.android.gms.internal.ads.Nma r3 = new com.google.android.gms.internal.ads.Nma
            long r8 = r0.i
            int r9 = (int) r8
            r3.<init>((int) r9)
            r0.k = r3
            com.google.android.gms.internal.ads.Nma r3 = r0.f7330e
            byte[] r3 = r3.f8013a
            com.google.android.gms.internal.ads.Nma r8 = r0.k
            byte[] r8 = r8.f8013a
            java.lang.System.arraycopy(r3, r7, r8, r7, r5)
            goto L_0x0295
        L_0x0292:
            r3 = 0
            r0.k = r3
        L_0x0295:
            r0.f7332g = r6
        L_0x0297:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ika.a(com.google.android.gms.internal.ads.Wja, com.google.android.gms.internal.ads._ja):int");
    }

    public final long a(long j2) {
        long j3 = Long.MAX_VALUE;
        for (Kka kka : this.o) {
            Rka rka = kka.f7599b;
            int a2 = rka.a(j2);
            if (a2 == -1) {
                a2 = rka.b(j2);
            }
            long j4 = rka.f8523b[a2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final void a() {
    }

    public final void a(long j2, long j3) {
        this.f7331f.clear();
        this.j = 0;
        this.l = 0;
        this.m = 0;
        if (j2 == 0) {
            d();
            return;
        }
        Kka[] kkaArr = this.o;
        if (kkaArr != null) {
            for (Kka kka : kkaArr) {
                Rka rka = kka.f7599b;
                int a2 = rka.a(j3);
                if (a2 == -1) {
                    a2 = rka.b(j3);
                }
                kka.f7601d = a2;
            }
        }
    }

    public final void a(Vja vja) {
        this.n = vja;
    }

    public final boolean a(Wja wja) {
        return Nka.b(wja);
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.p;
    }
}
