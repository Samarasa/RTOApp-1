package b.f.a;

import b.f.a.a.f;
import b.f.a.a.h;
import b.f.a.i;
import java.util.Arrays;
import java.util.HashMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static int f2340a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public static f f2341b;

    /* renamed from: c  reason: collision with root package name */
    int f2342c = 0;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, i> f2343d = null;

    /* renamed from: e  reason: collision with root package name */
    private a f2344e;

    /* renamed from: f  reason: collision with root package name */
    private int f2345f = 32;

    /* renamed from: g  reason: collision with root package name */
    private int f2346g;

    /* renamed from: h  reason: collision with root package name */
    b[] f2347h;
    public boolean i;
    private boolean[] j;
    int k;
    int l;
    private int m;
    final c n;
    private i[] o;
    private int p;
    private b[] q;
    private final a r;

    interface a {
        i a(e eVar, boolean[] zArr);

        void a(a aVar);

        void a(i iVar);

        void clear();

        i getKey();
    }

    public e() {
        int i2 = this.f2345f;
        this.f2346g = i2;
        this.f2347h = null;
        this.i = false;
        this.j = new boolean[i2];
        this.k = 1;
        this.l = 0;
        this.m = i2;
        this.o = new i[f2340a];
        this.p = 0;
        this.q = new b[i2];
        this.f2347h = new b[i2];
        j();
        this.n = new c();
        this.f2344e = new d(this.n);
        this.r = new b(this.n);
    }

    private final int a(a aVar, boolean z) {
        f fVar = f2341b;
        if (fVar != null) {
            fVar.f2355h++;
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            this.j[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            f fVar2 = f2341b;
            if (fVar2 != null) {
                fVar2.i++;
            }
            i3++;
            if (i3 >= this.k * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().f2360c] = true;
            }
            i a2 = aVar.a(this, this.j);
            if (a2 != null) {
                boolean[] zArr = this.j;
                int i4 = a2.f2360c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                int i5 = -1;
                float f2 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < this.l; i6++) {
                    b bVar = this.f2347h[i6];
                    if (bVar.f2332a.f2365h != i.a.UNRESTRICTED && !bVar.f2336e && bVar.b(a2)) {
                        float b2 = bVar.f2335d.b(a2);
                        if (b2 < 0.0f) {
                            float f3 = (-bVar.f2333b) / b2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f2347h[i5];
                    bVar2.f2332a.f2361d = -1;
                    f fVar3 = f2341b;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    bVar2.d(a2);
                    i iVar = bVar2.f2332a;
                    iVar.f2361d = i5;
                    iVar.c(bVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    public static b a(e eVar, i iVar, i iVar2, i iVar3, float f2, boolean z) {
        b b2 = eVar.b();
        if (z) {
            eVar.b(b2);
        }
        b2.a(iVar, iVar2, iVar3, f2);
        return b2;
    }

    private i a(i.a aVar, String str) {
        i a2 = this.n.f2338b.a();
        if (a2 == null) {
            a2 = new i(aVar, str);
        } else {
            a2.b();
        }
        a2.a(aVar, str);
        int i2 = this.p;
        int i3 = f2340a;
        if (i2 >= i3) {
            f2340a = i3 * 2;
            this.o = (i[]) Arrays.copyOf(this.o, f2340a);
        }
        i[] iVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iVarArr[i4] = a2;
        return a2;
    }

    private int b(a aVar) {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.l) {
                z = false;
                break;
            }
            b[] bVarArr = this.f2347h;
            if (bVarArr[i2].f2332a.f2365h != i.a.UNRESTRICTED && bVarArr[i2].f2333b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            f fVar = f2341b;
            if (fVar != null) {
                fVar.k++;
            }
            i3++;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            float f3 = Float.MAX_VALUE;
            int i7 = 0;
            while (i4 < this.l) {
                b bVar = this.f2347h[i4];
                if (bVar.f2332a.f2365h != i.a.UNRESTRICTED && !bVar.f2336e && bVar.f2333b < f2) {
                    int i8 = 1;
                    while (i8 < this.k) {
                        i iVar = this.n.f2339c[i8];
                        float b2 = bVar.f2335d.b(iVar);
                        if (b2 > f2) {
                            int i9 = i7;
                            float f4 = f3;
                            int i10 = i6;
                            int i11 = i5;
                            for (int i12 = 0; i12 < 7; i12++) {
                                float f5 = iVar.f2364g[i12] / b2;
                                if ((f5 < f4 && i12 == i9) || i12 > i9) {
                                    i10 = i8;
                                    i11 = i4;
                                    f4 = f5;
                                    i9 = i12;
                                }
                            }
                            i5 = i11;
                            i6 = i10;
                            f3 = f4;
                            i7 = i9;
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                b bVar2 = this.f2347h[i5];
                bVar2.f2332a.f2361d = -1;
                f fVar2 = f2341b;
                if (fVar2 != null) {
                    fVar2.j++;
                }
                bVar2.d(this.n.f2339c[i6]);
                i iVar2 = bVar2.f2332a;
                iVar2.f2361d = i5;
                iVar2.c(bVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.k / 2) {
                z2 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    private void b(b bVar) {
        bVar.a(this, 0);
    }

    private final void c(b bVar) {
        b[] bVarArr = this.f2347h;
        int i2 = this.l;
        if (bVarArr[i2] != null) {
            this.n.f2337a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f2347h;
        int i3 = this.l;
        bVarArr2[i3] = bVar;
        i iVar = bVar.f2332a;
        iVar.f2361d = i3;
        this.l = i3 + 1;
        iVar.c(bVar);
    }

    private final void d(b bVar) {
        if (this.l > 0) {
            bVar.f2335d.a(bVar, this.f2347h);
            if (bVar.f2335d.f2248a == 0) {
                bVar.f2336e = true;
            }
        }
    }

    public static f e() {
        return f2341b;
    }

    private void h() {
        for (int i2 = 0; i2 < this.l; i2++) {
            b bVar = this.f2347h[i2];
            bVar.f2332a.f2363f = bVar.f2333b;
        }
    }

    private void i() {
        this.f2345f *= 2;
        this.f2347h = (b[]) Arrays.copyOf(this.f2347h, this.f2345f);
        c cVar = this.n;
        cVar.f2339c = (i[]) Arrays.copyOf(cVar.f2339c, this.f2345f);
        int i2 = this.f2345f;
        this.j = new boolean[i2];
        this.f2346g = i2;
        this.m = i2;
        f fVar = f2341b;
        if (fVar != null) {
            fVar.f2351d++;
            fVar.o = Math.max(fVar.o, (long) i2);
            f fVar2 = f2341b;
            fVar2.A = fVar2.o;
        }
    }

    private void j() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f2347h;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.n.f2337a.a(bVar);
                }
                this.f2347h[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public b a(i iVar, i iVar2, int i2, int i3) {
        b b2 = b();
        b2.a(iVar, iVar2, i2);
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
        return b2;
    }

    public i a() {
        f fVar = f2341b;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.k + 1 >= this.f2346g) {
            i();
        }
        i a2 = a(i.a.SLACK, (String) null);
        this.f2342c++;
        this.k++;
        int i2 = this.f2342c;
        a2.f2360c = i2;
        this.n.f2339c[i2] = a2;
        return a2;
    }

    public i a(int i2, String str) {
        f fVar = f2341b;
        if (fVar != null) {
            fVar.l++;
        }
        if (this.k + 1 >= this.f2346g) {
            i();
        }
        i a2 = a(i.a.ERROR, str);
        this.f2342c++;
        this.k++;
        int i3 = this.f2342c;
        a2.f2360c = i3;
        a2.f2362e = i2;
        this.n.f2339c[i3] = a2;
        this.f2344e.a(a2);
        return a2;
    }

    public i a(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f2346g) {
            i();
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            iVar = fVar.e();
            if (iVar == null) {
                fVar.a(this.n);
                iVar = fVar.e();
            }
            int i2 = iVar.f2360c;
            if (i2 == -1 || i2 > this.f2342c || this.n.f2339c[i2] == null) {
                if (iVar.f2360c != -1) {
                    iVar.b();
                }
                this.f2342c++;
                this.k++;
                int i3 = this.f2342c;
                iVar.f2360c = i3;
                iVar.f2365h = i.a.UNRESTRICTED;
                this.n.f2339c[i3] = iVar;
            }
        }
        return iVar;
    }

    public void a(h hVar, h hVar2, float f2, int i2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        i a2 = a((Object) hVar3.a(f.c.LEFT));
        i a3 = a((Object) hVar3.a(f.c.TOP));
        i a4 = a((Object) hVar3.a(f.c.RIGHT));
        i a5 = a((Object) hVar3.a(f.c.BOTTOM));
        i a6 = a((Object) hVar4.a(f.c.LEFT));
        i a7 = a((Object) hVar4.a(f.c.TOP));
        i a8 = a((Object) hVar4.a(f.c.RIGHT));
        i a9 = a((Object) hVar4.a(f.c.BOTTOM));
        b b2 = b();
        double d2 = (double) f2;
        double sin = Math.sin(d2);
        i iVar = a4;
        double d3 = (double) i2;
        Double.isNaN(d3);
        b2.b(a3, a5, a7, a9, (float) (sin * d3));
        a(b2);
        b b3 = b();
        double cos = Math.cos(d2);
        Double.isNaN(d3);
        b3.b(a2, iVar, a6, a8, (float) (cos * d3));
        a(b3);
    }

    public void a(b bVar) {
        i c2;
        if (bVar != null) {
            f fVar = f2341b;
            if (fVar != null) {
                fVar.f2353f++;
                if (bVar.f2336e) {
                    fVar.f2354g++;
                }
            }
            if (this.l + 1 >= this.m || this.k + 1 >= this.f2346g) {
                i();
            }
            boolean z = false;
            if (!bVar.f2336e) {
                d(bVar);
                if (!bVar.c()) {
                    bVar.a();
                    if (bVar.a(this)) {
                        i a2 = a();
                        bVar.f2332a = a2;
                        c(bVar);
                        this.r.a((a) bVar);
                        a(this.r, true);
                        if (a2.f2361d == -1) {
                            if (bVar.f2332a == a2 && (c2 = bVar.c(a2)) != null) {
                                f fVar2 = f2341b;
                                if (fVar2 != null) {
                                    fVar2.j++;
                                }
                                bVar.d(c2);
                            }
                            if (!bVar.f2336e) {
                                bVar.f2332a.c(bVar);
                            }
                            this.l--;
                        }
                        z = true;
                    }
                    if (!bVar.b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                c(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, int i2, int i3) {
        bVar.a(a(i3, (String) null), i2);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        f fVar = f2341b;
        if (fVar != null) {
            fVar.s++;
            fVar.t = Math.max(fVar.t, (long) this.k);
            f fVar2 = f2341b;
            fVar2.u = Math.max(fVar2.u, (long) this.l);
        }
        d((b) aVar);
        b(aVar);
        a(aVar, false);
        h();
    }

    public void a(i iVar, int i2) {
        b bVar;
        int i3 = iVar.f2361d;
        if (i3 != -1) {
            b bVar2 = this.f2347h[i3];
            if (!bVar2.f2336e) {
                if (bVar2.f2335d.f2248a == 0) {
                    bVar2.f2336e = true;
                } else {
                    bVar = b();
                    bVar.c(iVar, i2);
                }
            }
            bVar2.f2333b = (float) i2;
            return;
        }
        bVar = b();
        bVar.b(iVar, i2);
        a(bVar);
    }

    public void a(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        int i5 = i4;
        b b2 = b();
        b2.a(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i5 != 6) {
            b2.a(this, i5);
        }
        a(b2);
    }

    public void a(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        b b2 = b();
        b2.a(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
    }

    public void a(i iVar, i iVar2, boolean z) {
        b b2 = b();
        i c2 = c();
        c2.f2362e = 0;
        b2.a(iVar, iVar2, c2, 0);
        if (z) {
            a(b2, (int) (b2.f2335d.b(c2) * -1.0f), 1);
        }
        a(b2);
    }

    public int b(Object obj) {
        i e2 = ((f) obj).e();
        if (e2 != null) {
            return (int) (e2.f2363f + 0.5f);
        }
        return 0;
    }

    public b b() {
        b a2 = this.n.f2337a.a();
        if (a2 == null) {
            a2 = new b(this.n);
        } else {
            a2.d();
        }
        i.a();
        return a2;
    }

    public void b(i iVar, i iVar2, int i2, int i3) {
        b b2 = b();
        i c2 = c();
        c2.f2362e = 0;
        b2.a(iVar, iVar2, c2, i2);
        if (i3 != 6) {
            a(b2, (int) (b2.f2335d.b(c2) * -1.0f), i3);
        }
        a(b2);
    }

    public void b(i iVar, i iVar2, boolean z) {
        b b2 = b();
        i c2 = c();
        c2.f2362e = 0;
        b2.b(iVar, iVar2, c2, 0);
        if (z) {
            a(b2, (int) (b2.f2335d.b(c2) * -1.0f), 1);
        }
        a(b2);
    }

    public i c() {
        f fVar = f2341b;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.k + 1 >= this.f2346g) {
            i();
        }
        i a2 = a(i.a.SLACK, (String) null);
        this.f2342c++;
        this.k++;
        int i2 = this.f2342c;
        a2.f2360c = i2;
        this.n.f2339c[i2] = a2;
        return a2;
    }

    public void c(i iVar, i iVar2, int i2, int i3) {
        b b2 = b();
        i c2 = c();
        c2.f2362e = 0;
        b2.b(iVar, iVar2, c2, i2);
        if (i3 != 6) {
            a(b2, (int) (b2.f2335d.b(c2) * -1.0f), i3);
        }
        a(b2);
    }

    public c d() {
        return this.n;
    }

    public void f() {
        f fVar = f2341b;
        if (fVar != null) {
            fVar.f2352e++;
        }
        if (this.i) {
            f fVar2 = f2341b;
            if (fVar2 != null) {
                fVar2.q++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.l) {
                    z = true;
                    break;
                } else if (!this.f2347h[i2].f2336e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                f fVar3 = f2341b;
                if (fVar3 != null) {
                    fVar3.p++;
                }
                h();
                return;
            }
        }
        a(this.f2344e);
    }

    public void g() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.n;
            i[] iVarArr = cVar.f2339c;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.b();
            }
            i2++;
        }
        cVar.f2338b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.f2339c, (Object) null);
        HashMap<String, i> hashMap = this.f2343d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2342c = 0;
        this.f2344e.clear();
        this.k = 1;
        for (int i3 = 0; i3 < this.l; i3++) {
            this.f2347h[i3].f2334c = false;
        }
        j();
        this.l = 0;
    }
}
