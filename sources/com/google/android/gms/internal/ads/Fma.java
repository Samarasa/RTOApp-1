package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class Fma {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f6911a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f6912b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f6913c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(Kma kma) {
        int a2 = kma.a(5);
        return a2 == 31 ? kma.a(6) + 32 : a2;
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        Kma kma = new Kma(bArr);
        int a2 = a(kma);
        int b2 = b(kma);
        int a3 = kma.a(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(kma);
            if (a(kma) == 22) {
                a3 = kma.a(4);
            }
        }
        int i = f6913c[a3];
        Cma.a(i != -1);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f6911a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f6911a.length, i2);
        return bArr3;
    }

    private static int b(Kma kma) {
        int a2 = kma.a(4);
        if (a2 == 15) {
            return kma.a(24);
        }
        Cma.a(a2 < 13);
        return f6912b[a2];
    }
}
