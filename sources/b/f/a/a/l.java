package b.f.a.a;

import b.f.a.a.f;
import b.f.a.a.h;
import b.f.a.e;
import b.f.a.i;
import java.util.ArrayList;

public class l extends h {
    private boolean Aa;
    private int Ba;
    private o Ca;
    private int Da;
    protected float va = -1.0f;
    protected int wa = -1;
    protected int xa = -1;
    private f ya = this.w;
    private int za;

    public l() {
        this.za = 0;
        this.Aa = false;
        this.Ba = 0;
        this.Ca = new o();
        this.Da = 8;
        this.E.clear();
        this.E.add(this.ya);
        int length = this.D.length;
        for (int i = 0; i < length; i++) {
            this.D[i] = this.ya;
        }
    }

    public int J() {
        return this.za;
    }

    public f a(f.c cVar) {
        switch (k.f2311a[cVar.ordinal()]) {
            case 1:
            case 2:
                if (this.za == 1) {
                    return this.ya;
                }
                break;
            case 3:
            case 4:
                if (this.za == 0) {
                    return this.ya;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    public void a(int i) {
        f fVar;
        p pVar;
        int i2;
        f fVar2;
        p pVar2;
        p d2;
        int i3;
        f fVar3;
        p d3;
        h k = k();
        if (k != null) {
            if (J() == 1) {
                this.w.d().a(1, k.w.d(), 0);
                this.y.d().a(1, k.w.d(), 0);
                if (this.wa != -1) {
                    this.v.d().a(1, k.v.d(), this.wa);
                    pVar2 = this.x.d();
                    fVar3 = k.v;
                } else if (this.xa != -1) {
                    this.v.d().a(1, k.x.d(), -this.xa);
                    d3 = this.x.d();
                    fVar2 = k.x;
                    d2 = fVar2.d();
                    i3 = -this.xa;
                    pVar2.a(1, d2, i3);
                } else if (this.va != -1.0f && k.j() == h.a.FIXED) {
                    i2 = (int) (((float) k.H) * this.va);
                    this.v.d().a(1, k.v.d(), i2);
                    pVar = this.x.d();
                    fVar = k.v;
                    pVar.a(1, fVar.d(), i2);
                    return;
                } else {
                    return;
                }
            } else {
                this.v.d().a(1, k.v.d(), 0);
                this.x.d().a(1, k.v.d(), 0);
                if (this.wa != -1) {
                    this.w.d().a(1, k.w.d(), this.wa);
                    pVar2 = this.y.d();
                    fVar3 = k.w;
                } else if (this.xa != -1) {
                    this.w.d().a(1, k.y.d(), -this.xa);
                    d3 = this.y.d();
                    fVar2 = k.y;
                    d2 = fVar2.d();
                    i3 = -this.xa;
                    pVar2.a(1, d2, i3);
                } else if (this.va != -1.0f && k.q() == h.a.FIXED) {
                    i2 = (int) (((float) k.I) * this.va);
                    this.w.d().a(1, k.w.d(), i2);
                    pVar = this.y.d();
                    fVar = k.w;
                    pVar.a(1, fVar.d(), i2);
                    return;
                } else {
                    return;
                }
            }
            d2 = fVar3.d();
            i3 = this.wa;
            pVar2.a(1, d2, i3);
        }
    }

    public void a(e eVar) {
        i iVar = (i) k();
        if (iVar != null) {
            f a2 = iVar.a(f.c.LEFT);
            f a3 = iVar.a(f.c.RIGHT);
            h hVar = this.G;
            boolean z = hVar != null && hVar.F[0] == h.a.WRAP_CONTENT;
            if (this.za == 0) {
                a2 = iVar.a(f.c.TOP);
                a3 = iVar.a(f.c.BOTTOM);
                h hVar2 = this.G;
                z = hVar2 != null && hVar2.F[1] == h.a.WRAP_CONTENT;
            }
            if (this.wa != -1) {
                i a4 = eVar.a((Object) this.ya);
                eVar.a(a4, eVar.a((Object) a2), this.wa, 6);
                if (z) {
                    eVar.b(eVar.a((Object) a3), a4, 0, 5);
                }
            } else if (this.xa != -1) {
                i a5 = eVar.a((Object) this.ya);
                i a6 = eVar.a((Object) a3);
                eVar.a(a5, a6, -this.xa, 6);
                if (z) {
                    eVar.b(a5, eVar.a((Object) a2), 0, 5);
                    eVar.b(a6, a5, 0, 5);
                }
            } else if (this.va != -1.0f) {
                eVar.a(e.a(eVar, eVar.a((Object) this.ya), eVar.a((Object) a2), eVar.a((Object) a3), this.va, this.Aa));
            }
        }
    }

    public boolean a() {
        return true;
    }

    public ArrayList<f> b() {
        return this.E;
    }

    public void c(e eVar) {
        if (k() != null) {
            int b2 = eVar.b((Object) this.ya);
            if (this.za == 1) {
                r(b2);
                s(0);
                g(k().i());
                o(0);
                return;
            }
            r(0);
            s(b2);
            o(k().s());
            g(0);
        }
    }

    public void e(float f2) {
        if (f2 > -1.0f) {
            this.va = f2;
            this.wa = -1;
            this.xa = -1;
        }
    }

    public void t(int i) {
        if (i > -1) {
            this.va = -1.0f;
            this.wa = i;
            this.xa = -1;
        }
    }

    public void u(int i) {
        if (i > -1) {
            this.va = -1.0f;
            this.wa = -1;
            this.xa = i;
        }
    }

    public void v(int i) {
        if (this.za != i) {
            this.za = i;
            this.E.clear();
            this.ya = this.za == 1 ? this.v : this.w;
            this.E.add(this.ya);
            int length = this.D.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.D[i2] = this.ya;
            }
        }
    }
}
