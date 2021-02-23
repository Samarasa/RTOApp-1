package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import java.util.List;

/* renamed from: c.b.b.b.d.f.xb  reason: case insensitive filesystem */
final class C0451xb implements C0453xd {

    /* renamed from: a  reason: collision with root package name */
    private final C0437vb f4630a;

    private C0451xb(C0437vb vbVar) {
        Nb.a(vbVar, "output");
        this.f4630a = vbVar;
        this.f4630a.f4602c = this;
    }

    public static C0451xb a(C0437vb vbVar) {
        C0451xb xbVar = vbVar.f4602c;
        return xbVar != null ? xbVar : new C0451xb(vbVar);
    }

    public final int a() {
        return Lb.e.l;
    }

    public final void a(int i) {
        this.f4630a.a(i, 3);
    }

    public final void a(int i, double d2) {
        this.f4630a.a(i, d2);
    }

    public final void a(int i, float f2) {
        this.f4630a.a(i, f2);
    }

    public final void a(int i, int i2) {
        this.f4630a.b(i, i2);
    }

    public final void a(int i, long j) {
        this.f4630a.a(i, j);
    }

    public final void a(int i, C0320eb ebVar) {
        this.f4630a.a(i, ebVar);
    }

    public final void a(int i, Object obj) {
        if (obj instanceof C0320eb) {
            this.f4630a.b(i, (C0320eb) obj);
        } else {
            this.f4630a.a(i, (C0445wc) obj);
        }
    }

    public final void a(int i, Object obj, Kc kc) {
        this.f4630a.a(i, (C0445wc) obj, kc);
    }

    public final void a(int i, String str) {
        this.f4630a.a(i, str);
    }

    public final void a(int i, List<C0320eb> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f4630a.a(i, list.get(i2));
        }
    }

    public final void a(int i, List<?> list, Kc kc) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, (Object) list.get(i2), kc);
        }
    }

    public final void a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.b(list.get(i4).booleanValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void a(int i, boolean z) {
        this.f4630a.a(i, z);
    }

    public final void b(int i) {
        this.f4630a.a(i, 4);
    }

    public final void b(int i, int i2) {
        this.f4630a.e(i, i2);
    }

    public final void b(int i, long j) {
        this.f4630a.c(i, j);
    }

    public final void b(int i, Object obj, Kc kc) {
        C0437vb vbVar = this.f4630a;
        vbVar.a(i, 3);
        kc.a((C0445wc) obj, (C0453xd) vbVar.f4602c);
        vbVar.a(i, 4);
    }

    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C0307cc) {
            C0307cc ccVar = (C0307cc) list;
            while (i2 < list.size()) {
                Object b2 = ccVar.b(i2);
                if (b2 instanceof String) {
                    this.f4630a.a(i, (String) b2);
                } else {
                    this.f4630a.a(i, (C0320eb) b2);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.a(i, list.get(i2));
            i2++;
        }
    }

    public final void b(int i, List<?> list, Kc kc) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, (Object) list.get(i2), kc);
        }
    }

    public final void b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.f(list.get(i4).intValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void c(int i, int i2) {
        this.f4630a.b(i, i2);
    }

    public final void c(int i, long j) {
        this.f4630a.c(i, j);
    }

    public final void c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.k(list.get(i4).intValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void d(int i, int i2) {
        this.f4630a.d(i, i2);
    }

    public final void d(int i, long j) {
        this.f4630a.a(i, j);
    }

    public final void d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.d(list.get(i4).longValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void e(int i, int i2) {
        this.f4630a.e(i, i2);
    }

    public final void e(int i, long j) {
        this.f4630a.b(i, j);
    }

    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.h(list.get(i4).longValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void f(int i, int i2) {
        this.f4630a.c(i, i2);
    }

    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.i(list.get(i4).intValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.g(list.get(i4).intValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.j(list.get(i4).intValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.g(list.get(i4).longValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.f(list.get(i4).longValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.b(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.e(list.get(i4).longValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.h(list.get(i4).intValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.d(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void m(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.b(list.get(i4).doubleValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void n(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4630a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0437vb.b(list.get(i4).floatValue());
            }
            this.f4630a.b(i3);
            while (i2 < list.size()) {
                this.f4630a.a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4630a.a(i, list.get(i2).floatValue());
            i2++;
        }
    }
}
