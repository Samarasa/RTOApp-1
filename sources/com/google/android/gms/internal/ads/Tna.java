package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class Tna implements Comparator<Zna> {
    Tna(Una una) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Zna zna = (Zna) obj;
        Zna zna2 = (Zna) obj2;
        int i = zna.f9589c - zna2.f9589c;
        return i != 0 ? i : (int) (zna.f9587a - zna2.f9587a);
    }
}
