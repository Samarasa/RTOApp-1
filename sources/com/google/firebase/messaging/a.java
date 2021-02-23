package com.google.firebase.messaging;

import android.content.Intent;
import c.b.d.b.d;
import c.b.d.b.e;
import com.google.android.gms.common.internal.C0563t;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14628a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f14629b;

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    static class C0087a implements d<a> {
        C0087a() {
        }

        public final /* synthetic */ void a(Object obj, Object obj2) {
            a aVar = (a) obj;
            e eVar = (e) obj2;
            Intent a2 = aVar.a();
            eVar.a("ttl", r.f(a2));
            eVar.a("event", (Object) aVar.b());
            eVar.a("instanceId", (Object) r.c());
            eVar.a("priority", r.m(a2));
            eVar.a("packageName", (Object) r.b());
            eVar.a("sdkPlatform", (Object) "ANDROID");
            eVar.a("messageType", (Object) r.k(a2));
            String j = r.j(a2);
            if (j != null) {
                eVar.a("messageId", (Object) j);
            }
            String l = r.l(a2);
            if (l != null) {
                eVar.a("topic", (Object) l);
            }
            String g2 = r.g(a2);
            if (g2 != null) {
                eVar.a("collapseKey", (Object) g2);
            }
            if (r.i(a2) != null) {
                eVar.a("analyticsLabel", (Object) r.i(a2));
            }
            if (r.h(a2) != null) {
                eVar.a("composerLabel", (Object) r.h(a2));
            }
            String d2 = r.d();
            if (d2 != null) {
                eVar.a("projectNumber", (Object) d2);
            }
        }
    }

    static final class b implements d<c> {
        b() {
        }

        public final /* synthetic */ void a(Object obj, Object obj2) {
            ((e) obj2).a("messaging_client_event", (Object) ((c) obj).a());
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final a f14630a;

        c(a aVar) {
            C0563t.a(aVar);
            this.f14630a = aVar;
        }

        /* access modifiers changed from: package-private */
        public final a a() {
            return this.f14630a;
        }
    }

    a(String str, Intent intent) {
        C0563t.a(str, (Object) "evenType must be non-null");
        this.f14628a = str;
        C0563t.a(intent, (Object) "intent must be non-null");
        this.f14629b = intent;
    }

    /* access modifiers changed from: package-private */
    public final Intent a() {
        return this.f14629b;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.f14628a;
    }
}
