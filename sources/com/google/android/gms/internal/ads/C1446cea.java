package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.cea  reason: case insensitive filesystem */
final class C1446cea extends C1304aea {

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f10059f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10060g;

    /* renamed from: h  reason: collision with root package name */
    private int f10061h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    private C1446cea(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.m = Integer.MAX_VALUE;
        this.f10059f = bArr;
        this.f10061h = i3 + i2;
        this.j = i2;
        this.k = this.j;
        this.f10060g = z;
    }

    private final byte A() {
        int i2 = this.j;
        if (i2 != this.f10061h) {
            byte[] bArr = this.f10059f;
            this.j = i2 + 1;
            return bArr[i2];
        }
        throw Iea.a();
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f10061h;
            int i4 = this.j;
            if (i2 <= i3 - i4) {
                this.j = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw Iea.b();
        }
        throw Iea.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
            r5 = this;
            int r0 = r5.j
            int r1 = r5.f10061h
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f10059f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.j = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.j = r1
            return r0
        L_0x006b:
            long r0 = r5.u()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1446cea.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
            r11 = this;
            int r0 = r11.j
            int r1 = r11.f10061h
            if (r1 == r0) goto L_0x00b5
            byte[] r2 = r11.f10059f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.j = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b5
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0026
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            r3 = r2
            goto L_0x00b2
        L_0x0026:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0037
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r3 = r9
            goto L_0x00b2
        L_0x0037:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0045
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0045:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005c
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0058:
            long r1 = r1 ^ r3
            r3 = r1
        L_0x005a:
            r1 = r0
            goto L_0x00b2
        L_0x005c:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006e:
            long r3 = r3 ^ r5
            goto L_0x00b2
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0058
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006e
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x005a
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
        L_0x00b2:
            r11.j = r1
            return r3
        L_0x00b5:
            long r0 = r11.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1446cea.w():long");
    }

    private final int x() {
        int i2 = this.j;
        if (this.f10061h - i2 >= 4) {
            byte[] bArr = this.f10059f;
            this.j = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw Iea.a();
    }

    private final long y() {
        int i2 = this.j;
        if (this.f10061h - i2 >= 8) {
            byte[] bArr = this.f10059f;
            this.j = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw Iea.a();
    }

    private final void z() {
        this.f10061h += this.i;
        int i2 = this.f10061h;
        int i3 = i2 - this.k;
        int i4 = this.m;
        if (i3 > i4) {
            this.i = i3 - i4;
            this.f10061h = i2 - this.i;
            return;
        }
        this.i = 0;
    }

    public final double a() {
        return Double.longBitsToDouble(y());
    }

    public final void a(int i2) {
        if (this.l != i2) {
            throw Iea.e();
        }
    }

    public final float b() {
        return Float.intBitsToFloat(x());
    }

    public final boolean b(int i2) {
        int d2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f10061h - this.j >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f10059f;
                    int i5 = this.j;
                    this.j = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw Iea.c();
            }
            while (i4 < 10) {
                if (A() < 0) {
                    i4++;
                }
            }
            throw Iea.c();
            return true;
        } else if (i3 == 1) {
            f(8);
            return true;
        } else if (i3 == 2) {
            f(v());
            return true;
        } else if (i3 == 3) {
            do {
                d2 = d();
                if (d2 == 0 || !b(d2)) {
                    a(((i2 >>> 3) << 3) | 4);
                }
                d2 = d();
                break;
            } while (!b(d2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                f(4);
                return true;
            }
            throw Iea.f();
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int t = i2 + t();
            int i3 = this.m;
            if (t <= i3) {
                this.m = t;
                z();
                return i3;
            }
            throw Iea.a();
        }
        throw Iea.b();
    }

    public final String c() {
        int v = v();
        if (v > 0) {
            int i2 = this.f10061h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                String str = new String(this.f10059f, i3, v, Aea.f6145a);
                this.j += v;
                return str;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v < 0) {
            throw Iea.b();
        }
        throw Iea.a();
    }

    public final int d() {
        if (s()) {
            this.l = 0;
            return 0;
        }
        this.l = v();
        int i2 = this.l;
        if ((i2 >>> 3) != 0) {
            return i2;
        }
        throw Iea.d();
    }

    public final void d(int i2) {
        this.m = i2;
        z();
    }

    public final long e() {
        return w();
    }

    public final long f() {
        return w();
    }

    public final int g() {
        return v();
    }

    public final long h() {
        return y();
    }

    public final int i() {
        return x();
    }

    public final boolean j() {
        return w() != 0;
    }

    public final String k() {
        int v = v();
        if (v > 0) {
            int i2 = this.f10061h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                String b2 = C1521dga.b(this.f10059f, i3, v);
                this.j += v;
                return b2;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v <= 0) {
            throw Iea.b();
        }
        throw Iea.a();
    }

    public final Lda l() {
        byte[] bArr;
        int v = v();
        if (v > 0) {
            int i2 = this.f10061h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                Lda a2 = Lda.a(this.f10059f, i3, v);
                this.j += v;
                return a2;
            }
        }
        if (v == 0) {
            return Lda.f7691a;
        }
        if (v > 0) {
            int i4 = this.f10061h;
            int i5 = this.j;
            if (v <= i4 - i5) {
                this.j = v + i5;
                bArr = Arrays.copyOfRange(this.f10059f, i5, this.j);
                return Lda.b(bArr);
            }
        }
        if (v > 0) {
            throw Iea.a();
        } else if (v == 0) {
            bArr = Aea.f6147c;
            return Lda.b(bArr);
        } else {
            throw Iea.b();
        }
    }

    public final int m() {
        return v();
    }

    public final int n() {
        return v();
    }

    public final int o() {
        return x();
    }

    public final long p() {
        return y();
    }

    public final int q() {
        return C1304aea.e(v());
    }

    public final long r() {
        return C1304aea.a(w());
    }

    public final boolean s() {
        return this.j == this.f10061h;
    }

    public final int t() {
        return this.j - this.k;
    }

    /* access modifiers changed from: package-private */
    public final long u() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw Iea.c();
    }
}
