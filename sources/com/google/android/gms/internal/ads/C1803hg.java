package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import c.b.b.b.c.a;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.mediation.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hg  reason: case insensitive filesystem */
public final class C1803hg extends C0987Qf {

    /* renamed from: a  reason: collision with root package name */
    private final s f10698a;

    public C1803hg(s sVar) {
        this.f10698a = sVar;
    }

    public final String E() {
        return this.f10698a.n();
    }

    public final double G() {
        return this.f10698a.o();
    }

    public final String S() {
        return this.f10698a.p();
    }

    public final C2076lb U() {
        b.C0072b l = this.f10698a.l();
        if (l != null) {
            return new C1190Ya(l.a(), l.d(), l.c(), l.e(), l.b());
        }
        return null;
    }

    public final a Z() {
        View h2 = this.f10698a.h();
        if (h2 == null) {
            return null;
        }
        return c.b.b.b.c.b.a(h2);
    }

    public final void a(a aVar) {
        this.f10698a.c((View) c.b.b.b.c.b.Q(aVar));
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        this.f10698a.a((View) c.b.b.b.c.b.Q(aVar), (HashMap) c.b.b.b.c.b.Q(aVar2), (HashMap) c.b.b.b.c.b.Q(aVar3));
    }

    public final boolean aa() {
        return this.f10698a.d();
    }

    public final void b(a aVar) {
        this.f10698a.a((View) c.b.b.b.c.b.Q(aVar));
    }

    public final a ba() {
        View a2 = this.f10698a.a();
        if (a2 == null) {
            return null;
        }
        return c.b.b.b.c.b.a(a2);
    }

    public final void d(a aVar) {
        this.f10698a.b((View) c.b.b.b.c.b.Q(aVar));
    }

    public final boolean ga() {
        return this.f10698a.c();
    }

    public final Bundle getExtras() {
        return this.f10698a.b();
    }

    public final Sra getVideoController() {
        if (this.f10698a.e() != null) {
            return this.f10698a.e().a();
        }
        return null;
    }

    public final String r() {
        return this.f10698a.k();
    }

    public final String s() {
        return this.f10698a.j();
    }

    public final String v() {
        return this.f10698a.i();
    }

    public final a w() {
        return null;
    }

    public final C1580eb x() {
        return null;
    }

    public final List y() {
        List<b.C0072b> m = this.f10698a.m();
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
        this.f10698a.g();
    }
}
