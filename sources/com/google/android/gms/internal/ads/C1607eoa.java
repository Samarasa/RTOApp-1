package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.eoa  reason: case insensitive filesystem */
public final class C1607eoa implements Comparator<Sna> {
    public C1607eoa(C1395boa boa) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Sna sna = (Sna) obj;
        Sna sna2 = (Sna) obj2;
        if (sna.b() < sna2.b()) {
            return -1;
        }
        if (sna.b() > sna2.b()) {
            return 1;
        }
        if (sna.a() < sna2.a()) {
            return -1;
        }
        if (sna.a() > sna2.a()) {
            return 1;
        }
        float d2 = (sna.d() - sna.b()) * (sna.c() - sna.a());
        float d3 = (sna2.d() - sna2.b()) * (sna2.c() - sna2.a());
        if (d2 > d3) {
            return -1;
        }
        return d2 < d3 ? 1 : 0;
    }
}
