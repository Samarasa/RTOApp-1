package com.google.android.datatransport.cct.a;

import c.b.d.b.c;
import c.b.d.b.d;
import c.b.d.b.e;

public final class x implements d<l> {
    public void a(Object obj, Object obj2) {
        l lVar = (l) obj;
        e eVar = (e) obj2;
        eVar.a("requestTimeMs", lVar.f());
        eVar.a("requestUptimeMs", lVar.g());
        if (lVar.b() != null) {
            eVar.a("clientInfo", (Object) lVar.b());
        }
        if (lVar.e() != null) {
            eVar.a("logSourceName", (Object) lVar.e());
        } else if (lVar.d() != Integer.MIN_VALUE) {
            eVar.a("logSource", lVar.d());
        } else {
            throw new c("Log request must have either LogSourceName or LogSource");
        }
        if (!lVar.c().isEmpty()) {
            eVar.a("logEvent", (Object) lVar.c());
        }
    }
}
