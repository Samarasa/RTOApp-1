package h;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.EOFException;
import java.nio.charset.Charset;

public final class e implements g, f, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f15326a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    s f15327b;

    /* renamed from: c  reason: collision with root package name */
    long f15328c;

    public int a(byte[] bArr, int i, int i2) {
        z.a((long) bArr.length, (long) i, (long) i2);
        s sVar = this.f15327b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i2, sVar.f15358c - sVar.f15357b);
        System.arraycopy(sVar.f15356a, sVar.f15357b, bArr, i, min);
        sVar.f15357b += min;
        this.f15328c -= (long) min;
        if (sVar.f15357b == sVar.f15358c) {
            this.f15327b = sVar.b();
            t.a(sVar);
        }
        return min;
    }

    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) {
        s sVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f15328c), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f15328c;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (sVar = this.f15327b) == null) {
            return -1;
        }
        long j5 = this.f15328c;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (sVar.f15358c - sVar.f15357b)) + j5;
                if (j3 >= j) {
                    break;
                }
                sVar = sVar.f15361f;
            }
        } else {
            while (j5 > j) {
                sVar = sVar.f15362g;
                j5 -= (long) (sVar.f15358c - sVar.f15357b);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = sVar.f15356a;
            int min = (int) Math.min((long) sVar.f15358c, (((long) sVar.f15357b) + j4) - j5);
            for (int i = (int) ((((long) sVar.f15357b) + j6) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - sVar.f15357b)) + j5;
                }
            }
            byte b3 = b2;
            j6 = ((long) (sVar.f15358c - sVar.f15357b)) + j5;
            sVar = sVar.f15361f;
            j5 = j6;
        }
        return -1;
    }

    public long a(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f15328c;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            eVar.b(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public long a(w wVar) {
        if (wVar != null) {
            long j = 0;
            while (true) {
                long a2 = wVar.a(this, 8192);
                if (a2 == -1) {
                    return j;
                }
                j += a2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public e a(e eVar, long j, long j2) {
        if (eVar != null) {
            z.a(this.f15328c, j, j2);
            if (j2 == 0) {
                return this;
            }
            eVar.f15328c += j2;
            s sVar = this.f15327b;
            while (true) {
                int i = sVar.f15358c;
                int i2 = sVar.f15357b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                sVar = sVar.f15361f;
            }
            while (j2 > 0) {
                s sVar2 = new s(sVar);
                sVar2.f15357b = (int) (((long) sVar2.f15357b) + j);
                sVar2.f15358c = Math.min(sVar2.f15357b + ((int) j2), sVar2.f15358c);
                s sVar3 = eVar.f15327b;
                if (sVar3 == null) {
                    sVar2.f15362g = sVar2;
                    sVar2.f15361f = sVar2;
                    eVar.f15327b = sVar2;
                } else {
                    sVar3.f15362g.a(sVar2);
                }
                j2 -= (long) (sVar2.f15358c - sVar2.f15357b);
                sVar = sVar.f15361f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public e a(h hVar) {
        if (hVar != null) {
            hVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public e a(String str) {
        a(str, 0, str.length());
        return this;
    }

    public e a(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    s b2 = b(1);
                    byte[] bArr = b2.f15356a;
                    int i4 = b2.f15358c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = b2.f15358c;
                    int i7 = (i4 + i5) - i6;
                    b2.f15358c = i6 + i7;
                    this.f15328c += (long) i7;
                    i = i5;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            writeByte((i9 >> 18) | 240);
                            writeByte(((i9 >> 12) & 63) | 128);
                            writeByte(((i9 >> 6) & 63) | 128);
                            writeByte((i9 & 63) | 128);
                            i += 2;
                        }
                    }
                    writeByte(i3);
                    writeByte((int) (charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public h a(int i) {
        return i == 0 ? h.f15330b : new u(this, i);
    }

    public h a(long j) {
        return new h(b(j));
    }

    public String a(long j, Charset charset) {
        z.a(this.f15328c, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            s sVar = this.f15327b;
            int i = sVar.f15357b;
            if (((long) i) + j > ((long) sVar.f15358c)) {
                return new String(b(j), charset);
            }
            String str = new String(sVar.f15356a, i, (int) j, charset);
            sVar.f15357b = (int) (((long) sVar.f15357b) + j);
            this.f15328c -= j;
            if (sVar.f15357b == sVar.f15358c) {
                this.f15327b = sVar.b();
                t.a(sVar);
            }
            return str;
        }
    }

    public String a(Charset charset) {
        try {
            return a(this.f15328c, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public void a() {
        try {
            skip(this.f15328c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean a(long j, h hVar) {
        return a(j, hVar, 0, hVar.n());
    }

    public boolean a(long j, h hVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f15328c - j < ((long) i2) || hVar.n() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (e(((long) i3) + j) != hVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public e b() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public s b(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        s sVar = this.f15327b;
        if (sVar == null) {
            this.f15327b = t.a();
            s sVar2 = this.f15327b;
            sVar2.f15362g = sVar2;
            sVar2.f15361f = sVar2;
            return sVar2;
        }
        s sVar3 = sVar.f15362g;
        if (sVar3.f15358c + i <= 8192 && sVar3.f15360e) {
            return sVar3;
        }
        s a2 = t.a();
        sVar3.a(a2);
        return a2;
    }

    public void b(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            z.a(eVar.f15328c, 0, j);
            while (j > 0) {
                s sVar = eVar.f15327b;
                if (j < ((long) (sVar.f15358c - sVar.f15357b))) {
                    s sVar2 = this.f15327b;
                    s sVar3 = sVar2 != null ? sVar2.f15362g : null;
                    if (sVar3 != null && sVar3.f15360e) {
                        if ((((long) sVar3.f15358c) + j) - ((long) (sVar3.f15359d ? 0 : sVar3.f15357b)) <= 8192) {
                            eVar.f15327b.a(sVar3, (int) j);
                            eVar.f15328c -= j;
                            this.f15328c += j;
                            return;
                        }
                    }
                    eVar.f15327b = eVar.f15327b.a((int) j);
                }
                s sVar4 = eVar.f15327b;
                long j2 = (long) (sVar4.f15358c - sVar4.f15357b);
                eVar.f15327b = sVar4.b();
                s sVar5 = this.f15327b;
                if (sVar5 == null) {
                    this.f15327b = sVar4;
                    s sVar6 = this.f15327b;
                    sVar6.f15362g = sVar6;
                    sVar6.f15361f = sVar6;
                } else {
                    sVar5.f15362g.a(sVar4);
                    sVar4.a();
                }
                eVar.f15328c -= j2;
                this.f15328c += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public byte[] b(long j) {
        z.a(this.f15328c, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public e c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        writeByte(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    writeByte((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                writeByte(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            writeByte(i3);
            i = (i & 63) | 128;
        }
        writeByte(i);
        return this;
    }

    public void c(long j) {
        if (this.f15328c < j) {
            throw new EOFException();
        }
    }

    public e clone() {
        e eVar = new e();
        if (this.f15328c == 0) {
            return eVar;
        }
        eVar.f15327b = new s(this.f15327b);
        s sVar = eVar.f15327b;
        sVar.f15362g = sVar;
        sVar.f15361f = sVar;
        s sVar2 = this.f15327b;
        while (true) {
            sVar2 = sVar2.f15361f;
            if (sVar2 != this.f15327b) {
                eVar.f15327b.f15362g.a(new s(sVar2));
            } else {
                eVar.f15328c = this.f15328c;
                return eVar;
            }
        }
    }

    public void close() {
    }

    public e d(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        s b2 = b(numberOfTrailingZeros);
        byte[] bArr = b2.f15356a;
        int i = b2.f15358c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f15326a[(int) (15 & j)];
            j >>>= 4;
        }
        b2.f15358c += numberOfTrailingZeros;
        this.f15328c += (long) numberOfTrailingZeros;
        return this;
    }

    public byte e(long j) {
        z.a(this.f15328c, j, 1);
        s sVar = this.f15327b;
        while (true) {
            int i = sVar.f15358c;
            int i2 = sVar.f15357b;
            long j2 = (long) (i - i2);
            if (j < j2) {
                return sVar.f15356a[i2 + ((int) j)];
            }
            j -= j2;
            sVar = sVar.f15361f;
        }
    }

    public boolean e() {
        return this.f15328c == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j = this.f15328c;
        if (j != eVar.f15328c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        s sVar = this.f15327b;
        s sVar2 = eVar.f15327b;
        int i = sVar.f15357b;
        int i2 = sVar2.f15357b;
        while (j2 < this.f15328c) {
            long min = (long) Math.min(sVar.f15358c - i, sVar2.f15358c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (sVar.f15356a[i4] != sVar2.f15356a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == sVar.f15358c) {
                sVar = sVar.f15361f;
                i = sVar.f15357b;
            } else {
                i = i4;
            }
            if (i3 == sVar2.f15358c) {
                sVar2 = sVar2.f15361f;
                i2 = sVar2.f15357b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public String f() {
        return h(Long.MAX_VALUE);
    }

    public String f(long j) {
        return a(j, z.f15371a);
    }

    public void flush() {
    }

    public int g() {
        return z.a(readInt());
    }

    /* access modifiers changed from: package-private */
    public String g(long j) {
        String f2;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (e(j3) == 13) {
                f2 = f(j3);
                j2 = 2;
                skip(j2);
                return f2;
            }
        }
        f2 = f(j);
        skip(j2);
        return f2;
    }

    public String h(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return g(a2);
            }
            if (j2 < o() && e(j2 - 1) == 13 && e(j2) == 10) {
                return g(j2);
            }
            e eVar = new e();
            a(eVar, 0, Math.min(32, o()));
            throw new EOFException("\\n not found: limit=" + Math.min(o(), j) + " content=" + eVar.m().c() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public short h() {
        return z.a(readShort());
    }

    public int hashCode() {
        s sVar = this.f15327b;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = sVar.f15358c;
            for (int i3 = sVar.f15357b; i3 < i2; i3++) {
                i = (i * 31) + sVar.f15356a[i3];
            }
            sVar = sVar.f15361f;
        } while (sVar != this.f15327b);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f15327b = r6.b();
        h.t.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.f15357b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i() {
        /*
            r15 = this;
            long r0 = r15.f15328c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            h.s r6 = r15.f15327b
            byte[] r7 = r6.f15356a
            int r8 = r6.f15357b
            int r9 = r6.f15358c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0013
        L_0x004a:
            h.e r0 = new h.e
            r0.<init>()
            r0.d((long) r4)
            r0.writeByte((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.n()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r1 == 0) goto L_0x0074
            r0 = 1
            goto L_0x008f
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            h.s r7 = r6.b()
            r15.f15327b = r7
            h.t.a(r6)
            goto L_0x009d
        L_0x009b:
            r6.f15357b = r8
        L_0x009d:
            if (r0 != 0) goto L_0x00a3
            h.s r6 = r15.f15327b
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r2 = r15.f15328c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f15328c = r2
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b3
        L_0x00b2:
            throw r0
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e.i():long");
    }

    public e j() {
        return this;
    }

    public long k() {
        long j = this.f15328c;
        if (j == 0) {
            return 0;
        }
        s sVar = this.f15327b.f15362g;
        int i = sVar.f15358c;
        return (i >= 8192 || !sVar.f15360e) ? j : j - ((long) (i - sVar.f15357b));
    }

    public byte[] l() {
        try {
            return b(this.f15328c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public h m() {
        return new h(l());
    }

    public String n() {
        try {
            return a(this.f15328c, z.f15371a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public long o() {
        return this.f15328c;
    }

    public h p() {
        long j = this.f15328c;
        if (j <= 2147483647L) {
            return a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f15328c);
    }

    public byte readByte() {
        long j = this.f15328c;
        if (j != 0) {
            s sVar = this.f15327b;
            int i = sVar.f15357b;
            int i2 = sVar.f15358c;
            int i3 = i + 1;
            byte b2 = sVar.f15356a[i];
            this.f15328c = j - 1;
            if (i3 == i2) {
                this.f15327b = sVar.b();
                t.a(sVar);
            } else {
                sVar.f15357b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 != -1) {
                i += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f15328c;
        if (j >= 4) {
            s sVar = this.f15327b;
            int i = sVar.f15357b;
            int i2 = sVar.f15358c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = sVar.f15356a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b3 = b2 | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b4 = b3 | (bArr[i5] & 255);
            this.f15328c = j - 4;
            if (i6 == i2) {
                this.f15327b = sVar.b();
                t.a(sVar);
            } else {
                sVar.f15357b = i6;
            }
            return b4;
        }
        throw new IllegalStateException("size < 4: " + this.f15328c);
    }

    public short readShort() {
        long j = this.f15328c;
        if (j >= 2) {
            s sVar = this.f15327b;
            int i = sVar.f15357b;
            int i2 = sVar.f15358c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = sVar.f15356a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f15328c = j - 2;
            if (i4 == i2) {
                this.f15327b = sVar.b();
                t.a(sVar);
            } else {
                sVar.f15357b = i4;
            }
            return (short) b2;
        }
        throw new IllegalStateException("size < 2: " + this.f15328c);
    }

    public void skip(long j) {
        while (j > 0) {
            s sVar = this.f15327b;
            if (sVar != null) {
                int min = (int) Math.min(j, (long) (sVar.f15358c - sVar.f15357b));
                long j2 = (long) min;
                this.f15328c -= j2;
                j -= j2;
                s sVar2 = this.f15327b;
                sVar2.f15357b += min;
                if (sVar2.f15357b == sVar2.f15358c) {
                    this.f15327b = sVar2.b();
                    t.a(sVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public y timeout() {
        return y.f15367a;
    }

    public String toString() {
        return p().toString();
    }

    public e write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public e write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            z.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                s b2 = b(1);
                int min = Math.min(i3 - i, 8192 - b2.f15358c);
                System.arraycopy(bArr, i, b2.f15356a, b2.f15358c, min);
                i += min;
                b2.f15358c += min;
            }
            this.f15328c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public e writeByte(int i) {
        s b2 = b(1);
        byte[] bArr = b2.f15356a;
        int i2 = b2.f15358c;
        b2.f15358c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f15328c++;
        return this;
    }

    public e writeInt(int i) {
        s b2 = b(4);
        byte[] bArr = b2.f15356a;
        int i2 = b2.f15358c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        b2.f15358c = i5 + 1;
        this.f15328c += 4;
        return this;
    }

    public e writeShort(int i) {
        s b2 = b(2);
        byte[] bArr = b2.f15356a;
        int i2 = b2.f15358c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        b2.f15358c = i3 + 1;
        this.f15328c += 2;
        return this;
    }
}
