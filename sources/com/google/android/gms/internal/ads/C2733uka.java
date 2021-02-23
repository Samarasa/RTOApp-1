package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.C1389bla;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uka  reason: case insensitive filesystem */
final class C2733uka {

    /* renamed from: a  reason: collision with root package name */
    private static final int f12381a = Tma.c("vide");

    /* renamed from: b  reason: collision with root package name */
    private static final int f12382b = Tma.c("soun");

    /* renamed from: c  reason: collision with root package name */
    private static final int f12383c = Tma.c("text");

    /* renamed from: d  reason: collision with root package name */
    private static final int f12384d = Tma.c("sbtl");

    /* renamed from: e  reason: collision with root package name */
    private static final int f12385e = Tma.c("subt");

    /* renamed from: f  reason: collision with root package name */
    private static final int f12386f = Tma.c("clcp");

    /* renamed from: g  reason: collision with root package name */
    private static final int f12387g = Tma.c("cenc");

    /* renamed from: h  reason: collision with root package name */
    private static final int f12388h = Tma.c("meta");

    private static int a(Nma nma) {
        int g2 = nma.g();
        int i = g2 & 127;
        while ((g2 & 128) == 128) {
            g2 = nma.g();
            i = (i << 7) | (g2 & 127);
        }
        return i;
    }

