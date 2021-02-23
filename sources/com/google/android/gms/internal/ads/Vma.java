package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class Vma {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f9086a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9087b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9088c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9089d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9090e;

    private Vma(List<byte[]> list, int i, int i2, int i3, float f2) {
        this.f9086a = list;
        this.f9087b = i;
        this.f9088c = i2;
        this.f9089d = i3;
        this.f9090e = f2;
    }

    public static Vma a(Nma nma) {
        float f2;
        int i;
        int i2;
        try {
            nma.d(4);
            int g2 = (nma.g() & 3) + 1;
            if (g2 != 3) {
                ArrayList arrayList = new ArrayList();
                int g3 = nma.g() & 31;
                for (int i3 = 0; i3 < g3; i3++) {
                    arrayList.add(b(nma));
                }
                int g4 = nma.g();
                for (int i4 = 0; i4 < g4; i4++) {
                    arrayList.add(b(nma));
                }
                if (g3 > 0) {
                    Lma a2 = Ima.a((byte[]) arrayList.get(0), g2, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.f7730b;
                    int i6 = a2.f7731c;
                    f2 = a2.f7732d;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f2 = 1.0f;
                }
                return new Vma(arrayList, g2, i2, i, f2);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new Sia("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(Nma nma) {
        int h2 = nma.h();
        int b2 = nma.b();
        nma.d(h2);
        return Fma.a(nma.f8013a, b2, h2);
    }
}
