package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c.b.d.c.d;
import c.b.d.g.g;
import com.google.firebase.analytics.a.a;
import com.google.firebase.components.e;
import com.google.firebase.components.i;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements j {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<e<?>> getComponents() {
        e.a<a> a2 = e.a(a.class);
        a2.a(q.b(c.b.d.e.class));
        a2.a(q.b(Context.class));
        a2.a(q.b(d.class));
        a2.a((i<a>) a.f14241a);
        a2.c();
        return Arrays.asList(new e[]{a2.b(), g.a("fire-analytics", "17.2.1")});
    }
}
