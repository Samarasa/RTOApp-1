package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import c.b.b.b.d.d.ra;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import c.b.d.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.a.a.C3260i;
import com.google.firebase.auth.a.a.O;
import com.google.firebase.auth.a.a.W;
import com.google.firebase.auth.a.a.aa;
import com.google.firebase.auth.internal.C3285a;
import com.google.firebase.auth.internal.C3286b;
import com.google.firebase.auth.internal.C3287c;
import com.google.firebase.auth.internal.C3291g;
import com.google.firebase.auth.internal.C3292h;
import com.google.firebase.auth.internal.C3295k;
import com.google.firebase.auth.internal.D;
import com.google.firebase.auth.internal.E;
import com.google.firebase.auth.internal.p;
import com.google.firebase.auth.internal.q;
import com.google.firebase.auth.internal.r;
import com.google.firebase.auth.internal.u;
import com.google.firebase.auth.internal.x;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirebaseAuth implements C3286b {

    /* renamed from: a  reason: collision with root package name */
    private e f14252a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f14253b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<C3285a> f14254c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<a> f14255d;

    /* renamed from: e  reason: collision with root package name */
    private C3260i f14256e;

    /* renamed from: f  reason: collision with root package name */
    private C3306p f14257f;

    /* renamed from: g  reason: collision with root package name */
    private E f14258g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f14259h;
    private final Object i;
    private String j;
    private final q k;
    private final C3292h l;
    private p m;
    private r n;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    class c implements C3287c {
        c() {
        }

        public final void a(ra raVar, C3306p pVar) {
            C0563t.a(raVar);
            C0563t.a(pVar);
            pVar.a(raVar);
            FirebaseAuth.this.a(pVar, raVar, true);
        }
    }

    class d implements C3287c, C3291g {
        d() {
        }

        public final void a(ra raVar, C3306p pVar) {
            C0563t.a(raVar);
            C0563t.a(pVar);
            pVar.a(raVar);
            FirebaseAuth.this.a(pVar, raVar, true, true);
        }

        public final void a(Status status) {
            if (status.g() == 17011 || status.g() == 17021 || status.g() == 17005 || status.g() == 17091) {
                FirebaseAuth.this.c();
            }
        }
    }

    public FirebaseAuth(e eVar) {
        this(eVar, W.a(eVar.b(), new aa(eVar.e().a()).a()), new q(eVar.b(), eVar.f()), C3292h.a());
    }

    private FirebaseAuth(e eVar, C3260i iVar, q qVar, C3292h hVar) {
        ra b2;
        this.f14259h = new Object();
        this.i = new Object();
        C0563t.a(eVar);
        this.f14252a = eVar;
        C0563t.a(iVar);
        this.f14256e = iVar;
        C0563t.a(qVar);
        this.k = qVar;
        this.f14258g = new E();
        C0563t.a(hVar);
        this.l = hVar;
        this.f14253b = new CopyOnWriteArrayList();
        this.f14254c = new CopyOnWriteArrayList();
        this.f14255d = new CopyOnWriteArrayList();
        this.n = r.a();
        this.f14257f = this.k.a();
        C3306p pVar = this.f14257f;
        if (!(pVar == null || (b2 = this.k.b(pVar)) == null)) {
            a(this.f14257f, b2, false);
        }
        this.l.a(this);
    }

    private final synchronized void a(p pVar) {
        this.m = pVar;
    }

    private final void a(C3306p pVar) {
        String str;
        if (pVar != null) {
            String h2 = pVar.h();
            StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(h2);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        this.n.execute(new O(this, new c.b.d.f.c(pVar != null ? pVar.v() : null)));
    }

    private final void b(C3306p pVar) {
        String str;
        if (pVar != null) {
            String h2 = pVar.h();
            StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(h2);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        this.n.execute(new Q(this));
    }

    private final boolean b(String str) {
        I a2 = I.a(str);
        return a2 != null && !TextUtils.equals(this.j, a2.a());
    }

    private final synchronized p f() {
        if (this.m == null) {
            a(new p(this.f14252a));
        }
        return this.m;
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) e.c().a(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(e eVar) {
        return (FirebaseAuth) eVar.a(FirebaseAuth.class);
    }

    public i<C3278c> a(C3277b bVar) {
        C0563t.a(bVar);
        C3277b a2 = bVar.a();
        if (a2 instanceof C3279d) {
            C3279d dVar = (C3279d) a2;
            return !dVar.k() ? this.f14256e.a(this.f14252a, dVar.b(), dVar.i(), this.j, (C3287c) new c()) : b(dVar.j()) ? l.a((Exception) O.a(new Status(17072))) : this.f14256e.a(this.f14252a, dVar, (C3287c) new c());
        } else if (!(a2 instanceof C3311v)) {
            return this.f14256e.a(this.f14252a, a2, this.j, (C3287c) new c());
        } else {
            return this.f14256e.a(this.f14252a, (C3311v) a2, this.j, (C3287c) new c());
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARNING: type inference failed for: r9v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARNING: type inference failed for: r10v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    public final i<C3278c> a(C3306p pVar, C3277b bVar) {
        C0563t.a(pVar);
        C0563t.a(bVar);
        C3277b a2 = bVar.a();
        if (a2 instanceof C3279d) {
            C3279d dVar = (C3279d) a2;
            if (!"password".equals(dVar.h())) {
                return b(dVar.j()) ? l.a((Exception) O.a(new Status(17072))) : this.f14256e.a(this.f14252a, pVar, dVar, (u) new d());
            }
            return this.f14256e.a(this.f14252a, pVar, dVar.b(), dVar.i(), pVar.k(), new d());
        } else if (a2 instanceof C3311v) {
            return this.f14256e.a(this.f14252a, pVar, (C3311v) a2, this.j, (u) new d());
        } else {
            return this.f14256e.a(this.f14252a, pVar, a2, pVar.k(), (u) new d());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.firebase.auth.P, com.google.firebase.auth.internal.u] */
    public final i<r> a(C3306p pVar, boolean z) {
        if (pVar == null) {
            return l.a((Exception) O.a(new Status(17495)));
        }
        ra l2 = pVar.l();
        return (!l2.b() || z) ? this.f14256e.a(this.f14252a, pVar, l2.g(), (u) new P(this)) : l.a(C3295k.a(l2.h()));
    }

    public i<r> a(boolean z) {
        return a(this.f14257f, z);
    }

    public C3306p a() {
        return this.f14257f;
    }

    public final void a(C3306p pVar, ra raVar, boolean z) {
        a(pVar, raVar, z, false);
    }

    /* access modifiers changed from: package-private */
    public final void a(C3306p pVar, ra raVar, boolean z, boolean z2) {
        boolean z3;
        C0563t.a(pVar);
        C0563t.a(raVar);
        boolean z4 = true;
        boolean z5 = this.f14257f != null && pVar.h().equals(this.f14257f.h());
        if (z5 || !z2) {
            C3306p pVar2 = this.f14257f;
            if (pVar2 == null) {
                z3 = true;
            } else {
                z3 = !z5 || (pVar2.l().h().equals(raVar.h()) ^ true);
                if (z5) {
                    z4 = false;
                }
            }
            C0563t.a(pVar);
            C3306p pVar3 = this.f14257f;
            if (pVar3 == null) {
                this.f14257f = pVar;
            } else {
                pVar3.a(pVar.g());
                if (!pVar.i()) {
                    this.f14257f.b();
                }
                this.f14257f.b(pVar.w().a());
            }
            if (z) {
                this.k.a(this.f14257f);
            }
            if (z3) {
                C3306p pVar4 = this.f14257f;
                if (pVar4 != null) {
                    pVar4.a(raVar);
                }
                a(this.f14257f);
            }
            if (z4) {
                b(this.f14257f);
            }
            if (z) {
                this.k.a(pVar, raVar);
            }
            f().a(this.f14257f.l());
        }
    }

    public final void a(String str) {
        C0563t.b(str);
        synchronized (this.i) {
            this.j = str;
        }
    }

    public i<C3278c> b() {
        C3306p pVar = this.f14257f;
        if (pVar == null || !pVar.i()) {
            return this.f14256e.a(this.f14252a, (C3287c) new c(), this.j);
        }
        D d2 = (D) this.f14257f;
        d2.a(false);
        return l.a(new x(d2));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    public final i<C3278c> b(C3306p pVar, C3277b bVar) {
        C0563t.a(bVar);
        C0563t.a(pVar);
        return this.f14256e.a(this.f14252a, pVar, bVar.a(), (u) new d());
    }

    public void c() {
        d();
        p pVar = this.m;
        if (pVar != null) {
            pVar.a();
        }
    }

    public final void d() {
        C3306p pVar = this.f14257f;
        if (pVar != null) {
            q qVar = this.k;
            C0563t.a(pVar);
            qVar.a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{pVar.h()}));
            this.f14257f = null;
        }
        this.k.a("com.google.firebase.auth.FIREBASE_USER");
        a((C3306p) null);
        b((C3306p) null);
    }

    public final e e() {
        return this.f14252a;
    }
}
