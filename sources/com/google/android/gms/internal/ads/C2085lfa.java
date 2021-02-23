package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.lfa  reason: case insensitive filesystem */
final class C2085lfa<T> implements Cfa<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11205a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f11206b = C1308aga.c();

    /* renamed from: c  reason: collision with root package name */
    private final int[] f11207c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f11208d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11209e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11210f;

    /* renamed from: g  reason: collision with root package name */
    private final C1872ifa f11211g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11212h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final C2369pfa o;
    private final Tea p;
    private final Vfa<?, ?> q;
    private final C2154mea<?> r;
    private final C1377bfa s;

    private C2085lfa(int[] iArr, Object[] objArr, int i2, int i3, C1872ifa ifa, boolean z, boolean z2, int[] iArr2, int i4, int i5, C2369pfa pfa, Tea tea, Vfa<?, ?> vfa, C2154mea<?> mea, C1377bfa bfa) {
        this.f11207c = iArr;
        this.f11208d = objArr;
        this.f11209e = i2;
        this.f11210f = i3;
        this.i = ifa instanceof C2934xea;
        this.j = z;
        this.f11212h = mea != null && mea.a(ifa);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = pfa;
        this.p = tea;
        this.q = vfa;
        this.r = mea;
        this.f11211g = ifa;
        this.s = bfa;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.f11209e || i2 > this.f11210f) {
            return -1;
        }
        return b(i2, i3);
    }

    private static <UT, UB> int a(Vfa<UT, UB> vfa, T t) {
        return vfa.c(vfa.d(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r3 = r11.f7574c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0134, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0145, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0169, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.Kda r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f11206b
            int[] r7 = r0.f11207c
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0159;
                case 52: goto L_0x0149;
                case 53: goto L_0x0139;
                case 54: goto L_0x0139;
                case 55: goto L_0x012c;
                case 56: goto L_0x0120;
                case 57: goto L_0x0115;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00ab;
                case 61: goto L_0x00a1;
                case 62: goto L_0x012c;
                case 63: goto L_0x0073;
                case 64: goto L_0x0115;
                case 65: goto L_0x0120;
                case 66: goto L_0x0065;
                case 67: goto L_0x0057;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x016d
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x016d
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.Cfa r2 = r0.a((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.ads.Kda) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x004f
            goto L_0x00a7
        L_0x004f:
            java.lang.Object r3 = r11.f7574c
            java.lang.Object r3 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x0145
        L_0x0057:
            if (r5 != 0) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.b(r3, r4, r11)
            long r3 = r11.f7573b
            long r3 = com.google.android.gms.internal.ads.C1304aea.a((long) r3)
            goto L_0x0141
        L_0x0065:
            if (r5 != 0) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r11)
            int r3 = r11.f7572a
            int r3 = com.google.android.gms.internal.ads.C1304aea.e(r3)
            goto L_0x0134
        L_0x0073:
            if (r5 != 0) goto L_0x016d
            int r3 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r11)
            int r4 = r11.f7572a
            com.google.android.gms.internal.ads.Bea r5 = r0.c((int) r6)
            if (r5 == 0) goto L_0x0097
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0088
            goto L_0x0097
        L_0x0088:
            com.google.android.gms.internal.ads.Yfa r1 = e((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.a((int) r2, (java.lang.Object) r4)
            r2 = r3
            goto L_0x016e
        L_0x0097:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0169
        L_0x00a1:
            if (r5 != r15) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.e(r3, r4, r11)
        L_0x00a7:
            java.lang.Object r3 = r11.f7574c
            goto L_0x0145
        L_0x00ab:
            if (r5 != r15) goto L_0x016d
            com.google.android.gms.internal.ads.Cfa r2 = r0.a((int) r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.Kda) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c2
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c3
        L_0x00c2:
            r15 = 0
        L_0x00c3:
            if (r15 != 0) goto L_0x00c9
            java.lang.Object r3 = r11.f7574c
            goto L_0x0145
        L_0x00c9:
            java.lang.Object r3 = r11.f7574c
            java.lang.Object r3 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x0145
        L_0x00d1:
            if (r5 != r15) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r11)
            int r4 = r11.f7572a
            if (r4 != 0) goto L_0x00de
            java.lang.String r3 = ""
            goto L_0x0145
        L_0x00de:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f2
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.C1521dga.a((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.i()
            throw r1
        L_0x00f2:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.Aea.f6145a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0169
        L_0x00ff:
            if (r5 != 0) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.b(r3, r4, r11)
            long r3 = r11.f7573b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x010f
            r15 = 1
            goto L_0x0110
        L_0x010f:
            r15 = 0
        L_0x0110:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0145
        L_0x0115:
            if (r5 != r7) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0153
        L_0x0120:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            long r2 = com.google.android.gms.internal.ads.Hda.b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0164
        L_0x012c:
            if (r5 != 0) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r11)
            int r3 = r11.f7572a
        L_0x0134:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0145
        L_0x0139:
            if (r5 != 0) goto L_0x016d
            int r2 = com.google.android.gms.internal.ads.Hda.b(r3, r4, r11)
            long r3 = r11.f7573b
        L_0x0141:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0145:
            r12.putObject(r1, r9, r3)
            goto L_0x0169
        L_0x0149:
            if (r5 != r7) goto L_0x016d
            float r2 = com.google.android.gms.internal.ads.Hda.d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0153:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0169
        L_0x0159:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            double r2 = com.google.android.gms.internal.ads.Hda.c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0164:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0169:
            r12.putInt(r1, r13, r8)
            goto L_0x016e
        L_0x016d:
            r2 = r4
        L_0x016e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.Kda):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0272, code lost:
        if (r7.f7573b != 0) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0274, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0276, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0277, code lost:
        r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x027a, code lost:
        if (r4 >= r5) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x027c, code lost:
        r6 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0282, code lost:
        if (r2 != r7.f7572a) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0284, code lost:
        r4 = com.google.android.gms.internal.ads.Hda.b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x028c, code lost:
        if (r7.f7573b == 0) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        if (r4 == 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r11.add(com.google.android.gms.internal.ads.Lda.f7691a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r11.add(com.google.android.gms.internal.ads.Lda.a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
        if (r2 != r7.f7572a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7);
        r4 = r7.f7572a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0160, code lost:
        if (r4 < 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r4 != 0) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        throw com.google.android.gms.internal.ads.Iea.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw com.google.android.gms.internal.ads.Iea.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.Kda r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f11206b
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.Fea r11 = (com.google.android.gms.internal.ads.Fea) r11
            boolean r12 = r11.n()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.Fea r11 = r11.c(r12)
            sun.misc.Unsafe r12 = f11206b
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x039d;
                case 19: goto L_0x035f;
                case 20: goto L_0x0327;
                case 21: goto L_0x0327;
                case 22: goto L_0x030d;
                case 23: goto L_0x02ce;
                case 24: goto L_0x028f;
                case 25: goto L_0x023e;
                case 26: goto L_0x0197;
                case 27: goto L_0x017d;
                case 28: goto L_0x0132;
                case 29: goto L_0x030d;
                case 30: goto L_0x00fa;
                case 31: goto L_0x028f;
                case 32: goto L_0x02ce;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x039d;
                case 36: goto L_0x035f;
                case 37: goto L_0x0327;
                case 38: goto L_0x0327;
                case 39: goto L_0x030d;
                case 40: goto L_0x02ce;
                case 41: goto L_0x028f;
                case 42: goto L_0x023e;
                case 43: goto L_0x030d;
                case 44: goto L_0x00fa;
                case 45: goto L_0x028f;
                case 46: goto L_0x02ce;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03db
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x03db
            com.google.android.gms.internal.ads.Cfa r1 = r0.a((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.Kda) r27)
        L_0x005a:
            java.lang.Object r8 = r7.f7574c
            r11.add(r8)
            if (r4 >= r5) goto L_0x03db
            int r8 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r9 = r7.f7572a
            if (r2 != r9) goto L_0x03db
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.Kda) r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            com.google.android.gms.internal.ads.Xea r11 = (com.google.android.gms.internal.ads.Xea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = com.google.android.gms.internal.ads.Hda.b(r3, r1, r7)
            long r4 = r7.f7573b
            long r4 = com.google.android.gms.internal.ads.C1304aea.a((long) r4)
            r11.b(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x03dc
        L_0x0099:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x03db
            com.google.android.gms.internal.ads.Xea r11 = (com.google.android.gms.internal.ads.Xea) r11
        L_0x00a2:
            int r1 = com.google.android.gms.internal.ads.Hda.b(r3, r4, r7)
            long r8 = r7.f7573b
            long r8 = com.google.android.gms.internal.ads.C1304aea.a((long) r8)
            r11.b(r8)
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            com.google.android.gms.internal.ads.yea r11 = (com.google.android.gms.internal.ads.C3005yea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r4 = r7.f7572a
            int r4 = com.google.android.gms.internal.ads.C1304aea.e(r4)
            r11.e(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x03dc
        L_0x00d9:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x03db
            com.google.android.gms.internal.ads.yea r11 = (com.google.android.gms.internal.ads.C3005yea) r11
        L_0x00e2:
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r4 = r7.f7572a
            int r4 = com.google.android.gms.internal.ads.C1304aea.e(r4)
            r11.e(r4)
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = com.google.android.gms.internal.ads.Hda.a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.Fea<?>) r11, (com.google.android.gms.internal.ads.Kda) r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x03db
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.Hda.a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.Fea<?>) r6, (com.google.android.gms.internal.ads.Kda) r7)
        L_0x0112:
            com.google.android.gms.internal.ads.xea r1 = (com.google.android.gms.internal.ads.C2934xea) r1
            com.google.android.gms.internal.ads.Yfa r3 = r1.zzino
            com.google.android.gms.internal.ads.Yfa r4 = com.google.android.gms.internal.ads.Yfa.c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.ads.Bea r4 = r0.c((int) r8)
            com.google.android.gms.internal.ads.Vfa<?, ?> r5 = r0.q
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.Efa.a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.Yfa r3 = (com.google.android.gms.internal.ads.Yfa) r3
            if (r3 == 0) goto L_0x012f
            r1.zzino = r3
        L_0x012f:
            r1 = r2
            goto L_0x03dc
        L_0x0132:
            if (r6 != r10) goto L_0x03db
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r4 = r7.f7572a
            if (r4 < 0) goto L_0x0178
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0173
            if (r4 != 0) goto L_0x0148
        L_0x0142:
            com.google.android.gms.internal.ads.Lda r4 = com.google.android.gms.internal.ads.Lda.f7691a
            r11.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.ads.Lda r6 = com.google.android.gms.internal.ads.Lda.a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r4 = r7.f7572a
            if (r4 < 0) goto L_0x016e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0169
            if (r4 != 0) goto L_0x0148
            goto L_0x0142
        L_0x0169:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x016e:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.b()
            throw r1
        L_0x0173:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x0178:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.b()
            throw r1
        L_0x017d:
            if (r6 != r10) goto L_0x03db
            com.google.android.gms.internal.ads.Cfa r1 = r0.a((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.ads.Hda.a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03dc
        L_0x0197:
            if (r6 != r10) goto L_0x03db
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x01e4
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r6 = r7.f7572a
            if (r6 < 0) goto L_0x01df
            if (r6 != 0) goto L_0x01b2
        L_0x01ae:
            r11.add(r1)
            goto L_0x01bd
        L_0x01b2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.Aea.f6145a
            r8.<init>(r3, r4, r6, r9)
        L_0x01b9:
            r11.add(r8)
            int r4 = r4 + r6
        L_0x01bd:
            if (r4 >= r5) goto L_0x03db
            int r6 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r8 = r7.f7572a
            if (r2 != r8) goto L_0x03db
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r6, r7)
            int r6 = r7.f7572a
            if (r6 < 0) goto L_0x01da
            if (r6 != 0) goto L_0x01d2
            goto L_0x01ae
        L_0x01d2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.Aea.f6145a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x01b9
        L_0x01da:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.b()
            throw r1
        L_0x01df:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.b()
            throw r1
        L_0x01e4:
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r6 = r7.f7572a
            if (r6 < 0) goto L_0x0239
            if (r6 != 0) goto L_0x01f2
        L_0x01ee:
            r11.add(r1)
            goto L_0x0205
        L_0x01f2:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.C1521dga.a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x0234
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.Aea.f6145a
            r9.<init>(r3, r4, r6, r10)
        L_0x0201:
            r11.add(r9)
            r4 = r8
        L_0x0205:
            if (r4 >= r5) goto L_0x03db
            int r6 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r8 = r7.f7572a
            if (r2 != r8) goto L_0x03db
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r6, r7)
            int r6 = r7.f7572a
            if (r6 < 0) goto L_0x022f
            if (r6 != 0) goto L_0x021a
            goto L_0x01ee
        L_0x021a:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.C1521dga.a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x022a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.Aea.f6145a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x0201
        L_0x022a:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.i()
            throw r1
        L_0x022f:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.b()
            throw r1
        L_0x0234:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.i()
            throw r1
        L_0x0239:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.b()
            throw r1
        L_0x023e:
            r1 = 0
            if (r6 != r10) goto L_0x0266
            com.google.android.gms.internal.ads.Jda r11 = (com.google.android.gms.internal.ads.Jda) r11
            int r2 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r4 = r7.f7572a
            int r4 = r4 + r2
        L_0x024a:
            if (r2 >= r4) goto L_0x025d
            int r2 = com.google.android.gms.internal.ads.Hda.b(r3, r2, r7)
            long r5 = r7.f7573b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0258
            r5 = 1
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r11.a(r5)
            goto L_0x024a
        L_0x025d:
            if (r2 != r4) goto L_0x0261
            goto L_0x012f
        L_0x0261:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x0266:
            if (r6 != 0) goto L_0x03db
            com.google.android.gms.internal.ads.Jda r11 = (com.google.android.gms.internal.ads.Jda) r11
            int r4 = com.google.android.gms.internal.ads.Hda.b(r3, r4, r7)
            long r8 = r7.f7573b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0276
        L_0x0274:
            r6 = 1
            goto L_0x0277
        L_0x0276:
            r6 = 0
        L_0x0277:
            r11.a(r6)
            if (r4 >= r5) goto L_0x03db
            int r6 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r8 = r7.f7572a
            if (r2 != r8) goto L_0x03db
            int r4 = com.google.android.gms.internal.ads.Hda.b(r3, r6, r7)
            long r8 = r7.f7573b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0276
            goto L_0x0274
        L_0x028f:
            if (r6 != r10) goto L_0x02af
            com.google.android.gms.internal.ads.yea r11 = (com.google.android.gms.internal.ads.C3005yea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x029a:
            if (r1 >= r2) goto L_0x02a6
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1)
            r11.e(r4)
            int r1 = r1 + 4
            goto L_0x029a
        L_0x02a6:
            if (r1 != r2) goto L_0x02aa
            goto L_0x03dc
        L_0x02aa:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x02af:
            if (r6 != r9) goto L_0x03db
            com.google.android.gms.internal.ads.yea r11 = (com.google.android.gms.internal.ads.C3005yea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r18, r19)
            r11.e(r1)
        L_0x02ba:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4)
            r11.e(r1)
            goto L_0x02ba
        L_0x02ce:
            if (r6 != r10) goto L_0x02ee
            com.google.android.gms.internal.ads.Xea r11 = (com.google.android.gms.internal.ads.Xea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x02d9:
            if (r1 >= r2) goto L_0x02e5
            long r4 = com.google.android.gms.internal.ads.Hda.b(r3, r1)
            r11.b(r4)
            int r1 = r1 + 8
            goto L_0x02d9
        L_0x02e5:
            if (r1 != r2) goto L_0x02e9
            goto L_0x03dc
        L_0x02e9:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x02ee:
            if (r6 != r13) goto L_0x03db
            com.google.android.gms.internal.ads.Xea r11 = (com.google.android.gms.internal.ads.Xea) r11
            long r8 = com.google.android.gms.internal.ads.Hda.b(r18, r19)
            r11.b(r8)
        L_0x02f9:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            long r8 = com.google.android.gms.internal.ads.Hda.b(r3, r4)
            r11.b(r8)
            goto L_0x02f9
        L_0x030d:
            if (r6 != r10) goto L_0x0315
            int r1 = com.google.android.gms.internal.ads.Hda.a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.Fea<?>) r11, (com.google.android.gms.internal.ads.Kda) r7)
            goto L_0x03dc
        L_0x0315:
            if (r6 != 0) goto L_0x03db
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.Hda.a((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.ads.Fea<?>) r25, (com.google.android.gms.internal.ads.Kda) r26)
            goto L_0x03dc
        L_0x0327:
            if (r6 != r10) goto L_0x0347
            com.google.android.gms.internal.ads.Xea r11 = (com.google.android.gms.internal.ads.Xea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x0332:
            if (r1 >= r2) goto L_0x033e
            int r1 = com.google.android.gms.internal.ads.Hda.b(r3, r1, r7)
            long r4 = r7.f7573b
            r11.b(r4)
            goto L_0x0332
        L_0x033e:
            if (r1 != r2) goto L_0x0342
            goto L_0x03dc
        L_0x0342:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x0347:
            if (r6 != 0) goto L_0x03db
            com.google.android.gms.internal.ads.Xea r11 = (com.google.android.gms.internal.ads.Xea) r11
        L_0x034b:
            int r1 = com.google.android.gms.internal.ads.Hda.b(r3, r4, r7)
            long r8 = r7.f7573b
            r11.b(r8)
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            goto L_0x034b
        L_0x035f:
            if (r6 != r10) goto L_0x037e
            com.google.android.gms.internal.ads.tea r11 = (com.google.android.gms.internal.ads.C2650tea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x036a:
            if (r1 >= r2) goto L_0x0376
            float r4 = com.google.android.gms.internal.ads.Hda.d(r3, r1)
            r11.a(r4)
            int r1 = r1 + 4
            goto L_0x036a
        L_0x0376:
            if (r1 != r2) goto L_0x0379
            goto L_0x03dc
        L_0x0379:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x037e:
            if (r6 != r9) goto L_0x03db
            com.google.android.gms.internal.ads.tea r11 = (com.google.android.gms.internal.ads.C2650tea) r11
            float r1 = com.google.android.gms.internal.ads.Hda.d(r18, r19)
            r11.a(r1)
        L_0x0389:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            float r1 = com.google.android.gms.internal.ads.Hda.d(r3, r4)
            r11.a(r1)
            goto L_0x0389
        L_0x039d:
            if (r6 != r10) goto L_0x03bc
            com.google.android.gms.internal.ads.jea r11 = (com.google.android.gms.internal.ads.C1941jea) r11
            int r1 = com.google.android.gms.internal.ads.Hda.a(r3, r4, r7)
            int r2 = r7.f7572a
            int r2 = r2 + r1
        L_0x03a8:
            if (r1 >= r2) goto L_0x03b4
            double r4 = com.google.android.gms.internal.ads.Hda.c(r3, r1)
            r11.a(r4)
            int r1 = r1 + 8
            goto L_0x03a8
        L_0x03b4:
            if (r1 != r2) goto L_0x03b7
            goto L_0x03dc
        L_0x03b7:
            com.google.android.gms.internal.ads.Iea r1 = com.google.android.gms.internal.ads.Iea.a()
            throw r1
        L_0x03bc:
            if (r6 != r13) goto L_0x03db
            com.google.android.gms.internal.ads.jea r11 = (com.google.android.gms.internal.ads.C1941jea) r11
            double r8 = com.google.android.gms.internal.ads.Hda.c(r18, r19)
            r11.a(r8)
        L_0x03c7:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03dc
            int r4 = com.google.android.gms.internal.ads.Hda.a(r3, r1, r7)
            int r6 = r7.f7572a
            if (r2 != r6) goto L_0x03dc
            double r8 = com.google.android.gms.internal.ads.Hda.c(r3, r4)
            r11.a(r8)
            goto L_0x03c7
        L_0x03db:
            r1 = r4
        L_0x03dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.Kda):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, Kda kda) {
        Unsafe unsafe = f11206b;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.b(object)) {
            Object d2 = this.s.d(b2);
            this.s.a(d2, object);
            unsafe.putObject(t, j2, d2);
        }
        this.s.e(b2);
        throw null;
    }

    private final Cfa a(int i2) {
        int i3 = (i2 / 3) << 1;
        Cfa cfa = (Cfa) this.f11208d[i3];
        if (cfa != null) {
            return cfa;
        }
        Cfa a2 = C2794vfa.a().a((Class) this.f11208d[i3 + 1]);
        this.f11208d[i3] = a2;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0396  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.C2085lfa<T> a(java.lang.Class<T> r33, com.google.android.gms.internal.ads.C1731gfa r34, com.google.android.gms.internal.ads.C2369pfa r35, com.google.android.gms.internal.ads.Tea r36, com.google.android.gms.internal.ads.Vfa<?, ?> r37, com.google.android.gms.internal.ads.C2154mea<?> r38, com.google.android.gms.internal.ads.C1377bfa r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2936xfa
            if (r1 == 0) goto L_0x040d
            com.google.android.gms.internal.ads.xfa r0 = (com.google.android.gms.internal.ads.C2936xfa) r0
            int r1 = r0.a()
            int r2 = com.google.android.gms.internal.ads.C2581sfa.f12119b
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            goto L_0x0052
        L_0x0051:
            r10 = r5
        L_0x0052:
            if (r7 != 0) goto L_0x0061
            int[] r5 = f11205a
            r15 = r5
            r5 = 0
            r7 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            goto L_0x018a
        L_0x0061:
            int r5 = r10 + 1
            char r7 = r1.charAt(r10)
            if (r7 < r6) goto L_0x0080
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006d:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x006d
        L_0x007d:
            int r5 = r5 << r9
            r5 = r5 | r7
            goto L_0x0082
        L_0x0080:
            r10 = r5
            r5 = r7
        L_0x0082:
            int r7 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r6) goto L_0x00a1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008e:
            int r12 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009e
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r10
            r9 = r9 | r7
            int r10 = r10 + 13
            r7 = r12
            goto L_0x008e
        L_0x009e:
            int r7 = r7 << r10
            r9 = r9 | r7
            goto L_0x00a2
        L_0x00a1:
            r12 = r7
        L_0x00a2:
            int r7 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r6) goto L_0x00c2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ae:
            int r13 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x00be
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r12
            r10 = r10 | r7
            int r12 = r12 + 13
            r7 = r13
            goto L_0x00ae
        L_0x00be:
            int r7 = r7 << r12
            r7 = r7 | r10
            r10 = r7
            goto L_0x00c3
        L_0x00c2:
            r13 = r7
        L_0x00c3:
            int r7 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r6) goto L_0x00e3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cf:
            int r14 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x00df
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r13
            r12 = r12 | r7
            int r13 = r13 + 13
            r7 = r14
            goto L_0x00cf
        L_0x00df:
            int r7 = r7 << r13
            r7 = r7 | r12
            r12 = r7
            goto L_0x00e4
        L_0x00e3:
            r14 = r7
        L_0x00e4:
            int r7 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r6) goto L_0x0104
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00f0:
            int r15 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0100
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r14
            r13 = r13 | r7
            int r14 = r14 + 13
            r7 = r15
            goto L_0x00f0
        L_0x0100:
            int r7 = r7 << r14
            r7 = r7 | r13
            r13 = r7
            goto L_0x0105
        L_0x0104:
            r15 = r7
        L_0x0105:
            int r7 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r6) goto L_0x0127
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0111:
            int r16 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0122
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r15
            r14 = r14 | r7
            int r15 = r15 + 13
            r7 = r16
            goto L_0x0111
        L_0x0122:
            int r7 = r7 << r15
            r7 = r7 | r14
            r14 = r7
            r7 = r16
        L_0x0127:
            int r15 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x014a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0133:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0145
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r7 = r7 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0133
        L_0x0145:
            int r15 = r15 << r16
            r7 = r7 | r15
            r15 = r17
        L_0x014a:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0175
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r32 = r16
            r16 = r15
            r15 = r32
        L_0x015c:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x016f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x015c
        L_0x016f:
            int r15 = r15 << r17
            r15 = r16 | r15
            r16 = r18
        L_0x0175:
            int r17 = r15 + r14
            int r7 = r17 + r7
            int[] r7 = new int[r7]
            int r17 = r5 << 1
            int r9 = r17 + r9
            r32 = r16
            r16 = r5
            r5 = r14
            r14 = r15
            r15 = r7
            r7 = r9
            r9 = r10
            r10 = r32
        L_0x018a:
            sun.misc.Unsafe r3 = f11206b
            java.lang.Object[] r17 = r0.e()
            com.google.android.gms.internal.ads.ifa r18 = r0.c()
            java.lang.Class r8 = r18.getClass()
            int r6 = r13 * 3
            int[] r6 = new int[r6]
            int r13 = r13 << r4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r19 = r14 + r5
            r21 = r14
            r22 = r19
            r5 = 0
            r20 = 0
        L_0x01a8:
            if (r10 >= r2) goto L_0x03ea
            int r23 = r10 + 1
            char r10 = r1.charAt(r10)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r4) goto L_0x01dc
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r32 = r23
            r23 = r10
            r10 = r32
        L_0x01bf:
            int r26 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r4) goto L_0x01d5
            r4 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r23 = r23 | r4
            int r25 = r25 + 13
            r10 = r26
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01bf
        L_0x01d5:
            int r4 = r10 << r25
            r10 = r23 | r4
            r4 = r26
            goto L_0x01de
        L_0x01dc:
            r4 = r23
        L_0x01de:
            int r23 = r4 + 1
            char r4 = r1.charAt(r4)
            r25 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x0212
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r32 = r23
            r23 = r4
            r4 = r32
        L_0x01f5:
            int r27 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x020b
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r26
            r23 = r23 | r2
            int r26 = r26 + 13
            r4 = r27
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01f5
        L_0x020b:
            int r2 = r4 << r26
            r4 = r23 | r2
            r2 = r27
            goto L_0x0214
        L_0x0212:
            r2 = r23
        L_0x0214:
            r23 = r14
            r14 = r4 & 255(0xff, float:3.57E-43)
            r26 = r12
            r12 = r4 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0223
            int r12 = r5 + 1
            r15[r5] = r20
            r5 = r12
        L_0x0223:
            r12 = 51
            r29 = r5
            if (r14 < r12) goto L_0x02bc
            int r12 = r2 + 1
            char r2 = r1.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r5) goto L_0x0252
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r30 = 13
        L_0x0238:
            int r31 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x024d
            r5 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r30
            r2 = r2 | r5
            int r30 = r30 + 13
            r12 = r31
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0238
        L_0x024d:
            int r5 = r12 << r30
            r2 = r2 | r5
            r12 = r31
        L_0x0252:
            int r5 = r14 + -51
            r30 = r12
            r12 = 9
            if (r5 == r12) goto L_0x0273
            r12 = 17
            if (r5 != r12) goto L_0x025f
            goto L_0x0273
        L_0x025f:
            r12 = 12
            if (r5 != r12) goto L_0x0271
            if (r11 != 0) goto L_0x0271
            int r5 = r20 / 3
            r12 = 1
            int r5 = r5 << r12
            int r5 = r5 + r12
            int r12 = r7 + 1
            r7 = r17[r7]
            r13[r5] = r7
            r7 = r12
        L_0x0271:
            r12 = 1
            goto L_0x0280
        L_0x0273:
            int r5 = r20 / 3
            r12 = 1
            int r5 = r5 << r12
            int r5 = r5 + r12
            int r24 = r7 + 1
            r7 = r17[r7]
            r13[r5] = r7
            r7 = r24
        L_0x0280:
            int r2 = r2 << r12
            r5 = r17[r2]
            boolean r12 = r5 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x028a
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0292
        L_0x028a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = a((java.lang.Class<?>) r8, (java.lang.String) r5)
            r17[r2] = r5
        L_0x0292:
            r12 = r6
            long r5 = r3.objectFieldOffset(r5)
            int r6 = (int) r5
            int r2 = r2 + 1
            r5 = r17[r2]
            r27 = r6
            boolean r6 = r5 instanceof java.lang.reflect.Field
            if (r6 == 0) goto L_0x02a5
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x02ad
        L_0x02a5:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = a((java.lang.Class<?>) r8, (java.lang.String) r5)
            r17[r2] = r5
        L_0x02ad:
            long r5 = r3.objectFieldOffset(r5)
            int r2 = (int) r5
            r5 = r2
            r18 = r8
            r6 = r27
            r28 = r30
            r2 = 0
            goto L_0x03ae
        L_0x02bc:
            r12 = r6
            int r5 = r7 + 1
            r6 = r17[r7]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = a((java.lang.Class<?>) r8, (java.lang.String) r6)
            r7 = 9
            if (r14 == r7) goto L_0x032e
            r7 = 17
            if (r14 != r7) goto L_0x02d0
            goto L_0x032e
        L_0x02d0:
            r7 = 27
            if (r14 == r7) goto L_0x031f
            r7 = 49
            if (r14 != r7) goto L_0x02d9
            goto L_0x031f
        L_0x02d9:
            r7 = 12
            if (r14 == r7) goto L_0x030b
            r7 = 30
            if (r14 == r7) goto L_0x030b
            r7 = 44
            if (r14 != r7) goto L_0x02e6
            goto L_0x030b
        L_0x02e6:
            r7 = 50
            if (r14 != r7) goto L_0x033c
            int r7 = r21 + 1
            r15[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r27 = r5 + 1
            r5 = r17[r5]
            r13[r21] = r5
            r5 = r4 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0308
            int r21 = r21 + 1
            int r5 = r27 + 1
            r27 = r17[r27]
            r13[r21] = r27
            r27 = r5
        L_0x0308:
            r21 = r7
            goto L_0x033e
        L_0x030b:
            if (r11 != 0) goto L_0x031c
            int r7 = r20 / 3
            r24 = 1
            int r7 = r7 << 1
            int r7 = r7 + 1
            int r27 = r5 + 1
            r5 = r17[r5]
            r13[r7] = r5
            goto L_0x033e
        L_0x031c:
            r24 = 1
            goto L_0x033c
        L_0x031f:
            r24 = 1
            int r7 = r20 / 3
            int r7 = r7 << 1
            int r7 = r7 + 1
            int r27 = r5 + 1
            r5 = r17[r5]
            r13[r7] = r5
            goto L_0x033e
        L_0x032e:
            r24 = 1
            int r7 = r20 / 3
            int r7 = r7 << 1
            int r7 = r7 + 1
            java.lang.Class r27 = r6.getType()
            r13[r7] = r27
        L_0x033c:
            r27 = r5
        L_0x033e:
            long r5 = r3.objectFieldOffset(r6)
            int r6 = (int) r5
            r5 = r4 & 4096(0x1000, float:5.74E-42)
            r7 = 4096(0x1000, float:5.74E-42)
            if (r5 != r7) goto L_0x0396
            r5 = 17
            if (r14 > r5) goto L_0x0396
            int r5 = r2 + 1
            char r2 = r1.charAt(r2)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r7) goto L_0x0372
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x035c:
            int r28 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x036e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r18
            r2 = r2 | r5
            int r18 = r18 + 13
            r5 = r28
            goto L_0x035c
        L_0x036e:
            int r5 = r5 << r18
            r2 = r2 | r5
            goto L_0x0374
        L_0x0372:
            r28 = r5
        L_0x0374:
            r5 = 1
            int r18 = r16 << 1
            int r24 = r2 / 32
            int r18 = r18 + r24
            r5 = r17[r18]
            boolean r7 = r5 instanceof java.lang.reflect.Field
            if (r7 == 0) goto L_0x0384
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x038c
        L_0x0384:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = a((java.lang.Class<?>) r8, (java.lang.String) r5)
            r17[r18] = r5
        L_0x038c:
            r18 = r8
            long r7 = r3.objectFieldOffset(r5)
            int r5 = (int) r7
            int r2 = r2 % 32
            goto L_0x039e
        L_0x0396:
            r18 = r8
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r2
            r2 = 0
        L_0x039e:
            r7 = 18
            if (r14 < r7) goto L_0x03ac
            r7 = 49
            if (r14 > r7) goto L_0x03ac
            int r7 = r22 + 1
            r15[r22] = r6
            r22 = r7
        L_0x03ac:
            r7 = r27
        L_0x03ae:
            int r8 = r20 + 1
            r12[r20] = r10
            int r10 = r8 + 1
            r20 = r1
            r1 = r4 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x03bd
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03be
        L_0x03bd:
            r1 = 0
        L_0x03be:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03c5
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c6
        L_0x03c5:
            r4 = 0
        L_0x03c6:
            r1 = r1 | r4
            int r4 = r14 << 20
            r1 = r1 | r4
            r1 = r1 | r6
            r12[r8] = r1
            int r1 = r10 + 1
            int r2 = r2 << 20
            r2 = r2 | r5
            r12[r10] = r2
            r6 = r12
            r8 = r18
            r14 = r23
            r2 = r25
            r12 = r26
            r10 = r28
            r5 = r29
            r4 = 1
            r32 = r20
            r20 = r1
            r1 = r32
            goto L_0x01a8
        L_0x03ea:
            r26 = r12
            r23 = r14
            r12 = r6
            com.google.android.gms.internal.ads.lfa r1 = new com.google.android.gms.internal.ads.lfa
            com.google.android.gms.internal.ads.ifa r10 = r0.c()
            r0 = 0
            r5 = r1
            r7 = r13
            r8 = r9
            r9 = r26
            r12 = r0
            r13 = r15
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x040d:
            com.google.android.gms.internal.ads.Sfa r0 = (com.google.android.gms.internal.ads.Sfa) r0
            r0.a()
            r0 = 0
            goto L_0x0415
        L_0x0414:
            throw r0
        L_0x0415:
            goto L_0x0414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Class, com.google.android.gms.internal.ads.gfa, com.google.android.gms.internal.ads.pfa, com.google.android.gms.internal.ads.Tea, com.google.android.gms.internal.ads.Vfa, com.google.android.gms.internal.ads.mea, com.google.android.gms.internal.ads.bfa):com.google.android.gms.internal.ads.lfa");
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, Bea bea, UB ub, Vfa<UT, UB> vfa) {
        this.s.e(b(i2));
        throw null;
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, Vfa<UT, UB> vfa) {
        Bea c2;
        int i3 = this.f11207c[i2];
        Object f2 = C1308aga.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null || (c2 = c(i2)) == null) {
            return ub;
        }
        a(i2, i3, this.s.f(f2), c2, ub, vfa);
        throw null;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> a(Object obj, long j2) {
        return (List) C1308aga.f(obj, j2);
    }

    private static void a(int i2, Object obj, C2583sga sga) {
        if (obj instanceof String) {
            sga.a(i2, (String) obj);
        } else {
            sga.a(i2, (Lda) obj);
        }
    }

    private static <UT, UB> void a(Vfa<UT, UB> vfa, T t, C2583sga sga) {
        vfa.a(vfa.d(t), sga);
    }

    private final <K, V> void a(C2583sga sga, int i2, Object obj, int i3) {
        if (obj != null) {
            this.s.e(b(i3));
            throw null;
        }
    }

    private final void a(Object obj, int i2, C2865wfa wfa) {
        long j2;
        Object l2;
        if (f(i2)) {
            j2 = (long) (i2 & 1048575);
            l2 = wfa.i();
        } else if (this.i) {
            j2 = (long) (i2 & 1048575);
            l2 = wfa.readString();
        } else {
            j2 = (long) (i2 & 1048575);
            l2 = wfa.l();
        }
        C1308aga.a(obj, j2, l2);
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = C1308aga.f(t, d2);
            Object f3 = C1308aga.f(t2, d2);
            if (f2 != null && f3 != null) {
                C1308aga.a((Object) t, d2, Aea.a(f2, f3));
                b(t, i2);
            } else if (f3 != null) {
                C1308aga.a((Object) t, d2, f3);
                b(t, i2);
            }
        }
    }

    private final boolean a(T t, int i2) {
        int e2 = e(i2);
        long j2 = (long) (e2 & 1048575);
        if (j2 == 1048575) {
            int d2 = d(i2);
            long j3 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return C1308aga.e(t, j3) != 0.0d;
                case 1:
                    return C1308aga.d(t, j3) != 0.0f;
                case 2:
                    return C1308aga.b(t, j3) != 0;
                case 3:
                    return C1308aga.b(t, j3) != 0;
                case 4:
                    return C1308aga.a((Object) t, j3) != 0;
                case 5:
                    return C1308aga.b(t, j3) != 0;
                case 6:
                    return C1308aga.a((Object) t, j3) != 0;
                case 7:
                    return C1308aga.c(t, j3);
                case 8:
                    Object f2 = C1308aga.f(t, j3);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof Lda) {
                        return !Lda.f7691a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C1308aga.f(t, j3) != null;
                case 10:
                    return !Lda.f7691a.equals(C1308aga.f(t, j3));
                case 11:
                    return C1308aga.a((Object) t, j3) != 0;
                case 12:
                    return C1308aga.a((Object) t, j3) != 0;
                case 13:
                    return C1308aga.a((Object) t, j3) != 0;
                case 14:
                    return C1308aga.b(t, j3) != 0;
                case 15:
                    return C1308aga.a((Object) t, j3) != 0;
                case 16:
                    return C1308aga.b(t, j3) != 0;
                case 17:
                    return C1308aga.f(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C1308aga.a((Object) t, j2) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return C1308aga.a((Object) t, (long) (e(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? a(t, i2) : (i4 & i5) != 0;
    }

    private static boolean a(Object obj, int i2, Cfa cfa) {
        return cfa.a(C1308aga.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) C1308aga.f(t, j2)).doubleValue();
    }

    private final int b(int i2, int i3) {
        int length = (this.f11207c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f11207c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final Object b(int i2) {
        return this.f11208d[(i2 / 3) << 1];
    }

    private final void b(T t, int i2) {
        int e2 = e(i2);
        long j2 = (long) (1048575 & e2);
        if (j2 != 1048575) {
            C1308aga.a((Object) t, j2, (1 << (e2 >>> 20)) | C1308aga.a((Object) t, j2));
        }
    }

    private final void b(T t, int i2, int i3) {
        C1308aga.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r17, com.google.android.gms.internal.ads.C2583sga r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f11212h
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.mea<?> r3 = r0.r
            com.google.android.gms.internal.ads.nea r3 = r3.a((java.lang.Object) r1)
            com.google.android.gms.internal.ads.Hfa<T, java.lang.Object> r5 = r3.f11484b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.d()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            int[] r5 = r0.f11207c
            int r5 = r5.length
            sun.misc.Unsafe r6 = f11206b
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0031:
            if (r9 >= r5) goto L_0x046d
            int r12 = r0.d((int) r9)
            int[] r13 = r0.f11207c
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.j
            r8 = 1
            if (r4 != 0) goto L_0x005e
            r4 = 17
            if (r15 > r4) goto L_0x005e
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x0057
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            goto L_0x0058
        L_0x0057:
            r13 = r10
        L_0x0058:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            r10 = r13
            goto L_0x005f
        L_0x005e:
            r4 = 0
        L_0x005f:
            if (r3 != 0) goto L_0x0466
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0457;
                case 1: goto L_0x044b;
                case 2: goto L_0x043f;
                case 3: goto L_0x0433;
                case 4: goto L_0x0427;
                case 5: goto L_0x041b;
                case 6: goto L_0x040f;
                case 7: goto L_0x0403;
                case 8: goto L_0x03f7;
                case 9: goto L_0x03e6;
                case 10: goto L_0x03d7;
                case 11: goto L_0x03ca;
                case 12: goto L_0x03bd;
                case 13: goto L_0x03b0;
                case 14: goto L_0x03a3;
                case 15: goto L_0x0396;
                case 16: goto L_0x0389;
                case 17: goto L_0x0378;
                case 18: goto L_0x0368;
                case 19: goto L_0x0358;
                case 20: goto L_0x0348;
                case 21: goto L_0x0338;
                case 22: goto L_0x0328;
                case 23: goto L_0x0318;
                case 24: goto L_0x0308;
                case 25: goto L_0x02f8;
                case 26: goto L_0x02e9;
                case 27: goto L_0x02d6;
                case 28: goto L_0x02c7;
                case 29: goto L_0x02b7;
                case 30: goto L_0x02a7;
                case 31: goto L_0x0297;
                case 32: goto L_0x0287;
                case 33: goto L_0x0277;
                case 34: goto L_0x0267;
                case 35: goto L_0x0258;
                case 36: goto L_0x0249;
                case 37: goto L_0x023a;
                case 38: goto L_0x022b;
                case 39: goto L_0x021c;
                case 40: goto L_0x020d;
                case 41: goto L_0x01fe;
                case 42: goto L_0x01ef;
                case 43: goto L_0x01e0;
                case 44: goto L_0x01d1;
                case 45: goto L_0x01c2;
                case 46: goto L_0x01b3;
                case 47: goto L_0x01a4;
                case 48: goto L_0x0195;
                case 49: goto L_0x0182;
                case 50: goto L_0x0179;
                case 51: goto L_0x016a;
                case 52: goto L_0x015b;
                case 53: goto L_0x014c;
                case 54: goto L_0x013d;
                case 55: goto L_0x012e;
                case 56: goto L_0x011f;
                case 57: goto L_0x0110;
                case 58: goto L_0x0101;
                case 59: goto L_0x00f2;
                case 60: goto L_0x00df;
                case 61: goto L_0x00cf;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b3;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0097;
                case 66: goto L_0x0089;
                case 67: goto L_0x007b;
                case 68: goto L_0x0069;
                default: goto L_0x0066;
            }
        L_0x0066:
            r15 = 0
            goto L_0x0462
        L_0x0069:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r9)
            r2.a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0066
        L_0x007b:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            long r12 = e(r1, r12)
            r2.a((int) r14, (long) r12)
            goto L_0x0066
        L_0x0089:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            int r4 = d(r1, r12)
            r2.b((int) r14, (int) r4)
            goto L_0x0066
        L_0x0097:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            long r12 = e(r1, r12)
            r2.e((int) r14, (long) r12)
            goto L_0x0066
        L_0x00a5:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            int r4 = d(r1, r12)
            r2.e((int) r14, (int) r4)
            goto L_0x0066
        L_0x00b3:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            int r4 = d(r1, r12)
            r2.a((int) r14, (int) r4)
            goto L_0x0066
        L_0x00c1:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            int r4 = d(r1, r12)
            r2.f(r14, r4)
            goto L_0x0066
        L_0x00cf:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.Lda r4 = (com.google.android.gms.internal.ads.Lda) r4
            r2.a((int) r14, (com.google.android.gms.internal.ads.Lda) r4)
            goto L_0x0066
        L_0x00df:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r9)
            r2.b((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0066
        L_0x00f2:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r6.getObject(r1, r12)
            a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C2583sga) r2)
            goto L_0x0066
        L_0x0101:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            boolean r4 = f(r1, r12)
            r2.a((int) r14, (boolean) r4)
            goto L_0x0066
        L_0x0110:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            int r4 = d(r1, r12)
            r2.c((int) r14, (int) r4)
            goto L_0x0066
        L_0x011f:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            long r12 = e(r1, r12)
            r2.b((int) r14, (long) r12)
            goto L_0x0066
        L_0x012e:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            int r4 = d(r1, r12)
            r2.d((int) r14, (int) r4)
            goto L_0x0066
        L_0x013d:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            long r12 = e(r1, r12)
            r2.d((int) r14, (long) r12)
            goto L_0x0066
        L_0x014c:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            long r12 = e(r1, r12)
            r2.c((int) r14, (long) r12)
            goto L_0x0066
        L_0x015b:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            float r4 = c(r1, r12)
            r2.a((int) r14, (float) r4)
            goto L_0x0066
        L_0x016a:
            boolean r4 = r0.a(r1, (int) r14, (int) r9)
            if (r4 == 0) goto L_0x0066
            double r12 = b(r1, (long) r12)
            r2.a((int) r14, (double) r12)
            goto L_0x0066
        L_0x0179:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.a((com.google.android.gms.internal.ads.C2583sga) r2, (int) r14, (java.lang.Object) r4, (int) r9)
            goto L_0x0066
        L_0x0182:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Cfa r12 = r0.a((int) r9)
            com.google.android.gms.internal.ads.Efa.b((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C2583sga) r2, (com.google.android.gms.internal.ads.Cfa) r12)
            goto L_0x0066
        L_0x0195:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.e(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01a4:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.j(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01b3:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.g(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01c2:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.l(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01d1:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.m(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01e0:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.i(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01ef:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.n(r4, r12, r2, r8)
            goto L_0x0066
        L_0x01fe:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.k(r4, r12, r2, r8)
            goto L_0x0066
        L_0x020d:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.f(r4, r12, r2, r8)
            goto L_0x0066
        L_0x021c:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.h(r4, r12, r2, r8)
            goto L_0x0066
        L_0x022b:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.d(r4, r12, r2, r8)
            goto L_0x0066
        L_0x023a:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.c(r4, r12, r2, r8)
            goto L_0x0066
        L_0x0249:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.b((int) r4, (java.util.List<java.lang.Float>) r12, (com.google.android.gms.internal.ads.C2583sga) r2, (boolean) r8)
            goto L_0x0066
        L_0x0258:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.Efa.a((int) r4, (java.util.List<java.lang.Double>) r12, (com.google.android.gms.internal.ads.C2583sga) r2, (boolean) r8)
            goto L_0x0066
        L_0x0267:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.ads.Efa.e(r4, r8, r2, r14)
            goto L_0x0066
        L_0x0277:
            r14 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.j(r4, r8, r2, r14)
            goto L_0x0066
        L_0x0287:
            r14 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.g(r4, r8, r2, r14)
            goto L_0x0066
        L_0x0297:
            r14 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.l(r4, r8, r2, r14)
            goto L_0x0066
        L_0x02a7:
            r14 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.m(r4, r8, r2, r14)
            goto L_0x0066
        L_0x02b7:
            r14 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.i(r4, r8, r2, r14)
            goto L_0x0066
        L_0x02c7:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.b((int) r4, (java.util.List<com.google.android.gms.internal.ads.Lda>) r8, (com.google.android.gms.internal.ads.C2583sga) r2)
            goto L_0x0066
        L_0x02d6:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Cfa r12 = r0.a((int) r9)
            com.google.android.gms.internal.ads.Efa.a((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C2583sga) r2, (com.google.android.gms.internal.ads.Cfa) r12)
            goto L_0x0066
        L_0x02e9:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.a((int) r4, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.C2583sga) r2)
            goto L_0x0066
        L_0x02f8:
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.ads.Efa.n(r4, r8, r2, r15)
            goto L_0x0462
        L_0x0308:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.k(r4, r8, r2, r15)
            goto L_0x0462
        L_0x0318:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.f(r4, r8, r2, r15)
            goto L_0x0462
        L_0x0328:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.h(r4, r8, r2, r15)
            goto L_0x0462
        L_0x0338:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.d(r4, r8, r2, r15)
            goto L_0x0462
        L_0x0348:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.c(r4, r8, r2, r15)
            goto L_0x0462
        L_0x0358:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.b((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C2583sga) r2, (boolean) r15)
            goto L_0x0462
        L_0x0368:
            r15 = 0
            int[] r4 = r0.f11207c
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.a((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C2583sga) r2, (boolean) r15)
            goto L_0x0462
        L_0x0378:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r9)
            r2.a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0462
        L_0x0389:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            long r12 = r6.getLong(r1, r12)
            r2.a((int) r14, (long) r12)
            goto L_0x0462
        L_0x0396:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            int r4 = r6.getInt(r1, r12)
            r2.b((int) r14, (int) r4)
            goto L_0x0462
        L_0x03a3:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            long r12 = r6.getLong(r1, r12)
            r2.e((int) r14, (long) r12)
            goto L_0x0462
        L_0x03b0:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            int r4 = r6.getInt(r1, r12)
            r2.e((int) r14, (int) r4)
            goto L_0x0462
        L_0x03bd:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            int r4 = r6.getInt(r1, r12)
            r2.a((int) r14, (int) r4)
            goto L_0x0462
        L_0x03ca:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            int r4 = r6.getInt(r1, r12)
            r2.f(r14, r4)
            goto L_0x0462
        L_0x03d7:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.Lda r4 = (com.google.android.gms.internal.ads.Lda) r4
            r2.a((int) r14, (com.google.android.gms.internal.ads.Lda) r4)
            goto L_0x0462
        L_0x03e6:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r9)
            r2.b((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0462
        L_0x03f7:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            java.lang.Object r4 = r6.getObject(r1, r12)
            a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C2583sga) r2)
            goto L_0x0462
        L_0x0403:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            boolean r4 = com.google.android.gms.internal.ads.C1308aga.c(r1, r12)
            r2.a((int) r14, (boolean) r4)
            goto L_0x0462
        L_0x040f:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            int r4 = r6.getInt(r1, r12)
            r2.c((int) r14, (int) r4)
            goto L_0x0462
        L_0x041b:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            long r12 = r6.getLong(r1, r12)
            r2.b((int) r14, (long) r12)
            goto L_0x0462
        L_0x0427:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            int r4 = r6.getInt(r1, r12)
            r2.d((int) r14, (int) r4)
            goto L_0x0462
        L_0x0433:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            long r12 = r6.getLong(r1, r12)
            r2.d((int) r14, (long) r12)
            goto L_0x0462
        L_0x043f:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            long r12 = r6.getLong(r1, r12)
            r2.c((int) r14, (long) r12)
            goto L_0x0462
        L_0x044b:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            float r4 = com.google.android.gms.internal.ads.C1308aga.d(r1, r12)
            r2.a((int) r14, (float) r4)
            goto L_0x0462
        L_0x0457:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0462
            double r12 = com.google.android.gms.internal.ads.C1308aga.e(r1, r12)
            r2.a((int) r14, (double) r12)
        L_0x0462:
            int r9 = r9 + 3
            goto L_0x0031
        L_0x0466:
            com.google.android.gms.internal.ads.mea<?> r1 = r0.r
            r1.a((java.util.Map.Entry<?, ?>) r3)
            r4 = 0
            throw r4
        L_0x046d:
            r4 = 0
            if (r3 != 0) goto L_0x0476
            com.google.android.gms.internal.ads.Vfa<?, ?> r3 = r0.q
            a(r3, r1, (com.google.android.gms.internal.ads.C2583sga) r2)
            return
        L_0x0476:
            com.google.android.gms.internal.ads.mea<?> r1 = r0.r
            r1.a(r2, r3)
            goto L_0x047d
        L_0x047c:
            throw r4
        L_0x047d:
            goto L_0x047c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.b(java.lang.Object, com.google.android.gms.internal.ads.sga):void");
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.f11207c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = C1308aga.f(t, j2);
            Object f3 = C1308aga.f(t2, j2);
            if (f2 != null && f3 != null) {
                C1308aga.a((Object) t, j2, Aea.a(f2, f3));
                b(t, i3, i2);
            } else if (f3 != null) {
                C1308aga.a((Object) t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) C1308aga.f(t, j2)).floatValue();
    }

    private final Bea c(int i2) {
        return (Bea) this.f11208d[((i2 / 3) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.f11207c[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) C1308aga.f(t, j2)).intValue();
    }

    private final int e(int i2) {
        return this.f11207c[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) C1308aga.f(t, j2)).longValue();
    }

    private static Yfa e(Object obj) {
        C2934xea xea = (C2934xea) obj;
        Yfa yfa = xea.zzino;
        if (yfa != Yfa.c()) {
            return yfa;
        }
        Yfa d2 = Yfa.d();
        xea.zzino = d2;
        return d2;
    }

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) C1308aga.f(t, j2)).booleanValue();
    }

    private final int g(int i2) {
        if (i2 < this.f11209e || i2 > this.f11210f) {
            return -1;
        }
        return b(i2, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f9, code lost:
        r10.putObject(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0247, code lost:
        r5 = r6 | r23;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024b, code lost:
        r3 = r8;
        r1 = r9;
        r9 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0291, code lost:
        r10.putInt(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02b4, code lost:
        r0.putLong(r1, r2, r17);
        r5 = r6 | r23;
        r6 = r31;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f7, code lost:
        r5 = r6 | r23;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fb, code lost:
        r3 = r8;
        r1 = r9;
        r2 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ff, code lost:
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0301, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0305, code lost:
        r24 = r31;
        r2 = r3;
        r23 = r6;
        r7 = r8;
        r31 = r9;
        r27 = r10;
        r18 = r11;
        r6 = r33;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0470  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.Kda r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f11206b
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x04ae
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.ads.Hda.a((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.Kda) r9)
            int r3 = r9.f7572a
            r4 = r3
            r3 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x003a
            int r2 = r2 / r8
            int r1 = r15.a((int) r0, (int) r2)
            goto L_0x003e
        L_0x003a:
            int r1 = r15.g(r0)
        L_0x003e:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0053
            r31 = r0
            r2 = r3
            r7 = r4
            r23 = r5
            r24 = r6
            r27 = r10
            r6 = r11
            r18 = 0
            r19 = -1
            goto L_0x0413
        L_0x0053:
            int[] r1 = r15.f11207c
            int r20 = r2 + 1
            r8 = r1[r20]
            r20 = 267386880(0xff00000, float:2.3665827E-29)
            r20 = r8 & r20
            int r11 = r20 >>> 20
            r20 = r4
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r8 & r18
            long r12 = (long) r4
            r4 = 17
            r21 = r8
            if (r11 > r4) goto L_0x0315
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r8 = 1
            int r23 = r8 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r6) goto L_0x0089
            if (r6 == r4) goto L_0x0082
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x0082:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            goto L_0x008a
        L_0x0089:
            r8 = r6
        L_0x008a:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02db;
                case 1: goto L_0x02bf;
                case 2: goto L_0x0296;
                case 3: goto L_0x0296;
                case 4: goto L_0x0279;
                case 5: goto L_0x0252;
                case 6: goto L_0x022a;
                case 7: goto L_0x01fd;
                case 8: goto L_0x01d3;
                case 9: goto L_0x01a0;
                case 10: goto L_0x0182;
                case 11: goto L_0x0279;
                case 12: goto L_0x0147;
                case 13: goto L_0x022a;
                case 14: goto L_0x0252;
                case 15: goto L_0x0129;
                case 16: goto L_0x00fa;
                case 17: goto L_0x00a0;
                default: goto L_0x008f;
            }
        L_0x008f:
            r12 = r30
            r13 = r34
            r9 = r0
            r11 = r2
            r31 = r8
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0305
        L_0x00a0:
            r5 = 3
            if (r7 != r5) goto L_0x00e8
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.android.gms.internal.ads.Cfa r1 = r15.a((int) r2)
            r9 = r0
            r0 = r1
            r19 = -1
            r1 = r30
            r11 = r2
            r2 = r3
            r3 = r32
            r7 = r20
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.Kda) r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x00ca
            r4 = r34
            java.lang.Object r1 = r4.f7574c
            goto L_0x00d6
        L_0x00ca:
            r4 = r34
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r4.f7574c
            java.lang.Object r1 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r1, (java.lang.Object) r2)
        L_0x00d6:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r23
            r12 = r30
            r13 = r32
            r3 = r7
            r6 = r8
            r1 = r9
            r2 = r11
            r11 = r33
            r9 = r4
            goto L_0x0019
        L_0x00e8:
            r9 = r0
            r11 = r2
            r7 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            r31 = r8
            r8 = r7
            goto L_0x0305
        L_0x00fa:
            r4 = r34
            r9 = r0
            r11 = r2
            r5 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0121
            r1 = r12
            r12 = r30
            int r7 = com.google.android.gms.internal.ads.Hda.b(r12, r3, r4)
            r21 = r1
            long r0 = r4.f7573b
            long r17 = com.google.android.gms.internal.ads.C1304aea.a((long) r0)
            r0 = r10
            r2 = r21
            r1 = r29
            r13 = r4
            r31 = r8
            r8 = r5
            goto L_0x02b4
        L_0x0121:
            r12 = r30
            r13 = r4
            r31 = r8
            r8 = r5
            goto L_0x0305
        L_0x0129:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != 0) goto L_0x0305
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r3, r13)
            int r1 = r13.f7572a
            int r1 = com.google.android.gms.internal.ads.C1304aea.e(r1)
            goto L_0x0291
        L_0x0147:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != 0) goto L_0x0305
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r3, r13)
            int r1 = r13.f7572a
            com.google.android.gms.internal.ads.Bea r2 = r15.c((int) r11)
            if (r2 == 0) goto L_0x0291
            boolean r2 = r2.a(r1)
            if (r2 == 0) goto L_0x016d
            goto L_0x0291
        L_0x016d:
            com.google.android.gms.internal.ads.Yfa r2 = e((java.lang.Object) r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.a((int) r8, (java.lang.Object) r1)
            r5 = r6
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r6 = r31
            goto L_0x02ff
        L_0x0182:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != r0) goto L_0x0305
            int r0 = com.google.android.gms.internal.ads.Hda.e(r12, r3, r13)
            java.lang.Object r1 = r13.f7574c
            r10.putObject(r14, r4, r1)
            goto L_0x02f7
        L_0x01a0:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != r0) goto L_0x01cf
            com.google.android.gms.internal.ads.Cfa r0 = r15.a((int) r11)
            r2 = r32
            int r0 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r0, (byte[]) r12, (int) r3, (int) r2, (com.google.android.gms.internal.ads.Kda) r13)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x01c4
            java.lang.Object r1 = r13.f7574c
            goto L_0x01f9
        L_0x01c4:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r13.f7574c
            java.lang.Object r1 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r1, (java.lang.Object) r3)
            goto L_0x01f9
        L_0x01cf:
            r2 = r32
            goto L_0x0305
        L_0x01d3:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r2 = r32
            r13 = r34
            if (r7 != r0) goto L_0x0305
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01f3
            int r0 = com.google.android.gms.internal.ads.Hda.c(r12, r3, r13)
            goto L_0x01f7
        L_0x01f3:
            int r0 = com.google.android.gms.internal.ads.Hda.d(r12, r3, r13)
        L_0x01f7:
            java.lang.Object r1 = r13.f7574c
        L_0x01f9:
            r10.putObject(r14, r4, r1)
            goto L_0x0247
        L_0x01fd:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r2 = r32
            r13 = r34
            if (r7 != 0) goto L_0x0305
            int r0 = com.google.android.gms.internal.ads.Hda.b(r12, r3, r13)
            r3 = r0
            long r0 = r13.f7573b
            r21 = 0
            int r7 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r7 == 0) goto L_0x0220
            r0 = 1
            goto L_0x0221
        L_0x0220:
            r0 = 0
        L_0x0221:
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r14, (long) r4, (boolean) r0)
            r5 = r6 | r23
            r6 = r31
            r0 = r3
            goto L_0x024b
        L_0x022a:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r2 = r32
            r13 = r34
            if (r7 != r1) goto L_0x0305
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x0247:
            r5 = r6 | r23
            r6 = r31
        L_0x024b:
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            goto L_0x0301
        L_0x0252:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r0 = 1
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r2 = r32
            r13 = r34
            if (r7 != r0) goto L_0x0305
            long r17 = com.google.android.gms.internal.ads.Hda.b(r12, r3)
            r0 = r10
            r1 = r29
            r7 = r3
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x02f7
        L_0x0279:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != 0) goto L_0x0305
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r3, r13)
            int r1 = r13.f7572a
        L_0x0291:
            r10.putInt(r14, r4, r1)
            goto L_0x02f7
        L_0x0296:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != 0) goto L_0x0305
            int r7 = com.google.android.gms.internal.ads.Hda.b(r12, r3, r13)
            long r2 = r13.f7573b
            r0 = r10
            r1 = r29
            r17 = r2
            r2 = r4
        L_0x02b4:
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r6 = r31
            r0 = r7
            goto L_0x02fb
        L_0x02bf:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != r1) goto L_0x0305
            float r0 = com.google.android.gms.internal.ads.Hda.d(r12, r3)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r3 + 4
            goto L_0x02f7
        L_0x02db:
            r9 = r0
            r11 = r2
            r31 = r8
            r4 = r12
            r8 = r20
            r0 = 1
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r34
            if (r7 != r0) goto L_0x0305
            double r0 = com.google.android.gms.internal.ads.Hda.c(r12, r3)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r14, (long) r4, (double) r0)
            int r0 = r3 + 8
        L_0x02f7:
            r5 = r6 | r23
            r6 = r31
        L_0x02fb:
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
        L_0x02ff:
            r13 = r32
        L_0x0301:
            r11 = r33
            goto L_0x0019
        L_0x0305:
            r24 = r31
            r2 = r3
            r23 = r6
            r7 = r8
            r31 = r9
            r27 = r10
            r18 = r11
            r6 = r33
            goto L_0x0413
        L_0x0315:
            r4 = r2
            r1 = r12
            r8 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r13 = r9
            r9 = r0
            r0 = 27
            if (r11 != r0) goto L_0x037c
            r0 = 2
            if (r7 != r0) goto L_0x036d
            java.lang.Object r0 = r10.getObject(r14, r1)
            com.google.android.gms.internal.ads.Fea r0 = (com.google.android.gms.internal.ads.Fea) r0
            boolean r7 = r0.n()
            if (r7 != 0) goto L_0x0347
            int r7 = r0.size()
            if (r7 != 0) goto L_0x033e
            r7 = 10
            goto L_0x0340
        L_0x033e:
            int r7 = r7 << 1
        L_0x0340:
            com.google.android.gms.internal.ads.Fea r0 = r0.c(r7)
            r10.putObject(r14, r1, r0)
        L_0x0347:
            r7 = r0
            com.google.android.gms.internal.ads.Cfa r0 = r15.a((int) r4)
            r1 = r8
            r2 = r30
            r18 = r4
            r4 = r32
            r23 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.Hda.a(r0, r1, r2, r3, r4, r5, r6)
            r11 = r33
            r3 = r8
            r1 = r9
            r9 = r13
            r2 = r18
            r5 = r23
            r6 = r24
            r13 = r32
            goto L_0x0019
        L_0x036d:
            r18 = r4
            r23 = r5
            r24 = r6
            r15 = r3
            r20 = r8
            r31 = r9
            r27 = r10
            goto L_0x03db
        L_0x037c:
            r18 = r4
            r23 = r5
            r24 = r6
            r0 = 49
            if (r11 > r0) goto L_0x03c9
            r6 = r21
            long r5 = (long) r6
            r0 = r28
            r25 = r1
            r1 = r29
            r2 = r30
            r4 = r3
            r15 = r4
            r4 = r32
            r21 = r5
            r5 = r8
            r6 = r9
            r20 = r8
            r8 = r18
            r31 = r9
            r27 = r10
            r9 = r21
            r12 = r25
            r14 = r34
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.Kda) r14)
            if (r0 != r15) goto L_0x03af
            goto L_0x040f
        L_0x03af:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r2 = r18
            r3 = r20
        L_0x03c1:
            r5 = r23
            r6 = r24
            r10 = r27
            goto L_0x0019
        L_0x03c9:
            r25 = r1
            r15 = r3
            r20 = r8
            r31 = r9
            r27 = r10
            r6 = r21
            r0 = 50
            if (r11 != r0) goto L_0x03f4
            r0 = 2
            if (r7 == r0) goto L_0x03e1
        L_0x03db:
            r6 = r33
            r2 = r15
        L_0x03de:
            r7 = r20
            goto L_0x0413
        L_0x03e1:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r25
            r8 = r34
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.Kda) r8)
            throw r17
        L_0x03f4:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r20
            r8 = r6
            r6 = r31
            r9 = r11
            r10 = r25
            r12 = r18
            r13 = r34
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.Kda) r13)
            if (r0 != r15) goto L_0x0498
        L_0x040f:
            r6 = r33
            r2 = r0
            goto L_0x03de
        L_0x0413:
            if (r7 != r6) goto L_0x0426
            if (r6 != 0) goto L_0x0418
            goto L_0x0426
        L_0x0418:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r28
            r11 = r29
            r3 = r7
            r1 = r23
            r0 = r24
            goto L_0x04bf
        L_0x0426:
            r8 = r28
            boolean r0 = r8.f11212h
            if (r0 == 0) goto L_0x0470
            r9 = r34
            com.google.android.gms.internal.ads.kea r0 = r9.f7575d
            com.google.android.gms.internal.ads.kea r1 = com.google.android.gms.internal.ads.C2012kea.a()
            if (r0 == r1) goto L_0x046b
            com.google.android.gms.internal.ads.ifa r0 = r8.f11211g
            com.google.android.gms.internal.ads.kea r1 = r9.f7575d
            r10 = r31
            com.google.android.gms.internal.ads.xea$d r0 = r1.a(r0, r10)
            if (r0 != 0) goto L_0x045b
            com.google.android.gms.internal.ads.Yfa r4 = e((java.lang.Object) r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.Hda.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.Yfa) r4, (com.google.android.gms.internal.ads.Kda) r5)
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r6
            r3 = r7
            r15 = r8
            goto L_0x04a9
        L_0x045b:
            r11 = r29
            r0 = r11
            com.google.android.gms.internal.ads.xea$b r0 = (com.google.android.gms.internal.ads.C2934xea.b) r0
            r0.o()
            com.google.android.gms.internal.ads.nea<com.google.android.gms.internal.ads.xea$e> r0 = r0.zzinr
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x046b:
            r11 = r29
            r10 = r31
            goto L_0x0476
        L_0x0470:
            r11 = r29
            r10 = r31
            r9 = r34
        L_0x0476:
            com.google.android.gms.internal.ads.Yfa r4 = e((java.lang.Object) r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.Hda.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.Yfa) r4, (com.google.android.gms.internal.ads.Kda) r5)
            r12 = r30
            r13 = r32
            r3 = r7
            r15 = r8
            r1 = r10
            r14 = r11
            r2 = r18
            r5 = r23
            r10 = r27
            r11 = r6
            r6 = r24
            goto L_0x0019
        L_0x0498:
            r10 = r31
            r7 = r20
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r3 = r7
        L_0x04a9:
            r1 = r10
            r2 = r18
            goto L_0x03c1
        L_0x04ae:
            r23 = r5
            r24 = r6
            r27 = r10
            r6 = r11
            r11 = r14
            r8 = r15
            r2 = r0
            r1 = r23
            r0 = r24
            r4 = 1048575(0xfffff, float:1.469367E-39)
        L_0x04bf:
            if (r0 == r4) goto L_0x04c7
            long r4 = (long) r0
            r0 = r27
            r0.putInt(r11, r4, r1)
        L_0x04c7:
            int r0 = r8.m
            r1 = r17
        L_0x04cb:
            int r4 = r8.n
            if (r0 >= r4) goto L_0x04dd
            int[] r4 = r8.l
            r4 = r4[r0]
            com.google.android.gms.internal.ads.Vfa<?, ?> r5 = r8.q
            r8.a((java.lang.Object) r11, (int) r4, r1, r5)
            com.google.android.gms.internal.ads.Yfa r1 = (com.google.android.gms.internal.ads.Yfa) r1
            int r0 = r0 + 1
            goto L_0x04cb
        L_0x04dd:
            if (r1 == 0) goto L_0x04e4
            com.google.android.gms.internal.ads.Vfa<?, ?> r0 = r8.q
            r0.b((java.lang.Object) r11, r1)
        L_0x04e4:
            if (r6 != 0) goto L_0x04f0
            r0 = r32
            if (r2 != r0) goto L_0x04eb
            goto L_0x04f6
        L_0x04eb:
            com.google.android.gms.internal.ads.Iea r0 = com.google.android.gms.internal.ads.Iea.h()
            throw r0
        L_0x04f0:
            r0 = r32
            if (r2 > r0) goto L_0x04f7
            if (r3 != r6) goto L_0x04f7
        L_0x04f6:
            return r2
        L_0x04f7:
            com.google.android.gms.internal.ads.Iea r0 = com.google.android.gms.internal.ads.Iea.h()
            goto L_0x04fd
        L_0x04fc:
            throw r0
        L_0x04fd:
            goto L_0x04fc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.Kda):int");
    }

    public final T a() {
        return this.o.a(this.f11211g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0345, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0356, code lost:
        r14.b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0367, code lost:
        r14.e(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0378, code lost:
        r14.e(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0389, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039a, code lost:
        r14.f(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a5, code lost:
        r14.a(r9, (com.google.android.gms.internal.ads.Lda) com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r7 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b8, code lost:
        r14.b(r9, com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r7 & 1048575)), a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cd, code lost:
        a(r9, com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r7 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e4, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f5, code lost:
        r14.c(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        r14.b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0415, code lost:
        r14.d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0425, code lost:
        r14.d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0435, code lost:
        r14.c(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0445, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0455, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0783, code lost:
        r14.a(r10, com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079e, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07af, code lost:
        r14.b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07c0, code lost:
        r14.e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07d1, code lost:
        r14.e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07e2, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07f3, code lost:
        r14.f(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07fe, code lost:
        r14.a(r10, (com.google.android.gms.internal.ads.Lda) com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0811, code lost:
        r14.b(r10, com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0826, code lost:
        a(r10, com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r8 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x083d, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x084e, code lost:
        r14.c(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x085e, code lost:
        r14.b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x086e, code lost:
        r14.d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087e, code lost:
        r14.d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x088e, code lost:
        r14.c(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089e, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ae, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032a, code lost:
        r14.a(r9, com.google.android.gms.internal.ads.C1308aga.f(r13, (long) (r7 & 1048575)), a(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, com.google.android.gms.internal.ads.C2583sga r14) {
        /*
            r12 = this;
            int r0 = r14.a()
            int r1 = com.google.android.gms.internal.ads.C2512rga.f12005b
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x046b
            com.google.android.gms.internal.ads.Vfa<?, ?> r0 = r12.q
            a(r0, r13, (com.google.android.gms.internal.ads.C2583sga) r14)
            boolean r0 = r12.f11212h
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.mea<?> r0 = r12.r
            com.google.android.gms.internal.ads.nea r0 = r0.a((java.lang.Object) r13)
            com.google.android.gms.internal.ads.Hfa<T, java.lang.Object> r1 = r0.f11484b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.f11207c
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x0462
            int r7 = r12.d((int) r1)
            int[] r8 = r12.f11207c
            r9 = r8[r1]
            if (r0 != 0) goto L_0x045c
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0449;
                case 1: goto L_0x0439;
                case 2: goto L_0x0429;
                case 3: goto L_0x0419;
                case 4: goto L_0x0409;
                case 5: goto L_0x03f9;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03d8;
                case 8: goto L_0x03c7;
                case 9: goto L_0x03b2;
                case 10: goto L_0x039f;
                case 11: goto L_0x038e;
                case 12: goto L_0x037d;
                case 13: goto L_0x036c;
                case 14: goto L_0x035b;
                case 15: goto L_0x034a;
                case 16: goto L_0x0339;
                case 17: goto L_0x0324;
                case 18: goto L_0x0315;
                case 19: goto L_0x0306;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02e8;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02ca;
                case 24: goto L_0x02bb;
                case 25: goto L_0x02ac;
                case 26: goto L_0x029d;
                case 27: goto L_0x028a;
                case 28: goto L_0x027b;
                case 29: goto L_0x026c;
                case 30: goto L_0x025d;
                case 31: goto L_0x024e;
                case 32: goto L_0x023f;
                case 33: goto L_0x0230;
                case 34: goto L_0x0221;
                case 35: goto L_0x0212;
                case 36: goto L_0x0203;
                case 37: goto L_0x01f4;
                case 38: goto L_0x01e5;
                case 39: goto L_0x01d6;
                case 40: goto L_0x01c7;
                case 41: goto L_0x01b8;
                case 42: goto L_0x01a9;
                case 43: goto L_0x019a;
                case 44: goto L_0x018b;
                case 45: goto L_0x017c;
                case 46: goto L_0x016d;
                case 47: goto L_0x015e;
                case 48: goto L_0x014f;
                case 49: goto L_0x013c;
                case 50: goto L_0x0131;
                case 51: goto L_0x0123;
                case 52: goto L_0x0115;
                case 53: goto L_0x0107;
                case 54: goto L_0x00f9;
                case 55: goto L_0x00eb;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00b9;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a9;
                case 62: goto L_0x009b;
                case 63: goto L_0x008d;
                case 64: goto L_0x007f;
                case 65: goto L_0x0071;
                case 66: goto L_0x0063;
                case 67: goto L_0x0055;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0458
        L_0x004d:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x032a
        L_0x0055:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = e(r13, r7)
            goto L_0x0345
        L_0x0063:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = d(r13, r7)
            goto L_0x0356
        L_0x0071:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = e(r13, r7)
            goto L_0x0367
        L_0x007f:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = d(r13, r7)
            goto L_0x0378
        L_0x008d:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = d(r13, r7)
            goto L_0x0389
        L_0x009b:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = d(r13, r7)
            goto L_0x039a
        L_0x00a9:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03a5
        L_0x00b1:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03b8
        L_0x00b9:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03cd
        L_0x00c1:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = f(r13, r7)
            goto L_0x03e4
        L_0x00cf:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = d(r13, r7)
            goto L_0x03f5
        L_0x00dd:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = e(r13, r7)
            goto L_0x0405
        L_0x00eb:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = d(r13, r7)
            goto L_0x0415
        L_0x00f9:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = e(r13, r7)
            goto L_0x0425
        L_0x0107:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = e(r13, r7)
            goto L_0x0435
        L_0x0115:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = c(r13, r7)
            goto L_0x0445
        L_0x0123:
            boolean r8 = r12.a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = b(r13, (long) r7)
            goto L_0x0455
        L_0x0131:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r7)
            r12.a((com.google.android.gms.internal.ads.C2583sga) r14, (int) r9, (java.lang.Object) r7, (int) r1)
            goto L_0x0458
        L_0x013c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Cfa r9 = r12.a((int) r1)
            com.google.android.gms.internal.ads.Efa.b((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.ads.C2583sga) r14, (com.google.android.gms.internal.ads.Cfa) r9)
            goto L_0x0458
        L_0x014f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.e(r8, r7, r14, r4)
            goto L_0x0458
        L_0x015e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.j(r8, r7, r14, r4)
            goto L_0x0458
        L_0x016d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.g(r8, r7, r14, r4)
            goto L_0x0458
        L_0x017c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.l(r8, r7, r14, r4)
            goto L_0x0458
        L_0x018b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.m(r8, r7, r14, r4)
            goto L_0x0458
        L_0x019a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.i(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01a9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.n(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01b8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.k(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01c7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.f(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01d6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.h(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01e5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.d(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01f4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.c(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0203:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r4)
            goto L_0x0458
        L_0x0212:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r4)
            goto L_0x0458
        L_0x0221:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.e(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0230:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.j(r8, r7, r14, r5)
            goto L_0x0458
        L_0x023f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.g(r8, r7, r14, r5)
            goto L_0x0458
        L_0x024e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.l(r8, r7, r14, r5)
            goto L_0x0458
        L_0x025d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.m(r8, r7, r14, r5)
            goto L_0x0458
        L_0x026c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.i(r8, r7, r14, r5)
            goto L_0x0458
        L_0x027b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.b((int) r8, (java.util.List<com.google.android.gms.internal.ads.Lda>) r7, (com.google.android.gms.internal.ads.C2583sga) r14)
            goto L_0x0458
        L_0x028a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Cfa r9 = r12.a((int) r1)
            com.google.android.gms.internal.ads.Efa.a((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.ads.C2583sga) r14, (com.google.android.gms.internal.ads.Cfa) r9)
            goto L_0x0458
        L_0x029d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.a((int) r8, (java.util.List<java.lang.String>) r7, (com.google.android.gms.internal.ads.C2583sga) r14)
            goto L_0x0458
        L_0x02ac:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.n(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02bb:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.k(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02ca:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.f(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02d9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.h(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02e8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.d(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02f7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.c(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0306:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r5)
            goto L_0x0458
        L_0x0315:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Efa.a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r5)
            goto L_0x0458
        L_0x0324:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x032a:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r7)
            com.google.android.gms.internal.ads.Cfa r8 = r12.a((int) r1)
            r14.a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0458
        L_0x0339:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C1308aga.b(r13, r7)
        L_0x0345:
            r14.a((int) r9, (long) r7)
            goto L_0x0458
        L_0x034a:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r7)
        L_0x0356:
            r14.b((int) r9, (int) r7)
            goto L_0x0458
        L_0x035b:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C1308aga.b(r13, r7)
        L_0x0367:
            r14.e((int) r9, (long) r7)
            goto L_0x0458
        L_0x036c:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r7)
        L_0x0378:
            r14.e((int) r9, (int) r7)
            goto L_0x0458
        L_0x037d:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r7)
        L_0x0389:
            r14.a((int) r9, (int) r7)
            goto L_0x0458
        L_0x038e:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r7)
        L_0x039a:
            r14.f(r9, r7)
            goto L_0x0458
        L_0x039f:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x03a5:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r7)
            com.google.android.gms.internal.ads.Lda r7 = (com.google.android.gms.internal.ads.Lda) r7
            r14.a((int) r9, (com.google.android.gms.internal.ads.Lda) r7)
            goto L_0x0458
        L_0x03b2:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x03b8:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r7)
            com.google.android.gms.internal.ads.Cfa r8 = r12.a((int) r1)
            r14.b((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0458
        L_0x03c7:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x03cd:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C1308aga.f(r13, r7)
            a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C2583sga) r14)
            goto L_0x0458
        L_0x03d8:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.ads.C1308aga.c(r13, r7)
        L_0x03e4:
            r14.a((int) r9, (boolean) r7)
            goto L_0x0458
        L_0x03e9:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r7)
        L_0x03f5:
            r14.c((int) r9, (int) r7)
            goto L_0x0458
        L_0x03f9:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C1308aga.b(r13, r7)
        L_0x0405:
            r14.b((int) r9, (long) r7)
            goto L_0x0458
        L_0x0409:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r7)
        L_0x0415:
            r14.d((int) r9, (int) r7)
            goto L_0x0458
        L_0x0419:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C1308aga.b(r13, r7)
        L_0x0425:
            r14.d((int) r9, (long) r7)
            goto L_0x0458
        L_0x0429:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C1308aga.b(r13, r7)
        L_0x0435:
            r14.c((int) r9, (long) r7)
            goto L_0x0458
        L_0x0439:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.ads.C1308aga.d(r13, r7)
        L_0x0445:
            r14.a((int) r9, (float) r7)
            goto L_0x0458
        L_0x0449:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.ads.C1308aga.e(r13, r7)
        L_0x0455:
            r14.a((int) r9, (double) r7)
        L_0x0458:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x045c:
            com.google.android.gms.internal.ads.mea<?> r13 = r12.r
            r13.a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x0462:
            if (r0 != 0) goto L_0x0465
            return
        L_0x0465:
            com.google.android.gms.internal.ads.mea<?> r13 = r12.r
            r13.a(r14, r0)
            throw r3
        L_0x046b:
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r12.f11212h
            if (r0 == 0) goto L_0x048c
            com.google.android.gms.internal.ads.mea<?> r0 = r12.r
            com.google.android.gms.internal.ads.nea r0 = r0.a((java.lang.Object) r13)
            com.google.android.gms.internal.ads.Hfa<T, java.lang.Object> r1 = r0.f11484b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x048c
            java.util.Iterator r0 = r0.d()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x048d
        L_0x048c:
            r0 = r3
        L_0x048d:
            int[] r1 = r12.f11207c
            int r1 = r1.length
            r7 = 0
        L_0x0491:
            if (r7 >= r1) goto L_0x08bb
            int r8 = r12.d((int) r7)
            int[] r9 = r12.f11207c
            r10 = r9[r7]
            if (r0 != 0) goto L_0x08b5
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x08a2;
                case 1: goto L_0x0892;
                case 2: goto L_0x0882;
                case 3: goto L_0x0872;
                case 4: goto L_0x0862;
                case 5: goto L_0x0852;
                case 6: goto L_0x0842;
                case 7: goto L_0x0831;
                case 8: goto L_0x0820;
                case 9: goto L_0x080b;
                case 10: goto L_0x07f8;
                case 11: goto L_0x07e7;
                case 12: goto L_0x07d6;
                case 13: goto L_0x07c5;
                case 14: goto L_0x07b4;
                case 15: goto L_0x07a3;
                case 16: goto L_0x0792;
                case 17: goto L_0x077d;
                case 18: goto L_0x076e;
                case 19: goto L_0x075f;
                case 20: goto L_0x0750;
                case 21: goto L_0x0741;
                case 22: goto L_0x0732;
                case 23: goto L_0x0723;
                case 24: goto L_0x0714;
                case 25: goto L_0x0705;
                case 26: goto L_0x06f6;
                case 27: goto L_0x06e3;
                case 28: goto L_0x06d4;
                case 29: goto L_0x06c5;
                case 30: goto L_0x06b6;
                case 31: goto L_0x06a7;
                case 32: goto L_0x0698;
                case 33: goto L_0x0689;
                case 34: goto L_0x067a;
                case 35: goto L_0x066b;
                case 36: goto L_0x065c;
                case 37: goto L_0x064d;
                case 38: goto L_0x063e;
                case 39: goto L_0x062f;
                case 40: goto L_0x0620;
                case 41: goto L_0x0611;
                case 42: goto L_0x0602;
                case 43: goto L_0x05f3;
                case 44: goto L_0x05e4;
                case 45: goto L_0x05d5;
                case 46: goto L_0x05c6;
                case 47: goto L_0x05b7;
                case 48: goto L_0x05a8;
                case 49: goto L_0x0595;
                case 50: goto L_0x058a;
                case 51: goto L_0x057c;
                case 52: goto L_0x056e;
                case 53: goto L_0x0560;
                case 54: goto L_0x0552;
                case 55: goto L_0x0544;
                case 56: goto L_0x0536;
                case 57: goto L_0x0528;
                case 58: goto L_0x051a;
                case 59: goto L_0x0512;
                case 60: goto L_0x050a;
                case 61: goto L_0x0502;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e6;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04ca;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ae;
                case 68: goto L_0x04a6;
                default: goto L_0x04a4;
            }
        L_0x04a4:
            goto L_0x08b1
        L_0x04a6:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0783
        L_0x04ae:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = e(r13, r8)
            goto L_0x079e
        L_0x04bc:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = d(r13, r8)
            goto L_0x07af
        L_0x04ca:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = e(r13, r8)
            goto L_0x07c0
        L_0x04d8:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = d(r13, r8)
            goto L_0x07d1
        L_0x04e6:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = d(r13, r8)
            goto L_0x07e2
        L_0x04f4:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = d(r13, r8)
            goto L_0x07f3
        L_0x0502:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x07fe
        L_0x050a:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0811
        L_0x0512:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0826
        L_0x051a:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = f(r13, r8)
            goto L_0x083d
        L_0x0528:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = d(r13, r8)
            goto L_0x084e
        L_0x0536:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = e(r13, r8)
            goto L_0x085e
        L_0x0544:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = d(r13, r8)
            goto L_0x086e
        L_0x0552:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = e(r13, r8)
            goto L_0x087e
        L_0x0560:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = e(r13, r8)
            goto L_0x088e
        L_0x056e:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = c(r13, r8)
            goto L_0x089e
        L_0x057c:
            boolean r9 = r12.a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = b(r13, (long) r8)
            goto L_0x08ae
        L_0x058a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r8)
            r12.a((com.google.android.gms.internal.ads.C2583sga) r14, (int) r10, (java.lang.Object) r8, (int) r7)
            goto L_0x08b1
        L_0x0595:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Cfa r10 = r12.a((int) r7)
            com.google.android.gms.internal.ads.Efa.b((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C2583sga) r14, (com.google.android.gms.internal.ads.Cfa) r10)
            goto L_0x08b1
        L_0x05a8:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.e(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05b7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.j(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05c6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.g(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05d5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.l(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05e4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.m(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05f3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.i(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0602:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.n(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0611:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.k(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0620:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.f(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x062f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.h(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x063e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.d(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x064d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.c(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x065c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r4)
            goto L_0x08b1
        L_0x066b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r4)
            goto L_0x08b1
        L_0x067a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.e(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0689:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.j(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0698:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.g(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06a7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.l(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06b6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.m(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06c5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.i(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06d4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.b((int) r9, (java.util.List<com.google.android.gms.internal.ads.Lda>) r8, (com.google.android.gms.internal.ads.C2583sga) r14)
            goto L_0x08b1
        L_0x06e3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Cfa r10 = r12.a((int) r7)
            com.google.android.gms.internal.ads.Efa.a((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C2583sga) r14, (com.google.android.gms.internal.ads.Cfa) r10)
            goto L_0x08b1
        L_0x06f6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.a((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.C2583sga) r14)
            goto L_0x08b1
        L_0x0705:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.n(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0714:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.k(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0723:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.f(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0732:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.h(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0741:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.d(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0750:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.c(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x075f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r5)
            goto L_0x08b1
        L_0x076e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Efa.a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C2583sga) r14, (boolean) r5)
            goto L_0x08b1
        L_0x077d:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0783:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r8)
            com.google.android.gms.internal.ads.Cfa r9 = r12.a((int) r7)
            r14.a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.Cfa) r9)
            goto L_0x08b1
        L_0x0792:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C1308aga.b(r13, r8)
        L_0x079e:
            r14.a((int) r10, (long) r8)
            goto L_0x08b1
        L_0x07a3:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r8)
        L_0x07af:
            r14.b((int) r10, (int) r8)
            goto L_0x08b1
        L_0x07b4:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C1308aga.b(r13, r8)
        L_0x07c0:
            r14.e((int) r10, (long) r8)
            goto L_0x08b1
        L_0x07c5:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r8)
        L_0x07d1:
            r14.e((int) r10, (int) r8)
            goto L_0x08b1
        L_0x07d6:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r8)
        L_0x07e2:
            r14.a((int) r10, (int) r8)
            goto L_0x08b1
        L_0x07e7:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r8)
        L_0x07f3:
            r14.f(r10, r8)
            goto L_0x08b1
        L_0x07f8:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x07fe:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r8)
            com.google.android.gms.internal.ads.Lda r8 = (com.google.android.gms.internal.ads.Lda) r8
            r14.a((int) r10, (com.google.android.gms.internal.ads.Lda) r8)
            goto L_0x08b1
        L_0x080b:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0811:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r8)
            com.google.android.gms.internal.ads.Cfa r9 = r12.a((int) r7)
            r14.b((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.Cfa) r9)
            goto L_0x08b1
        L_0x0820:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0826:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C1308aga.f(r13, r8)
            a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C2583sga) r14)
            goto L_0x08b1
        L_0x0831:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.C1308aga.c(r13, r8)
        L_0x083d:
            r14.a((int) r10, (boolean) r8)
            goto L_0x08b1
        L_0x0842:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r8)
        L_0x084e:
            r14.c((int) r10, (int) r8)
            goto L_0x08b1
        L_0x0852:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C1308aga.b(r13, r8)
        L_0x085e:
            r14.b((int) r10, (long) r8)
            goto L_0x08b1
        L_0x0862:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r13, (long) r8)
        L_0x086e:
            r14.d((int) r10, (int) r8)
            goto L_0x08b1
        L_0x0872:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C1308aga.b(r13, r8)
        L_0x087e:
            r14.d((int) r10, (long) r8)
            goto L_0x08b1
        L_0x0882:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C1308aga.b(r13, r8)
        L_0x088e:
            r14.c((int) r10, (long) r8)
            goto L_0x08b1
        L_0x0892:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.ads.C1308aga.d(r13, r8)
        L_0x089e:
            r14.a((int) r10, (float) r8)
            goto L_0x08b1
        L_0x08a2:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.ads.C1308aga.e(r13, r8)
        L_0x08ae:
            r14.a((int) r10, (double) r8)
        L_0x08b1:
            int r7 = r7 + 3
            goto L_0x0491
        L_0x08b5:
            com.google.android.gms.internal.ads.mea<?> r13 = r12.r
            r13.a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x08bb:
            if (r0 != 0) goto L_0x08c3
            com.google.android.gms.internal.ads.Vfa<?, ?> r0 = r12.q
            a(r0, r13, (com.google.android.gms.internal.ads.C2583sga) r14)
            return
        L_0x08c3:
            com.google.android.gms.internal.ads.mea<?> r13 = r12.r
            r13.a(r14, r0)
            throw r3
        L_0x08c9:
            r12.b(r13, (com.google.android.gms.internal.ads.C2583sga) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, com.google.android.gms.internal.ads.sga):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void a(T r11, com.google.android.gms.internal.ads.C2865wfa r12, com.google.android.gms.internal.ads.C2012kea r13) {
        /*
            r10 = this;
            if (r13 == 0) goto L_0x0521
            com.google.android.gms.internal.ads.Vfa<?, ?> r7 = r10.q
            com.google.android.gms.internal.ads.mea<?> r0 = r10.r
            r8 = 0
            r9 = r8
        L_0x0008:
            int r1 = r12.j()     // Catch:{ all -> 0x050a }
            int r2 = r10.g(r1)     // Catch:{ all -> 0x050a }
            if (r2 >= 0) goto L_0x006d
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002d
            int r12 = r10.m
        L_0x0019:
            int r13 = r10.n
            if (r12 >= r13) goto L_0x0027
            int[] r13 = r10.l
            r13 = r13[r12]
            r10.a((java.lang.Object) r11, (int) r13, r9, r7)
            int r12 = r12 + 1
            goto L_0x0019
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r7.b((java.lang.Object) r11, r9)
        L_0x002c:
            return
        L_0x002d:
            boolean r2 = r10.f11212h     // Catch:{ all -> 0x050a }
            if (r2 != 0) goto L_0x0033
            r2 = r8
            goto L_0x003a
        L_0x0033:
            com.google.android.gms.internal.ads.ifa r2 = r10.f11211g     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = r0.a(r13, r2, r1)     // Catch:{ all -> 0x050a }
            r2 = r1
        L_0x003a:
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.nea r4 = r0.b(r11)     // Catch:{ all -> 0x050a }
            r1 = r12
            r3 = r13
            r5 = r9
            r6 = r7
            r0.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x050a }
            throw r8
        L_0x0048:
            r7.a((com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ all -> 0x050a }
            if (r9 != 0) goto L_0x0051
            java.lang.Object r9 = r7.e(r11)     // Catch:{ all -> 0x050a }
        L_0x0051:
            boolean r1 = r7.a(r9, (com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x0008
            int r12 = r10.m
        L_0x0059:
            int r13 = r10.n
            if (r12 >= r13) goto L_0x0067
            int[] r13 = r10.l
            r13 = r13[r12]
            r10.a((java.lang.Object) r11, (int) r13, r9, r7)
            int r12 = r12 + 1
            goto L_0x0059
        L_0x0067:
            if (r9 == 0) goto L_0x006c
            r7.b((java.lang.Object) r11, r9)
        L_0x006c:
            return
        L_0x006d:
            int r3 = r10.d((int) r2)     // Catch:{ all -> 0x050a }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x04bc;
                case 1: goto L_0x04b0;
                case 2: goto L_0x04a4;
                case 3: goto L_0x0498;
                case 4: goto L_0x048c;
                case 5: goto L_0x0480;
                case 6: goto L_0x0474;
                case 7: goto L_0x0468;
                case 8: goto L_0x0463;
                case 9: goto L_0x0438;
                case 10: goto L_0x042d;
                case 11: goto L_0x0422;
                case 12: goto L_0x040b;
                case 13: goto L_0x0400;
                case 14: goto L_0x03f5;
                case 15: goto L_0x03ea;
                case 16: goto L_0x03df;
                case 17: goto L_0x03ae;
                case 18: goto L_0x03a3;
                case 19: goto L_0x0398;
                case 20: goto L_0x038d;
                case 21: goto L_0x0382;
                case 22: goto L_0x0377;
                case 23: goto L_0x036c;
                case 24: goto L_0x0361;
                case 25: goto L_0x0356;
                case 26: goto L_0x0334;
                case 27: goto L_0x0322;
                case 28: goto L_0x0314;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02ed;
                case 32: goto L_0x02e2;
                case 33: goto L_0x02d7;
                case 34: goto L_0x02cc;
                case 35: goto L_0x02be;
                case 36: goto L_0x02b0;
                case 37: goto L_0x02a2;
                case 38: goto L_0x0294;
                case 39: goto L_0x0286;
                case 40: goto L_0x0278;
                case 41: goto L_0x026a;
                case 42: goto L_0x025c;
                case 43: goto L_0x024e;
                case 44: goto L_0x0239;
                case 45: goto L_0x022b;
                case 46: goto L_0x021d;
                case 47: goto L_0x020f;
                case 48: goto L_0x0201;
                case 49: goto L_0x01ef;
                case 50: goto L_0x01b3;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0195;
                case 53: goto L_0x0186;
                case 54: goto L_0x0177;
                case 55: goto L_0x0168;
                case 56: goto L_0x0159;
                case 57: goto L_0x014a;
                case 58: goto L_0x013b;
                case 59: goto L_0x0136;
                case 60: goto L_0x0107;
                case 61: goto L_0x00fd;
                case 62: goto L_0x00ef;
                case 63: goto L_0x00ce;
                case 64: goto L_0x00c0;
                case 65: goto L_0x00b2;
                case 66: goto L_0x00a4;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x007c;
            }
        L_0x007c:
            if (r9 != 0) goto L_0x04c8
            java.lang.Object r9 = r7.a()     // Catch:{ Hea -> 0x04e4 }
            goto L_0x04c8
        L_0x0084:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r5 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r5 = r12.b(r5, r13)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
        L_0x0091:
            r10.b(r11, (int) r1, (int) r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0096:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.h()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x00a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            int r5 = r12.f()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x00b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.d()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x00c0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            int r5 = r12.b()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x00ce:
            int r4 = r12.p()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Bea r6 = r10.c((int) r2)     // Catch:{ Hea -> 0x04e4 }
            if (r6 == 0) goto L_0x00e5
            boolean r6 = r6.a(r4)     // Catch:{ Hea -> 0x04e4 }
            if (r6 == 0) goto L_0x00df
            goto L_0x00e5
        L_0x00df:
            java.lang.Object r9 = com.google.android.gms.internal.ads.Efa.a((int) r1, (int) r4, r9, r7)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x00e5:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r5, (java.lang.Object) r3)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x00ef:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            int r5 = r12.n()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x00fd:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Lda r5 = r12.l()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0107:
            boolean r4 = r10.a(r11, (int) r1, (int) r2)     // Catch:{ Hea -> 0x04e4 }
            if (r4 == 0) goto L_0x0124
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r11, r3)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r6 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r6 = r12.a(r6, r13)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0124:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r5 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r5 = r12.a(r5, r13)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            r10.b(r11, (int) r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0136:
            r10.a((java.lang.Object) r11, (int) r3, (com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x013b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            boolean r5 = r12.g()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x014a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            int r5 = r12.e()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0159:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.c()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0168:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            int r5 = r12.a()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0177:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.m()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0186:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.o()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x0195:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            float r5 = r12.readFloat()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x01a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            double r5 = r12.readDouble()     // Catch:{ Hea -> 0x04e4 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0091
        L_0x01b3:
            java.lang.Object r1 = r10.b((int) r2)     // Catch:{ Hea -> 0x04e4 }
            int r2 = r10.d((int) r2)     // Catch:{ Hea -> 0x04e4 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            if (r4 == 0) goto L_0x01db
            com.google.android.gms.internal.ads.bfa r5 = r10.s     // Catch:{ Hea -> 0x04e4 }
            boolean r5 = r5.b(r4)     // Catch:{ Hea -> 0x04e4 }
            if (r5 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.bfa r5 = r10.s     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r5 = r5.d(r1)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.bfa r6 = r10.s     // Catch:{ Hea -> 0x04e4 }
            r6.a(r5, r4)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r2, (java.lang.Object) r5)     // Catch:{ Hea -> 0x04e4 }
            r4 = r5
            goto L_0x01e4
        L_0x01db:
            com.google.android.gms.internal.ads.bfa r4 = r10.s     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r4 = r4.d(r1)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r2, (java.lang.Object) r4)     // Catch:{ Hea -> 0x04e4 }
        L_0x01e4:
            com.google.android.gms.internal.ads.bfa r2 = r10.s     // Catch:{ Hea -> 0x04e4 }
            r2.f(r4)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.bfa r2 = r10.s     // Catch:{ Hea -> 0x04e4 }
            r2.e(r1)     // Catch:{ Hea -> 0x04e4 }
            throw r8
        L_0x01ef:
            r1 = r3 & r5
            long r3 = (long) r1
            com.google.android.gms.internal.ads.Cfa r1 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Tea r2 = r10.p     // Catch:{ Hea -> 0x04e4 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ Hea -> 0x04e4 }
            r12.a(r2, r1, r13)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0201:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x020a:
            r12.f(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x020f:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0218:
            r12.h(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x021d:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0226:
            r12.a(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x022b:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0234:
            r12.d(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0239:
            com.google.android.gms.internal.ads.Tea r4 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            java.util.List r3 = r4.a(r11, r5)     // Catch:{ Hea -> 0x04e4 }
            r12.e(r3)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Bea r2 = r10.c((int) r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0248:
            java.lang.Object r9 = com.google.android.gms.internal.ads.Efa.a(r1, r3, r2, r9, r7)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x024e:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0257:
            r12.o(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x025c:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0265:
            r12.l(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x026a:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0273:
            r12.g(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0278:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x0281:
            r12.i(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0286:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x028f:
            r12.b(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0294:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x029d:
            r12.n(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x02a2:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x02ab:
            r12.c(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x02b0:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x02b9:
            r12.p(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x02be:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x02c7:
            r12.j(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x02cc:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x020a
        L_0x02d7:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0218
        L_0x02e2:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0226
        L_0x02ed:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0234
        L_0x02f8:
            com.google.android.gms.internal.ads.Tea r4 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ Hea -> 0x04e4 }
            java.util.List r3 = r4.a(r11, r5)     // Catch:{ Hea -> 0x04e4 }
            r12.e(r3)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Bea r2 = r10.c((int) r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0248
        L_0x0309:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0257
        L_0x0314:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            r12.q(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0322:
            com.google.android.gms.internal.ads.Cfa r1 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Tea r4 = r10.p     // Catch:{ Hea -> 0x04e4 }
            java.util.List r2 = r4.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            r12.b(r2, r1, r13)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0334:
            boolean r1 = f(r3)     // Catch:{ Hea -> 0x04e4 }
            if (r1 == 0) goto L_0x0348
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            r12.k(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0348:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            r12.m(r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x0356:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0265
        L_0x0361:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0273
        L_0x036c:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0281
        L_0x0377:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x028f
        L_0x0382:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x029d
        L_0x038d:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x02ab
        L_0x0398:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x02b9
        L_0x03a3:
            com.google.android.gms.internal.ads.Tea r1 = r10.p     // Catch:{ Hea -> 0x04e4 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Hea -> 0x04e4 }
            java.util.List r1 = r1.a(r11, r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x02c7
        L_0x03ae:
            boolean r1 = r10.a(r11, (int) r2)     // Catch:{ Hea -> 0x04e4 }
            if (r1 == 0) goto L_0x03cc
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.C1308aga.f(r11, r3)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r2 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r2 = r12.b(r2, r13)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ Hea -> 0x04e4 }
        L_0x03c7:
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x03cc:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r1 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r1 = r12.b(r1, r13)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r1)     // Catch:{ Hea -> 0x04e4 }
        L_0x03da:
            r10.b(r11, (int) r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x0008
        L_0x03df:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.h()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (long) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x03ea:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            int r1 = r12.f()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (int) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x03f5:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.d()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (long) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0400:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            int r1 = r12.b()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (int) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x040b:
            int r4 = r12.p()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Bea r6 = r10.c((int) r2)     // Catch:{ Hea -> 0x04e4 }
            if (r6 == 0) goto L_0x041b
            boolean r6 = r6.a(r4)     // Catch:{ Hea -> 0x04e4 }
            if (r6 == 0) goto L_0x00df
        L_0x041b:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r5, (int) r4)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0422:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            int r1 = r12.n()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (int) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x042d:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Lda r1 = r12.l()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0438:
            boolean r1 = r10.a(r11, (int) r2)     // Catch:{ Hea -> 0x04e4 }
            if (r1 == 0) goto L_0x0453
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.C1308aga.f(r11, r3)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r2 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r2 = r12.a(r2, r13)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03c7
        L_0x0453:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.Cfa r1 = r10.a((int) r2)     // Catch:{ Hea -> 0x04e4 }
            java.lang.Object r1 = r12.a(r1, r13)     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (java.lang.Object) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0463:
            r10.a((java.lang.Object) r11, (int) r3, (com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0468:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            boolean r1 = r12.g()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (boolean) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0474:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            int r1 = r12.e()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (int) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0480:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.c()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (long) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x048c:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            int r1 = r12.a()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (int) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x0498:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.m()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (long) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x04a4:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            long r5 = r12.o()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (long) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x04b0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            float r1 = r12.readFloat()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (float) r1)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x04bc:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Hea -> 0x04e4 }
            double r5 = r12.readDouble()     // Catch:{ Hea -> 0x04e4 }
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r3, (double) r5)     // Catch:{ Hea -> 0x04e4 }
            goto L_0x03da
        L_0x04c8:
            boolean r1 = r7.a(r9, (com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ Hea -> 0x04e4 }
            if (r1 != 0) goto L_0x0008
            int r12 = r10.m
        L_0x04d0:
            int r13 = r10.n
            if (r12 >= r13) goto L_0x04de
            int[] r13 = r10.l
            r13 = r13[r12]
            r10.a((java.lang.Object) r11, (int) r13, r9, r7)
            int r12 = r12 + 1
            goto L_0x04d0
        L_0x04de:
            if (r9 == 0) goto L_0x04e3
            r7.b((java.lang.Object) r11, r9)
        L_0x04e3:
            return
        L_0x04e4:
            r7.a((com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ all -> 0x050a }
            if (r9 != 0) goto L_0x04ee
            java.lang.Object r1 = r7.e(r11)     // Catch:{ all -> 0x050a }
            r9 = r1
        L_0x04ee:
            boolean r1 = r7.a(r9, (com.google.android.gms.internal.ads.C2865wfa) r12)     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x0008
            int r12 = r10.m
        L_0x04f6:
            int r13 = r10.n
            if (r12 >= r13) goto L_0x0504
            int[] r13 = r10.l
            r13 = r13[r12]
            r10.a((java.lang.Object) r11, (int) r13, r9, r7)
            int r12 = r12 + 1
            goto L_0x04f6
        L_0x0504:
            if (r9 == 0) goto L_0x0509
            r7.b((java.lang.Object) r11, r9)
        L_0x0509:
            return
        L_0x050a:
            r12 = move-exception
            int r13 = r10.m
        L_0x050d:
            int r0 = r10.n
            if (r13 >= r0) goto L_0x051b
            int[] r0 = r10.l
            r0 = r0[r13]
            r10.a((java.lang.Object) r11, (int) r0, r9, r7)
            int r13 = r13 + 1
            goto L_0x050d
        L_0x051b:
            if (r9 == 0) goto L_0x0520
            r7.b((java.lang.Object) r11, r9)
        L_0x0520:
            throw r12
        L_0x0521:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>()
            goto L_0x0528
        L_0x0527:
            throw r11
        L_0x0528:
            goto L_0x0527
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, com.google.android.gms.internal.ads.wfa, com.google.android.gms.internal.ads.kea):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C1308aga.f(r8, r2));
        b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C1308aga.f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C1308aga.b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0101
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f11207c
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.d((int) r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f11207c
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.a(r8, (int) r4, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.b(r7, r8, (int) r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.a(r8, (int) r4, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.ads.C1308aga.f(r8, r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            r6.b(r7, (int) r4, (int) r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.ads.bfa r1 = r6.s
            com.google.android.gms.internal.ads.Efa.a((com.google.android.gms.internal.ads.C1377bfa) r1, r7, r8, (long) r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.ads.Tea r1 = r6.p
            r1.a(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.a(r7, r8, (int) r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.ads.C1308aga.f(r8, r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.ads.C1308aga.c(r8, r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (boolean) r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r8, (long) r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (int) r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.ads.C1308aga.b(r8, r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (long) r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.ads.C1308aga.d(r8, r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (float) r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.ads.C1308aga.e(r8, r2)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r7, (long) r2, (double) r4)
        L_0x00eb:
            r6.b(r7, (int) r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x00f2:
            com.google.android.gms.internal.ads.Vfa<?, ?> r0 = r6.q
            com.google.android.gms.internal.ads.Efa.a(r0, r7, r8)
            boolean r0 = r6.f11212h
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.ads.mea<?> r0 = r6.r
            com.google.android.gms.internal.ads.Efa.a(r0, r7, r8)
        L_0x0100:
            return
        L_0x0101:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            goto L_0x0108
        L_0x0107:
            throw r7
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f0, code lost:
        if (r0 == r15) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x035e, code lost:
        if (r0 == r15) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0360, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0123, code lost:
        r1 = r11.f7574c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0125, code lost:
        r10.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01cc, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e2, code lost:
        r1 = r11.f7572a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e4, code lost:
        r10.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x023f, code lost:
        r6 = r6 | r23;
        r2 = r7;
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0245, code lost:
        r2 = r5;
        r29 = r10;
        r30 = r20;
        r20 = r7;
        r7 = r30;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.ads.Kda r36) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            boolean r0 = r15.j
            if (r0 == 0) goto L_0x03a5
            sun.misc.Unsafe r9 = f11206b
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r34
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x0388
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.ads.Hda.a((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.Kda) r11)
            int r3 = r11.f7572a
            r4 = r0
            r17 = r3
            goto L_0x0033
        L_0x0030:
            r17 = r0
            r4 = r3
        L_0x0033:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.a((int) r5, (int) r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.g(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r19 = -1
            r20 = 0
            goto L_0x0362
        L_0x0052:
            int[] r0 = r15.f11207c
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r34 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0252
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x0094
            if (r7 == r5) goto L_0x0085
            r20 = r2
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0089
        L_0x0085:
            r20 = r2
            r7 = r18
        L_0x0089:
            if (r0 == r5) goto L_0x0091
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x0091:
            r2 = r7
            r7 = r0
            goto L_0x0098
        L_0x0094:
            r20 = r2
            r2 = r18
        L_0x0098:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0226;
                case 1: goto L_0x020d;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01e9;
                case 4: goto L_0x01cf;
                case 5: goto L_0x01ab;
                case 6: goto L_0x0192;
                case 7: goto L_0x0170;
                case 8: goto L_0x0151;
                case 9: goto L_0x012a;
                case 10: goto L_0x0110;
                case 11: goto L_0x01cf;
                case 12: goto L_0x00fc;
                case 13: goto L_0x0192;
                case 14: goto L_0x01ab;
                case 15: goto L_0x00e2;
                case 16: goto L_0x00ab;
                default: goto L_0x009c;
            }
        L_0x009c:
            r25 = r34
            r10 = r2
            r5 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            goto L_0x0245
        L_0x00ab:
            if (r3 != 0) goto L_0x00d4
            int r10 = com.google.android.gms.internal.ads.Hda.b(r12, r4, r11)
            long r0 = r11.f7573b
            long r17 = com.google.android.gms.internal.ads.C1304aea.a((long) r0)
            r0 = r2
            r1 = r32
            r4 = r2
            r30 = r20
            r20 = r7
            r7 = r30
            r2 = r8
            r25 = r34
            r8 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r2 = r7
            r9 = r8
            r0 = r10
            goto L_0x029c
        L_0x00d4:
            r25 = r34
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            r10 = r2
            goto L_0x01cc
        L_0x00e2:
            r25 = r34
            r10 = r2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != 0) goto L_0x01cc
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r4, r11)
            int r1 = r11.f7572a
            int r1 = com.google.android.gms.internal.ads.C1304aea.e(r1)
            goto L_0x01e4
        L_0x00fc:
            r25 = r34
            r10 = r2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != 0) goto L_0x01cc
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r4, r11)
            goto L_0x01e2
        L_0x0110:
            r25 = r34
            r10 = r2
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x01cc
            int r0 = com.google.android.gms.internal.ads.Hda.e(r12, r4, r11)
        L_0x0123:
            java.lang.Object r1 = r11.f7574c
        L_0x0125:
            r10.putObject(r14, r8, r1)
            goto L_0x023f
        L_0x012a:
            r25 = r34
            r10 = r2
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x01cc
            com.google.android.gms.internal.ads.Cfa r0 = r15.a((int) r7)
            int r0 = com.google.android.gms.internal.ads.Hda.a((com.google.android.gms.internal.ads.Cfa) r0, (byte[]) r12, (int) r4, (int) r13, (com.google.android.gms.internal.ads.Kda) r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x014a
            java.lang.Object r1 = r11.f7574c
            goto L_0x0125
        L_0x014a:
            java.lang.Object r2 = r11.f7574c
            java.lang.Object r1 = com.google.android.gms.internal.ads.Aea.a((java.lang.Object) r1, (java.lang.Object) r2)
            goto L_0x0125
        L_0x0151:
            r25 = r34
            r10 = r2
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x01cc
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x016b
            int r0 = com.google.android.gms.internal.ads.Hda.c(r12, r4, r11)
            goto L_0x0123
        L_0x016b:
            int r0 = com.google.android.gms.internal.ads.Hda.d(r12, r4, r11)
            goto L_0x0123
        L_0x0170:
            r25 = r34
            r10 = r2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != 0) goto L_0x01cc
            int r0 = com.google.android.gms.internal.ads.Hda.b(r12, r4, r11)
            long r1 = r11.f7573b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018c
            r1 = 1
            goto L_0x018d
        L_0x018c:
            r1 = 0
        L_0x018d:
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r14, (long) r8, (boolean) r1)
            goto L_0x023f
        L_0x0192:
            r25 = r34
            r10 = r2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x01cc
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x023f
        L_0x01ab:
            r25 = r34
            r10 = r2
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x01cc
            long r17 = com.google.android.gms.internal.ads.Hda.b(r12, r4)
            r0 = r10
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x023f
        L_0x01cc:
            r5 = r4
            goto L_0x0245
        L_0x01cf:
            r25 = r34
            r10 = r2
            r5 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != 0) goto L_0x0245
            int r0 = com.google.android.gms.internal.ads.Hda.a(r12, r5, r11)
        L_0x01e2:
            int r1 = r11.f7572a
        L_0x01e4:
            r10.putInt(r14, r8, r1)
            goto L_0x023f
        L_0x01e9:
            r25 = r34
            r10 = r2
            r5 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != 0) goto L_0x0245
            int r17 = com.google.android.gms.internal.ads.Hda.b(r12, r5, r11)
            long r4 = r11.f7573b
            r0 = r10
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r2 = r7
            r9 = r10
            r0 = r17
            goto L_0x029c
        L_0x020d:
            r25 = r34
            r10 = r2
            r5 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x0245
            float r0 = com.google.android.gms.internal.ads.Hda.d(r12, r5)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r14, (long) r8, (float) r0)
            int r0 = r5 + 4
            goto L_0x023f
        L_0x0226:
            r25 = r34
            r10 = r2
            r5 = r4
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r20
            r20 = r7
            r7 = r30
            if (r3 != r0) goto L_0x0245
            double r0 = com.google.android.gms.internal.ads.Hda.c(r12, r5)
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r14, (long) r8, (double) r0)
            int r0 = r5 + 8
        L_0x023f:
            r6 = r6 | r23
            r2 = r7
            r9 = r10
            goto L_0x029c
        L_0x0245:
            r2 = r5
            r29 = r10
            r19 = -1
            r30 = r20
            r20 = r7
            r7 = r30
            goto L_0x0362
        L_0x0252:
            r25 = r34
            r5 = r4
            r20 = r7
            r4 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r2
            r0 = 27
            if (r10 != r0) goto L_0x02b3
            r0 = 2
            if (r3 != r0) goto L_0x02a6
            java.lang.Object r0 = r4.getObject(r14, r8)
            com.google.android.gms.internal.ads.Fea r0 = (com.google.android.gms.internal.ads.Fea) r0
            boolean r1 = r0.n()
            if (r1 != 0) goto L_0x0282
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0279
            r1 = 10
            goto L_0x027b
        L_0x0279:
            int r1 = r1 << 1
        L_0x027b:
            com.google.android.gms.internal.ads.Fea r0 = r0.c(r1)
            r4.putObject(r14, r8, r0)
        L_0x0282:
            r8 = r0
            com.google.android.gms.internal.ads.Cfa r0 = r15.a((int) r7)
            r1 = r17
            r2 = r33
            r3 = r5
            r18 = r4
            r4 = r35
            r5 = r8
            r8 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.ads.Hda.a(r0, r1, r2, r3, r4, r5, r6)
            r2 = r7
            r6 = r8
            r9 = r18
        L_0x029c:
            r7 = r20
            r1 = r25
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001e
        L_0x02a6:
            r29 = r4
            r15 = r5
            r27 = r6
            r28 = r20
            r19 = -1
            r20 = r7
            goto L_0x032a
        L_0x02b3:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x030c
            r1 = r21
            long r1 = (long) r1
            r0 = r31
            r21 = r1
            r1 = r32
            r2 = r33
            r4 = r3
            r3 = r5
            r34 = r4
            r4 = r35
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r34
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r20
            r29 = r18
            r19 = -1
            r18 = r10
            r9 = r21
            r11 = r18
            r12 = r23
            r14 = r36
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.Kda) r14)
            if (r0 != r15) goto L_0x02f4
            goto L_0x0360
        L_0x02f4:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r2 = r20
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0384
        L_0x030c:
            r34 = r3
            r15 = r5
            r27 = r6
            r23 = r8
            r29 = r18
            r28 = r20
            r1 = r21
            r19 = -1
            r20 = r7
            r18 = r10
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x0344
            r7 = r34
            r0 = 2
            if (r7 == r0) goto L_0x0330
        L_0x032a:
            r2 = r15
        L_0x032b:
            r6 = r27
            r7 = r28
            goto L_0x0362
        L_0x0330:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r20
            r6 = r23
            r8 = r36
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.Kda) r8)
            r0 = 0
            throw r0
        L_0x0344:
            r7 = r34
            r0 = r31
            r8 = r1
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r20
            r13 = r36
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.Kda) r13)
            if (r0 != r15) goto L_0x02f4
        L_0x0360:
            r2 = r0
            goto L_0x032b
        L_0x0362:
            com.google.android.gms.internal.ads.Yfa r4 = e((java.lang.Object) r32)
            r0 = r17
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = com.google.android.gms.internal.ads.Hda.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.Yfa) r4, (com.google.android.gms.internal.ads.Kda) r5)
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r2 = r20
            r1 = r25
        L_0x0384:
            r9 = r29
            goto L_0x001e
        L_0x0388:
            r27 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x039b
            long r1 = (long) r7
            r3 = r32
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x039b:
            r4 = r35
            if (r0 != r4) goto L_0x03a0
            return
        L_0x03a0:
            com.google.android.gms.internal.ads.Iea r0 = com.google.android.gms.internal.ads.Iea.h()
            throw r0
        L_0x03a5:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r6 = r36
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.Kda) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.Kda):void");
    }

    public final boolean a(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.m) {
                return !this.f11212h || this.r.a((Object) t2).c();
            }
            int i7 = this.l[i6];
            int i8 = this.f11207c[i7];
            int d2 = d(i7);
            int i9 = this.f11207c[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                i2 = i10 != 1048575 ? f11206b.getInt(t2, (long) i10) : i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & d2) != 0) && !a(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & d2) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (a(t2, i8, i7) && !a((Object) t2, d2, a(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !this.s.a(C1308aga.f(t2, (long) (d2 & 1048575))).isEmpty()) {
                            this.s.e(b(i7));
                            throw null;
                        }
                    }
                }
                List list = (List) C1308aga.f(t2, (long) (d2 & 1048575));
                if (!list.isEmpty()) {
                    Cfa a2 = a(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!a2.a(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a(t, i7, i3, i2, i11) && !a((Object) t2, d2, a(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    public final void b(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.l[i3]) & 1048575);
            Object f2 = C1308aga.f(t, d2);
            if (f2 != null) {
                this.s.c(f2);
                C1308aga.a((Object) t, d2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.b(t, (long) this.l[i2]);
            i2++;
        }
        this.q.a((Object) t);
        if (this.f11212h) {
            this.r.c(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.ads.Efa.a(com.google.android.gms.internal.ads.C1308aga.f(r10, r6), com.google.android.gms.internal.ads.C1308aga.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.b(r10, r6) == com.google.android.gms.internal.ads.C1308aga.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.b(r10, r6) == com.google.android.gms.internal.ads.C1308aga.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.Efa.a(com.google.android.gms.internal.ads.C1308aga.f(r10, r6), com.google.android.gms.internal.ads.C1308aga.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.Efa.a(com.google.android.gms.internal.ads.C1308aga.f(r10, r6), com.google.android.gms.internal.ads.C1308aga.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.ads.Efa.a(com.google.android.gms.internal.ads.C1308aga.f(r10, r6), com.google.android.gms.internal.ads.C1308aga.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.c(r10, r6) == com.google.android.gms.internal.ads.C1308aga.c(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.b(r10, r6) == com.google.android.gms.internal.ads.C1308aga.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.b(r10, r6) == com.google.android.gms.internal.ads.C1308aga.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.ads.C1308aga.b(r10, r6) == com.google.android.gms.internal.ads.C1308aga.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.C1308aga.d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.C1308aga.d(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.C1308aga.e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.C1308aga.e(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.Efa.a(com.google.android.gms.internal.ads.C1308aga.f(r10, r6), com.google.android.gms.internal.ads.C1308aga.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f11207c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.d((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0198;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b3
        L_0x001c:
            int r4 = r9.e((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.Efa.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C1308aga.f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.Efa.a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.Efa.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.ads.C1308aga.b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C1308aga.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.ads.C1308aga.b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C1308aga.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.Efa.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.Efa.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C1308aga.f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.Efa.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = com.google.android.gms.internal.ads.C1308aga.c(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.C1308aga.c(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.ads.C1308aga.b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C1308aga.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.ads.C1308aga.b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C1308aga.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.ads.C1308aga.b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C1308aga.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = com.google.android.gms.internal.ads.C1308aga.d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.ads.C1308aga.d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = com.google.android.gms.internal.ads.C1308aga.e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.ads.C1308aga.e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
        L_0x01b2:
            r3 = 0
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.ads.Vfa<?, ?> r0 = r9.q
            java.lang.Object r0 = r0.d(r10)
            com.google.android.gms.internal.ads.Vfa<?, ?> r2 = r9.q
            java.lang.Object r2 = r2.d(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r9.f11212h
            if (r0 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.mea<?> r0 = r9.r
            com.google.android.gms.internal.ads.nea r10 = r0.a((java.lang.Object) r10)
            com.google.android.gms.internal.ads.mea<?> r0 = r9.r
            com.google.android.gms.internal.ads.nea r11 = r0.a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0256, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025f, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.c(r3, (com.google.android.gms.internal.ads.C1872ifa) com.google.android.gms.internal.ads.C1308aga.f(r1, r5), a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0278, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0287, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.h(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0292, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.h(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x029d, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.j(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ac, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.k(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bb, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.g(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c6, code lost:
        r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ca, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.c(r3, (com.google.android.gms.internal.ads.Lda) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d7, code lost:
        r3 = com.google.android.gms.internal.ads.Efa.a(r3, com.google.android.gms.internal.ads.C1308aga.f(r1, r5), a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f1, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.Lda) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f4, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0302, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.b(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x030e, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.i(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031a, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.g(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x032a, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033a, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.e(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034a, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.d(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0356, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.b(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0362, code lost:
        r3 = com.google.android.gms.internal.ads.C1658fea.b(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036a, code lost:
        r12 = r12 + 3;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b9, code lost:
        if (a(r1, r15, r3) != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03d9, code lost:
        if (a(r1, r15, r3) != false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03e1, code lost:
        if (a(r1, r15, r3) != false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0401, code lost:
        if (a(r1, r15, r3) != false) goto L_0x0680;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0409, code lost:
        if (a(r1, r15, r3) != false) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0419, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.Lda) != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ba, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04c8, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d6, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04e4, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04f2, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0500, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x050e, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x051b, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0528, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0535, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0542, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x054f, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x055c, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0569, code lost:
        if (r4 > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x056b, code lost:
        r8 = (com.google.android.gms.internal.ads.C1658fea.e(r15) + com.google.android.gms.internal.ads.C1658fea.g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0616, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0618, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0621, code lost:
        if ((r12 & r11) != 0) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0623, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.c(r15, (com.google.android.gms.internal.ads.C1872ifa) r2.getObject(r1, r8), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x063a, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.f(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0647, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.h(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x064e, code lost:
        if ((r12 & r11) != 0) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0650, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.h(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0659, code lost:
        if ((r12 & r11) != 0) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x065b, code lost:
        r8 = com.google.android.gms.internal.ads.C1658fea.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0660, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x066a, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.k(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0677, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.g(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x067e, code lost:
        if ((r12 & r11) != 0) goto L_0x0680;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0680, code lost:
        r4 = r2.getObject(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0684, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.c(r15, (com.google.android.gms.internal.ads.Lda) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x068d, code lost:
        if ((r12 & r11) != 0) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x068f, code lost:
        r4 = com.google.android.gms.internal.ads.Efa.a(r15, r2.getObject(r1, r8), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06a7, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.Lda) != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06aa, code lost:
        r4 = com.google.android.gms.internal.ads.C1658fea.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0709, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x072b, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.Lda) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d1, code lost:
        r3 = (com.google.android.gms.internal.ads.C1658fea.e(r3) + com.google.android.gms.internal.ads.C1658fea.g(r5)) + r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0378
            sun.misc.Unsafe r2 = f11206b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f11207c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0370
            int r14 = r0.d((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f11207c
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.ads.sea r14 = com.google.android.gms.internal.ads.C2579sea.DOUBLE_LIST_PACKED
            int r14 = r14.a()
            if (r15 < r14) goto L_0x003f
            com.google.android.gms.internal.ads.sea r14 = com.google.android.gms.internal.ads.C2579sea.SINT64_LIST_PACKED
            int r14 = r14.a()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.f11207c
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x035c;
                case 1: goto L_0x0350;
                case 2: goto L_0x0340;
                case 3: goto L_0x0330;
                case 4: goto L_0x0320;
                case 5: goto L_0x0314;
                case 6: goto L_0x0308;
                case 7: goto L_0x02fc;
                case 8: goto L_0x02e5;
                case 9: goto L_0x02d1;
                case 10: goto L_0x02c0;
                case 11: goto L_0x02b1;
                case 12: goto L_0x02a2;
                case 13: goto L_0x0297;
                case 14: goto L_0x028c;
                case 15: goto L_0x027d;
                case 16: goto L_0x026e;
                case 17: goto L_0x0259;
                case 18: goto L_0x024e;
                case 19: goto L_0x0245;
                case 20: goto L_0x023c;
                case 21: goto L_0x0233;
                case 22: goto L_0x022a;
                case 23: goto L_0x024e;
                case 24: goto L_0x0245;
                case 25: goto L_0x0221;
                case 26: goto L_0x0218;
                case 27: goto L_0x020b;
                case 28: goto L_0x0202;
                case 29: goto L_0x01f9;
                case 30: goto L_0x01f0;
                case 31: goto L_0x0245;
                case 32: goto L_0x024e;
                case 33: goto L_0x01e7;
                case 34: goto L_0x01dd;
                case 35: goto L_0x01c5;
                case 36: goto L_0x01b8;
                case 37: goto L_0x01ab;
                case 38: goto L_0x019e;
                case 39: goto L_0x0191;
                case 40: goto L_0x0184;
                case 41: goto L_0x0177;
                case 42: goto L_0x016a;
                case 43: goto L_0x015c;
                case 44: goto L_0x014e;
                case 45: goto L_0x0140;
                case 46: goto L_0x0132;
                case 47: goto L_0x0124;
                case 48: goto L_0x0116;
                case 49: goto L_0x0108;
                case 50: goto L_0x00f8;
                case 51: goto L_0x00f0;
                case 52: goto L_0x00e8;
                case 53: goto L_0x00dc;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c4;
                case 56: goto L_0x00bc;
                case 57: goto L_0x00b4;
                case 58: goto L_0x00ac;
                case 59: goto L_0x009c;
                case 60: goto L_0x0094;
                case 61: goto L_0x008c;
                case 62: goto L_0x0080;
                case 63: goto L_0x0074;
                case 64: goto L_0x006c;
                case 65: goto L_0x0064;
                case 66: goto L_0x0058;
                case 67: goto L_0x004c;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x036a
        L_0x0044:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x025f
        L_0x004c:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            long r5 = e(r1, r5)
            goto L_0x0278
        L_0x0058:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = d(r1, r5)
            goto L_0x0287
        L_0x0064:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0292
        L_0x006c:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x029d
        L_0x0074:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = d(r1, r5)
            goto L_0x02ac
        L_0x0080:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = d(r1, r5)
            goto L_0x02bb
        L_0x008c:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x02c6
        L_0x0094:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x02d7
        L_0x009c:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.Lda
            if (r6 == 0) goto L_0x02f4
            goto L_0x02f3
        L_0x00ac:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0302
        L_0x00b4:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x030e
        L_0x00bc:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x031a
        L_0x00c4:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = d(r1, r5)
            goto L_0x032a
        L_0x00d0:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            long r5 = e(r1, r5)
            goto L_0x033a
        L_0x00dc:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x036a
            long r5 = e(r1, r5)
            goto L_0x034a
        L_0x00e8:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0356
        L_0x00f0:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0362
        L_0x00f8:
            com.google.android.gms.internal.ads.bfa r14 = r0.s
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5)
            java.lang.Object r6 = r0.b((int) r12)
            int r3 = r14.a(r3, r5, r6)
            goto L_0x0256
        L_0x0108:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.Cfa r6 = r0.a((int) r12)
            int r3 = com.google.android.gms.internal.ads.Efa.b((int) r3, (java.util.List<com.google.android.gms.internal.ads.C1872ifa>) r5, (com.google.android.gms.internal.ads.Cfa) r6)
            goto L_0x0256
        L_0x0116:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.c(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0124:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.g(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0132:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.i(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0140:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.h(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x014e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.d(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x015c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.f(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x016a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.j(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0177:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.h(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0184:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.i(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0191:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.e(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x019e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.b(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01ab:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01b8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.h(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01c5:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.Efa.i(r5)
            if (r5 <= 0) goto L_0x036a
        L_0x01d1:
            int r3 = com.google.android.gms.internal.ads.C1658fea.e((int) r3)
            int r6 = com.google.android.gms.internal.ads.C1658fea.g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0256
        L_0x01dd:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.c(r3, r5, r11)
            goto L_0x0256
        L_0x01e7:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.g(r3, r5, r11)
            goto L_0x0256
        L_0x01f0:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.d(r3, r5, r11)
            goto L_0x0256
        L_0x01f9:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.f(r3, r5, r11)
            goto L_0x0256
        L_0x0202:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.b(r3, r5)
            goto L_0x0256
        L_0x020b:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.Cfa r6 = r0.a((int) r12)
            int r3 = com.google.android.gms.internal.ads.Efa.a((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.ads.Cfa) r6)
            goto L_0x0256
        L_0x0218:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.a((int) r3, (java.util.List<?>) r5)
            goto L_0x0256
        L_0x0221:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.j(r3, r5, r11)
            goto L_0x0256
        L_0x022a:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.e(r3, r5, r11)
            goto L_0x0256
        L_0x0233:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x0256
        L_0x023c:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x0256
        L_0x0245:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.h(r3, r5, r11)
            goto L_0x0256
        L_0x024e:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.Efa.i(r3, r5, r11)
        L_0x0256:
            int r13 = r13 + r3
            goto L_0x036a
        L_0x0259:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
        L_0x025f:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5)
            com.google.android.gms.internal.ads.ifa r5 = (com.google.android.gms.internal.ads.C1872ifa) r5
            com.google.android.gms.internal.ads.Cfa r6 = r0.a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C1658fea.c(r3, r5, r6)
            goto L_0x0256
        L_0x026e:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            long r5 = com.google.android.gms.internal.ads.C1308aga.b(r1, r5)
        L_0x0278:
            int r3 = com.google.android.gms.internal.ads.C1658fea.f((int) r3, (long) r5)
            goto L_0x0256
        L_0x027d:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r1, (long) r5)
        L_0x0287:
            int r3 = com.google.android.gms.internal.ads.C1658fea.h((int) r3, (int) r5)
            goto L_0x0256
        L_0x028c:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x0292:
            int r3 = com.google.android.gms.internal.ads.C1658fea.h((int) r3, (long) r9)
            goto L_0x0256
        L_0x0297:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x029d:
            int r3 = com.google.android.gms.internal.ads.C1658fea.j(r3, r11)
            goto L_0x0256
        L_0x02a2:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r1, (long) r5)
        L_0x02ac:
            int r3 = com.google.android.gms.internal.ads.C1658fea.k(r3, r5)
            goto L_0x0256
        L_0x02b1:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r1, (long) r5)
        L_0x02bb:
            int r3 = com.google.android.gms.internal.ads.C1658fea.g((int) r3, (int) r5)
            goto L_0x0256
        L_0x02c0:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
        L_0x02c6:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5)
        L_0x02ca:
            com.google.android.gms.internal.ads.Lda r5 = (com.google.android.gms.internal.ads.Lda) r5
            int r3 = com.google.android.gms.internal.ads.C1658fea.c((int) r3, (com.google.android.gms.internal.ads.Lda) r5)
            goto L_0x0256
        L_0x02d1:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
        L_0x02d7:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5)
            com.google.android.gms.internal.ads.Cfa r6 = r0.a((int) r12)
            int r3 = com.google.android.gms.internal.ads.Efa.a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.Cfa) r6)
            goto L_0x0256
        L_0x02e5:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            java.lang.Object r5 = com.google.android.gms.internal.ads.C1308aga.f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.Lda
            if (r6 == 0) goto L_0x02f4
        L_0x02f3:
            goto L_0x02ca
        L_0x02f4:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.C1658fea.b((int) r3, (java.lang.String) r5)
            goto L_0x0256
        L_0x02fc:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x0302:
            int r3 = com.google.android.gms.internal.ads.C1658fea.b((int) r3, (boolean) r8)
            goto L_0x0256
        L_0x0308:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x030e:
            int r3 = com.google.android.gms.internal.ads.C1658fea.i(r3, r11)
            goto L_0x0256
        L_0x0314:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x031a:
            int r3 = com.google.android.gms.internal.ads.C1658fea.g((int) r3, (long) r9)
            goto L_0x0256
        L_0x0320:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            int r5 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r1, (long) r5)
        L_0x032a:
            int r3 = com.google.android.gms.internal.ads.C1658fea.f((int) r3, (int) r5)
            goto L_0x0256
        L_0x0330:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            long r5 = com.google.android.gms.internal.ads.C1308aga.b(r1, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.ads.C1658fea.e((int) r3, (long) r5)
            goto L_0x0256
        L_0x0340:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x036a
            long r5 = com.google.android.gms.internal.ads.C1308aga.b(r1, r5)
        L_0x034a:
            int r3 = com.google.android.gms.internal.ads.C1658fea.d((int) r3, (long) r5)
            goto L_0x0256
        L_0x0350:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x0356:
            int r3 = com.google.android.gms.internal.ads.C1658fea.b((int) r3, (float) r4)
            goto L_0x0256
        L_0x035c:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x036a
        L_0x0362:
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.C1658fea.b((int) r3, (double) r5)
            goto L_0x0256
        L_0x036a:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0370:
            com.google.android.gms.internal.ads.Vfa<?, ?> r2 = r0.q
            int r1 = a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x0378:
            sun.misc.Unsafe r2 = f11206b
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0380:
            int[] r13 = r0.f11207c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0733
            int r13 = r0.d((int) r3)
            int[] r14 = r0.f11207c
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03ac
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r6) goto L_0x03a9
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            goto L_0x03aa
        L_0x03a9:
            r14 = r6
        L_0x03aa:
            r6 = r14
            goto L_0x03ad
        L_0x03ac:
            r11 = 0
        L_0x03ad:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x071c;
                case 1: goto L_0x070c;
                case 2: goto L_0x06fa;
                case 3: goto L_0x06ea;
                case 4: goto L_0x06da;
                case 5: goto L_0x06cb;
                case 6: goto L_0x06be;
                case 7: goto L_0x06b2;
                case 8: goto L_0x069d;
                case 9: goto L_0x068b;
                case 10: goto L_0x067c;
                case 11: goto L_0x066f;
                case 12: goto L_0x0662;
                case 13: goto L_0x0657;
                case 14: goto L_0x064c;
                case 15: goto L_0x063f;
                case 16: goto L_0x0632;
                case 17: goto L_0x061f;
                case 18: goto L_0x060b;
                case 19: goto L_0x05ff;
                case 20: goto L_0x05f3;
                case 21: goto L_0x05e7;
                case 22: goto L_0x05db;
                case 23: goto L_0x060b;
                case 24: goto L_0x05ff;
                case 25: goto L_0x05cf;
                case 26: goto L_0x05c4;
                case 27: goto L_0x05b5;
                case 28: goto L_0x05aa;
                case 29: goto L_0x059e;
                case 30: goto L_0x0591;
                case 31: goto L_0x05ff;
                case 32: goto L_0x060b;
                case 33: goto L_0x0584;
                case 34: goto L_0x0577;
                case 35: goto L_0x055f;
                case 36: goto L_0x0552;
                case 37: goto L_0x0545;
                case 38: goto L_0x0538;
                case 39: goto L_0x052b;
                case 40: goto L_0x051e;
                case 41: goto L_0x0511;
                case 42: goto L_0x0504;
                case 43: goto L_0x04f6;
                case 44: goto L_0x04e8;
                case 45: goto L_0x04da;
                case 46: goto L_0x04cc;
                case 47: goto L_0x04be;
                case 48: goto L_0x04b0;
                case 49: goto L_0x04a0;
                case 50: goto L_0x0490;
                case 51: goto L_0x0482;
                case 52: goto L_0x0475;
                case 53: goto L_0x0465;
                case 54: goto L_0x0455;
                case 55: goto L_0x0445;
                case 56: goto L_0x0437;
                case 57: goto L_0x042a;
                case 58: goto L_0x041d;
                case 59: goto L_0x040d;
                case 60: goto L_0x0405;
                case 61: goto L_0x03fd;
                case 62: goto L_0x03f1;
                case 63: goto L_0x03e5;
                case 64: goto L_0x03dd;
                case 65: goto L_0x03d5;
                case 66: goto L_0x03c9;
                case 67: goto L_0x03bd;
                case 68: goto L_0x03b5;
                default: goto L_0x03b3;
            }
        L_0x03b3:
            goto L_0x0617
        L_0x03b5:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            goto L_0x0623
        L_0x03bd:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            long r8 = e(r1, r8)
            goto L_0x063a
        L_0x03c9:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            int r4 = d(r1, r8)
            goto L_0x0647
        L_0x03d5:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            goto L_0x0650
        L_0x03dd:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            goto L_0x065b
        L_0x03e5:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            int r4 = d(r1, r8)
            goto L_0x066a
        L_0x03f1:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            int r4 = d(r1, r8)
            goto L_0x0677
        L_0x03fd:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            goto L_0x0680
        L_0x0405:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            goto L_0x068f
        L_0x040d:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.ads.Lda
            if (r8 == 0) goto L_0x06aa
            goto L_0x06a9
        L_0x041d:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            r4 = 1
            int r8 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (boolean) r4)
            goto L_0x0660
        L_0x042a:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.C1658fea.i(r15, r4)
            goto L_0x0660
        L_0x0437:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.C1658fea.g((int) r15, (long) r8)
            goto L_0x0616
        L_0x0445:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            int r4 = d(r1, r8)
            int r4 = com.google.android.gms.internal.ads.C1658fea.f((int) r15, (int) r4)
            goto L_0x0616
        L_0x0455:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            long r8 = e(r1, r8)
            int r4 = com.google.android.gms.internal.ads.C1658fea.e((int) r15, (long) r8)
            goto L_0x0616
        L_0x0465:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            long r8 = e(r1, r8)
            int r4 = com.google.android.gms.internal.ads.C1658fea.d((int) r15, (long) r8)
            goto L_0x0616
        L_0x0475:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (float) r4)
            goto L_0x0660
        L_0x0482:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0617
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (double) r8)
            goto L_0x0616
        L_0x0490:
            com.google.android.gms.internal.ads.bfa r4 = r0.s
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.b((int) r3)
            int r4 = r4.a(r15, r8, r9)
            goto L_0x0616
        L_0x04a0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r3)
            int r4 = com.google.android.gms.internal.ads.Efa.b((int) r15, (java.util.List<com.google.android.gms.internal.ads.C1872ifa>) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0616
        L_0x04b0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.c(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x04be:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.g(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x04cc:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.i(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x04da:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.h(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x04e8:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.d(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x04f6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.f(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x0504:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.j(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x0511:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.h(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x051e:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.i(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x052b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.e(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x0538:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.b(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x0545:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.a((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x0552:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.h(r4)
            if (r4 <= 0) goto L_0x0617
            goto L_0x056b
        L_0x055f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.i(r4)
            if (r4 <= 0) goto L_0x0617
        L_0x056b:
            int r8 = com.google.android.gms.internal.ads.C1658fea.e((int) r15)
            int r9 = com.google.android.gms.internal.ads.C1658fea.g((int) r4)
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0660
        L_0x0577:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.ads.Efa.c(r15, r4, r10)
            goto L_0x0616
        L_0x0584:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.g(r15, r4, r10)
            goto L_0x0616
        L_0x0591:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.d(r15, r4, r10)
            goto L_0x0616
        L_0x059e:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.f(r15, r4, r10)
            goto L_0x0616
        L_0x05aa:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.b(r15, r4)
            goto L_0x0616
        L_0x05b5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r3)
            int r4 = com.google.android.gms.internal.ads.Efa.a((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0616
        L_0x05c4:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.a((int) r15, (java.util.List<?>) r4)
            goto L_0x0616
        L_0x05cf:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.ads.Efa.j(r15, r4, r10)
            goto L_0x0616
        L_0x05db:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.e(r15, r4, r10)
            goto L_0x0616
        L_0x05e7:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.b((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r10)
            goto L_0x0616
        L_0x05f3:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.a((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r10)
            goto L_0x0616
        L_0x05ff:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.h(r15, r4, r10)
            goto L_0x0616
        L_0x060b:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.Efa.i(r15, r4, r10)
        L_0x0616:
            int r5 = r5 + r4
        L_0x0617:
            r4 = 1
        L_0x0618:
            r8 = 0
            r9 = 0
            r13 = 0
            goto L_0x072b
        L_0x061f:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
        L_0x0623:
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.ifa r4 = (com.google.android.gms.internal.ads.C1872ifa) r4
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r3)
            int r4 = com.google.android.gms.internal.ads.C1658fea.c(r15, r4, r8)
            goto L_0x0616
        L_0x0632:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
            long r8 = r2.getLong(r1, r8)
        L_0x063a:
            int r4 = com.google.android.gms.internal.ads.C1658fea.f((int) r15, (long) r8)
            goto L_0x0616
        L_0x063f:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
            int r4 = r2.getInt(r1, r8)
        L_0x0647:
            int r4 = com.google.android.gms.internal.ads.C1658fea.h((int) r15, (int) r4)
            goto L_0x0616
        L_0x064c:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
        L_0x0650:
            r8 = 0
            int r4 = com.google.android.gms.internal.ads.C1658fea.h((int) r15, (long) r8)
            goto L_0x0616
        L_0x0657:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
        L_0x065b:
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.C1658fea.j(r15, r4)
        L_0x0660:
            int r5 = r5 + r8
            goto L_0x0617
        L_0x0662:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
            int r4 = r2.getInt(r1, r8)
        L_0x066a:
            int r4 = com.google.android.gms.internal.ads.C1658fea.k(r15, r4)
            goto L_0x0616
        L_0x066f:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
            int r4 = r2.getInt(r1, r8)
        L_0x0677:
            int r4 = com.google.android.gms.internal.ads.C1658fea.g((int) r15, (int) r4)
            goto L_0x0616
        L_0x067c:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
        L_0x0680:
            java.lang.Object r4 = r2.getObject(r1, r8)
        L_0x0684:
            com.google.android.gms.internal.ads.Lda r4 = (com.google.android.gms.internal.ads.Lda) r4
            int r4 = com.google.android.gms.internal.ads.C1658fea.c((int) r15, (com.google.android.gms.internal.ads.Lda) r4)
            goto L_0x0616
        L_0x068b:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
        L_0x068f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.ads.Cfa r8 = r0.a((int) r3)
            int r4 = com.google.android.gms.internal.ads.Efa.a((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.Cfa) r8)
            goto L_0x0616
        L_0x069d:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.ads.Lda
            if (r8 == 0) goto L_0x06aa
        L_0x06a9:
            goto L_0x0684
        L_0x06aa:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (java.lang.String) r4)
            goto L_0x0616
        L_0x06b2:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0617
            r4 = 1
            int r8 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (boolean) r4)
            int r5 = r5 + r8
            goto L_0x0618
        L_0x06be:
            r4 = 1
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0618
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.C1658fea.i(r15, r8)
            int r5 = r5 + r9
            goto L_0x0618
        L_0x06cb:
            r4 = 1
            r8 = r12 & r11
            if (r8 == 0) goto L_0x06d7
            r13 = 0
            int r8 = com.google.android.gms.internal.ads.C1658fea.g((int) r15, (long) r13)
            goto L_0x0709
        L_0x06d7:
            r13 = 0
            goto L_0x070a
        L_0x06da:
            r4 = 1
            r13 = 0
            r10 = r12 & r11
            if (r10 == 0) goto L_0x070a
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.ads.C1658fea.f((int) r15, (int) r8)
            goto L_0x0709
        L_0x06ea:
            r4 = 1
            r13 = 0
            r10 = r12 & r11
            if (r10 == 0) goto L_0x070a
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.ads.C1658fea.e((int) r15, (long) r8)
            goto L_0x0709
        L_0x06fa:
            r4 = 1
            r13 = 0
            r10 = r12 & r11
            if (r10 == 0) goto L_0x070a
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.ads.C1658fea.d((int) r15, (long) r8)
        L_0x0709:
            int r5 = r5 + r8
        L_0x070a:
            r8 = 0
            goto L_0x0719
        L_0x070c:
            r4 = 1
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x070a
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (float) r8)
            int r5 = r5 + r9
        L_0x0719:
            r9 = 0
            goto L_0x072b
        L_0x071c:
            r4 = 1
            r8 = 0
            r13 = 0
            r9 = r12 & r11
            if (r9 == 0) goto L_0x0719
            r9 = 0
            int r11 = com.google.android.gms.internal.ads.C1658fea.b((int) r15, (double) r9)
            int r5 = r5 + r11
        L_0x072b:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r8 = 1
            r11 = 0
            goto L_0x0380
        L_0x0733:
            com.google.android.gms.internal.ads.Vfa<?, ?> r2 = r0.q
            int r2 = a(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f11212h
            if (r2 == 0) goto L_0x0789
            com.google.android.gms.internal.ads.mea<?> r2 = r0.r
            com.google.android.gms.internal.ads.nea r1 = r2.a((java.lang.Object) r1)
            com.google.android.gms.internal.ads.Hfa<T, java.lang.Object> r2 = r1.f11484b
            int r2 = r2.c()
            r3 = 0
            if (r2 > 0) goto L_0x0774
            com.google.android.gms.internal.ads.Hfa<T, java.lang.Object> r1 = r1.f11484b
            java.lang.Iterable r1 = r1.d()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x0760
            int r5 = r5 + 0
            goto L_0x0789
        L_0x0760:
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.ads.pea r2 = (com.google.android.gms.internal.ads.C2367pea) r2
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.C2225nea.a(r2, r1)
            throw r3
        L_0x0774:
            com.google.android.gms.internal.ads.Hfa<T, java.lang.Object> r1 = r1.f11484b
            r2 = 0
            java.util.Map$Entry r1 = r1.b((int) r2)
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.ads.pea r2 = (com.google.android.gms.internal.ads.C2367pea) r2
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.C2225nea.a(r2, r1)
            throw r3
        L_0x0789:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.c(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.ads.C1308aga.f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.ads.Aea.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.ads.Aea.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f11207c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.d((int) r1)
            int[] r4 = r8.f11207c
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = f(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = c(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = b(r9, (long) r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C1308aga.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.C1308aga.c(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.ads.Aea.a((boolean) r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r9, (long) r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C1308aga.b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.C1308aga.d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.C1308aga.e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.ads.Aea.a((long) r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.Vfa<?, ?> r0 = r8.q
            java.lang.Object r0 = r0.d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f11212h
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.mea<?> r0 = r8.r
            com.google.android.gms.internal.ads.nea r9 = r0.a((java.lang.Object) r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2085lfa.d(java.lang.Object):int");
    }
}
