package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.mediation.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gg  reason: case insensitive filesystem */
public final class C1732gg extends C1117Vf {

    /* renamed from: a  reason: collision with root package name */
    private final t f10560a;

    public C1732gg(t tVar) {
        this.f10560a = tVar;
    }

    public final String R() {
        return this.f10560a.i();
    }

    public final a Z() {
        View h2 = this.f10560a.h();
        if (h2 == null) {
            return null;
        }
        return b.a(h2);
    }

    public final void a(a aVar) {
        this.f10560a.c((View) b.Q(aVar));
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        this.f10560a.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    public final boolean aa() {
        return this.f10560a.d();
    }

    public final void b(a aVar) {
        this.f10560a.a((View) b.Q(aVar));
    }

    public final a ba() {
        View a2 = this.f10560a.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    public final void d(a aVar) {
        this.f10560a.b((View) b.Q(aVar));
    }

    public final boolean ga() {
        return this.f10560a.c();
    }

    public final Bundle getExtras() {
        return this.f10560a.b();
    }

    public final Sra getVideoController() {
        if (this.f10560a.e() != null) {
            return this.f10560a.e().a();
        }
        return null;
    }

    public final String r() {
        return this.f10560a.l();
    }

    public final C2076lb ra() {
        b.C0072b n = this.f10560a.n();
        if (n != null) {
            return new C1190Ya(n.a(), n.d(), n.c(), n.e(), n.b());
        }
        return null;
    }

    public final String s() {
        return this.f10560a.k();
    }

    public final String v() {
        return this.f10560a.j();
    }

    public final a w() {
        return null;
    }

    public final C1580eb x() {
        return null;
    }

    public final List y() {
        List<b.C0072b> m = this.f10560a.m();
        if (m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b.C0072b next : m) {
            arrayList.add(new C1190Ya(next.a(), next.d(), next.c(), next.e(), next.b()));
        }
        return arrayList;
    }

    public final void z() {
        this.f10560a.g();
    }
}
