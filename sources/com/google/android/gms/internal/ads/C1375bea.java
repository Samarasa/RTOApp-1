package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bea  reason: case insensitive filesystem */
final class C1375bea extends C1304aea {

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f9929f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f9930g;

    /* renamed from: h  reason: collision with root package name */
    private int f9931h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private C1587eea n;

    private C1375bea(InputStream inputStream, int i2) {
        super();
        this.m = Integer.MAX_VALUE;
        this.n = null;
        Aea.a(inputStream, "input");
        this.f9929f = inputStream;
        this.f9930g = new byte[4096];
        this.f9931h = 0;
        this.j = 0;
        this.l = 0;
    }

    private final byte A() {
        if (this.j == this.f9931h) {
            f(1);
        }
        byte[] bArr = this.f9930g;
        int i2 = this.j;
        this.j = i2 + 1;
        return bArr[i2];
    }

    private final byte[] a(int i2, boolean z) {
        byte[] h2 = h(i2);
        if (h2 != null) {
            return h2;
        }
        int i3 = this.j;
        int i4 = this.f9931h;
        int i5 = i4 - i3;
        this.l += i4;
        this.j = 0;
        this.f9931h = 0;
        List<byte[]> i6 = i(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f9930g, i3, bArr, 0, i5);
        for (byte[] next : i6) {
            System.arraycopy(next, 0, bArr, i5, next.length);
            i5 += next.length;
        }
        return bArr;
    }

    private final void f(int i2) {
        if (g(i2)) {
            return;
        }
        if (i2 > (this.f9808c - this.l) - this.j) {
            throw Iea.g();
        }
        throw Iea.a();
    }

