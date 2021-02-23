package com.google.android.gms.ads.internal.util;

import android.content.Context;
import c.b.b.b.b.g;
import c.b.b.b.b.h;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.internal.ads.C0836Kk;
import com.google.android.gms.internal.ads.C1018Rk;
import java.io.IOException;

final class ga extends C0493a {

    /* renamed from: d  reason: collision with root package name */
    private Context f5588d;

    ga(Context context) {
        this.f5588d = context;
    }

    public final void a() {
        boolean z;
        try {
            z = a.b(this.f5588d);
        } catch (g | h | IOException | IllegalStateException e2) {
            C1018Rk.b("Fail to get isAdIdFakeForDebugLogging", e2);
            z = false;
        }
        C0836Kk.a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C1018Rk.d(sb.toString());
    }
}
