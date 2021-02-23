package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import c.b.d.g.g;
import com.google.firebase.analytics.a.a;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements j {
    static /* synthetic */ a lambda$getComponents$0(f fVar) {
        return new a((Context) fVar.a(Context.class), (a) fVar.a(a.class));
    }

    public List<e<?>> getComponents() {
        e.a<a> a2 = e.a(a.class);
        a2.a(q.b(Context.class));
        a2.a(q.a(a.class));
        a2.a((i<a>) b.a());
        return Arrays.asList(new e[]{a2.b(), g.a("fire-abt", "19.0.0")});
    }
}
