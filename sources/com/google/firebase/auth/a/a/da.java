package com.google.firebase.auth.a.a;

import c.b.b.b.d.d.C0271ha;
import c.b.b.b.d.d.C0273ia;
import c.b.b.b.d.d.la;
import c.b.b.b.d.d.na;
import c.b.b.b.d.d.ra;
import c.b.b.b.d.d.ya;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3277b;
import com.google.firebase.auth.C3311v;
import com.google.firebase.auth.internal.C3291g;
import com.google.firebase.auth.internal.N;

final class da extends S {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ba f14314a;

    da(ba baVar) {
        this.f14314a = baVar;
    }

    private final void a(Status status, C3277b bVar, String str, String str2) {
        this.f14314a.b(status);
        ba baVar = this.f14314a;
        baVar.p = bVar;
        baVar.q = str;
        baVar.r = str2;
        C3291g gVar = baVar.f14307f;
        if (gVar != null) {
            gVar.a(status);
        }
        this.f14314a.a(status);
    }

    private final void a(ia iaVar) {
        this.f14314a.i.execute(new ja(this, iaVar));
    }

    public final void Db() {
        boolean z = this.f14314a.f14302a == 5;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        this.f14314a.d();
    }

    public final void a(C0271ha haVar) {
        a(haVar.a(), haVar.b(), haVar.g(), haVar.h());
    }

    public final void a(C0273ia iaVar) {
        ba baVar = this.f14314a;
        baVar.s = iaVar;
        baVar.a(N.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void a(la laVar) {
        boolean z = this.f14314a.f14302a == 3;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        ba baVar = this.f14314a;
        baVar.l = laVar;
        baVar.d();
    }

    public final void a(ra raVar) {
        boolean z = true;
        if (this.f14314a.f14302a != 1) {
            z = false;
        }
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        ba baVar = this.f14314a;
        baVar.j = raVar;
        baVar.d();
    }

    public final void a(ra raVar, na naVar) {
        boolean z = this.f14314a.f14302a == 2;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        ba baVar = this.f14314a;
        baVar.j = raVar;
        baVar.k = naVar;
        baVar.d();
    }

    public final void a(ya yaVar) {
        boolean z = this.f14314a.f14302a == 4;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        ba baVar = this.f14314a;
        baVar.m = yaVar;
        baVar.d();
    }

    public final void a(Status status) {
        String h2 = status.h();
        if (h2 != null) {
            if (h2.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (h2.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (h2.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (h2.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (h2.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (h2.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (h2.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (h2.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (h2.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (h2.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        ba baVar = this.f14314a;
        if (baVar.f14302a == 8) {
            boolean unused = baVar.v = true;
            this.f14314a.w = false;
            a((ia) new ga(this, status));
            return;
        }
        baVar.b(status);
        this.f14314a.a(status);
    }

    public final void a(Status status, C3311v vVar) {
        boolean z = this.f14314a.f14302a == 2;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        a(status, vVar, (String) null, (String) null);
    }

    public final void a(C3311v vVar) {
        boolean z = this.f14314a.f14302a == 8;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        boolean unused = this.f14314a.v = true;
        this.f14314a.w = true;
        a((ia) new ea(this, vVar));
    }

    public final void b() {
        boolean z = this.f14314a.f14302a == 6;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        this.f14314a.d();
    }

    public final void c(String str) {
        boolean z = this.f14314a.f14302a == 7;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        ba baVar = this.f14314a;
        baVar.n = str;
        baVar.d();
    }

    public final void d(String str) {
        boolean z = this.f14314a.f14302a == 8;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        this.f14314a.o = str;
        a((ia) new fa(this, str));
    }

    public final void f(String str) {
        boolean z = this.f14314a.f14302a == 8;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        ba baVar = this.f14314a;
        baVar.o = str;
        boolean unused = baVar.v = true;
        this.f14314a.w = true;
        a((ia) new ha(this, str));
    }

    public final void l() {
        boolean z = this.f14314a.f14302a == 9;
        int i = this.f14314a.f14302a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C0563t.b(z, sb.toString());
        this.f14314a.d();
    }
}
