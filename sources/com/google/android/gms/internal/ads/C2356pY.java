package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pY  reason: case insensitive filesystem */
final class C2356pY<V> extends C2143mY<V, List<V>> {
    C2356pY(C2638tX<? extends LY<? extends V>> tXVar, boolean z) {
        super(tXVar, true);
        k();
    }

    public final /* synthetic */ Object a(List list) {
        ArrayList a2 = CX.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2285oY oYVar = (C2285oY) it.next();
            a2.add(oYVar != null ? oYVar.f11591a : null);
        }
        return Collections.unmodifiableList(a2);
    }
}
