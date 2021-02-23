package c.b.b.b.d.f;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: c.b.b.b.d.f.ab  reason: case insensitive filesystem */
final class C0292ab {
    static int a(int i, byte[] bArr, int i2, int i3, Tb<?> tb, C0313db dbVar) {
        Ob ob = (Ob) tb;
        int a2 = a(bArr, i2, dbVar);
        while (true) {
            ob.j(dbVar.f4399a);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, dbVar);
            if (i != dbVar.f4399a) {
                break;
            }
            a2 = a(bArr, a3, dbVar);
        }
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, C0313db dbVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, dbVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, dbVar) + dbVar.f4399a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, dbVar);
                    i6 = dbVar.f4399a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, dbVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw Wb.e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw Wb.c();
            }
        } else {
            throw Wb.c();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, C0315dd ddVar, C0313db dbVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b2 = b(bArr, i2, dbVar);
                ddVar.a(i, (Object) Long.valueOf(dbVar.f4400b));
                return b2;
            } else if (i4 == 1) {
                ddVar.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a2 = a(bArr, i2, dbVar);
                int i5 = dbVar.f4399a;
                if (i5 < 0) {
                    throw Wb.b();
                } else if (i5 <= bArr.length - a2) {
                    ddVar.a(i, (Object) i5 == 0 ? C0320eb.f4416a : C0320eb.a(bArr, a2, i5));
                    return a2 + i5;
                } else {
                    throw Wb.a();
                }
            } else if (i4 == 3) {
                C0315dd b3 = C0315dd.b();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a3 = a(bArr, i2, dbVar);
                    int i8 = dbVar.f4399a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a3;
                        break;
                    }
                    i7 = i8;
                    i2 = a(i8, bArr, a3, i3, b3, dbVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw Wb.e();
                }
                ddVar.a(i, (Object) b3);
                return i2;
            } else if (i4 == 5) {
                ddVar.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw Wb.c();
            }
        } else {
            throw Wb.c();
        }
    }

    static int a(int i, byte[] bArr, int i2, C0313db dbVar) {
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
                                dbVar.f4399a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            dbVar.f4399a = i7 | i3;
            return i8;
        }
        dbVar.f4399a = i5 | i4;
        return i6;
    }

    static int a(Kc<?> kc, int i, byte[] bArr, int i2, int i3, Tb<?> tb, C0313db dbVar) {
        int a2 = a((Kc) kc, bArr, i2, i3, dbVar);
        while (true) {
            tb.add(dbVar.f4401c);
            if (a2 >= i3) {
                break;
            }
            int a3 = a(bArr, a2, dbVar);
            if (i != dbVar.f4399a) {
                break;
            }
            a2 = a((Kc) kc, bArr, a3, i3, dbVar);
        }
        return a2;
    }

    static int a(Kc kc, byte[] bArr, int i, int i2, int i3, C0313db dbVar) {
        C0465zc zcVar = (C0465zc) kc;
        Object a2 = zcVar.a();
        int a3 = zcVar.a(a2, bArr, i, i2, i3, dbVar);
        zcVar.f(a2);
        dbVar.f4401c = a2;
        return a3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(c.b.b.b.d.f.Kc r6, byte[] r7, int r8, int r9, c.b.b.b.d.f.C0313db r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = a((int) r8, (byte[]) r7, (int) r0, (c.b.b.b.d.f.C0313db) r10)
            int r8 = r10.f4399a
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
            r6.f(r9)
            r10.f4401c = r9
            return r8
        L_0x0025:
            c.b.b.b.d.f.Wb r6 = c.b.b.b.d.f.Wb.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0292ab.a(c.b.b.b.d.f.Kc, byte[], int, int, c.b.b.b.d.f.db):int");
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i, Tb<?> tb, C0313db dbVar) {
        Ob ob = (Ob) tb;
        int a2 = a(bArr, i, dbVar);
        int i2 = dbVar.f4399a + a2;
        while (a2 < i2) {
            a2 = a(bArr, a2, dbVar);
            ob.j(dbVar.f4399a);
        }
        if (a2 == i2) {
            return a2;
        }
        throw Wb.a();
    }

    static int a(byte[] bArr, int i, C0313db dbVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return a((int) b2, bArr, i2, dbVar);
        }
        dbVar.f4399a = b2;
        return i2;
    }

    static int b(byte[] bArr, int i, C0313db dbVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            dbVar.f4400b = j;
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
        dbVar.f4400b = j2;
        return i3;
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int c(byte[] bArr, int i, C0313db dbVar) {
        int a2 = a(bArr, i, dbVar);
        int i2 = dbVar.f4399a;
        if (i2 < 0) {
            throw Wb.b();
        } else if (i2 == 0) {
            dbVar.f4401c = BuildConfig.FLAVOR;
            return a2;
        } else {
            dbVar.f4401c = new String(bArr, a2, i2, Nb.f4241a);
            return a2 + i2;
        }
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int d(byte[] bArr, int i, C0313db dbVar) {
        int a2 = a(bArr, i, dbVar);
        int i2 = dbVar.f4399a;
        if (i2 < 0) {
            throw Wb.b();
        } else if (i2 == 0) {
            dbVar.f4401c = BuildConfig.FLAVOR;
            return a2;
        } else {
            dbVar.f4401c = C0356jd.b(bArr, a2, i2);
            return a2 + i2;
        }
    }

    static int e(byte[] bArr, int i, C0313db dbVar) {
        int a2 = a(bArr, i, dbVar);
        int i2 = dbVar.f4399a;
        if (i2 < 0) {
            throw Wb.b();
        } else if (i2 > bArr.length - a2) {
            throw Wb.a();
        } else if (i2 == 0) {
            dbVar.f4401c = C0320eb.f4416a;
            return a2;
        } else {
            dbVar.f4401c = C0320eb.a(bArr, a2, i2);
            return a2 + i2;
        }
    }
}
