package com.google.firebase.remoteconfig.a;

import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.n;
import c.b.e.u;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;

public final class l extends C0487l<l, a> implements m {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final l f14697d = new l();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<l> f14698e;

    /* renamed from: f  reason: collision with root package name */
    private int f14699f;

    /* renamed from: g  reason: collision with root package name */
    private int f14700g;

    /* renamed from: h  reason: collision with root package name */
    private long f14701h;
    private String i = BuildConfig.FLAVOR;

    public static final class a extends C0487l.a<l, a> implements m {
        private a() {
            super(l.f14697d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14697d.f();
    }

    private l() {
    }

    public static u<l> l() {
        return f14697d.c();
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        switch (a.f14671a[iVar.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return f14697d;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                l lVar = (l) obj2;
                this.f14700g = jVar.a(k(), this.f14700g, lVar.k(), lVar.f14700g);
                this.f14701h = jVar.a(i(), this.f14701h, lVar.i(), lVar.f14701h);
                this.i = jVar.a(j(), this.i, lVar.j(), lVar.i);
                if (jVar == C0487l.h.f5045a) {
                    this.f14699f |= lVar.f14699f;
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
                            if (q == 8) {
                                this.f14699f |= 1;
                                this.f14700g = fVar.g();
                            } else if (q == 17) {
                                this.f14699f |= 2;
                                this.f14701h = fVar.f();
                            } else if (q == 26) {
                                String o = fVar.o();
                                this.f14699f |= 4;
                                this.i = o;
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
                if (f14698e == null) {
                    synchronized (l.class) {
                        if (f14698e == null) {
                            f14698e = new C0487l.b(f14697d);
                        }
                    }
                }
                return f14698e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14697d;
    }

    public boolean i() {
        return (this.f14699f & 2) == 2;
    }

    public boolean j() {
        return (this.f14699f & 4) == 4;
    }

    public boolean k() {
        return (this.f14699f & 1) == 1;
    }
}
