package com.google.android.gms.internal.ads;

final class Nka {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8003a = {Tma.c("isom"), Tma.c("iso2"), Tma.c("iso3"), Tma.c("iso4"), Tma.c("iso5"), Tma.c("iso6"), Tma.c("avc1"), Tma.c("hvc1"), Tma.c("hev1"), Tma.c("mp41"), Tma.c("mp42"), Tma.c("3g2a"), Tma.c("3g2b"), Tma.c("3gr6"), Tma.c("3gs6"), Tma.c("3ge6"), Tma.c("3gg6"), Tma.c("M4V "), Tma.c("M4A "), Tma.c("f4v "), Tma.c("kddi"), Tma.c("M4VP"), Tma.c("qt  "), Tma.c("MSNV")};

    public static boolean a(Wja wja) {
        return a(wja, true);
    }

    private static boolean a(Wja wja, boolean z) {
        boolean z2;
        boolean z3;
        Wja wja2 = wja;
        long length = wja.getLength();
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i = (int) length;
        Nma nma = new Nma(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            nma.a(8);
            wja2.a(nma.f8013a, 0, 8);
            long l = nma.l();
            int d2 = nma.d();
            int i3 = 16;
            if (l == 1) {
                wja2.a(nma.f8013a, 8, 8);
                nma.b(16);
                l = nma.p();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (l >= j) {
                i2 += i3;
                if (d2 != C2379pka.B) {
                    if (d2 != C2379pka.K && d2 != C2379pka.M) {
                        if ((((long) i2) + l) - j >= ((long) i)) {
                            break;
                        }
                        int i4 = (int) (l - j);
                        i2 += i4;
                        if (d2 == C2379pka.f11744a) {
                            if (i4 < 8) {
                                return false;
                            }
                            nma.a(i4);
                            wja2.a(nma.f8013a, 0, i4);
                            int i5 = i4 / 4;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    break;
                                }
                                if (i6 == 1) {
                                    nma.d(4);
                                } else {
                                    int d3 = nma.d();
                                    if ((d3 >>> 8) != Tma.c("3gp")) {
                                        int[] iArr = f8003a;
                                        int length2 = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length2) {
                                                z3 = false;
                                                break;
                                            } else if (iArr[i7] == d3) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    if (z3) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                i6++;
                            }
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            wja2.a(i4);
                        }
                    } else {
                        z2 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }

    public static boolean b(Wja wja) {
        return a(wja, false);
    }
}
