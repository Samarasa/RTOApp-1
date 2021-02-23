package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class Dja {

    /* renamed from: a  reason: collision with root package name */
    private final int f6609a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6610b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6611c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6612d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6613e = (this.f6612d * 2);

    /* renamed from: f  reason: collision with root package name */
    private final short[] f6614f;

    /* renamed from: g  reason: collision with root package name */
    private int f6615g;

    /* renamed from: h  reason: collision with root package name */
    private short[] f6616h;
    private int i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private int n;
    private float o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;

    public Dja(int i2, int i3) {
        this.f6609a = i2;
        this.f6610b = i3;
        this.f6611c = i2 / 400;
        this.f6612d = i2 / 65;
        int i4 = this.f6613e;
        this.f6614f = new short[i4];
        this.f6615g = i4;
        this.f6616h = new short[(i4 * i3)];
        this.i = i4;
        this.j = new short[(i4 * i3)];
        this.k = i4;
        this.l = new short[(i4 * i3)];
        this.m = 0;
        this.n = 0;
        this.u = 0;
        this.o = 1.0f;
        this.p = 1.0f;
    }

    private final int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f6610b;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s2 = sArr[i5 + i11];
                short s3 = sArr[i5 + i3 + i11];
                i10 += s2 >= s3 ? s2 - s3 : s3 - s2;
            }
            if (i10 * i7 < i6 * i3) {
                i7 = i3;
                i6 = i10;
            }
            if (i10 * i9 > i8 * i3) {
                i9 = i3;
                i8 = i10;
            }
            i3++;
        }
        this.w = i6 / i7;
        this.x = i8 / i9;
        return i7;
    }

    private final void a(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        if (i3 > i4) {
            this.i = i4 + (i4 / 2) + i2;
            this.j = Arrays.copyOf(this.j, this.i * this.f6610b);
        }
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    private final void a(short[] sArr, int i2, int i3) {
        a(i3);
        int i4 = this.f6610b;
        System.arraycopy(sArr, i2 * i4, this.j, this.r * i4, i4 * i3);
        this.r += i3;
    }

    private final void b(int i2) {
        int i3 = this.q + i2;
        int i4 = this.f6615g;
        if (i3 > i4) {
            this.f6615g = i4 + (i4 / 2) + i2;
            this.f6616h = Arrays.copyOf(this.f6616h, this.f6615g * this.f6610b);
        }
    }

    private final void b(short[] sArr, int i2, int i3) {
        int i4 = this.f6613e / i3;
        int i5 = this.f6610b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f6614f[i8] = (short) (i9 / i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.r
            float r2 = r0.o
            float r3 = r0.p
            float r2 = r2 / r3
            double r3 = (double) r2
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 1
            r8 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x002c
            r8 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            short[] r2 = r0.f6616h
            int r3 = r0.q
            r0.a(r2, r6, r3)
            r0.q = r6
            goto L_0x0170
        L_0x002c:
            int r8 = r0.q
            int r9 = r0.f6613e
            if (r8 < r9) goto L_0x0170
            r9 = 0
        L_0x0033:
            int r10 = r0.t
            if (r10 <= 0) goto L_0x004a
            int r11 = r0.f6613e
            int r10 = java.lang.Math.min(r11, r10)
            short[] r11 = r0.f6616h
            r0.a(r11, r9, r10)
            int r11 = r0.t
            int r11 = r11 - r10
            r0.t = r11
            int r9 = r9 + r10
            goto L_0x0157
        L_0x004a:
            short[] r10 = r0.f6616h
            int r11 = r0.f6609a
            r12 = 4000(0xfa0, float:5.605E-42)
            if (r11 <= r12) goto L_0x0055
            int r11 = r11 / 4000
            goto L_0x0056
        L_0x0055:
            r11 = 1
        L_0x0056:
            int r12 = r0.f6610b
            if (r12 != r7) goto L_0x0065
            if (r11 != r7) goto L_0x0065
            int r11 = r0.f6611c
            int r12 = r0.f6612d
        L_0x0060:
            int r10 = r0.a(r10, r9, r11, r12)
            goto L_0x0098
        L_0x0065:
            r0.b(r10, r9, r11)
            short[] r12 = r0.f6614f
            int r13 = r0.f6611c
            int r13 = r13 / r11
            int r14 = r0.f6612d
            int r14 = r14 / r11
            int r12 = r0.a(r12, r6, r13, r14)
            if (r11 == r7) goto L_0x0097
            int r12 = r12 * r11
            int r11 = r11 << 2
            int r13 = r12 - r11
            int r12 = r12 + r11
            int r11 = r0.f6611c
            if (r13 >= r11) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r11 = r13
        L_0x0083:
            int r13 = r0.f6612d
            if (r12 <= r13) goto L_0x0088
            r12 = r13
        L_0x0088:
            int r13 = r0.f6610b
            if (r13 != r7) goto L_0x008d
            goto L_0x0060
        L_0x008d:
            r0.b(r10, r9, r7)
            short[] r10 = r0.f6614f
            int r10 = r0.a(r10, r6, r11, r12)
            goto L_0x0098
        L_0x0097:
            r10 = r12
        L_0x0098:
            int r11 = r0.w
            int r12 = r0.x
            if (r11 == 0) goto L_0x00b3
            int r13 = r0.u
            if (r13 != 0) goto L_0x00a3
            goto L_0x00b3
        L_0x00a3:
            int r13 = r11 * 3
            if (r12 <= r13) goto L_0x00a8
            goto L_0x00b3
        L_0x00a8:
            int r11 = r11 << 1
            int r12 = r0.v
            int r12 = r12 * 3
            if (r11 > r12) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r11 = 1
            goto L_0x00b4
        L_0x00b3:
            r11 = 0
        L_0x00b4:
            if (r11 == 0) goto L_0x00ba
            int r11 = r0.u
            r15 = r11
            goto L_0x00bb
        L_0x00ba:
            r15 = r10
        L_0x00bb:
            int r11 = r0.w
            r0.v = r11
            r0.u = r10
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 1073741824(0x40000000, float:2.0)
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0104
            short[] r14 = r0.f6616h
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x00d6
            float r10 = (float) r15
            float r11 = r2 - r5
            float r10 = r10 / r11
            int r10 = (int) r10
            r13 = r10
            goto L_0x00e1
        L_0x00d6:
            float r10 = (float) r15
            float r12 = r12 - r2
            float r10 = r10 * r12
            float r11 = r2 - r5
            float r10 = r10 / r11
            int r10 = (int) r10
            r0.t = r10
            r13 = r15
        L_0x00e1:
            r0.a((int) r13)
            int r11 = r0.f6610b
            short[] r12 = r0.j
            int r10 = r0.r
            int r17 = r9 + r15
            r16 = r10
            r10 = r13
            r18 = r13
            r13 = r16
            r16 = r14
            r7 = r15
            r15 = r9
            a(r10, r11, r12, r13, r14, r15, r16, r17)
            int r10 = r0.r
            int r10 = r10 + r18
            r0.r = r10
            int r15 = r7 + r18
            int r9 = r9 + r15
            goto L_0x0157
        L_0x0104:
            r7 = r15
            short[] r15 = r0.f6616h
            r10 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0117
            float r10 = (float) r7
            float r10 = r10 * r2
            float r11 = r5 - r2
            float r10 = r10 / r11
            int r10 = (int) r10
            r18 = r10
            goto L_0x0125
        L_0x0117:
            float r10 = (float) r7
            float r12 = r12 * r2
            float r12 = r12 - r5
            float r10 = r10 * r12
            float r11 = r5 - r2
            float r10 = r10 / r11
            int r10 = (int) r10
            r0.t = r10
            r18 = r7
        L_0x0125:
            int r14 = r7 + r18
            r0.a((int) r14)
            int r10 = r0.f6610b
            int r11 = r9 * r10
            short[] r12 = r0.j
            int r13 = r0.r
            int r13 = r13 * r10
            int r10 = r10 * r7
            java.lang.System.arraycopy(r15, r11, r12, r13, r10)
            int r11 = r0.f6610b
            short[] r12 = r0.j
            int r10 = r0.r
            int r13 = r10 + r7
            int r7 = r7 + r9
            r10 = r18
            r19 = r14
            r14 = r15
            r16 = r15
            r15 = r7
            r17 = r9
            a(r10, r11, r12, r13, r14, r15, r16, r17)
            int r7 = r0.r
            int r7 = r7 + r19
            r0.r = r7
            int r9 = r9 + r18
        L_0x0157:
            int r7 = r0.f6613e
            int r7 = r7 + r9
            if (r7 <= r8) goto L_0x016d
            int r2 = r0.q
            int r2 = r2 - r9
            short[] r3 = r0.f6616h
            int r4 = r0.f6610b
            int r9 = r9 * r4
            int r4 = r4 * r2
            java.lang.System.arraycopy(r3, r9, r3, r6, r4)
            r0.q = r2
            goto L_0x0170
        L_0x016d:
            r7 = 1
            goto L_0x0033
        L_0x0170:
            float r2 = r0.p
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0248
            int r3 = r0.r
            if (r3 == r1) goto L_0x0248
            int r3 = r0.f6609a
            float r4 = (float) r3
            float r4 = r4 / r2
            int r2 = (int) r4
        L_0x017f:
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r2 > r4) goto L_0x0241
            if (r3 <= r4) goto L_0x0187
            goto L_0x0241
        L_0x0187:
            int r4 = r0.r
            int r4 = r4 - r1
            int r5 = r0.s
            int r5 = r5 + r4
            int r7 = r0.k
            if (r5 <= r7) goto L_0x01a5
            int r5 = r7 / 2
            int r5 = r5 + r4
            int r7 = r7 + r5
            r0.k = r7
            short[] r5 = r0.l
            int r7 = r0.k
            int r8 = r0.f6610b
            int r7 = r7 * r8
            short[] r5 = java.util.Arrays.copyOf(r5, r7)
            r0.l = r5
        L_0x01a5:
            short[] r5 = r0.j
            int r7 = r0.f6610b
            int r8 = r1 * r7
            short[] r9 = r0.l
            int r10 = r0.s
            int r10 = r10 * r7
            int r7 = r7 * r4
            java.lang.System.arraycopy(r5, r8, r9, r10, r7)
            r0.r = r1
            int r1 = r0.s
            int r1 = r1 + r4
            r0.s = r1
            r1 = 0
        L_0x01be:
            int r4 = r0.s
            int r5 = r4 + -1
            if (r1 >= r5) goto L_0x022b
        L_0x01c4:
            int r4 = r0.m
            int r5 = r4 + 1
            int r5 = r5 * r2
            int r7 = r0.n
            int r8 = r7 * r3
            if (r5 <= r8) goto L_0x0213
            r5 = 1
            r0.a((int) r5)
            r4 = 0
        L_0x01d5:
            int r5 = r0.f6610b
            if (r4 >= r5) goto L_0x0207
            short[] r7 = r0.j
            int r8 = r0.r
            int r8 = r8 * r5
            int r8 = r8 + r4
            short[] r9 = r0.l
            int r10 = r1 * r5
            int r10 = r10 + r4
            short r11 = r9[r10]
            int r10 = r10 + r5
            short r5 = r9[r10]
            int r9 = r0.n
            int r9 = r9 * r3
            int r10 = r0.m
            int r12 = r10 * r2
            r13 = 1
            int r10 = r10 + r13
            int r10 = r10 * r2
            int r9 = r10 - r9
            int r10 = r10 - r12
            int r11 = r11 * r9
            int r9 = r10 - r9
            int r9 = r9 * r5
            int r11 = r11 + r9
            int r11 = r11 / r10
            short r5 = (short) r11
            r7[r8] = r5
            int r4 = r4 + 1
            goto L_0x01d5
        L_0x0207:
            int r4 = r0.n
            r5 = 1
            int r4 = r4 + r5
            r0.n = r4
            int r4 = r0.r
            int r4 = r4 + r5
            r0.r = r4
            goto L_0x01c4
        L_0x0213:
            r5 = 1
            int r4 = r4 + 1
            r0.m = r4
            int r4 = r0.m
            if (r4 != r3) goto L_0x0228
            r0.m = r6
            if (r7 != r2) goto L_0x0222
            r4 = 1
            goto L_0x0223
        L_0x0222:
            r4 = 0
        L_0x0223:
            com.google.android.gms.internal.ads.Cma.b(r4)
            r0.n = r6
        L_0x0228:
            int r1 = r1 + 1
            goto L_0x01be
        L_0x022b:
            int r1 = r4 + -1
            if (r1 == 0) goto L_0x0248
            short[] r2 = r0.l
            int r3 = r0.f6610b
            int r5 = r1 * r3
            int r4 = r4 - r1
            int r4 = r4 * r3
            java.lang.System.arraycopy(r2, r5, r2, r6, r4)
            int r2 = r0.s
            int r2 = r2 - r1
            r0.s = r2
            goto L_0x0248
        L_0x0241:
            r5 = 1
            int r2 = r2 / 2
            int r3 = r3 / 2
            goto L_0x017f
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Dja.c():void");
    }

    public final void a() {
        int i2;
        int i3 = this.q;
        float f2 = this.o;
        float f3 = this.p;
        int i4 = this.r + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.s)) / f3) + 0.5f));
        b((this.f6613e * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f6613e;
            int i6 = this.f6610b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.f6616h[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.q += i2 * 2;
        c();
        if (this.r > i4) {
            this.r = i4;
        }
        this.q = 0;
        this.t = 0;
        this.s = 0;
    }

    public final void a(float f2) {
        this.o = f2;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f6610b;
        int i3 = remaining / i2;
        b(i3);
        shortBuffer.get(this.f6616h, this.q * this.f6610b, ((i2 * i3) << 1) / 2);
        this.q += i3;
        c();
    }

    public final int b() {
        return this.r;
    }

    public final void b(float f2) {
        this.p = f2;
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f6610b, this.r);
        shortBuffer.put(this.j, 0, this.f6610b * min);
        this.r -= min;
        short[] sArr = this.j;
        int i2 = this.f6610b;
        System.arraycopy(sArr, min * i2, sArr, 0, this.r * i2);
    }
}