    private final boolean g(int i2) {
        do {
            int i3 = this.j;
            int i4 = i3 + i2;
            int i5 = this.f9931h;
            if (i4 > i5) {
                int i6 = this.f9808c;
                int i7 = this.l;
                if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.m) {
                    return false;
                }
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.f9930g;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.l += i3;
                    this.f9931h -= i3;
                    this.j = 0;
                }
                InputStream inputStream = this.f9929f;
                byte[] bArr2 = this.f9930g;
                int i8 = this.f9931h;
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.f9808c - this.l) - i8));
                if (read == 0 || read < -1 || read > this.f9930g.length) {
                    String valueOf = String.valueOf(this.f9929f.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f9931h += read;
                    z();
                }
            } else {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("refillBuffer() called when ");
                sb2.append(i2);
                sb2.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb2.toString());
            }
        } while (this.f9931h < i2);
        return true;
    }

    private final byte[] h(int i2) {
        if (i2 == 0) {
            return Aea.f6147c;
        }
        if (i2 >= 0) {
            int i3 = this.l;
            int i4 = this.j;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f9808c <= 0) {
                int i6 = this.m;
                if (i5 <= i6) {
                    int i7 = this.f9931h - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096 && i8 > this.f9929f.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f9930g, this.j, bArr, 0, i7);
                    this.l += this.f9931h;
                    this.j = 0;
                    this.f9931h = 0;
                    while (i7 < bArr.length) {
                        int read = this.f9929f.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.l += read;
                            i7 += read;
                        } else {
                            throw Iea.a();
                        }
                    }
                    return bArr;
                }
                j((i6 - i3) - i4);
                throw Iea.a();
            }
            throw Iea.g();
        }
        throw Iea.b();
    }

    private final List<byte[]> i(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            byte[] bArr = new byte[Math.min(i2, 4096)];
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = this.f9929f.read(bArr, i3, bArr.length - i3);
                if (read != -1) {
                    this.l += read;
                    i3 += read;
                } else {
                    throw Iea.a();
                }
            }
            i2 -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void j(int i2) {
        int i3 = this.f9931h;
        int i4 = this.j;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.j = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.l;
            int i6 = this.j;
            int i7 = i5 + i6 + i2;
            int i8 = this.m;
            if (i7 <= i8) {
                this.l = i5 + i6;
                int i9 = this.f9931h - i6;
                this.f9931h = 0;
                this.j = 0;
                while (i9 < i2) {
                    try {
                        long j2 = (long) (i2 - i9);
                        long skip = this.f9929f.skip(j2);
                        if (skip >= 0 && skip <= j2) {
                            if (skip == 0) {
                                break;
                            }
                            i9 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.f9929f.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.l += i9;
                        z();
                        throw th;
                    }
                }
                this.l += i9;
                z();
                if (i9 < i2) {
                    int i10 = this.f9931h;
                    int i11 = i10 - this.j;
                    this.j = i10;
                    while (true) {
                        f(1);
                        int i12 = i2 - i11;
                        int i13 = this.f9931h;
                        if (i12 > i13) {
                            i11 += i13;
                            this.j = i13;
                        } else {
                            this.j = i12;
                            return;
                        }
                    }
                }
            } else {
                j((i8 - i5) - i6);
                throw Iea.a();
            }
        } else {
            throw Iea.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
            r5 = this;
            int r0 = r5.j
            int r1 = r5.f9931h
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f9930g
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1375bea.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
            r11 = this;
            int r0 = r11.j
            int r1 = r11.f9931h
            if (r1 == r0) goto L_0x00b5
            byte[] r2 = r11.f9930g
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1375bea.w():long");
    }

    private final int x() {
        int i2 = this.j;
        if (this.f9931h - i2 < 4) {
            f(4);
            i2 = this.j;
        }
        byte[] bArr = this.f9930g;
        this.j = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long y() {
        int i2 = this.j;
        if (this.f9931h - i2 < 8) {
            f(8);
            i2 = this.j;
        }
        byte[] bArr = this.f9930g;
        this.j = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final void z() {
        this.f9931h += this.i;
        int i2 = this.l;
        int i3 = this.f9931h;
        int i4 = i2 + i3;
        int i5 = this.m;
        if (i4 > i5) {
            this.i = i4 - i5;
            this.f9931h = i3 - this.i;
            return;
        }
        this.i = 0;
    }

    public final double a() {
        return Double.longBitsToDouble(y());
    }

    public final void a(int i2) {
        if (this.k != i2) {
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
            if (this.f9931h - this.j >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f9930g;
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
            j(8);
            return true;
        } else if (i3 == 2) {
            j(v());
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
                j(4);
                return true;
            }
            throw Iea.f();
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.l + this.j;
            int i4 = this.m;
            if (i3 <= i4) {
                this.m = i3;
                z();
                return i4;
            }
            throw Iea.a();
        }
        throw Iea.b();
    }

    public final String c() {
        int v = v();
        if (v > 0) {
            int i2 = this.f9931h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                String str = new String(this.f9930g, i3, v, Aea.f6145a);
                this.j += v;
                return str;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v > this.f9931h) {
            return new String(a(v, false), Aea.f6145a);
        }
        f(v);
        String str2 = new String(this.f9930g, this.j, v, Aea.f6145a);
        this.j += v;
        return str2;
    }

    public final int d() {
        if (s()) {
            this.k = 0;
            return 0;
        }
        this.k = v();
        int i2 = this.k;
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
        byte[] bArr;
        int v = v();
        int i2 = this.j;
        int i3 = 0;
        if (v <= this.f9931h - i2 && v > 0) {
            bArr = this.f9930g;
            this.j = i2 + v;
            i3 = i2;
        } else if (v == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (v <= this.f9931h) {
                f(v);
                bArr = this.f9930g;
                this.j = v;
            } else {
                bArr = a(v, false);
            }
        }
        return C1521dga.b(bArr, i3, v);
    }

    public final Lda l() {
        int v = v();
        int i2 = this.f9931h;
        int i3 = this.j;
        if (v <= i2 - i3 && v > 0) {
            Lda a2 = Lda.a(this.f9930g, i3, v);
            this.j += v;
            return a2;
        } else if (v == 0) {
            return Lda.f7691a;
        } else {
            byte[] h2 = h(v);
            if (h2 != null) {
                return Lda.a(h2);
            }
            int i4 = this.j;
            int i5 = this.f9931h;
            int i6 = i5 - i4;
            this.l += i5;
            this.j = 0;
            this.f9931h = 0;
            List<byte[]> i7 = i(v - i6);
            byte[] bArr = new byte[v];
            System.arraycopy(this.f9930g, i4, bArr, 0, i6);
            for (byte[] next : i7) {
                System.arraycopy(next, 0, bArr, i6, next.length);
                i6 += next.length;
            }
            return Lda.b(bArr);
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
        return this.j == this.f9931h && !g(1);
    }

    public final int t() {
        return this.l + this.j;
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
