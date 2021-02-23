package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Nm  reason: case insensitive filesystem */
public final class C0916Nm implements Iterable<C0864Lm> {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0864Lm> f8012a = new ArrayList();

    public static boolean a(C1175Xl xl) {
        C0864Lm b2 = b(xl);
        if (b2 == null) {
            return false;
        }
        b2.f7726e.b();
        return true;
    }

    static C0864Lm b(C1175Xl xl) {
        Iterator<C0864Lm> it = p.y().iterator();
        while (it.hasNext()) {
            C0864Lm next = it.next();
            if (next.f7725d == xl) {
                return next;
            }
        }
        return null;
    }

    public final void a(C0864Lm lm) {
        this.f8012a.add(lm);
    }

    public final void b(C0864Lm lm) {
        this.f8012a.remove(lm);
    }

    public final Iterator<C0864Lm> iterator() {
        return this.f8012a.iterator();
    }
}
