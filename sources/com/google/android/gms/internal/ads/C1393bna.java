package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bna  reason: case insensitive filesystem */
public final class C1393bna {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f9968a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9969b;

    private C1393bna(List<byte[]> list, int i) {
        this.f9968a = list;
        this.f9969b = i;
    }

    public static C1393bna a(Nma nma) {
        try {
            nma.d(21);
            int g2 = nma.g() & 3;
            int g3 = nma.g();
            int b2 = nma.b();
            int i = 0;
            int i2 = 0;
            while (i < g3) {
                nma.d(1);
                int h2 = nma.h();
                int i3 = i2;
                for (int i4 = 0; i4 < h2; i4++) {
                    int h3 = nma.h();
                    i3 += h3 + 4;
                    nma.d(h3);
                }
                i++;
                i2 = i3;
            }
            nma.c(b2);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < g3) {
                nma.d(1);
                int h4 = nma.h();
                int i7 = i6;
                for (int i8 = 0; i8 < h4; i8++) {
                    int h5 = nma.h();
                    System.arraycopy(Ima.f7340a, 0, bArr, i7, Ima.f7340a.length);
                    int length = i7 + Ima.f7340a.length;
                    System.arraycopy(nma.f8013a, nma.b(), bArr, length, h5);
                    i7 = length + h5;
                    nma.d(h5);
                }
                i5++;
                i6 = i7;
            }
            return new C1393bna(i2 == 0 ? null : Collections.singletonList(bArr), g2 + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new Sia("Error parsing HEVC config", e2);
        }
    }
}
