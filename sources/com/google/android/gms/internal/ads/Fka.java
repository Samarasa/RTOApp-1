package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public final class Fka implements Tja {

    /* renamed from: a  reason: collision with root package name */
    private static final Zja f6893a = new Eka();

    /* renamed from: b  reason: collision with root package name */
    private static final int f6894b = Tma.c("seig");

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f6895c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private int A;
    private int B;
    private boolean C;
    private Vja D;
    private C1599eka E;
    private C1599eka[] F;
    private boolean G;

    /* renamed from: d  reason: collision with root package name */
    private final int f6896d;

    /* renamed from: e  reason: collision with root package name */
    private final Mka f6897e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<Gka> f6898f;

    /* renamed from: g  reason: collision with root package name */
    private final Nma f6899g;

    /* renamed from: h  reason: collision with root package name */
    private final Nma f6900h;
    private final Nma i;
    private final Nma j;
    private final Rma k;
    private final Nma l;
    private final byte[] m;
    private final Stack<C2591ska> n;
    private final LinkedList<Hka> o;
    private int p;
    private int q;
    private long r;
    private int s;
    private Nma t;
    private long u;
    private int v;
    private long w;
    private long x;
    private Gka y;
    private int z;

    public Fka() {
        this(0);
    }

    private Fka(int i2) {
        this(0, (Rma) null);
    }

    private Fka(int i2, Rma rma) {
        this(0, (Rma) null, (Mka) null);
    }

    private Fka(int i2, Rma rma, Mka mka) {
        this.f6896d = 0;
        this.k = null;
        this.f6897e = null;
        this.l = new Nma(16);
        this.f6899g = new Nma(Ima.f7340a);
        this.f6900h = new Nma(5);
        this.i = new Nma();
        this.j = new Nma(1);
        this.m = new byte[16];
        this.n = new Stack<>();
        this.o = new LinkedList<>();
        this.f6898f = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.Lja a(java.util.List<com.google.android.gms.internal.ads.C2520rka> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.rka r5 = (com.google.android.gms.internal.ads.C2520rka) r5
            int r6 = r5.Pa
            int r7 = com.google.android.gms.internal.ads.C2379pka.U
            if (r6 != r7) goto L_0x00b5
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.google.android.gms.internal.ads.Nma r5 = r5.Qa
            byte[] r5 = r5.f8013a
            com.google.android.gms.internal.ads.Nma r6 = new com.google.android.gms.internal.ads.Nma
            r6.<init>((byte[]) r5)
            int r7 = r6.c()
            r8 = 32
            if (r7 >= r8) goto L_0x0030
        L_0x002e:
            r6 = r2
            goto L_0x0099
        L_0x0030:
            r6.c(r1)
            int r7 = r6.d()
            int r8 = r6.j()
            int r8 = r8 + 4
            if (r7 == r8) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            int r7 = r6.d()
            int r8 = com.google.android.gms.internal.ads.C2379pka.U
            if (r7 == r8) goto L_0x0049
            goto L_0x002e
        L_0x0049:
            int r7 = r6.d()
            int r7 = com.google.android.gms.internal.ads.C2379pka.a(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006d
            r6 = 37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Unsupported pssh version: "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002e
        L_0x006d:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.e()
            long r12 = r6.e()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0085
            int r7 = r6.o()
            int r7 = r7 << 4
            r6.d(r7)
        L_0x0085:
            int r7 = r6.o()
            int r8 = r6.j()
            if (r7 == r8) goto L_0x0090
            goto L_0x002e
        L_0x0090:
            byte[] r8 = new byte[r7]
            r6.a(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0099:
            if (r6 != 0) goto L_0x009d
            r6 = r2
            goto L_0x00a1
        L_0x009d:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x00a1:
            if (r6 != 0) goto L_0x00ab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b5
        L_0x00ab:
            com.google.android.gms.internal.ads.Lja$a r7 = new com.google.android.gms.internal.ads.Lja$a
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        L_0x00b5:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b9:
            if (r4 != 0) goto L_0x00bc
            return r2
        L_0x00bc:
            com.google.android.gms.internal.ads.Lja r14 = new com.google.android.gms.internal.ads.Lja
            r14.<init>((java.util.List<com.google.android.gms.internal.ads.Lja.a>) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fka.a(java.util.List):com.google.android.gms.internal.ads.Lja");
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0650  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(long r55) {
        /*
            r54 = this;
            r0 = r54
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.ska> r1 = r0.n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x06f1
            java.util.Stack<com.google.android.gms.internal.ads.ska> r1 = r0.n
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.ska r1 = (com.google.android.gms.internal.ads.C2591ska) r1
            long r1 = r1.Qa
            int r3 = (r1 > r55 ? 1 : (r1 == r55 ? 0 : -1))
            if (r3 != 0) goto L_0x06f1
            java.util.Stack<com.google.android.gms.internal.ads.ska> r1 = r0.n
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.ska r1 = (com.google.android.gms.internal.ads.C2591ska) r1
            int r2 = r1.Pa
            int r3 = com.google.android.gms.internal.ads.C2379pka.B
            r4 = 0
            r5 = 12
            r6 = 4
            r7 = 8
            r9 = 1
            if (r2 != r3) goto L_0x01ca
            java.lang.String r2 = "Unexpected moov box."
            com.google.android.gms.internal.ads.Cma.b(r9, r2)
            java.util.List<com.google.android.gms.internal.ads.rka> r2 = r1.Ra
            com.google.android.gms.internal.ads.Lja r2 = a((java.util.List<com.google.android.gms.internal.ads.C2520rka>) r2)
            int r3 = com.google.android.gms.internal.ads.C2379pka.M
            com.google.android.gms.internal.ads.ska r3 = r1.e(r3)
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.gms.internal.ads.rka> r12 = r3.Ra
            int r12 = r12.size()
            r16 = r10
            r10 = 0
        L_0x0051:
            if (r10 >= r12) goto L_0x00bc
            java.util.List<com.google.android.gms.internal.ads.rka> r11 = r3.Ra
            java.lang.Object r11 = r11.get(r10)
            com.google.android.gms.internal.ads.rka r11 = (com.google.android.gms.internal.ads.C2520rka) r11
            int r13 = r11.Pa
            int r14 = com.google.android.gms.internal.ads.C2379pka.y
            if (r13 != r14) goto L_0x0098
            com.google.android.gms.internal.ads.Nma r11 = r11.Qa
            r11.c(r5)
            int r13 = r11.d()
            int r14 = r11.o()
            int r14 = r14 - r9
            int r5 = r11.o()
            int r8 = r11.o()
            int r11 = r11.d()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.android.gms.internal.ads.Aka r9 = new com.google.android.gms.internal.ads.Aka
            r9.<init>(r14, r5, r8, r11)
            android.util.Pair r5 = android.util.Pair.create(r13, r9)
            java.lang.Object r8 = r5.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r5 = r5.second
            com.google.android.gms.internal.ads.Aka r5 = (com.google.android.gms.internal.ads.Aka) r5
            r15.put(r8, r5)
            goto L_0x00b6
        L_0x0098:
            int r5 = com.google.android.gms.internal.ads.C2379pka.N
            if (r13 != r5) goto L_0x00b6
            com.google.android.gms.internal.ads.Nma r5 = r11.Qa
            r5.c(r7)
            int r8 = r5.d()
            int r8 = com.google.android.gms.internal.ads.C2379pka.a(r8)
            if (r8 != 0) goto L_0x00b0
            long r8 = r5.l()
            goto L_0x00b4
        L_0x00b0:
            long r8 = r5.p()
        L_0x00b4:
            r16 = r8
        L_0x00b6:
            int r10 = r10 + 1
            r5 = 12
            r9 = 1
            goto L_0x0051
        L_0x00bc:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.google.android.gms.internal.ads.ska> r5 = r1.Sa
            int r5 = r5.size()
            r8 = 0
        L_0x00c8:
            if (r8 >= r5) goto L_0x00f8
            java.util.List<com.google.android.gms.internal.ads.ska> r9 = r1.Sa
            java.lang.Object r9 = r9.get(r8)
            r10 = r9
            com.google.android.gms.internal.ads.ska r10 = (com.google.android.gms.internal.ads.C2591ska) r10
            int r9 = r10.Pa
            int r11 = com.google.android.gms.internal.ads.C2379pka.D
            if (r9 != r11) goto L_0x00f1
            int r9 = com.google.android.gms.internal.ads.C2379pka.C
            com.google.android.gms.internal.ads.rka r11 = r1.d(r9)
            r9 = 0
            r12 = r16
            r14 = r2
            r7 = r15
            r15 = r9
            com.google.android.gms.internal.ads.Mka r9 = com.google.android.gms.internal.ads.C2733uka.a((com.google.android.gms.internal.ads.C2591ska) r10, (com.google.android.gms.internal.ads.C2520rka) r11, (long) r12, (com.google.android.gms.internal.ads.Lja) r14, (boolean) r15)
            if (r9 == 0) goto L_0x00f2
            int r10 = r9.f7885a
            r3.put(r10, r9)
            goto L_0x00f2
        L_0x00f1:
            r7 = r15
        L_0x00f2:
            int r8 = r8 + 1
            r15 = r7
            r7 = 8
            goto L_0x00c8
        L_0x00f8:
            r7 = r15
            int r1 = r3.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0199
            r2 = 0
        L_0x0106:
            if (r2 >= r1) goto L_0x013a
            java.lang.Object r5 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.Mka r5 = (com.google.android.gms.internal.ads.Mka) r5
            com.google.android.gms.internal.ads.Gka r8 = new com.google.android.gms.internal.ads.Gka
            com.google.android.gms.internal.ads.Vja r9 = r0.D
            int r10 = r5.f7886b
            com.google.android.gms.internal.ads.eka r9 = r9.a(r2, r10)
            r8.<init>(r9)
            int r9 = r5.f7885a
            java.lang.Object r9 = r7.get(r9)
            com.google.android.gms.internal.ads.Aka r9 = (com.google.android.gms.internal.ads.Aka) r9
            r8.a(r5, r9)
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r9 = r0.f6898f
            int r10 = r5.f7885a
            r9.put(r10, r8)
            long r8 = r0.w
            long r10 = r5.f7889e
            long r8 = java.lang.Math.max(r8, r10)
            r0.w = r8
            int r2 = r2 + 1
            goto L_0x0106
        L_0x013a:
            int r1 = r0.f6896d
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.eka r1 = r0.E
            if (r1 != 0) goto L_0x0161
            com.google.android.gms.internal.ads.Vja r1 = r0.D
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r2 = r2.size()
            com.google.android.gms.internal.ads.eka r1 = r1.a(r2, r6)
            r0.E = r1
            com.google.android.gms.internal.ads.eka r1 = r0.E
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = "application/x-emsg"
            com.google.android.gms.internal.ads.Lia r2 = com.google.android.gms.internal.ads.Lia.a((java.lang.String) r4, (java.lang.String) r5, (long) r2)
            r1.a(r2)
        L_0x0161:
            int r1 = r0.f6896d
            r2 = 8
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.eka[] r1 = r0.F
            if (r1 != 0) goto L_0x0192
            com.google.android.gms.internal.ads.Vja r1 = r0.D
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 + r3
            r3 = 3
            com.google.android.gms.internal.ads.eka r1 = r1.a(r2, r3)
            r2 = 0
            r4 = 0
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "application/cea-608"
            com.google.android.gms.internal.ads.Lia r2 = com.google.android.gms.internal.ads.Lia.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (java.lang.String) r7, (com.google.android.gms.internal.ads.Lja) r8)
            r1.a(r2)
            r2 = 1
            com.google.android.gms.internal.ads.eka[] r2 = new com.google.android.gms.internal.ads.C1599eka[r2]
            r3 = 0
            r2[r3] = r1
            r0.F = r2
        L_0x0192:
            com.google.android.gms.internal.ads.Vja r1 = r0.D
            r1.f()
            goto L_0x0002
        L_0x0199:
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r2 = r2.size()
            if (r2 != r1) goto L_0x01a4
            r19 = 1
            goto L_0x01a6
        L_0x01a4:
            r19 = 0
        L_0x01a6:
            com.google.android.gms.internal.ads.Cma.b(r19)
            r2 = 0
        L_0x01aa:
            if (r2 >= r1) goto L_0x0002
            java.lang.Object r4 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.Mka r4 = (com.google.android.gms.internal.ads.Mka) r4
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r5 = r0.f6898f
            int r6 = r4.f7885a
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.Gka r5 = (com.google.android.gms.internal.ads.Gka) r5
            int r6 = r4.f7885a
            java.lang.Object r6 = r7.get(r6)
            com.google.android.gms.internal.ads.Aka r6 = (com.google.android.gms.internal.ads.Aka) r6
            r5.a(r4, r6)
            int r2 = r2 + 1
            goto L_0x01aa
        L_0x01ca:
            int r3 = com.google.android.gms.internal.ads.C2379pka.K
            if (r2 != r3) goto L_0x06da
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r3 = r0.f6896d
            byte[] r5 = r0.m
            java.util.List<com.google.android.gms.internal.ads.ska> r7 = r1.Sa
            int r7 = r7.size()
            r8 = 0
        L_0x01db:
            if (r8 >= r7) goto L_0x06ac
            java.util.List<com.google.android.gms.internal.ads.ska> r9 = r1.Sa
            java.lang.Object r9 = r9.get(r8)
            com.google.android.gms.internal.ads.ska r9 = (com.google.android.gms.internal.ads.C2591ska) r9
            int r10 = r9.Pa
            int r11 = com.google.android.gms.internal.ads.C2379pka.L
            if (r10 != r11) goto L_0x068b
            int r10 = com.google.android.gms.internal.ads.C2379pka.x
            com.google.android.gms.internal.ads.rka r10 = r9.d(r10)
            com.google.android.gms.internal.ads.Nma r10 = r10.Qa
            r11 = 8
            r10.c(r11)
            int r11 = r10.d()
            int r11 = com.google.android.gms.internal.ads.C2379pka.b(r11)
            int r12 = r10.d()
            r13 = r3 & 16
            if (r13 != 0) goto L_0x0209
            goto L_0x020a
        L_0x0209:
            r12 = 0
        L_0x020a:
            java.lang.Object r12 = r2.get(r12)
            com.google.android.gms.internal.ads.Gka r12 = (com.google.android.gms.internal.ads.Gka) r12
            if (r12 != 0) goto L_0x0213
            goto L_0x025d
        L_0x0213:
            r13 = r11 & 1
            if (r13 == 0) goto L_0x0221
            long r13 = r10.p()
            com.google.android.gms.internal.ads.Oka r15 = r12.f7077a
            r15.f8136c = r13
            r15.f8137d = r13
        L_0x0221:
            com.google.android.gms.internal.ads.Aka r13 = r12.f7080d
            r14 = r11 & 2
            if (r14 == 0) goto L_0x022e
            int r14 = r10.o()
            r15 = 1
            int r14 = r14 - r15
            goto L_0x0230
        L_0x022e:
            int r14 = r13.f6176a
        L_0x0230:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x0239
            int r15 = r10.o()
            goto L_0x023b
        L_0x0239:
            int r15 = r13.f6177b
        L_0x023b:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x0246
            int r16 = r10.o()
            r4 = r16
            goto L_0x0248
        L_0x0246:
            int r4 = r13.f6178c
        L_0x0248:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x0251
            int r10 = r10.o()
            goto L_0x0253
        L_0x0251:
            int r10 = r13.f6179d
        L_0x0253:
            com.google.android.gms.internal.ads.Oka r11 = r12.f7077a
            com.google.android.gms.internal.ads.Aka r13 = new com.google.android.gms.internal.ads.Aka
            r13.<init>(r14, r15, r4, r10)
            r11.f8134a = r13
            r4 = r12
        L_0x025d:
            if (r4 == 0) goto L_0x068b
            com.google.android.gms.internal.ads.Oka r10 = r4.f7077a
            long r11 = r10.s
            r4.a()
            int r13 = com.google.android.gms.internal.ads.C2379pka.w
            com.google.android.gms.internal.ads.rka r13 = r9.d(r13)
            if (r13 == 0) goto L_0x0293
            r13 = r3 & 2
            if (r13 != 0) goto L_0x0293
            int r11 = com.google.android.gms.internal.ads.C2379pka.w
            com.google.android.gms.internal.ads.rka r11 = r9.d(r11)
            com.google.android.gms.internal.ads.Nma r11 = r11.Qa
            r12 = 8
            r11.c(r12)
            int r12 = r11.d()
            int r12 = com.google.android.gms.internal.ads.C2379pka.a(r12)
            r13 = 1
            if (r12 != r13) goto L_0x028f
            long r11 = r11.p()
            goto L_0x0293
        L_0x028f:
            long r11 = r11.l()
        L_0x0293:
            java.util.List<com.google.android.gms.internal.ads.rka> r13 = r9.Ra
            int r14 = r13.size()
            r20 = r2
            r2 = 0
            r6 = 0
            r15 = 0
        L_0x029e:
            if (r15 >= r14) goto L_0x02cc
            java.lang.Object r21 = r13.get(r15)
            r22 = r7
            r7 = r21
            com.google.android.gms.internal.ads.rka r7 = (com.google.android.gms.internal.ads.C2520rka) r7
            r23 = r11
            int r11 = r7.Pa
            int r12 = com.google.android.gms.internal.ads.C2379pka.z
            if (r11 != r12) goto L_0x02c3
            com.google.android.gms.internal.ads.Nma r7 = r7.Qa
            r11 = 12
            r7.c(r11)
            int r7 = r7.o()
            if (r7 <= 0) goto L_0x02c5
            int r2 = r2 + r7
            int r6 = r6 + 1
            goto L_0x02c5
        L_0x02c3:
            r11 = 12
        L_0x02c5:
            int r15 = r15 + 1
            r7 = r22
            r11 = r23
            goto L_0x029e
        L_0x02cc:
            r22 = r7
            r23 = r11
            r7 = 0
            r11 = 12
            r4.f7083g = r7
            r4.f7082f = r7
            r4.f7081e = r7
            com.google.android.gms.internal.ads.Oka r7 = r4.f7077a
            r7.f8138e = r6
            r7.f8139f = r2
            int[] r12 = r7.f8141h
            if (r12 == 0) goto L_0x02e6
            int r12 = r12.length
            if (r12 >= r6) goto L_0x02ee
        L_0x02e6:
            long[] r12 = new long[r6]
            r7.f8140g = r12
            int[] r6 = new int[r6]
            r7.f8141h = r6
        L_0x02ee:
            int[] r6 = r7.i
            if (r6 == 0) goto L_0x02f5
            int r6 = r6.length
            if (r6 >= r2) goto L_0x030d
        L_0x02f5:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r6 = new int[r2]
            r7.i = r6
            int[] r6 = new int[r2]
            r7.j = r6
            long[] r6 = new long[r2]
            r7.k = r6
            boolean[] r6 = new boolean[r2]
            r7.l = r6
            boolean[] r2 = new boolean[r2]
            r7.n = r2
        L_0x030d:
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x0310:
            r25 = 0
            if (r2 >= r14) goto L_0x04ab
            java.lang.Object r18 = r13.get(r2)
            r11 = r18
            com.google.android.gms.internal.ads.rka r11 = (com.google.android.gms.internal.ads.C2520rka) r11
            int r15 = r11.Pa
            int r12 = com.google.android.gms.internal.ads.C2379pka.z
            if (r15 != r12) goto L_0x047c
            int r12 = r6 + 1
            com.google.android.gms.internal.ads.Nma r11 = r11.Qa
            r15 = 8
            r11.c(r15)
            int r15 = r11.d()
            int r15 = com.google.android.gms.internal.ads.C2379pka.b(r15)
            r28 = r12
            com.google.android.gms.internal.ads.Mka r12 = r4.f7079c
            r29 = r13
            com.google.android.gms.internal.ads.Oka r13 = r4.f7077a
            r30 = r14
            com.google.android.gms.internal.ads.Aka r14 = r13.f8134a
            int[] r0 = r13.f8141h
            int r31 = r11.o()
            r0[r6] = r31
            long[] r0 = r13.f8140g
            r32 = r4
            r31 = r5
            long r4 = r13.f8136c
            r0[r6] = r4
            r4 = r15 & 1
            if (r4 == 0) goto L_0x0366
            r4 = r0[r6]
            r33 = r1
            int r1 = r11.d()
            r34 = r8
            r35 = r9
            long r8 = (long) r1
            long r4 = r4 + r8
            r0[r6] = r4
            goto L_0x036c
        L_0x0366:
            r33 = r1
            r34 = r8
            r35 = r9
        L_0x036c:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0372
            r0 = 1
            goto L_0x0373
        L_0x0372:
            r0 = 0
        L_0x0373:
            int r1 = r14.f6179d
            if (r0 == 0) goto L_0x037b
            int r1 = r11.o()
        L_0x037b:
            r4 = r15 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0381
            r4 = 1
            goto L_0x0382
        L_0x0381:
            r4 = 0
        L_0x0382:
            r5 = r15 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0388
            r5 = 1
            goto L_0x0389
        L_0x0388:
            r5 = 0
        L_0x0389:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x038f
            r8 = 1
            goto L_0x0390
        L_0x038f:
            r8 = 0
        L_0x0390:
            r9 = r15 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0396
            r9 = 1
            goto L_0x0397
        L_0x0396:
            r9 = 0
        L_0x0397:
            long[] r15 = r12.i
            if (r15 == 0) goto L_0x03ba
            r36 = r1
            int r1 = r15.length
            r37 = r10
            r10 = 1
            if (r1 != r10) goto L_0x03be
            r1 = 0
            r38 = r15[r1]
            int r10 = (r38 > r25 ? 1 : (r38 == r25 ? 0 : -1))
            if (r10 != 0) goto L_0x03be
            long[] r10 = r12.j
            r38 = r10[r1]
            r40 = 1000(0x3e8, double:4.94E-321)
            r10 = r2
            long r1 = r12.f7887c
            r42 = r1
            long r25 = com.google.android.gms.internal.ads.Tma.a((long) r38, (long) r40, (long) r42)
            goto L_0x03bf
        L_0x03ba:
            r36 = r1
            r37 = r10
        L_0x03be:
            r10 = r2
        L_0x03bf:
            int[] r1 = r13.i
            int[] r2 = r13.j
            long[] r15 = r13.k
            r38 = r10
            boolean[] r10 = r13.l
            r39 = r10
            int r10 = r12.f7886b
            r40 = r1
            r1 = 2
            if (r10 != r1) goto L_0x03d8
            r1 = r3 & 1
            if (r1 == 0) goto L_0x03d8
            r1 = 1
            goto L_0x03d9
        L_0x03d8:
            r1 = 0
        L_0x03d9:
            int[] r10 = r13.f8141h
            r10 = r10[r6]
            int r10 = r10 + r7
            r47 = r1
            r27 = r2
            long r1 = r12.f7887c
            if (r6 <= 0) goto L_0x03ea
            r12 = r7
            long r6 = r13.s
            goto L_0x03ed
        L_0x03ea:
            r12 = r7
            r6 = r23
        L_0x03ed:
            if (r12 >= r10) goto L_0x0474
            if (r4 == 0) goto L_0x03fa
            int r41 = r11.o()
            r48 = r3
            r3 = r41
            goto L_0x03fe
        L_0x03fa:
            r48 = r3
            int r3 = r14.f6177b
        L_0x03fe:
            if (r5 == 0) goto L_0x0409
            int r41 = r11.o()
            r49 = r4
            r4 = r41
            goto L_0x040d
        L_0x0409:
            r49 = r4
            int r4 = r14.f6178c
        L_0x040d:
            if (r12 != 0) goto L_0x0416
            if (r0 == 0) goto L_0x0416
            r50 = r0
            r0 = r36
            goto L_0x0425
        L_0x0416:
            if (r8 == 0) goto L_0x0421
            int r41 = r11.d()
            r50 = r0
            r0 = r41
            goto L_0x0425
        L_0x0421:
            r50 = r0
            int r0 = r14.f6179d
        L_0x0425:
            if (r9 == 0) goto L_0x0439
            r51 = r5
            int r5 = r11.d()
            int r5 = r5 * 1000
            r52 = r8
            r53 = r9
            long r8 = (long) r5
            long r8 = r8 / r1
            int r5 = (int) r8
            r27[r12] = r5
            goto L_0x0442
        L_0x0439:
            r51 = r5
            r52 = r8
            r53 = r9
            r5 = 0
            r27[r12] = r5
        L_0x0442:
            r43 = 1000(0x3e8, double:4.94E-321)
            r41 = r6
            r45 = r1
            long r8 = com.google.android.gms.internal.ads.Tma.a((long) r41, (long) r43, (long) r45)
            long r8 = r8 - r25
            r15[r12] = r8
            r40[r12] = r4
            r4 = 16
            int r0 = r0 >> r4
            r4 = 1
            r0 = r0 & r4
            if (r0 != 0) goto L_0x045f
            if (r47 == 0) goto L_0x045d
            if (r12 != 0) goto L_0x045f
        L_0x045d:
            r0 = 1
            goto L_0x0460
        L_0x045f:
            r0 = 0
        L_0x0460:
            r39[r12] = r0
            long r3 = (long) r3
            long r6 = r6 + r3
            int r12 = r12 + 1
            r3 = r48
            r4 = r49
            r0 = r50
            r5 = r51
            r8 = r52
            r9 = r53
            goto L_0x03ed
        L_0x0474:
            r48 = r3
            r13.s = r6
            r7 = r10
            r6 = r28
            goto L_0x0491
        L_0x047c:
            r33 = r1
            r38 = r2
            r48 = r3
            r32 = r4
            r31 = r5
            r12 = r7
            r34 = r8
            r35 = r9
            r37 = r10
            r29 = r13
            r30 = r14
        L_0x0491:
            int r2 = r38 + 1
            r11 = 12
            r0 = r54
            r13 = r29
            r14 = r30
            r5 = r31
            r4 = r32
            r1 = r33
            r8 = r34
            r9 = r35
            r10 = r37
            r3 = r48
            goto L_0x0310
        L_0x04ab:
            r33 = r1
            r48 = r3
            r32 = r4
            r31 = r5
            r34 = r8
            r35 = r9
            r37 = r10
            int r0 = com.google.android.gms.internal.ads.C2379pka.ca
            com.google.android.gms.internal.ads.rka r0 = r9.d(r0)
            if (r0 == 0) goto L_0x053e
            r4 = r32
            com.google.android.gms.internal.ads.Mka r1 = r4.f7079c
            com.google.android.gms.internal.ads.Pka[] r1 = r1.f7892h
            r2 = r37
            com.google.android.gms.internal.ads.Aka r3 = r2.f8134a
            int r3 = r3.f6176a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.Nma r0 = r0.Qa
            int r1 = r1.f8245b
            r3 = 8
            r0.c(r3)
            int r4 = r0.d()
            int r4 = com.google.android.gms.internal.ads.C2379pka.b(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04e7
            r0.d(r3)
        L_0x04e7:
            int r3 = r0.g()
            int r4 = r0.o()
            int r5 = r2.f8139f
            if (r4 != r5) goto L_0x051d
            if (r3 != 0) goto L_0x050a
            boolean[] r3 = r2.n
            r5 = 0
            r6 = 0
        L_0x04f9:
            if (r5 >= r4) goto L_0x0519
            int r7 = r0.g()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0504
            r7 = 1
            goto L_0x0505
        L_0x0504:
            r7 = 0
        L_0x0505:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x04f9
        L_0x050a:
            if (r3 <= r1) goto L_0x050e
            r0 = 1
            goto L_0x050f
        L_0x050e:
            r0 = 0
        L_0x050f:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.n
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x0519:
            r2.a(r6)
            goto L_0x0540
        L_0x051d:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Length mismatch: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = ", "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x053e:
            r2 = r37
        L_0x0540:
            int r0 = com.google.android.gms.internal.ads.C2379pka.da
            com.google.android.gms.internal.ads.rka r0 = r9.d(r0)
            if (r0 == 0) goto L_0x0592
            com.google.android.gms.internal.ads.Nma r0 = r0.Qa
            r1 = 8
            r0.c(r1)
            int r3 = r0.d()
            int r4 = com.google.android.gms.internal.ads.C2379pka.b(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x055e
            r0.d(r1)
        L_0x055e:
            int r1 = r0.o()
            if (r1 != r5) goto L_0x0579
            int r1 = com.google.android.gms.internal.ads.C2379pka.a(r3)
            long r3 = r2.f8137d
            if (r1 != 0) goto L_0x0571
            long r0 = r0.l()
            goto L_0x0575
        L_0x0571:
            long r0 = r0.p()
        L_0x0575:
            long r3 = r3 + r0
            r2.f8137d = r3
            goto L_0x0592
        L_0x0579:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            r2 = 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0592:
            int r0 = com.google.android.gms.internal.ads.C2379pka.ha
            com.google.android.gms.internal.ads.rka r0 = r9.d(r0)
            if (r0 == 0) goto L_0x05a0
            com.google.android.gms.internal.ads.Nma r0 = r0.Qa
            r1 = 0
            a(r0, r1, r2)
        L_0x05a0:
            int r0 = com.google.android.gms.internal.ads.C2379pka.ea
            com.google.android.gms.internal.ads.rka r0 = r9.d(r0)
            int r1 = com.google.android.gms.internal.ads.C2379pka.fa
            com.google.android.gms.internal.ads.rka r1 = r9.d(r1)
            if (r0 == 0) goto L_0x0645
            if (r1 == 0) goto L_0x0645
            com.google.android.gms.internal.ads.Nma r0 = r0.Qa
            com.google.android.gms.internal.ads.Nma r1 = r1.Qa
            r3 = 8
            r0.c(r3)
            int r3 = r0.d()
            int r4 = r0.d()
            int r5 = f6894b
            if (r4 != r5) goto L_0x0645
            int r3 = com.google.android.gms.internal.ads.C2379pka.a(r3)
            r4 = 1
            if (r3 != r4) goto L_0x05d0
            r3 = 4
            r0.d(r3)
        L_0x05d0:
            int r0 = r0.d()
            if (r0 != r4) goto L_0x063d
            r0 = 8
            r1.c(r0)
            int r0 = r1.d()
            int r3 = r1.d()
            int r5 = f6894b
            if (r3 != r5) goto L_0x063b
            int r0 = com.google.android.gms.internal.ads.C2379pka.a(r0)
            if (r0 != r4) goto L_0x0600
            long r3 = r1.l()
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x05f8
            r0 = 4
            r3 = 2
            goto L_0x0609
        L_0x05f8:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x0600:
            r3 = 2
            if (r0 < r3) goto L_0x0608
            r0 = 4
            r1.d(r0)
            goto L_0x0609
        L_0x0608:
            r0 = 4
        L_0x0609:
            long r4 = r1.l()
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0633
            r1.d(r3)
            int r3 = r1.g()
            r4 = 1
            if (r3 != r4) goto L_0x0647
            int r3 = r1.g()
            r5 = 16
            byte[] r6 = new byte[r5]
            r7 = 0
            r1.a(r6, r7, r5)
            r2.m = r4
            com.google.android.gms.internal.ads.Pka r1 = new com.google.android.gms.internal.ads.Pka
            r1.<init>(r4, r3, r6)
            r2.o = r1
            goto L_0x0647
        L_0x0633:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x063b:
            r0 = 4
            goto L_0x0647
        L_0x063d:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0645:
            r0 = 4
            r4 = 1
        L_0x0647:
            java.util.List<com.google.android.gms.internal.ads.rka> r1 = r9.Ra
            int r1 = r1.size()
            r3 = 0
        L_0x064e:
            if (r3 >= r1) goto L_0x0685
            java.util.List<com.google.android.gms.internal.ads.rka> r5 = r9.Ra
            java.lang.Object r5 = r5.get(r3)
            com.google.android.gms.internal.ads.rka r5 = (com.google.android.gms.internal.ads.C2520rka) r5
            int r6 = r5.Pa
            int r7 = com.google.android.gms.internal.ads.C2379pka.ga
            if (r6 != r7) goto L_0x0679
            com.google.android.gms.internal.ads.Nma r5 = r5.Qa
            r6 = 8
            r5.c(r6)
            r7 = r31
            r8 = 16
            r10 = 0
            r5.a(r7, r10, r8)
            byte[] r11 = f6895c
            boolean r11 = java.util.Arrays.equals(r7, r11)
            if (r11 == 0) goto L_0x0680
            a(r5, r8, r2)
            goto L_0x0680
        L_0x0679:
            r7 = r31
            r6 = 8
            r8 = 16
            r10 = 0
        L_0x0680:
            int r3 = r3 + 1
            r31 = r7
            goto L_0x064e
        L_0x0685:
            r7 = r31
            r6 = 8
            r10 = 0
            goto L_0x069b
        L_0x068b:
            r33 = r1
            r20 = r2
            r48 = r3
            r22 = r7
            r34 = r8
            r0 = 4
            r4 = 1
            r6 = 8
            r10 = 0
            r7 = r5
        L_0x069b:
            int r8 = r34 + 1
            r0 = r54
            r5 = r7
            r2 = r20
            r7 = r22
            r1 = r33
            r3 = r48
            r4 = 0
            r6 = 4
            goto L_0x01db
        L_0x06ac:
            r10 = 0
            java.util.List<com.google.android.gms.internal.ads.rka> r0 = r1.Ra
            com.google.android.gms.internal.ads.Lja r0 = a((java.util.List<com.google.android.gms.internal.ads.C2520rka>) r0)
            if (r0 == 0) goto L_0x06d7
            r2 = r54
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r1 = r2.f6898f
            int r1 = r1.size()
        L_0x06bd:
            if (r10 >= r1) goto L_0x06ee
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r3 = r2.f6898f
            java.lang.Object r3 = r3.valueAt(r10)
            com.google.android.gms.internal.ads.Gka r3 = (com.google.android.gms.internal.ads.Gka) r3
            com.google.android.gms.internal.ads.eka r4 = r3.f7078b
            com.google.android.gms.internal.ads.Mka r3 = r3.f7079c
            com.google.android.gms.internal.ads.Lia r3 = r3.f7890f
            com.google.android.gms.internal.ads.Lia r3 = r3.a((com.google.android.gms.internal.ads.Lja) r0)
            r4.a(r3)
            int r10 = r10 + 1
            goto L_0x06bd
        L_0x06d7:
            r2 = r54
            goto L_0x06ee
        L_0x06da:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.ska> r0 = r2.n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06ee
            java.util.Stack<com.google.android.gms.internal.ads.ska> r0 = r2.n
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.ska r0 = (com.google.android.gms.internal.ads.C2591ska) r0
            r0.a((com.google.android.gms.internal.ads.C2591ska) r1)
        L_0x06ee:
            r0 = r2
            goto L_0x0002
        L_0x06f1:
            r2 = r0
            r54.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fka.a(long):void");
    }

    private static void a(Nma nma, int i2, Oka oka) {
        nma.c(i2 + 8);
        int b2 = C2379pka.b(nma.d());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int o2 = nma.o();
            int i3 = oka.f8139f;
            if (o2 == i3) {
                Arrays.fill(oka.n, 0, o2, z2);
                oka.a(nma.j());
                nma.a(oka.q.f8013a, 0, oka.p);
                oka.q.c(0);
                oka.r = false;
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(o2);
            sb.append(", ");
            sb.append(i3);
            throw new Sia(sb.toString());
        }
        throw new Sia("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void b() {
        this.p = 0;
        this.s = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:253:0x026a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05b2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.Wja r26, com.google.android.gms.internal.ads._ja r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
        L_0x0004:
            int r2 = r0.p
            r3 = 2
            r5 = 8
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0428
            if (r2 == r6) goto L_0x02c4
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x026b
            if (r2 != r11) goto L_0x00fe
            com.google.android.gms.internal.ads.Gka r2 = r0.y
            if (r2 != 0) goto L_0x0081
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r12 = r2.size()
            r13 = r9
            r9 = 0
            r10 = 0
        L_0x0026:
            if (r9 >= r12) goto L_0x0045
            java.lang.Object r15 = r2.valueAt(r9)
            com.google.android.gms.internal.ads.Gka r15 = (com.google.android.gms.internal.ads.Gka) r15
            int r11 = r15.f7083g
            com.google.android.gms.internal.ads.Oka r4 = r15.f7077a
            int r8 = r4.f8138e
            if (r11 == r8) goto L_0x0041
            long[] r4 = r4.f8140g
            r17 = r4[r11]
            int r4 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0041
            r10 = r15
            r13 = r17
        L_0x0041:
            int r9 = r9 + 1
            r11 = 3
            goto L_0x0026
        L_0x0045:
            if (r10 != 0) goto L_0x0064
            long r2 = r0.u
            long r4 = r26.getPosition()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005c
            r1.c(r3)
            r25.b()
            r3 = 0
            r17 = 0
            goto L_0x0268
        L_0x005c:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0064:
            com.google.android.gms.internal.ads.Oka r2 = r10.f7077a
            long[] r2 = r2.f8140g
            int r4 = r10.f7083g
            r8 = r2[r4]
            long r11 = r26.getPosition()
            long r8 = r8 - r11
            int r2 = (int) r8
            if (r2 >= 0) goto L_0x007c
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r4 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r4)
            r2 = 0
        L_0x007c:
            r1.c(r2)
            r0.y = r10
        L_0x0081:
            com.google.android.gms.internal.ads.Gka r2 = r0.y
            com.google.android.gms.internal.ads.Oka r4 = r2.f7077a
            int[] r8 = r4.i
            int r9 = r2.f7081e
            r8 = r8[r9]
            r0.z = r8
            boolean r8 = r4.m
            if (r8 == 0) goto L_0x00e7
            com.google.android.gms.internal.ads.Nma r8 = r4.q
            com.google.android.gms.internal.ads.Aka r9 = r4.f8134a
            int r9 = r9.f6176a
            com.google.android.gms.internal.ads.Pka r10 = r4.o
            if (r10 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            com.google.android.gms.internal.ads.Mka r10 = r2.f7079c
            com.google.android.gms.internal.ads.Pka[] r10 = r10.f7892h
            r10 = r10[r9]
        L_0x00a2:
            int r9 = r10.f8245b
            boolean[] r4 = r4.n
            int r10 = r2.f7081e
            boolean r4 = r4[r10]
            com.google.android.gms.internal.ads.Nma r10 = r0.j
            byte[] r10 = r10.f8013a
            if (r4 == 0) goto L_0x00b3
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00b4
        L_0x00b3:
            r11 = 0
        L_0x00b4:
            r11 = r11 | r9
            byte r11 = (byte) r11
            r10[r7] = r11
            com.google.android.gms.internal.ads.Nma r10 = r0.j
            r10.c(r7)
            com.google.android.gms.internal.ads.eka r2 = r2.f7078b
            com.google.android.gms.internal.ads.Nma r10 = r0.j
            r2.a(r10, r6)
            r2.a(r8, r9)
            if (r4 != 0) goto L_0x00cc
            int r9 = r9 + 1
            goto L_0x00dd
        L_0x00cc:
            int r4 = r8.h()
            r10 = -2
            r8.d(r10)
            int r4 = r4 * 6
            int r4 = r4 + r3
            r2.a(r8, r4)
            int r9 = r9 + 1
            int r9 = r9 + r4
        L_0x00dd:
            r0.A = r9
            int r2 = r0.z
            int r4 = r0.A
            int r2 = r2 + r4
            r0.z = r2
            goto L_0x00e9
        L_0x00e7:
            r0.A = r7
        L_0x00e9:
            com.google.android.gms.internal.ads.Gka r2 = r0.y
            com.google.android.gms.internal.ads.Mka r2 = r2.f7079c
            int r2 = r2.f7891g
            if (r2 != r6) goto L_0x00f9
            int r2 = r0.z
            int r2 = r2 - r5
            r0.z = r2
            r1.c(r5)
        L_0x00f9:
            r2 = 4
            r0.p = r2
            r0.B = r7
        L_0x00fe:
            com.google.android.gms.internal.ads.Gka r2 = r0.y
            com.google.android.gms.internal.ads.Oka r4 = r2.f7077a
            com.google.android.gms.internal.ads.Mka r5 = r2.f7079c
            com.google.android.gms.internal.ads.eka r8 = r2.f7078b
            int r2 = r2.f7081e
            int r9 = r5.k
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.Nma r12 = r0.f6900h
            byte[] r12 = r12.f8013a
            r12[r7] = r7
            r12[r6] = r7
            r12[r3] = r7
            int r3 = r9 + 1
            r13 = 4
            int r9 = 4 - r9
        L_0x011d:
            int r13 = r0.A
            int r14 = r0.z
            if (r13 >= r14) goto L_0x01d7
            int r13 = r0.B
            if (r13 != 0) goto L_0x0169
            r1.readFully(r12, r9, r3)
            com.google.android.gms.internal.ads.Nma r13 = r0.f6900h
            r13.c(r7)
            com.google.android.gms.internal.ads.Nma r13 = r0.f6900h
            int r13 = r13.o()
            int r13 = r13 - r6
            r0.B = r13
            com.google.android.gms.internal.ads.Nma r13 = r0.f6899g
            r13.c(r7)
            com.google.android.gms.internal.ads.Nma r13 = r0.f6899g
            r14 = 4
            r8.a(r13, r14)
            com.google.android.gms.internal.ads.Nma r13 = r0.f6900h
            r8.a(r13, r6)
            com.google.android.gms.internal.ads.eka[] r13 = r0.F
            if (r13 == 0) goto L_0x015a
            com.google.android.gms.internal.ads.Lia r13 = r5.f7890f
            java.lang.String r13 = r13.f7712f
            byte r15 = r12[r14]
            boolean r13 = com.google.android.gms.internal.ads.Ima.a((java.lang.String) r13, (byte) r15)
            if (r13 == 0) goto L_0x015a
            r13 = 1
            goto L_0x015b
        L_0x015a:
            r13 = 0
        L_0x015b:
            r0.C = r13
            int r13 = r0.A
            int r13 = r13 + 5
            r0.A = r13
            int r13 = r0.z
            int r13 = r13 + r9
            r0.z = r13
            goto L_0x011d
        L_0x0169:
            boolean r14 = r0.C
            if (r14 == 0) goto L_0x01b2
            com.google.android.gms.internal.ads.Nma r14 = r0.i
            r14.a(r13)
            com.google.android.gms.internal.ads.Nma r13 = r0.i
            byte[] r13 = r13.f8013a
            int r14 = r0.B
            r1.readFully(r13, r7, r14)
            com.google.android.gms.internal.ads.Nma r13 = r0.i
            int r14 = r0.B
            r8.a(r13, r14)
            int r13 = r0.B
            com.google.android.gms.internal.ads.Nma r14 = r0.i
            byte[] r15 = r14.f8013a
            int r14 = r14.c()
            int r14 = com.google.android.gms.internal.ads.Ima.a((byte[]) r15, (int) r14)
            com.google.android.gms.internal.ads.Nma r15 = r0.i
            com.google.android.gms.internal.ads.Lia r6 = r5.f7890f
            java.lang.String r6 = r6.f7712f
            java.lang.String r7 = "video/hevc"
            boolean r6 = r7.equals(r6)
            r15.c(r6)
            com.google.android.gms.internal.ads.Nma r6 = r0.i
            r6.b(r14)
            long r6 = r4.b(r2)
            long r6 = r6 * r10
            com.google.android.gms.internal.ads.Nma r14 = r0.i
            com.google.android.gms.internal.ads.eka[] r15 = r0.F
            com.google.android.gms.internal.ads.Rla.a(r6, r14, r15)
            goto L_0x01b7
        L_0x01b2:
            r6 = 0
            int r13 = r8.a(r1, r13, r6)
        L_0x01b7:
            int r6 = r0.A
            int r6 = r6 + r13
            r0.A = r6
            int r6 = r0.B
            int r6 = r6 - r13
            r0.B = r6
            r6 = 1
            r7 = 0
            goto L_0x011d
        L_0x01c5:
            int r3 = r0.A
            int r6 = r0.z
            if (r3 >= r6) goto L_0x01d7
            int r6 = r6 - r3
            r3 = 0
            int r6 = r8.a(r1, r6, r3)
            int r3 = r0.A
            int r3 = r3 + r6
            r0.A = r3
            goto L_0x01c5
        L_0x01d7:
            long r6 = r4.b(r2)
            long r6 = r6 * r10
            boolean r3 = r4.m
            if (r3 == 0) goto L_0x01e4
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e5
        L_0x01e4:
            r3 = 0
        L_0x01e5:
            boolean[] r9 = r4.l
            boolean r2 = r9[r2]
            r11 = r3 | r2
            boolean r2 = r4.m
            if (r2 == 0) goto L_0x020f
            com.google.android.gms.internal.ads.Pka r2 = r4.o
            if (r2 == 0) goto L_0x01f4
            goto L_0x01fc
        L_0x01f4:
            com.google.android.gms.internal.ads.Pka[] r2 = r5.f7892h
            com.google.android.gms.internal.ads.Aka r3 = r4.f8134a
            int r3 = r3.f6176a
            r2 = r2[r3]
        L_0x01fc:
            com.google.android.gms.internal.ads.Gka r3 = r0.y
            com.google.android.gms.internal.ads.Pka r5 = r3.i
            if (r2 == r5) goto L_0x020b
            com.google.android.gms.internal.ads.dka r3 = new com.google.android.gms.internal.ads.dka
            byte[] r5 = r2.f8246c
            r9 = 1
            r3.<init>(r9, r5)
            goto L_0x020d
        L_0x020b:
            com.google.android.gms.internal.ads.dka r3 = r3.f7084h
        L_0x020d:
            r14 = r3
            goto L_0x0211
        L_0x020f:
            r2 = 0
            r14 = 0
        L_0x0211:
            com.google.android.gms.internal.ads.Gka r3 = r0.y
            r3.f7084h = r14
            r3.i = r2
            int r12 = r0.z
            r13 = 0
            r9 = r6
        L_0x021b:
            r8.a(r9, r11, r12, r13, r14)
            java.util.LinkedList<com.google.android.gms.internal.ads.Hka> r2 = r0.o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0240
            java.util.LinkedList<com.google.android.gms.internal.ads.Hka> r2 = r0.o
            java.lang.Object r2 = r2.removeFirst()
            com.google.android.gms.internal.ads.Hka r2 = (com.google.android.gms.internal.ads.Hka) r2
            int r3 = r0.v
            int r12 = r2.f7195b
            int r3 = r3 - r12
            r0.v = r3
            com.google.android.gms.internal.ads.eka r8 = r0.E
            long r2 = r2.f7194a
            long r9 = r6 + r2
            r11 = 1
            int r13 = r0.v
            r14 = 0
            goto L_0x021b
        L_0x0240:
            com.google.android.gms.internal.ads.Gka r2 = r0.y
            int r3 = r2.f7081e
            r5 = 1
            int r3 = r3 + r5
            r2.f7081e = r3
            int r3 = r2.f7082f
            int r3 = r3 + r5
            r2.f7082f = r3
            int r3 = r2.f7082f
            int[] r4 = r4.f8141h
            int r5 = r2.f7083g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x0262
            int r5 = r5 + 1
            r2.f7083g = r5
            r3 = 0
            r2.f7082f = r3
            r2 = 0
            r0.y = r2
            goto L_0x0263
        L_0x0262:
            r3 = 0
        L_0x0263:
            r2 = 3
            r0.p = r2
            r17 = 1
        L_0x0268:
            if (r17 == 0) goto L_0x0004
            return r3
        L_0x026b:
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r2 = r0.f6898f
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x0273:
            if (r3 >= r2) goto L_0x0295
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r5 = r0.f6898f
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.Gka r5 = (com.google.android.gms.internal.ads.Gka) r5
            com.google.android.gms.internal.ads.Oka r5 = r5.f7077a
            boolean r6 = r5.r
            if (r6 == 0) goto L_0x0292
            long r5 = r5.f8137d
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0292
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r4 = r0.f6898f
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.Gka r4 = (com.google.android.gms.internal.ads.Gka) r4
            r9 = r5
        L_0x0292:
            int r3 = r3 + 1
            goto L_0x0273
        L_0x0295:
            if (r4 != 0) goto L_0x029c
            r2 = 3
            r0.p = r2
            goto L_0x0004
        L_0x029c:
            long r2 = r26.getPosition()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 < 0) goto L_0x02bc
            r1.c(r2)
            com.google.android.gms.internal.ads.Oka r2 = r4.f7077a
            com.google.android.gms.internal.ads.Nma r3 = r2.q
            byte[] r3 = r3.f8013a
            int r4 = r2.p
            r5 = 0
            r1.readFully(r3, r5, r4)
            com.google.android.gms.internal.ads.Nma r3 = r2.q
            r3.c(r5)
            r2.r = r5
            goto L_0x0004
        L_0x02bc:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x02c4:
            long r6 = r0.r
            int r2 = (int) r6
            int r4 = r0.s
            int r2 = r2 - r4
            com.google.android.gms.internal.ads.Nma r4 = r0.t
            if (r4 == 0) goto L_0x0418
            byte[] r4 = r4.f8013a
            r1.readFully(r4, r5, r2)
            com.google.android.gms.internal.ads.rka r2 = new com.google.android.gms.internal.ads.rka
            int r4 = r0.q
            com.google.android.gms.internal.ads.Nma r6 = r0.t
            r2.<init>(r4, r6)
            long r6 = r26.getPosition()
            java.util.Stack<com.google.android.gms.internal.ads.ska> r4 = r0.n
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02f7
            java.util.Stack<com.google.android.gms.internal.ads.ska> r3 = r0.n
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.ska r3 = (com.google.android.gms.internal.ads.C2591ska) r3
            r3.a((com.google.android.gms.internal.ads.C2520rka) r2)
            r6 = r0
            r0 = r1
            goto L_0x041d
        L_0x02f7:
            int r4 = r2.Pa
            int r8 = com.google.android.gms.internal.ads.C2379pka.A
            if (r4 != r8) goto L_0x03bf
            com.google.android.gms.internal.ads.Nma r2 = r2.Qa
            r2.c(r5)
            int r4 = r2.d()
            int r4 = com.google.android.gms.internal.ads.C2379pka.a(r4)
            r5 = 4
            r2.d(r5)
            long r14 = r2.l()
            if (r4 != 0) goto L_0x031d
            long r4 = r2.l()
            long r8 = r2.l()
            goto L_0x0325
        L_0x031d:
            long r4 = r2.p()
            long r8 = r2.p()
        L_0x0325:
            long r6 = r6 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r4
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.Tma.a((long) r8, (long) r10, (long) r12)
            r2.d(r3)
            int r3 = r2.h()
            int[] r12 = new int[r3]
            long[] r13 = new long[r3]
            long[] r10 = new long[r3]
            long[] r11 = new long[r3]
            r21 = r4
            r8 = r19
            r4 = 0
        L_0x0343:
            if (r4 >= r3) goto L_0x0395
            int r5 = r2.d()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r5 & r16
            if (r16 != 0) goto L_0x038d
            long r23 = r2.l()
            r16 = 2147483647(0x7fffffff, float:NaN)
            r5 = r5 & r16
            r12[r4] = r5
            r13[r4] = r6
            r11[r4] = r8
            long r21 = r21 + r23
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r21
            r27 = r3
            r5 = r10
            r3 = r11
            r10 = r23
            r1 = r12
            r0 = r13
            r12 = r14
            long r8 = com.google.android.gms.internal.ads.Tma.a((long) r8, (long) r10, (long) r12)
            r10 = r3[r4]
            long r10 = r8 - r10
            r5[r4] = r10
            r10 = 4
            r2.d(r10)
            r11 = r1[r4]
            long r11 = (long) r11
            long r6 = r6 + r11
            int r4 = r4 + 1
            r13 = r0
            r12 = r1
            r11 = r3
            r10 = r5
            r0 = r25
            r1 = r26
            r3 = r27
            goto L_0x0343
        L_0x038d:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Unhandled indirect reference"
            r0.<init>(r1)
            throw r0
        L_0x0395:
            r5 = r10
            r3 = r11
            r1 = r12
            r0 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.Rja r4 = new com.google.android.gms.internal.ads.Rja
            r4.<init>(r1, r0, r5, r3)
            android.util.Pair r0 = android.util.Pair.create(r2, r4)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6 = r25
            r6.x = r1
            com.google.android.gms.internal.ads.Vja r1 = r6.D
            java.lang.Object r0 = r0.second
            com.google.android.gms.internal.ads.cka r0 = (com.google.android.gms.internal.ads.C1458cka) r0
            r1.a(r0)
            r0 = 1
            r6.G = r0
            goto L_0x0415
        L_0x03bf:
            r6 = r0
            int r0 = com.google.android.gms.internal.ads.C2379pka.Ga
            if (r4 != r0) goto L_0x0415
            com.google.android.gms.internal.ads.Nma r0 = r2.Qa
            com.google.android.gms.internal.ads.eka r1 = r6.E
            if (r1 == 0) goto L_0x0415
            r1 = 12
            r0.c(r1)
            r0.q()
            r0.q()
            long r11 = r0.l()
            long r7 = r0.l()
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = com.google.android.gms.internal.ads.Tma.a((long) r7, (long) r9, (long) r11)
            r0.c(r1)
            int r11 = r0.j()
            com.google.android.gms.internal.ads.eka r1 = r6.E
            r1.a(r0, r11)
            long r0 = r6.x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0406
            com.google.android.gms.internal.ads.eka r7 = r6.E
            long r8 = r0 + r2
            r10 = 1
            r12 = 0
            r13 = 0
            r7.a(r8, r10, r11, r12, r13)
            goto L_0x0415
        L_0x0406:
            java.util.LinkedList<com.google.android.gms.internal.ads.Hka> r0 = r6.o
            com.google.android.gms.internal.ads.Hka r1 = new com.google.android.gms.internal.ads.Hka
            r1.<init>(r2, r11)
            r0.addLast(r1)
            int r0 = r6.v
            int r0 = r0 + r11
            r6.v = r0
        L_0x0415:
            r0 = r26
            goto L_0x041d
        L_0x0418:
            r6 = r0
            r0 = r1
            r0.c(r2)
        L_0x041d:
            long r1 = r26.getPosition()
            r6.a((long) r1)
        L_0x0424:
            r1 = r0
            r0 = r6
            goto L_0x0004
        L_0x0428:
            r6 = r0
            r0 = r1
            int r1 = r6.s
            if (r1 != 0) goto L_0x0454
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            byte[] r1 = r1.f8013a
            r2 = 1
            r4 = 0
            boolean r1 = r0.a(r1, r4, r5, r2)
            if (r1 != 0) goto L_0x043d
            r1 = 0
            goto L_0x05b0
        L_0x043d:
            r6.s = r5
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            r1.c(r4)
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            long r1 = r1.l()
            r6.r = r1
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            int r1 = r1.d()
            r6.q = r1
        L_0x0454:
            long r1 = r6.r
            r7 = 1
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0470
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            byte[] r1 = r1.f8013a
            r0.readFully(r1, r5, r5)
            int r1 = r6.s
            int r1 = r1 + r5
            r6.s = r1
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            long r1 = r1.p()
            r6.r = r1
        L_0x0470:
            long r1 = r6.r
            int r4 = r6.s
            long r7 = (long) r4
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x05bc
            long r1 = r26.getPosition()
            int r4 = r6.s
            long r7 = (long) r4
            long r1 = r1 - r7
            int r4 = r6.q
            int r7 = com.google.android.gms.internal.ads.C2379pka.K
            if (r4 != r7) goto L_0x04a3
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r4 = r6.f6898f
            int r4 = r4.size()
            r7 = 0
        L_0x048e:
            if (r7 >= r4) goto L_0x04a3
            android.util.SparseArray<com.google.android.gms.internal.ads.Gka> r8 = r6.f6898f
            java.lang.Object r8 = r8.valueAt(r7)
            com.google.android.gms.internal.ads.Gka r8 = (com.google.android.gms.internal.ads.Gka) r8
            com.google.android.gms.internal.ads.Oka r8 = r8.f7077a
            r8.f8135b = r1
            r8.f8137d = r1
            r8.f8136c = r1
            int r7 = r7 + 1
            goto L_0x048e
        L_0x04a3:
            int r4 = r6.q
            int r7 = com.google.android.gms.internal.ads.C2379pka.f11751h
            if (r4 != r7) goto L_0x04c9
            r7 = 0
            r6.y = r7
            long r4 = r6.r
            long r1 = r1 + r4
            r6.u = r1
            boolean r1 = r6.G
            if (r1 != 0) goto L_0x04c4
            com.google.android.gms.internal.ads.Vja r1 = r6.D
            com.google.android.gms.internal.ads.bka r2 = new com.google.android.gms.internal.ads.bka
            long r4 = r6.w
            r2.<init>(r4)
            r1.a(r2)
            r1 = 1
            r6.G = r1
        L_0x04c4:
            r6.p = r3
        L_0x04c6:
            r1 = 1
            goto L_0x05b0
        L_0x04c9:
            int r1 = com.google.android.gms.internal.ads.C2379pka.B
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.D
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.E
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.F
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.G
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.K
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.L
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.M
            if (r4 == r1) goto L_0x04f0
            int r1 = com.google.android.gms.internal.ads.C2379pka.P
            if (r4 != r1) goto L_0x04ee
            goto L_0x04f0
        L_0x04ee:
            r1 = 0
            goto L_0x04f1
        L_0x04f0:
            r1 = 1
        L_0x04f1:
            if (r1 == 0) goto L_0x051a
            long r1 = r26.getPosition()
            long r3 = r6.r
            long r1 = r1 + r3
            r3 = 8
            long r1 = r1 - r3
            java.util.Stack<com.google.android.gms.internal.ads.ska> r3 = r6.n
            com.google.android.gms.internal.ads.ska r4 = new com.google.android.gms.internal.ads.ska
            int r5 = r6.q
            r4.<init>(r5, r1)
            r3.add(r4)
            long r3 = r6.r
            int r5 = r6.s
            long r7 = (long) r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0516
            r6.a((long) r1)
            goto L_0x04c6
        L_0x0516:
            r25.b()
            goto L_0x04c6
        L_0x051a:
            int r1 = r6.q
            int r2 = com.google.android.gms.internal.ads.C2379pka.S
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.R
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.C
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.A
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.T
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.w
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.x
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.O
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.y
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.z
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.U
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.ca
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.da
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.ha
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.ga
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.ea
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.fa
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.Q
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.N
            if (r1 == r2) goto L_0x056f
            int r2 = com.google.android.gms.internal.ads.C2379pka.Ga
            if (r1 != r2) goto L_0x056d
            goto L_0x056f
        L_0x056d:
            r1 = 0
            goto L_0x0570
        L_0x056f:
            r1 = 1
        L_0x0570:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x05a4
            int r1 = r6.s
            if (r1 != r5) goto L_0x059c
            long r7 = r6.r
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0594
            com.google.android.gms.internal.ads.Nma r1 = new com.google.android.gms.internal.ads.Nma
            int r2 = (int) r7
            r1.<init>((int) r2)
            r6.t = r1
            com.google.android.gms.internal.ads.Nma r1 = r6.l
            byte[] r1 = r1.f8013a
            com.google.android.gms.internal.ads.Nma r2 = r6.t
            byte[] r2 = r2.f8013a
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r5)
            goto L_0x05ad
        L_0x0594:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x059c:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x05a4:
            long r4 = r6.r
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x05b4
            r1 = 0
            r6.t = r1
        L_0x05ad:
            r1 = 1
            r6.p = r1
        L_0x05b0:
            if (r1 != 0) goto L_0x0424
            r0 = -1
            return r0
        L_0x05b4:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x05bc:
            com.google.android.gms.internal.ads.Sia r0 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            r0.<init>(r1)
            goto L_0x05c5
        L_0x05c4:
            throw r0
        L_0x05c5:
            goto L_0x05c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Fka.a(com.google.android.gms.internal.ads.Wja, com.google.android.gms.internal.ads._ja):int");
    }

    public final void a() {
    }

    public final void a(long j2, long j3) {
        int size = this.f6898f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6898f.valueAt(i2).a();
        }
        this.o.clear();
        this.v = 0;
        this.n.clear();
        b();
    }

    public final void a(Vja vja) {
        this.D = vja;
    }

    public final boolean a(Wja wja) {
        return Nka.a(wja);
    }
}
