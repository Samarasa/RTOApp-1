package com.google.android.datatransport.cct.a;

import c.b.d.b.d;
import c.b.d.b.e;

public final class A implements d<o> {
    public void a(Object obj, Object obj2) {
        o oVar = (o) obj;
        e eVar = (e) obj2;
        if (oVar.b() != null) {
            eVar.a("mobileSubtype", (Object) oVar.b().name());
        }
        if (oVar.c() != null) {
            eVar.a("networkType", (Object) oVar.c().name());
        }
    }
}
