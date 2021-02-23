package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oka  reason: case insensitive filesystem */
final class C2308oka {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    /* access modifiers changed from: private */
    public String N;
    public C1599eka O;
    public int P;

    /* renamed from: a  reason: collision with root package name */
    public String f11619a;

    /* renamed from: b  reason: collision with root package name */
    public int f11620b;

    /* renamed from: c  reason: collision with root package name */
    public int f11621c;

    /* renamed from: d  reason: collision with root package name */
    public int f11622d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11623e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f11624f;

    /* renamed from: g  reason: collision with root package name */
    public C1529dka f11625g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f11626h;
    public Lja i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte[] o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    private C2308oka() {
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = 0;
        this.o = null;
        this.p = -1;
        this.q = false;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 1000;
        this.v = 200;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = 1;
        this.H = -1;
        this.I = 8000;
        this.J = 0;
        this.K = 0;
        this.M = true;
        this.N = "eng";
    }

    /* synthetic */ C2308oka(C2166mka mka) {
        this();
    }

    private static List<byte[]> a(Nma nma) {
        try {
            nma.d(16);
            if (nma.m() != 826496599) {
                return null;
            }
            byte[] bArr = nma.f8013a;
            for (int b2 = nma.b() + 20; b2 < bArr.length - 4; b2++) {
                if (bArr[b2] == 0 && bArr[b2 + 1] == 0 && bArr[b2 + 2] == 1 && bArr[b2 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, b2, bArr.length));
                }
            }
            throw new Sia("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new Sia("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> a(byte[] bArr) {
        try {
            if (bArr[0] == 2) {
                int i2 = 1;
                int i3 = 0;
                while (bArr[i2] == -1) {
                    i3 += 255;
                    i2++;
                }
                int i4 = i2 + 1;
                int i5 = i3 + bArr[i2];
                int i6 = 0;
                while (bArr[i4] == -1) {
                    i6 += 255;
                    i4++;
                }
                int i7 = i4 + 1;
                int i8 = i6 + bArr[i4];
                if (bArr[i7] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i7, bArr2, 0, i5);
                    int i9 = i7 + i5;
                    if (bArr[i9] == 3) {
                        int i10 = i9 + i8;
                        if (bArr[i10] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i10)];
                            System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new Sia("Error parsing vorbis codec private");
                    }
                    throw new Sia("Error parsing vorbis codec private");
                }
                throw new Sia("Error parsing vorbis codec private");
            }
            throw new Sia("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new Sia("Error parsing vorbis codec private");
        }
    }

    private static boolean b(Nma nma) {
        try {
            int k2 = nma.k();
            if (k2 == 1) {
                return true;
            }
            if (k2 == 65534) {
                nma.c(24);
                return nma.e() == C1953jka.f10988d.getMostSignificantBits() && nma.e() == C1953jka.f10988d.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new Sia("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c8, code lost:
        r21 = r1;
        r15 = "audio/raw";
        r1 = null;
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0229, code lost:
        r15 = r2;
        r1 = null;
        r18 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d0, code lost:
        r15 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e9, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ea, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02eb, code lost:
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ed, code lost:
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ef, code lost:
        r2 = r0.M | false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f4, code lost:
        if (r0.L == false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f6, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f8, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f9, code lost:
        r2 = r2 | r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fe, code lost:
        if (com.google.android.gms.internal.ads.Jma.a(r15) == false) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0300, code lost:
        r1 = com.google.android.gms.internal.ads.Lia.a(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r18, r0.G, r0.I, r21, r1, r0.i, r2 ? 1 : 0, r0.N);
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0327, code lost:
        if (com.google.android.gms.internal.ads.Jma.b(r15) == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x032b, code lost:
        if (r0.n != 0) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x032d, code lost:
        r2 = r0.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x032f, code lost:
        if (r2 != -1) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0331, code lost:
        r2 = r0.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0333, code lost:
        r0.l = r2;
        r2 = r0.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0337, code lost:
        if (r2 != -1) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0339, code lost:
        r2 = r0.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033b, code lost:
        r0.m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033d, code lost:
        r2 = r0.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0341, code lost:
        if (r2 == -1) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0343, code lost:
        r4 = r0.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0345, code lost:
        if (r4 == -1) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0347, code lost:
        r24 = ((float) (r0.k * r2)) / ((float) (r0.j * r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0355, code lost:
        r24 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0359, code lost:
        if (r0.q == false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x035f, code lost:
        if (r0.w == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0365, code lost:
        if (r0.x == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x036b, code lost:
        if (r0.y == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0371, code lost:
        if (r0.z == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0377, code lost:
        if (r0.A == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037d, code lost:
        if (r0.B == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0383, code lost:
        if (r0.C == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0389, code lost:
        if (r0.D == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x038f, code lost:
        if (r0.E == -1.0f) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0395, code lost:
        if (r0.F != -1.0f) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0398, code lost:
        r13 = new byte[25];
        r2 = java.nio.ByteBuffer.wrap(r13);
        r2.put((byte) 0);
        r2.putShort((short) ((int) ((r0.w * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.x * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.y * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.z * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.A * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.B * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.C * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r0.D * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) (r0.E + 0.5f)));
        r2.putShort((short) ((int) (r0.F + 0.5f)));
        r2.putShort((short) r0.u);
        r2.putShort((short) r0.v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0414, code lost:
        r27 = new com.google.android.gms.internal.ads.Uma(r0.r, r0.t, r0.s, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0422, code lost:
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0424, code lost:
        r1 = com.google.android.gms.internal.ads.Lia.a(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r18, r0.j, r0.k, -1.0f, r1, -1, r24, r0.o, r0.p, r27, r0.i);
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0452, code lost:
        if ("application/x-subrip".equals(r15) == false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0454, code lost:
        r1 = com.google.android.gms.internal.ads.Lia.a(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r2 ? 1 : 0, r0.N, r0.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0471, code lost:
        if ("application/vobsub".equals(r15) != false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0479, code lost:
        if ("application/pgs".equals(r15) != false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0481, code lost:
        if ("application/dvbsubs".equals(r15) == false) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x048b, code lost:
        throw new com.google.android.gms.internal.ads.Sia("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x048c, code lost:
        r1 = com.google.android.gms.internal.ads.Lia.a(java.lang.Integer.toString(r31), r15, (java.lang.String) null, -1, r1, r0.N, r0.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04a2, code lost:
        r0.O = r30.a(r0.f11620b, r7);
        r0.O.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ae, code lost:
        r3.append("Unsupported PCM bit depth: ");
        r3.append(r1);
        r3.append(". Setting mimeType to ");
        r3.append("audio/x-unknown");
        r1 = r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c2, code lost:
        android.util.Log.w("MatroskaExtractor", r1);
        r15 = "audio/x-unknown";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.Vja r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            java.lang.String r1 = r0.f11619a
            int r2 = r1.hashCode()
            r3 = 8
            r4 = 1
            r5 = 2
            r6 = 0
            r7 = 3
            r8 = -1
            switch(r2) {
                case -2095576542: goto L_0x0149;
                case -2095575984: goto L_0x013f;
                case -1985379776: goto L_0x0134;
                case -1784763192: goto L_0x0129;
                case -1730367663: goto L_0x011e;
                case -1482641358: goto L_0x0113;
                case -1482641357: goto L_0x0108;
                case -1373388978: goto L_0x00fd;
                case -933872740: goto L_0x00f2;
                case -538363189: goto L_0x00e7;
                case -538363109: goto L_0x00dc;
                case -425012669: goto L_0x00d0;
                case -356037306: goto L_0x00c4;
                case 62923557: goto L_0x00b8;
                case 62923603: goto L_0x00ac;
                case 62927045: goto L_0x00a0;
                case 82338133: goto L_0x0095;
                case 82338134: goto L_0x008a;
                case 99146302: goto L_0x007e;
                case 444813526: goto L_0x0072;
                case 542569478: goto L_0x0066;
                case 725957860: goto L_0x005a;
                case 855502857: goto L_0x004f;
                case 1422270023: goto L_0x0043;
                case 1809237540: goto L_0x0038;
                case 1950749482: goto L_0x002c;
                case 1950789798: goto L_0x0020;
                case 1951062397: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0153
        L_0x0014:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 11
            goto L_0x0154
        L_0x0020:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 21
            goto L_0x0154
        L_0x002c:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 16
            goto L_0x0154
        L_0x0038:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 2
            goto L_0x0154
        L_0x0043:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 24
            goto L_0x0154
        L_0x004f:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 7
            goto L_0x0154
        L_0x005a:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 23
            goto L_0x0154
        L_0x0066:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 19
            goto L_0x0154
        L_0x0072:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 9
            goto L_0x0154
        L_0x007e:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 26
            goto L_0x0154
        L_0x008a:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 1
            goto L_0x0154
        L_0x0095:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 0
            goto L_0x0154
        L_0x00a0:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 18
            goto L_0x0154
        L_0x00ac:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 15
            goto L_0x0154
        L_0x00b8:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 12
            goto L_0x0154
        L_0x00c4:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 20
            goto L_0x0154
        L_0x00d0:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 25
            goto L_0x0154
        L_0x00dc:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 6
            goto L_0x0154
        L_0x00e7:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 4
            goto L_0x0154
        L_0x00f2:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 27
            goto L_0x0154
        L_0x00fd:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 8
            goto L_0x0154
        L_0x0108:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 14
            goto L_0x0154
        L_0x0113:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 13
            goto L_0x0154
        L_0x011e:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 10
            goto L_0x0154
        L_0x0129:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 17
            goto L_0x0154
        L_0x0134:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 22
            goto L_0x0154
        L_0x013f:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 3
            goto L_0x0154
        L_0x0149:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 5
            goto L_0x0154
        L_0x0153:
            r1 = -1
        L_0x0154:
            java.lang.String r2 = "audio/raw"
            r9 = 4096(0x1000, float:5.74E-42)
            java.lang.String r10 = "video/x-unknown"
            java.lang.String r11 = "audio/x-unknown"
            java.lang.String r12 = "MatroskaExtractor"
            r13 = 0
            switch(r1) {
                case 0: goto L_0x02e7;
                case 1: goto L_0x02e4;
                case 2: goto L_0x02e1;
                case 3: goto L_0x02d3;
                case 4: goto L_0x02d3;
                case 5: goto L_0x02d3;
                case 6: goto L_0x02bd;
                case 7: goto L_0x02a9;
                case 8: goto L_0x0292;
                case 9: goto L_0x0290;
                case 10: goto L_0x0280;
                case 11: goto L_0x023a;
                case 12: goto L_0x022f;
                case 13: goto L_0x0227;
                case 14: goto L_0x0224;
                case 15: goto L_0x0220;
                case 16: goto L_0x021c;
                case 17: goto L_0x0218;
                case 18: goto L_0x0214;
                case 19: goto L_0x0214;
                case 20: goto L_0x0210;
                case 21: goto L_0x0207;
                case 22: goto L_0x01d0;
                case 23: goto L_0x0199;
                case 24: goto L_0x0195;
                case 25: goto L_0x018b;
                case 26: goto L_0x0187;
                case 27: goto L_0x016a;
                default: goto L_0x0162;
            }
        L_0x0162:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x016a:
            r1 = 4
            byte[] r1 = new byte[r1]
            byte[] r2 = r0.f11626h
            byte r3 = r2[r6]
            r1[r6] = r3
            byte r3 = r2[r4]
            r1[r4] = r3
            byte r3 = r2[r5]
            r1[r5] = r3
            byte r2 = r2[r7]
            r1[r7] = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "application/dvbsubs"
            goto L_0x0237
        L_0x0187:
            java.lang.String r2 = "application/pgs"
            goto L_0x02e9
        L_0x018b:
            byte[] r1 = r0.f11626h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "application/vobsub"
            goto L_0x0237
        L_0x0195:
            java.lang.String r2 = "application/x-subrip"
            goto L_0x02e9
        L_0x0199:
            int r1 = r0.H
            int r1 = com.google.android.gms.internal.ads.Tma.a((int) r1)
            if (r1 != 0) goto L_0x01c8
            int r1 = r0.H
            int r2 = r11.length()
            int r2 = r2 + 60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L_0x01ae:
            java.lang.String r2 = "Unsupported PCM bit depth: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ". Setting mimeType to "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = r3.toString()
        L_0x01c2:
            android.util.Log.w(r12, r1)
            r15 = r11
            goto L_0x02ea
        L_0x01c8:
            r21 = r1
            r15 = r2
            r1 = r13
            r18 = -1
            goto L_0x02ef
        L_0x01d0:
            com.google.android.gms.internal.ads.Nma r1 = new com.google.android.gms.internal.ads.Nma
            byte[] r3 = r0.f11626h
            r1.<init>((byte[]) r3)
            boolean r1 = b(r1)
            if (r1 == 0) goto L_0x01f3
            int r1 = r0.H
            int r1 = com.google.android.gms.internal.ads.Tma.a((int) r1)
            if (r1 != 0) goto L_0x01c8
            int r1 = r0.H
            int r2 = r11.length()
            int r2 = r2 + 60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            goto L_0x01ae
        L_0x01f3:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            int r2 = r11.length()
            if (r2 == 0) goto L_0x0200
            java.lang.String r1 = r1.concat(r11)
            goto L_0x01c2
        L_0x0200:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
            goto L_0x01c2
        L_0x0207:
            byte[] r1 = r0.f11626h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "audio/x-flac"
            goto L_0x0237
        L_0x0210:
            java.lang.String r2 = "audio/vnd.dts.hd"
            goto L_0x02e9
        L_0x0214:
            java.lang.String r2 = "audio/vnd.dts"
            goto L_0x02e9
        L_0x0218:
            java.lang.String r2 = "audio/true-hd"
            goto L_0x02e9
        L_0x021c:
            java.lang.String r2 = "audio/eac3"
            goto L_0x02e9
        L_0x0220:
            java.lang.String r2 = "audio/ac3"
            goto L_0x02e9
        L_0x0224:
            java.lang.String r2 = "audio/mpeg"
            goto L_0x0229
        L_0x0227:
            java.lang.String r2 = "audio/mpeg-L2"
        L_0x0229:
            r15 = r2
            r1 = r13
            r18 = 4096(0x1000, float:5.74E-42)
            goto L_0x02ed
        L_0x022f:
            byte[] r1 = r0.f11626h
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "audio/mp4a-latm"
        L_0x0237:
            r15 = r2
            goto L_0x02eb
        L_0x023a:
            r1 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            byte[] r9 = r0.f11626h
            r2.add(r9)
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r9 = r9.order(r10)
            long r10 = r0.J
            java.nio.ByteBuffer r9 = r9.putLong(r10)
            byte[] r9 = r9.array()
            r2.add(r9)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r9)
            long r9 = r0.K
            java.nio.ByteBuffer r3 = r3.putLong(r9)
            byte[] r3 = r3.array()
            r2.add(r3)
            java.lang.String r3 = "audio/opus"
            r1 = r2
            r15 = r3
            r18 = 5760(0x1680, float:8.071E-42)
            goto L_0x02ed
        L_0x0280:
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = r0.f11626h
            java.util.List r2 = a((byte[]) r2)
            java.lang.String r3 = "audio/vorbis"
            r1 = r2
            r15 = r3
            r18 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02ed
        L_0x0290:
            r15 = r10
            goto L_0x02ea
        L_0x0292:
            com.google.android.gms.internal.ads.Nma r1 = new com.google.android.gms.internal.ads.Nma
            byte[] r2 = r0.f11626h
            r1.<init>((byte[]) r2)
            java.util.List r1 = a((com.google.android.gms.internal.ads.Nma) r1)
            if (r1 == 0) goto L_0x02a2
            java.lang.String r2 = "video/wvc1"
            goto L_0x0237
        L_0x02a2:
            java.lang.String r2 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r12, r2)
            r15 = r10
            goto L_0x02eb
        L_0x02a9:
            com.google.android.gms.internal.ads.Nma r1 = new com.google.android.gms.internal.ads.Nma
            byte[] r2 = r0.f11626h
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.bna r1 = com.google.android.gms.internal.ads.C1393bna.a(r1)
            java.util.List<byte[]> r2 = r1.f9968a
            int r1 = r1.f9969b
            r0.P = r1
            java.lang.String r1 = "video/hevc"
            goto L_0x02d0
        L_0x02bd:
            com.google.android.gms.internal.ads.Nma r1 = new com.google.android.gms.internal.ads.Nma
            byte[] r2 = r0.f11626h
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.Vma r1 = com.google.android.gms.internal.ads.Vma.a(r1)
            java.util.List<byte[]> r2 = r1.f9086a
            int r1 = r1.f9087b
            r0.P = r1
            java.lang.String r1 = "video/avc"
        L_0x02d0:
            r15 = r1
            r1 = r2
            goto L_0x02eb
        L_0x02d3:
            byte[] r1 = r0.f11626h
            if (r1 != 0) goto L_0x02d9
            r1 = r13
            goto L_0x02dd
        L_0x02d9:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x02dd:
            java.lang.String r2 = "video/mp4v-es"
            goto L_0x0237
        L_0x02e1:
            java.lang.String r2 = "video/mpeg2"
            goto L_0x02e9
        L_0x02e4:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x02e9
        L_0x02e7:
            java.lang.String r2 = "video/x-vnd.on2.vp8"
        L_0x02e9:
            r15 = r2
        L_0x02ea:
            r1 = r13
        L_0x02eb:
            r18 = -1
        L_0x02ed:
            r21 = -1
        L_0x02ef:
            boolean r2 = r0.M
            r2 = r2 | r6
            boolean r3 = r0.L
            if (r3 == 0) goto L_0x02f8
            r3 = 2
            goto L_0x02f9
        L_0x02f8:
            r3 = 0
        L_0x02f9:
            r2 = r2 | r3
            boolean r3 = com.google.android.gms.internal.ads.Jma.a(r15)
            if (r3 == 0) goto L_0x0323
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            int r3 = r0.G
            int r5 = r0.I
            com.google.android.gms.internal.ads.Lja r6 = r0.i
            java.lang.String r7 = r0.N
            r19 = r3
            r20 = r5
            r22 = r1
            r23 = r6
            r24 = r2
            r25 = r7
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 1
            goto L_0x04a2
        L_0x0323:
            boolean r3 = com.google.android.gms.internal.ads.Jma.b(r15)
            if (r3 == 0) goto L_0x044c
            int r2 = r0.n
            if (r2 != 0) goto L_0x033d
            int r2 = r0.l
            if (r2 != r8) goto L_0x0333
            int r2 = r0.j
        L_0x0333:
            r0.l = r2
            int r2 = r0.m
            if (r2 != r8) goto L_0x033b
            int r2 = r0.k
        L_0x033b:
            r0.m = r2
        L_0x033d:
            int r2 = r0.l
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == r8) goto L_0x0355
            int r4 = r0.m
            if (r4 == r8) goto L_0x0355
            int r7 = r0.k
            int r7 = r7 * r2
            float r2 = (float) r7
            int r7 = r0.j
            int r7 = r7 * r4
            float r4 = (float) r7
            float r2 = r2 / r4
            r24 = r2
            goto L_0x0357
        L_0x0355:
            r24 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0357:
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x0422
            float r2 = r0.w
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.x
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.y
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.z
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.A
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.B
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.C
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.D
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.E
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0414
            float r2 = r0.F
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0398
            goto L_0x0414
        L_0x0398:
            r2 = 25
            byte[] r13 = new byte[r2]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r13)
            r2.put(r6)
            float r3 = r0.w
            r4 = 1195593728(0x47435000, float:50000.0)
            float r3 = r3 * r4
            r6 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.x
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.y
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.z
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.A
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.B
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.C
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.D
            float r3 = r3 * r4
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.E
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r0.F
            float r3 = r3 + r6
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            int r3 = r0.u
            short r3 = (short) r3
            r2.putShort(r3)
            int r3 = r0.v
            short r3 = (short) r3
            r2.putShort(r3)
        L_0x0414:
            com.google.android.gms.internal.ads.Uma r2 = new com.google.android.gms.internal.ads.Uma
            int r3 = r0.r
            int r4 = r0.t
            int r6 = r0.s
            r2.<init>(r3, r4, r6, r13)
            r27 = r2
            goto L_0x0424
        L_0x0422:
            r27 = r13
        L_0x0424:
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            int r2 = r0.j
            int r3 = r0.k
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            r23 = -1
            byte[] r4 = r0.o
            int r6 = r0.p
            com.google.android.gms.internal.ads.Lja r7 = r0.i
            r19 = r2
            r20 = r3
            r22 = r1
            r25 = r4
            r26 = r6
            r28 = r7
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7 = 2
            goto L_0x04a2
        L_0x044c:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x046b
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            java.lang.String r1 = r0.N
            com.google.android.gms.internal.ads.Lja r3 = r0.i
            r18 = r2
            r19 = r1
            r20 = r3
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (int) r18, (java.lang.String) r19, (com.google.android.gms.internal.ads.Lja) r20)
            goto L_0x04a2
        L_0x046b:
            java.lang.String r2 = "application/vobsub"
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x048c
            java.lang.String r2 = "application/pgs"
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x048c
            java.lang.String r2 = "application/dvbsubs"
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x0484
            goto L_0x048c
        L_0x0484:
            com.google.android.gms.internal.ads.Sia r1 = new com.google.android.gms.internal.ads.Sia
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x048c:
            java.lang.String r14 = java.lang.Integer.toString(r31)
            r16 = 0
            r17 = -1
            java.lang.String r2 = r0.N
            com.google.android.gms.internal.ads.Lja r3 = r0.i
            r18 = r1
            r19 = r2
            r20 = r3
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (java.util.List<byte[]>) r18, (java.lang.String) r19, (com.google.android.gms.internal.ads.Lja) r20)
        L_0x04a2:
            int r2 = r0.f11620b
            r3 = r30
            com.google.android.gms.internal.ads.eka r2 = r3.a(r2, r7)
            r0.O = r2
            com.google.android.gms.internal.ads.eka r2 = r0.O
            r2.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2308oka.a(com.google.android.gms.internal.ads.Vja, int):void");
    }
}
