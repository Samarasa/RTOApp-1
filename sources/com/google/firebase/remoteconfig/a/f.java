package com.google.firebase.remoteconfig.a;

import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.n;
import c.b.e.u;
import java.io.IOException;

public final class f extends C0487l<f, a> implements g {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final f f14682d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<f> f14683e;

    /* renamed from: f  reason: collision with root package name */
    private int f14684f;

    /* renamed from: g  reason: collision with root package name */
    private int f14685g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14686h;
    private long i;

    public static final class a extends C0487l.a<f, a> implements g {
        private a() {
            super(f.f14682d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14682d.f();
    }

    private f() {
    }

    public static u<f> l() {
        return f14682d.c();
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        switch (a.f14671a[iVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return f14682d;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                f fVar = (f) obj2;
                this.f14685g = jVar.a(j(), this.f14685g, fVar.j(), fVar.f14685g);
                this.f14686h = jVar.a(i(), this.f14686h, fVar.i(), fVar.f14686h);
                this.i = jVar.a(k(), this.i, fVar.k(), fVar.i);
                if (jVar == C0487l.h.f5045a) {
                    this.f14684f |= fVar.f14684f;
                }
                return this;
            case 6:
                C0481f fVar2 = (C0481f) obj;
                C0483h hVar = (C0483h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int q = fVar2.q();
                        if (q != 0) {
                            if (q == 8) {
                                this.f14684f |= 1;
                                this.f14685g = fVar2.g();
                            } else if (q == 16) {
                                this.f14684f |= 2;
                                this.f14686h = fVar2.b();
                            } else if (q == 25) {
                                this.f14684f |= 4;
                                this.i = fVar2.f();
                            } else if (!a(q, fVar2)) {
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
                if (f14683e == null) {
                    synchronized (f.class) {
                        if (f14683e == null) {
                            f14683e = new C0487l.b(f14682d);
                        }
                    }
                }
                return f14683e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14682d;
    }

    public boolean i() {
        return (this.f14684f & 2) == 2;
    }

    public boolean j() {
        return (this.f14684f & 1) == 1;
    }

    public boolean k() {
        return (this.f14684f & 4) == 4;
    }
}
