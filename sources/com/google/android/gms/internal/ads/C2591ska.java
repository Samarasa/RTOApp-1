package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ska  reason: case insensitive filesystem */
final class C2591ska extends C2379pka {
    public final long Qa;
    public final List<C2520rka> Ra = new ArrayList();
    public final List<C2591ska> Sa = new ArrayList();

    public C2591ska(int i, long j) {
        super(i);
        this.Qa = j;
    }

    public final void a(C2520rka rka) {
        this.Ra.add(rka);
    }

    public final void a(C2591ska ska) {
        this.Sa.add(ska);
    }

    public final C2520rka d(int i) {
        int size = this.Ra.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2520rka rka = this.Ra.get(i2);
            if (rka.Pa == i) {
                return rka;
            }
        }
        return null;
    }

    public final C2591ska e(int i) {
        int size = this.Sa.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2591ska ska = this.Sa.get(i2);
            if (ska.Pa == i) {
                return ska;
            }
        }
        return null;
    }

    public final String toString() {
        String c2 = C2379pka.c(this.Pa);
        String arrays = Arrays.toString(this.Ra.toArray());
        String arrays2 = Arrays.toString(this.Sa.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c2);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
