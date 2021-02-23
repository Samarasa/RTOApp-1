package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;

public final class VG implements C1290aV {

    /* renamed from: a  reason: collision with root package name */
    private final PG f9016a;

    VG(PG pg) {
        this.f9016a = pg;
    }

    public final void a(SU su, String str) {
    }

    public final void a(SU su, String str, Throwable th) {
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue() && SU.RENDERER == su && this.f9016a.c() != 0) {
            this.f9016a.b(p.j().b() - this.f9016a.c());
        }
    }

    public final void b(SU su, String str) {
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue() && SU.RENDERER == su) {
            this.f9016a.c(p.j().b());
        }
    }

    public final void c(SU su, String str) {
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue() && SU.RENDERER == su && this.f9016a.c() != 0) {
            this.f9016a.b(p.j().b() - this.f9016a.c());
        }
    }
}
