package com.google.android.gms.internal.ads;

import java.util.List;

final class Uea extends Tea {
    private Uea() {
        super();
    }

    private static <E> Fea<E> c(Object obj, long j) {
        return (Fea) C1308aga.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> a(Object obj, long j) {
        Fea c2 = c(obj, j);
        if (c2.n()) {
            return c2;
        }
        int size = c2.size();
        Fea c3 = c2.c(size == 0 ? 10 : size << 1);
        C1308aga.a(obj, j, (Object) c3);
        return c3;
    }

    /* access modifiers changed from: package-private */
    public final <E> void a(Object obj, Object obj2, long j) {
        Fea c2 = c(obj, j);
        Fea c3 = c(obj2, j);
        int size = c2.size();
        int size2 = c3.size();
        if (size > 0 && size2 > 0) {
            if (!c2.n()) {
                c2 = c2.c(size2 + size);
            }
            c2.addAll(c3);
        }
        if (size > 0) {
            c3 = c2;
        }
        C1308aga.a(obj, j, (Object) c3);
    }

    /* access modifiers changed from: package-private */
    public final void b(Object obj, long j) {
        c(obj, j).o();
    }
}
