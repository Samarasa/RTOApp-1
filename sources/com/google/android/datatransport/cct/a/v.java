package com.google.android.datatransport.cct.a;

import c.b.d.b.d;
import c.b.d.b.e;

public final class v implements d<j> {
    public void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        e eVar = (e) obj2;
        eVar.a("eventTimeMs", jVar.a());
        eVar.a("eventUptimeMs", jVar.b());
        eVar.a("timezoneOffsetSeconds", jVar.c());
        if (jVar.f() != null) {
            eVar.a("sourceExtension", (Object) jVar.f());
        }
        if (jVar.g() != null) {
            eVar.a("sourceExtensionJsonProto3", (Object) jVar.g());
        }
        if (jVar.d() != Integer.MIN_VALUE) {
            eVar.a("eventCode", jVar.d());
        }
        if (jVar.e() != null) {
            eVar.a("networkConnectionInfo", (Object) jVar.e());
        }
    }
}
