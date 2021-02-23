package com.google.firebase.remoteconfig.a;

import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.C0488m;
import c.b.e.n;
import c.b.e.u;
import com.google.firebase.remoteconfig.a.b;
import com.google.firebase.remoteconfig.a.f;
import java.io.IOException;
import java.io.InputStream;

public final class j extends C0487l<j, a> implements k {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final j f14692d = new j();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<j> f14693e;

    /* renamed from: f  reason: collision with root package name */
    private int f14694f;

    /* renamed from: g  reason: collision with root package name */
    private b f14695g;

    /* renamed from: h  reason: collision with root package name */
    private b f14696h;
    private b i;
    private f j;
    private C0488m.a<l> k = C0487l.e();

    public static final class a extends C0487l.a<j, a> implements k {
        private a() {
            super(j.f14692d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14692d.f();
    }

    private j() {
    }

    public static j a(InputStream inputStream) {
        return (j) C0487l.a(f14692d, inputStream);
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        int i2;
        switch (a.f14671a[iVar.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return f14692d;
            case 3:
                this.k.p();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                j jVar2 = (j) obj2;
                this.f14695g = (b) jVar.a(this.f14695g, jVar2.f14695g);
                this.f14696h = (b) jVar.a(this.f14696h, jVar2.f14696h);
                this.i = (b) jVar.a(this.i, jVar2.i);
                this.j = (f) jVar.a(this.j, jVar2.j);
                this.k = jVar.a(this.k, jVar2.k);
                if (jVar == C0487l.h.f5045a) {
                    this.f14694f |= jVar2.f14694f;
                }
                return this;
            case 6:
                C0481f fVar = (C0481f) obj;
                C0483h hVar = (C0483h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int q = fVar.q();
                        int i3 = 1;
                        if (q != 0) {
                            if (q == 10) {
                                b.a aVar = (this.f14694f & 1) == 1 ? (b.a) this.f14695g.b() : null;
                                this.f14695g = (b) fVar.a(b.n(), hVar);
                                if (aVar != null) {
                                    aVar.b(this.f14695g);
                                    this.f14695g = (b) aVar.b();
                                }
                                i2 = this.f14694f;
                            } else if (q == 18) {
                                i3 = 2;
                                b.a aVar2 = (this.f14694f & 2) == 2 ? (b.a) this.f14696h.b() : null;
                                this.f14696h = (b) fVar.a(b.n(), hVar);
                                if (aVar2 != null) {
                                    aVar2.b(this.f14696h);
                                    this.f14696h = (b) aVar2.b();
                                }
                                i2 = this.f14694f;
                            } else if (q == 26) {
                                i3 = 4;
                                b.a aVar3 = (this.f14694f & 4) == 4 ? (b.a) this.i.b() : null;
                                this.i = (b) fVar.a(b.n(), hVar);
                                if (aVar3 != null) {
                                    aVar3.b(this.i);
                                    this.i = (b) aVar3.b();
                                }
                                i2 = this.f14694f;
                            } else if (q == 34) {
                                i3 = 8;
                                f.a aVar4 = (this.f14694f & 8) == 8 ? (f.a) this.j.b() : null;
                                this.j = (f) fVar.a(f.l(), hVar);
                                if (aVar4 != null) {
                                    aVar4.b(this.j);
                                    this.j = (f) aVar4.b();
                                }
                                i2 = this.f14694f;
                            } else if (q == 42) {
                                if (!this.k.q()) {
                                    this.k = C0487l.a(this.k);
                                }
                                this.k.add((l) fVar.a(l.l(), hVar));
                            } else if (!a(q, fVar)) {
                            }
                            this.f14694f = i2 | i3;
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
                if (f14693e == null) {
                    synchronized (j.class) {
                        if (f14693e == null) {
                            f14693e = new C0487l.b(f14692d);
                        }
                    }
                }
                return f14693e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14692d;
    }

    public b i() {
        b bVar = this.f14696h;
        return bVar == null ? b.i() : bVar;
    }

    public b j() {
        b bVar = this.i;
        return bVar == null ? b.i() : bVar;
    }

    public b k() {
        b bVar = this.f14695g;
        return bVar == null ? b.i() : bVar;
    }
}
