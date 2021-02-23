package com.google.firebase.remoteconfig.a;

import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.C0488m;
import c.b.e.n;
import c.b.e.u;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.List;

public final class h extends C0487l<h, a> implements i {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h f14687d = new h();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<h> f14688e;

    /* renamed from: f  reason: collision with root package name */
    private int f14689f;

    /* renamed from: g  reason: collision with root package name */
    private String f14690g = BuildConfig.FLAVOR;

    /* renamed from: h  reason: collision with root package name */
    private C0488m.a<d> f14691h = C0487l.e();

    public static final class a extends C0487l.a<h, a> implements i {
        private a() {
            super(h.f14687d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14687d.f();
    }

    private h() {
    }

    public static u<h> l() {
        return f14687d.c();
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        switch (a.f14671a[iVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return f14687d;
            case 3:
                this.f14691h.p();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                h hVar = (h) obj2;
                this.f14690g = jVar.a(k(), this.f14690g, hVar.k(), hVar.f14690g);
                this.f14691h = jVar.a(this.f14691h, hVar.f14691h);
                if (jVar == C0487l.h.f5045a) {
                    this.f14689f |= hVar.f14689f;
                }
                return this;
            case 6:
                C0481f fVar = (C0481f) obj;
                C0483h hVar2 = (C0483h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int q = fVar.q();
                        if (q != 0) {
                            if (q == 10) {
                                String o = fVar.o();
                                this.f14689f = 1 | this.f14689f;
                                this.f14690g = o;
                            } else if (q == 18) {
                                if (!this.f14691h.q()) {
                                    this.f14691h = C0487l.a(this.f14691h);
                                }
                                this.f14691h.add((d) fVar.a(d.m(), hVar2));
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
                if (f14688e == null) {
                    synchronized (h.class) {
                        if (f14688e == null) {
                            f14688e = new C0487l.b(f14687d);
                        }
                    }
                }
                return f14688e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14687d;
    }

    public List<d> i() {
        return this.f14691h;
    }

    public String j() {
        return this.f14690g;
    }

    public boolean k() {
        return (this.f14689f & 1) == 1;
    }
}
