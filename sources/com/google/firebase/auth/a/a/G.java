package com.google.firebase.auth.a.a;

import c.b.b.b.b.d;
import c.b.b.b.d.d.C0257aa;
import c.b.b.b.d.d.C0269ga;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.internal.C0534n;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3278c;
import com.google.firebase.auth.internal.C3287c;
import com.google.firebase.auth.internal.D;
import com.google.firebase.auth.internal.x;

final class G extends ba<C3278c, C3287c> {
    private final C0257aa z;

    public G(String str, String str2, String str3) {
        super(2);
        C0563t.a(str, (Object) "email cannot be null or empty");
        C0563t.a(str2, (Object) "password cannot be null or empty");
        this.z = new C0257aa(str, str2, str3);
    }

    public final String a() {
        return "signInWithEmailAndPassword";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(N n, j jVar) {
        this.f14308g = new ka(this, jVar);
        if (this.t) {
            n.a().a(this.z.a(), this.z.b(), (T) this.f14303b);
        } else {
            n.a().a(this.z, (T) this.f14303b);
        }
    }

    public final C0534n<N, C3278c> b() {
        C0534n.a a2 = C0534n.a();
        a2.a(false);
        a2.a((this.t || this.u) ? null : new d[]{C0269ga.f4000b});
        a2.a(new F(this));
        return a2.a();
    }

    public final void c() {
        D a2 = C3260i.a(this.f14304c, this.k);
        ((C3287c) this.f14306e).a(this.j, a2);
        b(new x(a2));
    }
}