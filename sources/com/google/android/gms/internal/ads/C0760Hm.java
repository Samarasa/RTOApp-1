package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hm  reason: case insensitive filesystem */
public final class C0760Hm implements C1228Zm {
    public final C0994Qm a(C1175Xl xl, int i, String str, C1201Yl yl) {
        if (i <= 0) {
            return new C1202Ym(xl);
        }
        int g2 = C2665tm.g();
        return g2 < yl.f9475h ? new C1392bn(xl, yl) : g2 < yl.f9469b ? new C1463cn(xl, yl) : new C1321an(xl);
    }
}
