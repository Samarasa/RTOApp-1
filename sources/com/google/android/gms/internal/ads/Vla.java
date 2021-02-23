package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class Vla extends C1320ama {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f9079f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private final C1603ema f9080g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<Yla> f9081h;

    public Vla() {
        this((C1603ema) null);
    }

    private Vla(C1603ema ema) {
        this.f9080g = null;
        this.f9081h = new AtomicReference<>(new Yla());
    }

    private static int a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean b(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017e, code lost:
        if (r10 <= r15) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1391bma[] a(com.google.android.gms.internal.ads.Tia[] r35, com.google.android.gms.internal.ads.Pla[] r36, int[][][] r37) {
        /*
            r34 = this;
            r0 = r35
            int r1 = r0.length
            com.google.android.gms.internal.ads.bma[] r2 = new com.google.android.gms.internal.ads.C1391bma[r1]
            r3 = r34
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.Yla> r4 = r3.f9081h
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.Yla r4 = (com.google.android.gms.internal.ads.Yla) r4
            r6 = 0
            r7 = 0
        L_0x0011:
            r8 = 2
            if (r6 >= r1) goto L_0x025b
            r12 = r0[r6]
            int r12 = r12.a()
            if (r8 != r12) goto L_0x0245
            if (r7 != 0) goto L_0x0238
            r7 = r36[r6]
            r12 = r37[r6]
            int r13 = r4.f9480e
            int r14 = r4.f9481f
            int r15 = r4.f9482g
            int r9 = r4.j
            int r8 = r4.k
            boolean r5 = r4.l
            boolean r10 = r4.f9483h
            boolean r11 = r4.i
            r23 = r1
            r19 = r4
            r0 = 0
            r3 = 0
            r4 = 0
            r20 = 0
            r21 = -1
            r22 = -1
        L_0x003f:
            int r1 = r7.f8252b
            if (r3 >= r1) goto L_0x0216
            com.google.android.gms.internal.ads.Qla r1 = r7.a((int) r3)
            r24 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r25 = r2
            int r2 = r1.f8383a
            r7.<init>(r2)
            r26 = r6
            r2 = 0
        L_0x0055:
            int r6 = r1.f8383a
            if (r2 >= r6) goto L_0x0063
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7.add(r6)
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0063:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r2) goto L_0x0138
            if (r8 != r2) goto L_0x006c
            goto L_0x0138
        L_0x006c:
            r27 = r0
            r6 = 0
        L_0x006f:
            int r0 = r1.f8383a
            if (r6 >= r0) goto L_0x0102
            com.google.android.gms.internal.ads.Lia r0 = r1.a((int) r6)
            r28 = r4
            int r4 = r0.j
            if (r4 <= 0) goto L_0x00e8
            r29 = r10
            int r10 = r0.k
            if (r10 <= 0) goto L_0x00e1
            if (r5 == 0) goto L_0x009f
            if (r4 <= r10) goto L_0x008b
            r30 = r5
            r5 = 1
            goto L_0x008e
        L_0x008b:
            r30 = r5
            r5 = 0
        L_0x008e:
            if (r9 <= r8) goto L_0x0094
            r31 = r8
            r8 = 1
            goto L_0x0097
        L_0x0094:
            r31 = r8
            r8 = 0
        L_0x0097:
            if (r5 == r8) goto L_0x00a3
            r5 = r9
            r32 = r5
            r8 = r31
            goto L_0x00a8
        L_0x009f:
            r30 = r5
            r31 = r8
        L_0x00a3:
            r8 = r9
            r32 = r8
            r5 = r31
        L_0x00a8:
            int r9 = r4 * r5
            r33 = r15
            int r15 = r10 * r8
            if (r9 < r15) goto L_0x00bb
            android.graphics.Point r5 = new android.graphics.Point
            int r4 = com.google.android.gms.internal.ads.Tma.a((int) r15, (int) r4)
            r5.<init>(r8, r4)
            r4 = r5
            goto L_0x00c4
        L_0x00bb:
            android.graphics.Point r4 = new android.graphics.Point
            int r8 = com.google.android.gms.internal.ads.Tma.a((int) r9, (int) r10)
            r4.<init>(r8, r5)
        L_0x00c4:
            int r5 = r0.j
            int r0 = r0.k
            int r8 = r5 * r0
            int r9 = r4.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r5 < r9) goto L_0x00f2
            int r4 = r4.y
            float r4 = (float) r4
            float r4 = r4 * r10
            int r4 = (int) r4
            if (r0 < r4) goto L_0x00f2
            if (r8 >= r2) goto L_0x00f2
            r2 = r8
            goto L_0x00f2
        L_0x00e1:
            r30 = r5
            r31 = r8
            r32 = r9
            goto L_0x00f0
        L_0x00e8:
            r30 = r5
            r31 = r8
            r32 = r9
            r29 = r10
        L_0x00f0:
            r33 = r15
        L_0x00f2:
            int r6 = r6 + 1
            r4 = r28
            r10 = r29
            r5 = r30
            r8 = r31
            r9 = r32
            r15 = r33
            goto L_0x006f
        L_0x0102:
            r28 = r4
            r30 = r5
            r31 = r8
            r32 = r9
            r29 = r10
            r33 = r15
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L_0x0146
            int r0 = r7.size()
            r4 = 1
            int r0 = r0 - r4
        L_0x0119:
            if (r0 < 0) goto L_0x0146
            java.lang.Object r4 = r7.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.Lia r4 = r1.a((int) r4)
            int r4 = r4.a()
            r5 = -1
            if (r4 == r5) goto L_0x0132
            if (r4 <= r2) goto L_0x0135
        L_0x0132:
            r7.remove(r0)
        L_0x0135:
            int r0 = r0 + -1
            goto L_0x0119
        L_0x0138:
            r27 = r0
            r28 = r4
            r30 = r5
            r31 = r8
            r32 = r9
            r29 = r10
            r33 = r15
        L_0x0146:
            r0 = r12[r3]
            r5 = r20
            r6 = r21
            r8 = r22
            r4 = r28
            r2 = 0
        L_0x0151:
            int r9 = r1.f8383a
            if (r2 >= r9) goto L_0x01f8
            r9 = r0[r2]
            boolean r9 = b(r9, r11)
            if (r9 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.Lia r9 = r1.a((int) r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            boolean r10 = r7.contains(r10)
            if (r10 == 0) goto L_0x0185
            int r10 = r9.j
            r15 = -1
            if (r10 == r15) goto L_0x0172
            if (r10 > r13) goto L_0x0185
        L_0x0172:
            int r10 = r9.k
            if (r10 == r15) goto L_0x0178
            if (r10 > r14) goto L_0x0185
        L_0x0178:
            int r10 = r9.f7708b
            if (r10 == r15) goto L_0x0181
            r15 = r33
            if (r10 > r15) goto L_0x0187
            goto L_0x0183
        L_0x0181:
            r15 = r33
        L_0x0183:
            r10 = 1
            goto L_0x0188
        L_0x0185:
            r15 = r33
        L_0x0187:
            r10 = 0
        L_0x0188:
            if (r10 != 0) goto L_0x0194
            if (r29 == 0) goto L_0x018d
            goto L_0x0194
        L_0x018d:
            r22 = r0
            r20 = r1
            r21 = r4
            goto L_0x01ec
        L_0x0194:
            if (r10 == 0) goto L_0x019c
            r20 = r1
            r21 = r4
            r1 = 2
            goto L_0x01a1
        L_0x019c:
            r20 = r1
            r21 = r4
            r1 = 1
        L_0x01a1:
            r4 = r0[r2]
            r22 = r0
            r0 = 0
            boolean r4 = b(r4, r0)
            if (r4 == 0) goto L_0x01ae
            int r1 = r1 + 1000
        L_0x01ae:
            if (r1 <= r5) goto L_0x01b2
            r0 = 1
            goto L_0x01b3
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            if (r1 != r5) goto L_0x01d6
            int r0 = r9.a()
            if (r0 == r6) goto L_0x01c4
            int r0 = r9.a()
            int r0 = a(r0, r6)
            goto L_0x01ca
        L_0x01c4:
            int r0 = r9.f7708b
            int r0 = a(r0, r8)
        L_0x01ca:
            if (r4 == 0) goto L_0x01d1
            if (r10 == 0) goto L_0x01d1
            if (r0 <= 0) goto L_0x01d5
            goto L_0x01d3
        L_0x01d1:
            if (r0 >= 0) goto L_0x01d5
        L_0x01d3:
            r0 = 1
            goto L_0x01d6
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            if (r0 == 0) goto L_0x01ec
            int r8 = r9.f7708b
            int r6 = r9.a()
            r5 = r1
            r27 = r2
            r4 = r20
            goto L_0x01ee
        L_0x01e4:
            r22 = r0
            r20 = r1
            r21 = r4
            r15 = r33
        L_0x01ec:
            r4 = r21
        L_0x01ee:
            int r2 = r2 + 1
            r33 = r15
            r1 = r20
            r0 = r22
            goto L_0x0151
        L_0x01f8:
            r21 = r4
            r15 = r33
            int r3 = r3 + 1
            r20 = r5
            r22 = r8
            r7 = r24
            r2 = r25
            r0 = r27
            r10 = r29
            r5 = r30
            r8 = r31
            r9 = r32
            r21 = r6
            r6 = r26
            goto L_0x003f
        L_0x0216:
            r27 = r0
            r25 = r2
            r28 = r4
            r26 = r6
            if (r28 != 0) goto L_0x0223
            r16 = 0
            goto L_0x022e
        L_0x0223:
            com.google.android.gms.internal.ads.Xla r9 = new com.google.android.gms.internal.ads.Xla
            r1 = r27
            r0 = r28
            r9.<init>(r0, r1)
            r16 = r9
        L_0x022e:
            r25[r26] = r16
            r0 = r25[r26]
            if (r0 == 0) goto L_0x0236
            r7 = 1
            goto L_0x0240
        L_0x0236:
            r7 = 0
            goto L_0x0240
        L_0x0238:
            r23 = r1
            r25 = r2
            r19 = r4
            r26 = r6
        L_0x0240:
            r0 = r36[r26]
            int r0 = r0.f8252b
            goto L_0x024d
        L_0x0245:
            r23 = r1
            r25 = r2
            r19 = r4
            r26 = r6
        L_0x024d:
            int r6 = r26 + 1
            r3 = r34
            r0 = r35
            r4 = r19
            r1 = r23
            r2 = r25
            goto L_0x0011
        L_0x025b:
            r25 = r2
            r19 = r4
            r0 = r1
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0263:
            if (r1 >= r0) goto L_0x03f8
            r4 = r35[r1]
            int r4 = r4.a()
            r5 = 1
            if (r4 == r5) goto L_0x037d
            r5 = 2
            if (r4 == r5) goto L_0x0376
            r11 = 3
            if (r4 == r11) goto L_0x02f2
            r4 = r35[r1]
            r4.a()
            r4 = r36[r1]
            r5 = r37[r1]
            r6 = r19
            boolean r7 = r6.i
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0285:
            int r12 = r4.f8252b
            if (r8 >= r12) goto L_0x02df
            com.google.android.gms.internal.ads.Qla r12 = r4.a((int) r8)
            r13 = r5[r8]
            r14 = r11
            r11 = r10
            r10 = r9
            r9 = 0
        L_0x0293:
            int r15 = r12.f8383a
            if (r9 >= r15) goto L_0x02d5
            r15 = r13[r9]
            boolean r15 = b(r15, r7)
            if (r15 == 0) goto L_0x02ca
            com.google.android.gms.internal.ads.Lia r15 = r12.a((int) r9)
            int r15 = r15.x
            r18 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x02ad
            r15 = 1
            goto L_0x02ae
        L_0x02ad:
            r15 = 0
        L_0x02ae:
            if (r15 == 0) goto L_0x02b4
            r23 = r0
            r15 = 2
            goto L_0x02b7
        L_0x02b4:
            r23 = r0
            r15 = 1
        L_0x02b7:
            r0 = r13[r9]
            r19 = r4
            r4 = 0
            boolean r0 = b(r0, r4)
            if (r0 == 0) goto L_0x02c4
            int r15 = r15 + 1000
        L_0x02c4:
            if (r15 <= r14) goto L_0x02ce
            r11 = r9
            r10 = r12
            r14 = r15
            goto L_0x02ce
        L_0x02ca:
            r23 = r0
            r19 = r4
        L_0x02ce:
            int r9 = r9 + 1
            r4 = r19
            r0 = r23
            goto L_0x0293
        L_0x02d5:
            r23 = r0
            r19 = r4
            int r8 = r8 + 1
            r9 = r10
            r10 = r11
            r11 = r14
            goto L_0x0285
        L_0x02df:
            r23 = r0
            if (r9 != 0) goto L_0x02e5
            r0 = 0
            goto L_0x02ea
        L_0x02e5:
            com.google.android.gms.internal.ads.Xla r0 = new com.google.android.gms.internal.ads.Xla
            r0.<init>(r9, r10)
        L_0x02ea:
            r25[r1] = r0
            r5 = -1
            r15 = 0
            r17 = 2
            goto L_0x03f0
        L_0x02f2:
            r23 = r0
            r6 = r19
            if (r3 != 0) goto L_0x037a
            r0 = r36[r1]
            r3 = r37[r1]
            boolean r4 = r6.i
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0302:
            int r10 = r0.f8252b
            if (r5 >= r10) goto L_0x035d
            com.google.android.gms.internal.ads.Qla r10 = r0.a((int) r5)
            r12 = r3[r5]
            r13 = r9
            r9 = r8
            r8 = r7
            r7 = 0
        L_0x0310:
            int r14 = r10.f8383a
            if (r7 >= r14) goto L_0x0354
            r14 = r12[r7]
            boolean r14 = b(r14, r4)
            if (r14 == 0) goto L_0x034e
            com.google.android.gms.internal.ads.Lia r14 = r10.a((int) r7)
            int r15 = r14.x
            r18 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x032a
            r15 = 1
            goto L_0x032b
        L_0x032a:
            r15 = 0
        L_0x032b:
            int r14 = r14.x
            r17 = 2
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0335
            r14 = 1
            goto L_0x0336
        L_0x0335:
            r14 = 0
        L_0x0336:
            if (r15 == 0) goto L_0x033a
            r14 = 3
            goto L_0x033d
        L_0x033a:
            if (r14 == 0) goto L_0x0350
            r14 = 1
        L_0x033d:
            r15 = r12[r7]
            r11 = 0
            boolean r15 = b(r15, r11)
            if (r15 == 0) goto L_0x0348
            int r14 = r14 + 1000
        L_0x0348:
            if (r14 <= r13) goto L_0x0350
            r9 = r7
            r8 = r10
            r13 = r14
            goto L_0x0350
        L_0x034e:
            r17 = 2
        L_0x0350:
            int r7 = r7 + 1
            r11 = 3
            goto L_0x0310
        L_0x0354:
            r17 = 2
            int r5 = r5 + 1
            r7 = r8
            r8 = r9
            r9 = r13
            r11 = 3
            goto L_0x0302
        L_0x035d:
            r17 = 2
            if (r7 != 0) goto L_0x0363
            r9 = 0
            goto L_0x0368
        L_0x0363:
            com.google.android.gms.internal.ads.Xla r9 = new com.google.android.gms.internal.ads.Xla
            r9.<init>(r7, r8)
        L_0x0368:
            r25[r1] = r9
            r0 = r25[r1]
            if (r0 == 0) goto L_0x0370
            r0 = 1
            goto L_0x0371
        L_0x0370:
            r0 = 0
        L_0x0371:
            r3 = r0
        L_0x0372:
            r5 = -1
            r15 = 0
            goto L_0x03f0
        L_0x0376:
            r23 = r0
            r6 = r19
        L_0x037a:
            r17 = 2
            goto L_0x0372
        L_0x037d:
            r23 = r0
            r6 = r19
            r17 = 2
            if (r2 != 0) goto L_0x0372
            r0 = r36[r1]
            r2 = r37[r1]
            boolean r4 = r6.i
            r5 = 0
            r7 = -1
            r8 = -1
            r9 = 0
        L_0x038f:
            int r10 = r0.f8252b
            if (r5 >= r10) goto L_0x03d7
            com.google.android.gms.internal.ads.Qla r10 = r0.a((int) r5)
            r11 = r2[r5]
            r12 = r9
            r9 = r8
            r8 = r7
            r7 = 0
        L_0x039d:
            int r13 = r10.f8383a
            if (r7 >= r13) goto L_0x03d0
            r13 = r11[r7]
            boolean r13 = b(r13, r4)
            if (r13 == 0) goto L_0x03cc
            com.google.android.gms.internal.ads.Lia r13 = r10.a((int) r7)
            r14 = r11[r7]
            int r13 = r13.x
            r15 = 1
            r13 = r13 & r15
            if (r13 == 0) goto L_0x03b7
            r13 = 1
            goto L_0x03b8
        L_0x03b7:
            r13 = 0
        L_0x03b8:
            if (r13 == 0) goto L_0x03bc
            r13 = 2
            goto L_0x03bd
        L_0x03bc:
            r13 = 1
        L_0x03bd:
            r15 = 0
            boolean r14 = b(r14, r15)
            if (r14 == 0) goto L_0x03c6
            int r13 = r13 + 1000
        L_0x03c6:
            if (r13 <= r12) goto L_0x03cd
            r8 = r5
            r9 = r7
            r12 = r13
            goto L_0x03cd
        L_0x03cc:
            r15 = 0
        L_0x03cd:
            int r7 = r7 + 1
            goto L_0x039d
        L_0x03d0:
            r15 = 0
            int r5 = r5 + 1
            r7 = r8
            r8 = r9
            r9 = r12
            goto L_0x038f
        L_0x03d7:
            r5 = -1
            r15 = 0
            if (r7 != r5) goto L_0x03dd
            r9 = 0
            goto L_0x03e6
        L_0x03dd:
            com.google.android.gms.internal.ads.Qla r0 = r0.a((int) r7)
            com.google.android.gms.internal.ads.Xla r9 = new com.google.android.gms.internal.ads.Xla
            r9.<init>(r0, r8)
        L_0x03e6:
            r25[r1] = r9
            r0 = r25[r1]
            if (r0 == 0) goto L_0x03ee
            r0 = 1
            goto L_0x03ef
        L_0x03ee:
            r0 = 0
        L_0x03ef:
            r2 = r0
        L_0x03f0:
            int r1 = r1 + 1
            r19 = r6
            r0 = r23
            goto L_0x0263
        L_0x03f8:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vla.a(com.google.android.gms.internal.ads.Tia[], com.google.android.gms.internal.ads.Pla[], int[][][]):com.google.android.gms.internal.ads.bma[]");
    }
}
