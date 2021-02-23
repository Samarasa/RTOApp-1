package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.fea  reason: case insensitive filesystem */
public abstract class C1658fea extends Mda {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f10420a = Logger.getLogger(C1658fea.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f10421b = C1308aga.a();

    /* renamed from: c  reason: collision with root package name */
    C1800hea f10422c;

    /* renamed from: com.google.android.gms.internal.ads.fea$a */
    static class a extends C1658fea {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f10423d;

        /* renamed from: e  reason: collision with root package name */
        private final int f10424e;

        /* renamed from: f  reason: collision with root package name */
        private final int f10425f;

        /* renamed from: g  reason: collision with root package name */
        private int f10426g;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                this.f10423d = bArr;
                this.f10424e = 0;
                this.f10426g = 0;
                this.f10425f = i2;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
        }

        private final void b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f10423d, this.f10426g, i2);
                this.f10426g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10426g), Integer.valueOf(this.f10425f), Integer.valueOf(i2)}), e2);
            }
        }

        public final int a() {
            return this.f10425f - this.f10426g;
        }

        public final void a(byte b2) {
            try {
                byte[] bArr = this.f10423d;
                int i = this.f10426g;
                this.f10426g = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10426g), Integer.valueOf(this.f10425f), 1}), e2);
            }
        }

        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        public final void a(int i, Lda lda) {
            a(i, 2);
            b(lda);
        }

        public final void a(int i, C1872ifa ifa) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(ifa);
            a(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i, C1872ifa ifa, Cfa cfa) {
            a(i, 2);
            Cda cda = (Cda) ifa;
            int h2 = cda.h();
            if (h2 == -1) {
                h2 = cfa.c(cda);
                cda.a(h2);
            }
            b(h2);
            cfa.a(ifa, (C2583sga) this.f10422c);
        }

        public final void a(int i, String str) {
            a(i, 2);
            b(str);
        }

        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(long j) {
            if (!C1658fea.f10421b || a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f10423d;
                    int i = this.f10426g;
                    this.f10426g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10423d;
                    int i2 = this.f10426g;
                    this.f10426g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10426g), Integer.valueOf(this.f10425f), 1}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f10423d;
                    int i3 = this.f10426g;
                    this.f10426g = i3 + 1;
                    C1308aga.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f10423d;
                int i4 = this.f10426g;
                this.f10426g = i4 + 1;
                C1308aga.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void a(C1872ifa ifa) {
            b(ifa.c());
            ifa.a(this);
        }

        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        public final void b(int i) {
            if (!C1658fea.f10421b || Ida.a() || a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f10423d;
                    int i2 = this.f10426g;
                    this.f10426g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10423d;
                    int i3 = this.f10426g;
                    this.f10426g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10426g), Integer.valueOf(this.f10425f), 1}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f10423d;
                int i4 = this.f10426g;
                this.f10426g = i4 + 1;
                C1308aga.a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f10423d;
                int i5 = this.f10426g;
                this.f10426g = i5 + 1;
                C1308aga.a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f10423d;
                    int i7 = this.f10426g;
                    this.f10426g = i7 + 1;
                    C1308aga.a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f10423d;
                int i8 = this.f10426g;
                this.f10426g = i8 + 1;
                C1308aga.a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f10423d;
                    int i10 = this.f10426g;
                    this.f10426g = i10 + 1;
                    C1308aga.a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f10423d;
                int i11 = this.f10426g;
                this.f10426g = i11 + 1;
                C1308aga.a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f10423d;
                    int i13 = this.f10426g;
                    this.f10426g = i13 + 1;
                    C1308aga.a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f10423d;
                int i14 = this.f10426g;
                this.f10426g = i14 + 1;
                C1308aga.a(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f10423d;
                int i15 = this.f10426g;
                this.f10426g = i15 + 1;
                C1308aga.a(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        public final void b(int i, Lda lda) {
            a(1, 3);
            c(2, i);
            a(3, lda);
            a(1, 4);
        }

        public final void b(Lda lda) {
            b(lda.size());
            lda.a((Mda) this);
        }

        public final void b(String str) {
            int i = this.f10426g;
            try {
                int g2 = C1658fea.g(str.length() * 3);
                int g3 = C1658fea.g(str.length());
                if (g3 == g2) {
                    this.f10426g = i + g3;
                    int a2 = C1521dga.a((CharSequence) str, this.f10423d, this.f10426g, a());
                    this.f10426g = i;
                    b((a2 - i) - g3);
                    this.f10426g = a2;
                    return;
                }
                b(C1521dga.a((CharSequence) str));
                this.f10426g = C1521dga.a((CharSequence) str, this.f10423d, this.f10426g, a());
            } catch (C1733gga e2) {
                this.f10426g = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        public final void c(long j) {
            try {
                byte[] bArr = this.f10423d;
                int i = this.f10426g;
                this.f10426g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f10423d;
                int i2 = this.f10426g;
                this.f10426g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f10423d;
                int i3 = this.f10426g;
                this.f10426g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f10423d;
                int i4 = this.f10426g;
                this.f10426g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f10423d;
                int i5 = this.f10426g;
                this.f10426g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f10423d;
                int i6 = this.f10426g;
                this.f10426g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f10423d;
                int i7 = this.f10426g;
                this.f10426g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f10423d;
                int i8 = this.f10426g;
                this.f10426g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10426g), Integer.valueOf(this.f10425f), 1}), e2);
            }
        }

        public final void d(int i) {
            try {
                byte[] bArr = this.f10423d;
                int i2 = this.f10426g;
                this.f10426g = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f10423d;
                int i3 = this.f10426g;
                this.f10426g = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f10423d;
                int i4 = this.f10426g;
                this.f10426g = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f10423d;
                int i5 = this.f10426g;
                this.f10426g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10426g), Integer.valueOf(this.f10425f), 1}), e2);
            }
        }

        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.fea$b */
    public static class b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1658fea.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private C1658fea() {
    }

    public static int a(int i, Nea nea) {
        int g2 = g(i << 3);
        int b2 = nea.b();
        return g2 + g(b2) + b2;
    }

    public static int a(Lda lda) {
        int size = lda.size();
        return g(size) + size;
    }

    public static int a(Nea nea) {
        int b2 = nea.b();
        return g(b2) + b2;
    }

    static int a(C1872ifa ifa, Cfa cfa) {
        Cda cda = (Cda) ifa;
        int h2 = cda.h();
        if (h2 == -1) {
            h2 = cfa.c(cda);
            cda.a(h2);
        }
        return g(h2) + h2;
    }

    public static int a(String str) {
        int i;
        try {
            i = C1521dga.a((CharSequence) str);
        } catch (C1733gga unused) {
            i = str.getBytes(Aea.f6145a).length;
        }
        return g(i) + i;
    }

    public static C1658fea a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d2) {
        return 8;
    }

    public static int b(float f2) {
        return 4;
    }

    public static int b(int i, double d2) {
        return g(i << 3) + 8;
    }

    public static int b(int i, float f2) {
        return g(i << 3) + 4;
    }

    static int b(int i, C1872ifa ifa, Cfa cfa) {
        return g(i << 3) + a(ifa, cfa);
    }

    public static int b(int i, String str) {
        return g(i << 3) + a(str);
    }

    public static int b(int i, boolean z) {
        return g(i << 3) + 1;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(int i, Lda lda) {
        int g2 = g(i << 3);
        int size = lda.size();
        return g2 + g(size) + size;
    }

    @Deprecated
    static int c(int i, C1872ifa ifa, Cfa cfa) {
        int g2 = g(i << 3) << 1;
        Cda cda = (Cda) ifa;
        int h2 = cda.h();
        if (h2 == -1) {
            h2 = cfa.c(cda);
            cda.a(h2);
        }
        return g2 + h2;
    }

    public static int d(int i, long j) {
        return g(i << 3) + e(j);
    }

    public static int d(int i, Lda lda) {
        return (g(8) << 1) + g(2, i) + c(3, lda);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return g(i << 3);
    }

    public static int e(int i, long j) {
        return g(i << 3) + e(j);
    }

    public static int e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int f(int i, int i2) {
        return g(i << 3) + f(i2);
    }

    public static int f(int i, long j) {
        return g(i << 3) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int g(int i, int i2) {
        return g(i << 3) + g(i2);
    }

    public static int g(int i, long j) {
        return g(i << 3) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return g(l(i));
    }

    public static int h(int i, int i2) {
        return g(i << 3) + g(l(i2));
    }

    public static int h(int i, long j) {
        return g(i << 3) + 8;
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return 4;
    }

    public static int i(int i, int i2) {
        return g(i << 3) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return 4;
    }

    public static int j(int i, int i2) {
        return g(i << 3) + 4;
    }

    public static int k(int i) {
        return f(i);
    }

    public static int k(int i, int i2) {
        return g(i << 3) + f(i2);
    }

    private static int l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d2) {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(float f2) {
        d(Float.floatToRawIntBits(f2));
    }

    public abstract void a(int i);

    public final void a(int i, double d2) {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void a(int i, float f2) {
        e(i, Float.floatToRawIntBits(f2));
    }

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, Lda lda);

    public abstract void a(int i, C1872ifa ifa);

    /* access modifiers changed from: package-private */
    public abstract void a(int i, C1872ifa ifa, Cfa cfa);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    /* access modifiers changed from: package-private */
    public final void a(String str, C1733gga gga) {
        f10420a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", gga);
        byte[] bytes = str.getBytes(Aea.f6145a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        } catch (b e3) {
            throw e3;
        }
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, i(j));
    }

    public abstract void b(int i, Lda lda);

    public final void b(long j) {
        a(i(j));
    }

    public final void c(int i) {
        b(l(i));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public final void d(int i, int i2) {
        c(i, l(i2));
    }

    public abstract void e(int i, int i2);
}
