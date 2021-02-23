package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import c.b.d.e;
import c.b.d.g.g;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

@Keep
public class RemoteConfigRegistrar implements j {
    static /* synthetic */ o lambda$getComponents$0(f fVar) {
        return new o((Context) fVar.a(Context.class), (e) fVar.a(e.class), (FirebaseInstanceId) fVar.a(FirebaseInstanceId.class), ((a) fVar.a(a.class)).b("frc"), (com.google.firebase.analytics.a.a) fVar.a(com.google.firebase.analytics.a.a.class));
    }

    public List<com.google.firebase.components.e<?>> getComponents() {
        e.a<o> a2 = com.google.firebase.components.e.a(o.class);
        a2.a(q.b(Context.class));
        a2.a(q.b(c.b.d.e.class));
        a2.a(q.b(FirebaseInstanceId.class));
        a2.a(q.b(a.class));
        a2.a(q.a(com.google.firebase.analytics.a.a.class));
        a2.a((i<o>) p.a());
        a2.c();
        return Arrays.asList(new com.google.firebase.components.e[]{a2.b(), g.a("fire-rc", "19.1.0")});
    }
}
