package e.a.a;

import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.C0488m;
import c.b.e.n;
import c.b.e.u;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;

public final class d extends C0487l<d, a> implements e {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final d f14820d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<d> f14821e;

    /* renamed from: f  reason: collision with root package name */
    private int f14822f;

    /* renamed from: g  reason: collision with root package name */
    private String f14823g = BuildConfig.FLAVOR;

    /* renamed from: h  reason: collision with root package name */
    private String f14824h = BuildConfig.FLAVOR;
    private long i;
    private String j = BuildConfig.FLAVOR;
    private long k;
    private long l;
    private String m = BuildConfig.FLAVOR;
    private String n = BuildConfig.FLAVOR;
    private String o = BuildConfig.FLAVOR;
    private String p = BuildConfig.FLAVOR;
    private String q = BuildConfig.FLAVOR;
    private int r;
    private C0488m.a<b> s = C0487l.e();

    public static final class a extends C0487l.a<d, a> implements e {
        private a() {
            super(d.f14820d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14820d.f();
    }

    private d() {
    }

    public static d a(byte[] bArr) {
        return (d) C0487l.a(f14820d, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        boolean z = false;
        switch (a.f14816a[iVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return f14820d;
            case 3:
                this.s.p();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                C0487l.j jVar = (C0487l.j) obj;
                d dVar = (d) obj2;
                this.f14823g = jVar.a(!this.f14823g.isEmpty(), this.f14823g, !dVar.f14823g.isEmpty(), dVar.f14823g);
                this.f14824h = jVar.a(!this.f14824h.isEmpty(), this.f14824h, !dVar.f14824h.isEmpty(), dVar.f14824h);
                this.i = jVar.a(this.i != 0, this.i, dVar.i != 0, dVar.i);
                this.j = jVar.a(!this.j.isEmpty(), this.j, !dVar.j.isEmpty(), dVar.j);
                this.k = jVar.a(this.k != 0, this.k, dVar.k != 0, dVar.k);
                this.l = jVar.a(this.l != 0, this.l, dVar.l != 0, dVar.l);
                this.m = jVar.a(!this.m.isEmpty(), this.m, !dVar.m.isEmpty(), dVar.m);
                this.n = jVar.a(!this.n.isEmpty(), this.n, !dVar.n.isEmpty(), dVar.n);
                this.o = jVar.a(!this.o.isEmpty(), this.o, !dVar.o.isEmpty(), dVar.o);
                this.p = jVar.a(!this.p.isEmpty(), this.p, !dVar.p.isEmpty(), dVar.p);
                this.q = jVar.a(!this.q.isEmpty(), this.q, !dVar.q.isEmpty(), dVar.q);
                boolean z2 = this.r != 0;
                int i2 = this.r;
                if (dVar.r != 0) {
                    z = true;
                }
                this.r = jVar.a(z2, i2, z, dVar.r);
                this.s = jVar.a(this.s, dVar.s);
                if (jVar == C0487l.h.f5045a) {
                    this.f14822f |= dVar.f14822f;
                }
                return this;
            case 6:
                C0481f fVar = (C0481f) obj;
                C0483h hVar = (C0483h) obj2;
                while (!z) {
                    try {
                        int q2 = fVar.q();
                        switch (q2) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f14823g = fVar.p();
                                break;
                            case 18:
                                this.f14824h = fVar.p();
                                break;
                            case 24:
                                this.i = fVar.h();
                                break;
                            case 34:
                                this.j = fVar.p();
                                break;
                            case 40:
                                this.k = fVar.h();
                                break;
                            case 48:
                                this.l = fVar.h();
                                break;
                            case 58:
                                this.m = fVar.p();
                                break;
                            case 66:
                                this.n = fVar.p();
                                break;
                            case 74:
                                this.o = fVar.p();
                                break;
                            case 82:
                                this.p = fVar.p();
                                break;
                            case 90:
                                this.q = fVar.p();
                                break;
                            case 96:
                                this.r = fVar.d();
                                break;
                            case 106:
                                if (!this.s.q()) {
                                    this.s = C0487l.a(this.s);
                                }
                                this.s.add((b) fVar.a(b.i(), hVar));
                                break;
                            default:
                                if (fVar.d(q2)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f14821e == null) {
                    synchronized (d.class) {
                        if (f14821e == null) {
                            f14821e = new C0487l.b(f14820d);
                        }
                    }
                }
                return f14821e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14820d;
    }

    public String i() {
        return this.f14823g;
    }

    public long j() {
        return this.i;
    }

    public long k() {
        return this.l;
    }

    public String l() {
        return this.j;
    }

    public long m() {
        return this.k;
    }

    public String n() {
        return this.f14824h;
    }
}
