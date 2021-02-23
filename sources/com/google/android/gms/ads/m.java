package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.h.a;
import com.google.android.gms.ads.h.d;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C1540dqa;
import com.google.android.gms.internal.ads.esa;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final esa f5671a;

    public m(Context context) {
        this.f5671a = new esa(context);
        C0563t.a(context, (Object) "Context cannot be null");
    }

    public final Bundle a() {
        return this.f5671a.a();
    }

    public final void a(c cVar) {
        this.f5671a.a(cVar);
        if (cVar != null && (cVar instanceof C1540dqa)) {
            this.f5671a.a((C1540dqa) cVar);
        } else if (cVar == null) {
            this.f5671a.a((C1540dqa) null);
        }
    }

    public final void a(e eVar) {
        this.f5671a.a(eVar.a());
    }

    public final void a(a aVar) {
        this.f5671a.a(aVar);
    }

    public final void a(d dVar) {
        this.f5671a.a(dVar);
    }

    public final void a(String str) {
        this.f5671a.a(str);
    }

    public final void a(boolean z) {
        this.f5671a.a(z);
    }

    public final void b(boolean z) {
        this.f5671a.b(true);
    }

    public final boolean b() {
        return this.f5671a.b();
    }

    public final void c() {
        this.f5671a.c();
    }
}
