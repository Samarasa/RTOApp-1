package com.google.android.datatransport.cct.a;

import c.b.d.b.d;
import c.b.d.b.e;

public final class c implements d<e> {
    public void a(Object obj, Object obj2) {
        e eVar = (e) obj;
        e eVar2 = (e) obj2;
        if (eVar.i() != Integer.MIN_VALUE) {
            eVar2.a("sdkVersion", eVar.i());
        }
        if (eVar.f() != null) {
            eVar2.a("model", (Object) eVar.f());
        }
        if (eVar.d() != null) {
            eVar2.a("hardware", (Object) eVar.d());
        }
        if (eVar.b() != null) {
            eVar2.a("device", (Object) eVar.b());
        }
        if (eVar.h() != null) {
            eVar2.a("product", (Object) eVar.h());
        }
        if (eVar.g() != null) {
            eVar2.a("osBuild", (Object) eVar.g());
        }
        if (eVar.e() != null) {
            eVar2.a("manufacturer", (Object) eVar.e());
        }
        if (eVar.c() != null) {
            eVar2.a("fingerprint", (Object) eVar.c());
        }
    }
}
