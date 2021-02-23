package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hea  reason: case insensitive filesystem */
final class C1800hea implements C2583sga {

    /* renamed from: a  reason: collision with root package name */
    private final C1658fea f10693a;

    private C1800hea(C1658fea fea) {
        Aea.a(fea, "output");
        this.f10693a = fea;
        this.f10693a.f10422c = this;
    }

    public static C1800hea a(C1658fea fea) {
        C1800hea hea = fea.f10422c;
        return hea != null ? hea : new C1800hea(fea);
    }

    public final int a() {
        return C2512rga.f12004a;
    }

    public final void a(int i) {
        this.f10693a.a(i, 3);
    }

    public final void a(int i, double d2) {
        this.f10693a.a(i, d2);
    }

    public final void a(int i, float f2) {
        this.f10693a.a(i, f2);
    }

    public final void a(int i, int i2) {
        this.f10693a.b(i, i2);
    }

    public final void a(int i, long j) {
        this.f10693a.b(i, j);
    }

    public final void a(int i, Lda lda) {
        this.f10693a.a(i, lda);
    }

    public final void a(int i, Object obj) {
        if (obj instanceof Lda) {
            this.f10693a.b(i, (Lda) obj);
        } else {
            this.f10693a.a(i, (C1872ifa) obj);
        }
    }

    public final void a(int i, Object obj, Cfa cfa) {
        C1658fea fea = this.f10693a;
        fea.a(i, 3);
        cfa.a((C1872ifa) obj, (C2583sga) fea.f10422c);
        fea.a(i, 4);
    }

    public final void a(int i, String str) {
        this.f10693a.a(i, str);
    }

    public final void a(int i, List<Lda> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f10693a.a(i, list.get(i2));
        }
    }

    public final void a(int i, List<?> list, Cfa cfa) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, (Object) list.get(i2), cfa);
        }
    }

    public final void a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.b(list.get(i4).booleanValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void a(int i, boolean z) {
        this.f10693a.a(i, z);
    }

    public final void b(int i) {
        this.f10693a.a(i, 4);
    }

    public final void b(int i, int i2) {
        this.f10693a.d(i, i2);
    }

    public final void b(int i, long j) {
        this.f10693a.c(i, j);
    }

    public final void b(int i, Object obj, Cfa cfa) {
        this.f10693a.a(i, (C1872ifa) obj, cfa);
    }

    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof Pea) {
            Pea pea = (Pea) list;
            while (i2 < list.size()) {
                Object i3 = pea.i(i2);
                if (i3 instanceof String) {
                    this.f10693a.a(i, (String) i3);
                } else {
                    this.f10693a.a(i, (Lda) i3);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.a(i, list.get(i2));
            i2++;
        }
    }

    public final void b(int i, List<?> list, Cfa cfa) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, (Object) list.get(i2), cfa);
        }
    }

    public final void b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.f(list.get(i4).intValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void c(int i, int i2) {
        this.f10693a.e(i, i2);
    }

    public final void c(int i, long j) {
        this.f10693a.a(i, j);
    }

    public final void c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.k(list.get(i4).intValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void d(int i, int i2) {
        this.f10693a.b(i, i2);
    }

    public final void d(int i, long j) {
        this.f10693a.a(i, j);
    }

    public final void d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.d(list.get(i4).longValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void e(int i, int i2) {
        this.f10693a.e(i, i2);
    }

    public final void e(int i, long j) {
        this.f10693a.c(i, j);
    }

    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.h(list.get(i4).longValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void f(int i, int i2) {
        this.f10693a.c(i, i2);
    }

    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.i(list.get(i4).intValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.g(list.get(i4).intValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.j(list.get(i4).intValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.g(list.get(i4).longValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.f(list.get(i4).longValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.b(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.e(list.get(i4).longValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.h(list.get(i4).intValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.d(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void m(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.b(list.get(i4).doubleValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void n(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10693a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1658fea.b(list.get(i4).floatValue());
            }
            this.f10693a.b(i3);
            while (i2 < list.size()) {
                this.f10693a.a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10693a.a(i, list.get(i2).floatValue());
            i2++;
        }
    }
}
