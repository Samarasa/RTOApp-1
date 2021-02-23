package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import c.b.b.b.c.a;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.mediation.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rg  reason: case insensitive filesystem */
public final class C2511rg extends C1169Xf {

    /* renamed from: a  reason: collision with root package name */
    private final y f12003a;

    public C2511rg(y yVar) {
        this.f12003a = yVar;
    }

    public final String E() {
        return this.f12003a.n();
    }

    public final float Ea() {
        return this.f12003a.k();
    }

    public final double G() {
        if (this.f12003a.o() != null) {
            return this.f12003a.o().doubleValue();
        }
        return -1.0d;
    }

    public final float Na() {
        return this.f12003a.e();
    }

    public final String R() {
        return this.f12003a.b();
    }

    public final String S() {
        return this.f12003a.p();
    }

    public final float Sa() {
        return this.f12003a.f();
    }

    public final C2076lb U() {
        b.C0072b i = this.f12003a.i();
        if (i != null) {
            return new C1190Ya(i.a(), i.d(), i.c(), i.e(), i.b());
        }
        return null;
    }

    public final a Z() {
        View t = this.f12003a.t();
        if (t == null) {
            return null;
        }
        return c.b.b.b.c.b.a(t);
    }

    public final void a(a aVar) {
        this.f12003a.b((View) c.b.b.b.c.b.Q(aVar));
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        this.f12003a.a((View) c.b.b.b.c.b.Q(aVar), (HashMap) c.b.b.b.c.b.Q(aVar2), (HashMap) c.b.b.b.c.b.Q(aVar3));
    }

    public final boolean aa() {
        return this.f12003a.m();
    }

    public final void b(a aVar) {
        this.f12003a.a((View) c.b.b.b.c.b.Q(aVar));
    }

    public final a ba() {
        View a2 = this.f12003a.a();
        if (a2 == null) {
            return null;
        }
        return c.b.b.b.c.b.a(a2);
    }

    public final boolean ga() {
        return this.f12003a.l();
    }

    public final Bundle getExtras() {
        return this.f12003a.g();
    }

    public final Sra getVideoController() {
        if (this.f12003a.q() != null) {
            return this.f12003a.q().a();
        }
        return null;
    }

    public final String r() {
        return this.f12003a.h();
    }

    public final String s() {
        return this.f12003a.d();
    }

    public final String v() {
        return this.f12003a.c();
    }

    public final a w() {
        Object u = this.f12003a.u();
        if (u == null) {
            return null;
        }
        return c.b.b.b.c.b.a(u);
    }

    public final C1580eb x() {
        return null;
    }

    public final List y() {
        List<b.C0072b> j = this.f12003a.j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (b.C0072b next : j) {
                arrayList.add(new C1190Ya(next.a(), next.d(), next.c(), next.e(), next.b()));
            }
        }
        return arrayList;
    }

    public final void z() {
        this.f12003a.s();
    }
}
