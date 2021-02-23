package com.google.firebase.auth;

import androidx.annotation.Keep;
import c.b.d.g.g;
import com.google.firebase.auth.internal.C3286b;
import com.google.firebase.components.e;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseAuthRegistrar implements j {
    @Keep
    public List<e<?>> getComponents() {
        e.a<FirebaseAuth> a2 = e.a(FirebaseAuth.class, (Class<? super T>[]) new Class[]{C3286b.class});
        a2.a(q.b(c.b.d.e.class));
        a2.a((i<FirebaseAuth>) T.f14281a);
        a2.c();
        return Arrays.asList(new e[]{a2.b(), g.a("fire-auth", "19.2.0")});
    }
}
