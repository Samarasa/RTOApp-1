package c.b.e;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: c.b.e.f  reason: case insensitive filesystem */
public final class C0481f {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5013a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5014b;

    /* renamed from: c  reason: collision with root package name */
    private int f5015c;

    /* renamed from: d  reason: collision with root package name */
    private int f5016d;

    /* renamed from: e  reason: collision with root package name */
    private int f5017e;

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f5018f;

    /* renamed from: g  reason: collision with root package name */
    private int f5019g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5020h = false;
    private int i;
    private int j = Integer.MAX_VALUE;
    private int k;
    private int l = 100;
    private int m = 67108864;
    private a n = null;

    /* renamed from: c.b.e.f$a */
    private interface a {
        void a();
    }

    private C0481f(InputStream inputStream, int i2) {
        this.f5013a = new byte[i2];
        this.f5017e = 0;
        this.i = 0;
        this.f5018f = inputStream;
        this.f5014b = false;
    }

    private C0481f(byte[] bArr, int i2, int i3, boolean z) {
        this.f5013a = bArr;
        this.f5015c = i3 + i2;
        this.f5017e = i2;
        this.i = -i2;
        this.f5018f = null;
        this.f5014b = z;
    }

    public static C0481f a(InputStream inputStream) {
        return new C0481f(inputStream, 4096);
    }

    public static C0481f a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static C0481f a(byte[] bArr, int i2, int i3) {
        return a(bArr, i2, i3, false);
    }

    static C0481f a(byte[] bArr, int i2, int i3, boolean z) {
        C0481f fVar = new C0481f(bArr, i2, i3, z);
        try {
            fVar.c(i3);
            return fVar;
        } catch (n e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private byte[] f(int i2) {
        if (i2 > 0) {
            int i3 = this.i;
            int i4 = this.f5017e;
            int i5 = i3 + i4 + i2;
            if (i5 <= this.m) {
                int i6 = this.j;
                if (i5 <= i6) {
                    InputStream inputStream = this.f5018f;
                    if (inputStream != null) {
                        int i7 = this.f5015c;
                        int i8 = i7 - i4;
                        this.i = i3 + i7;
                        this.f5017e = 0;
                        this.f5015c = 0;
                        int i9 = i2 - i8;
                        if (i9 < 4096 || i9 <= inputStream.available()) {
                            byte[] bArr = new byte[i2];
                            System.arraycopy(this.f5013a, i4, bArr, 0, i8);
                            while (i8 < bArr.length) {
                                int read = this.f5018f.read(bArr, i8, i2 - i8);
                                if (read != -1) {
                                    this.i += read;
                                    i8 += read;
                                } else {
                                    throw n.i();
                                }
                            }
                            return bArr;
                        }
                        ArrayList<byte[]> arrayList = new ArrayList<>();
                        while (i9 > 0) {
                            byte[] bArr2 = new byte[Math.min(i9, 4096)];
                            int i10 = 0;
                            while (i10 < bArr2.length) {
                                int read2 = this.f5018f.read(bArr2, i10, bArr2.length - i10);
                                if (read2 != -1) {
                                    this.i += read2;
                                    i10 += read2;
                                } else {
                                    throw n.i();
                                }
                            }
                            i9 -= bArr2.length;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i2];
                        System.arraycopy(this.f5013a, i4, bArr3, 0, i8);
                        for (byte[] bArr4 : arrayList) {
                            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
                            i8 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw n.i();
                }
                e((i6 - i3) - i4);
                throw n.i();
            }
            throw n.h();
        } else if (i2 == 0) {
            return C0488m.f5056c;
        } else {
            throw n.f();
        }
    }

    private void g(int i2) {
        if (!i(i2)) {
            throw n.i();
        }
    }

    private void h(int i2) {
        if (i2 >= 0) {
            int i3 = this.i;
            int i4 = this.f5017e;
            int i5 = i3 + i4 + i2;
            int i6 = this.j;
            if (i5 <= i6) {
                int i7 = this.f5015c;
                int i8 = i7 - i4;
                this.f5017e = i7;
                while (true) {
                    g(1);
                    int i9 = i2 - i8;
                    int i10 = this.f5015c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.f5017e = i10;
                    } else {
                        this.f5017e = i9;
                        return;
                    }
                }
            } else {
                e((i6 - i3) - i4);
                throw n.i();
            }
        } else {
            throw n.f();
        }
    }

    private boolean i(int i2) {
        int i3 = this.f5017e;
        if (i3 + i2 <= this.f5015c) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        } else if (this.i + i3 + i2 > this.j) {
            return false;
        } else {
            a aVar = this.n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f5018f != null) {
                int i4 = this.f5017e;
                if (i4 > 0) {
                    int i5 = this.f5015c;
                    if (i5 > i4) {
                        byte[] bArr = this.f5013a;
                        System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                    }
                    this.i += i4;
                    this.f5015c -= i4;
                    this.f5017e = 0;
                }
                InputStream inputStream = this.f5018f;
                byte[] bArr2 = this.f5013a;
                int i6 = this.f5015c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.f5013a.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.f5015c += read;
                    if ((this.i + i2) - this.m <= 0) {
                        s();
                        if (this.f5015c >= i2) {
                            return true;
                        }
                        return i(i2);
                    }
                    throw n.h();
                }
            }
            return false;
        }
    }

