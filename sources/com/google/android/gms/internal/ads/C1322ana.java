package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.ana  reason: case insensitive filesystem */
public final class C1322ana extends Tka {
    private static final int[] V = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private long Aa;
    private int Ba;
    private final Context W;
    private final C1605ena X;
    private final C1959jna Y;
    private final long Z;
    private final int aa;
    private final boolean ba;
    private final long[] ca;
    private Lia[] da;
    private C1464cna ea;
    private Surface fa;
    private Surface ga;
    private int ha;
    private boolean ia;
    private long ja;
    private long ka;
    private int la;
    private int ma;
    private int na;
    private float oa;
    private int pa;
    private int qa;
    private int ra;
    private float sa;
    private int ta;
    private int ua;
    private int va;
    private float wa;
    private boolean xa;
    private int ya;
    C1676fna za;

    public C1322ana(Context context, Vka vka, long j, Handler handler, C1747gna gna, int i) {
        this(context, vka, 0, (Qja<Sja>) null, false, handler, gna, -1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C1322ana(Context context, Vka vka, long j, Qja<Sja> qja, boolean z, Handler handler, C1747gna gna, int i) {
        super(2, vka, (Qja<Sja>) null, false);
        boolean z2 = false;
        this.Z = 0;
        this.aa = -1;
        this.W = context.getApplicationContext();
        this.X = new C1605ena(context);
        this.Y = new C1959jna(handler, gna);
        if (Tma.f8821a <= 22 && "foster".equals(Tma.f8822b) && "NVIDIA".equals(Tma.f8823c)) {
            z2 = true;
        }
        this.ba = z2;
        this.ca = new long[10];
        this.Aa = -9223372036854775807L;
        this.ja = -9223372036854775807L;
        this.pa = -1;
        this.qa = -1;
        this.sa = -1.0f;
        this.oa = -1.0f;
        this.ha = 1;
        D();
    }

    private final void D() {
        this.ta = -1;
        this.ua = -1;
        this.wa = -1.0f;
        this.va = -1;
    }

    private final void E() {
        if (this.ta != this.pa || this.ua != this.qa || this.va != this.ra || this.wa != this.sa) {
            this.Y.a(this.pa, this.qa, this.ra, this.sa);
            this.ta = this.pa;
            this.ua = this.qa;
            this.va = this.ra;
            this.wa = this.sa;
        }
    }

    private final void F() {
        if (this.ta != -1 || this.ua != -1) {
            this.Y.a(this.pa, this.qa, this.ra, this.sa);
        }
    }

    private final void G() {
        if (this.la > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Y.a(this.la, elapsedRealtime - this.ka);
            this.la = 0;
            this.ka = elapsedRealtime;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0086
            if (r9 != r0) goto L_0x0007
            goto L_0x0086
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x007d
            if (r7 == r3) goto L_0x007d
            if (r7 == r6) goto L_0x0061
            if (r7 == r4) goto L_0x007d
            if (r7 == r5) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0080
        L_0x0061:
            java.lang.String r7 = com.google.android.gms.internal.ads.Tma.f8824d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.Tma.a((int) r8, (int) r7)
            int r7 = com.google.android.gms.internal.ads.Tma.a((int) r9, (int) r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            goto L_0x007f
        L_0x007d:
            int r8 = r8 * r9
        L_0x007f:
            r5 = 2
        L_0x0080:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1322ana.a(java.lang.String, int, int):int");
    }

    private final void a(MediaCodec mediaCodec, int i, long j) {
        Qma.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        Qma.a();
        this.U.f7470e++;
    }

    @TargetApi(21)
    private final void a(MediaCodec mediaCodec, int i, long j, long j2) {
        E();
        Qma.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        Qma.a();
        this.U.f7469d++;
        this.ma = 0;
        p();
    }

    private static boolean a(boolean z, Lia lia, Lia lia2) {
        if (!lia.f7712f.equals(lia2.f7712f) || d(lia) != d(lia2)) {
            return false;
        }
        if (!z) {
            return lia.j == lia2.j && lia.k == lia2.k;
        }
        return true;
    }

    private final void b(MediaCodec mediaCodec, int i, long j) {
        E();
        Qma.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        Qma.a();
        this.U.f7469d++;
        this.ma = 0;
        p();
    }

    private final boolean b(boolean z) {
        if (Tma.f8821a < 23 || this.xa) {
            return false;
        }
        return !z || Wma.a(this.W);
    }

    private static int c(Lia lia) {
        int i = lia.f7713g;
        return i != -1 ? i : a(lia.f7712f, lia.j, lia.k);
    }

    private static boolean c(long j) {
        return j < -30000;
    }

    private static int d(Lia lia) {
        int i = lia.m;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void r() {
        this.ja = -9223372036854775807L;
    }

    private final void s() {
        MediaCodec m;
        this.ia = false;
        if (Tma.f8821a >= 23 && this.xa && (m = m()) != null) {
            this.za = new C1676fna(this, m);
        }
    }

    /* access modifiers changed from: protected */
    public final int a(Vka vka, Lia lia) {
        boolean z;
        int i;
        int i2;
        String str = lia.f7712f;
        int i3 = 0;
        if (!Jma.b(str)) {
            return 0;
        }
        Lja lja = lia.i;
        if (lja != null) {
            z = false;
            for (int i4 = 0; i4 < lja.f7717c; i4++) {
                z |= lja.a(i4).f7722e;
            }
        } else {
            z = false;
        }
        Qka a2 = vka.a(str, z);
        if (a2 == null) {
            return 1;
        }
        boolean b2 = a2.b(lia.f7709c);
        if (b2 && (i = lia.j) > 0 && (i2 = lia.k) > 0) {
            if (Tma.f8821a >= 21) {
                b2 = a2.a(i, i2, (double) lia.l);
            } else {
                b2 = i * i2 <= Xka.b();
                if (!b2) {
                    int i5 = lia.j;
                    int i6 = lia.k;
                    String str2 = Tma.f8825e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i7 = a2.f8377b ? 8 : 4;
        if (a2.f8378c) {
            i3 = 16;
        }
        return (b2 ? 3 : 2) | i7 | i3;
    }

    public final void a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.ga;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    Qka n = n();
                    if (n != null && b(n.f8379d)) {
                        this.ga = Wma.a(this.W, n.f8379d);
                        surface = this.ga;
                    }
                }
            }
            if (this.fa != surface) {
                this.fa = surface;
                int state = getState();
                if (state == 1 || state == 2) {
                    MediaCodec m = m();
                    if (Tma.f8821a < 23 || m == null || surface == null) {
                        o();
                        l();
                    } else {
                        m.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.ga) {
                    D();
                    s();
                    return;
                }
                F();
                s();
                if (state == 2) {
                    r();
                }
            } else if (surface != null && surface != this.ga) {
                F();
                if (this.ia) {
                    this.Y.a(this.fa);
                }
            }
        } else if (i == 4) {
            this.ha = ((Integer) obj).intValue();
            MediaCodec m2 = m();
            if (m2 != null) {
                m2.setVideoScalingMode(this.ha);
            }
        } else {
            super.a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(long j, boolean z) {
        super.a(j, z);
        s();
        this.ma = 0;
        int i = this.Ba;
        if (i != 0) {
            this.Aa = this.ca[i - 1];
            this.Ba = 0;
        }
        if (z) {
            r();
        } else {
            this.ja = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.pa = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.qa = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.sa = this.oa;
        if (Tma.f8821a >= 21) {
            int i = this.na;
            if (i == 90 || i == 270) {
                int i2 = this.pa;
                this.pa = this.qa;
                this.qa = i2;
                this.sa = 1.0f / this.sa;
            }
        } else {
            this.ra = this.na;
        }
        mediaCodec.setVideoScalingMode(this.ha);
    }

    /* access modifiers changed from: protected */
    public final void a(Ija ija) {
        if (Tma.f8821a < 23 && this.xa) {
            p();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Qka qka, MediaCodec mediaCodec, Lia lia, MediaCrypto mediaCrypto) {
        C1464cna cna;
        int i;
        Point point;
        float f2;
        Qka qka2 = qka;
        MediaCodec mediaCodec2 = mediaCodec;
        Lia lia2 = lia;
        Lia[] liaArr = this.da;
        int i2 = lia2.j;
        int i3 = lia2.k;
        int c2 = c(lia);
        if (liaArr.length == 1) {
            cna = new C1464cna(i2, i3, c2);
        } else {
            int i4 = i3;
            int i5 = c2;
            boolean z = false;
            int i6 = i2;
            for (Lia lia3 : liaArr) {
                if (a(qka2.f8377b, lia2, lia3)) {
                    z |= lia3.j == -1 || lia3.k == -1;
                    i6 = Math.max(i6, lia3.j);
                    int max = Math.max(i4, lia3.k);
                    i5 = Math.max(i5, c(lia3));
                    i4 = max;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i6);
                sb.append("x");
                sb.append(i4);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = lia2.k > lia2.j;
                int i7 = z2 ? lia2.k : lia2.j;
                int i8 = z2 ? lia2.j : lia2.k;
                float f3 = ((float) i8) / ((float) i7);
                int[] iArr = V;
                int length = iArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    int i10 = length;
                    int i11 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i12 = (int) (((float) i11) * f3);
                    if (i11 <= i7 || i12 <= i8) {
                        break;
                    }
                    int i13 = i7;
                    int i14 = i8;
                    if (Tma.f8821a >= 21) {
                        int i15 = z2 ? i12 : i11;
                        if (z2) {
                            i12 = i11;
                        }
                        Point a2 = qka2.a(i15, i12);
                        i = i5;
                        f2 = f3;
                        if (qka2.a(a2.x, a2.y, (double) lia2.l)) {
                            point = a2;
                            break;
                        }
                    } else {
                        i = i5;
                        f2 = f3;
                        int a3 = Tma.a(i11, 16) << 4;
                        int a4 = Tma.a(i12, 16) << 4;
                        if (a3 * a4 <= Xka.b()) {
                            int i16 = z2 ? a4 : a3;
                            if (z2) {
                                a4 = a3;
                            }
                            point = new Point(i16, a4);
                        }
                    }
                    i9++;
                    length = i10;
                    iArr = iArr2;
                    i7 = i13;
                    i8 = i14;
                    i5 = i;
                    f3 = f2;
                }
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i4 = Math.max(i4, point.y);
                    i5 = Math.max(i, a(lia2.f7712f, i6, i4));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i6);
                    sb2.append("x");
                    sb2.append(i4);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                } else {
                    i5 = i;
                }
            }
            cna = new C1464cna(i6, i4, i5);
        }
        this.ea = cna;
        C1464cna cna2 = this.ea;
        boolean z3 = this.ba;
        int i17 = this.ya;
        MediaFormat b2 = lia.b();
        b2.setInteger("max-width", cna2.f10083a);
        b2.setInteger("max-height", cna2.f10084b);
        int i18 = cna2.f10085c;
        if (i18 != -1) {
            b2.setInteger("max-input-size", i18);
        }
        if (z3) {
            b2.setInteger("auto-frc", 0);
        }
        if (i17 != 0) {
            b2.setFeatureEnabled("tunneled-playback", true);
            b2.setInteger("audio-session-id", i17);
        }
        if (this.fa == null) {
            Cma.b(b(qka2.f8379d));
            if (this.ga == null) {
                this.ga = Wma.a(this.W, qka2.f8379d);
            }
            this.fa = this.ga;
        }
        mediaCodec2.configure(b2, this.fa, (MediaCrypto) null, 0);
        if (Tma.f8821a >= 23 && this.xa) {
            this.za = new C1676fna(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, long j, long j2) {
        this.Y.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        this.ya = i().f9272b;
        this.xa = this.ya != 0;
        this.Y.a(this.U);
        this.X.b();
    }

    /* access modifiers changed from: protected */
    public final void a(Lia[] liaArr, long j) {
        this.da = liaArr;
        if (this.Aa == -9223372036854775807L) {
            this.Aa = j;
        } else {
            int i = this.Ba;
            long[] jArr = this.ca;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.Ba = i + 1;
            }
            this.ca[this.Ba - 1] = j;
        }
        super.a(liaArr, j);
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.Ba;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.ca;
            if (j4 < jArr[0]) {
                break;
            }
            this.Aa = jArr[0];
            this.Ba = i4 - 1;
            System.arraycopy(jArr, 1, jArr, 0, this.Ba);
        }
        long j5 = j4 - this.Aa;
        if (z) {
            a(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.fa == this.ga) {
            if (!c(j6)) {
                return false;
            }
            a(mediaCodec2, i3, j5);
            return true;
        } else if (!this.ia) {
            if (Tma.f8821a >= 21) {
                a(mediaCodec, i, j5, System.nanoTime());
            } else {
                b(mediaCodec2, i3, j5);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long a2 = this.X.a(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (a2 - nanoTime) / 1000;
            if (c(j7)) {
                Qma.a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                Qma.a();
                Jja jja = this.U;
                jja.f7471f++;
                this.la++;
                this.ma++;
                jja.f7472g = Math.max(this.ma, jja.f7472g);
                if (this.la == this.aa) {
                    G();
                }
                return true;
            }
            if (Tma.f8821a >= 21) {
                if (j7 < 50000) {
                    a(mediaCodec, i, j5, a2);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                b(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(MediaCodec mediaCodec, boolean z, Lia lia, Lia lia2) {
        if (!a(z, lia, lia2)) {
            return false;
        }
        int i = lia2.j;
        C1464cna cna = this.ea;
        return i <= cna.f10083a && lia2.k <= cna.f10084b && lia2.f7713g <= cna.f10085c;
    }

    /* access modifiers changed from: protected */
    public final boolean a(Qka qka) {
        return this.fa != null || b(qka.f8379d);
    }

    /* access modifiers changed from: protected */
    public final void b(Lia lia) {
        super.b(lia);
        this.Y.a(lia);
        float f2 = lia.n;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.oa = f2;
        this.na = d(lia);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        super.f();
        this.la = 0;
        this.ka = SystemClock.elapsedRealtime();
        this.ja = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void g() {
        G();
        super.g();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.pa = -1;
        this.qa = -1;
        this.sa = -1.0f;
        this.oa = -1.0f;
        this.Aa = -9223372036854775807L;
        this.Ba = 0;
        D();
        s();
        this.X.a();
        this.za = null;
        this.xa = false;
        try {
            super.h();
        } finally {
            this.U.a();
            this.Y.b(this.U);
        }
    }

    /* access modifiers changed from: protected */
    public final void o() {
        try {
            super.o();
        } finally {
            Surface surface = this.ga;
            if (surface != null) {
                if (this.fa == surface) {
                    this.fa = null;
                }
                this.ga.release();
                this.ga = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        if (!this.ia) {
            this.ia = true;
            this.Y.a(this.fa);
        }
    }

    public final boolean t() {
        Surface surface;
        if (super.t() && (this.ia || (((surface = this.ga) != null && this.fa == surface) || m() == null))) {
            this.ja = -9223372036854775807L;
            return true;
        } else if (this.ja == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.ja) {
                return true;
            }
            this.ja = -9223372036854775807L;
            return false;
        }
    }
}
