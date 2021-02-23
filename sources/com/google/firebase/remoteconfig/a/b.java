package com.google.firebase.remoteconfig.a;

import c.b.e.C0480e;
import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.C0488m;
import c.b.e.n;
import c.b.e.u;
import java.io.IOException;
import java.util.List;

public final class b extends C0487l<b, a> implements c {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final b f14672d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<b> f14673e;

    /* renamed from: f  reason: collision with root package name */
    private int f14674f;

    /* renamed from: g  reason: collision with root package name */
    private C0488m.a<h> f14675g = C0487l.e();

    /* renamed from: h  reason: collision with root package name */
    private long f14676h;
    private C0488m.a<C0480e> i = C0487l.e();

    public static final class a extends C0487l.a<b, a> implements c {
        private a() {
            super(b.f14672d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14672d.f();
    }

    private b() {
    }

    public static b i() {
        return f14672d;
    }

    public static u<b> n() {
        return f14672d.c();
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        List list;
        Object obj3;
        switch (a.f14671a[iVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return f14672d;
            case 3:
                this.f14675g.p();
                this.i.p();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                b bVar = (b) obj2;
                this.f14675g = jVar.a(this.f14675g, bVar.f14675g);
                this.f14676h = jVar.a(m(), this.f14676h, bVar.m(), bVar.f14676h);
                this.i = jVar.a(this.i, bVar.i);
                if (jVar == C0487l.h.f5045a) {
                    this.f14674f |= bVar.f14674f;
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
                                if (!this.f14675g.q()) {
                                    this.f14675g = C0487l.a(this.f14675g);
                                }
                                list = this.f14675g;
                                obj3 = (h) fVar.a(h.l(), hVar);
                            } else if (q == 17) {
                                this.f14674f |= 1;
                                this.f14676h = fVar.f();
                            } else if (q == 26) {
                                if (!this.i.q()) {
                                    this.i = C0487l.a(this.i);
                                }
                                list = this.i;
                                obj3 = fVar.c();
                            } else if (!a(q, fVar)) {
                            }
                            list.add(obj3);
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
                if (f14673e == null) {
                    synchronized (b.class) {
                        if (f14673e == null) {
                            f14673e = new C0487l.b(f14672d);
                        }
                    }
                }
                return f14673e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14672d;
    }

    public List<C0480e> j() {
        return this.i;
    }

    public List<h> k() {
        return this.f14675g;
    }

    public long l() {
        return this.f14676h;
    }

    public boolean m() {
        return (this.f14674f & 1) == 1;
    }
}
