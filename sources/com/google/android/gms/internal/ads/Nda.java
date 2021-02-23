package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class Nda implements Comparator<Lda> {
    Nda() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Lda lda = (Lda) obj;
        Lda lda2 = (Lda) obj2;
        Vda vda = (Vda) lda.iterator();
        Vda vda2 = (Vda) lda2.iterator();
        while (vda.hasNext() && vda2.hasNext()) {
            int compare = Integer.compare(Lda.b(vda.nextByte()), Lda.b(vda2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(lda.size(), lda2.size());
    }
}
