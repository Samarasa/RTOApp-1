package c.b.b.b.d.f;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: c.b.b.b.d.f.zc  reason: case insensitive filesystem */
final class C0465zc<T> implements Kc<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f4652a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f4653b = C0336gd.c();

    /* renamed from: c  reason: collision with root package name */
    private final int[] f4654c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f4655d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4656e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4657f;

    /* renamed from: g  reason: collision with root package name */
    private final C0445wc f4658g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4659h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final Cc o;
    private final C0328fc p;
    private final C0294ad<?, ?> q;
    private final Ab<?> r;
    private final C0397pc s;

    private C0465zc(int[] iArr, Object[] objArr, int i2, int i3, C0445wc wcVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, Cc cc, C0328fc fcVar, C0294ad<?, ?> adVar, Ab<?> ab, C0397pc pcVar) {
        this.f4654c = iArr;
        this.f4655d = objArr;
        this.f4656e = i2;
        this.f4657f = i3;
        this.i = wcVar instanceof Lb;
        this.j = z;
        this.f4659h = ab != null && ab.a(wcVar);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = cc;
        this.p = fcVar;
        this.q = adVar;
        this.r = ab;
        this.f4658g = wcVar;
        this.s = pcVar;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.f4656e || i2 > this.f4657f) {
            return -1;
        }
        return b(i2, i3);
    }

    private static <UT, UB> int a(C0294ad<UT, UB> adVar, T t) {
        return adVar.d(adVar.a(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        r3 = r11.f4401c;
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
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, c.b.b.b.d.f.C0313db r29) {
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
            sun.misc.Unsafe r12 = f4653b
            int[] r7 = r0.f4654c
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
            c.b.b.b.d.f.Kc r2 = r0.a((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (c.b.b.b.d.f.C0313db) r7)
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
            java.lang.Object r3 = r11.f4401c
            java.lang.Object r3 = c.b.b.b.d.f.Nb.a((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x0145
        L_0x0057:
            if (r5 != 0) goto L_0x016d
            int r2 = c.b.b.b.d.f.C0292ab.b(r3, r4, r11)
            long r3 = r11.f4400b
            long r3 = c.b.b.b.d.f.C0403qb.a((long) r3)
            goto L_0x0141
        L_0x0065:
            if (r5 != 0) goto L_0x016d
            int r2 = c.b.b.b.d.f.C0292ab.a(r3, r4, r11)
            int r3 = r11.f4399a
            int r3 = c.b.b.b.d.f.C0403qb.a((int) r3)
            goto L_0x0134
        L_0x0073:
            if (r5 != 0) goto L_0x016d
            int r3 = c.b.b.b.d.f.C0292ab.a(r3, r4, r11)
            int r4 = r11.f4399a
            c.b.b.b.d.f.Sb r5 = r0.c((int) r6)
            if (r5 == 0) goto L_0x0097
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0088
            goto L_0x0097
        L_0x0088:
            c.b.b.b.d.f.dd r1 = a((java.lang.Object) r17)
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
            int r2 = c.b.b.b.d.f.C0292ab.e(r3, r4, r11)
        L_0x00a7:
            java.lang.Object r3 = r11.f4401c
            goto L_0x0145
        L_0x00ab:
            if (r5 != r15) goto L_0x016d
            c.b.b.b.d.f.Kc r2 = r0.a((int) r6)
            r5 = r20
            int r2 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r2, (byte[]) r3, (int) r4, (int) r5, (c.b.b.b.d.f.C0313db) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c2
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c3
        L_0x00c2:
            r15 = 0
        L_0x00c3:
            if (r15 != 0) goto L_0x00c9
            java.lang.Object r3 = r11.f4401c
            goto L_0x0145
        L_0x00c9:
            java.lang.Object r3 = r11.f4401c
            java.lang.Object r3 = c.b.b.b.d.f.Nb.a((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x0145
        L_0x00d1:
            if (r5 != r15) goto L_0x016d
            int r2 = c.b.b.b.d.f.C0292ab.a(r3, r4, r11)
            int r4 = r11.f4399a
            if (r4 != 0) goto L_0x00de
            java.lang.String r3 = ""
            goto L_0x0145
        L_0x00de:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f2
            int r5 = r2 + r4
            boolean r5 = c.b.b.b.d.f.C0356jd.a((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.f()
            throw r1
        L_0x00f2:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = c.b.b.b.d.f.Nb.f4241a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0169
        L_0x00ff:
            if (r5 != 0) goto L_0x016d
            int r2 = c.b.b.b.d.f.C0292ab.b(r3, r4, r11)
            long r3 = r11.f4400b
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
            int r2 = c.b.b.b.d.f.C0292ab.a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0153
        L_0x0120:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            long r2 = c.b.b.b.d.f.C0292ab.b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0164
        L_0x012c:
            if (r5 != 0) goto L_0x016d
            int r2 = c.b.b.b.d.f.C0292ab.a(r3, r4, r11)
            int r3 = r11.f4399a
        L_0x0134:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0145
        L_0x0139:
            if (r5 != 0) goto L_0x016d
            int r2 = c.b.b.b.d.f.C0292ab.b(r3, r4, r11)
            long r3 = r11.f4400b
        L_0x0141:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0145:
            r12.putObject(r1, r9, r3)
            goto L_0x0169
        L_0x0149:
            if (r5 != r7) goto L_0x016d
            float r2 = c.b.b.b.d.f.C0292ab.d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0153:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0169
        L_0x0159:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            double r2 = c.b.b.b.d.f.C0292ab.c(r18, r19)
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
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, c.b.b.b.d.f.db):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0272, code lost:
        if (r7.f4400b != 0) goto L_0x0274;
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
        r6 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0282, code lost:
        if (r2 != r7.f4399a) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0284, code lost:
        r4 = c.b.b.b.d.f.C0292ab.b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x028c, code lost:
        if (r7.f4400b == 0) goto L_0x0276;
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
        r11.add(c.b.b.b.d.f.C0320eb.f4416a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r11.add(c.b.b.b.d.f.C0320eb.a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
        if (r2 != r7.f4399a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7);
        r4 = r7.f4399a;
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
        throw c.b.b.b.d.f.Wb.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw c.b.b.b.d.f.Wb.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, c.b.b.b.d.f.C0313db r30) {
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
            sun.misc.Unsafe r11 = f4653b
            java.lang.Object r11 = r11.getObject(r1, r9)
            c.b.b.b.d.f.Tb r11 = (c.b.b.b.d.f.Tb) r11
            boolean r12 = r11.a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            c.b.b.b.d.f.Tb r11 = r11.a(r12)
            sun.misc.Unsafe r12 = f4653b
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
            c.b.b.b.d.f.Kc r1 = r0.a((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (c.b.b.b.d.f.C0313db) r27)
        L_0x005a:
            java.lang.Object r8 = r7.f4401c
            r11.add(r8)
            if (r4 >= r5) goto L_0x03db
            int r8 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r9 = r7.f4399a
            if (r2 != r9) goto L_0x03db
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (c.b.b.b.d.f.C0313db) r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            c.b.b.b.d.f.kc r11 = (c.b.b.b.d.f.C0362kc) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = c.b.b.b.d.f.C0292ab.b(r3, r1, r7)
            long r4 = r7.f4400b
            long r4 = c.b.b.b.d.f.C0403qb.a((long) r4)
            r11.a((long) r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x03dc
        L_0x0099:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x03db
            c.b.b.b.d.f.kc r11 = (c.b.b.b.d.f.C0362kc) r11
        L_0x00a2:
            int r1 = c.b.b.b.d.f.C0292ab.b(r3, r4, r7)
            long r8 = r7.f4400b
            long r8 = c.b.b.b.d.f.C0403qb.a((long) r8)
            r11.a((long) r8)
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            c.b.b.b.d.f.Ob r11 = (c.b.b.b.d.f.Ob) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r4 = r7.f4399a
            int r4 = c.b.b.b.d.f.C0403qb.a((int) r4)
            r11.j(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x03dc
        L_0x00d9:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x03db
            c.b.b.b.d.f.Ob r11 = (c.b.b.b.d.f.Ob) r11
        L_0x00e2:
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r4 = r7.f4399a
            int r4 = c.b.b.b.d.f.C0403qb.a((int) r4)
            r11.j(r4)
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = c.b.b.b.d.f.C0292ab.a((byte[]) r3, (int) r4, (c.b.b.b.d.f.Tb<?>) r11, (c.b.b.b.d.f.C0313db) r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x03db
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = c.b.b.b.d.f.C0292ab.a((int) r2, (byte[]) r3, (int) r4, (int) r5, (c.b.b.b.d.f.Tb<?>) r6, (c.b.b.b.d.f.C0313db) r7)
        L_0x0112:
            c.b.b.b.d.f.Lb r1 = (c.b.b.b.d.f.Lb) r1
            c.b.b.b.d.f.dd r3 = r1.zzb
            c.b.b.b.d.f.dd r4 = c.b.b.b.d.f.C0315dd.a()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            c.b.b.b.d.f.Sb r4 = r0.c((int) r8)
            c.b.b.b.d.f.ad<?, ?> r5 = r0.q
            r6 = r22
            java.lang.Object r3 = c.b.b.b.d.f.Lc.a(r6, r11, r4, r3, r5)
            c.b.b.b.d.f.dd r3 = (c.b.b.b.d.f.C0315dd) r3
            if (r3 == 0) goto L_0x012f
            r1.zzb = r3
        L_0x012f:
            r1 = r2
            goto L_0x03dc
        L_0x0132:
            if (r6 != r10) goto L_0x03db
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r4 = r7.f4399a
            if (r4 < 0) goto L_0x0178
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0173
            if (r4 != 0) goto L_0x0148
        L_0x0142:
            c.b.b.b.d.f.eb r4 = c.b.b.b.d.f.C0320eb.f4416a
            r11.add(r4)
            goto L_0x0150
        L_0x0148:
            c.b.b.b.d.f.eb r6 = c.b.b.b.d.f.C0320eb.a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r4 = r7.f4399a
            if (r4 < 0) goto L_0x016e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0169
            if (r4 != 0) goto L_0x0148
            goto L_0x0142
        L_0x0169:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x016e:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.b()
            throw r1
        L_0x0173:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x0178:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.b()
            throw r1
        L_0x017d:
            if (r6 != r10) goto L_0x03db
            c.b.b.b.d.f.Kc r1 = r0.a((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = c.b.b.b.d.f.C0292ab.a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03dc
        L_0x0197:
            if (r6 != r10) goto L_0x03db
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x01e4
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r6 = r7.f4399a
            if (r6 < 0) goto L_0x01df
            if (r6 != 0) goto L_0x01b2
        L_0x01ae:
            r11.add(r1)
            goto L_0x01bd
        L_0x01b2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = c.b.b.b.d.f.Nb.f4241a
            r8.<init>(r3, r4, r6, r9)
        L_0x01b9:
            r11.add(r8)
            int r4 = r4 + r6
        L_0x01bd:
            if (r4 >= r5) goto L_0x03db
            int r6 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r8 = r7.f4399a
            if (r2 != r8) goto L_0x03db
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r6, r7)
            int r6 = r7.f4399a
            if (r6 < 0) goto L_0x01da
            if (r6 != 0) goto L_0x01d2
            goto L_0x01ae
        L_0x01d2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = c.b.b.b.d.f.Nb.f4241a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x01b9
        L_0x01da:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.b()
            throw r1
        L_0x01df:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.b()
            throw r1
        L_0x01e4:
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r6 = r7.f4399a
            if (r6 < 0) goto L_0x0239
            if (r6 != 0) goto L_0x01f2
        L_0x01ee:
            r11.add(r1)
            goto L_0x0205
        L_0x01f2:
            int r8 = r4 + r6
            boolean r9 = c.b.b.b.d.f.C0356jd.a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x0234
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = c.b.b.b.d.f.Nb.f4241a
            r9.<init>(r3, r4, r6, r10)
        L_0x0201:
            r11.add(r9)
            r4 = r8
        L_0x0205:
            if (r4 >= r5) goto L_0x03db
            int r6 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r8 = r7.f4399a
            if (r2 != r8) goto L_0x03db
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r6, r7)
            int r6 = r7.f4399a
            if (r6 < 0) goto L_0x022f
            if (r6 != 0) goto L_0x021a
            goto L_0x01ee
        L_0x021a:
            int r8 = r4 + r6
            boolean r9 = c.b.b.b.d.f.C0356jd.a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x022a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = c.b.b.b.d.f.Nb.f4241a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x0201
        L_0x022a:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.f()
            throw r1
        L_0x022f:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.b()
            throw r1
        L_0x0234:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.f()
            throw r1
        L_0x0239:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.b()
            throw r1
        L_0x023e:
            r1 = 0
            if (r6 != r10) goto L_0x0266
            c.b.b.b.d.f.cb r11 = (c.b.b.b.d.f.C0306cb) r11
            int r2 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r4 = r7.f4399a
            int r4 = r4 + r2
        L_0x024a:
            if (r2 >= r4) goto L_0x025d
            int r2 = c.b.b.b.d.f.C0292ab.b(r3, r2, r7)
            long r5 = r7.f4400b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0258
            r5 = 1
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r11.a((boolean) r5)
            goto L_0x024a
        L_0x025d:
            if (r2 != r4) goto L_0x0261
            goto L_0x012f
        L_0x0261:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x0266:
            if (r6 != 0) goto L_0x03db
            c.b.b.b.d.f.cb r11 = (c.b.b.b.d.f.C0306cb) r11
            int r4 = c.b.b.b.d.f.C0292ab.b(r3, r4, r7)
            long r8 = r7.f4400b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0276
        L_0x0274:
            r6 = 1
            goto L_0x0277
        L_0x0276:
            r6 = 0
        L_0x0277:
            r11.a((boolean) r6)
            if (r4 >= r5) goto L_0x03db
            int r6 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r8 = r7.f4399a
            if (r2 != r8) goto L_0x03db
            int r4 = c.b.b.b.d.f.C0292ab.b(r3, r6, r7)
            long r8 = r7.f4400b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0276
            goto L_0x0274
        L_0x028f:
            if (r6 != r10) goto L_0x02af
            c.b.b.b.d.f.Ob r11 = (c.b.b.b.d.f.Ob) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x029a:
            if (r1 >= r2) goto L_0x02a6
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1)
            r11.j(r4)
            int r1 = r1 + 4
            goto L_0x029a
        L_0x02a6:
            if (r1 != r2) goto L_0x02aa
            goto L_0x03dc
        L_0x02aa:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x02af:
            if (r6 != r9) goto L_0x03db
            c.b.b.b.d.f.Ob r11 = (c.b.b.b.d.f.Ob) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r18, r19)
            r11.j(r1)
        L_0x02ba:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4)
            r11.j(r1)
            goto L_0x02ba
        L_0x02ce:
            if (r6 != r10) goto L_0x02ee
            c.b.b.b.d.f.kc r11 = (c.b.b.b.d.f.C0362kc) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x02d9:
            if (r1 >= r2) goto L_0x02e5
            long r4 = c.b.b.b.d.f.C0292ab.b(r3, r1)
            r11.a((long) r4)
            int r1 = r1 + 8
            goto L_0x02d9
        L_0x02e5:
            if (r1 != r2) goto L_0x02e9
            goto L_0x03dc
        L_0x02e9:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x02ee:
            if (r6 != r13) goto L_0x03db
            c.b.b.b.d.f.kc r11 = (c.b.b.b.d.f.C0362kc) r11
            long r8 = c.b.b.b.d.f.C0292ab.b(r18, r19)
            r11.a((long) r8)
        L_0x02f9:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            long r8 = c.b.b.b.d.f.C0292ab.b(r3, r4)
            r11.a((long) r8)
            goto L_0x02f9
        L_0x030d:
            if (r6 != r10) goto L_0x0315
            int r1 = c.b.b.b.d.f.C0292ab.a((byte[]) r3, (int) r4, (c.b.b.b.d.f.Tb<?>) r11, (c.b.b.b.d.f.C0313db) r7)
            goto L_0x03dc
        L_0x0315:
            if (r6 != 0) goto L_0x03db
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = c.b.b.b.d.f.C0292ab.a((int) r21, (byte[]) r22, (int) r23, (int) r24, (c.b.b.b.d.f.Tb<?>) r25, (c.b.b.b.d.f.C0313db) r26)
            goto L_0x03dc
        L_0x0327:
            if (r6 != r10) goto L_0x0347
            c.b.b.b.d.f.kc r11 = (c.b.b.b.d.f.C0362kc) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x0332:
            if (r1 >= r2) goto L_0x033e
            int r1 = c.b.b.b.d.f.C0292ab.b(r3, r1, r7)
            long r4 = r7.f4400b
            r11.a((long) r4)
            goto L_0x0332
        L_0x033e:
            if (r1 != r2) goto L_0x0342
            goto L_0x03dc
        L_0x0342:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x0347:
            if (r6 != 0) goto L_0x03db
            c.b.b.b.d.f.kc r11 = (c.b.b.b.d.f.C0362kc) r11
        L_0x034b:
            int r1 = c.b.b.b.d.f.C0292ab.b(r3, r4, r7)
            long r8 = r7.f4400b
            r11.a((long) r8)
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            goto L_0x034b
        L_0x035f:
            if (r6 != r10) goto L_0x037e
            c.b.b.b.d.f.Kb r11 = (c.b.b.b.d.f.Kb) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x036a:
            if (r1 >= r2) goto L_0x0376
            float r4 = c.b.b.b.d.f.C0292ab.d(r3, r1)
            r11.a((float) r4)
            int r1 = r1 + 4
            goto L_0x036a
        L_0x0376:
            if (r1 != r2) goto L_0x0379
            goto L_0x03dc
        L_0x0379:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x037e:
            if (r6 != r9) goto L_0x03db
            c.b.b.b.d.f.Kb r11 = (c.b.b.b.d.f.Kb) r11
            float r1 = c.b.b.b.d.f.C0292ab.d(r18, r19)
            r11.a((float) r1)
        L_0x0389:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            float r1 = c.b.b.b.d.f.C0292ab.d(r3, r4)
            r11.a((float) r1)
            goto L_0x0389
        L_0x039d:
            if (r6 != r10) goto L_0x03bc
            c.b.b.b.d.f.wb r11 = (c.b.b.b.d.f.C0444wb) r11
            int r1 = c.b.b.b.d.f.C0292ab.a(r3, r4, r7)
            int r2 = r7.f4399a
            int r2 = r2 + r1
        L_0x03a8:
            if (r1 >= r2) goto L_0x03b4
            double r4 = c.b.b.b.d.f.C0292ab.c(r3, r1)
            r11.a((double) r4)
            int r1 = r1 + 8
            goto L_0x03a8
        L_0x03b4:
            if (r1 != r2) goto L_0x03b7
            goto L_0x03dc
        L_0x03b7:
            c.b.b.b.d.f.Wb r1 = c.b.b.b.d.f.Wb.a()
            throw r1
        L_0x03bc:
            if (r6 != r13) goto L_0x03db
            c.b.b.b.d.f.wb r11 = (c.b.b.b.d.f.C0444wb) r11
            double r8 = c.b.b.b.d.f.C0292ab.c(r18, r19)
            r11.a((double) r8)
        L_0x03c7:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03dc
            int r4 = c.b.b.b.d.f.C0292ab.a(r3, r1, r7)
            int r6 = r7.f4399a
            if (r2 != r6) goto L_0x03dc
            double r8 = c.b.b.b.d.f.C0292ab.c(r3, r4)
            r11.a((double) r8)
            goto L_0x03c7
        L_0x03db:
            r1 = r4
        L_0x03dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, c.b.b.b.d.f.db):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, C0313db dbVar) {
        Unsafe unsafe = f4653b;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.f(object)) {
            Object d2 = this.s.d(b2);
            this.s.a(d2, object);
            unsafe.putObject(t, j2, d2);
        }
        this.s.a(b2);
        throw null;
    }

    private final Kc a(int i2) {
        int i3 = (i2 / 3) << 1;
        Kc kc = (Kc) this.f4655d[i3];
        if (kc != null) {
            return kc;
        }
        Kc a2 = Fc.a().a((Class) this.f4655d[i3 + 1]);
        this.f4655d[i3] = a2;
        return a2;
    }

    private static C0315dd a(Object obj) {
        Lb lb = (Lb) obj;
        C0315dd ddVar = lb.zzb;
        if (ddVar != C0315dd.a()) {
            return ddVar;
        }
        C0315dd b2 = C0315dd.b();
        lb.zzb = b2;
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> c.b.b.b.d.f.C0465zc<T> a(java.lang.Class<T> r35, c.b.b.b.d.f.C0431uc r36, c.b.b.b.d.f.Cc r37, c.b.b.b.d.f.C0328fc r38, c.b.b.b.d.f.C0294ad<?, ?> r39, c.b.b.b.d.f.Ab<?> r40, c.b.b.b.d.f.C0397pc r41) {
        /*
            r0 = r36
            boolean r1 = r0 instanceof c.b.b.b.d.f.Ic
            if (r1 == 0) goto L_0x0444
            c.b.b.b.d.f.Ic r0 = (c.b.b.b.d.f.Ic) r0
            int r1 = r0.a()
            int r2 = c.b.b.b.d.f.Lb.e.j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.c()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x002c:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x002c
        L_0x003c:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x004c:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x005c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x004c
        L_0x005c:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x0060
        L_0x005f:
            r12 = r8
        L_0x0060:
            if (r9 != 0) goto L_0x006e
            int[] r8 = f4652a
            r15 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            goto L_0x01a0
        L_0x006e:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x008e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x007a:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x008a
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x007a
        L_0x008a:
            int r8 = r8 << r10
            r8 = r8 | r9
            r9 = r8
            goto L_0x008f
        L_0x008e:
            r12 = r8
        L_0x008f:
            int r8 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ae
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009b:
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r12
            r10 = r10 | r8
            int r12 = r12 + 13
            r8 = r13
            goto L_0x009b
        L_0x00ab:
            int r8 = r8 << r12
            r10 = r10 | r8
            goto L_0x00af
        L_0x00ae:
            r13 = r8
        L_0x00af:
            int r8 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cf
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00bb:
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00cb
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r13
            r12 = r12 | r8
            int r13 = r13 + 13
            r8 = r14
            goto L_0x00bb
        L_0x00cb:
            int r8 = r8 << r13
            r8 = r8 | r12
            r12 = r8
            goto L_0x00d0
        L_0x00cf:
            r14 = r8
        L_0x00d0:
            int r8 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00f0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dc:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ec
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r14
            r13 = r13 | r8
            int r14 = r14 + 13
            r8 = r15
            goto L_0x00dc
        L_0x00ec:
            int r8 = r8 << r14
            r8 = r8 | r13
            r13 = r8
            goto L_0x00f1
        L_0x00f0:
            r15 = r8
        L_0x00f1:
            int r8 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0113
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fd:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x010e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r15
            r14 = r14 | r8
            int r15 = r15 + 13
            r8 = r16
            goto L_0x00fd
        L_0x010e:
            int r8 = r8 << r15
            r8 = r8 | r14
            r14 = r8
            r8 = r16
        L_0x0113:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0136
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011f:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0131
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r8 = r8 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011f
        L_0x0131:
            int r15 = r15 << r16
            r8 = r8 | r15
            r15 = r17
        L_0x0136:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r34 = r16
            r16 = r15
            r15 = r34
        L_0x0148:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x015b
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x0148
        L_0x015b:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x0164
        L_0x0162:
            r3 = r16
        L_0x0164:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x018f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r34 = r16
            r16 = r3
            r3 = r34
        L_0x0176:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0189
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x0176
        L_0x0189:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x018f:
            int r17 = r3 + r8
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r9 << 1
            int r10 = r17 + r10
            r34 = r16
            r16 = r9
            r9 = r12
            r12 = r34
        L_0x01a0:
            sun.misc.Unsafe r6 = f4653b
            java.lang.Object[] r17 = r0.d()
            c.b.b.b.d.f.wc r18 = r0.l()
            java.lang.Class r7 = r18.getClass()
            r18 = r10
            int r10 = r14 * 3
            int[] r10 = new int[r10]
            int r14 = r14 << r4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r20 = r3 + r8
            r22 = r3
            r23 = r20
            r8 = 0
            r21 = 0
        L_0x01c0:
            if (r12 >= r2) goto L_0x041a
            int r24 = r12 + 1
            char r12 = r1.charAt(r12)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r4) goto L_0x01f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r34 = r24
            r24 = r12
            r12 = r34
        L_0x01d7:
            int r27 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r4) goto L_0x01ed
            r4 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r26
            r24 = r24 | r4
            int r26 = r26 + 13
            r12 = r27
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d7
        L_0x01ed:
            int r4 = r12 << r26
            r12 = r24 | r4
            r4 = r27
            goto L_0x01f6
        L_0x01f4:
            r4 = r24
        L_0x01f6:
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x022a
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r27 = 13
            r34 = r24
            r24 = r4
            r4 = r34
        L_0x020d:
            int r28 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x0223
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r27
            r24 = r24 | r2
            int r27 = r27 + 13
            r4 = r28
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x020d
        L_0x0223:
            int r2 = r4 << r27
            r4 = r24 | r2
            r2 = r28
            goto L_0x022c
        L_0x022a:
            r2 = r24
        L_0x022c:
            r24 = r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            r27 = r11
            r11 = r4 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x023b
            int r11 = r8 + 1
            r15[r8] = r21
            r8 = r11
        L_0x023b:
            r11 = 51
            r30 = r8
            if (r3 < r11) goto L_0x02e1
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r8) goto L_0x026a
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x0250:
            int r33 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r8) goto L_0x0265
            r8 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r32
            r2 = r2 | r8
            int r32 = r32 + 13
            r11 = r33
            r8 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0250
        L_0x0265:
            int r8 = r11 << r32
            r2 = r2 | r8
            r11 = r33
        L_0x026a:
            int r8 = r3 + -51
            r32 = r11
            r11 = 9
            if (r8 == r11) goto L_0x028e
            r11 = 17
            if (r8 != r11) goto L_0x0277
            goto L_0x028e
        L_0x0277:
            r11 = 12
            if (r8 != r11) goto L_0x028c
            r8 = r5 & 1
            r11 = 1
            if (r8 != r11) goto L_0x028c
            int r8 = r21 / 3
            int r8 = r8 << r11
            int r8 = r8 + r11
            int r11 = r18 + 1
            r18 = r17[r18]
            r14[r8] = r18
            r18 = r11
        L_0x028c:
            r11 = 1
            goto L_0x029b
        L_0x028e:
            int r8 = r21 / 3
            r11 = 1
            int r8 = r8 << r11
            int r8 = r8 + r11
            int r25 = r18 + 1
            r18 = r17[r18]
            r14[r8] = r18
            r18 = r25
        L_0x029b:
            int r2 = r2 << r11
            r8 = r17[r2]
            boolean r11 = r8 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x02a5
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x02ad
        L_0x02a5:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = a((java.lang.Class<?>) r7, (java.lang.String) r8)
            r17[r2] = r8
        L_0x02ad:
            r11 = r9
            long r8 = r6.objectFieldOffset(r8)
            int r9 = (int) r8
            int r2 = r2 + 1
            r8 = r17[r2]
            r28 = r9
            boolean r9 = r8 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x02c0
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x02c8
        L_0x02c0:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = a((java.lang.Class<?>) r7, (java.lang.String) r8)
            r17[r2] = r8
        L_0x02c8:
            long r8 = r6.objectFieldOffset(r8)
            int r2 = (int) r8
            r31 = r1
            r8 = r2
            r1 = r7
            r25 = r18
            r9 = r28
            r2 = 0
            r19 = 1
            r28 = r11
            r18 = r13
            r13 = r12
            r12 = r32
            goto L_0x03e2
        L_0x02e1:
            r11 = r9
            int r8 = r18 + 1
            r9 = r17[r18]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = a((java.lang.Class<?>) r7, (java.lang.String) r9)
            r18 = r13
            r13 = 9
            if (r3 == r13) goto L_0x0361
            r13 = 17
            if (r3 != r13) goto L_0x02f8
            goto L_0x0361
        L_0x02f8:
            r13 = 27
            if (r3 == r13) goto L_0x0350
            r13 = 49
            if (r3 != r13) goto L_0x0301
            goto L_0x0350
        L_0x0301:
            r13 = 12
            if (r3 == r13) goto L_0x033e
            r13 = 30
            if (r3 == r13) goto L_0x033e
            r13 = 44
            if (r3 != r13) goto L_0x030e
            goto L_0x033e
        L_0x030e:
            r13 = 50
            if (r3 != r13) goto L_0x033a
            int r13 = r22 + 1
            r15[r22] = r21
            int r22 = r21 / 3
            r25 = 1
            int r22 = r22 << 1
            int r28 = r8 + 1
            r8 = r17[r8]
            r14[r22] = r8
            r8 = r4 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0333
            int r22 = r22 + 1
            int r8 = r28 + 1
            r28 = r17[r28]
            r14[r22] = r28
            r28 = r11
            r22 = r13
            goto L_0x036e
        L_0x0333:
            r22 = r13
            r8 = r28
            r28 = r11
            goto L_0x036e
        L_0x033a:
            r28 = r11
            r11 = 1
            goto L_0x036e
        L_0x033e:
            r13 = r5 & 1
            r28 = r11
            r11 = 1
            if (r13 != r11) goto L_0x036e
            int r13 = r21 / 3
            int r13 = r13 << r11
            int r13 = r13 + r11
            int r25 = r8 + 1
            r8 = r17[r8]
            r14[r13] = r8
            goto L_0x035d
        L_0x0350:
            r28 = r11
            r11 = 1
            int r13 = r21 / 3
            int r13 = r13 << r11
            int r13 = r13 + r11
            int r25 = r8 + 1
            r8 = r17[r8]
            r14[r13] = r8
        L_0x035d:
            r13 = r12
            r8 = r25
            goto L_0x036f
        L_0x0361:
            r28 = r11
            r11 = 1
            int r13 = r21 / 3
            int r13 = r13 << r11
            int r13 = r13 + r11
            java.lang.Class r25 = r9.getType()
            r14[r13] = r25
        L_0x036e:
            r13 = r12
        L_0x036f:
            long r11 = r6.objectFieldOffset(r9)
            int r9 = (int) r11
            r11 = r5 & 1
            r12 = 1
            if (r11 != r12) goto L_0x03c9
            r11 = 17
            if (r3 > r11) goto L_0x03c9
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x03a3
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x038c:
            int r29 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r12) goto L_0x039e
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r19
            r2 = r2 | r11
            int r19 = r19 + 13
            r11 = r29
            goto L_0x038c
        L_0x039e:
            int r11 = r11 << r19
            r2 = r2 | r11
            r11 = r29
        L_0x03a3:
            r19 = 1
            int r25 = r16 << 1
            int r29 = r2 / 32
            int r25 = r25 + r29
            r12 = r17[r25]
            r31 = r1
            boolean r1 = r12 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x03b6
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x03be
        L_0x03b6:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = a((java.lang.Class<?>) r7, (java.lang.String) r12)
            r17[r25] = r12
        L_0x03be:
            r1 = r7
            r25 = r8
            long r7 = r6.objectFieldOffset(r12)
            int r8 = (int) r7
            int r2 = r2 % 32
            goto L_0x03d3
        L_0x03c9:
            r31 = r1
            r1 = r7
            r25 = r8
            r19 = 1
            r11 = r2
            r2 = 0
            r8 = 0
        L_0x03d3:
            r7 = 18
            if (r3 < r7) goto L_0x03e1
            r7 = 49
            if (r3 > r7) goto L_0x03e1
            int r7 = r23 + 1
            r15[r23] = r9
            r23 = r7
        L_0x03e1:
            r12 = r11
        L_0x03e2:
            int r7 = r21 + 1
            r10[r21] = r13
            int r11 = r7 + 1
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x03ef
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03f0
        L_0x03ef:
            r13 = 0
        L_0x03f0:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03f7
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03f8
        L_0x03f7:
            r4 = 0
        L_0x03f8:
            r4 = r4 | r13
            int r3 = r3 << 20
            r3 = r3 | r4
            r3 = r3 | r9
            r10[r7] = r3
            int r21 = r11 + 1
            int r2 = r2 << 20
            r2 = r2 | r8
            r10[r11] = r2
            r7 = r1
            r13 = r18
            r3 = r24
            r18 = r25
            r2 = r26
            r11 = r27
            r9 = r28
            r8 = r30
            r1 = r31
            r4 = 1
            goto L_0x01c0
        L_0x041a:
            r24 = r3
            r28 = r9
            r27 = r11
            r18 = r13
            c.b.b.b.d.f.zc r1 = new c.b.b.b.d.f.zc
            c.b.b.b.d.f.wc r0 = r0.l()
            r12 = 0
            r5 = r1
            r6 = r10
            r7 = r14
            r8 = r28
            r9 = r18
            r10 = r0
            r13 = r15
            r14 = r24
            r15 = r20
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0444:
            c.b.b.b.d.f.Yc r0 = (c.b.b.b.d.f.Yc) r0
            r0.a()
            r0 = 0
            goto L_0x044c
        L_0x044b:
            throw r0
        L_0x044c:
            goto L_0x044b
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Class, c.b.b.b.d.f.uc, c.b.b.b.d.f.Cc, c.b.b.b.d.f.fc, c.b.b.b.d.f.ad, c.b.b.b.d.f.Ab, c.b.b.b.d.f.pc):c.b.b.b.d.f.zc");
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, Sb sb, UB ub, C0294ad<UT, UB> adVar) {
        this.s.a(b(i2));
        throw null;
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, C0294ad<UT, UB> adVar) {
        Sb c2;
        int i3 = this.f4654c[i2];
        Object f2 = C0336gd.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null || (c2 = c(i2)) == null) {
            return ub;
        }
        a(i2, i3, this.s.c(f2), c2, ub, adVar);
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
        return (List) C0336gd.f(obj, j2);
    }

    private static void a(int i2, Object obj, C0453xd xdVar) {
        if (obj instanceof String) {
            xdVar.a(i2, (String) obj);
        } else {
            xdVar.a(i2, (C0320eb) obj);
        }
    }

    private static <UT, UB> void a(C0294ad<UT, UB> adVar, T t, C0453xd xdVar) {
        adVar.a(adVar.a(t), xdVar);
    }

    private final <K, V> void a(C0453xd xdVar, int i2, Object obj, int i3) {
        if (obj != null) {
            this.s.a(b(i3));
            throw null;
        }
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = C0336gd.f(t, d2);
            Object f3 = C0336gd.f(t2, d2);
            if (f2 != null && f3 != null) {
                C0336gd.a((Object) t, d2, Nb.a(f2, f3));
                b(t, i2);
            } else if (f3 != null) {
                C0336gd.a((Object) t, d2, f3);
                b(t, i2);
            }
        }
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return C0336gd.e(t, j2) != 0.0d;
                case 1:
                    return C0336gd.d(t, j2) != 0.0f;
                case 2:
                    return C0336gd.b(t, j2) != 0;
                case 3:
                    return C0336gd.b(t, j2) != 0;
                case 4:
                    return C0336gd.a((Object) t, j2) != 0;
                case 5:
                    return C0336gd.b(t, j2) != 0;
                case 6:
                    return C0336gd.a((Object) t, j2) != 0;
                case 7:
                    return C0336gd.c(t, j2);
                case 8:
                    Object f2 = C0336gd.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof C0320eb) {
                        return !C0320eb.f4416a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C0336gd.f(t, j2) != null;
                case 10:
                    return !C0320eb.f4416a.equals(C0336gd.f(t, j2));
                case 11:
                    return C0336gd.a((Object) t, j2) != 0;
                case 12:
                    return C0336gd.a((Object) t, j2) != 0;
                case 13:
                    return C0336gd.a((Object) t, j2) != 0;
                case 14:
                    return C0336gd.b(t, j2) != 0;
                case 15:
                    return C0336gd.a((Object) t, j2) != 0;
                case 16:
                    return C0336gd.b(t, j2) != 0;
                case 17:
                    return C0336gd.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (C0336gd.a((Object) t, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return C0336gd.a((Object) t, (long) (e(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        return this.j ? a(t, i2) : (i3 & i4) != 0;
    }

    private static boolean a(Object obj, int i2, Kc kc) {
        return kc.e(C0336gd.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) C0336gd.f(t, j2)).doubleValue();
    }

    private final int b(int i2, int i3) {
        int length = (this.f4654c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f4654c[i5];
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
        return this.f4655d[(i2 / 3) << 1];
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            C0336gd.a((Object) t, j2, C0336gd.a((Object) t, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        C0336gd.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0326, code lost:
        r2.b(r13, r7.getObject(r1, r11), a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x033b, code lost:
        r2.e(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0348, code lost:
        r2.d(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0355, code lost:
        r2.c(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0362, code lost:
        r2.b(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036f, code lost:
        r2.c(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037c, code lost:
        r2.f(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0385, code lost:
        r2.a(r13, (c.b.b.b.d.f.C0320eb) r7.getObject(r1, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0394, code lost:
        r2.a(r13, r7.getObject(r1, r11), a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a5, code lost:
        a(r13, r7.getObject(r1, r11), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b5, code lost:
        r2.a(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03c1, code lost:
        r2.e(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03cd, code lost:
        r2.b(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03d9, code lost:
        r2.a(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03e5, code lost:
        r2.d(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f1, code lost:
        r2.a(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03fd, code lost:
        r2.a(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0409, code lost:
        r2.a(r13, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r18, c.b.b.b.d.f.C0453xd r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f4659h
            if (r3 == 0) goto L_0x0023
            c.b.b.b.d.f.Ab<?> r3 = r0.r
            c.b.b.b.d.f.Db r3 = r3.a((java.lang.Object) r1)
            c.b.b.b.d.f.Oc<T, java.lang.Object> r5 = r3.f4120b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.d()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            r5 = -1
            int[] r6 = r0.f4654c
            int r6 = r6.length
            sun.misc.Unsafe r7 = f4653b
            r8 = 0
            r5 = 0
            r9 = -1
            r10 = 0
        L_0x002e:
            if (r5 >= r6) goto L_0x0418
            int r11 = r0.d(r5)
            int[] r12 = r0.f4654c
            r13 = r12[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r11
            int r14 = r14 >>> 20
            boolean r15 = r0.j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 1
            if (r15 != 0) goto L_0x005d
            r15 = 17
            if (r14 > r15) goto L_0x005d
            int r15 = r5 + 2
            r12 = r12[r15]
            r15 = r12 & r16
            if (r15 == r9) goto L_0x0057
            long r9 = (long) r15
            int r10 = r7.getInt(r1, r9)
            goto L_0x0058
        L_0x0057:
            r15 = r9
        L_0x0058:
            int r9 = r12 >>> 20
            int r9 = r4 << r9
            goto L_0x005f
        L_0x005d:
            r15 = r9
            r9 = 0
        L_0x005f:
            if (r3 != 0) goto L_0x0411
            r11 = r11 & r16
            long r11 = (long) r11
            switch(r14) {
                case 0: goto L_0x0401;
                case 1: goto L_0x03f5;
                case 2: goto L_0x03e9;
                case 3: goto L_0x03dd;
                case 4: goto L_0x03d1;
                case 5: goto L_0x03c5;
                case 6: goto L_0x03b9;
                case 7: goto L_0x03ad;
                case 8: goto L_0x03a1;
                case 9: goto L_0x0390;
                case 10: goto L_0x0381;
                case 11: goto L_0x0374;
                case 12: goto L_0x0367;
                case 13: goto L_0x035a;
                case 14: goto L_0x034d;
                case 15: goto L_0x0340;
                case 16: goto L_0x0333;
                case 17: goto L_0x0322;
                case 18: goto L_0x0313;
                case 19: goto L_0x0304;
                case 20: goto L_0x02f5;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02d7;
                case 23: goto L_0x02c8;
                case 24: goto L_0x02b9;
                case 25: goto L_0x02aa;
                case 26: goto L_0x029b;
                case 27: goto L_0x0288;
                case 28: goto L_0x0279;
                case 29: goto L_0x026a;
                case 30: goto L_0x025b;
                case 31: goto L_0x024c;
                case 32: goto L_0x023d;
                case 33: goto L_0x022e;
                case 34: goto L_0x021f;
                case 35: goto L_0x0210;
                case 36: goto L_0x0201;
                case 37: goto L_0x01f2;
                case 38: goto L_0x01e3;
                case 39: goto L_0x01d4;
                case 40: goto L_0x01c5;
                case 41: goto L_0x01b6;
                case 42: goto L_0x01a7;
                case 43: goto L_0x0198;
                case 44: goto L_0x0189;
                case 45: goto L_0x017a;
                case 46: goto L_0x016b;
                case 47: goto L_0x015c;
                case 48: goto L_0x014d;
                case 49: goto L_0x013a;
                case 50: goto L_0x0131;
                case 51: goto L_0x0125;
                case 52: goto L_0x0119;
                case 53: goto L_0x010d;
                case 54: goto L_0x0101;
                case 55: goto L_0x00f5;
                case 56: goto L_0x00e9;
                case 57: goto L_0x00dd;
                case 58: goto L_0x00d1;
                case 59: goto L_0x00c9;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00b9;
                case 62: goto L_0x00ad;
                case 63: goto L_0x00a1;
                case 64: goto L_0x0095;
                case 65: goto L_0x0089;
                case 66: goto L_0x007d;
                case 67: goto L_0x0071;
                case 68: goto L_0x0069;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x040c
        L_0x0069:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            goto L_0x0326
        L_0x0071:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            long r11 = e(r1, r11)
            goto L_0x033b
        L_0x007d:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            int r4 = d(r1, r11)
            goto L_0x0348
        L_0x0089:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            long r11 = e(r1, r11)
            goto L_0x0355
        L_0x0095:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            int r4 = d(r1, r11)
            goto L_0x0362
        L_0x00a1:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            int r4 = d(r1, r11)
            goto L_0x036f
        L_0x00ad:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            int r4 = d(r1, r11)
            goto L_0x037c
        L_0x00b9:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            goto L_0x0385
        L_0x00c1:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            goto L_0x0394
        L_0x00c9:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            goto L_0x03a5
        L_0x00d1:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            boolean r4 = f(r1, r11)
            goto L_0x03b5
        L_0x00dd:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            int r4 = d(r1, r11)
            goto L_0x03c1
        L_0x00e9:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            long r11 = e(r1, r11)
            goto L_0x03cd
        L_0x00f5:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            int r4 = d(r1, r11)
            goto L_0x03d9
        L_0x0101:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            long r11 = e(r1, r11)
            goto L_0x03e5
        L_0x010d:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            long r11 = e(r1, r11)
            goto L_0x03f1
        L_0x0119:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            float r4 = c(r1, r11)
            goto L_0x03fd
        L_0x0125:
            boolean r4 = r0.a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040c
            double r11 = b(r1, (long) r11)
            goto L_0x0409
        L_0x0131:
            java.lang.Object r4 = r7.getObject(r1, r11)
            r0.a((c.b.b.b.d.f.C0453xd) r2, (int) r13, (java.lang.Object) r4, (int) r5)
            goto L_0x040c
        L_0x013a:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Kc r11 = r0.a((int) r5)
            c.b.b.b.d.f.Lc.b((int) r4, (java.util.List<?>) r9, (c.b.b.b.d.f.C0453xd) r2, (c.b.b.b.d.f.Kc) r11)
            goto L_0x040c
        L_0x014d:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.e(r9, r11, r2, r4)
            goto L_0x040c
        L_0x015c:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.j(r9, r11, r2, r4)
            goto L_0x040c
        L_0x016b:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.g(r9, r11, r2, r4)
            goto L_0x040c
        L_0x017a:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.l(r9, r11, r2, r4)
            goto L_0x040c
        L_0x0189:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.m(r9, r11, r2, r4)
            goto L_0x040c
        L_0x0198:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.i(r9, r11, r2, r4)
            goto L_0x040c
        L_0x01a7:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.n(r9, r11, r2, r4)
            goto L_0x040c
        L_0x01b6:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.k(r9, r11, r2, r4)
            goto L_0x040c
        L_0x01c5:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.f(r9, r11, r2, r4)
            goto L_0x040c
        L_0x01d4:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.h(r9, r11, r2, r4)
            goto L_0x040c
        L_0x01e3:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.d(r9, r11, r2, r4)
            goto L_0x040c
        L_0x01f2:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.c(r9, r11, r2, r4)
            goto L_0x040c
        L_0x0201:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.b((int) r9, (java.util.List<java.lang.Float>) r11, (c.b.b.b.d.f.C0453xd) r2, (boolean) r4)
            goto L_0x040c
        L_0x0210:
            int[] r9 = r0.f4654c
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            c.b.b.b.d.f.Lc.a((int) r9, (java.util.List<java.lang.Double>) r11, (c.b.b.b.d.f.C0453xd) r2, (boolean) r4)
            goto L_0x040c
        L_0x021f:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.e(r4, r9, r2, r8)
            goto L_0x040c
        L_0x022e:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.j(r4, r9, r2, r8)
            goto L_0x040c
        L_0x023d:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.g(r4, r9, r2, r8)
            goto L_0x040c
        L_0x024c:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.l(r4, r9, r2, r8)
            goto L_0x040c
        L_0x025b:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.m(r4, r9, r2, r8)
            goto L_0x040c
        L_0x026a:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.i(r4, r9, r2, r8)
            goto L_0x040c
        L_0x0279:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.b((int) r4, (java.util.List<c.b.b.b.d.f.C0320eb>) r9, (c.b.b.b.d.f.C0453xd) r2)
            goto L_0x040c
        L_0x0288:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Kc r11 = r0.a((int) r5)
            c.b.b.b.d.f.Lc.a((int) r4, (java.util.List<?>) r9, (c.b.b.b.d.f.C0453xd) r2, (c.b.b.b.d.f.Kc) r11)
            goto L_0x040c
        L_0x029b:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.a((int) r4, (java.util.List<java.lang.String>) r9, (c.b.b.b.d.f.C0453xd) r2)
            goto L_0x040c
        L_0x02aa:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.n(r4, r9, r2, r8)
            goto L_0x040c
        L_0x02b9:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.k(r4, r9, r2, r8)
            goto L_0x040c
        L_0x02c8:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.f(r4, r9, r2, r8)
            goto L_0x040c
        L_0x02d7:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.h(r4, r9, r2, r8)
            goto L_0x040c
        L_0x02e6:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.d(r4, r9, r2, r8)
            goto L_0x040c
        L_0x02f5:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.c(r4, r9, r2, r8)
            goto L_0x040c
        L_0x0304:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.b((int) r4, (java.util.List<java.lang.Float>) r9, (c.b.b.b.d.f.C0453xd) r2, (boolean) r8)
            goto L_0x040c
        L_0x0313:
            int[] r4 = r0.f4654c
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            c.b.b.b.d.f.Lc.a((int) r4, (java.util.List<java.lang.Double>) r9, (c.b.b.b.d.f.C0453xd) r2, (boolean) r8)
            goto L_0x040c
        L_0x0322:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
        L_0x0326:
            java.lang.Object r4 = r7.getObject(r1, r11)
            c.b.b.b.d.f.Kc r9 = r0.a((int) r5)
            r2.b((int) r13, (java.lang.Object) r4, (c.b.b.b.d.f.Kc) r9)
            goto L_0x040c
        L_0x0333:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            long r11 = r7.getLong(r1, r11)
        L_0x033b:
            r2.e((int) r13, (long) r11)
            goto L_0x040c
        L_0x0340:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            int r4 = r7.getInt(r1, r11)
        L_0x0348:
            r2.d((int) r13, (int) r4)
            goto L_0x040c
        L_0x034d:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            long r11 = r7.getLong(r1, r11)
        L_0x0355:
            r2.c((int) r13, (long) r11)
            goto L_0x040c
        L_0x035a:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            int r4 = r7.getInt(r1, r11)
        L_0x0362:
            r2.b((int) r13, (int) r4)
            goto L_0x040c
        L_0x0367:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            int r4 = r7.getInt(r1, r11)
        L_0x036f:
            r2.c((int) r13, (int) r4)
            goto L_0x040c
        L_0x0374:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            int r4 = r7.getInt(r1, r11)
        L_0x037c:
            r2.f(r13, r4)
            goto L_0x040c
        L_0x0381:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
        L_0x0385:
            java.lang.Object r4 = r7.getObject(r1, r11)
            c.b.b.b.d.f.eb r4 = (c.b.b.b.d.f.C0320eb) r4
            r2.a((int) r13, (c.b.b.b.d.f.C0320eb) r4)
            goto L_0x040c
        L_0x0390:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
        L_0x0394:
            java.lang.Object r4 = r7.getObject(r1, r11)
            c.b.b.b.d.f.Kc r9 = r0.a((int) r5)
            r2.a((int) r13, (java.lang.Object) r4, (c.b.b.b.d.f.Kc) r9)
            goto L_0x040c
        L_0x03a1:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
        L_0x03a5:
            java.lang.Object r4 = r7.getObject(r1, r11)
            a((int) r13, (java.lang.Object) r4, (c.b.b.b.d.f.C0453xd) r2)
            goto L_0x040c
        L_0x03ad:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            boolean r4 = c.b.b.b.d.f.C0336gd.c(r1, r11)
        L_0x03b5:
            r2.a((int) r13, (boolean) r4)
            goto L_0x040c
        L_0x03b9:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            int r4 = r7.getInt(r1, r11)
        L_0x03c1:
            r2.e((int) r13, (int) r4)
            goto L_0x040c
        L_0x03c5:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            long r11 = r7.getLong(r1, r11)
        L_0x03cd:
            r2.b((int) r13, (long) r11)
            goto L_0x040c
        L_0x03d1:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            int r4 = r7.getInt(r1, r11)
        L_0x03d9:
            r2.a((int) r13, (int) r4)
            goto L_0x040c
        L_0x03dd:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            long r11 = r7.getLong(r1, r11)
        L_0x03e5:
            r2.d((int) r13, (long) r11)
            goto L_0x040c
        L_0x03e9:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            long r11 = r7.getLong(r1, r11)
        L_0x03f1:
            r2.a((int) r13, (long) r11)
            goto L_0x040c
        L_0x03f5:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            float r4 = c.b.b.b.d.f.C0336gd.d(r1, r11)
        L_0x03fd:
            r2.a((int) r13, (float) r4)
            goto L_0x040c
        L_0x0401:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040c
            double r11 = c.b.b.b.d.f.C0336gd.e(r1, r11)
        L_0x0409:
            r2.a((int) r13, (double) r11)
        L_0x040c:
            int r5 = r5 + 3
            r9 = r15
            goto L_0x002e
        L_0x0411:
            c.b.b.b.d.f.Ab<?> r1 = r0.r
            r1.a((java.util.Map.Entry<?, ?>) r3)
            r4 = 0
            throw r4
        L_0x0418:
            r4 = 0
            if (r3 != 0) goto L_0x0421
            c.b.b.b.d.f.ad<?, ?> r3 = r0.q
            a(r3, r1, (c.b.b.b.d.f.C0453xd) r2)
            return
        L_0x0421:
            c.b.b.b.d.f.Ab<?> r1 = r0.r
            r1.a(r2, r3)
            goto L_0x0428
        L_0x0427:
            throw r4
        L_0x0428:
            goto L_0x0427
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.b(java.lang.Object, c.b.b.b.d.f.xd):void");
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.f4654c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = C0336gd.f(t, j2);
            Object f3 = C0336gd.f(t2, j2);
            if (f2 != null && f3 != null) {
                C0336gd.a((Object) t, j2, Nb.a(f2, f3));
                b(t, i3, i2);
            } else if (f3 != null) {
                C0336gd.a((Object) t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) C0336gd.f(t, j2)).floatValue();
    }

    private final Sb c(int i2) {
        return (Sb) this.f4655d[((i2 / 3) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.f4654c[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) C0336gd.f(t, j2)).intValue();
    }

    private final int e(int i2) {
        return this.f4654c[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) C0336gd.f(t, j2)).longValue();
    }

    private final int f(int i2) {
        if (i2 < this.f4656e || i2 > this.f4657f) {
            return -1;
        }
        return b(i2, 0);
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) C0336gd.f(t, j2)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b9, code lost:
        r13 = r34;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bf, code lost:
        r18 = r33;
        r20 = r6;
        r2 = r7;
        r7 = r8;
        r19 = r9;
        r27 = r10;
        r25 = r11;
        r6 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012c, code lost:
        r10.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0175, code lost:
        r6 = r6 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c8, code lost:
        r10.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020c, code lost:
        r6 = r6 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020e, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r35;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0238, code lost:
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02af, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b1, code lost:
        r6 = r6 | r23;
        r7 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b5, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x042e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r31, byte[] r32, int r33, int r34, int r35, c.b.b.b.d.f.C0313db r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f4653b
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            r17 = 0
            if (r0 >= r13) goto L_0x0470
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = c.b.b.b.d.f.C0292ab.a((int) r0, (byte[]) r12, (int) r3, (c.b.b.b.d.f.C0313db) r9)
            int r3 = r9.f4399a
            r4 = r0
            r5 = r3
            goto L_0x002c
        L_0x002a:
            r5 = r0
            r4 = r3
        L_0x002c:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0039
            int r2 = r2 / r8
            int r1 = r15.a((int) r3, (int) r2)
            goto L_0x003d
        L_0x0039:
            int r1 = r15.f((int) r3)
        L_0x003d:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0050
            r25 = r3
            r2 = r4
            r20 = r6
            r18 = r7
            r27 = r10
            r6 = r11
            r19 = 0
            r7 = r5
            goto L_0x03d5
        L_0x0050:
            int[] r1 = r15.f4654c
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r5
            r5 = r8 & r19
            long r12 = (long) r5
            r5 = 17
            r21 = r8
            if (r11 > r5) goto L_0x02cf
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r23 = r8 << r5
            r1 = r1 & r19
            if (r1 == r7) goto L_0x0085
            r5 = -1
            if (r7 == r5) goto L_0x007e
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x007e:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
            goto L_0x0086
        L_0x0085:
            r5 = -1
        L_0x0086:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x0297;
                case 1: goto L_0x027d;
                case 2: goto L_0x0257;
                case 3: goto L_0x0257;
                case 4: goto L_0x023c;
                case 5: goto L_0x0217;
                case 6: goto L_0x01f4;
                case 7: goto L_0x01cc;
                case 8: goto L_0x01a7;
                case 9: goto L_0x0179;
                case 10: goto L_0x015e;
                case 11: goto L_0x023c;
                case 12: goto L_0x0130;
                case 13: goto L_0x01f4;
                case 14: goto L_0x0217;
                case 15: goto L_0x0115;
                case 16: goto L_0x00e8;
                case 17: goto L_0x0099;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = r32
            r13 = r36
            r9 = r2
            r11 = r3
            r33 = r7
            r8 = r20
            r19 = -1
        L_0x0096:
            r7 = r4
            goto L_0x02bf
        L_0x0099:
            r8 = 3
            if (r0 != r8) goto L_0x00dc
            int r0 = r3 << 3
            r8 = r0 | 4
            c.b.b.b.d.f.Kc r0 = r15.a((int) r2)
            r1 = r32
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r34
            r4 = r8
            r8 = r20
            r19 = -1
            r5 = r36
            int r0 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (c.b.b.b.d.f.C0313db) r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x00bf
            r5 = r36
            java.lang.Object r1 = r5.f4401c
            goto L_0x00cb
        L_0x00bf:
            r5 = r36
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.f4401c
            java.lang.Object r1 = c.b.b.b.d.f.Nb.a((java.lang.Object) r1, (java.lang.Object) r2)
        L_0x00cb:
            r10.putObject(r14, r12, r1)
            r6 = r6 | r23
            r12 = r32
            r13 = r34
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r35
            r9 = r5
            goto L_0x0017
        L_0x00dc:
            r9 = r2
            r11 = r3
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            goto L_0x0238
        L_0x00e8:
            r5 = r36
            r9 = r2
            r11 = r3
            r8 = r20
            r19 = -1
            if (r0 != 0) goto L_0x0110
            r2 = r12
            r12 = r32
            int r13 = c.b.b.b.d.f.C0292ab.b(r12, r4, r5)
            long r0 = r5.f4400b
            long r17 = c.b.b.b.d.f.C0403qb.a((long) r0)
            r0 = r10
            r1 = r31
            r33 = r13
            r13 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r0 = r33
            goto L_0x02b5
        L_0x0110:
            r12 = r32
            r13 = r5
            goto L_0x0238
        L_0x0115:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != 0) goto L_0x0238
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r4, r13)
            int r1 = r13.f4399a
            int r1 = c.b.b.b.d.f.C0403qb.a((int) r1)
        L_0x012c:
            r10.putInt(r14, r2, r1)
            goto L_0x0175
        L_0x0130:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != 0) goto L_0x0238
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r4, r13)
            int r1 = r13.f4399a
            c.b.b.b.d.f.Sb r4 = r15.c((int) r9)
            if (r4 == 0) goto L_0x012c
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L_0x0150
            goto L_0x012c
        L_0x0150:
            c.b.b.b.d.f.dd r2 = a((java.lang.Object) r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.a((int) r8, (java.lang.Object) r1)
            goto L_0x02b5
        L_0x015e:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 2
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0238
            int r0 = c.b.b.b.d.f.C0292ab.e(r12, r4, r13)
            java.lang.Object r1 = r13.f4401c
            r10.putObject(r14, r2, r1)
        L_0x0175:
            r6 = r6 | r23
            goto L_0x02b5
        L_0x0179:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 2
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x01a3
            c.b.b.b.d.f.Kc r0 = r15.a((int) r9)
            r5 = r34
            int r0 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r0, (byte[]) r12, (int) r4, (int) r5, (c.b.b.b.d.f.C0313db) r13)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x0198
            java.lang.Object r1 = r13.f4401c
            goto L_0x01c8
        L_0x0198:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.f4401c
            java.lang.Object r1 = c.b.b.b.d.f.Nb.a((java.lang.Object) r1, (java.lang.Object) r4)
            goto L_0x01c8
        L_0x01a3:
            r5 = r34
            goto L_0x0238
        L_0x01a7:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 2
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0238
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01c2
            int r0 = c.b.b.b.d.f.C0292ab.c(r12, r4, r13)
            goto L_0x01c6
        L_0x01c2:
            int r0 = c.b.b.b.d.f.C0292ab.d(r12, r4, r13)
        L_0x01c6:
            java.lang.Object r1 = r13.f4401c
        L_0x01c8:
            r10.putObject(r14, r2, r1)
            goto L_0x020c
        L_0x01cc:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != 0) goto L_0x0238
            int r0 = c.b.b.b.d.f.C0292ab.b(r12, r4, r13)
            r33 = r0
            long r0 = r13.f4400b
            r20 = 0
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x01eb
            r0 = 1
            goto L_0x01ec
        L_0x01eb:
            r0 = 0
        L_0x01ec:
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r14, (long) r2, (boolean) r0)
            r6 = r6 | r23
            r0 = r33
            goto L_0x020e
        L_0x01f4:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0238
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x020c:
            r6 = r6 | r23
        L_0x020e:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r35
            r13 = r5
            goto L_0x0017
        L_0x0217:
            r5 = r34
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r20
            r1 = 1
            r19 = -1
            r12 = r32
            r13 = r36
            if (r0 != r1) goto L_0x0238
            long r17 = c.b.b.b.d.f.C0292ab.b(r12, r4)
            r0 = r10
            r1 = r31
            r33 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x02af
        L_0x0238:
            r33 = r7
            goto L_0x0096
        L_0x023c:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != 0) goto L_0x02bf
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r7, r13)
            int r1 = r13.f4399a
            r10.putInt(r14, r2, r1)
            goto L_0x02b1
        L_0x0257:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != 0) goto L_0x02bf
            int r7 = c.b.b.b.d.f.C0292ab.b(r12, r7, r13)
            long r4 = r13.f4400b
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r33
            goto L_0x02b9
        L_0x027d:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != r1) goto L_0x02bf
            float r0 = c.b.b.b.d.f.C0292ab.d(r12, r7)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r7 + 4
            goto L_0x02b1
        L_0x0297:
            r9 = r2
            r11 = r3
            r33 = r7
            r2 = r12
            r8 = r20
            r1 = 1
            r19 = -1
            r12 = r32
            r13 = r36
            r7 = r4
            if (r0 != r1) goto L_0x02bf
            double r0 = c.b.b.b.d.f.C0292ab.c(r12, r7)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x02af:
            int r0 = r7 + 8
        L_0x02b1:
            r6 = r6 | r23
            r7 = r33
        L_0x02b5:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02b9:
            r13 = r34
            r11 = r35
            goto L_0x0017
        L_0x02bf:
            r18 = r33
            r20 = r6
            r2 = r7
            r7 = r8
            r19 = r9
            r27 = r10
            r25 = r11
            r6 = r35
            goto L_0x03d5
        L_0x02cf:
            r5 = r3
            r18 = r7
            r8 = r20
            r19 = -1
            r7 = r4
            r28 = r12
            r12 = r32
            r13 = r9
            r9 = r2
            r2 = r28
            r1 = 27
            if (r11 != r1) goto L_0x0334
            r1 = 2
            if (r0 != r1) goto L_0x0327
            java.lang.Object r0 = r10.getObject(r14, r2)
            c.b.b.b.d.f.Tb r0 = (c.b.b.b.d.f.Tb) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0304
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02fb
            r1 = 10
            goto L_0x02fd
        L_0x02fb:
            int r1 = r1 << 1
        L_0x02fd:
            c.b.b.b.d.f.Tb r0 = r0.a(r1)
            r10.putObject(r14, r2, r0)
        L_0x0304:
            r11 = r0
            c.b.b.b.d.f.Kc r0 = r15.a((int) r9)
            r1 = r8
            r2 = r32
            r3 = r7
            r4 = r34
            r7 = r5
            r5 = r11
            r20 = r6
            r6 = r36
            int r0 = c.b.b.b.d.f.C0292ab.a(r0, r1, r2, r3, r4, r5, r6)
            r11 = r35
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r18
            r6 = r20
            r13 = r34
            goto L_0x0017
        L_0x0327:
            r20 = r6
            r25 = r5
            r15 = r7
            r26 = r8
            r19 = r9
            r27 = r10
            goto L_0x039b
        L_0x0334:
            r20 = r6
            r6 = r5
            r1 = 49
            if (r11 > r1) goto L_0x0383
            r5 = r21
            long r4 = (long) r5
            r1 = r0
            r0 = r30
            r33 = r1
            r1 = r31
            r23 = r2
            r2 = r32
            r3 = r7
            r21 = r4
            r4 = r34
            r5 = r8
            r25 = r6
            r15 = r7
            r7 = r33
            r26 = r8
            r8 = r9
            r19 = r9
            r27 = r10
            r9 = r21
            r12 = r23
            r14 = r36
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (c.b.b.b.d.f.C0313db) r14)
            if (r0 != r15) goto L_0x0369
            goto L_0x03d1
        L_0x0369:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r7 = r18
            r2 = r19
            r6 = r20
            r1 = r25
            r3 = r26
        L_0x037f:
            r10 = r27
            goto L_0x0017
        L_0x0383:
            r33 = r0
            r23 = r2
            r25 = r6
            r15 = r7
            r26 = r8
            r19 = r9
            r27 = r10
            r5 = r21
            r0 = 50
            if (r11 != r0) goto L_0x03b4
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x03a1
        L_0x039b:
            r6 = r35
            r2 = r15
        L_0x039e:
            r7 = r26
            goto L_0x03d5
        L_0x03a1:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r23
            r8 = r36
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (c.b.b.b.d.f.C0313db) r8)
            throw r17
        L_0x03b4:
            r7 = r33
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r8 = r5
            r5 = r26
            r6 = r25
            r9 = r11
            r10 = r23
            r12 = r19
            r13 = r36
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (c.b.b.b.d.f.C0313db) r13)
            if (r0 != r15) goto L_0x0456
        L_0x03d1:
            r6 = r35
            r2 = r0
            goto L_0x039e
        L_0x03d5:
            if (r7 != r6) goto L_0x03e6
            if (r6 != 0) goto L_0x03da
            goto L_0x03e6
        L_0x03da:
            r4 = -1
            r8 = r30
            r11 = r31
            r3 = r7
            r0 = r18
            r1 = r20
            goto L_0x047f
        L_0x03e6:
            r8 = r30
            boolean r0 = r8.f4659h
            if (r0 == 0) goto L_0x042e
            r9 = r36
            c.b.b.b.d.f.yb r0 = r9.f4402d
            c.b.b.b.d.f.yb r1 = c.b.b.b.d.f.C0458yb.a()
            if (r0 == r1) goto L_0x042b
            c.b.b.b.d.f.wc r0 = r8.f4658g
            c.b.b.b.d.f.yb r1 = r9.f4402d
            r10 = r25
            c.b.b.b.d.f.Lb$f r0 = r1.a(r0, r10)
            if (r0 != 0) goto L_0x041b
            c.b.b.b.d.f.dd r4 = a((java.lang.Object) r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = c.b.b.b.d.f.C0292ab.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (c.b.b.b.d.f.C0315dd) r4, (c.b.b.b.d.f.C0313db) r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r6
            r3 = r7
            r15 = r8
            goto L_0x0467
        L_0x041b:
            r11 = r31
            r0 = r11
            c.b.b.b.d.f.Lb$d r0 = (c.b.b.b.d.f.Lb.d) r0
            r0.o()
            c.b.b.b.d.f.Db<c.b.b.b.d.f.Lb$c> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x042b:
            r11 = r31
            goto L_0x0432
        L_0x042e:
            r11 = r31
            r9 = r36
        L_0x0432:
            r10 = r25
            c.b.b.b.d.f.dd r4 = a((java.lang.Object) r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = c.b.b.b.d.f.C0292ab.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (c.b.b.b.d.f.C0315dd) r4, (c.b.b.b.d.f.C0313db) r5)
            r12 = r32
            r13 = r34
            r3 = r7
            r15 = r8
            r1 = r10
            r14 = r11
            r7 = r18
            r2 = r19
            r10 = r27
            r11 = r6
            r6 = r20
            goto L_0x0017
        L_0x0456:
            r10 = r25
            r7 = r26
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r3 = r7
        L_0x0467:
            r1 = r10
            r7 = r18
            r2 = r19
            r6 = r20
            goto L_0x037f
        L_0x0470:
            r20 = r6
            r18 = r7
            r27 = r10
            r6 = r11
            r11 = r14
            r8 = r15
            r2 = r0
            r0 = r18
            r1 = r20
            r4 = -1
        L_0x047f:
            if (r0 == r4) goto L_0x0487
            long r4 = (long) r0
            r0 = r27
            r0.putInt(r11, r4, r1)
        L_0x0487:
            int r0 = r8.m
            r1 = r17
        L_0x048b:
            int r4 = r8.n
            if (r0 >= r4) goto L_0x049d
            int[] r4 = r8.l
            r4 = r4[r0]
            c.b.b.b.d.f.ad<?, ?> r5 = r8.q
            r8.a((java.lang.Object) r11, (int) r4, r1, r5)
            c.b.b.b.d.f.dd r1 = (c.b.b.b.d.f.C0315dd) r1
            int r0 = r0 + 1
            goto L_0x048b
        L_0x049d:
            if (r1 == 0) goto L_0x04a4
            c.b.b.b.d.f.ad<?, ?> r0 = r8.q
            r0.b((java.lang.Object) r11, r1)
        L_0x04a4:
            if (r6 != 0) goto L_0x04b0
            r0 = r34
            if (r2 != r0) goto L_0x04ab
            goto L_0x04b6
        L_0x04ab:
            c.b.b.b.d.f.Wb r0 = c.b.b.b.d.f.Wb.e()
            throw r0
        L_0x04b0:
            r0 = r34
            if (r2 > r0) goto L_0x04b7
            if (r3 != r6) goto L_0x04b7
        L_0x04b6:
            return r2
        L_0x04b7:
            c.b.b.b.d.f.Wb r0 = c.b.b.b.d.f.Wb.e()
            goto L_0x04bd
        L_0x04bc:
            throw r0
        L_0x04bd:
            goto L_0x04bc
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Object, byte[], int, int, int, c.b.b.b.d.f.db):int");
    }

    public final T a() {
        return this.o.c(this.f4658g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0345, code lost:
        r14.e(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0356, code lost:
        r14.d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0367, code lost:
        r14.c(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0378, code lost:
        r14.b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0389, code lost:
        r14.c(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039a, code lost:
        r14.f(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a5, code lost:
        r14.a(r9, (c.b.b.b.d.f.C0320eb) c.b.b.b.d.f.C0336gd.f(r13, (long) (r7 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b8, code lost:
        r14.a(r9, c.b.b.b.d.f.C0336gd.f(r13, (long) (r7 & 1048575)), a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cd, code lost:
        a(r9, c.b.b.b.d.f.C0336gd.f(r13, (long) (r7 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e4, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f5, code lost:
        r14.e(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        r14.b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0415, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0425, code lost:
        r14.d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0435, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0445, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0455, code lost:
        r14.a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0783, code lost:
        r14.b(r10, c.b.b.b.d.f.C0336gd.f(r13, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079e, code lost:
        r14.e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07af, code lost:
        r14.d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07c0, code lost:
        r14.c(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07d1, code lost:
        r14.b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07e2, code lost:
        r14.c(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07f3, code lost:
        r14.f(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07fe, code lost:
        r14.a(r10, (c.b.b.b.d.f.C0320eb) c.b.b.b.d.f.C0336gd.f(r13, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0811, code lost:
        r14.a(r10, c.b.b.b.d.f.C0336gd.f(r13, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0826, code lost:
        a(r10, c.b.b.b.d.f.C0336gd.f(r13, (long) (r8 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x083d, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x084e, code lost:
        r14.e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x085e, code lost:
        r14.b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x086e, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087e, code lost:
        r14.d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x088e, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089e, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ae, code lost:
        r14.a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032a, code lost:
        r14.b(r9, c.b.b.b.d.f.C0336gd.f(r13, (long) (r7 & 1048575)), a(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, c.b.b.b.d.f.C0453xd r14) {
        /*
            r12 = this;
            int r0 = r14.a()
            int r1 = c.b.b.b.d.f.Lb.e.m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x046b
            c.b.b.b.d.f.ad<?, ?> r0 = r12.q
            a(r0, r13, (c.b.b.b.d.f.C0453xd) r14)
            boolean r0 = r12.f4659h
            if (r0 == 0) goto L_0x0032
            c.b.b.b.d.f.Ab<?> r0 = r12.r
            c.b.b.b.d.f.Db r0 = r0.a((java.lang.Object) r13)
            c.b.b.b.d.f.Oc<T, java.lang.Object> r1 = r0.f4120b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.e()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.f4654c
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x0462
            int r7 = r12.d(r1)
            int[] r8 = r12.f4654c
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
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r7)
            r12.a((c.b.b.b.d.f.C0453xd) r14, (int) r9, (java.lang.Object) r7, (int) r1)
            goto L_0x0458
        L_0x013c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Kc r9 = r12.a((int) r1)
            c.b.b.b.d.f.Lc.b((int) r8, (java.util.List<?>) r7, (c.b.b.b.d.f.C0453xd) r14, (c.b.b.b.d.f.Kc) r9)
            goto L_0x0458
        L_0x014f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.e(r8, r7, r14, r4)
            goto L_0x0458
        L_0x015e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.j(r8, r7, r14, r4)
            goto L_0x0458
        L_0x016d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.g(r8, r7, r14, r4)
            goto L_0x0458
        L_0x017c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.l(r8, r7, r14, r4)
            goto L_0x0458
        L_0x018b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.m(r8, r7, r14, r4)
            goto L_0x0458
        L_0x019a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.i(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01a9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.n(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01b8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.k(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01c7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.f(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01d6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.h(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01e5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.d(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01f4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.c(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0203:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.b((int) r8, (java.util.List<java.lang.Float>) r7, (c.b.b.b.d.f.C0453xd) r14, (boolean) r4)
            goto L_0x0458
        L_0x0212:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.a((int) r8, (java.util.List<java.lang.Double>) r7, (c.b.b.b.d.f.C0453xd) r14, (boolean) r4)
            goto L_0x0458
        L_0x0221:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.e(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0230:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.j(r8, r7, r14, r5)
            goto L_0x0458
        L_0x023f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.g(r8, r7, r14, r5)
            goto L_0x0458
        L_0x024e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.l(r8, r7, r14, r5)
            goto L_0x0458
        L_0x025d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.m(r8, r7, r14, r5)
            goto L_0x0458
        L_0x026c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.i(r8, r7, r14, r5)
            goto L_0x0458
        L_0x027b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.b((int) r8, (java.util.List<c.b.b.b.d.f.C0320eb>) r7, (c.b.b.b.d.f.C0453xd) r14)
            goto L_0x0458
        L_0x028a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Kc r9 = r12.a((int) r1)
            c.b.b.b.d.f.Lc.a((int) r8, (java.util.List<?>) r7, (c.b.b.b.d.f.C0453xd) r14, (c.b.b.b.d.f.Kc) r9)
            goto L_0x0458
        L_0x029d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.a((int) r8, (java.util.List<java.lang.String>) r7, (c.b.b.b.d.f.C0453xd) r14)
            goto L_0x0458
        L_0x02ac:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.n(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02bb:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.k(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02ca:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.f(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02d9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.h(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02e8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.d(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02f7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.c(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0306:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.b((int) r8, (java.util.List<java.lang.Float>) r7, (c.b.b.b.d.f.C0453xd) r14, (boolean) r5)
            goto L_0x0458
        L_0x0315:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            c.b.b.b.d.f.Lc.a((int) r8, (java.util.List<java.lang.Double>) r7, (c.b.b.b.d.f.C0453xd) r14, (boolean) r5)
            goto L_0x0458
        L_0x0324:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x032a:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r7)
            c.b.b.b.d.f.Kc r8 = r12.a((int) r1)
            r14.b((int) r9, (java.lang.Object) r7, (c.b.b.b.d.f.Kc) r8)
            goto L_0x0458
        L_0x0339:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = c.b.b.b.d.f.C0336gd.b(r13, r7)
        L_0x0345:
            r14.e((int) r9, (long) r7)
            goto L_0x0458
        L_0x034a:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r7)
        L_0x0356:
            r14.d((int) r9, (int) r7)
            goto L_0x0458
        L_0x035b:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = c.b.b.b.d.f.C0336gd.b(r13, r7)
        L_0x0367:
            r14.c((int) r9, (long) r7)
            goto L_0x0458
        L_0x036c:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r7)
        L_0x0378:
            r14.b((int) r9, (int) r7)
            goto L_0x0458
        L_0x037d:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r7)
        L_0x0389:
            r14.c((int) r9, (int) r7)
            goto L_0x0458
        L_0x038e:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r7)
        L_0x039a:
            r14.f(r9, r7)
            goto L_0x0458
        L_0x039f:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x03a5:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r7)
            c.b.b.b.d.f.eb r7 = (c.b.b.b.d.f.C0320eb) r7
            r14.a((int) r9, (c.b.b.b.d.f.C0320eb) r7)
            goto L_0x0458
        L_0x03b2:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x03b8:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r7)
            c.b.b.b.d.f.Kc r8 = r12.a((int) r1)
            r14.a((int) r9, (java.lang.Object) r7, (c.b.b.b.d.f.Kc) r8)
            goto L_0x0458
        L_0x03c7:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
        L_0x03cd:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = c.b.b.b.d.f.C0336gd.f(r13, r7)
            a((int) r9, (java.lang.Object) r7, (c.b.b.b.d.f.C0453xd) r14)
            goto L_0x0458
        L_0x03d8:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = c.b.b.b.d.f.C0336gd.c(r13, r7)
        L_0x03e4:
            r14.a((int) r9, (boolean) r7)
            goto L_0x0458
        L_0x03e9:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r7)
        L_0x03f5:
            r14.e((int) r9, (int) r7)
            goto L_0x0458
        L_0x03f9:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = c.b.b.b.d.f.C0336gd.b(r13, r7)
        L_0x0405:
            r14.b((int) r9, (long) r7)
            goto L_0x0458
        L_0x0409:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r7)
        L_0x0415:
            r14.a((int) r9, (int) r7)
            goto L_0x0458
        L_0x0419:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = c.b.b.b.d.f.C0336gd.b(r13, r7)
        L_0x0425:
            r14.d((int) r9, (long) r7)
            goto L_0x0458
        L_0x0429:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = c.b.b.b.d.f.C0336gd.b(r13, r7)
        L_0x0435:
            r14.a((int) r9, (long) r7)
            goto L_0x0458
        L_0x0439:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = c.b.b.b.d.f.C0336gd.d(r13, r7)
        L_0x0445:
            r14.a((int) r9, (float) r7)
            goto L_0x0458
        L_0x0449:
            boolean r8 = r12.a(r13, (int) r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = c.b.b.b.d.f.C0336gd.e(r13, r7)
        L_0x0455:
            r14.a((int) r9, (double) r7)
        L_0x0458:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x045c:
            c.b.b.b.d.f.Ab<?> r13 = r12.r
            r13.a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x0462:
            if (r0 != 0) goto L_0x0465
            return
        L_0x0465:
            c.b.b.b.d.f.Ab<?> r13 = r12.r
            r13.a(r14, r0)
            throw r3
        L_0x046b:
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r12.f4659h
            if (r0 == 0) goto L_0x048c
            c.b.b.b.d.f.Ab<?> r0 = r12.r
            c.b.b.b.d.f.Db r0 = r0.a((java.lang.Object) r13)
            c.b.b.b.d.f.Oc<T, java.lang.Object> r1 = r0.f4120b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x048c
            java.util.Iterator r0 = r0.d()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x048d
        L_0x048c:
            r0 = r3
        L_0x048d:
            int[] r1 = r12.f4654c
            int r1 = r1.length
            r7 = 0
        L_0x0491:
            if (r7 >= r1) goto L_0x08bb
            int r8 = r12.d(r7)
            int[] r9 = r12.f4654c
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
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r8)
            r12.a((c.b.b.b.d.f.C0453xd) r14, (int) r10, (java.lang.Object) r8, (int) r7)
            goto L_0x08b1
        L_0x0595:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Kc r10 = r12.a((int) r7)
            c.b.b.b.d.f.Lc.b((int) r9, (java.util.List<?>) r8, (c.b.b.b.d.f.C0453xd) r14, (c.b.b.b.d.f.Kc) r10)
            goto L_0x08b1
        L_0x05a8:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.e(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05b7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.j(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05c6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.g(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05d5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.l(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05e4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.m(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05f3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.i(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0602:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.n(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0611:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.k(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0620:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.f(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x062f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.h(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x063e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.d(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x064d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.c(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x065c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.b((int) r9, (java.util.List<java.lang.Float>) r8, (c.b.b.b.d.f.C0453xd) r14, (boolean) r4)
            goto L_0x08b1
        L_0x066b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.a((int) r9, (java.util.List<java.lang.Double>) r8, (c.b.b.b.d.f.C0453xd) r14, (boolean) r4)
            goto L_0x08b1
        L_0x067a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.e(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0689:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.j(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0698:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.g(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06a7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.l(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06b6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.m(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06c5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.i(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06d4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.b((int) r9, (java.util.List<c.b.b.b.d.f.C0320eb>) r8, (c.b.b.b.d.f.C0453xd) r14)
            goto L_0x08b1
        L_0x06e3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Kc r10 = r12.a((int) r7)
            c.b.b.b.d.f.Lc.a((int) r9, (java.util.List<?>) r8, (c.b.b.b.d.f.C0453xd) r14, (c.b.b.b.d.f.Kc) r10)
            goto L_0x08b1
        L_0x06f6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.a((int) r9, (java.util.List<java.lang.String>) r8, (c.b.b.b.d.f.C0453xd) r14)
            goto L_0x08b1
        L_0x0705:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.n(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0714:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.k(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0723:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.f(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0732:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.h(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0741:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.d(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0750:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.c(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x075f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.b((int) r9, (java.util.List<java.lang.Float>) r8, (c.b.b.b.d.f.C0453xd) r14, (boolean) r5)
            goto L_0x08b1
        L_0x076e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            c.b.b.b.d.f.Lc.a((int) r9, (java.util.List<java.lang.Double>) r8, (c.b.b.b.d.f.C0453xd) r14, (boolean) r5)
            goto L_0x08b1
        L_0x077d:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0783:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r8)
            c.b.b.b.d.f.Kc r9 = r12.a((int) r7)
            r14.b((int) r10, (java.lang.Object) r8, (c.b.b.b.d.f.Kc) r9)
            goto L_0x08b1
        L_0x0792:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = c.b.b.b.d.f.C0336gd.b(r13, r8)
        L_0x079e:
            r14.e((int) r10, (long) r8)
            goto L_0x08b1
        L_0x07a3:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r8)
        L_0x07af:
            r14.d((int) r10, (int) r8)
            goto L_0x08b1
        L_0x07b4:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = c.b.b.b.d.f.C0336gd.b(r13, r8)
        L_0x07c0:
            r14.c((int) r10, (long) r8)
            goto L_0x08b1
        L_0x07c5:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r8)
        L_0x07d1:
            r14.b((int) r10, (int) r8)
            goto L_0x08b1
        L_0x07d6:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r8)
        L_0x07e2:
            r14.c((int) r10, (int) r8)
            goto L_0x08b1
        L_0x07e7:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r8)
        L_0x07f3:
            r14.f(r10, r8)
            goto L_0x08b1
        L_0x07f8:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x07fe:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r8)
            c.b.b.b.d.f.eb r8 = (c.b.b.b.d.f.C0320eb) r8
            r14.a((int) r10, (c.b.b.b.d.f.C0320eb) r8)
            goto L_0x08b1
        L_0x080b:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0811:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r8)
            c.b.b.b.d.f.Kc r9 = r12.a((int) r7)
            r14.a((int) r10, (java.lang.Object) r8, (c.b.b.b.d.f.Kc) r9)
            goto L_0x08b1
        L_0x0820:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0826:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = c.b.b.b.d.f.C0336gd.f(r13, r8)
            a((int) r10, (java.lang.Object) r8, (c.b.b.b.d.f.C0453xd) r14)
            goto L_0x08b1
        L_0x0831:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = c.b.b.b.d.f.C0336gd.c(r13, r8)
        L_0x083d:
            r14.a((int) r10, (boolean) r8)
            goto L_0x08b1
        L_0x0842:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r8)
        L_0x084e:
            r14.e((int) r10, (int) r8)
            goto L_0x08b1
        L_0x0852:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = c.b.b.b.d.f.C0336gd.b(r13, r8)
        L_0x085e:
            r14.b((int) r10, (long) r8)
            goto L_0x08b1
        L_0x0862:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r13, (long) r8)
        L_0x086e:
            r14.a((int) r10, (int) r8)
            goto L_0x08b1
        L_0x0872:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = c.b.b.b.d.f.C0336gd.b(r13, r8)
        L_0x087e:
            r14.d((int) r10, (long) r8)
            goto L_0x08b1
        L_0x0882:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = c.b.b.b.d.f.C0336gd.b(r13, r8)
        L_0x088e:
            r14.a((int) r10, (long) r8)
            goto L_0x08b1
        L_0x0892:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = c.b.b.b.d.f.C0336gd.d(r13, r8)
        L_0x089e:
            r14.a((int) r10, (float) r8)
            goto L_0x08b1
        L_0x08a2:
            boolean r9 = r12.a(r13, (int) r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = c.b.b.b.d.f.C0336gd.e(r13, r8)
        L_0x08ae:
            r14.a((int) r10, (double) r8)
        L_0x08b1:
            int r7 = r7 + 3
            goto L_0x0491
        L_0x08b5:
            c.b.b.b.d.f.Ab<?> r13 = r12.r
            r13.a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x08bb:
            if (r0 != 0) goto L_0x08c3
            c.b.b.b.d.f.ad<?, ?> r0 = r12.q
            a(r0, r13, (c.b.b.b.d.f.C0453xd) r14)
            return
        L_0x08c3:
            c.b.b.b.d.f.Ab<?> r13 = r12.r
            r13.a(r14, r0)
            throw r3
        L_0x08c9:
            r12.b(r13, (c.b.b.b.d.f.C0453xd) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Object, c.b.b.b.d.f.xd):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r6 == 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r1 = r11.f4401c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0107, code lost:
        if (r6 == 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0109, code lost:
        r0 = c.b.b.b.d.f.C0292ab.a(r12, r8, r11);
        r1 = r11.f4399a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
        r0.putLong(r1, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0141, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0145, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c7, code lost:
        if (r0 == r15) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0211, code lost:
        if (r0 == r15) goto L_0x0213;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r28, byte[] r29, int r30, int r31, c.b.b.b.d.f.C0313db r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.j
            if (r0 == 0) goto L_0x0240
            sun.misc.Unsafe r9 = f4653b
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0237
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = c.b.b.b.d.f.C0292ab.a((int) r0, (byte[]) r12, (int) r3, (c.b.b.b.d.f.C0313db) r11)
            int r3 = r11.f4399a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.a((int) r7, (int) r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.f((int) r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0214
        L_0x004b:
            int[] r0 = r15.f4654c
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x014d
            r0 = 1
            switch(r3) {
                case 0: goto L_0x0134;
                case 1: goto L_0x0125;
                case 2: goto L_0x0113;
                case 3: goto L_0x0113;
                case 4: goto L_0x0105;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00ce;
                case 8: goto L_0x00bc;
                case 9: goto L_0x00a1;
                case 10: goto L_0x0094;
                case 11: goto L_0x0105;
                case 12: goto L_0x008e;
                case 13: goto L_0x00e4;
                case 14: goto L_0x00f5;
                case 15: goto L_0x007e;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x018a
        L_0x0066:
            if (r6 != 0) goto L_0x018a
            int r6 = c.b.b.b.d.f.C0292ab.b(r12, r8, r11)
            r19 = r1
            long r0 = r11.f4400b
            long r21 = c.b.b.b.d.f.C0403qb.a((long) r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            goto L_0x0120
        L_0x007e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0145
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r8, r11)
            int r1 = r11.f4399a
            int r1 = c.b.b.b.d.f.C0403qb.a((int) r1)
            goto L_0x010f
        L_0x008e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0145
            goto L_0x0109
        L_0x0094:
            r2 = r1
            if (r6 != r10) goto L_0x018a
            int r0 = c.b.b.b.d.f.C0292ab.e(r12, r8, r11)
        L_0x009b:
            java.lang.Object r1 = r11.f4401c
        L_0x009d:
            r9.putObject(r14, r2, r1)
            goto L_0x00f1
        L_0x00a1:
            r2 = r1
            if (r6 != r10) goto L_0x018a
            c.b.b.b.d.f.Kc r0 = r15.a((int) r4)
            int r0 = c.b.b.b.d.f.C0292ab.a((c.b.b.b.d.f.Kc) r0, (byte[]) r12, (int) r8, (int) r13, (c.b.b.b.d.f.C0313db) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00b5
            java.lang.Object r1 = r11.f4401c
            goto L_0x009d
        L_0x00b5:
            java.lang.Object r5 = r11.f4401c
            java.lang.Object r1 = c.b.b.b.d.f.Nb.a((java.lang.Object) r1, (java.lang.Object) r5)
            goto L_0x009d
        L_0x00bc:
            r2 = r1
            if (r6 != r10) goto L_0x018a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00c9
            int r0 = c.b.b.b.d.f.C0292ab.c(r12, r8, r11)
            goto L_0x009b
        L_0x00c9:
            int r0 = c.b.b.b.d.f.C0292ab.d(r12, r8, r11)
            goto L_0x009b
        L_0x00ce:
            r2 = r1
            if (r6 != 0) goto L_0x018a
            int r1 = c.b.b.b.d.f.C0292ab.b(r12, r8, r11)
            long r5 = r11.f4400b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r0 = 0
        L_0x00df:
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x00f1
        L_0x00e4:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x018a
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x00f1:
            r2 = r4
            r1 = r7
            goto L_0x0234
        L_0x00f5:
            r2 = r1
            if (r6 != r0) goto L_0x018a
            long r5 = c.b.b.b.d.f.C0292ab.b(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x013f
        L_0x0105:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0145
        L_0x0109:
            int r0 = c.b.b.b.d.f.C0292ab.a(r12, r8, r11)
            int r1 = r11.f4399a
        L_0x010f:
            r9.putInt(r14, r2, r1)
            goto L_0x0141
        L_0x0113:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0145
            int r6 = c.b.b.b.d.f.C0292ab.b(r12, r8, r11)
            long r4 = r11.f4400b
            r0 = r9
            r1 = r28
        L_0x0120:
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0141
        L_0x0125:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x0145
            float r0 = c.b.b.b.d.f.C0292ab.d(r12, r8)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x0141
        L_0x0134:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0145
            double r0 = c.b.b.b.d.f.C0292ab.c(r12, r8)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x013f:
            int r0 = r8 + 8
        L_0x0141:
            r1 = r7
            r2 = r10
            goto L_0x0234
        L_0x0145:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x0191
        L_0x014d:
            r0 = 27
            if (r3 != r0) goto L_0x0194
            if (r6 != r10) goto L_0x018a
            java.lang.Object r0 = r9.getObject(r14, r1)
            c.b.b.b.d.f.Tb r0 = (c.b.b.b.d.f.Tb) r0
            boolean r3 = r0.a()
            if (r3 != 0) goto L_0x0171
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0168
            r3 = 10
            goto L_0x016a
        L_0x0168:
            int r3 = r3 << 1
        L_0x016a:
            c.b.b.b.d.f.Tb r0 = r0.a(r3)
            r9.putObject(r14, r1, r0)
        L_0x0171:
            r5 = r0
            c.b.b.b.d.f.Kc r0 = r15.a((int) r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = c.b.b.b.d.f.C0292ab.a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0234
        L_0x018a:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x0191:
            r26 = -1
            goto L_0x01e1
        L_0x0194:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01ca
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (c.b.b.b.d.f.C0313db) r14)
            if (r0 != r15) goto L_0x0224
            goto L_0x0213
        L_0x01ca:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x01f7
            r7 = r30
            if (r7 == r10) goto L_0x01e3
        L_0x01e1:
            r2 = r15
            goto L_0x0214
        L_0x01e3:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (c.b.b.b.d.f.C0313db) r8)
            r0 = 0
            throw r0
        L_0x01f7:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (c.b.b.b.d.f.C0313db) r13)
            if (r0 != r15) goto L_0x0224
        L_0x0213:
            r2 = r0
        L_0x0214:
            c.b.b.b.d.f.dd r4 = a((java.lang.Object) r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = c.b.b.b.d.f.C0292ab.a((int) r0, (byte[]) r1, (int) r2, (int) r3, (c.b.b.b.d.f.C0315dd) r4, (c.b.b.b.d.f.C0313db) r5)
        L_0x0224:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0234:
            r10 = -1
            goto L_0x0017
        L_0x0237:
            r4 = r13
            if (r0 != r4) goto L_0x023b
            return
        L_0x023b:
            c.b.b.b.d.f.Wb r0 = c.b.b.b.d.f.Wb.e()
            throw r0
        L_0x0240:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (c.b.b.b.d.f.C0313db) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Object, byte[], int, int, c.b.b.b.d.f.db):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (c.b.b.b.d.f.Lc.a(c.b.b.b.d.f.C0336gd.f(r10, r6), c.b.b.b.d.f.C0336gd.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (c.b.b.b.d.f.C0336gd.b(r10, r6) == c.b.b.b.d.f.C0336gd.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, r6) == c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (c.b.b.b.d.f.C0336gd.b(r10, r6) == c.b.b.b.d.f.C0336gd.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, r6) == c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, r6) == c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, r6) == c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (c.b.b.b.d.f.Lc.a(c.b.b.b.d.f.C0336gd.f(r10, r6), c.b.b.b.d.f.C0336gd.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (c.b.b.b.d.f.Lc.a(c.b.b.b.d.f.C0336gd.f(r10, r6), c.b.b.b.d.f.C0336gd.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (c.b.b.b.d.f.Lc.a(c.b.b.b.d.f.C0336gd.f(r10, r6), c.b.b.b.d.f.C0336gd.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (c.b.b.b.d.f.C0336gd.c(r10, r6) == c.b.b.b.d.f.C0336gd.c(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, r6) == c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (c.b.b.b.d.f.C0336gd.b(r10, r6) == c.b.b.b.d.f.C0336gd.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, r6) == c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (c.b.b.b.d.f.C0336gd.b(r10, r6) == c.b.b.b.d.f.C0336gd.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (c.b.b.b.d.f.C0336gd.b(r10, r6) == c.b.b.b.d.f.C0336gd.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(c.b.b.b.d.f.C0336gd.d(r10, r6)) == java.lang.Float.floatToIntBits(c.b.b.b.d.f.C0336gd.d(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(c.b.b.b.d.f.C0336gd.e(r10, r6)) == java.lang.Double.doubleToLongBits(c.b.b.b.d.f.C0336gd.e(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (c.b.b.b.d.f.Lc.a(c.b.b.b.d.f.C0336gd.f(r10, r6), c.b.b.b.d.f.C0336gd.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f4654c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.d(r2)
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
            int r8 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r4)
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = c.b.b.b.d.f.C0336gd.f(r10, r6)
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r11, r6)
            boolean r4 = c.b.b.b.d.f.Lc.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = c.b.b.b.d.f.C0336gd.f(r10, r6)
            java.lang.Object r4 = c.b.b.b.d.f.C0336gd.f(r11, r6)
            boolean r3 = c.b.b.b.d.f.Lc.a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = c.b.b.b.d.f.C0336gd.f(r10, r6)
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r11, r6)
            boolean r4 = c.b.b.b.d.f.Lc.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = c.b.b.b.d.f.C0336gd.b(r10, r6)
            long r6 = c.b.b.b.d.f.C0336gd.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r6)
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = c.b.b.b.d.f.C0336gd.b(r10, r6)
            long r6 = c.b.b.b.d.f.C0336gd.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r6)
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r6)
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r6)
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = c.b.b.b.d.f.C0336gd.f(r10, r6)
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r11, r6)
            boolean r4 = c.b.b.b.d.f.Lc.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = c.b.b.b.d.f.C0336gd.f(r10, r6)
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r11, r6)
            boolean r4 = c.b.b.b.d.f.Lc.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = c.b.b.b.d.f.C0336gd.f(r10, r6)
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r11, r6)
            boolean r4 = c.b.b.b.d.f.Lc.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = c.b.b.b.d.f.C0336gd.c(r10, r6)
            boolean r5 = c.b.b.b.d.f.C0336gd.c(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r6)
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = c.b.b.b.d.f.C0336gd.b(r10, r6)
            long r6 = c.b.b.b.d.f.C0336gd.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r10, (long) r6)
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = c.b.b.b.d.f.C0336gd.b(r10, r6)
            long r6 = c.b.b.b.d.f.C0336gd.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = c.b.b.b.d.f.C0336gd.b(r10, r6)
            long r6 = c.b.b.b.d.f.C0336gd.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = c.b.b.b.d.f.C0336gd.d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = c.b.b.b.d.f.C0336gd.d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = c.b.b.b.d.f.C0336gd.e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = c.b.b.b.d.f.C0336gd.e(r11, r6)
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
            c.b.b.b.d.f.ad<?, ?> r0 = r9.q
            java.lang.Object r0 = r0.a(r10)
            c.b.b.b.d.f.ad<?, ?> r2 = r9.q
            java.lang.Object r2 = r2.a(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r9.f4659h
            if (r0 == 0) goto L_0x01e2
            c.b.b.b.d.f.Ab<?> r0 = r9.r
            c.b.b.b.d.f.Db r10 = r0.a((java.lang.Object) r10)
            c.b.b.b.d.f.Ab<?> r0 = r9.r
            c.b.b.b.d.f.Db r11 = r0.a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (c.b.b.b.d.f.C0437vb.e(r3) + c.b.b.b.d.f.C0437vb.g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = c.b.b.b.d.f.C0437vb.c(r3, (c.b.b.b.d.f.C0445wc) c.b.b.b.d.f.C0336gd.f(r1, r5), a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = c.b.b.b.d.f.C0437vb.f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = c.b.b.b.d.f.C0437vb.h(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = c.b.b.b.d.f.C0437vb.h(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = c.b.b.b.d.f.C0437vb.j(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = c.b.b.b.d.f.C0437vb.k(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = c.b.b.b.d.f.C0437vb.g(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = c.b.b.b.d.f.C0336gd.f(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = c.b.b.b.d.f.C0437vb.c(r3, (c.b.b.b.d.f.C0320eb) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = c.b.b.b.d.f.Lc.a(r3, c.b.b.b.d.f.C0336gd.f(r1, r5), a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof c.b.b.b.d.f.C0320eb) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = c.b.b.b.d.f.C0437vb.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = c.b.b.b.d.f.C0437vb.b(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = c.b.b.b.d.f.C0437vb.i(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = c.b.b.b.d.f.C0437vb.g(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = c.b.b.b.d.f.C0437vb.f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = c.b.b.b.d.f.C0437vb.e(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = c.b.b.b.d.f.C0437vb.d(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = c.b.b.b.d.f.C0437vb.b(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = c.b.b.b.d.f.C0437vb.b(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 3;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0417, code lost:
        if (a(r1, r15, r3) != false) goto L_0x06b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0437, code lost:
        if (a(r1, r15, r3) != false) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043f, code lost:
        if (a(r1, r15, r3) != false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045f, code lost:
        if (a(r1, r15, r3) != false) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (a(r1, r15, r3) != false) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0477, code lost:
        if ((r4 instanceof c.b.b.b.d.f.C0320eb) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047f, code lost:
        if (a(r1, r15, r3) != false) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0487, code lost:
        if (a(r1, r15, r3) != false) goto L_0x074f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0512, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0524, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0536, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0548, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055a, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x056c, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x057e, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0590, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a1, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b2, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c3, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d4, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05e5, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05f6, code lost:
        if (r0.k != false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05f8, code lost:
        r2.putInt(r1, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fc, code lost:
        r9 = (c.b.b.b.d.f.C0437vb.e(r15) + c.b.b.b.d.f.C0437vb.g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06a7, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06a8, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06b1, code lost:
        if ((r12 & r18) != 0) goto L_0x06b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06b3, code lost:
        r4 = c.b.b.b.d.f.C0437vb.c(r15, (c.b.b.b.d.f.C0445wc) r2.getObject(r1, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06ca, code lost:
        r4 = c.b.b.b.d.f.C0437vb.f(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06d7, code lost:
        r4 = c.b.b.b.d.f.C0437vb.h(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06de, code lost:
        if ((r12 & r18) != 0) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06e0, code lost:
        r4 = c.b.b.b.d.f.C0437vb.h(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06e9, code lost:
        if ((r12 & r18) != 0) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06eb, code lost:
        r9 = c.b.b.b.d.f.C0437vb.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06f9, code lost:
        r4 = c.b.b.b.d.f.C0437vb.k(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0706, code lost:
        r4 = c.b.b.b.d.f.C0437vb.g(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x070d, code lost:
        if ((r12 & r18) != 0) goto L_0x070f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x070f, code lost:
        r4 = r2.getObject(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0713, code lost:
        r4 = c.b.b.b.d.f.C0437vb.c(r15, (c.b.b.b.d.f.C0320eb) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x071c, code lost:
        if ((r12 & r18) != 0) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x071e, code lost:
        r4 = c.b.b.b.d.f.Lc.a(r15, r2.getObject(r1, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0736, code lost:
        if ((r4 instanceof c.b.b.b.d.f.C0320eb) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0739, code lost:
        r4 = c.b.b.b.d.f.C0437vb.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof c.b.b.b.d.f.C0320eb) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0743, code lost:
        if ((r12 & r18) != 0) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0745, code lost:
        r4 = c.b.b.b.d.f.C0437vb.b(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x074d, code lost:
        if ((r12 & r18) != 0) goto L_0x074f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x074f, code lost:
        r9 = c.b.b.b.d.f.C0437vb.i(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0754, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0791, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07b1, code lost:
        r3 = r3 + 3;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f4653b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f4654c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f4654c
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            c.b.b.b.d.f.Eb r14 = c.b.b.b.d.f.Eb.DOUBLE_LIST_PACKED
            int r14 = r14.a()
            if (r15 < r14) goto L_0x0041
            c.b.b.b.d.f.Eb r14 = c.b.b.b.d.f.Eb.SINT64_LIST_PACKED
            int r14 = r14.a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f4654c
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = e(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = d(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = d(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = d(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r1, r5)
            boolean r6 = r5 instanceof c.b.b.b.d.f.C0320eb
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = d(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = e(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = e(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            c.b.b.b.d.f.pc r14 = r0.s
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r1, r5)
            java.lang.Object r6 = r0.b((int) r12)
            int r3 = r14.a(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            c.b.b.b.d.f.Kc r6 = r0.a((int) r12)
            int r3 = c.b.b.b.d.f.Lc.b((int) r3, (java.util.List<c.b.b.b.d.f.C0445wc>) r5, (c.b.b.b.d.f.Kc) r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.c(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.g(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.d(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.f(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.j(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.e(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.b(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = c.b.b.b.d.f.Lc.i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.k
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = c.b.b.b.d.f.C0437vb.e((int) r3)
            int r6 = c.b.b.b.d.f.C0437vb.g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.c(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.g(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.d(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.f(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.b(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            c.b.b.b.d.f.Kc r6 = r0.a((int) r12)
            int r3 = c.b.b.b.d.f.Lc.a((int) r3, (java.util.List<?>) r5, (c.b.b.b.d.f.Kc) r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.a((int) r3, (java.util.List<?>) r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.j(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.e(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.h(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = a((java.lang.Object) r1, (long) r5)
            int r3 = c.b.b.b.d.f.Lc.i(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r1, r5)
            c.b.b.b.d.f.wc r5 = (c.b.b.b.d.f.C0445wc) r5
            c.b.b.b.d.f.Kc r6 = r0.a((int) r12)
            int r3 = c.b.b.b.d.f.C0437vb.c(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = c.b.b.b.d.f.C0336gd.b(r1, r5)
        L_0x02b8:
            int r3 = c.b.b.b.d.f.C0437vb.f((int) r3, (long) r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r1, (long) r5)
        L_0x02c7:
            int r3 = c.b.b.b.d.f.C0437vb.h((int) r3, (int) r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = c.b.b.b.d.f.C0437vb.h((int) r3, (long) r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = c.b.b.b.d.f.C0437vb.j(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r1, (long) r5)
        L_0x02ec:
            int r3 = c.b.b.b.d.f.C0437vb.k(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r1, (long) r5)
        L_0x02fb:
            int r3 = c.b.b.b.d.f.C0437vb.g((int) r3, (int) r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r1, r5)
        L_0x030a:
            c.b.b.b.d.f.eb r5 = (c.b.b.b.d.f.C0320eb) r5
            int r3 = c.b.b.b.d.f.C0437vb.c((int) r3, (c.b.b.b.d.f.C0320eb) r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r1, r5)
            c.b.b.b.d.f.Kc r6 = r0.a((int) r12)
            int r3 = c.b.b.b.d.f.Lc.a((int) r3, (java.lang.Object) r5, (c.b.b.b.d.f.Kc) r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = c.b.b.b.d.f.C0336gd.f(r1, r5)
            boolean r6 = r5 instanceof c.b.b.b.d.f.C0320eb
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = c.b.b.b.d.f.C0437vb.b((int) r3, (java.lang.String) r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = c.b.b.b.d.f.C0437vb.b((int) r3, (boolean) r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = c.b.b.b.d.f.C0437vb.i(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = c.b.b.b.d.f.C0437vb.g((int) r3, (long) r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r1, (long) r5)
        L_0x036a:
            int r3 = c.b.b.b.d.f.C0437vb.f((int) r3, (int) r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = c.b.b.b.d.f.C0336gd.b(r1, r5)
        L_0x037a:
            int r3 = c.b.b.b.d.f.C0437vb.e((int) r3, (long) r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = c.b.b.b.d.f.C0336gd.b(r1, r5)
        L_0x038a:
            int r3 = c.b.b.b.d.f.C0437vb.d((int) r3, (long) r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = c.b.b.b.d.f.C0437vb.b((int) r3, (float) r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = c.b.b.b.d.f.C0437vb.b((int) r3, (double) r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            c.b.b.b.d.f.ad<?, ?> r2 = r0.q
            int r1 = a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f4653b
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x03bf:
            int[] r13 = r0.f4654c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x07b7
            int r13 = r0.d(r3)
            int[] r14 = r0.f4654c
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03eb
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r6) goto L_0x03e8
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            goto L_0x03e9
        L_0x03e8:
            r14 = r6
        L_0x03e9:
            r6 = r14
            goto L_0x040b
        L_0x03eb:
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x0408
            c.b.b.b.d.f.Eb r9 = c.b.b.b.d.f.Eb.DOUBLE_LIST_PACKED
            int r9 = r9.a()
            if (r4 < r9) goto L_0x0408
            c.b.b.b.d.f.Eb r9 = c.b.b.b.d.f.Eb.SINT64_LIST_PACKED
            int r9 = r9.a()
            if (r4 > r9) goto L_0x0408
            int[] r9 = r0.f4654c
            int r10 = r3 + 2
            r9 = r9[r10]
            r11 = r9 & r8
            goto L_0x0409
        L_0x0408:
            r11 = 0
        L_0x0409:
            r18 = 0
        L_0x040b:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r4) {
                case 0: goto L_0x07a3;
                case 1: goto L_0x0794;
                case 2: goto L_0x0783;
                case 3: goto L_0x0774;
                case 4: goto L_0x0765;
                case 5: goto L_0x0757;
                case 6: goto L_0x074b;
                case 7: goto L_0x0741;
                case 8: goto L_0x072c;
                case 9: goto L_0x071a;
                case 10: goto L_0x070b;
                case 11: goto L_0x06fe;
                case 12: goto L_0x06f1;
                case 13: goto L_0x06e7;
                case 14: goto L_0x06dc;
                case 15: goto L_0x06cf;
                case 16: goto L_0x06c2;
                case 17: goto L_0x06af;
                case 18: goto L_0x069c;
                case 19: goto L_0x0690;
                case 20: goto L_0x0684;
                case 21: goto L_0x0678;
                case 22: goto L_0x066c;
                case 23: goto L_0x069c;
                case 24: goto L_0x0690;
                case 25: goto L_0x0660;
                case 26: goto L_0x0655;
                case 27: goto L_0x0646;
                case 28: goto L_0x063b;
                case 29: goto L_0x062f;
                case 30: goto L_0x0622;
                case 31: goto L_0x0690;
                case 32: goto L_0x069c;
                case 33: goto L_0x0615;
                case 34: goto L_0x0608;
                case 35: goto L_0x05e8;
                case 36: goto L_0x05d7;
                case 37: goto L_0x05c6;
                case 38: goto L_0x05b5;
                case 39: goto L_0x05a4;
                case 40: goto L_0x0593;
                case 41: goto L_0x0582;
                case 42: goto L_0x0570;
                case 43: goto L_0x055e;
                case 44: goto L_0x054c;
                case 45: goto L_0x053a;
                case 46: goto L_0x0528;
                case 47: goto L_0x0516;
                case 48: goto L_0x0504;
                case 49: goto L_0x04f4;
                case 50: goto L_0x04e4;
                case 51: goto L_0x04d6;
                case 52: goto L_0x04c9;
                case 53: goto L_0x04b9;
                case 54: goto L_0x04a9;
                case 55: goto L_0x0499;
                case 56: goto L_0x048b;
                case 57: goto L_0x0483;
                case 58: goto L_0x047b;
                case 59: goto L_0x046b;
                case 60: goto L_0x0463;
                case 61: goto L_0x045b;
                case 62: goto L_0x044f;
                case 63: goto L_0x0443;
                case 64: goto L_0x043b;
                case 65: goto L_0x0433;
                case 66: goto L_0x0427;
                case 67: goto L_0x041b;
                case 68: goto L_0x0413;
                default: goto L_0x0411;
            }
        L_0x0411:
            goto L_0x06a8
        L_0x0413:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x06b3
        L_0x041b:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            long r9 = e(r1, r9)
            goto L_0x06ca
        L_0x0427:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            int r4 = d(r1, r9)
            goto L_0x06d7
        L_0x0433:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x06e0
        L_0x043b:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x06eb
        L_0x0443:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            int r4 = d(r1, r9)
            goto L_0x06f9
        L_0x044f:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            int r4 = d(r1, r9)
            goto L_0x0706
        L_0x045b:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x070f
        L_0x0463:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x071e
        L_0x046b:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof c.b.b.b.d.f.C0320eb
            if (r9 == 0) goto L_0x0739
            goto L_0x0738
        L_0x047b:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x0745
        L_0x0483:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            goto L_0x074f
        L_0x048b:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            r9 = 0
            int r4 = c.b.b.b.d.f.C0437vb.g((int) r15, (long) r9)
            goto L_0x06a7
        L_0x0499:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            int r4 = d(r1, r9)
            int r4 = c.b.b.b.d.f.C0437vb.f((int) r15, (int) r4)
            goto L_0x06a7
        L_0x04a9:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            long r9 = e(r1, r9)
            int r4 = c.b.b.b.d.f.C0437vb.e((int) r15, (long) r9)
            goto L_0x06a7
        L_0x04b9:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            long r9 = e(r1, r9)
            int r4 = c.b.b.b.d.f.C0437vb.d((int) r15, (long) r9)
            goto L_0x06a7
        L_0x04c9:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            r4 = 0
            int r9 = c.b.b.b.d.f.C0437vb.b((int) r15, (float) r4)
            goto L_0x0754
        L_0x04d6:
            boolean r4 = r0.a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06a8
            r9 = 0
            int r4 = c.b.b.b.d.f.C0437vb.b((int) r15, (double) r9)
            goto L_0x06a7
        L_0x04e4:
            c.b.b.b.d.f.pc r4 = r0.s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.b((int) r3)
            int r4 = r4.a(r15, r9, r10)
            goto L_0x06a7
        L_0x04f4:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            c.b.b.b.d.f.Kc r9 = r0.a((int) r3)
            int r4 = c.b.b.b.d.f.Lc.b((int) r15, (java.util.List<c.b.b.b.d.f.C0445wc>) r4, (c.b.b.b.d.f.Kc) r9)
            goto L_0x06a7
        L_0x0504:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.c(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x0516:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.g(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x0528:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.i(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x053a:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.h(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x054c:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.d(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x055e:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.f(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x0570:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.j(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x0582:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.h(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x0593:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.i(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x05a4:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.e(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x05b5:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.b(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x05c6:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.a((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x05d7:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.h(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
            goto L_0x05f8
        L_0x05e8:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.i(r4)
            if (r4 <= 0) goto L_0x06a8
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x05fc
        L_0x05f8:
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x05fc:
            int r9 = c.b.b.b.d.f.C0437vb.e((int) r15)
            int r10 = c.b.b.b.d.f.C0437vb.g((int) r4)
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0754
        L_0x0608:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = c.b.b.b.d.f.Lc.c(r15, r4, r11)
            goto L_0x06a7
        L_0x0615:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.g(r15, r4, r11)
            goto L_0x06a7
        L_0x0622:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.d(r15, r4, r11)
            goto L_0x06a7
        L_0x062f:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.f(r15, r4, r11)
            goto L_0x06a7
        L_0x063b:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.b(r15, r4)
            goto L_0x06a7
        L_0x0646:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            c.b.b.b.d.f.Kc r9 = r0.a((int) r3)
            int r4 = c.b.b.b.d.f.Lc.a((int) r15, (java.util.List<?>) r4, (c.b.b.b.d.f.Kc) r9)
            goto L_0x06a7
        L_0x0655:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.a((int) r15, (java.util.List<?>) r4)
            goto L_0x06a7
        L_0x0660:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = c.b.b.b.d.f.Lc.j(r15, r4, r11)
            goto L_0x06a7
        L_0x066c:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.e(r15, r4, r11)
            goto L_0x06a7
        L_0x0678:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.b((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            goto L_0x06a7
        L_0x0684:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.a((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            goto L_0x06a7
        L_0x0690:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.h(r15, r4, r11)
            goto L_0x06a7
        L_0x069c:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = c.b.b.b.d.f.Lc.i(r15, r4, r11)
        L_0x06a7:
            int r5 = r5 + r4
        L_0x06a8:
            r4 = 0
            r9 = 0
            r13 = 0
            goto L_0x07b1
        L_0x06af:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x06b3:
            java.lang.Object r4 = r2.getObject(r1, r9)
            c.b.b.b.d.f.wc r4 = (c.b.b.b.d.f.C0445wc) r4
            c.b.b.b.d.f.Kc r9 = r0.a((int) r3)
            int r4 = c.b.b.b.d.f.C0437vb.c(r15, r4, r9)
            goto L_0x06a7
        L_0x06c2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
            long r9 = r2.getLong(r1, r9)
        L_0x06ca:
            int r4 = c.b.b.b.d.f.C0437vb.f((int) r15, (long) r9)
            goto L_0x06a7
        L_0x06cf:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
            int r4 = r2.getInt(r1, r9)
        L_0x06d7:
            int r4 = c.b.b.b.d.f.C0437vb.h((int) r15, (int) r4)
            goto L_0x06a7
        L_0x06dc:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x06e0:
            r9 = 0
            int r4 = c.b.b.b.d.f.C0437vb.h((int) r15, (long) r9)
            goto L_0x06a7
        L_0x06e7:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x06eb:
            r4 = 0
            int r9 = c.b.b.b.d.f.C0437vb.j(r15, r4)
            goto L_0x0754
        L_0x06f1:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
            int r4 = r2.getInt(r1, r9)
        L_0x06f9:
            int r4 = c.b.b.b.d.f.C0437vb.k(r15, r4)
            goto L_0x06a7
        L_0x06fe:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
            int r4 = r2.getInt(r1, r9)
        L_0x0706:
            int r4 = c.b.b.b.d.f.C0437vb.g((int) r15, (int) r4)
            goto L_0x06a7
        L_0x070b:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x070f:
            java.lang.Object r4 = r2.getObject(r1, r9)
        L_0x0713:
            c.b.b.b.d.f.eb r4 = (c.b.b.b.d.f.C0320eb) r4
            int r4 = c.b.b.b.d.f.C0437vb.c((int) r15, (c.b.b.b.d.f.C0320eb) r4)
            goto L_0x06a7
        L_0x071a:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x071e:
            java.lang.Object r4 = r2.getObject(r1, r9)
            c.b.b.b.d.f.Kc r9 = r0.a((int) r3)
            int r4 = c.b.b.b.d.f.Lc.a((int) r15, (java.lang.Object) r4, (c.b.b.b.d.f.Kc) r9)
            goto L_0x06a7
        L_0x072c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof c.b.b.b.d.f.C0320eb
            if (r9 == 0) goto L_0x0739
        L_0x0738:
            goto L_0x0713
        L_0x0739:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = c.b.b.b.d.f.C0437vb.b((int) r15, (java.lang.String) r4)
            goto L_0x06a7
        L_0x0741:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x0745:
            int r4 = c.b.b.b.d.f.C0437vb.b((int) r15, (boolean) r7)
            goto L_0x06a7
        L_0x074b:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06a8
        L_0x074f:
            r4 = 0
            int r9 = c.b.b.b.d.f.C0437vb.i(r15, r4)
        L_0x0754:
            int r5 = r5 + r9
            goto L_0x06a8
        L_0x0757:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0762
            r13 = 0
            int r4 = c.b.b.b.d.f.C0437vb.g((int) r15, (long) r13)
            goto L_0x0791
        L_0x0762:
            r13 = 0
            goto L_0x0792
        L_0x0765:
            r13 = 0
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0792
            int r4 = r2.getInt(r1, r9)
            int r4 = c.b.b.b.d.f.C0437vb.f((int) r15, (int) r4)
            goto L_0x0791
        L_0x0774:
            r13 = 0
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0792
            long r9 = r2.getLong(r1, r9)
            int r4 = c.b.b.b.d.f.C0437vb.e((int) r15, (long) r9)
            goto L_0x0791
        L_0x0783:
            r13 = 0
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0792
            long r9 = r2.getLong(r1, r9)
            int r4 = c.b.b.b.d.f.C0437vb.d((int) r15, (long) r9)
        L_0x0791:
            int r5 = r5 + r4
        L_0x0792:
            r4 = 0
            goto L_0x07a0
        L_0x0794:
            r13 = 0
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0792
            r4 = 0
            int r9 = c.b.b.b.d.f.C0437vb.b((int) r15, (float) r4)
            int r5 = r5 + r9
        L_0x07a0:
            r9 = 0
            goto L_0x07b1
        L_0x07a3:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x07a0
            r9 = 0
            int r11 = c.b.b.b.d.f.C0437vb.b((int) r15, (double) r9)
            int r5 = r5 + r11
        L_0x07b1:
            int r3 = r3 + 3
            r9 = r13
            r11 = 0
            goto L_0x03bf
        L_0x07b7:
            c.b.b.b.d.f.ad<?, ?> r2 = r0.q
            int r2 = a(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f4659h
            if (r2 == 0) goto L_0x080d
            c.b.b.b.d.f.Ab<?> r2 = r0.r
            c.b.b.b.d.f.Db r1 = r2.a((java.lang.Object) r1)
            c.b.b.b.d.f.Oc<T, java.lang.Object> r2 = r1.f4120b
            int r2 = r2.c()
            r3 = 0
            if (r2 > 0) goto L_0x07f8
            c.b.b.b.d.f.Oc<T, java.lang.Object> r1 = r1.f4120b
            java.lang.Iterable r1 = r1.d()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x07e4
            int r5 = r5 + 0
            goto L_0x080d
        L_0x07e4:
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            c.b.b.b.d.f.Fb r2 = (c.b.b.b.d.f.Fb) r2
            java.lang.Object r1 = r1.getValue()
            c.b.b.b.d.f.Db.a(r2, r1)
            throw r3
        L_0x07f8:
            c.b.b.b.d.f.Oc<T, java.lang.Object> r1 = r1.f4120b
            r2 = 0
            java.util.Map$Entry r1 = r1.b((int) r2)
            java.lang.Object r2 = r1.getKey()
            c.b.b.b.d.f.Fb r2 = (c.b.b.b.d.f.Fb) r2
            java.lang.Object r1 = r1.getValue()
            c.b.b.b.d.f.Db.a(r2, r1)
            throw r3
        L_0x080d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.b(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, r2, c.b.b.b.d.f.C0336gd.f(r8, r2));
        b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, r2, c.b.b.b.d.f.C0336gd.f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, r2, c.b.b.b.d.f.C0336gd.a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, r2, c.b.b.b.d.f.C0336gd.b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0105
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f4654c
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.d(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f4654c
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
            java.lang.Object r1 = c.b.b.b.d.f.C0336gd.f(r8, r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            r6.b(r7, (int) r4, (int) r0)
            goto L_0x00ee
        L_0x003d:
            c.b.b.b.d.f.pc r1 = r6.s
            c.b.b.b.d.f.Lc.a((c.b.b.b.d.f.C0397pc) r1, r7, r8, (long) r2)
            goto L_0x00ee
        L_0x0044:
            c.b.b.b.d.f.fc r1 = r6.p
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
            java.lang.Object r1 = c.b.b.b.d.f.C0336gd.f(r8, r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = c.b.b.b.d.f.C0336gd.c(r8, r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (boolean) r1)
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
            int r1 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r8, (long) r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (int) r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = c.b.b.b.d.f.C0336gd.b(r8, r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (long) r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = c.b.b.b.d.f.C0336gd.d(r8, r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (float) r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = c.b.b.b.d.f.C0336gd.e(r8, r2)
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r7, (long) r2, (double) r4)
        L_0x00eb:
            r6.b(r7, (int) r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x00f2:
            boolean r0 = r6.j
            if (r0 != 0) goto L_0x0104
            c.b.b.b.d.f.ad<?, ?> r0 = r6.q
            c.b.b.b.d.f.Lc.a(r0, r7, r8)
            boolean r0 = r6.f4659h
            if (r0 == 0) goto L_0x0104
            c.b.b.b.d.f.Ab<?> r0 = r6.r
            c.b.b.b.d.f.Lc.a(r0, r7, r8)
        L_0x0104:
            return
        L_0x0105:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            goto L_0x010c
        L_0x010b:
            throw r7
        L_0x010c:
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.b(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = c.b.b.b.d.f.C0336gd.f(r9, r5);
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
        r3 = c.b.b.b.d.f.C0336gd.f(r9, r5);
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
        r3 = ((java.lang.String) c.b.b.b.d.f.C0336gd.f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = c.b.b.b.d.f.Nb.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = c.b.b.b.d.f.Nb.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f4654c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.d(r1)
            int[] r4 = r8.f4654c
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
            java.lang.Object r3 = c.b.b.b.d.f.C0336gd.f(r9, r5)
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
            java.lang.Object r3 = c.b.b.b.d.f.C0336gd.f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = c.b.b.b.d.f.C0336gd.f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = c.b.b.b.d.f.C0336gd.f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = c.b.b.b.d.f.C0336gd.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = c.b.b.b.d.f.C0336gd.c(r9, r5)
        L_0x00fd:
            int r3 = c.b.b.b.d.f.Nb.a((boolean) r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = c.b.b.b.d.f.C0336gd.a((java.lang.Object) r9, (long) r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = c.b.b.b.d.f.C0336gd.b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = c.b.b.b.d.f.C0336gd.d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = c.b.b.b.d.f.C0336gd.e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = c.b.b.b.d.f.Nb.a((long) r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            c.b.b.b.d.f.ad<?, ?> r0 = r8.q
            java.lang.Object r0 = r0.a(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f4659h
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            c.b.b.b.d.f.Ab<?> r0 = r8.r
            c.b.b.b.d.f.Db r9 = r0.a((java.lang.Object) r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0465zc.c(java.lang.Object):int");
    }

    public final boolean e(T t) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.f4659h || this.r.a((Object) t).f();
            }
            int i6 = this.l[i3];
            int i7 = this.f4654c[i6];
            int d2 = d(i6);
            if (!this.j) {
                int i8 = this.f4654c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i4) {
                    i5 = f4653b.getInt(t, (long) i9);
                    i4 = i9;
                }
            } else {
                i2 = 0;
            }
            if (((268435456 & d2) != 0) && !a(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & d2) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (a(t, i7, i6) && !a((Object) t, d2, a(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.s.b(C0336gd.f(t, (long) (d2 & 1048575))).isEmpty()) {
                            this.s.a(b(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) C0336gd.f(t, (long) (d2 & 1048575));
                if (!list.isEmpty()) {
                    Kc a2 = a(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!a2.e(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a(t, i6, i5, i2) && !a((Object) t, d2, a(i6))) {
                return false;
            }
            i3++;
        }
    }

    public final void f(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.l[i3]) & 1048575);
            Object f2 = C0336gd.f(t, d2);
            if (f2 != null) {
                this.s.e(f2);
                C0336gd.a((Object) t, d2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.a(t, (long) this.l[i2]);
            i2++;
        }
        this.q.b(t);
        if (this.f4659h) {
            this.r.c(t);
        }
    }
}
