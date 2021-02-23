package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.Lja;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.jka  reason: case insensitive filesystem */
public final class C1953jka implements Tja {

    /* renamed from: a  reason: collision with root package name */
    private static final Zja f10985a = new C2166mka();

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f10986b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f10987c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f10988d = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private Hma F;
    private Hma G;
    private boolean H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private int[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private byte W;
    private int X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ba;
    private Vja ca;

    /* renamed from: e  reason: collision with root package name */
    private final C1812hka f10989e;

    /* renamed from: f  reason: collision with root package name */
    private final C2450qka f10990f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<C2308oka> f10991g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10992h;
    private final Nma i;
    private final Nma j;
    private final Nma k;
    private final Nma l;
    private final Nma m;
    private final Nma n;
    private final Nma o;
    private final Nma p;
    private final Nma q;
    private ByteBuffer r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private C2308oka x;
    private boolean y;
    private int z;

    public C1953jka() {
        this(0);
    }

    private C1953jka(int i2) {
        this(new C1741gka(), 0);
    }

    private C1953jka(C1812hka hka, int i2) {
        this.t = -1;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.C = -1;
        this.D = -1;
        this.E = -9223372036854775807L;
        this.f10989e = hka;
        this.f10989e.a((C2024kka) new C2095lka(this, (C2166mka) null));
        this.f10992h = true;
        this.f10990f = new C2450qka();
        this.f10991g = new SparseArray<>();
        this.k = new Nma(4);
        this.l = new Nma(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new Nma(4);
        this.i = new Nma(Ima.f7340a);
        this.j = new Nma(4);
        this.n = new Nma();
        this.o = new Nma();
        this.p = new Nma(8);
        this.q = new Nma();
    }

    static int a(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    private final int a(Wja wja, C1599eka eka, int i2) {
        int i3;
        int j2 = this.n.j();
        if (j2 > 0) {
            i3 = Math.min(i2, j2);
            eka.a(this.n, i3);
        } else {
            i3 = eka.a(wja, i2, false);
        }
        this.R += i3;
        this.Z += i3;
        return i3;
    }

    private final long a(long j2) {
        long j3 = this.u;
        if (j3 != -9223372036854775807L) {
            return Tma.a(j2, j3, 1000);
        }
        throw new Sia("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void a(Wja wja, int i2) {
        if (this.k.c() < i2) {
            if (this.k.a() < i2) {
                Nma nma = this.k;
                byte[] bArr = nma.f8013a;
                nma.a(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i2)), this.k.c());
            }
            Nma nma2 = this.k;
            wja.readFully(nma2.f8013a, nma2.c(), i2 - this.k.c());
            this.k.b(i2);
        }
    }

    private final void a(Wja wja, C2308oka oka, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(oka.f11619a)) {
            int length = f10986b.length + i2;
            if (this.o.a() < length) {
                this.o.f8013a = Arrays.copyOf(f10986b, length + i2);
            }
            wja.readFully(this.o.f8013a, f10986b.length, i2);
            this.o.c(0);
            this.o.b(length);
            return;
        }
        C1599eka eka = oka.O;
        if (!this.S) {
            if (oka.f11623e) {
                this.Q &= -1073741825;
                int i4 = 128;
                if (!this.T) {
                    wja.readFully(this.k.f8013a, 0, 1);
                    this.R++;
                    byte[] bArr = this.k.f8013a;
                    if ((bArr[0] & 128) != 128) {
                        this.W = bArr[0];
                        this.T = true;
                    } else {
                        throw new Sia("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.W;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.U) {
                        wja.readFully(this.p.f8013a, 0, 8);
                        this.R += 8;
                        this.U = true;
                        byte[] bArr2 = this.k.f8013a;
                        if (!z2) {
                            i4 = 0;
                        }
                        bArr2[0] = (byte) (i4 | 8);
                        this.k.c(0);
                        eka.a(this.k, 1);
                        this.Z++;
                        this.p.c(0);
                        eka.a(this.p, 8);
                        this.Z += 8;
                    }
                    if (z2) {
                        if (!this.V) {
                            wja.readFully(this.k.f8013a, 0, 1);
                            this.R++;
                            this.k.c(0);
                            this.X = this.k.g();
                            this.V = true;
                        }
                        int i5 = this.X << 2;
                        this.k.a(i5);
                        wja.readFully(this.k.f8013a, 0, i5);
                        this.R += i5;
                        short s2 = (short) ((this.X / 2) + 1);
                        int i6 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.r;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.r = ByteBuffer.allocate(i6);
                        }
                        this.r.position(0);
                        this.r.putShort(s2);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i3 = this.X;
                            if (i7 >= i3) {
                                break;
                            }
                            int o2 = this.k.o();
                            if (i7 % 2 == 0) {
                                this.r.putShort((short) (o2 - i8));
                            } else {
                                this.r.putInt(o2 - i8);
                            }
                            i7++;
                            i8 = o2;
                        }
                        int i9 = (i2 - this.R) - i8;
                        if (i3 % 2 == 1) {
                            this.r.putInt(i9);
                        } else {
                            this.r.putShort((short) i9);
                            this.r.putInt(0);
                        }
                        this.q.a(this.r.array(), i6);
                        eka.a(this.q, i6);
                        this.Z += i6;
                    }
                }
            } else {
                byte[] bArr3 = oka.f11624f;
                if (bArr3 != null) {
                    this.n.a(bArr3, bArr3.length);
                }
            }
            this.S = true;
        }
        int c2 = i2 + this.n.c();
        if (!"V_MPEG4/ISO/AVC".equals(oka.f11619a) && !"V_MPEGH/ISO/HEVC".equals(oka.f11619a)) {
            while (true) {
                int i10 = this.R;
                if (i10 >= c2) {
                    break;
                }
                a(wja, eka, c2 - i10);
            }
        } else {
            byte[] bArr4 = this.j.f8013a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i11 = oka.P;
            int i12 = 4 - i11;
            while (this.R < c2) {
                int i13 = this.Y;
                if (i13 == 0) {
                    int min = Math.min(i11, this.n.j());
                    wja.readFully(bArr4, i12 + min, i11 - min);
                    if (min > 0) {
                        this.n.a(bArr4, i12, min);
                    }
                    this.R += i11;
                    this.j.c(0);
                    this.Y = this.j.o();
                    this.i.c(0);
                    eka.a(this.i, 4);
                    this.Z += 4;
                } else {
                    this.Y = i13 - a(wja, eka, i13);
                }
            }
        }
        if ("A_VORBIS".equals(oka.f11619a)) {
            this.l.c(0);
            eka.a(this.l, 4);
            this.Z += 4;
        }
    }

