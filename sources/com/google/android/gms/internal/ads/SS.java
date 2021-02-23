package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.i;
import com.google.android.gms.ads.internal.util.oa;
import java.util.ArrayList;

public final class SS {

    /* renamed from: a  reason: collision with root package name */
    public final C2747ura f8615a;

    /* renamed from: b  reason: collision with root package name */
    public final C1905j f8616b;

    /* renamed from: c  reason: collision with root package name */
    public final C0855Ld f8617c;

    /* renamed from: d  reason: collision with root package name */
    public final C2249nqa f8618d;

    /* renamed from: e  reason: collision with root package name */
    public final C2462qqa f8619e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8620f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<String> f8621g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<String> f8622h;
    public final C1368bb i;
    public final C3100zqa j;
    public final int k;
    public final i l;
    public final C2322ora m;
    public final FS n;
    public final boolean o;

    private SS(US us) {
        this.f8619e = us.f8901b;
        this.f8620f = us.f8903d;
        this.f8615a = us.f8902c;
        this.f8618d = new C2249nqa(us.f8900a.f11534a, us.f8900a.f11535b, us.f8900a.f11536c, us.f8900a.f11537d, us.f8900a.f11538e, us.f8900a.f11539f, us.f8900a.f11540g, us.f8900a.f11541h || us.f8905f, us.f8900a.i, us.f8900a.j, us.f8900a.k, us.f8900a.l, us.f8900a.m, us.f8900a.n, us.f8900a.o, us.f8900a.p, us.f8900a.q, us.f8900a.r, us.f8900a.s, us.f8900a.t, us.f8900a.u, us.f8900a.v, oa.a(us.f8900a.w));
        this.f8616b = us.f8904e != null ? us.f8904e : us.i != null ? us.i.f9914f : null;
        this.f8621g = us.f8906g;
        this.f8622h = us.f8907h;
        this.i = us.f8906g == null ? null : us.i == null ? new C1368bb(new c.a().a()) : us.i;
        this.j = us.j;
        this.k = us.m;
        this.l = us.k;
        this.m = us.l;
        this.f8617c = us.n;
        this.n = new FS(us.o);
        this.o = us.p;
    }

    public final C1653fc a() {
        i iVar = this.l;
        if (iVar == null) {
            return null;
        }
        return iVar.i();
    }
}
