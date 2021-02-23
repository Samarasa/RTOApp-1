package com.google.firebase.auth.a.a;

import android.text.TextUtils;
import c.b.b.b.b.d;
import c.b.b.b.d.d.C0269ga;
import c.b.b.b.d.d.M;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.internal.C0534n;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.internal.C3287c;
import com.google.firebase.auth.internal.C3295k;
import com.google.firebase.auth.r;

/* renamed from: com.google.firebase.auth.a.a.k  reason: case insensitive filesystem */
final class C3262k extends ba<r, C3287c> {
    private final M z;

    public C3262k(String str) {
        super(1);
        C0563t.a(str, (Object) "refresh token cannot be null");
        this.z = new M(str);
    }

    public final String a() {
        return "getAccessToken";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(N n, j jVar) {
        this.f14308g = new ka(this, jVar);
        if (this.t) {
            n.a().a(this.z.a(), (T) this.f14303b);
        } else {
            n.a().a(this.z, (T) this.f14303b);
        }
    }

    public final C0534n<N, r> b() {
        C0534n.a a2 = C0534n.a();
        a2.a(false);
        a2.a((this.t || this.u) ? null : new d[]{C0269ga.f4000b});
        a2.a(new C3261j(this));
        return a2.a();
    }

    public final void c() {
        if (TextUtils.isEmpty(this.j.g())) {
            this.j.a(this.z.a());
        }
        ((C3287c) this.f14306e).a(this.j, this.f14305d);
        b(C3295k.a(this.j.h()));
    }
}
