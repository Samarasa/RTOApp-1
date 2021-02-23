package b.f.a.a;

import b.f.a.a.h;
import java.util.ArrayList;

public class d {

    /* renamed from: a  reason: collision with root package name */
    protected h f2256a;

    /* renamed from: b  reason: collision with root package name */
    protected h f2257b;

    /* renamed from: c  reason: collision with root package name */
    protected h f2258c;

    /* renamed from: d  reason: collision with root package name */
    protected h f2259d;

    /* renamed from: e  reason: collision with root package name */
    protected h f2260e;

    /* renamed from: f  reason: collision with root package name */
    protected h f2261f;

    /* renamed from: g  reason: collision with root package name */
    protected h f2262g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<h> f2263h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    private int l;
    private boolean m = false;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public d(h hVar, int i2, boolean z) {
        this.f2256a = hVar;
        this.l = i2;
        this.m = z;
    }

    private static boolean a(h hVar, int i2) {
        if (hVar.r() != 8 && hVar.F[i2] == h.a.MATCH_CONSTRAINT) {
            int[] iArr = hVar.f2297h;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i2 = this.l * 2;
        boolean z = false;
        h hVar = this.f2256a;
        h hVar2 = hVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            h[] hVarArr = hVar.sa;
            int i3 = this.l;
            h hVar3 = null;
            hVarArr[i3] = null;
            hVar.ra[i3] = null;
            if (hVar.r() != 8) {
                if (this.f2257b == null) {
                    this.f2257b = hVar;
                }
                this.f2259d = hVar;
                h.a[] aVarArr = hVar.F;
                int i4 = this.l;
                if (aVarArr[i4] == h.a.MATCH_CONSTRAINT) {
                    int[] iArr = hVar.f2297h;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = hVar.qa;
                        int i5 = this.l;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.k += fArr[i5];
                        }
                        if (a(hVar, this.l)) {
                            if (f2 < 0.0f) {
                                this.n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.f2263h == null) {
                                this.f2263h = new ArrayList<>();
                            }
                            this.f2263h.add(hVar);
                        }
                        if (this.f2261f == null) {
                            this.f2261f = hVar;
                        }
                        h hVar4 = this.f2262g;
                        if (hVar4 != null) {
                            hVar4.ra[this.l] = hVar;
                        }
                        this.f2262g = hVar;
                    }
                }
            }
            if (hVar2 != hVar) {
                hVar2.sa[this.l] = hVar;
            }
            f fVar = hVar.D[i2 + 1].f2268d;
            if (fVar != null) {
                h hVar5 = fVar.f2266b;
                f[] fVarArr = hVar5.D;
                if (fVarArr[i2].f2268d != null && fVarArr[i2].f2268d.f2266b == hVar) {
                    hVar3 = hVar5;
                }
            }
            if (hVar3 == null) {
                hVar3 = hVar;
                z2 = true;
            }
            hVar2 = hVar;
            hVar = hVar3;
        }
        this.f2258c = hVar;
        this.f2260e = (this.l != 0 || !this.m) ? this.f2256a : this.f2258c;
        if (this.o && this.n) {
            z = true;
        }
        this.p = z;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}
