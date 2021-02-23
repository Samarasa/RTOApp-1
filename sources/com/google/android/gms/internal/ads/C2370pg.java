package com.google.android.gms.internal.ads;

import c.b.a.a;
import c.b.a.b;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pg  reason: case insensitive filesystem */
public final class C2370pg {
    public static int a(a aVar) {
        int i = C2299og.f11607b[aVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static com.google.ads.mediation.a a(C2249nqa nqa, boolean z) {
        List<String> list = nqa.f11538e;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(nqa.f11535b);
        int i = nqa.f11537d;
        return new com.google.ads.mediation.a(date, i != 1 ? i != 2 ? b.UNKNOWN : b.FEMALE : b.MALE, hashSet, z, nqa.k);
    }
}
