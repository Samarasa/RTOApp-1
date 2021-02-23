package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class Gfa extends Hfa<FieldDescriptorType, Object> {
    Gfa(int i) {
        super(i, (Gfa) null);
    }

    public final void b() {
        if (!a()) {
            if (c() <= 0) {
                Iterator it = d().iterator();
                if (it.hasNext()) {
                    ((C2367pea) ((Map.Entry) it.next()).getKey()).k();
                    throw null;
                }
            } else {
                ((C2367pea) b(0).getKey()).k();
                throw null;
            }
        }
        super.b();
    }
}
