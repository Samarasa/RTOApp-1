package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.efa  reason: case insensitive filesystem */
final class C1589efa implements C1377bfa {
    C1589efa() {
    }

    public final int a(int i, Object obj, Object obj2) {
        C1448cfa cfa = (C1448cfa) obj;
        C1306afa afa = (C1306afa) obj2;
        if (cfa.isEmpty()) {
            return 0;
        }
        Iterator it = cfa.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object a(Object obj, Object obj2) {
        C1448cfa cfa = (C1448cfa) obj;
        C1448cfa cfa2 = (C1448cfa) obj2;
        if (!cfa2.isEmpty()) {
            if (!cfa.a()) {
                cfa = cfa.f();
            }
            cfa.a(cfa2);
        }
        return cfa;
    }

    public final Map<?, ?> a(Object obj) {
        return (C1448cfa) obj;
    }

    public final boolean b(Object obj) {
        return !((C1448cfa) obj).a();
    }

    public final Object c(Object obj) {
        ((C1448cfa) obj).b();
        return obj;
    }

    public final Object d(Object obj) {
        return C1448cfa.e().f();
    }

    public final _ea<?, ?> e(Object obj) {
        C1306afa afa = (C1306afa) obj;
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> f(Object obj) {
        return (C1448cfa) obj;
    }
}
