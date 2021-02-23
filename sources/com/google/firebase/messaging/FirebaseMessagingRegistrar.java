package com.google.firebase.messaging;

import androidx.annotation.Keep;
import c.b.b.a.c;
import c.b.b.a.e;
import c.b.b.a.f;
import c.b.b.a.g;
import com.google.firebase.components.e;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements j {

    public static class a implements g {
        public final <T> f<T> a(String str, Class<T> cls, c.b.b.a.b bVar, e<T, byte[]> eVar) {
            return new b();
        }
    }

    private static class b<T> implements f<T> {
        private b() {
        }

        public final void a(c<T> cVar) {
        }
    }

    @Keep
    public List<com.google.firebase.components.e<?>> getComponents() {
        e.a<FirebaseMessaging> a2 = com.google.firebase.components.e.a(FirebaseMessaging.class);
        a2.a(q.b(c.b.d.e.class));
        a2.a(q.b(FirebaseInstanceId.class));
        a2.a(q.a(g.class));
        a2.a((i<FirebaseMessaging>) m.f14662a);
        a2.a();
        return Arrays.asList(new com.google.firebase.components.e[]{a2.b()});
    }
}
