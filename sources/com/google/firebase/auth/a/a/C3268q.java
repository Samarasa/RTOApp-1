package com.google.firebase.auth.a.a;

import c.b.b.b.b.d;
import c.b.b.b.d.d.C0269ga;
import c.b.b.b.d.d.S;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.internal.C0534n;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3278c;
import com.google.firebase.auth.C3311v;
import com.google.firebase.auth.internal.C3287c;
import com.google.firebase.auth.internal.D;
import com.google.firebase.auth.internal.x;

/* renamed from: com.google.firebase.auth.a.a.q  reason: case insensitive filesystem */
final class C3268q extends ba<C3278c, C3287c> {
    private final C3311v z;

    public C3268q(C3311v vVar) {
        super(2);
        C0563t.a(vVar, (Object) "credential cannot be null");
        this.z = vVar;
    }

    public final String a() {
        return "linkPhoneAuthCredential";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(N n, j jVar) {
        this.f14308g = new ka(this, jVar);
        if (this.t) {
            n.a().a(this.f14305d.u(), this.z, (T) this.f14303b);
        } else {
            n.a().a(new S(this.f14305d.u(), this.z), (T) this.f14303b);
        }
    }

    public final C0534n<N, C3278c> b() {
        C0534n.a a2 = C0534n.a();
        a2.a(false);
        a2.a((this.t || this.u) ? null : new d[]{C0269ga.f4000b});
        a2.a(new C3267p(this));
        return a2.a();
    }

    public final void c() {
        D a2 = C3260i.a(this.f14304c, this.k);
        ((C3287c) this.f14306e).a(this.j, a2);
        b(new x(a2));
    }
}
