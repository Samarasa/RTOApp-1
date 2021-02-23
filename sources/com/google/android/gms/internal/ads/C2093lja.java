package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.lja  reason: case insensitive filesystem */
public final class C2093lja {
    private long A;
    private long B;
    private boolean C;
    private long D;
    private Method E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private long O;
    private long P;
    private float Q;
    private C1385bja[] R;
    private ByteBuffer[] S;
    private ByteBuffer T;
    private ByteBuffer U;
    private byte[] V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final C1456cja f11224a = null;
    private int aa;

    /* renamed from: b  reason: collision with root package name */
    private final C2944xja f11225b;
    private boolean ba;

    /* renamed from: c  reason: collision with root package name */
    private final Cja f11226c;
    private boolean ca;

    /* renamed from: d  reason: collision with root package name */
    private final C1385bja[] f11227d;
    private long da;

    /* renamed from: e  reason: collision with root package name */
    private final C2518rja f11228e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ConditionVariable f11229f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f11230g;

    /* renamed from: h  reason: collision with root package name */
    private final C2235nja f11231h;
    private final LinkedList<C2731uja> i;
    private AudioTrack j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private Ria s;
    private Ria t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;

    public C2093lja(C1456cja cja, C1385bja[] bjaArr, C2518rja rja) {
        this.f11228e = rja;
        this.f11229f = new ConditionVariable(true);
        if (Tma.f8821a >= 18) {
            try {
                this.E = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (Tma.f8821a >= 19) {
            this.f11231h = new C2448qja();
        } else {
            this.f11231h = new C2235nja((C2306oja) null);
        }
        this.f11225b = new C2944xja();
        this.f11226c = new Cja();
        this.f11227d = new C1385bja[(bjaArr.length + 3)];
        this.f11227d[0] = new Aja();
        C1385bja[] bjaArr2 = this.f11227d;
        bjaArr2[1] = this.f11225b;
        System.arraycopy(bjaArr, 0, bjaArr2, 2, bjaArr.length);
        this.f11227d[bjaArr.length + 2] = this.f11226c;
        this.f11230g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.o = 3;
        this.aa = 0;
        this.t = Ria.f8504a;
        this.X = -1;
        this.R = new C1385bja[0];
        this.S = new ByteBuffer[0];
        this.i = new LinkedList<>();
    }

    private final void a(long j2) {
        ByteBuffer byteBuffer;
        int length = this.R.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.S[i2 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = C1385bja.f9951a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j2);
            } else {
                C1385bja bja = this.R[i2];
                bja.a(byteBuffer);
                ByteBuffer b2 = bja.b();
                this.S[i2] = b2;
                if (b2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    private final long b(long j2) {
        return (j2 * 1000000) / ((long) this.k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.nio.ByteBuffer r9, long r10) {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.U
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.android.gms.internal.ads.Cma.a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r8.U = r9
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.V
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.V = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.V
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.W = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.Tma.f8821a
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.J
            com.google.android.gms.internal.ads.nja r2 = r8.f11231h
            long r4 = r2.b()
            int r2 = r8.I
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.q
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.j
            byte[] r2 = r8.V
            int r4 = r8.W
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f2
            int r11 = r8.W
            int r11 = r11 + r10
            r8.W = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f2
        L_0x0076:
            r10 = 0
            goto L_0x00f2
        L_0x0079:
            boolean r2 = r8.ba
            if (r2 == 0) goto L_0x00ec
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            com.google.android.gms.internal.ads.Cma.b(r2)
            android.media.AudioTrack r2 = r8.j
            java.nio.ByteBuffer r4 = r8.w
            if (r4 != 0) goto L_0x00a9
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.w = r4
            java.nio.ByteBuffer r4 = r8.w
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.w
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a9:
            int r4 = r8.x
            if (r4 != 0) goto L_0x00c5
            java.nio.ByteBuffer r4 = r8.w
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.w
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.w
            r10.position(r3)
            r8.x = r0
        L_0x00c5:
            java.nio.ByteBuffer r10 = r8.w
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00dc
            java.nio.ByteBuffer r11 = r8.w
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d9
            r8.x = r3
            r10 = r11
            goto L_0x00f2
        L_0x00d9:
            if (r11 >= r10) goto L_0x00dc
            goto L_0x0076
        L_0x00dc:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e5
            r8.x = r3
            goto L_0x00ea
        L_0x00e5:
            int r10 = r8.x
            int r10 = r10 - r9
            r8.x = r10
        L_0x00ea:
            r10 = r9
            goto L_0x00f2
        L_0x00ec:
            android.media.AudioTrack r10 = r8.j
            int r10 = r10.write(r9, r0, r1)
        L_0x00f2:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.da = r4
            if (r10 < 0) goto L_0x0117
            boolean r9 = r8.p
            if (r9 != 0) goto L_0x0104
            long r4 = r8.J
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.J = r4
        L_0x0104:
            if (r10 != r0) goto L_0x0116
            boolean r9 = r8.p
            if (r9 == 0) goto L_0x0112
            long r9 = r8.K
            int r11 = r8.L
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.K = r9
        L_0x0112:
            r9 = 0
            r8.U = r9
            return r1
        L_0x0116:
            return r3
        L_0x0117:
            com.google.android.gms.internal.ads.tja r9 = new com.google.android.gms.internal.ads.tja
            r9.<init>(r10)
            goto L_0x011e
        L_0x011d:
            throw r9
        L_0x011e:
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2093lja.b(java.nio.ByteBuffer, long):boolean");
    }

    private final long c(long j2) {
        return (j2 * ((long) this.k)) / 1000000;
    }

    private final boolean k() {
        return this.j != null;
    }

    private final void l() {
        ArrayList arrayList = new ArrayList();
        for (C1385bja bja : this.f11227d) {
            if (bja.d()) {
                arrayList.add(bja);
            } else {
                bja.flush();
            }
        }
        int size = arrayList.size();
        this.R = (C1385bja[]) arrayList.toArray(new C1385bja[size]);
        this.S = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            C1385bja bja2 = this.R[i2];
            bja2.flush();
            this.S[i2] = bja2.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m() {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.p
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bja[] r0 = r9.R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.X = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.X
            com.google.android.gms.internal.ads.bja[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0036
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.a()
        L_0x0028:
            r9.a((long) r7)
            boolean r0 = r4.u()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.X
            int r0 = r0 + r2
            goto L_0x0010
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0042
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L_0x0042
            return r3
        L_0x0042:
            r9.X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2093lja.m():boolean");
    }

    private final void n() {
        if (!k()) {
            return;
        }
        if (Tma.f8821a >= 21) {
            this.j.setVolume(this.Q);
            return;
        }
        AudioTrack audioTrack = this.j;
        float f2 = this.Q;
        audioTrack.setStereoVolume(f2, f2);
    }

    private final long o() {
        return this.p ? this.K : this.J / ((long) this.I);
    }

    private final void p() {
        this.A = 0;
        this.z = 0;
        this.y = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
    }

    private final boolean q() {
        if (Tma.f8821a >= 23) {
            return false;
        }
        int i2 = this.n;
        return i2 == 5 || i2 == 6;
    }

    public final long a(boolean z2) {
        long j2;
        long j3;
        long j4;
        long j5;
        StringBuilder sb;
        String str;
        if (!(k() && this.M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.j.getPlayState() == 3) {
            long c2 = this.f11231h.c();
            if (c2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.B >= 30000) {
                    long[] jArr = this.f11230g;
                    int i2 = this.y;
                    jArr[i2] = c2 - nanoTime;
                    this.y = (i2 + 1) % 10;
                    int i3 = this.z;
                    if (i3 < 10) {
                        this.z = i3 + 1;
                    }
                    this.B = nanoTime;
                    this.A = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.z;
                        if (i4 >= i5) {
                            break;
                        }
                        this.A += this.f11230g[i4] / ((long) i5);
                        i4++;
                    }
                }
                if (!q() && nanoTime - this.D >= 500000) {
                    this.C = this.f11231h.d();
                    if (this.C) {
                        long e2 = this.f11231h.e() / 1000;
                        long f2 = this.f11231h.f();
                        if (e2 >= this.O) {
                            if (Math.abs(e2 - nanoTime) > 5000000) {
                                sb = new StringBuilder(136);
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(b(f2) - c2) > 5000000) {
                                sb = new StringBuilder(138);
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(f2);
                            sb.append(", ");
                            sb.append(e2);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c2);
                            Log.w("AudioTrack", sb.toString());
                        }
                        this.C = false;
                    }
                    Method method = this.E;
                    if (method != null && !this.p) {
                        try {
                            this.P = (((long) ((Integer) method.invoke(this.j, (Object[]) null)).intValue()) * 1000) - this.r;
                            this.P = Math.max(this.P, 0);
                            if (this.P > 5000000) {
                                long j6 = this.P;
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(j6);
                                Log.w("AudioTrack", sb2.toString());
                                this.P = 0;
                            }
                        } catch (Exception unused) {
                            this.E = null;
                        }
                    }
                    this.D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.C) {
            j2 = b(this.f11231h.f() + c(nanoTime2 - (this.f11231h.e() / 1000)));
        } else {
            j2 = this.z == 0 ? this.f11231h.c() : nanoTime2 + this.A;
            if (!z2) {
                j2 -= this.P;
            }
        }
        long j7 = this.N;
        while (!this.i.isEmpty() && j2 >= this.i.getFirst().f12377c) {
            C2731uja remove = this.i.remove();
            this.t = remove.f12375a;
            this.v = remove.f12377c;
            this.u = remove.f12376b - this.N;
        }
        if (this.t.f8505b == 1.0f) {
            j3 = (j2 + this.u) - this.v;
        } else {
            if (!this.i.isEmpty() || this.f11226c.g() < 1024) {
                j4 = this.u;
                double d2 = (double) this.t.f8505b;
                double d3 = (double) (j2 - this.v);
                Double.isNaN(d2);
                Double.isNaN(d3);
                j5 = (long) (d2 * d3);
            } else {
                j4 = this.u;
                j5 = Tma.a(j2 - this.v, this.f11226c.f(), this.f11226c.g());
            }
            j3 = j5 + j4;
        }
        return j7 + j3;
    }

    public final Ria a(Ria ria) {
        if (this.p) {
            this.t = Ria.f8504a;
            return this.t;
        }
        float a2 = this.f11226c.a(ria.f8505b);
        Cja cja = this.f11226c;
        float f2 = ria.f8506c;
        cja.b(f2);
        Ria ria2 = new Ria(a2, f2);
        Ria ria3 = this.s;
        if (ria3 == null) {
            ria3 = !this.i.isEmpty() ? this.i.getLast().f12375a : this.t;
        }
        if (!ria2.equals(ria3)) {
            if (k()) {
                this.s = ria2;
            } else {
                this.t = ria2;
            }
        }
        return this.t;
    }

    public final void a() {
        this.Z = false;
        if (k()) {
            p();
            this.f11231h.a();
        }
    }

    public final void a(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            n();
        }
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (!this.ba) {
                d();
                this.aa = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x012a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r18, int r19, int r20, int r21, int r22, int[] r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            java.lang.String r3 = "audio/raw"
            boolean r3 = r3.equals(r0)
            r4 = 1
            r3 = r3 ^ r4
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 2
            if (r3 == 0) goto L_0x0058
            r11 = -1
            int r12 = r18.hashCode()
            switch(r12) {
                case -1095064472: goto L_0x003c;
                case 187078296: goto L_0x0032;
                case 1504578661: goto L_0x0028;
                case 1505942594: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0045
        L_0x001e:
            java.lang.String r12 = "audio/vnd.dts.hd"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0045
            r11 = 3
            goto L_0x0045
        L_0x0028:
            java.lang.String r12 = "audio/eac3"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0045
            r11 = 1
            goto L_0x0045
        L_0x0032:
            java.lang.String r12 = "audio/ac3"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0045
            r11 = 0
            goto L_0x0045
        L_0x003c:
            java.lang.String r12 = "audio/vnd.dts"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0045
            r11 = 2
        L_0x0045:
            if (r11 == 0) goto L_0x0056
            if (r11 == r4) goto L_0x0054
            if (r11 == r9) goto L_0x0052
            if (r11 == r8) goto L_0x004f
            r0 = 0
            goto L_0x005a
        L_0x004f:
            r0 = 8
            goto L_0x005a
        L_0x0052:
            r0 = 7
            goto L_0x005a
        L_0x0054:
            r0 = 6
            goto L_0x005a
        L_0x0056:
            r0 = 5
            goto L_0x005a
        L_0x0058:
            r0 = r21
        L_0x005a:
            if (r3 != 0) goto L_0x00a0
            r11 = r19
            r12 = r21
            int r12 = com.google.android.gms.internal.ads.Tma.b(r12, r11)
            r1.F = r12
            com.google.android.gms.internal.ads.xja r12 = r1.f11225b
            r13 = r23
            r12.a((int[]) r13)
            com.google.android.gms.internal.ads.bja[] r12 = r1.f11227d
            int r13 = r12.length
            r15 = r0
            r14 = r11
            r0 = 0
            r11 = 0
        L_0x0074:
            if (r0 >= r13) goto L_0x0098
            r10 = r12[r0]
            boolean r16 = r10.a(r2, r14, r15)     // Catch:{ eja -> 0x0090 }
            r11 = r11 | r16
            boolean r16 = r10.d()
            if (r16 == 0) goto L_0x008d
            int r14 = r10.c()
            int r10 = r10.e()
            r15 = r10
        L_0x008d:
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0090:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.pja r0 = new com.google.android.gms.internal.ads.pja
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0098:
            if (r11 == 0) goto L_0x009d
            r17.l()
        L_0x009d:
            r0 = r11
            r11 = r14
            goto L_0x00a4
        L_0x00a0:
            r11 = r19
            r15 = r0
            r0 = 0
        L_0x00a4:
            r12 = 12
            switch(r11) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00d4;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00c2;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            com.google.android.gms.internal.ads.pja r0 = new com.google.android.gms.internal.ads.pja
            r2 = 38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unsupported channel count: "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00c2:
            int r13 = com.google.android.gms.internal.ads.C2942xia.f12811a
            goto L_0x00d8
        L_0x00c5:
            r13 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00d8
        L_0x00c8:
            r13 = 252(0xfc, float:3.53E-43)
            goto L_0x00d8
        L_0x00cb:
            r13 = 220(0xdc, float:3.08E-43)
            goto L_0x00d8
        L_0x00ce:
            r13 = 204(0xcc, float:2.86E-43)
            goto L_0x00d8
        L_0x00d1:
            r13 = 28
            goto L_0x00d8
        L_0x00d4:
            r13 = 12
            goto L_0x00d8
        L_0x00d7:
            r13 = 4
        L_0x00d8:
            int r14 = com.google.android.gms.internal.ads.Tma.f8821a
            r10 = 23
            if (r14 > r10) goto L_0x00ff
            java.lang.String r10 = com.google.android.gms.internal.ads.Tma.f8822b
            java.lang.String r14 = "foster"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x00ff
            java.lang.String r10 = com.google.android.gms.internal.ads.Tma.f8823c
            java.lang.String r14 = "NVIDIA"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x00ff
            if (r11 == r8) goto L_0x00fc
            if (r11 == r7) goto L_0x00fc
            if (r11 == r5) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            int r10 = com.google.android.gms.internal.ads.C2942xia.f12811a
            goto L_0x0100
        L_0x00fc:
            r10 = 252(0xfc, float:3.53E-43)
            goto L_0x0100
        L_0x00ff:
            r10 = r13
        L_0x0100:
            int r5 = com.google.android.gms.internal.ads.Tma.f8821a
            r8 = 25
            if (r5 > r8) goto L_0x0116
            java.lang.String r5 = com.google.android.gms.internal.ads.Tma.f8822b
            java.lang.String r8 = "fugu"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0116
            if (r3 == 0) goto L_0x0116
            if (r11 != r4) goto L_0x0116
            r10 = 12
        L_0x0116:
            if (r0 != 0) goto L_0x012b
            boolean r0 = r17.k()
            if (r0 == 0) goto L_0x012b
            int r0 = r1.m
            if (r0 != r15) goto L_0x012b
            int r0 = r1.k
            if (r0 != r2) goto L_0x012b
            int r0 = r1.l
            if (r0 != r10) goto L_0x012b
            return
        L_0x012b:
            r17.d()
            r1.m = r15
            r1.p = r3
            r1.k = r2
            r1.l = r10
            if (r3 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r15 = 2
        L_0x013a:
            r1.n = r15
            int r0 = com.google.android.gms.internal.ads.Tma.b(r9, r11)
            r1.I = r0
            if (r3 == 0) goto L_0x0152
            int r0 = r1.n
            if (r0 == r7) goto L_0x014f
            if (r0 != r6) goto L_0x014b
            goto L_0x014f
        L_0x014b:
            r0 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0188
        L_0x014f:
            r0 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0188
        L_0x0152:
            int r0 = r1.n
            int r0 = android.media.AudioTrack.getMinBufferSize(r2, r10, r0)
            r2 = -2
            if (r0 == r2) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r4 = 0
        L_0x015d:
            com.google.android.gms.internal.ads.Cma.b(r4)
            int r2 = r0 << 2
            r4 = 250000(0x3d090, double:1.235164E-318)
            long r4 = r1.c(r4)
            int r5 = (int) r4
            int r4 = r1.I
            int r4 = r4 * r5
            long r5 = (long) r0
            r7 = 750000(0xb71b0, double:3.70549E-318)
            long r7 = r1.c(r7)
            int r0 = r1.I
            long r9 = (long) r0
            long r7 = r7 * r9
            long r5 = java.lang.Math.max(r5, r7)
            int r0 = (int) r5
            if (r2 >= r4) goto L_0x0184
            r0 = r4
            goto L_0x0188
        L_0x0184:
            if (r2 <= r0) goto L_0x0187
            goto L_0x0188
        L_0x0187:
            r0 = r2
        L_0x0188:
            r1.q = r0
            if (r3 == 0) goto L_0x0192
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x019c
        L_0x0192:
            int r0 = r1.q
            int r2 = r1.I
            int r0 = r0 / r2
            long r2 = (long) r0
            long r2 = r1.b(r2)
        L_0x019c:
            r1.r = r2
            com.google.android.gms.internal.ads.Ria r0 = r1.t
            r1.a((com.google.android.gms.internal.ads.Ria) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2093lja.a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce A[SYNTHETIC, Splitter:B:23:0x00ce] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.nio.ByteBuffer r25, long r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            java.nio.ByteBuffer r4 = r1.T
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0011
            if (r0 != r4) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r4 = 0
            goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            com.google.android.gms.internal.ads.Cma.a((boolean) r4)
            boolean r4 = r24.k()
            r7 = 0
            if (r4 != 0) goto L_0x00e6
            android.os.ConditionVariable r4 = r1.f11229f
            r4.block()
            boolean r4 = r1.ba
            if (r4 == 0) goto L_0x0066
            int r4 = r1.k
            int r8 = r1.l
            int r9 = r1.n
            int r13 = r1.q
            int r15 = r1.aa
            android.media.AudioAttributes$Builder r10 = new android.media.AudioAttributes$Builder
            r10.<init>()
            android.media.AudioAttributes$Builder r10 = r10.setUsage(r6)
            r11 = 3
            android.media.AudioAttributes$Builder r10 = r10.setContentType(r11)
            r11 = 16
            android.media.AudioAttributes$Builder r10 = r10.setFlags(r11)
            android.media.AudioAttributes r11 = r10.build()
            android.media.AudioFormat$Builder r10 = new android.media.AudioFormat$Builder
            r10.<init>()
            android.media.AudioFormat$Builder r8 = r10.setChannelMask(r8)
            android.media.AudioFormat$Builder r8 = r8.setEncoding(r9)
            android.media.AudioFormat$Builder r4 = r8.setSampleRate(r4)
            android.media.AudioFormat r12 = r4.build()
            android.media.AudioTrack r4 = new android.media.AudioTrack
            r14 = 1
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x0063:
            r1.j = r4
            goto L_0x009d
        L_0x0066:
            int r4 = r1.aa
            if (r4 != 0) goto L_0x007c
            android.media.AudioTrack r4 = new android.media.AudioTrack
            int r9 = r1.o
            int r10 = r1.k
            int r11 = r1.l
            int r12 = r1.n
            int r13 = r1.q
            r14 = 1
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x0063
        L_0x007c:
            android.media.AudioTrack r8 = new android.media.AudioTrack
            int r9 = r1.o
            int r10 = r1.k
            int r11 = r1.l
            int r12 = r1.n
            int r13 = r1.q
            r22 = 1
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r23 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r1.j = r8
        L_0x009d:
            android.media.AudioTrack r4 = r1.j
            int r4 = r4.getState()
            if (r4 != r6) goto L_0x00ce
            android.media.AudioTrack r4 = r1.j
            int r4 = r4.getAudioSessionId()
            int r8 = r1.aa
            if (r8 == r4) goto L_0x00b6
            r1.aa = r4
            com.google.android.gms.internal.ads.rja r8 = r1.f11228e
            r8.a(r4)
        L_0x00b6:
            com.google.android.gms.internal.ads.nja r4 = r1.f11231h
            android.media.AudioTrack r8 = r1.j
            boolean r9 = r24.q()
            r4.a(r8, r9)
            r24.n()
            r1.ca = r5
            boolean r4 = r1.Z
            if (r4 == 0) goto L_0x00e6
            r24.b()
            goto L_0x00e6
        L_0x00ce:
            android.media.AudioTrack r0 = r1.j     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            r0.release()     // Catch:{ Exception -> 0x00d8, all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r1.j = r7
            throw r0
        L_0x00d8:
            r1.j = r7
            com.google.android.gms.internal.ads.sja r0 = new com.google.android.gms.internal.ads.sja
            int r2 = r1.k
            int r3 = r1.l
            int r5 = r1.q
            r0.<init>(r4, r2, r3, r5)
            throw r0
        L_0x00e6:
            boolean r4 = r24.q()
            r8 = 0
            r10 = 2
            if (r4 == 0) goto L_0x010d
            android.media.AudioTrack r4 = r1.j
            int r4 = r4.getPlayState()
            if (r4 != r10) goto L_0x00fa
            r1.ca = r5
            return r5
        L_0x00fa:
            android.media.AudioTrack r4 = r1.j
            int r4 = r4.getPlayState()
            if (r4 != r6) goto L_0x010d
            com.google.android.gms.internal.ads.nja r4 = r1.f11231h
            long r11 = r4.b()
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x010d
            return r5
        L_0x010d:
            boolean r4 = r1.ca
            boolean r11 = r24.h()
            r1.ca = r11
            if (r4 == 0) goto L_0x013a
            boolean r4 = r1.ca
            if (r4 != 0) goto L_0x013a
            android.media.AudioTrack r4 = r1.j
            int r4 = r4.getPlayState()
            if (r4 == r6) goto L_0x013a
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r13 = r1.da
            long r19 = r11 - r13
            com.google.android.gms.internal.ads.rja r15 = r1.f11228e
            int r4 = r1.q
            long r11 = r1.r
            long r17 = com.google.android.gms.internal.ads.C2942xia.a(r11)
            r16 = r4
            r15.a(r16, r17, r19)
        L_0x013a:
            java.nio.ByteBuffer r4 = r1.T
            if (r4 != 0) goto L_0x023c
            boolean r4 = r25.hasRemaining()
            if (r4 != 0) goto L_0x0145
            return r6
        L_0x0145:
            boolean r4 = r1.p
            if (r4 == 0) goto L_0x0186
            int r4 = r1.L
            if (r4 != 0) goto L_0x0186
            int r4 = r1.n
            r11 = 7
            if (r4 == r11) goto L_0x0180
            r11 = 8
            if (r4 != r11) goto L_0x0157
            goto L_0x0180
        L_0x0157:
            r11 = 5
            if (r4 != r11) goto L_0x015f
            int r4 = com.google.android.gms.internal.ads._ia.a()
            goto L_0x0184
        L_0x015f:
            r11 = 6
            if (r4 != r11) goto L_0x0167
            int r4 = com.google.android.gms.internal.ads._ia.a(r25)
            goto L_0x0184
        L_0x0167:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2 = 38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected audio encoding: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0180:
            int r4 = com.google.android.gms.internal.ads.C2802vja.a(r25)
        L_0x0184:
            r1.L = r4
        L_0x0186:
            com.google.android.gms.internal.ads.Ria r4 = r1.s
            if (r4 == 0) goto L_0x01b5
            boolean r4 = r24.m()
            if (r4 != 0) goto L_0x0191
            return r5
        L_0x0191:
            java.util.LinkedList<com.google.android.gms.internal.ads.uja> r4 = r1.i
            com.google.android.gms.internal.ads.uja r15 = new com.google.android.gms.internal.ads.uja
            com.google.android.gms.internal.ads.Ria r12 = r1.s
            long r13 = java.lang.Math.max(r8, r2)
            long r10 = r24.o()
            long r16 = r1.b(r10)
            r10 = 0
            r11 = r15
            r5 = r15
            r15 = r16
            r17 = r10
            r11.<init>(r12, r13, r15, r17)
            r4.add(r5)
            r1.s = r7
            r24.l()
        L_0x01b5:
            int r4 = r1.M
            if (r4 != 0) goto L_0x01c2
            long r4 = java.lang.Math.max(r8, r2)
            r1.N = r4
            r1.M = r6
            goto L_0x0223
        L_0x01c2:
            long r4 = r1.N
            boolean r8 = r1.p
            if (r8 == 0) goto L_0x01cb
            long r8 = r1.H
            goto L_0x01d1
        L_0x01cb:
            long r8 = r1.G
            int r10 = r1.F
            long r10 = (long) r10
            long r8 = r8 / r10
        L_0x01d1:
            long r8 = r1.b(r8)
            long r4 = r4 + r8
            int r8 = r1.M
            if (r8 != r6) goto L_0x0210
            long r8 = r4 - r2
            long r8 = java.lang.Math.abs(r8)
            r10 = 200000(0x30d40, double:9.8813E-319)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0210
            r8 = 80
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.String r8 = "Discontinuity detected [expected "
            r9.append(r8)
            r9.append(r4)
            java.lang.String r8 = ", got "
            r9.append(r8)
            r9.append(r2)
            java.lang.String r8 = "]"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "AudioTrack"
            android.util.Log.e(r9, r8)
            r8 = 2
            r1.M = r8
            goto L_0x0211
        L_0x0210:
            r8 = 2
        L_0x0211:
            int r9 = r1.M
            if (r9 != r8) goto L_0x0223
            long r8 = r1.N
            long r4 = r2 - r4
            long r8 = r8 + r4
            r1.N = r8
            r1.M = r6
            com.google.android.gms.internal.ads.rja r4 = r1.f11228e
            r4.a()
        L_0x0223:
            boolean r4 = r1.p
            if (r4 == 0) goto L_0x0230
            long r4 = r1.H
            int r8 = r1.L
            long r8 = (long) r8
            long r4 = r4 + r8
            r1.H = r4
            goto L_0x023a
        L_0x0230:
            long r4 = r1.G
            int r8 = r25.remaining()
            long r8 = (long) r8
            long r4 = r4 + r8
            r1.G = r4
        L_0x023a:
            r1.T = r0
        L_0x023c:
            boolean r0 = r1.p
            if (r0 == 0) goto L_0x0246
            java.nio.ByteBuffer r0 = r1.T
            r1.b(r0, r2)
            goto L_0x0249
        L_0x0246:
            r1.a((long) r2)
        L_0x0249:
            java.nio.ByteBuffer r0 = r1.T
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0254
            r1.T = r7
            return r6
        L_0x0254:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2093lja.a(java.nio.ByteBuffer, long):boolean");
    }

    public final void b() {
        this.Z = true;
        if (k()) {
            this.O = System.nanoTime() / 1000;
            this.j.play();
        }
    }

    public final void c() {
        d();
        for (C1385bja reset : this.f11227d) {
            reset.reset();
        }
        this.aa = 0;
        this.Z = false;
    }

    public final void d() {
        if (k()) {
            this.G = 0;
            this.H = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            Ria ria = this.s;
            if (ria != null) {
                this.t = ria;
                this.s = null;
            } else if (!this.i.isEmpty()) {
                this.t = this.i.getLast().f12375a;
            }
            this.i.clear();
            this.u = 0;
            this.v = 0;
            this.T = null;
            this.U = null;
            int i2 = 0;
            while (true) {
                C1385bja[] bjaArr = this.R;
                if (i2 >= bjaArr.length) {
                    break;
                }
                C1385bja bja = bjaArr[i2];
                bja.flush();
                this.S[i2] = bja.b();
                i2++;
            }
            this.Y = false;
            this.X = -1;
            this.w = null;
            this.x = 0;
            this.M = 0;
            this.P = 0;
            p();
            if (this.j.getPlayState() == 3) {
                this.j.pause();
            }
            AudioTrack audioTrack = this.j;
            this.j = null;
            this.f11231h.a((AudioTrack) null, false);
            this.f11229f.close();
            new C2306oja(this, audioTrack).start();
        }
    }

    public final boolean e() {
        if (k()) {
            return this.Y && !h();
        }
        return true;
    }

    public final void f() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final void g() {
        if (!this.Y && k() && m()) {
            this.f11231h.a(o());
            this.x = 0;
            this.Y = true;
        }
    }

    public final boolean h() {
        if (k()) {
            if (o() <= this.f11231h.b()) {
                if (q() && this.j.getPlayState() == 2 && this.j.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final Ria i() {
        return this.t;
    }

    public final void j() {
        if (this.ba) {
            this.ba = false;
            this.aa = 0;
            d();
        }
    }
}
