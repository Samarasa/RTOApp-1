package com.google.firebase.auth;

import c.b.b.b.d.d.ra;
import c.b.b.b.g.i;
import c.b.d.e;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import java.util.List;

/* renamed from: com.google.firebase.auth.p  reason: case insensitive filesystem */
public abstract class C3306p extends a implements A {
    public i<C3278c> a(C3277b bVar) {
        C0563t.a(bVar);
        return FirebaseAuth.getInstance(j()).b(this, bVar);
    }

    public abstract C3306p a(List<? extends A> list);

    public abstract List<String> a();

    public abstract void a(ra raVar);

    public i<C3278c> b(C3277b bVar) {
        C0563t.a(bVar);
        return FirebaseAuth.getInstance(j()).a(this, bVar);
    }

    public abstract C3306p b();

    public abstract void b(List<W> list);

    public abstract List<? extends A> g();

    public abstract String h();

    public abstract boolean i();

    public abstract e j();

    public abstract String k();

    public abstract ra l();

    public abstract String u();

    public abstract String v();

    public abstract X w();
}
