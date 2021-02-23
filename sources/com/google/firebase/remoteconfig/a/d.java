package com.google.firebase.remoteconfig.a;

import c.b.e.C0480e;
import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.n;
import c.b.e.u;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;

public final class d extends C0487l<d, a> implements e {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final d f14677d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<d> f14678e;

    /* renamed from: f  reason: collision with root package name */
    private int f14679f;

    /* renamed from: g  reason: collision with root package name */
    private String f14680g = BuildConfig.FLAVOR;

    /* renamed from: h  reason: collision with root package name */
    private C0480e f14681h = C0480e.f5007a;

    public static final class a extends C0487l.a<d, a> implements e {
        private a() {
            super(d.f14677d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14677d.f();
    }

    private d() {
    }

    public static u<d> m() {
        return f14677d.c();
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        switch (a.f14671a[iVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return f14677d;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                d dVar = (d) obj2;
                this.f14680g = jVar.a(k(), this.f14680g, dVar.k(), dVar.f14680g);
                this.f14681h = jVar.a(l(), this.f14681h, dVar.l(), dVar.f14681h);
                if (jVar == C0487l.h.f5045a) {
                    this.f14679f |= dVar.f14679f;
                }
                return this;
            case 6:
                C0481f fVar = (C0481f) obj;
                C0483h hVar = (C0483h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int q = fVar.q();
                        if (q != 0) {
                            if (q == 10) {
                                String o = fVar.o();
                                this.f14679f = 1 | this.f14679f;
                                this.f14680g = o;
                            } else if (q == 18) {
                                this.f14679f |= 2;
                                this.f14681h = fVar.c();
                            } else if (!a(q, fVar)) {
                            }
                        }
                        z = true;
                    } catch (n e2) {
                        e2.a(this);
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        n nVar = new n(e3.getMessage());
                        nVar.a(this);
                        throw new RuntimeException(nVar);
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f14678e == null) {
                    synchronized (d.class) {
                        if (f14678e == null) {
                            f14678e = new C0487l.b(f14677d);
                        }
                    }
                }
                return f14678e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14677d;
    }

    public String i() {
        return this.f14680g;
    }

    public C0480e j() {
        return this.f14681h;
    }

    public boolean k() {
        return (this.f14679f & 1) == 1;
    }

    public boolean l() {
        return (this.f14679f & 2) == 2;
    }
}
