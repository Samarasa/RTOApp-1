package com.google.firebase.iid;

import androidx.annotation.Keep;
import c.b.d.c.d;
import c.b.d.d.c;
import c.b.d.g.g;
import c.b.d.g.h;
import com.google.firebase.components.e;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements j {

    private static class a implements com.google.firebase.iid.a.a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseInstanceId f14542a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f14542a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<e<?>> getComponents() {
        e.a<FirebaseInstanceId> a2 = e.a(FirebaseInstanceId.class);
        a2.a(q.b(c.b.d.e.class));
        a2.a(q.b(d.class));
        a2.a(q.b(h.class));
        a2.a(q.b(c.class));
        a2.a((i<FirebaseInstanceId>) C3326m.f14584a);
        a2.a();
        e<FirebaseInstanceId> b2 = a2.b();
        e.a<com.google.firebase.iid.a.a> a3 = e.a(com.google.firebase.iid.a.a.class);
        a3.a(q.b(FirebaseInstanceId.class));
        a3.a((i<com.google.firebase.iid.a.a>) C3327n.f14585a);
        return Arrays.asList(new e[]{b2, a3.b(), g.a("fire-iid", "20.0.2")});
    }
}