    private void s() {
        this.f5015c += this.f5016d;
        int i2 = this.i;
        int i3 = this.f5015c;
        int i4 = i2 + i3;
        int i5 = this.j;
        if (i4 > i5) {
            this.f5016d = i4 - i5;
            this.f5015c = i3 - this.f5016d;
            return;
        }
        this.f5016d = 0;
    }

    private void t() {
        int i2 = this.f5015c;
        int i3 = this.f5017e;
        if (i2 - i3 >= 10) {
            byte[] bArr = this.f5013a;
            int i4 = 0;
            while (i4 < 10) {
                int i5 = i3 + 1;
                if (bArr[i3] >= 0) {
                    this.f5017e = i5;
                    return;
                } else {
                    i4++;
                    i3 = i5;
                }
            }
        }
        u();
    }

    private void u() {
        int i2 = 0;
        while (i2 < 10) {
            if (i() < 0) {
                i2++;
            } else {
                return;
            }
        }
        throw n.e();
    }

    public <T extends r> T a(u<T> uVar, C0483h hVar) {
        int l2 = l();
        if (this.k < this.l) {
            int c2 = c(l2);
            this.k++;
            T t = (r) uVar.a(this, hVar);
            a(0);
            this.k--;
            b(c2);
            return t;
        }
        throw n.g();
    }

    public void a(int i2) {
        if (this.f5019g != i2) {
            throw n.a();
        }
    }

    public boolean a() {
        return this.f5017e == this.f5015c && !i(1);
    }

    public void b(int i2) {
        this.j = i2;
        s();
    }

    public boolean b() {
        return m() != 0;
    }