    private final void a(C2308oka oka, long j2) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(oka.f11619a)) {
            byte[] bArr2 = this.o.f8013a;
            long j3 = this.K;
            if (j3 == -9223372036854775807L) {
                bArr = f10987c;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (((long) i2) * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - ((long) (60000000 * i3));
                int i4 = (int) (j5 / 1000000);
                bArr = Tma.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - ((long) (1000000 * i4))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C1599eka eka = oka.O;
            Nma nma = this.o;
            eka.a(nma, nma.c());
            this.Z += this.o.c();
        }
        oka.O.a(j2, this.Q, this.Z, 0, oka.f11625g);
        this.aa = true;
        c();
    }

    private static int[] a(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length << 1, i2)];
    }

    static boolean b(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final void c() {
        this.R = 0;
        this.Z = 0;
        this.Y = 0;
        this.S = false;
        this.T = false;
        this.V = false;
        this.X = 0;
        this.W = 0;
        this.U = false;
        this.n.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.Wja r9, com.google.android.gms.internal.ads._ja r10) {
        /*
            r8 = this;
            r0 = 0
            r8.aa = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.aa
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.hka r2 = r8.f10989e
            boolean r2 = r2.a((com.google.android.gms.internal.ads.Wja) r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.B
            if (r5 == 0) goto L_0x0025
            r8.D = r3
            long r3 = r8.C
            r10.f9698a = r3
            r8.B = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.y
            if (r3 == 0) goto L_0x0036
            long r3 = r8.D
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.f9698a = r3
            r8.D = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1953jka.a(com.google.android.gms.internal.ads.Wja, com.google.android.gms.internal.ads._ja):int");
    }

    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, double d2) {
        if (i2 == 181) {
            this.x.I = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.x.w = (float) d2;
                    return;
                case 21970:
                    this.x.x = (float) d2;
                    return;
                case 21971:
                    this.x.y = (float) d2;
                    return;
                case 21972:
                    this.x.z = (float) d2;
                    return;
                case 21973:
                    this.x.A = (float) d2;
                    return;
                case 21974:
                    this.x.B = (float) d2;
                    return;
                case 21975:
                    this.x.C = (float) d2;
                    return;
                case 21976:
                    this.x.D = (float) d2;
                    return;
                case 21977:
                    this.x.E = (float) d2;
                    return;
                case 21978:
                    this.x.F = (float) d2;
                    return;
                default:
                    return;
            }
        } else {
            this.v = (long) d2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fd, code lost:
        throw new com.google.android.gms.internal.ads.Sia("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, int r21, com.google.android.gms.internal.ads.Wja r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r4) goto L_0x0091
            if (r1 == r5) goto L_0x0091
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0085
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0076
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0058
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x004c
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0033
            com.google.android.gms.internal.ads.oka r1 = r0.x
            byte[] r4 = new byte[r2]
            r1.o = r4
            byte[] r1 = r1.o
            r3.readFully(r1, r7, r2)
            return
        L_0x0033:
            com.google.android.gms.internal.ads.Sia r2 = new com.google.android.gms.internal.ads.Sia
            r3 = 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x004c:
            com.google.android.gms.internal.ads.oka r1 = r0.x
            byte[] r4 = new byte[r2]
            r1.f11626h = r4
            byte[] r1 = r1.f11626h
            r3.readFully(r1, r7, r2)
            return
        L_0x0058:
            com.google.android.gms.internal.ads.Nma r1 = r0.m
            byte[] r1 = r1.f8013a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.Nma r1 = r0.m
            byte[] r1 = r1.f8013a
            int r6 = r6 - r2
            r3.readFully(r1, r6, r2)
            com.google.android.gms.internal.ads.Nma r1 = r0.m
            r1.c(r7)
            com.google.android.gms.internal.ads.Nma r1 = r0.m
            long r1 = r1.l()
            int r2 = (int) r1
            r0.z = r2
            return
        L_0x0076:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r7, r2)
            com.google.android.gms.internal.ads.oka r2 = r0.x
            com.google.android.gms.internal.ads.dka r3 = new com.google.android.gms.internal.ads.dka
            r3.<init>(r8, r1)
            r2.f11625g = r3
            return
        L_0x0085:
            com.google.android.gms.internal.ads.oka r1 = r0.x
            byte[] r4 = new byte[r2]
            r1.f11624f = r4
            byte[] r1 = r1.f11624f
            r3.readFully(r1, r7, r2)
            return
        L_0x0091:
            int r4 = r0.I
            r9 = 8
            if (r4 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.qka r4 = r0.f10990f
            long r10 = r4.a(r3, r7, r8, r9)
            int r4 = (int) r10
            r0.O = r4
            com.google.android.gms.internal.ads.qka r4 = r0.f10990f
            int r4 = r4.b()
            r0.P = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.K = r10
            r0.I = r8
            com.google.android.gms.internal.ads.Nma r4 = r0.k
            r4.i()
        L_0x00b6:
            android.util.SparseArray<com.google.android.gms.internal.ads.oka> r4 = r0.f10991g
            int r10 = r0.O
            java.lang.Object r4 = r4.get(r10)
            com.google.android.gms.internal.ads.oka r4 = (com.google.android.gms.internal.ads.C2308oka) r4
            if (r4 != 0) goto L_0x00cc
            int r1 = r0.P
            int r1 = r2 - r1
            r3.c(r1)
            r0.I = r7
            return
        L_0x00cc:
            int r10 = r0.I
            if (r10 != r8) goto L_0x0280
            r10 = 3
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (int) r10)
            com.google.android.gms.internal.ads.Nma r11 = r0.k
            byte[] r11 = r11.f8013a
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00f7
            r0.M = r8
            int[] r6 = r0.N
            int[] r6 = a((int[]) r6, (int) r8)
            r0.N = r6
            int[] r6 = r0.N
            int r11 = r0.P
            int r2 = r2 - r11
            int r2 = r2 - r10
            r6[r7] = r2
        L_0x00f4:
            r6 = 1
            goto L_0x0211
        L_0x00f7:
            if (r1 != r5) goto L_0x0278
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (int) r6)
            com.google.android.gms.internal.ads.Nma r14 = r0.k
            byte[] r14 = r14.f8013a
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r8
            r0.M = r14
            int[] r14 = r0.N
            int r15 = r0.M
            int[] r14 = a((int[]) r14, (int) r15)
            r0.N = r14
            if (r11 != r12) goto L_0x011f
            int r10 = r0.P
            int r2 = r2 - r10
            int r2 = r2 - r6
            int r6 = r0.M
            int r2 = r2 / r6
            int[] r10 = r0.N
            java.util.Arrays.fill(r10, r7, r6, r2)
            goto L_0x00f4
        L_0x011f:
            if (r11 != r8) goto L_0x0156
            r6 = 0
            r10 = 4
            r11 = 0
        L_0x0124:
            int r14 = r0.M
            int r15 = r14 + -1
            if (r6 >= r15) goto L_0x014b
            int[] r14 = r0.N
            r14[r6] = r7
        L_0x012e:
            int r10 = r10 + r8
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (int) r10)
            com.google.android.gms.internal.ads.Nma r14 = r0.k
            byte[] r14 = r14.f8013a
            int r15 = r10 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r0.N
            r16 = r15[r6]
            int r16 = r16 + r14
            r15[r6] = r16
            if (r14 == r13) goto L_0x012e
            r14 = r15[r6]
            int r11 = r11 + r14
            int r6 = r6 + 1
            goto L_0x0124
        L_0x014b:
            int[] r6 = r0.N
            int r14 = r14 - r8
            int r15 = r0.P
            int r2 = r2 - r15
            int r2 = r2 - r10
            int r2 = r2 - r11
            r6[r14] = r2
            goto L_0x00f4
        L_0x0156:
            if (r11 != r10) goto L_0x025f
            r6 = 0
            r10 = 4
            r11 = 0
        L_0x015b:
            int r14 = r0.M
            int r15 = r14 + -1
            if (r6 >= r15) goto L_0x0206
            int[] r14 = r0.N
            r14[r6] = r7
            int r10 = r10 + 1
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (int) r10)
            com.google.android.gms.internal.ads.Nma r14 = r0.k
            byte[] r14 = r14.f8013a
            int r15 = r10 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01fe
            r16 = 0
            r14 = 0
        L_0x0177:
            if (r14 >= r9) goto L_0x01c9
            int r18 = 7 - r14
            int r18 = r8 << r18
            com.google.android.gms.internal.ads.Nma r5 = r0.k
            byte[] r5 = r5.f8013a
            byte r5 = r5[r15]
            r5 = r5 & r18
            if (r5 == 0) goto L_0x01bf
            int r10 = r10 + r14
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (int) r10)
            com.google.android.gms.internal.ads.Nma r5 = r0.k
            byte[] r5 = r5.f8013a
            int r16 = r15 + 1
            byte r5 = r5[r15]
            r5 = r5 & r13
            r15 = r18 ^ -1
            r5 = r5 & r15
            long r7 = (long) r5
            r5 = r16
        L_0x019a:
            r16 = r7
            if (r5 >= r10) goto L_0x01b1
            long r7 = r16 << r9
            com.google.android.gms.internal.ads.Nma r15 = r0.k
            byte[] r15 = r15.f8013a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r13
            long r12 = (long) r5
            long r7 = r7 | r12
            r5 = r16
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x019a
        L_0x01b1:
            if (r6 <= 0) goto L_0x01c9
            int r14 = r14 * 7
            int r14 = r14 + 6
            r7 = 1
            long r12 = r7 << r14
            long r12 = r12 - r7
            long r16 = r16 - r12
            goto L_0x01c9
        L_0x01bf:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x0177
        L_0x01c9:
            r7 = r16
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x01f6
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01f6
            int r5 = (int) r7
            int[] r7 = r0.N
            if (r6 != 0) goto L_0x01df
            goto L_0x01e4
        L_0x01df:
            int r8 = r6 + -1
            r8 = r7[r8]
            int r5 = r5 + r8
        L_0x01e4:
            r7[r6] = r5
            int[] r5 = r0.N
            r5 = r5[r6]
            int r11 = r11 + r5
            int r6 = r6 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x015b
        L_0x01f6:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01fe:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x0206:
            int[] r5 = r0.N
            r6 = 1
            int r14 = r14 - r6
            int r7 = r0.P
            int r2 = r2 - r7
            int r2 = r2 - r10
            int r2 = r2 - r11
            r5[r14] = r2
        L_0x0211:
            com.google.android.gms.internal.ads.Nma r2 = r0.k
            byte[] r2 = r2.f8013a
            r5 = 0
            byte r7 = r2[r5]
            int r5 = r7 << 8
            byte r2 = r2[r6]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.E
            long r7 = (long) r2
            long r7 = r0.a((long) r7)
            long r5 = r5 + r7
            r0.J = r5
            com.google.android.gms.internal.ads.Nma r2 = r0.k
            byte[] r2 = r2.f8013a
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r9
            if (r2 != r9) goto L_0x0236
            r2 = 1
            goto L_0x0237
        L_0x0236:
            r2 = 0
        L_0x0237:
            int r6 = r4.f11621c
            if (r6 == r5) goto L_0x024d
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x024b
            com.google.android.gms.internal.ads.Nma r6 = r0.k
            byte[] r6 = r6.f8013a
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r5 = 0
            goto L_0x024e
        L_0x024d:
            r5 = 1
        L_0x024e:
            if (r2 == 0) goto L_0x0253
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0254
        L_0x0253:
            r7 = 0
        L_0x0254:
            r2 = r5 | r7
            r0.Q = r2
            r2 = 2
            r0.I = r2
            r2 = 0
            r0.L = r2
            goto L_0x0280
        L_0x025f:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected lacing value: "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0278:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0280:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x02ab
        L_0x0284:
            int r1 = r0.L
            int r2 = r0.M
            if (r1 >= r2) goto L_0x02a7
            int[] r2 = r0.N
            r1 = r2[r1]
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (com.google.android.gms.internal.ads.C2308oka) r4, (int) r1)
            long r1 = r0.J
            int r5 = r0.L
            int r6 = r4.f11622d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.a((com.google.android.gms.internal.ads.C2308oka) r4, (long) r1)
            int r1 = r0.L
            r2 = 1
            int r1 = r1 + r2
            r0.L = r1
            goto L_0x0284
        L_0x02a7:
            r1 = 0
            r0.I = r1
            return
        L_0x02ab:
            r1 = 0
            int[] r2 = r0.N
            r1 = r2[r1]
            r0.a((com.google.android.gms.internal.ads.Wja) r3, (com.google.android.gms.internal.ads.C2308oka) r4, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1953jka.a(int, int, com.google.android.gms.internal.ads.Wja):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.x.f11621c = (int) j2;
                        return;
                    case 136:
                        C2308oka oka = this.x;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        oka.L = z2;
                        return;
                    case 155:
                        this.K = a(j2);
                        return;
                    case 159:
                        this.x.G = (int) j2;
                        return;
                    case 176:
                        this.x.j = (int) j2;
                        return;
                    case 179:
                        this.F.a(a(j2));
                        return;
                    case 186:
                        this.x.k = (int) j2;
                        return;
                    case 215:
                        this.x.f11620b = (int) j2;
                        return;
                    case 231:
                        this.E = a(j2);
                        return;
                    case 241:
                        if (!this.H) {
                            this.G.a(j2);
                            this.H = true;
                            return;
                        }
                        return;
                    case 251:
                        this.ba = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j2);
                            sb.append(" not supported");
                            throw new Sia(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j2);
                            sb2.append(" not supported");
                            throw new Sia(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j2);
                            sb3.append(" not supported");
                            throw new Sia(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j2);
                            sb4.append(" not supported");
                            throw new Sia(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j2);
                            sb5.append(" not supported");
                            throw new Sia(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.A = j2 + this.t;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.x.p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.x.p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.x.p = 1;
                            return;
                        } else if (i3 == 15) {
                            this.x.p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.x.l = (int) j2;
                        return;
                    case 21682:
                        this.x.n = (int) j2;
                        return;
                    case 21690:
                        this.x.m = (int) j2;
                        return;
                    case 21930:
                        C2308oka oka2 = this.x;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        oka2.M = z2;
                        return;
                    case 22186:
                        this.x.J = j2;
                        return;
                    case 22203:
                        this.x.K = j2;
                        return;
                    case 25188:
                        this.x.H = (int) j2;
                        return;
                    case 2352003:
                        this.x.f11622d = (int) j2;
                        return;
                    case 2807729:
                        this.u = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i4 = (int) j2;
                                if (i4 == 1) {
                                    this.x.t = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.x.t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j2;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.x.s = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.x.s = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.x.s = 3;
                                return;
                            case 21947:
                                C2308oka oka3 = this.x;
                                oka3.q = true;
                                int i6 = (int) j2;
                                if (i6 == 1) {
                                    oka3.r = 1;
                                    return;
                                } else if (i6 == 9) {
                                    oka3.r = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.x.r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.x.u = (int) j2;
                                return;
                            case 21949:
                                this.x.v = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new Sia(sb6.toString());
            }
        } else if (j2 != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j2);
            sb7.append(" not supported");
            throw new Sia(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.ba = false;
        } else if (i2 == 174) {
            this.x = new C2308oka((C2166mka) null);
        } else if (i2 == 187) {
            this.H = false;
        } else if (i2 == 19899) {
            this.z = -1;
            this.A = -1;
        } else if (i2 == 20533) {
            this.x.f11623e = true;
        } else if (i2 == 21968) {
            this.x.q = true;
        } else if (i2 == 25152) {
        } else {
            if (i2 == 408125543) {
                long j4 = this.t;
                if (j4 == -1 || j4 == j2) {
                    this.t = j2;
                    this.s = j3;
                    return;
                }
                throw new Sia("Multiple Segment elements not supported");
            } else if (i2 == 475249515) {
                this.F = new Hma();
                this.G = new Hma();
            } else if (i2 != 524531317 || this.y) {
            } else {
                if (!this.f10992h || this.C == -1) {
                    this.ca.a(new C1387bka(this.w));
                    this.y = true;
                    return;
                }
                this.B = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        if (i2 == 134) {
            this.x.f11619a = str;
        } else if (i2 != 17026) {
            if (i2 == 2274716) {
                String unused = this.x.N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new Sia(sb.toString());
        }
    }

    public final void a(long j2, long j3) {
        this.E = -9223372036854775807L;
        this.I = 0;
        this.f10989e.reset();
        this.f10990f.a();
        c();
    }

    public final void a(Vja vja) {
        this.ca = vja;
    }

    public final boolean a(Wja wja) {
        return new C2237nka().a(wja);
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        C1458cka cka;
        Hma hma;
        Hma hma2;
        int i3;
        int i4 = 0;
        if (i2 != 160) {
            if (i2 == 174) {
                String str = this.x.f11619a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    C2308oka oka = this.x;
                    oka.a(this.ca, oka.f11620b);
                    SparseArray<C2308oka> sparseArray = this.f10991g;
                    C2308oka oka2 = this.x;
                    sparseArray.put(oka2.f11620b, oka2);
                }
                this.x = null;
            } else if (i2 == 19899) {
                int i5 = this.z;
                if (i5 != -1) {
                    long j2 = this.A;
                    if (j2 != -1) {
                        if (i5 == 475249515) {
                            this.C = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new Sia("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                C2308oka oka3 = this.x;
                if (oka3.f11623e) {
                    C1529dka dka = oka3.f11625g;
                    if (dka != null) {
                        oka3.i = new Lja(new Lja.a(C2942xia.f12812b, "video/webm", dka.f10175b));
                        return;
                    }
                    throw new Sia("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (i2 == 28032) {
                C2308oka oka4 = this.x;
                if (oka4.f11623e && oka4.f11624f != null) {
                    throw new Sia("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.u == -9223372036854775807L) {
                    this.u = 1000000;
                }
                long j3 = this.v;
                if (j3 != -9223372036854775807L) {
                    this.w = a(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.y) {
                    Vja vja = this.ca;
                    if (this.t == -1 || this.w == -9223372036854775807L || (hma = this.F) == null || hma.a() == 0 || (hma2 = this.G) == null || hma2.a() != this.F.a()) {
                        this.F = null;
                        this.G = null;
                        cka = new C1387bka(this.w);
                    } else {
                        int a2 = this.F.a();
                        int[] iArr = new int[a2];
                        long[] jArr = new long[a2];
                        long[] jArr2 = new long[a2];
                        long[] jArr3 = new long[a2];
                        for (int i6 = 0; i6 < a2; i6++) {
                            jArr3[i6] = this.F.a(i6);
                            jArr[i6] = this.t + this.G.a(i6);
                        }
                        while (true) {
                            i3 = a2 - 1;
                            if (i4 >= i3) {
                                break;
                            }
                            int i7 = i4 + 1;
                            iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                            jArr2[i4] = jArr3[i7] - jArr3[i4];
                            i4 = i7;
                        }
                        iArr[i3] = (int) ((this.t + this.s) - jArr[i3]);
                        jArr2[i3] = this.w - jArr3[i3];
                        this.F = null;
                        this.G = null;
                        cka = new Rja(iArr, jArr, jArr2, jArr3);
                    }
                    vja.a(cka);
                    this.y = true;
                }
            } else if (this.f10991g.size() != 0) {
                this.ca.f();
            } else {
                throw new Sia("No valid tracks were found");
            }
        } else if (this.I == 2) {
            if (!this.ba) {
                this.Q |= 1;
            }
            a(this.f10991g.get(this.O), this.J);
            this.I = 0;
        }
    }
}
