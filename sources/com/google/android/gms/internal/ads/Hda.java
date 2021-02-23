package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class Hda {
    static int a(int i, byte[] bArr, int i2, int i3, Fea<?> fea, Kda kda) {
        C3005yea yea = (C3005yea) fea;
        int a2 = a(bArr, i2, kda);
        while (true) {
            yea.e(kda.f7572a);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, kda);
            if (i != kda.f7572a) {
                break;
            }
            a2 = a(bArr, a3, kda);
        }
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, Kda kda) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, kda);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, kda) + kda.f7572a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, kda);
                    i6 = kda.f7572a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, kda);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw Iea.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw Iea.d();
            }
        } else {
            throw Iea.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, Yfa yfa, Kda kda) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b2 = b(bArr, i2, kda);
                yfa.a(i, (Object) Long.valueOf(kda.f7573b));
                return b2;
            } else if (i4 == 1) {
                yfa.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a2 = a(bArr, i2, kda);
                int i5 = kda.f7572a;
                if (i5 < 0) {
                    throw Iea.b();
                } else if (i5 <= bArr.length - a2) {
                    yfa.a(i, (Object) i5 == 0 ? Lda.f7691a : Lda.a(bArr, a2, i5));
                    return a2 + i5;
                } else {
                    throw Iea.a();
                }
            } else if (i4 == 3) {
                Yfa d2 = Yfa.d();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a3 = a(bArr, i2, kda);
                    int i8 = kda.f7572a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a3;
                        break;
                    }
                    i7 = i8;
                    i2 = a(i8, bArr, a3, i3, d2, kda);
                }
                if (i2 > i3 || i7 != i6) {
                    throw Iea.h();
                }
                yfa.a(i, (Object) d2);
                return i2;
            } else if (i4 == 5) {
                yfa.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw Iea.d();
            }
        } else {
            throw Iea.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, Kda kda) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i3 = b3 << 14;
            } else {
                i5 = i7 | ((b3 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b4 = bArr[i8];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i7 = i5 | ((b4 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i3 = b5 << 28;
                    } else {
                        int i9 = i7 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                kda.f7572a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            kda.f7572a = i7 | i3;
            return i8;
        }
        kda.f7572a = i5 | i4;
        return i6;
    }

    static int a(Cfa<?> cfa, int i, byte[] bArr, int i2, int i3, Fea<?> fea, Kda kda) {
        int a2 = a((Cfa) cfa, bArr, i2, i3, kda);
        while (true) {
            fea.add(kda.f7574c);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, kda);
            if (i != kda.f7572a) {
                break;
            }
            a2 = a((Cfa) cfa, bArr, a3, i3, kda);
        }
        return a2;
    }

    static int a(Cfa cfa, byte[] bArr, int i, int i2, int i3, Kda kda) {
        C2085lfa lfa = (C2085lfa) cfa;
        Object a2 = lfa.a();
        int a3 = lfa.a(a2, bArr, i, i2, i3, kda);
        lfa.b(a2);
        kda.f7574c = a2;
        return a3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(com.google.android.gms.internal.ads.Cfa r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.Kda r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = a((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.ads.Kda) r10)
            int r8 = r10.f7572a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            r6.b(r9)
            r10.f7574c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.Iea r6 = com.google.android.gms.internal.ads.Iea.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Hda.a(com.google.android.gms.internal.ads.Cfa, byte[], int, int, com.google.android.gms.internal.ads.Kda):int");
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i, Fea<?> fea, Kda kda) {
        C3005yea yea = (C3005yea) fea;
        int a2 = a(bArr, i, kda);
        int i2 = kda.f7572a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, kda);
            yea.e(kda.f7572a);
        }
        if (a2 == i2) {
            return a2;
        }
        throw Iea.a();
    }

    static int a(byte[] bArr, int i, Kda kda) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return a((int) b2, bArr, i2, kda);
        }
        kda.f7572a = b2;
        return i2;
    }

    static int b(byte[] bArr, int i, Kda kda) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            kda.f7573b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b2 = b3;
            i3 = i6;
        }
        kda.f7573b = j2;
        return i3;
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int c(byte[] bArr, int i, Kda kda) {
        int a2 = a(bArr, i, kda);
        int i2 = kda.f7572a;
        if (i2 < 0) {
            throw Iea.b();
        } else if (i2 == 0) {
            kda.f7574c = BuildConfig.FLAVOR;
            return a2;
        } else {
            kda.f7574c = new String(bArr, a2, i2, Aea.f6145a);
            return a2 + i2;
        }
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int d(byte[] bArr, int i, Kda kda) {
        int a2 = a(bArr, i, kda);
        int i2 = kda.f7572a;
        if (i2 < 0) {
            throw Iea.b();
        } else if (i2 == 0) {
            kda.f7574c = BuildConfig.FLAVOR;
            return a2;
        } else {
            kda.f7574c = C1521dga.b(bArr, a2, i2);
            return a2 + i2;
        }
    }

    static int e(byte[] bArr, int i, Kda kda) {
        int a2 = a(bArr, i, kda);
        int i2 = kda.f7572a;
        if (i2 < 0) {
            throw Iea.b();
        } else if (i2 > bArr.length - a2) {
            throw Iea.a();
        } else if (i2 == 0) {
            kda.f7574c = Lda.f7691a;
            return a2;
        } else {
            kda.f7574c = Lda.a(bArr, a2, i2);
            return a2 + i2;
        }
    }
}
