package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public abstract class Tka extends C3013yia {
    private static final byte[] i = Tma.d("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private ByteBuffer[] F;
    private ByteBuffer[] G;
    private long H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    protected Jja U;
    private final Vka j;
    private final Qja<Sja> k;
    private final boolean l;
    private final Ija m;
    private final Ija n;
    private final Nia o;
    private final List<Long> p;
    private final MediaCodec.BufferInfo q;
    private Lia r;
    private Oja<Sja> s;
    private Oja<Sja> t;
    private MediaCodec u;
    private Qka v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public Tka(int i2, Vka vka, Qja<Sja> qja, boolean z2) {
        super(i2);
        Cma.b(Tma.f8821a >= 16);
        Cma.a(vka);
        this.j = vka;
        this.k = null;
        this.l = z2;
        this.m = new Ija(0);
        this.n = new Ija(0);
        this.o = new Nia();
        this.p = new ArrayList();
        this.q = new MediaCodec.BufferInfo();
        this.M = 0;
        this.N = 0;
    }

    private final void a(Ska ska) {
        throw Aia.a(ska, e());
    }

    private final boolean b(long j2, long j3) {
        boolean z2;
        boolean z3;
        if (this.J < 0) {
            if (!this.B || !this.P) {
                this.J = this.u.dequeueOutputBuffer(this.q, 0);
            } else {
                try {
                    this.J = this.u.dequeueOutputBuffer(this.q, 0);
                } catch (IllegalStateException unused) {
                    q();
                    if (this.R) {
                        o();
                    }
                    return false;
                }
            }
            int i2 = this.J;
            if (i2 >= 0) {
                if (this.E) {
                    this.E = false;
                    this.u.releaseOutputBuffer(i2, false);
                    this.J = -1;
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.q;
                if ((bufferInfo.flags & 4) != 0) {
                    q();
                    this.J = -1;
                    return false;
                }
                ByteBuffer byteBuffer = this.G[i2];
                if (byteBuffer != null) {
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.q;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                long j4 = this.q.presentationTimeUs;
                int size = this.p.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z3 = false;
                        break;
                    } else if (this.p.get(i3).longValue() == j4) {
                        this.p.remove(i3);
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                this.K = z3;
            } else if (i2 == -2) {
                MediaFormat outputFormat = this.u.getOutputFormat();
                if (this.y && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.E = true;
                } else {
                    if (this.C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    a(this.u, outputFormat);
                }
                return true;
            } else if (i2 == -3) {
                this.G = this.u.getOutputBuffers();
                return true;
            } else {
                if (this.z && (this.Q || this.N == 2)) {
                    q();
                }
                return false;
            }
        }
        if (!this.B || !this.P) {
            MediaCodec mediaCodec = this.u;
            ByteBuffer[] byteBufferArr = this.G;
            int i4 = this.J;
            ByteBuffer byteBuffer2 = byteBufferArr[i4];
            MediaCodec.BufferInfo bufferInfo3 = this.q;
            z2 = a(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.K);
        } else {
            try {
                z2 = a(j2, j3, this.u, this.G[this.J], this.J, this.q.flags, this.q.presentationTimeUs, this.K);
            } catch (IllegalStateException unused2) {
                q();
                if (this.R) {
                    o();
                }
                return false;
            }
        }
        if (!z2) {
            return false;
        }
        long j5 = this.q.presentationTimeUs;
        this.J = -1;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p() {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.u
            r1 = 0
            if (r0 == 0) goto L_0x01d6
            int r2 = r14.N
            r3 = 2
            if (r2 == r3) goto L_0x01d6
            boolean r2 = r14.Q
            if (r2 == 0) goto L_0x0010
            goto L_0x01d6
        L_0x0010:
            int r2 = r14.I
            if (r2 >= 0) goto L_0x002c
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.I = r0
            int r0 = r14.I
            if (r0 >= 0) goto L_0x0021
            return r1
        L_0x0021:
            com.google.android.gms.internal.ads.Ija r2 = r14.m
            java.nio.ByteBuffer[] r4 = r14.F
            r0 = r4[r0]
            r2.f7322c = r0
            r2.a()
        L_0x002c:
            int r0 = r14.N
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0049
            boolean r0 = r14.z
            if (r0 != 0) goto L_0x0046
            r14.P = r4
            android.media.MediaCodec r5 = r14.u
            int r6 = r14.I
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.I = r2
        L_0x0046:
            r14.N = r3
            return r1
        L_0x0049:
            boolean r0 = r14.D
            if (r0 == 0) goto L_0x006b
            r14.D = r1
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            java.nio.ByteBuffer r0 = r0.f7322c
            byte[] r1 = i
            r0.put(r1)
            android.media.MediaCodec r5 = r14.u
            int r6 = r14.I
            r7 = 0
            byte[] r0 = i
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.I = r2
            r14.O = r4
            return r4
        L_0x006b:
            boolean r0 = r14.S
            if (r0 == 0) goto L_0x0072
            r0 = -4
            r5 = 0
            goto L_0x00aa
        L_0x0072:
            int r0 = r14.M
            if (r0 != r4) goto L_0x0097
            r0 = 0
        L_0x0077:
            com.google.android.gms.internal.ads.Lia r5 = r14.r
            java.util.List<byte[]> r5 = r5.f7714h
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0095
            com.google.android.gms.internal.ads.Lia r5 = r14.r
            java.util.List<byte[]> r5 = r5.f7714h
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.Ija r6 = r14.m
            java.nio.ByteBuffer r6 = r6.f7322c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0095:
            r14.M = r3
        L_0x0097:
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            java.nio.ByteBuffer r0 = r0.f7322c
            int r0 = r0.position()
            com.google.android.gms.internal.ads.Nia r5 = r14.o
            com.google.android.gms.internal.ads.Ija r6 = r14.m
            int r5 = r14.a((com.google.android.gms.internal.ads.Nia) r5, (com.google.android.gms.internal.ads.Ija) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00aa:
            r6 = -3
            if (r0 != r6) goto L_0x00ae
            return r1
        L_0x00ae:
            r6 = -5
            if (r0 != r6) goto L_0x00c4
            int r0 = r14.M
            if (r0 != r3) goto L_0x00bc
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            r0.a()
            r14.M = r4
        L_0x00bc:
            com.google.android.gms.internal.ads.Nia r0 = r14.o
            com.google.android.gms.internal.ads.Lia r0 = r0.f7998a
            r14.b(r0)
            return r4
        L_0x00c4:
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0100
            int r0 = r14.M
            if (r0 != r3) goto L_0x00d7
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            r0.a()
            r14.M = r4
        L_0x00d7:
            r14.Q = r4
            boolean r0 = r14.O
            if (r0 != 0) goto L_0x00e1
            r14.q()
            return r1
        L_0x00e1:
            boolean r0 = r14.z     // Catch:{ CryptoException -> 0x00f6 }
            if (r0 != 0) goto L_0x00f5
            r14.P = r4     // Catch:{ CryptoException -> 0x00f6 }
            android.media.MediaCodec r5 = r14.u     // Catch:{ CryptoException -> 0x00f6 }
            int r6 = r14.I     // Catch:{ CryptoException -> 0x00f6 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f6 }
            r14.I = r2     // Catch:{ CryptoException -> 0x00f6 }
        L_0x00f5:
            return r1
        L_0x00f6:
            r0 = move-exception
            int r1 = r14.e()
            com.google.android.gms.internal.ads.Aia r0 = com.google.android.gms.internal.ads.Aia.a(r0, r1)
            throw r0
        L_0x0100:
            boolean r0 = r14.T
            if (r0 == 0) goto L_0x0118
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0118
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            r0.a()
            int r0 = r14.M
            if (r0 != r3) goto L_0x0117
            r14.M = r4
        L_0x0117:
            return r4
        L_0x0118:
            r14.T = r1
            com.google.android.gms.internal.ads.Ija r0 = r14.m
            boolean r0 = r0.e()
            com.google.android.gms.internal.ads.Oja<com.google.android.gms.internal.ads.Sja> r3 = r14.s
            if (r3 == 0) goto L_0x0144
            int r3 = r3.getState()
            if (r3 == 0) goto L_0x0135
            r6 = 4
            if (r3 == r6) goto L_0x0144
            if (r0 != 0) goto L_0x0133
            boolean r3 = r14.l
            if (r3 != 0) goto L_0x0144
        L_0x0133:
            r3 = 1
            goto L_0x0145
        L_0x0135:
            com.google.android.gms.internal.ads.Oja<com.google.android.gms.internal.ads.Sja> r0 = r14.s
            com.google.android.gms.internal.ads.Nja r0 = r0.b()
            int r1 = r14.e()
            com.google.android.gms.internal.ads.Aia r0 = com.google.android.gms.internal.ads.Aia.a(r0, r1)
            throw r0
        L_0x0144:
            r3 = 0
        L_0x0145:
            r14.S = r3
            boolean r3 = r14.S
            if (r3 == 0) goto L_0x014c
            return r1
        L_0x014c:
            boolean r3 = r14.w
            if (r3 == 0) goto L_0x0166
            if (r0 != 0) goto L_0x0166
            com.google.android.gms.internal.ads.Ija r3 = r14.m
            java.nio.ByteBuffer r3 = r3.f7322c
            com.google.android.gms.internal.ads.Ima.a(r3)
            com.google.android.gms.internal.ads.Ija r3 = r14.m
            java.nio.ByteBuffer r3 = r3.f7322c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0164
            return r4
        L_0x0164:
            r14.w = r1
        L_0x0166:
            com.google.android.gms.internal.ads.Ija r3 = r14.m     // Catch:{ CryptoException -> 0x01cc }
            long r10 = r3.f7323d     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.Ija r3 = r14.m     // Catch:{ CryptoException -> 0x01cc }
            boolean r3 = r3.b()     // Catch:{ CryptoException -> 0x01cc }
            if (r3 == 0) goto L_0x017b
            java.util.List<java.lang.Long> r3 = r14.p     // Catch:{ CryptoException -> 0x01cc }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01cc }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01cc }
        L_0x017b:
            com.google.android.gms.internal.ads.Ija r3 = r14.m     // Catch:{ CryptoException -> 0x01cc }
            java.nio.ByteBuffer r3 = r3.f7322c     // Catch:{ CryptoException -> 0x01cc }
            r3.flip()     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.Ija r3 = r14.m     // Catch:{ CryptoException -> 0x01cc }
            r14.a((com.google.android.gms.internal.ads.Ija) r3)     // Catch:{ CryptoException -> 0x01cc }
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.Ija r0 = r14.m     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.Eja r0 = r0.f7321b     // Catch:{ CryptoException -> 0x01cc }
            android.media.MediaCodec$CryptoInfo r9 = r0.a()     // Catch:{ CryptoException -> 0x01cc }
            if (r5 != 0) goto L_0x0194
            goto L_0x01a3
        L_0x0194:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01cc }
            if (r0 != 0) goto L_0x019c
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01cc }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01cc }
        L_0x019c:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01cc }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01cc }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01cc }
        L_0x01a3:
            android.media.MediaCodec r6 = r14.u     // Catch:{ CryptoException -> 0x01cc }
            int r7 = r14.I     // Catch:{ CryptoException -> 0x01cc }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01cc }
            goto L_0x01be
        L_0x01ad:
            android.media.MediaCodec r6 = r14.u     // Catch:{ CryptoException -> 0x01cc }
            int r7 = r14.I     // Catch:{ CryptoException -> 0x01cc }
            r8 = 0
            com.google.android.gms.internal.ads.Ija r0 = r14.m     // Catch:{ CryptoException -> 0x01cc }
            java.nio.ByteBuffer r0 = r0.f7322c     // Catch:{ CryptoException -> 0x01cc }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01cc }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01cc }
        L_0x01be:
            r14.I = r2     // Catch:{ CryptoException -> 0x01cc }
            r14.O = r4     // Catch:{ CryptoException -> 0x01cc }
            r14.M = r1     // Catch:{ CryptoException -> 0x01cc }
            com.google.android.gms.internal.ads.Jja r0 = r14.U     // Catch:{ CryptoException -> 0x01cc }
            int r1 = r0.f7468c     // Catch:{ CryptoException -> 0x01cc }
            int r1 = r1 + r4
            r0.f7468c = r1     // Catch:{ CryptoException -> 0x01cc }
            return r4
        L_0x01cc:
            r0 = move-exception
            int r1 = r14.e()
            com.google.android.gms.internal.ads.Aia r0 = com.google.android.gms.internal.ads.Aia.a(r0, r1)
            throw r0
        L_0x01d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Tka.p():boolean");
    }

    private final void q() {
        if (this.N == 2) {
            o();
            l();
            return;
        }
        this.R = true;
        k();
    }

    public final int a(Lia lia) {
        try {
            return a(this.j, lia);
        } catch (Zka e2) {
            throw Aia.a(e2, e());
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(Vka vka, Lia lia);

    /* access modifiers changed from: protected */
    public Qka a(Vka vka, Lia lia, boolean z2) {
        return vka.a(lia.f7712f, z2);
    }

    public final void a(long j2, long j3) {
        if (this.R) {
            k();
            return;
        }
        if (this.r == null) {
            this.n.a();
            int a2 = a(this.o, this.n, true);
            if (a2 == -5) {
                b(this.o.f7998a);
            } else if (a2 == -4) {
                Cma.b(this.n.c());
                this.Q = true;
                q();
                return;
            } else {
                return;
            }
        }
        l();
        if (this.u != null) {
            Qma.a("drainAndFeed");
            do {
            } while (b(j2, j3));
            do {
            } while (p());
            Qma.a();
        } else {
            b(j2);
            this.n.a();
            int a3 = a(this.o, this.n, false);
            if (a3 == -5) {
                b(this.o.f7998a);
            } else if (a3 == -4) {
                Cma.b(this.n.c());
                this.Q = true;
                q();
            }
        }
        this.U.a();
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z2) {
        this.Q = false;
        this.R = false;
        if (this.u != null) {
            this.H = -9223372036854775807L;
            this.I = -1;
            this.J = -1;
            this.T = true;
            this.S = false;
            this.K = false;
            this.p.clear();
            this.D = false;
            this.E = false;
            if (this.x || ((this.A && this.P) || this.N != 0)) {
                o();
                l();
            } else {
                this.u.flush();
                this.O = false;
            }
            if (this.L && this.r != null) {
                this.M = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void a(Ija ija) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Qka qka, MediaCodec mediaCodec, Lia lia, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    public abstract void a(String str, long j2, long j3);

    /* access modifiers changed from: protected */
    public void a(boolean z2) {
        this.U = new Jja();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2);

    /* access modifiers changed from: protected */
    public boolean a(MediaCodec mediaCodec, boolean z2, Lia lia, Lia lia2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(Qka qka) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r5.k == r0.k) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.gms.internal.ads.Lia r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.Lia r0 = r4.r
            r4.r = r5
            com.google.android.gms.internal.ads.Lia r5 = r4.r
            com.google.android.gms.internal.ads.Lja r5 = r5.i
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r2 = r1
            goto L_0x000f
        L_0x000d:
            com.google.android.gms.internal.ads.Lja r2 = r0.i
        L_0x000f:
            boolean r5 = com.google.android.gms.internal.ads.Tma.a((java.lang.Object) r5, (java.lang.Object) r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Lia r5 = r4.r
            com.google.android.gms.internal.ads.Lja r5 = r5.i
            if (r5 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.Qja<com.google.android.gms.internal.ads.Sja> r5 = r4.k
            if (r5 == 0) goto L_0x003b
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.Lia r3 = r4.r
            com.google.android.gms.internal.ads.Lja r3 = r3.i
            com.google.android.gms.internal.ads.Oja r5 = r5.a(r1, r3)
            r4.t = r5
            com.google.android.gms.internal.ads.Oja<com.google.android.gms.internal.ads.Sja> r5 = r4.t
            com.google.android.gms.internal.ads.Oja<com.google.android.gms.internal.ads.Sja> r1 = r4.s
            if (r5 != r1) goto L_0x004d
            com.google.android.gms.internal.ads.Qja<com.google.android.gms.internal.ads.Sja> r1 = r4.k
            r1.a(r5)
            goto L_0x004d
        L_0x003b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.e()
            com.google.android.gms.internal.ads.Aia r5 = com.google.android.gms.internal.ads.Aia.a(r5, r0)
            throw r5
        L_0x004b:
            r4.t = r1
        L_0x004d:
            com.google.android.gms.internal.ads.Oja<com.google.android.gms.internal.ads.Sja> r5 = r4.t
            com.google.android.gms.internal.ads.Oja<com.google.android.gms.internal.ads.Sja> r1 = r4.s
            if (r5 != r1) goto L_0x007e
            android.media.MediaCodec r5 = r4.u
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.Qka r1 = r4.v
            boolean r1 = r1.f8377b
            com.google.android.gms.internal.ads.Lia r3 = r4.r
            boolean r5 = r4.a((android.media.MediaCodec) r5, (boolean) r1, (com.google.android.gms.internal.ads.Lia) r0, (com.google.android.gms.internal.ads.Lia) r3)
            if (r5 == 0) goto L_0x007e
            r4.L = r2
            r4.M = r2
            boolean r5 = r4.y
            if (r5 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.Lia r5 = r4.r
            int r1 = r5.j
            int r3 = r0.j
            if (r1 != r3) goto L_0x007a
            int r5 = r5.k
            int r0 = r0.k
            if (r5 != r0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            r4.D = r2
            return
        L_0x007e:
            boolean r5 = r4.O
            if (r5 == 0) goto L_0x0085
            r4.N = r2
            return
        L_0x0085:
            r4.o()
            r4.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Tka.b(com.google.android.gms.internal.ads.Lia):void");
    }

    public final int d() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.r = null;
        try {
            o();
            try {
                if (this.s != null) {
                    this.k.a(this.s);
                }
                try {
                    if (!(this.t == null || this.t == this.s)) {
                        this.k.a(this.t);
                    }
                } finally {
                    this.s = null;
                    this.t = null;
                }
            } catch (Throwable th) {
                if (!(this.t == null || this.t == this.s)) {
                    this.k.a(this.t);
                }
                throw th;
            } finally {
                this.s = null;
                this.t = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.t == null || this.t == this.s)) {
                    this.k.a(this.t);
                }
                throw th2;
            } finally {
                this.s = null;
                this.t = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public final void l() {
        Lia lia;
        if (this.u == null && (lia = this.r) != null) {
            this.s = this.t;
            String str = lia.f7712f;
            Oja<Sja> oja = this.s;
            if (oja != null) {
                int state = oja.getState();
                if (state == 0) {
                    throw Aia.a(this.s.b(), e());
                } else if (state == 3 || state == 4) {
                    Sja a2 = this.s.a();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.v == null) {
                    try {
                        this.v = a(this.j, lia, false);
                        Qka qka = this.v;
                        if (this.v == null) {
                            a(new Ska(this.r, (Throwable) null, false, -49999));
                            throw null;
                        }
                    } catch (Zka e2) {
                        a(new Ska(this.r, (Throwable) e2, false, -49998));
                        throw null;
                    }
                }
                if (a(this.v)) {
                    String str2 = this.v.f8376a;
                    this.w = Tma.f8821a < 21 && this.r.f7714h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    int i2 = Tma.f8821a;
                    this.x = i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (Tma.f8821a == 19 && Tma.f8824d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.y = Tma.f8821a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(Tma.f8822b) || "flounder_lte".equals(Tma.f8822b) || "grouper".equals(Tma.f8822b) || "tilapia".equals(Tma.f8822b));
                    this.z = Tma.f8821a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.A = (Tma.f8821a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (Tma.f8821a <= 19 && "hb2000".equals(Tma.f8822b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.B = Tma.f8821a == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.C = Tma.f8821a <= 18 && this.r.r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        Qma.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.u = MediaCodec.createByCodecName(str2);
                        Qma.a();
                        Qma.a("configureCodec");
                        a(this.v, this.u, this.r, (MediaCrypto) null);
                        Qma.a();
                        Qma.a("startCodec");
                        this.u.start();
                        Qma.a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.F = this.u.getInputBuffers();
                        this.G = this.u.getOutputBuffers();
                        this.H = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        this.I = -1;
                        this.J = -1;
                        this.T = true;
                        this.U.f7466a++;
                    } catch (Exception e3) {
                        a(new Ska(this.r, (Throwable) e3, false, str2));
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final MediaCodec m() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public final Qka n() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void o() {
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1;
        this.S = false;
        this.K = false;
        this.p.clear();
        this.F = null;
        this.G = null;
        this.v = null;
        this.L = false;
        this.O = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.P = false;
        this.M = 0;
        this.N = 0;
        this.m.f7322c = null;
        MediaCodec mediaCodec = this.u;
        if (mediaCodec != null) {
            this.U.f7467b++;
            try {
                mediaCodec.stop();
                try {
                    this.u.release();
                    this.u = null;
                    Oja<Sja> oja = this.s;
                    if (oja != null && this.t != oja) {
                        try {
                            this.k.a(oja);
                        } finally {
                            this.s = null;
                        }
                    }
                } catch (Throwable th) {
                    this.u = null;
                    Oja<Sja> oja2 = this.s;
                    if (!(oja2 == null || this.t == oja2)) {
                        this.k.a(oja2);
                    }
                    throw th;
                } finally {
                    this.s = null;
                }
            } catch (Throwable th2) {
                this.u = null;
                Oja<Sja> oja3 = this.s;
                if (!(oja3 == null || this.t == oja3)) {
                    try {
                        this.k.a(oja3);
                    } finally {
                        this.s = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    public boolean t() {
        if (this.r == null || this.S) {
            return false;
        }
        if (j() || this.J >= 0) {
            return true;
        }
        return this.H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.H;
    }

    public boolean u() {
        return this.R;
    }
}
