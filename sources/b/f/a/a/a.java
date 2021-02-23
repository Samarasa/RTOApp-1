package b.f.a.a;

import b.f.a.a.f;
import b.f.a.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a {
    private static int a(h hVar) {
        if (hVar.j() == h.a.MATCH_CONSTRAINT) {
            int i = (int) (hVar.K == 0 ? ((float) hVar.i()) * hVar.J : ((float) hVar.i()) / hVar.J);
            hVar.o(i);
            return i;
        } else if (hVar.q() != h.a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int s = (int) (hVar.K == 1 ? ((float) hVar.s()) * hVar.J : ((float) hVar.s()) / hVar.J);
            hVar.g(s);
            return s;
        }
    }

    private static int a(h hVar, int i) {
        h hVar2;
        f fVar;
        int i2 = i * 2;
        f[] fVarArr = hVar.D;
        f fVar2 = fVarArr[i2];
        f fVar3 = fVarArr[i2 + 1];
        f fVar4 = fVar2.f2268d;
        if (fVar4 == null || fVar4.f2266b != (hVar2 = hVar.G) || (fVar = fVar3.f2268d) == null || fVar.f2266b != hVar2) {
            return 0;
        }
        return (int) (((float) (((hVar2.d(i) - fVar2.b()) - fVar3.b()) - hVar.d(i))) * (i == 0 ? hVar.aa : hVar.ba));
    }

    private static int a(h hVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int s;
        int i9;
        int i10;
        int i11;
        h hVar2 = hVar;
        int i12 = i;
        boolean z2 = z;
        int i13 = 0;
        if (!hVar2.ja) {
            return 0;
        }
        boolean z3 = hVar2.z.f2268d != null && i12 == 1;
        if (z2) {
            i6 = hVar.c();
            i5 = hVar.i() - hVar.c();
            i4 = i12 * 2;
            i3 = i4 + 1;
        } else {
            i6 = hVar.i() - hVar.c();
            i5 = hVar.c();
            i3 = i12 * 2;
            i4 = i3 + 1;
        }
        f[] fVarArr = hVar2.D;
        if (fVarArr[i3].f2268d == null || fVarArr[i4].f2268d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int i14 = z3 ? i2 - i6 : i2;
        int b2 = (hVar2.D[i4].b() * i8) + a(hVar, i);
        int i15 = i14 + b2;
        int s2 = (i12 == 0 ? hVar.s() : hVar.i()) * i8;
        Iterator<r> it = hVar2.D[i4].d().f2320a.iterator();
        while (it.hasNext()) {
            i13 = Math.max(i13, a(((p) it.next()).f2313c.f2266b, i12, z2, i15));
        }
        int i16 = 0;
        for (Iterator<r> it2 = hVar2.D[i7].d().f2320a.iterator(); it2.hasNext(); it2 = it2) {
            i16 = Math.max(i16, a(((p) it2.next()).f2313c.f2266b, i12, z2, s2 + i15));
        }
        if (z3) {
            i13 -= i6;
            s = i16 + i5;
        } else {
            s = i16 + ((i12 == 0 ? hVar.s() : hVar.i()) * i8);
        }
        int i17 = 1;
        if (i12 == 1) {
            Iterator<r> it3 = hVar2.z.d().f2320a.iterator();
            int i18 = 0;
            while (it3.hasNext()) {
                Iterator<r> it4 = it3;
                p pVar = (p) it3.next();
                if (i8 == i17) {
                    i18 = Math.max(i18, a(pVar.f2313c.f2266b, i12, z2, i6 + i15));
                    i11 = i7;
                } else {
                    i11 = i7;
                    i18 = Math.max(i18, a(pVar.f2313c.f2266b, i12, z2, (i5 * i8) + i15));
                }
                it3 = it4;
                i7 = i11;
                i17 = 1;
            }
            i9 = i7;
            int i19 = i18;
            i10 = (hVar2.z.d().f2320a.size() <= 0 || z3) ? i19 : i8 == 1 ? i19 + i6 : i19 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = b2 + Math.max(i13, Math.max(s, i10));
        int i20 = i15 + s2;
        if (i8 != -1) {
            int i21 = i15;
            i15 = i20;
            i20 = i21;
        }
        if (z2) {
            n.a(hVar2, i12, i20);
            hVar2.a(i20, i15, i12);
        } else {
            hVar2.s.a(hVar2, i12);
            hVar2.d(i20, i12);
        }
        if (hVar.c(i) == h.a.MATCH_CONSTRAINT && hVar2.J != 0.0f) {
            hVar2.s.a(hVar2, i12);
        }
        f[] fVarArr2 = hVar2.D;
        if (!(fVarArr2[i4].f2268d == null || fVarArr2[i9].f2268d == null)) {
            h k = hVar.k();
            f[] fVarArr3 = hVar2.D;
            if (fVarArr3[i4].f2268d.f2266b == k && fVarArr3[i9].f2268d.f2266b == k) {
                hVar2.s.a(hVar2, i12);
            }
        }
        return max;
    }

    private static int a(j jVar, int i) {
        int i2 = i * 2;
        List<h> a2 = jVar.a(i);
        int size = a2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            h hVar = a2.get(i4);
            f[] fVarArr = hVar.D;
            int i5 = i2 + 1;
            i3 = Math.max(i3, a(hVar, i, fVarArr[i5].f2268d == null || !(fVarArr[i2].f2268d == null || fVarArr[i5].f2268d == null), 0));
        }
        jVar.f2307e[i] = i3;
        return i3;
    }

    private static void a(f fVar) {
        p d2 = fVar.d();
        f fVar2 = fVar.f2268d;
        if (fVar2 != null && fVar2.f2268d != fVar) {
            fVar2.d().a(d2);
        }
    }

    private static void a(h hVar, int i, int i2) {
        int i3 = i * 2;
        f[] fVarArr = hVar.D;
        f fVar = fVarArr[i3];
        f fVar2 = fVarArr[i3 + 1];
        if ((fVar.f2268d == null || fVar2.f2268d == null) ? false : true) {
            n.a(hVar, i, a(hVar, i) + fVar.b());
        } else if (hVar.J == 0.0f || hVar.c(i) != h.a.MATCH_CONSTRAINT) {
            int e2 = i2 - hVar.e(i);
            int d2 = e2 - hVar.d(i);
            hVar.a(d2, e2, i);
            n.a(hVar, i, d2);
        } else {
            int a2 = a(hVar);
            int i4 = (int) hVar.D[i3].d().f2318h;
            fVar2.d().f2317g = fVar.d();
            fVar2.d().f2318h = (float) a2;
            fVar2.d().f2321b = 1;
            hVar.a(i4, i4 + a2, i);
        }
    }

    public static void a(i iVar) {
        if ((iVar.M() & 32) != 32) {
            b(iVar);
            return;
        }
        iVar.Oa = true;
        iVar.Ia = false;
        iVar.Ja = false;
        iVar.Ka = false;
        ArrayList<h> arrayList = iVar.va;
        List<j> list = iVar.Ha;
        boolean z = iVar.j() == h.a.WRAP_CONTENT;
        boolean z2 = iVar.q() == h.a.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (h next : arrayList) {
            next.s = null;
            next.la = false;
            next.F();
        }
        for (h next2 : arrayList) {
            if (next2.s == null && !a(next2, list, z3)) {
                b(iVar);
                iVar.Oa = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (j next3 : list) {
            i = Math.max(i, a(next3, 0));
            i2 = Math.max(i2, a(next3, 1));
        }
        if (z) {
            iVar.a(h.a.FIXED);
            iVar.o(i);
            iVar.Ia = true;
            iVar.Ja = true;
            iVar.La = i;
        }
        if (z2) {
            iVar.b(h.a.FIXED);
            iVar.g(i2);
            iVar.Ia = true;
            iVar.Ka = true;
            iVar.Ma = i2;
        }
        a(list, 0, iVar.s());
        a(list, 1, iVar.i());
    }

    private static void a(i iVar, h hVar, j jVar) {
        jVar.f2306d = false;
        iVar.Oa = false;
        hVar.ja = false;
    }

    public static void a(List<j> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (h next : list.get(i3).b(i)) {
                if (next.ja) {
                    a(next, i, i2);
                }
            }
        }
    }

    private static boolean a(h hVar, j jVar, List<j> list, boolean z) {
        f fVar;
        f fVar2;
        f fVar3;
        h hVar2;
        f fVar4;
        f fVar5;
        f fVar6;
        f fVar7;
        h hVar3;
        f fVar8;
        if (hVar == null) {
            return true;
        }
        hVar.ka = false;
        i iVar = (i) hVar.k();
        j jVar2 = hVar.s;
        if (jVar2 == null) {
            hVar.ja = true;
            jVar.f2303a.add(hVar);
            hVar.s = jVar;
            if (hVar.v.f2268d == null && hVar.x.f2268d == null && hVar.w.f2268d == null && hVar.y.f2268d == null && hVar.z.f2268d == null && hVar.C.f2268d == null) {
                a(iVar, hVar, jVar);
                if (z) {
                    return false;
                }
            }
            if (!(hVar.w.f2268d == null || hVar.y.f2268d == null)) {
                h.a q = iVar.q();
                h.a aVar = h.a.WRAP_CONTENT;
                if (z) {
                    a(iVar, hVar, jVar);
                    return false;
                } else if (!(hVar.w.f2268d.f2266b == hVar.k() && hVar.y.f2268d.f2266b == hVar.k())) {
                    a(iVar, hVar, jVar);
                }
            }
            if (!(hVar.v.f2268d == null || hVar.x.f2268d == null)) {
                h.a j = iVar.j();
                h.a aVar2 = h.a.WRAP_CONTENT;
                if (z) {
                    a(iVar, hVar, jVar);
                    return false;
                } else if (!(hVar.v.f2268d.f2266b == hVar.k() && hVar.x.f2268d.f2266b == hVar.k())) {
                    a(iVar, hVar, jVar);
                }
            }
            if (((hVar.j() == h.a.MATCH_CONSTRAINT) ^ (hVar.q() == h.a.MATCH_CONSTRAINT)) && hVar.J != 0.0f) {
                a(hVar);
            } else if (hVar.j() == h.a.MATCH_CONSTRAINT || hVar.q() == h.a.MATCH_CONSTRAINT) {
                a(iVar, hVar, jVar);
                if (z) {
                    return false;
                }
            }
            if (((hVar.v.f2268d == null && hVar.x.f2268d == null) || (((fVar5 = hVar.v.f2268d) != null && fVar5.f2266b == hVar.G && hVar.x.f2268d == null) || (((fVar6 = hVar.x.f2268d) != null && fVar6.f2266b == hVar.G && hVar.v.f2268d == null) || ((fVar7 = hVar.v.f2268d) != null && fVar7.f2266b == (hVar3 = hVar.G) && (fVar8 = hVar.x.f2268d) != null && fVar8.f2266b == hVar3)))) && hVar.C.f2268d == null && !(hVar instanceof l) && !(hVar instanceof m)) {
                jVar.f2308f.add(hVar);
            }
            if (((hVar.w.f2268d == null && hVar.y.f2268d == null) || (((fVar = hVar.w.f2268d) != null && fVar.f2266b == hVar.G && hVar.y.f2268d == null) || (((fVar2 = hVar.y.f2268d) != null && fVar2.f2266b == hVar.G && hVar.w.f2268d == null) || ((fVar3 = hVar.w.f2268d) != null && fVar3.f2266b == (hVar2 = hVar.G) && (fVar4 = hVar.y.f2268d) != null && fVar4.f2266b == hVar2)))) && hVar.C.f2268d == null && hVar.z.f2268d == null && !(hVar instanceof l) && !(hVar instanceof m)) {
                jVar.f2309g.add(hVar);
            }
            if (hVar instanceof m) {
                a(iVar, hVar, jVar);
                if (z) {
                    return false;
                }
                m mVar = (m) hVar;
                for (int i = 0; i < mVar.wa; i++) {
                    if (!a(mVar.va[i], jVar, list, z)) {
                        return false;
                    }
                }
            }
            for (f fVar9 : hVar.D) {
                f fVar10 = fVar9.f2268d;
                if (!(fVar10 == null || fVar10.f2266b == hVar.k())) {
                    if (fVar9.f2267c == f.c.CENTER) {
                        a(iVar, hVar, jVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        a(fVar9);
                    }
                    if (!a(fVar9.f2268d.f2266b, jVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (jVar2 != jVar) {
            jVar.f2303a.addAll(jVar2.f2303a);
            jVar.f2308f.addAll(hVar.s.f2308f);
            jVar.f2309g.addAll(hVar.s.f2309g);
            if (!hVar.s.f2306d) {
                jVar.f2306d = false;
            }
            list.remove(hVar.s);
            for (h hVar4 : hVar.s.f2303a) {
                hVar4.s = jVar;
            }
        }
        return true;
    }

    private static boolean a(h hVar, List<j> list, boolean z) {
        j jVar = new j(new ArrayList(), true);
        list.add(jVar);
        return a(hVar, jVar, list, z);
    }

    private static void b(i iVar) {
        iVar.Ha.clear();
        iVar.Ha.add(0, new j(iVar.va));
    }
}
