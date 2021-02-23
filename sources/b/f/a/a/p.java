package b.f.a.a;

import b.f.a.a.f;
import b.f.a.e;
import b.f.a.i;

public class p extends r {

    /* renamed from: c  reason: collision with root package name */
    f f2313c;

    /* renamed from: d  reason: collision with root package name */
    float f2314d;

    /* renamed from: e  reason: collision with root package name */
    p f2315e;

    /* renamed from: f  reason: collision with root package name */
    float f2316f;

    /* renamed from: g  reason: collision with root package name */
    p f2317g;

    /* renamed from: h  reason: collision with root package name */
    float f2318h;
    int i = 0;
    private p j;
    private float k;
    private q l = null;
    private int m = 1;
    private q n = null;
    private int o = 1;

    public p(f fVar) {
        this.f2313c = fVar;
    }

    /* access modifiers changed from: package-private */
    public String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(int i2, p pVar, int i3) {
        this.i = i2;
        this.f2315e = pVar;
        this.f2316f = (float) i3;
        this.f2315e.a(this);
    }

    public void a(p pVar, float f2) {
        if (this.f2321b == 0 || !(this.f2317g == pVar || this.f2318h == f2)) {
            this.f2317g = pVar;
            this.f2318h = f2;
            if (this.f2321b == 1) {
                b();
            }
            a();
        }
    }

    public void a(p pVar, int i2) {
        this.f2315e = pVar;
        this.f2316f = (float) i2;
        this.f2315e.a(this);
    }

    public void a(p pVar, int i2, q qVar) {
        this.f2315e = pVar;
        this.f2315e.a(this);
        this.l = qVar;
        this.m = i2;
        this.l.a(this);
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar) {
        i e2 = this.f2313c.e();
        p pVar = this.f2317g;
        if (pVar == null) {
            eVar.a(e2, (int) (this.f2318h + 0.5f));
        } else {
            eVar.a(e2, eVar.a((Object) pVar.f2313c), (int) (this.f2318h + 0.5f), 6);
        }
    }

    public void b(int i2) {
        this.i = i2;
    }

    public void b(p pVar, float f2) {
        this.j = pVar;
        this.k = f2;
    }

    public void b(p pVar, int i2, q qVar) {
        this.j = pVar;
        this.n = qVar;
        this.o = i2;
    }

    public void d() {
        super.d();
        this.f2315e = null;
        this.f2316f = 0.0f;
        this.l = null;
        this.m = 1;
        this.n = null;
        this.o = 1;
        this.f2317g = null;
        this.f2318h = 0.0f;
        this.f2314d = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.i = 0;
    }

    public void e() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6;
        p pVar7;
        float f2;
        float f3;
        float f4;
        p pVar8;
        float f5;
        boolean z = true;
        if (this.f2321b != 1 && this.i != 4) {
            q qVar = this.l;
            if (qVar != null) {
                if (qVar.f2321b == 1) {
                    this.f2316f = ((float) this.m) * qVar.f2319c;
                } else {
                    return;
                }
            }
            q qVar2 = this.n;
            if (qVar2 != null) {
                if (qVar2.f2321b == 1) {
                    this.k = ((float) this.o) * qVar2.f2319c;
                } else {
                    return;
                }
            }
            if (this.i == 1 && ((pVar8 = this.f2315e) == null || pVar8.f2321b == 1)) {
                p pVar9 = this.f2315e;
                if (pVar9 == null) {
                    this.f2317g = this;
                    f5 = this.f2316f;
                } else {
                    this.f2317g = pVar9.f2317g;
                    f5 = pVar9.f2318h + this.f2316f;
                }
                this.f2318h = f5;
                a();
                return;
            }
            if (this.i == 2 && (pVar4 = this.f2315e) != null && pVar4.f2321b == 1 && (pVar5 = this.j) != null && (pVar6 = pVar5.f2315e) != null && pVar6.f2321b == 1) {
                if (e.e() != null) {
                    e.e().v++;
                }
                this.f2317g = this.f2315e.f2317g;
                p pVar10 = this.j;
                pVar10.f2317g = pVar10.f2315e.f2317g;
                f.c cVar = this.f2313c.f2267c;
                int i2 = 0;
                if (!(cVar == f.c.RIGHT || cVar == f.c.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f2 = this.f2315e.f2318h;
                    pVar7 = this.j.f2315e;
                } else {
                    f2 = this.j.f2315e.f2318h;
                    pVar7 = this.f2315e;
                }
                float f6 = f2 - pVar7.f2318h;
                f fVar = this.f2313c;
                f.c cVar2 = fVar.f2267c;
                if (cVar2 == f.c.LEFT || cVar2 == f.c.RIGHT) {
                    f4 = f6 - ((float) this.f2313c.f2266b.s());
                    f3 = this.f2313c.f2266b.aa;
                } else {
                    f4 = f6 - ((float) fVar.f2266b.i());
                    f3 = this.f2313c.f2266b.ba;
                }
                int b2 = this.f2313c.b();
                int b3 = this.j.f2313c.b();
                if (this.f2313c.g() == this.j.f2313c.g()) {
                    f3 = 0.5f;
                    b3 = 0;
                } else {
                    i2 = b2;
                }
                float f7 = (float) i2;
                float f8 = (float) b3;
                float f9 = (f4 - f7) - f8;
                if (z) {
                    p pVar11 = this.j;
                    pVar11.f2318h = pVar11.f2315e.f2318h + f8 + (f9 * f3);
                    this.f2318h = (this.f2315e.f2318h - f7) - (f9 * (1.0f - f3));
                } else {
                    this.f2318h = this.f2315e.f2318h + f7 + (f9 * f3);
                    p pVar12 = this.j;
                    pVar12.f2318h = (pVar12.f2315e.f2318h - f8) - (f9 * (1.0f - f3));
                }
            } else if (this.i == 3 && (pVar = this.f2315e) != null && pVar.f2321b == 1 && (pVar2 = this.j) != null && (pVar3 = pVar2.f2315e) != null && pVar3.f2321b == 1) {
                if (e.e() != null) {
                    e.e().w++;
                }
                p pVar13 = this.f2315e;
                this.f2317g = pVar13.f2317g;
                p pVar14 = this.j;
                p pVar15 = pVar14.f2315e;
                pVar14.f2317g = pVar15.f2317g;
                this.f2318h = pVar13.f2318h + this.f2316f;
                pVar14.f2318h = pVar15.f2318h + pVar14.f2316f;
            } else if (this.i == 5) {
                this.f2313c.f2266b.G();
                return;
            } else {
                return;
            }
            a();
            this.j.a();
        }
    }

    public float f() {
        return this.f2318h;
    }

    public void g() {
        f g2 = this.f2313c.g();
        if (g2 != null) {
            if (g2.g() == this.f2313c) {
                this.i = 4;
                g2.d().i = 4;
            }
            int b2 = this.f2313c.b();
            f.c cVar = this.f2313c.f2267c;
            if (cVar == f.c.RIGHT || cVar == f.c.BOTTOM) {
                b2 = -b2;
            }
            a(g2.d(), b2);
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f2321b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f2313c);
            str = " UNRESOLVED} type: ";
        } else if (this.f2317g == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f2313c);
            sb.append(", RESOLVED: ");
            sb.append(this.f2318h);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f2313c);
            sb.append(", RESOLVED: ");
            sb.append(this.f2317g);
            sb.append(":");
            sb.append(this.f2318h);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(a(this.i));
        return sb.toString();
    }
}