    private static int a(Nma nma, int i, int i2, C2804vka vka, int i3) {
        Pka pka;
        Nma nma2 = nma;
        int b2 = nma.b();
        while (true) {
            boolean z = false;
            if (b2 - i >= i2) {
                return 0;
            }
            nma.c(b2);
            int d2 = nma.d();
            Cma.a(d2 > 0, "childAtomSize should be positive");
            if (nma.d() == C2379pka.V) {
                int i4 = b2 + 8;
                Pair pair = null;
                Integer num = null;
                Pka pka2 = null;
                boolean z2 = false;
                while (i4 - b2 < d2) {
                    nma.c(i4);
                    int d3 = nma.d();
                    int d4 = nma.d();
                    if (d4 == C2379pka.ba) {
                        num = Integer.valueOf(nma.d());
                    } else if (d4 == C2379pka.W) {
                        nma.d(4);
                        z2 = nma.d() == f12387g;
                    } else if (d4 == C2379pka.X) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= d3) {
                                pka = null;
                                break;
                            }
                            nma.c(i5);
                            int d5 = nma.d();
                            if (nma.d() == C2379pka.Y) {
                                nma.d(6);
                                boolean z3 = nma.g() == 1;
                                int g2 = nma.g();
                                byte[] bArr = new byte[16];
                                nma.a(bArr, 0, 16);
                                pka = new Pka(z3, g2, bArr);
                            } else {
                                i5 += d5;
                            }
                        }
                        pka2 = pka;
                    }
                    i4 += d3;
                }
                if (z2) {
                    Cma.a(num != null, "frma atom is mandatory");
                    if (pka2 != null) {
                        z = true;
                    }
                    Cma.a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, pka2);
                }
                if (pair != null) {
                    vka.f12555a[i3] = (Pka) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C2804vka vka2 = vka;
            b2 += d2;
        }
    }

    private static Pair<String, byte[]> a(Nma nma, int i) {
        nma.c(i + 8 + 4);
        nma.d(1);
        a(nma);
        nma.d(2);
        int g2 = nma.g();
        if ((g2 & 128) != 0) {
            nma.d(2);
        }
        if ((g2 & 64) != 0) {
            nma.d(nma.h());
        }
        if ((g2 & 32) != 0) {
            nma.d(2);
        }
        nma.d(1);
        a(nma);
        int g3 = nma.g();
        String str = null;
        if (g3 == 32) {
            str = "video/mp4v-es";
        } else if (g3 == 33) {
            str = "video/avc";
        } else if (g3 != 35) {
            if (g3 != 64) {
                if (g3 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (g3 == 165) {
                    str = "audio/ac3";
                } else if (g3 != 166) {
                    switch (g3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        nma.d(12);
        nma.d(1);
        int a2 = a(nma);
        byte[] bArr = new byte[a2];
        nma.a(bArr, 0, a2);
        return Pair.create(str, bArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v21, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x054d: MOVE  (r2v51 java.lang.String) = (r42v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x07d3  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x082e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x082f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b8  */
    public static com.google.android.gms.internal.ads.Mka a(com.google.android.gms.internal.ads.C2591ska r48, com.google.android.gms.internal.ads.C2520rka r49, long r50, com.google.android.gms.internal.ads.Lja r52, boolean r53) {
        /*
            r0 = r48
            r15 = r52
            int r1 = com.google.android.gms.internal.ads.C2379pka.E
            com.google.android.gms.internal.ads.ska r1 = r0.e(r1)
            int r2 = com.google.android.gms.internal.ads.C2379pka.S
            com.google.android.gms.internal.ads.rka r2 = r1.d(r2)
            com.google.android.gms.internal.ads.Nma r2 = r2.Qa
            r14 = 16
            r2.c(r14)
            int r2 = r2.d()
            int r3 = f12382b
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = f12381a
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = f12383c
            if (r2 == r3) goto L_0x0042
            int r3 = f12384d
            if (r2 == r3) goto L_0x0042
            int r3 = f12385e
            if (r2 == r3) goto L_0x0042
            int r3 = f12386f
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = f12388h
            if (r2 != r3) goto L_0x0040
            r10 = 4
            goto L_0x0043
        L_0x0040:
            r10 = -1
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0047
            return r8
        L_0x0047:
            int r2 = com.google.android.gms.internal.ads.C2379pka.O
            com.google.android.gms.internal.ads.rka r2 = r0.d(r2)
            com.google.android.gms.internal.ads.Nma r2 = r2.Qa
            r7 = 8
            r2.c(r7)
            int r3 = r2.d()
            int r3 = com.google.android.gms.internal.ads.C2379pka.a(r3)
            if (r3 != 0) goto L_0x0061
            r5 = 8
            goto L_0x0063
        L_0x0061:
            r5 = 16
        L_0x0063:
            r2.d(r5)
            int r5 = r2.d()
            r2.d(r4)
            int r6 = r2.b()
            if (r3 != 0) goto L_0x0075
            r12 = 4
            goto L_0x0077
        L_0x0075:
            r12 = 8
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 >= r12) goto L_0x0088
            byte[] r8 = r2.f8013a
            int r20 = r6 + r9
            byte r8 = r8[r20]
            if (r8 == r11) goto L_0x0084
            r6 = 0
            goto L_0x0089
        L_0x0084:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x0078
        L_0x0088:
            r6 = 1
        L_0x0089:
            r20 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0097
            r2.d(r12)
        L_0x0095:
            r11 = r8
            goto L_0x00a9
        L_0x0097:
            if (r3 != 0) goto L_0x009e
            long r22 = r2.l()
            goto L_0x00a2
        L_0x009e:
            long r22 = r2.p()
        L_0x00a2:
            int r3 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            goto L_0x0095
        L_0x00a7:
            r11 = r22
        L_0x00a9:
            r2.d(r14)
            int r3 = r2.d()
            int r6 = r2.d()
            r2.d(r4)
            int r4 = r2.d()
            int r2 = r2.d()
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00ce
            r13 = 65536(0x10000, float:9.18355E-41)
            if (r6 != r13) goto L_0x00ce
            if (r4 != r14) goto L_0x00ce
            if (r2 != 0) goto L_0x00ce
            r2 = 90
            goto L_0x00e7
        L_0x00ce:
            if (r3 != 0) goto L_0x00db
            if (r6 != r14) goto L_0x00db
            r13 = 65536(0x10000, float:9.18355E-41)
            if (r4 != r13) goto L_0x00db
            if (r2 != 0) goto L_0x00db
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e7
        L_0x00db:
            if (r3 != r14) goto L_0x00e6
            if (r6 != 0) goto L_0x00e6
            if (r4 != 0) goto L_0x00e6
            if (r2 != r14) goto L_0x00e6
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e7
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            com.google.android.gms.internal.ads.Bka r14 = new com.google.android.gms.internal.ads.Bka
            r14.<init>(r5, r11, r2)
            int r2 = (r50 > r8 ? 1 : (r50 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x00f9
            long r2 = r14.f6354b
            r26 = r2
            r2 = r49
            goto L_0x00fd
        L_0x00f9:
            r2 = r49
            r26 = r50
        L_0x00fd:
            com.google.android.gms.internal.ads.Nma r2 = r2.Qa
            r2.c(r7)
            int r3 = r2.d()
            int r3 = com.google.android.gms.internal.ads.C2379pka.a(r3)
            if (r3 != 0) goto L_0x010f
            r3 = 8
            goto L_0x0111
        L_0x010f:
            r3 = 16
        L_0x0111:
            r2.d(r3)
            long r32 = r2.l()
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x011f
            r26 = r8
            goto L_0x012a
        L_0x011f:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.Tma.a((long) r26, (long) r28, (long) r30)
            r26 = r2
        L_0x012a:
            int r2 = com.google.android.gms.internal.ads.C2379pka.F
            com.google.android.gms.internal.ads.ska r2 = r1.e(r2)
            int r3 = com.google.android.gms.internal.ads.C2379pka.G
            com.google.android.gms.internal.ads.ska r2 = r2.e(r3)
            int r3 = com.google.android.gms.internal.ads.C2379pka.R
            com.google.android.gms.internal.ads.rka r1 = r1.d(r3)
            com.google.android.gms.internal.ads.Nma r1 = r1.Qa
            r1.c(r7)
            int r3 = r1.d()
            int r3 = com.google.android.gms.internal.ads.C2379pka.a(r3)
            if (r3 != 0) goto L_0x014e
            r4 = 8
            goto L_0x0150
        L_0x014e:
            r4 = 16
        L_0x0150:
            r1.d(r4)
            long r4 = r1.l()
            if (r3 != 0) goto L_0x015b
            r3 = 4
            goto L_0x015d
        L_0x015b:
            r3 = 8
        L_0x015d:
            r1.d(r3)
            int r1 = r1.h()
            int r3 = r1 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 3
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            android.util.Pair r13 = android.util.Pair.create(r3, r1)
            int r1 = com.google.android.gms.internal.ads.C2379pka.T
            com.google.android.gms.internal.ads.rka r1 = r2.d(r1)
            com.google.android.gms.internal.ads.Nma r12 = r1.Qa
            int r22 = r14.f6353a
            int r28 = r14.f6355c
            java.lang.Object r1 = r13.second
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r1 = 12
            r12.c(r1)
            int r9 = r12.d()
            com.google.android.gms.internal.ads.vka r8 = new com.google.android.gms.internal.ads.vka
            r8.<init>(r9)
            r6 = 0
        L_0x01b6:
            if (r6 >= r9) goto L_0x07b7
            int r5 = r12.b()
            int r4 = r12.d()
            if (r4 <= 0) goto L_0x01c4
            r1 = 1
            goto L_0x01c5
        L_0x01c4:
            r1 = 0
        L_0x01c5:
            java.lang.String r3 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.Cma.a(r1, r3)
            int r1 = r12.d()
            int r2 = com.google.android.gms.internal.ads.C2379pka.f11745b
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.f11746c
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.Z
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.la
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.f11747d
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.f11748e
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.f11749f
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.Ka
            if (r1 == r2) goto L_0x0599
            int r2 = com.google.android.gms.internal.ads.C2379pka.La
            if (r1 != r2) goto L_0x01f4
            goto L_0x0599
        L_0x01f4:
            int r2 = com.google.android.gms.internal.ads.C2379pka.i
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.aa
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.n
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.p
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.r
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.u
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.s
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.t
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.ya
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.za
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.l
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.m
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.j
            if (r1 == r2) goto L_0x031a
            int r2 = com.google.android.gms.internal.ads.C2379pka.Oa
            if (r1 != r2) goto L_0x022e
            goto L_0x031a
        L_0x022e:
            int r2 = com.google.android.gms.internal.ads.C2379pka.ja
            if (r1 == r2) goto L_0x026c
            int r2 = com.google.android.gms.internal.ads.C2379pka.ua
            if (r1 == r2) goto L_0x026c
            int r2 = com.google.android.gms.internal.ads.C2379pka.va
            if (r1 == r2) goto L_0x026c
            int r2 = com.google.android.gms.internal.ads.C2379pka.wa
            if (r1 == r2) goto L_0x026c
            int r2 = com.google.android.gms.internal.ads.C2379pka.xa
            if (r1 != r2) goto L_0x0243
            goto L_0x026c
        L_0x0243:
            int r2 = com.google.android.gms.internal.ads.C2379pka.Na
            if (r1 != r2) goto L_0x0256
            java.lang.String r1 = java.lang.Integer.toString(r22)
            java.lang.String r2 = "application/x-camera-motion"
            r3 = -1
            r7 = 0
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r1, r2, r7, r3, r15)
            r8.f12556b = r1
            goto L_0x0257
        L_0x0256:
            r7 = 0
        L_0x0257:
            r30 = r4
            r29 = r5
            r36 = r6
            r0 = r8
            r24 = r9
            r19 = r10
            r35 = r11
            r25 = r12
            r47 = r13
            r23 = r14
            goto L_0x0378
        L_0x026c:
            r3 = -1
            r7 = 0
            int r2 = r5 + 8
            r19 = 8
            int r2 = r2 + 8
            r12.c(r2)
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.C2379pka.ja
            if (r1 != r2) goto L_0x0289
            java.lang.String r1 = "application/ttml+xml"
            r17 = r1
            r18 = r7
            r2 = 1
            r7 = 0
            goto L_0x02c7
        L_0x0289:
            int r2 = com.google.android.gms.internal.ads.C2379pka.ua
            if (r1 != r2) goto L_0x02a3
            int r1 = r4 + -8
            int r1 = r1 + -8
            byte[] r2 = new byte[r1]
            r7 = 0
            r12.a(r2, r7, r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "application/x-quicktime-tx3g"
            r18 = r1
            r17 = r2
            r2 = 1
            goto L_0x02c7
        L_0x02a3:
            r7 = 0
            int r2 = com.google.android.gms.internal.ads.C2379pka.va
            if (r1 != r2) goto L_0x02b0
            java.lang.String r1 = "application/x-mp4-vtt"
            r17 = r1
        L_0x02ac:
            r2 = 1
        L_0x02ad:
            r18 = 0
            goto L_0x02c7
        L_0x02b0:
            int r2 = com.google.android.gms.internal.ads.C2379pka.wa
            if (r1 != r2) goto L_0x02bb
            java.lang.String r1 = "application/ttml+xml"
            r17 = r1
            r29 = r20
            goto L_0x02ac
        L_0x02bb:
            int r2 = com.google.android.gms.internal.ads.C2379pka.xa
            if (r1 != r2) goto L_0x0314
            r2 = 1
            r8.f12558d = r2
            java.lang.String r1 = "application/x-mp4-cea-608"
            r17 = r1
            goto L_0x02ad
        L_0x02c7:
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r31 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r37 = 1
            r2 = r17
            r17 = -1
            r3 = r31
            r31 = r14
            r14 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r39 = r6
            r6 = r11
            r19 = 0
            r24 = 0
            r7 = r36
            r40 = r8
            r8 = r52
            r24 = r9
            r19 = r10
            r9 = r29
            r0 = r11
            r49 = r13
            r13 = -1
            r11 = r18
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r40
            r11.f12556b = r1
            r47 = r49
            r35 = r0
            r0 = r11
            r25 = r12
            r30 = r14
            r23 = r31
            r29 = r38
            goto L_0x0376
        L_0x0314:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x031a:
            r38 = r5
            r39 = r6
            r24 = r9
            r19 = r10
            r0 = r11
            r49 = r13
            r31 = r14
            r13 = -1
            r14 = r4
            r11 = r8
            r10 = r38
            int r5 = r10 + 8
            r9 = 8
            int r5 = r5 + r9
            r12.c(r5)
            if (r53 == 0) goto L_0x033f
            int r2 = r12.h()
            r4 = 6
            r12.d(r4)
            goto L_0x0343
        L_0x033f:
            r12.d(r9)
            r2 = 0
        L_0x0343:
            if (r2 == 0) goto L_0x0382
            r8 = 1
            if (r2 != r8) goto L_0x034a
            r7 = 2
            goto L_0x0384
        L_0x034a:
            r7 = 2
            if (r2 != r7) goto L_0x0369
            r2 = 16
            r12.d(r2)
            long r4 = r12.e()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            long r4 = java.lang.Math.round(r4)
            int r2 = (int) r4
            int r4 = r12.o()
            r5 = 20
            r12.d(r5)
            goto L_0x0398
        L_0x0369:
            r47 = r49
            r35 = r0
            r29 = r10
            r0 = r11
            r25 = r12
            r30 = r14
            r23 = r31
        L_0x0376:
            r36 = r39
        L_0x0378:
            r16 = 3
            r17 = -1
            r18 = 0
        L_0x037e:
            r31 = 16
            goto L_0x079a
        L_0x0382:
            r7 = 2
            r8 = 1
        L_0x0384:
            int r4 = r12.h()
            r5 = 6
            r12.d(r5)
            int r5 = r12.n()
            if (r2 != r8) goto L_0x0397
            r2 = 16
            r12.d(r2)
        L_0x0397:
            r2 = r5
        L_0x0398:
            int r5 = r12.b()
            int r6 = com.google.android.gms.internal.ads.C2379pka.aa
            if (r1 != r6) goto L_0x03aa
            r6 = r39
            int r1 = a((com.google.android.gms.internal.ads.Nma) r12, (int) r10, (int) r14, (com.google.android.gms.internal.ads.C2804vka) r11, (int) r6)
            r12.c(r5)
            goto L_0x03ac
        L_0x03aa:
            r6 = r39
        L_0x03ac:
            int r7 = com.google.android.gms.internal.ads.C2379pka.n
            if (r1 != r7) goto L_0x03b3
            java.lang.String r1 = "audio/ac3"
            goto L_0x03fd
        L_0x03b3:
            int r7 = com.google.android.gms.internal.ads.C2379pka.p
            if (r1 != r7) goto L_0x03ba
            java.lang.String r1 = "audio/eac3"
            goto L_0x03fd
        L_0x03ba:
            int r7 = com.google.android.gms.internal.ads.C2379pka.r
            if (r1 != r7) goto L_0x03c1
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03fd
        L_0x03c1:
            int r7 = com.google.android.gms.internal.ads.C2379pka.s
            if (r1 == r7) goto L_0x03fb
            int r7 = com.google.android.gms.internal.ads.C2379pka.t
            if (r1 != r7) goto L_0x03ca
            goto L_0x03fb
        L_0x03ca:
            int r7 = com.google.android.gms.internal.ads.C2379pka.u
            if (r1 != r7) goto L_0x03d1
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03fd
        L_0x03d1:
            int r7 = com.google.android.gms.internal.ads.C2379pka.ya
            if (r1 != r7) goto L_0x03d8
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03fd
        L_0x03d8:
            int r7 = com.google.android.gms.internal.ads.C2379pka.za
            if (r1 != r7) goto L_0x03df
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03fd
        L_0x03df:
            int r7 = com.google.android.gms.internal.ads.C2379pka.l
            if (r1 == r7) goto L_0x03f8
            int r7 = com.google.android.gms.internal.ads.C2379pka.m
            if (r1 != r7) goto L_0x03e8
            goto L_0x03f8
        L_0x03e8:
            int r7 = com.google.android.gms.internal.ads.C2379pka.j
            if (r1 != r7) goto L_0x03ef
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03fd
        L_0x03ef:
            int r7 = com.google.android.gms.internal.ads.C2379pka.Oa
            if (r1 != r7) goto L_0x03f6
            java.lang.String r1 = "audio/alac"
            goto L_0x03fd
        L_0x03f6:
            r1 = 0
            goto L_0x03fd
        L_0x03f8:
            java.lang.String r1 = "audio/raw"
            goto L_0x03fd
        L_0x03fb:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03fd:
            r18 = r2
            r17 = r4
            r7 = r5
            r29 = 0
            r5 = r1
        L_0x0405:
            int r1 = r7 - r10
            if (r1 >= r14) goto L_0x053e
            r12.c(r7)
            int r4 = r12.d()
            if (r4 <= 0) goto L_0x0414
            r1 = 1
            goto L_0x0415
        L_0x0414:
            r1 = 0
        L_0x0415:
            com.google.android.gms.internal.ads.Cma.a(r1, r3)
            int r1 = r12.d()
            int r2 = com.google.android.gms.internal.ads.C2379pka.J
            if (r1 == r2) goto L_0x04bf
            if (r53 == 0) goto L_0x0428
            int r2 = com.google.android.gms.internal.ads.C2379pka.k
            if (r1 != r2) goto L_0x0428
            goto L_0x04bf
        L_0x0428:
            int r2 = com.google.android.gms.internal.ads.C2379pka.o
            if (r1 != r2) goto L_0x044a
            int r1 = r7 + 8
            r12.c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r22)
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads._ia.a(r12, r1, r0, r15)
        L_0x0439:
            r11.f12556b = r1
            r13 = r3
            r2 = r4
            r42 = r5
            r43 = r6
            r5 = r7
            r46 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            goto L_0x04bc
        L_0x044a:
            int r2 = com.google.android.gms.internal.ads.C2379pka.q
            if (r1 != r2) goto L_0x045c
            int r1 = r7 + 8
            r12.c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r22)
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads._ia.b(r12, r1, r0, r15)
            goto L_0x0439
        L_0x045c:
            int r2 = com.google.android.gms.internal.ads.C2379pka.v
            if (r1 != r2) goto L_0x0495
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r30 = 0
            r34 = -1
            r35 = -1
            r36 = 0
            r37 = 0
            r2 = r5
            r13 = r3
            r3 = r30
            r41 = r4
            r4 = r34
            r42 = r5
            r5 = r35
            r43 = r6
            r6 = r17
            r44 = r7
            r16 = 2
            r7 = r18
            r8 = r36
            r9 = r52
            r46 = r10
            r10 = r37
            r15 = r11
            r11 = r0
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f12556b = r1
            goto L_0x04b7
        L_0x0495:
            r13 = r3
            r41 = r4
            r42 = r5
            r43 = r6
            r44 = r7
            r46 = r10
            r15 = r11
            r16 = 2
            int r2 = com.google.android.gms.internal.ads.C2379pka.Oa
            if (r1 != r2) goto L_0x04b7
            r2 = r41
            byte[] r1 = new byte[r2]
            r5 = r44
            r12.c(r5)
            r11 = 0
            r12.a(r1, r11, r2)
            r29 = r1
            goto L_0x04bc
        L_0x04b7:
            r2 = r41
            r5 = r44
            r11 = 0
        L_0x04bc:
            r10 = -1
            goto L_0x052c
        L_0x04bf:
            r13 = r3
            r2 = r4
            r42 = r5
            r43 = r6
            r5 = r7
            r46 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            int r3 = com.google.android.gms.internal.ads.C2379pka.J
            if (r1 != r3) goto L_0x04d3
            r1 = r5
        L_0x04d1:
            r10 = -1
            goto L_0x04f7
        L_0x04d3:
            int r1 = r12.b()
        L_0x04d7:
            int r3 = r1 - r5
            if (r3 >= r2) goto L_0x04f5
            r12.c(r1)
            int r3 = r12.d()
            if (r3 <= 0) goto L_0x04e6
            r4 = 1
            goto L_0x04e7
        L_0x04e6:
            r4 = 0
        L_0x04e7:
            com.google.android.gms.internal.ads.Cma.a(r4, r13)
            int r4 = r12.d()
            int r6 = com.google.android.gms.internal.ads.C2379pka.J
            if (r4 != r6) goto L_0x04f3
            goto L_0x04d1
        L_0x04f3:
            int r1 = r1 + r3
            goto L_0x04d7
        L_0x04f5:
            r1 = -1
            goto L_0x04d1
        L_0x04f7:
            if (r1 == r10) goto L_0x0528
            android.util.Pair r1 = a((com.google.android.gms.internal.ads.Nma) r12, (int) r1)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            r29 = r1
            byte[] r29 = (byte[]) r29
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x052a
            android.util.Pair r1 = com.google.android.gms.internal.ads.Fma.a((byte[]) r29)
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r17 = r1
            r18 = r4
            goto L_0x052a
        L_0x0528:
            r3 = r42
        L_0x052a:
            r42 = r3
        L_0x052c:
            int r7 = r5 + r2
            r3 = r13
            r11 = r15
            r5 = r42
            r6 = r43
            r10 = r46
            r8 = 1
            r9 = 8
            r13 = -1
            r15 = r52
            goto L_0x0405
        L_0x053e:
            r42 = r5
            r43 = r6
            r46 = r10
            r15 = r11
            r10 = -1
            r11 = 0
            r16 = 2
            com.google.android.gms.internal.ads.Lia r1 = r15.f12556b
            if (r1 != 0) goto L_0x0581
            r2 = r42
            if (r2 == 0) goto L_0x0581
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x055b
            r8 = 2
            goto L_0x055c
        L_0x055b:
            r8 = -1
        L_0x055c:
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r3 = 0
            r4 = -1
            r5 = -1
            if (r29 != 0) goto L_0x0567
            r9 = 0
            goto L_0x056c
        L_0x0567:
            java.util.List r6 = java.util.Collections.singletonList(r29)
            r9 = r6
        L_0x056c:
            r13 = 0
            r6 = r17
            r7 = r18
            r17 = -1
            r10 = r52
            r18 = 0
            r11 = r13
            r13 = r12
            r12 = r0
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.f12556b = r1
            goto L_0x0586
        L_0x0581:
            r13 = r12
            r17 = -1
            r18 = 0
        L_0x0586:
            r47 = r49
            r35 = r0
            r25 = r13
            r30 = r14
            r0 = r15
            r23 = r31
            r36 = r43
            r29 = r46
        L_0x0595:
            r16 = 3
            goto L_0x037e
        L_0x0599:
            r46 = r5
            r43 = r6
            r15 = r8
            r24 = r9
            r19 = r10
            r0 = r11
            r49 = r13
            r31 = r14
            r17 = -1
            r18 = 0
            r13 = r3
            r14 = r4
            r11 = r46
            int r5 = r11 + 8
            r10 = 8
            int r5 = r5 + r10
            r12.c(r5)
            r9 = 16
            r12.d(r9)
            int r6 = r12.h()
            int r7 = r12.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r12.d(r3)
            int r3 = r12.b()
            int r4 = com.google.android.gms.internal.ads.C2379pka.Z
            if (r1 != r4) goto L_0x05dd
            r8 = r43
            int r1 = a((com.google.android.gms.internal.ads.Nma) r12, (int) r11, (int) r14, (com.google.android.gms.internal.ads.C2804vka) r15, (int) r8)
            r12.c(r3)
            goto L_0x05df
        L_0x05dd:
            r8 = r43
        L_0x05df:
            r2 = 0
            r4 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r23 = -1
            r29 = 0
            r30 = 0
        L_0x05e9:
            int r5 = r3 - r11
            if (r5 >= r14) goto L_0x0749
            r12.c(r3)
            int r5 = r12.b()
            int r9 = r12.d()
            if (r9 != 0) goto L_0x0602
            int r35 = r12.b()
            int r10 = r35 - r11
            if (r10 == r14) goto L_0x0749
        L_0x0602:
            if (r9 <= 0) goto L_0x0606
            r10 = 1
            goto L_0x0607
        L_0x0606:
            r10 = 0
        L_0x0607:
            com.google.android.gms.internal.ads.Cma.a(r10, r13)
            int r10 = r12.d()
            r35 = r0
            int r0 = com.google.android.gms.internal.ads.C2379pka.H
            if (r10 != r0) goto L_0x0634
            if (r2 != 0) goto L_0x0618
            r0 = 1
            goto L_0x0619
        L_0x0618:
            r0 = 0
        L_0x0619:
            com.google.android.gms.internal.ads.Cma.b(r0)
            int r5 = r5 + 8
            r12.c(r5)
            com.google.android.gms.internal.ads.Vma r0 = com.google.android.gms.internal.ads.Vma.a(r12)
            java.util.List<byte[]> r2 = r0.f9086a
            int r5 = r0.f9087b
            r15.f12557c = r5
            if (r4 != 0) goto L_0x0631
            float r0 = r0.f9090e
            r16 = r0
        L_0x0631:
            java.lang.String r0 = "video/avc"
            goto L_0x0651
        L_0x0634:
            int r0 = com.google.android.gms.internal.ads.C2379pka.I
            if (r10 != r0) goto L_0x065d
            if (r2 != 0) goto L_0x063c
            r0 = 1
            goto L_0x063d
        L_0x063c:
            r0 = 0
        L_0x063d:
            com.google.android.gms.internal.ads.Cma.b(r0)
            int r5 = r5 + 8
            r12.c(r5)
            com.google.android.gms.internal.ads.bna r0 = com.google.android.gms.internal.ads.C1393bna.a(r12)
            java.util.List<byte[]> r2 = r0.f9968a
            int r0 = r0.f9969b
            r15.f12557c = r0
            java.lang.String r0 = "video/hevc"
        L_0x0651:
            r36 = r1
            r29 = r2
            r45 = r4
            r4 = 2
            r5 = 1
            r10 = 3
            r2 = r0
            goto L_0x073c
        L_0x065d:
            int r0 = com.google.android.gms.internal.ads.C2379pka.Ma
            if (r10 != r0) goto L_0x0674
            if (r2 != 0) goto L_0x0665
            r0 = 1
            goto L_0x0666
        L_0x0665:
            r0 = 0
        L_0x0666:
            com.google.android.gms.internal.ads.Cma.b(r0)
            int r0 = com.google.android.gms.internal.ads.C2379pka.Ka
            if (r1 != r0) goto L_0x0670
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0672
        L_0x0670:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0672:
            r2 = r0
            goto L_0x0682
        L_0x0674:
            int r0 = com.google.android.gms.internal.ads.C2379pka.f11750g
            if (r10 != r0) goto L_0x068b
            if (r2 != 0) goto L_0x067c
            r0 = 1
            goto L_0x067d
        L_0x067c:
            r0 = 0
        L_0x067d:
            com.google.android.gms.internal.ads.Cma.b(r0)
            java.lang.String r2 = "video/3gpp"
        L_0x0682:
            r36 = r1
            r45 = r4
        L_0x0686:
            r4 = 2
            r5 = 1
            r10 = 3
            goto L_0x073c
        L_0x068b:
            int r0 = com.google.android.gms.internal.ads.C2379pka.J
            if (r10 != r0) goto L_0x06a8
            if (r2 != 0) goto L_0x0693
            r0 = 1
            goto L_0x0694
        L_0x0693:
            r0 = 0
        L_0x0694:
            com.google.android.gms.internal.ads.Cma.b(r0)
            android.util.Pair r0 = a((com.google.android.gms.internal.ads.Nma) r12, (int) r5)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r29 = java.util.Collections.singletonList(r0)
            goto L_0x0682
        L_0x06a8:
            int r0 = com.google.android.gms.internal.ads.C2379pka.ia
            if (r10 != r0) goto L_0x06c6
            int r5 = r5 + 8
            r12.c(r5)
            int r0 = r12.o()
            int r4 = r12.o()
            float r0 = (float) r0
            float r4 = (float) r4
            float r16 = r0 / r4
            r36 = r1
            r4 = 2
            r5 = 1
            r10 = 3
            r45 = 1
            goto L_0x073c
        L_0x06c6:
            int r0 = com.google.android.gms.internal.ads.C2379pka.Ia
            if (r10 != r0) goto L_0x06fc
            int r0 = r5 + 8
        L_0x06cc:
            int r10 = r0 - r5
            if (r10 >= r9) goto L_0x06f3
            r12.c(r0)
            int r10 = r12.d()
            r36 = r1
            int r1 = r12.d()
            r50 = r4
            int r4 = com.google.android.gms.internal.ads.C2379pka.Ja
            if (r1 != r4) goto L_0x06ed
            byte[] r1 = r12.f8013a
            int r10 = r10 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r10)
            r30 = r0
            goto L_0x06f9
        L_0x06ed:
            int r0 = r0 + r10
            r4 = r50
            r1 = r36
            goto L_0x06cc
        L_0x06f3:
            r36 = r1
            r50 = r4
            r30 = 0
        L_0x06f9:
            r45 = r50
            goto L_0x0686
        L_0x06fc:
            r36 = r1
            r50 = r4
            int r0 = com.google.android.gms.internal.ads.C2379pka.Ha
            if (r10 != r0) goto L_0x0737
            int r0 = r12.g()
            r10 = 3
            r12.d(r10)
            if (r0 != 0) goto L_0x0734
            int r0 = r12.g()
            if (r0 == 0) goto L_0x072d
            r5 = 1
            if (r0 == r5) goto L_0x0727
            r4 = 2
            if (r0 == r4) goto L_0x0722
            if (r0 == r10) goto L_0x071d
            goto L_0x073a
        L_0x071d:
            r45 = r50
            r23 = 3
            goto L_0x073c
        L_0x0722:
            r45 = r50
            r23 = 2
            goto L_0x073c
        L_0x0727:
            r4 = 2
            r45 = r50
            r23 = 1
            goto L_0x073c
        L_0x072d:
            r4 = 2
            r5 = 1
            r45 = r50
            r23 = 0
            goto L_0x073c
        L_0x0734:
            r4 = 2
            r5 = 1
            goto L_0x073a
        L_0x0737:
            r4 = 2
            r5 = 1
            r10 = 3
        L_0x073a:
            r45 = r50
        L_0x073c:
            int r3 = r3 + r9
            r0 = r35
            r1 = r36
            r4 = r45
            r9 = 16
            r10 = 8
            goto L_0x05e9
        L_0x0749:
            r35 = r0
            r4 = 2
            r5 = 1
            r10 = 3
            if (r2 == 0) goto L_0x078b
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r3 = 0
            r0 = -1
            r9 = -1
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r25 = 0
            r4 = r0
            r0 = 1
            r5 = r9
            r36 = r8
            r8 = r13
            r34 = 16
            r9 = r29
            r0 = 8
            r13 = 3
            r10 = r28
            r29 = r11
            r11 = r16
            r0 = r12
            r12 = r30
            r47 = r49
            r16 = 3
            r13 = r23
            r30 = r14
            r23 = r31
            r31 = 16
            r14 = r25
            r25 = r0
            r0 = r15
            r15 = r52
            com.google.android.gms.internal.ads.Lia r1 = com.google.android.gms.internal.ads.Lia.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f12556b = r1
            goto L_0x079a
        L_0x078b:
            r47 = r49
            r36 = r8
            r29 = r11
            r25 = r12
            r30 = r14
            r0 = r15
            r23 = r31
            goto L_0x0595
        L_0x079a:
            int r5 = r29 + r30
            r1 = r25
            r1.c(r5)
            int r6 = r36 + 1
            r15 = r52
            r8 = r0
            r12 = r1
            r10 = r19
            r14 = r23
            r9 = r24
            r11 = r35
            r13 = r47
            r7 = 8
            r0 = r48
            goto L_0x01b6
        L_0x07b7:
            r0 = r8
            r19 = r10
            r47 = r13
            r23 = r14
            r18 = 0
            int r1 = com.google.android.gms.internal.ads.C2379pka.P
            r2 = r48
            com.google.android.gms.internal.ads.ska r1 = r2.e(r1)
            if (r1 == 0) goto L_0x0825
            int r2 = com.google.android.gms.internal.ads.C2379pka.Q
            com.google.android.gms.internal.ads.rka r1 = r1.d(r2)
            if (r1 != 0) goto L_0x07d3
            goto L_0x0825
        L_0x07d3:
            com.google.android.gms.internal.ads.Nma r1 = r1.Qa
            r2 = 8
            r1.c(r2)
            int r2 = r1.d()
            int r2 = com.google.android.gms.internal.ads.C2379pka.a(r2)
            int r3 = r1.o()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r6 = 0
        L_0x07eb:
            if (r6 >= r3) goto L_0x081e
            r7 = 1
            if (r2 != r7) goto L_0x07f5
            long r8 = r1.p()
            goto L_0x07f9
        L_0x07f5:
            long r8 = r1.l()
        L_0x07f9:
            r4[r6] = r8
            if (r2 != r7) goto L_0x0802
            long r8 = r1.e()
            goto L_0x0807
        L_0x0802:
            int r8 = r1.d()
            long r8 = (long) r8
        L_0x0807:
            r5[r6] = r8
            short r8 = r1.f()
            if (r8 != r7) goto L_0x0816
            r8 = 2
            r1.d(r8)
            int r6 = r6 + 1
            goto L_0x07eb
        L_0x0816:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x081e:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x082a
        L_0x0825:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x082a:
            com.google.android.gms.internal.ads.Lia r3 = r0.f12556b
            if (r3 != 0) goto L_0x082f
            return r1
        L_0x082f:
            com.google.android.gms.internal.ads.Mka r1 = new com.google.android.gms.internal.ads.Mka
            int r16 = r23.f6353a
            r3 = r47
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.android.gms.internal.ads.Lia r5 = r0.f12556b
            int r6 = r0.f12558d
            com.google.android.gms.internal.ads.Pka[] r7 = r0.f12555a
            int r0 = r0.f12557c
            java.lang.Object r8 = r2.first
            r28 = r8
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r19
            r18 = r3
            r20 = r32
            r22 = r26
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2733uka.a(com.google.android.gms.internal.ads.ska, com.google.android.gms.internal.ads.rka, long, com.google.android.gms.internal.ads.Lja, boolean):com.google.android.gms.internal.ads.Mka");
    }

    public static Rka a(Mka mka, C2591ska ska, Yja yja) {
        C2875wka wka;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        long j2;
        long[] jArr3;
        int[] iArr3;
        boolean z2;
        int i5;
        long[] jArr4;
        int[] iArr4;
        int[] iArr5;
        int i6;
        int i7;
        Mka mka2 = mka;
        C2591ska ska2 = ska;
        Yja yja2 = yja;
        C2520rka d2 = ska2.d(C2379pka.qa);
        if (d2 != null) {
            wka = new C3088zka(d2);
        } else {
            C2520rka d3 = ska2.d(C2379pka.ra);
            if (d3 != null) {
                wka = new C3017yka(d3);
            } else {
                throw new Sia("Track has no sample table size information");
            }
        }
        int c2 = wka.c();
        if (c2 == 0) {
            return new Rka(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        C2520rka d4 = ska2.d(C2379pka.sa);
        if (d4 == null) {
            d4 = ska2.d(C2379pka.ta);
            z = true;
        } else {
            z = false;
        }
        Nma nma = d4.Qa;
        Nma nma2 = ska2.d(C2379pka.pa).Qa;
        Nma nma3 = ska2.d(C2379pka.ma).Qa;
        C2520rka d5 = ska2.d(C2379pka.na);
        Nma nma4 = d5 != null ? d5.Qa : null;
        C2520rka d6 = ska2.d(C2379pka.oa);
        Nma nma5 = d6 != null ? d6.Qa : null;
        C2662tka tka = new C2662tka(nma2, nma, z);
        nma3.c(12);
        int o = nma3.o() - 1;
        int o2 = nma3.o();
        int o3 = nma3.o();
        if (nma5 != null) {
            nma5.c(12);
            i = nma5.o();
        } else {
            i = 0;
        }
        int i8 = -1;
        if (nma4 != null) {
            nma4.c(12);
            i2 = nma4.o();
            if (i2 > 0) {
                i8 = nma4.o() - 1;
            } else {
                nma4 = null;
            }
        } else {
            i2 = 0;
        }
        long j3 = 0;
        if (!(wka.b() && "audio/raw".equals(mka2.f7890f.f7712f) && o == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[c2];
            iArr = new int[c2];
            jArr = new long[c2];
            int i9 = i2;
            iArr2 = new int[c2];
            int i10 = i9;
            Nma nma6 = nma3;
            int i11 = o3;
            int i12 = i;
            int i13 = i8;
            long j4 = 0;
            long j5 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = o2;
            int i19 = o;
            int i20 = 0;
            while (i20 < c2) {
                long j6 = j4;
                int i21 = i14;
                while (i21 == 0) {
                    Cma.b(tka.a());
                    j6 = tka.f12239d;
                    i21 = tka.f12238c;
                    i19 = i19;
                    i11 = i11;
                }
                int i22 = i19;
                int i23 = i11;
                if (nma5 != null) {
                    while (i17 == 0 && i12 > 0) {
                        i17 = nma5.o();
                        i16 = nma5.d();
                        i12--;
                    }
                    i17--;
                }
                int i24 = i16;
                jArr2[i20] = j6;
                iArr[i20] = wka.a();
                if (iArr[i20] > i15) {
                    i6 = c2;
                    i15 = iArr[i20];
                } else {
                    i6 = c2;
                }
                C2875wka wka2 = wka;
                jArr[i20] = j5 + ((long) i24);
                iArr2[i20] = nma4 == null ? 1 : 0;
                if (i20 == i13) {
                    iArr2[i20] = 1;
                    i10--;
                    if (i10 > 0) {
                        i13 = nma4.o() - 1;
                    }
                }
                int i25 = i10;
                int i26 = i13;
                int i27 = i23;
                j5 += (long) i27;
                i18--;
                if (i18 != 0 || i22 <= 0) {
                    i7 = i22;
                } else {
                    i7 = i22 - 1;
                    i18 = nma6.o();
                    i27 = nma6.o();
                }
                int i28 = i7;
                i20++;
                i13 = i26;
                c2 = i6;
                i14 = i21 - 1;
                i16 = i24;
                i19 = i28;
                j4 = j6 + ((long) iArr[i20]);
                C2875wka wka3 = wka2;
                i11 = i27;
                i10 = i25;
                wka = wka3;
            }
            i4 = c2;
            int i29 = i19;
            Cma.a(i17 == 0);
            while (i12 > 0) {
                Cma.a(nma5.o() == 0);
                nma5.d();
                i12--;
            }
            if (i10 == 0 && i18 == 0 && i14 == 0 && i29 == 0) {
                mka2 = mka;
            } else {
                int i30 = i10;
                mka2 = mka;
                int i31 = mka2.f7885a;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i31);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i30);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i18);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i14);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i29);
                Log.w("AtomParsers", sb.toString());
            }
            j = j5;
            i3 = i15;
        } else {
            i4 = c2;
            C2875wka wka4 = wka;
            int i32 = tka.f12236a;
            long[] jArr5 = new long[i32];
            int[] iArr6 = new int[i32];
            while (tka.a()) {
                int i33 = tka.f12237b;
                jArr5[i33] = tka.f12239d;
                iArr6[i33] = tka.f12238c;
            }
            int a2 = wka4.a();
            long j7 = (long) o3;
            int i34 = 8192 / a2;
            int i35 = 0;
            for (int a3 : iArr6) {
                i35 += Tma.a(a3, i34);
            }
            long[] jArr6 = new long[i35];
            int[] iArr7 = new int[i35];
            long[] jArr7 = new long[i35];
            int[] iArr8 = new int[i35];
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i36 < iArr6.length) {
                int i40 = iArr6[i36];
                long j8 = jArr5[i36];
                int i41 = i37;
                int i42 = i39;
                while (i40 > 0) {
                    int min = Math.min(i34, i40);
                    jArr6[i38] = j8;
                    iArr7[i38] = a2 * min;
                    i42 = Math.max(i42, iArr7[i38]);
                    jArr7[i38] = ((long) i41) * j7;
                    iArr8[i38] = 1;
                    j8 += (long) iArr7[i38];
                    i41 += min;
                    i40 -= min;
                    i38++;
                    iArr6 = iArr6;
                    jArr5 = jArr5;
                }
                int[] iArr9 = iArr6;
                long[] jArr8 = jArr5;
                i36++;
                i39 = i42;
                i37 = i41;
            }
            Cka cka = new Cka(jArr6, iArr7, i39, jArr7, iArr8);
            jArr2 = cka.f6460a;
            iArr = cka.f6461b;
            int i43 = cka.f6462c;
            jArr = cka.f6463d;
            iArr2 = cka.f6464e;
            i3 = i43;
            j = 0;
        }
        if (mka2.i == null || yja.a()) {
            Tma.a(jArr, 1000000, mka2.f7887c);
            return new Rka(jArr2, iArr, i3, jArr, iArr2);
        }
        long[] jArr9 = mka2.i;
        if (jArr9.length == 1 && mka2.f7886b == 1 && jArr.length >= 2) {
            long j9 = mka2.j[0];
            long a4 = Tma.a(jArr9[0], mka2.f7887c, mka2.f7888d) + j9;
            if (jArr[0] <= j9 && j9 < jArr[1] && jArr[jArr.length - 1] < a4 && a4 <= j) {
                long j10 = j - a4;
                long a5 = Tma.a(j9 - jArr[0], (long) mka2.f7890f.s, mka2.f7887c);
                long a6 = Tma.a(j10, (long) mka2.f7890f.s, mka2.f7887c);
                if (!(a5 == 0 && a6 == 0) && a5 <= 2147483647L && a6 <= 2147483647L) {
                    int i44 = (int) a5;
                    Yja yja3 = yja;
                    yja3.f9454c = i44;
                    yja3.f9455d = (int) a6;
                    Tma.a(jArr, 1000000, mka2.f7887c);
                    return new Rka(jArr2, iArr, i3, jArr, iArr2);
                }
            }
        }
        long[] jArr10 = mka2.i;
        if (jArr10.length == 1) {
            char c3 = 0;
            if (jArr10[0] == 0) {
                int i45 = 0;
                while (i45 < jArr.length) {
                    jArr[i45] = Tma.a(jArr[i45] - mka2.j[c3], 1000000, mka2.f7887c);
                    i45++;
                    c3 = 0;
                }
                return new Rka(jArr2, iArr, i3, jArr, iArr2);
            }
        }
        boolean z3 = mka2.f7886b == 1;
        int i46 = 0;
        boolean z4 = false;
        int i47 = 0;
        int i48 = 0;
        while (true) {
            long[] jArr11 = mka2.i;
            j2 = -1;
            if (i46 >= jArr11.length) {
                break;
            }
            int[] iArr10 = iArr;
            long j11 = mka2.j[i46];
            if (j11 != -1) {
                long a7 = Tma.a(jArr11[i46], mka2.f7887c, mka2.f7888d);
                int b2 = Tma.b(jArr, j11, true, true);
                int b3 = Tma.b(jArr, j11 + a7, z3, false);
                i47 += b3 - b2;
                z4 |= i48 != b2;
                i48 = b3;
            }
            i46++;
            iArr = iArr10;
        }
        int[] iArr11 = iArr;
        boolean z5 = (i47 != i4) | z4;
        long[] jArr12 = z5 ? new long[i47] : jArr2;
        int[] iArr12 = z5 ? new int[i47] : iArr11;
        if (z5) {
            i3 = 0;
        }
        int[] iArr13 = z5 ? new int[i47] : iArr2;
        long[] jArr13 = new long[i47];
        int i49 = i3;
        int i50 = 0;
        int i51 = 0;
        while (true) {
            long[] jArr14 = mka2.i;
            if (i50 >= jArr14.length) {
                break;
            }
            long[] jArr15 = jArr12;
            long[] jArr16 = jArr13;
            long j12 = mka2.j[i50];
            long j13 = jArr14[i50];
            if (j12 != j2) {
                long j14 = mka2.f7887c;
                iArr4 = iArr13;
                i5 = i50;
                int b4 = Tma.b(jArr, j12, true, true);
                int b5 = Tma.b(jArr, Tma.a(j13, j14, mka2.f7888d) + j12, z3, false);
                if (z5) {
                    int i52 = b5 - b4;
                    jArr4 = jArr15;
                    System.arraycopy(jArr2, b4, jArr4, i51, i52);
                    z2 = z3;
                    iArr5 = iArr11;
                    System.arraycopy(iArr5, b4, iArr12, i51, i52);
                    System.arraycopy(iArr2, b4, iArr4, i51, i52);
                } else {
                    jArr4 = jArr15;
                    z2 = z3;
                    iArr5 = iArr11;
                }
                int i53 = i49;
                while (b4 < b5) {
                    long[] jArr17 = jArr2;
                    int[] iArr14 = iArr2;
                    long j15 = j12;
                    jArr16[i51] = Tma.a(j3, 1000000, mka2.f7888d) + Tma.a(jArr[b4] - j12, 1000000, mka2.f7887c);
                    if (z5 && iArr12[i51] > i53) {
                        i53 = iArr5[b4];
                    }
                    i51++;
                    b4++;
                    jArr2 = jArr17;
                    j12 = j15;
                    iArr2 = iArr14;
                }
                jArr3 = jArr2;
                iArr3 = iArr2;
                i49 = i53;
            } else {
                iArr3 = iArr2;
                iArr4 = iArr13;
                i5 = i50;
                jArr4 = jArr15;
                z2 = z3;
                iArr5 = iArr11;
                jArr3 = jArr2;
            }
            j3 += j13;
            i50 = i5 + 1;
            jArr2 = jArr3;
            iArr11 = iArr5;
            iArr13 = iArr4;
            jArr12 = jArr4;
            z3 = z2;
            iArr2 = iArr3;
            jArr13 = jArr16;
            j2 = -1;
        }
        long[] jArr18 = jArr12;
        long[] jArr19 = jArr13;
        int[] iArr15 = iArr13;
        boolean z6 = false;
        for (int i54 = 0; i54 < iArr15.length && !z6; i54++) {
            z6 |= (iArr15[i54] & 1) != 0;
        }
        if (z6) {
            return new Rka(jArr18, iArr12, i49, jArr19, iArr15);
        }
        throw new Sia("The edited sample sequence does not contain a sync sample.");
    }

    public static C1389bla a(C2520rka rka, boolean z) {
        if (z) {
            return null;
        }
        Nma nma = rka.Qa;
        nma.c(8);
        while (nma.j() >= 8) {
            int b2 = nma.b();
            int d2 = nma.d();
            if (nma.d() == C2379pka.Ba) {
                nma.c(b2);
                int i = b2 + d2;
                nma.d(12);
                while (true) {
                    if (nma.b() >= i) {
                        break;
                    }
                    int b3 = nma.b();
                    int d3 = nma.d();
                    if (nma.d() == C2379pka.Ca) {
                        nma.c(b3);
                        int i2 = b3 + d3;
                        nma.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (nma.b() < i2) {
                            C1389bla.a a2 = Jka.a(nma);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new C1389bla((List<? extends C1389bla.a>) arrayList);
                        }
                    } else {
                        nma.d(d3 - 8);
                    }
                }
                return null;
            }
            nma.d(d2 - 8);
        }
        return null;
    }
}
