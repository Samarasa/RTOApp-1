package com.google.firebase.auth.internal;

import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3277b;
import com.google.firebase.auth.C3280e;
import com.google.firebase.auth.C3308s;
import com.google.firebase.auth.C3309t;
import com.google.firebase.auth.J;
import com.google.firebase.auth.y;
import com.google.firebase.auth.z;

public final class v {
    public static Ba a(C3277b bVar, String str) {
        C0563t.a(bVar);
        if (C3309t.class.isAssignableFrom(bVar.getClass())) {
            return C3309t.a((C3309t) bVar, str);
        }
        if (C3280e.class.isAssignableFrom(bVar.getClass())) {
            return C3280e.a((C3280e) bVar, str);
        }
        if (z.class.isAssignableFrom(bVar.getClass())) {
            return z.a((z) bVar, str);
        }
        if (C3308s.class.isAssignableFrom(bVar.getClass())) {
            return C3308s.a((C3308s) bVar, str);
        }
        if (y.class.isAssignableFrom(bVar.getClass())) {
            return y.a((y) bVar, str);
        }
        if (J.class.isAssignableFrom(bVar.getClass())) {
            return J.a((J) bVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
