package com.google.android.datatransport.cct.a;

import c.b.d.b.d;
import c.b.d.b.e;

public final class s implements d<h> {
    public void a(Object obj, Object obj2) {
        h hVar = (h) obj;
        e eVar = (e) obj2;
        if (hVar.c() != null) {
            eVar.a("clientType", (Object) hVar.c().name());
        }
        if (hVar.b() != null) {
            eVar.a("androidClientInfo", (Object) hVar.b());
        }
    }
}
