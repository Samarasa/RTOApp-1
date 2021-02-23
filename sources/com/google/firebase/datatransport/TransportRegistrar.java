package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import c.b.b.a.g;
import com.google.firebase.components.e;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Collections;
import java.util.List;

@Keep
public class TransportRegistrar implements j {
    public List<e<?>> getComponents() {
        e.a<g> a2 = e.a(g.class);
        a2.a(q.b(Context.class));
        a2.a((i<g>) a.a());
        return Collections.singletonList(a2.b());
    }
}
