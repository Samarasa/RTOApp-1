package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import c.b.b.b.d.d.ra;
import c.b.d.e;
import com.google.android.gms.common.api.internal.C0523c;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f14392a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C3288d f14393b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f14394c;

    private p(Context context, C3288d dVar) {
        this.f14394c = false;
        this.f14392a = 0;
        this.f14393b = dVar;
        C0523c.a((Application) context.getApplicationContext());
        C0523c.a().a((C0523c.a) new s(this));
    }

    public p(e eVar) {
        this(eVar.b(), new C3288d(eVar));
    }

    /* access modifiers changed from: private */
    public final boolean b() {
        return this.f14392a > 0 && !this.f14394c;
    }

    public final void a() {
        this.f14393b.c();
    }

    public final void a(ra raVar) {
        if (raVar != null) {
            long i = raVar.i();
            if (i <= 0) {
                i = 3600;
            }
            C3288d dVar = this.f14393b;
            dVar.f14372c = raVar.j() + (i * 1000);
            dVar.f14373d = -1;
            if (b()) {
                this.f14393b.a();
            }
        }
    }
}