    public int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.i + this.f5017e;
            int i4 = this.j;
            if (i3 <= i4) {
                this.j = i3;
                s();
                return i4;
            }
            throw n.i();
        }
        throw n.f();
    }

    public C0480e c() {
        int l2 = l();
        int i2 = this.f5015c;
        int i3 = this.f5017e;
        if (l2 > i2 - i3 || l2 <= 0) {
            return l2 == 0 ? C0480e.f5007a : C0480e.a(f(l2));
        }
        C0480e a2 = (!this.f5014b || !this.f5020h) ? C0480e.a(this.f5013a, this.f5017e, l2) : C0480e.b(this.f5013a, i3, l2);
        this.f5017e += l2;
        return a2;
    }

    public int d() {
        return l();
    }

    public boolean d(int i2) {
        int b2 = M.b(i2);
        if (b2 == 0) {
            t();
            return true;
        } else if (b2 == 1) {
            e(8);
            return true;
        } else if (b2 == 2) {
            e(l());
            return true;
        } else if (b2 == 3) {
            r();
            a(M.a(M.a(i2), 4));
            return true;
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                e(4);
                return true;
            }
            throw n.d();
        }
    }

    public int e() {
        return j();
    }

    public void e(int i2) {
        int i3 = this.f5015c;
        int i4 = this.f5017e;
        if (i2 > i3 - i4 || i2 < 0) {
            h(i2);
        } else {
            this.f5017e = i4 + i2;
        }
    }

    public long f() {
        return k();
    }

    public int g() {
        return l();
    }

    public long h() {
        return m();
    }

    public byte i() {
        if (this.f5017e == this.f5015c) {
            g(1);
        }
        byte[] bArr = this.f5013a;
        int i2 = this.f5017e;
        this.f5017e = i2 + 1;
        return bArr[i2];
    }

    public int j() {
        int i2 = this.f5017e;
        if (this.f5015c - i2 < 4) {
            g(4);
            i2 = this.f5017e;
        }
        byte[] bArr = this.f5013a;
        this.f5017e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public long k() {
        int i2 = this.f5017e;
        if (this.f5015c - i2 < 8) {
            g(8);
            i2 = this.f5017e;
        }
        byte[] bArr = this.f5013a;
        this.f5017e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int l() {
        /*
            r5 = this;
            int r0 = r5.f5017e
            int r1 = r5.f5015c
            if (r1 != r0) goto L_0x0007
            goto L_0x006a
        L_0x0007:
            byte[] r2 = r5.f5013a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f5017e = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0018
            goto L_0x006a
        L_0x0018:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0070
        L_0x0024:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r1 = r3
            goto L_0x0070
        L_0x0031:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0070
        L_0x003f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0070
        L_0x006a:
            long r0 = r5.n()
            int r1 = (int) r0
            return r1
        L_0x0070:
            r5.f5017e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.C0481f.l():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m() {
        /*
            r11 = this;
            int r0 = r11.f5017e
            int r1 = r11.f5015c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b6
        L_0x0008:
            byte[] r2 = r11.f5013a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r11.f5017e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b6
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0026:
            long r2 = (long) r0
            r3 = r2
            goto L_0x00bb
        L_0x002a:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x003b
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r3 = r9
            goto L_0x00bb
        L_0x003b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0049
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0026
        L_0x0049:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0060
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x005c:
            long r1 = r1 ^ r3
            r3 = r1
        L_0x005e:
            r1 = r0
            goto L_0x00bb
        L_0x0060:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0072:
            long r3 = r3 ^ r5
            goto L_0x00bb
        L_0x0074:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0087
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x005c
        L_0x0087:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0072
        L_0x009a:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x005e
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bb
        L_0x00b6:
            long r0 = r11.n()
            return r0
        L_0x00bb:
            r11.f5017e = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.C0481f.m():long");
    }

    /* access modifiers changed from: package-private */
    public long n() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte i3 = i();
            j2 |= ((long) (i3 & Byte.MAX_VALUE)) << i2;
            if ((i3 & 128) == 0) {
                return j2;
            }
        }
        throw n.e();
    }

    public String o() {
        int l2 = l();
        int i2 = this.f5015c;
        int i3 = this.f5017e;
        if (l2 <= i2 - i3 && l2 > 0) {
            String str = new String(this.f5013a, i3, l2, C0488m.f5054a);
            this.f5017e += l2;
            return str;
        } else if (l2 == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (l2 > this.f5015c) {
                return new String(f(l2), C0488m.f5054a);
            }
            g(l2);
            String str2 = new String(this.f5013a, this.f5017e, l2, C0488m.f5054a);
            this.f5017e += l2;
            return str2;
        }
    }

    public String p() {
        byte[] bArr;
        int l2 = l();
        int i2 = this.f5017e;
        int i3 = 0;
        if (l2 <= this.f5015c - i2 && l2 > 0) {
            bArr = this.f5013a;
            this.f5017e = i2 + l2;
            i3 = i2;
        } else if (l2 == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (l2 <= this.f5015c) {
                g(l2);
                bArr = this.f5013a;
                this.f5017e = l2 + 0;
            } else {
                bArr = f(l2);
            }
        }
        if (G.b(bArr, i3, i3 + l2)) {
            return new String(bArr, i3, l2, C0488m.f5054a);
        }
        throw n.c();
    }

    public int q() {
        if (a()) {
            this.f5019g = 0;
            return 0;
        }
        this.f5019g = l();
        if (M.a(this.f5019g) != 0) {
            return this.f5019g;
        }
        throw n.b();
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void r() {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.q()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.d(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.C0481f.r():void");
    }
}
