package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dea  reason: case insensitive filesystem */
final class C1517dea implements C2865wfa {

    /* renamed from: a  reason: collision with root package name */
    private final C1304aea f10159a;

    /* renamed from: b  reason: collision with root package name */
    private int f10160b;

    /* renamed from: c  reason: collision with root package name */
    private int f10161c;

    /* renamed from: d  reason: collision with root package name */
    private int f10162d = 0;

    private C1517dea(C1304aea aea) {
        Aea.a(aea, "input");
        this.f10159a = aea;
        this.f10159a.f9809d = this;
    }

    public static C1517dea a(C1304aea aea) {
        C1517dea dea = aea.f9809d;
        return dea != null ? dea : new C1517dea(aea);
    }

    private final void a(int i) {
        if ((this.f10160b & 7) != i) {
            throw Iea.f();
        }
    }

    private final void a(List<String> list, boolean z) {
        int d2;
        int d3;
        if ((this.f10160b & 7) != 2) {
            throw Iea.f();
        } else if (!(list instanceof Pea) || z) {
            do {
                list.add(z ? i() : readString());
                if (!this.f10159a.s()) {
                    d2 = this.f10159a.d();
                } else {
                    return;
                }
            } while (d2 == this.f10160b);
            this.f10162d = d2;
        } else {
            Pea pea = (Pea) list;
            do {
                pea.a(l());
                if (!this.f10159a.s()) {
                    d3 = this.f10159a.d();
                } else {
                    return;
                }
            } while (d3 == this.f10160b);
            this.f10162d = d3;
        }
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw Iea.h();
        }
    }

    private final <T> T c(Cfa<T> cfa, C2012kea kea) {
        int m = this.f10159a.m();
        C1304aea aea = this.f10159a;
        if (aea.f9806a < aea.f9807b) {
            int c2 = aea.c(m);
            T a2 = cfa.a();
            this.f10159a.f9806a++;
            cfa.a(a2, this, kea);
            cfa.b(a2);
            this.f10159a.a(0);
            C1304aea aea2 = this.f10159a;
            aea2.f9806a--;
            aea2.d(c2);
            return a2;
        }
        throw new Iea("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw Iea.h();
        }
    }

    private final <T> T d(Cfa<T> cfa, C2012kea kea) {
        int i = this.f10161c;
        this.f10161c = ((this.f10160b >>> 3) << 3) | 4;
        try {
            T a2 = cfa.a();
            cfa.a(a2, this, kea);
            cfa.b(a2);
            if (this.f10160b == this.f10161c) {
                return a2;
            }
            throw Iea.h();
        } finally {
            this.f10161c = i;
        }
    }

    private final void d(int i) {
        if (this.f10159a.t() != i) {
            throw Iea.a();
        }
    }

    public final int a() {
        a(0);
        return this.f10159a.g();
    }

    public final <T> T a(Cfa<T> cfa, C2012kea kea) {
        a(2);
        return c(cfa, kea);
    }

    public final void a(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            int i = this.f10160b & 7;
            if (i == 1) {
                do {
                    xea.b(this.f10159a.p());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int m = this.f10159a.m();
                b(m);
                int t = this.f10159a.t() + m;
                do {
                    xea.b(this.f10159a.p());
                } while (this.f10159a.t() < t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f10159a.p()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int m2 = this.f10159a.m();
                b(m2);
                int t2 = this.f10159a.t() + m2;
                do {
                    list.add(Long.valueOf(this.f10159a.p()));
                } while (this.f10159a.t() < t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final <T> void a(List<T> list, Cfa<T> cfa, C2012kea kea) {
        int d2;
        int i = this.f10160b;
        if ((i & 7) == 3) {
            do {
                list.add(d(cfa, kea));
                if (!this.f10159a.s() && this.f10162d == 0) {
                    d2 = this.f10159a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.f10162d = d2;
            return;
        }
        throw Iea.f();
    }

    public final int b() {
        a(5);
        return this.f10159a.o();
    }

    public final <T> T b(Cfa<T> cfa, C2012kea kea) {
        a(3);
        return d(cfa, kea);
    }

    public final void b(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    yea.e(this.f10159a.g());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    yea.e(this.f10159a.g());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10159a.g()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Integer.valueOf(this.f10159a.g()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final <T> void b(List<T> list, Cfa<T> cfa, C2012kea kea) {
        int d2;
        int i = this.f10160b;
        if ((i & 7) == 2) {
            do {
                list.add(c(cfa, kea));
                if (!this.f10159a.s() && this.f10162d == 0) {
                    d2 = this.f10159a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.f10162d = d2;
            return;
        }
        throw Iea.f();
    }

    public final long c() {
        a(1);
        return this.f10159a.h();
    }

    public final void c(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    xea.b(this.f10159a.f());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    xea.b(this.f10159a.f());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10159a.f()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Long.valueOf(this.f10159a.f()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final long d() {
        a(1);
        return this.f10159a.p();
    }

    public final void d(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            int i = this.f10160b & 7;
            if (i == 2) {
                int m = this.f10159a.m();
                c(m);
                int t = this.f10159a.t() + m;
                do {
                    yea.e(this.f10159a.o());
                } while (this.f10159a.t() < t);
            } else if (i == 5) {
                do {
                    yea.e(this.f10159a.o());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 2) {
                int m2 = this.f10159a.m();
                c(m2);
                int t2 = this.f10159a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.f10159a.o()));
                } while (this.f10159a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f10159a.o()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else {
                throw Iea.f();
            }
        }
    }

    public final int e() {
        a(5);
        return this.f10159a.i();
    }

    public final void e(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    yea.e(this.f10159a.n());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    yea.e(this.f10159a.n());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10159a.n()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Integer.valueOf(this.f10159a.n()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final int f() {
        a(0);
        return this.f10159a.q();
    }

    public final void f(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    xea.b(this.f10159a.r());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    xea.b(this.f10159a.r());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10159a.r()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Long.valueOf(this.f10159a.r()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final void g(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            int i = this.f10160b & 7;
            if (i == 2) {
                int m = this.f10159a.m();
                c(m);
                int t = this.f10159a.t() + m;
                do {
                    yea.e(this.f10159a.i());
                } while (this.f10159a.t() < t);
            } else if (i == 5) {
                do {
                    yea.e(this.f10159a.i());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 2) {
                int m2 = this.f10159a.m();
                c(m2);
                int t2 = this.f10159a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.f10159a.i()));
                } while (this.f10159a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f10159a.i()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else {
                throw Iea.f();
            }
        }
    }

    public final boolean g() {
        a(0);
        return this.f10159a.j();
    }

    public final int getTag() {
        return this.f10160b;
    }

    public final long h() {
        a(0);
        return this.f10159a.r();
    }

    public final void h(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    yea.e(this.f10159a.q());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    yea.e(this.f10159a.q());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10159a.q()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Integer.valueOf(this.f10159a.q()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final String i() {
        a(2);
        return this.f10159a.k();
    }

    public final void i(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            int i = this.f10160b & 7;
            if (i == 1) {
                do {
                    xea.b(this.f10159a.h());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int m = this.f10159a.m();
                b(m);
                int t = this.f10159a.t() + m;
                do {
                    xea.b(this.f10159a.h());
                } while (this.f10159a.t() < t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f10159a.h()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int m2 = this.f10159a.m();
                b(m2);
                int t2 = this.f10159a.t() + m2;
                do {
                    list.add(Long.valueOf(this.f10159a.h()));
                } while (this.f10159a.t() < t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final int j() {
        int i = this.f10162d;
        if (i != 0) {
            this.f10160b = i;
            this.f10162d = 0;
        } else {
            this.f10160b = this.f10159a.d();
        }
        int i2 = this.f10160b;
        if (i2 == 0 || i2 == this.f10161c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void j(List<Double> list) {
        int d2;
        int d3;
        if (list instanceof C1941jea) {
            C1941jea jea = (C1941jea) list;
            int i = this.f10160b & 7;
            if (i == 1) {
                do {
                    jea.a(this.f10159a.a());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int m = this.f10159a.m();
                b(m);
                int t = this.f10159a.t() + m;
                do {
                    jea.a(this.f10159a.a());
                } while (this.f10159a.t() < t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f10159a.a()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int m2 = this.f10159a.m();
                b(m2);
                int t2 = this.f10159a.t() + m2;
                do {
                    list.add(Double.valueOf(this.f10159a.a()));
                } while (this.f10159a.t() < t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final void k(List<String> list) {
        a(list, true);
    }

    public final boolean k() {
        int i;
        if (this.f10159a.s() || (i = this.f10160b) == this.f10161c) {
            return false;
        }
        return this.f10159a.b(i);
    }

    public final Lda l() {
        a(2);
        return this.f10159a.l();
    }

    public final void l(List<Boolean> list) {
        int d2;
        int d3;
        if (list instanceof Jda) {
            Jda jda = (Jda) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    jda.a(this.f10159a.j());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    jda.a(this.f10159a.j());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f10159a.j()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Boolean.valueOf(this.f10159a.j()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final long m() {
        a(0);
        return this.f10159a.e();
    }

    public final void m(List<String> list) {
        a(list, false);
    }

    public final int n() {
        a(0);
        return this.f10159a.m();
    }

    public final void n(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    xea.b(this.f10159a.e());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    xea.b(this.f10159a.e());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10159a.e()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Long.valueOf(this.f10159a.e()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final long o() {
        a(0);
        return this.f10159a.f();
    }

    public final void o(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            int i = this.f10160b & 7;
            if (i == 0) {
                do {
                    yea.e(this.f10159a.m());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else if (i == 2) {
                int t = this.f10159a.t() + this.f10159a.m();
                do {
                    yea.e(this.f10159a.m());
                } while (this.f10159a.t() < t);
                d(t);
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10159a.m()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else if (i2 == 2) {
                int t2 = this.f10159a.t() + this.f10159a.m();
                do {
                    list.add(Integer.valueOf(this.f10159a.m()));
                } while (this.f10159a.t() < t2);
                d(t2);
            } else {
                throw Iea.f();
            }
        }
    }

    public final int p() {
        a(0);
        return this.f10159a.n();
    }

    public final void p(List<Float> list) {
        int d2;
        int d3;
        if (list instanceof C2650tea) {
            C2650tea tea = (C2650tea) list;
            int i = this.f10160b & 7;
            if (i == 2) {
                int m = this.f10159a.m();
                c(m);
                int t = this.f10159a.t() + m;
                do {
                    tea.a(this.f10159a.b());
                } while (this.f10159a.t() < t);
            } else if (i == 5) {
                do {
                    tea.a(this.f10159a.b());
                    if (!this.f10159a.s()) {
                        d3 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f10160b);
                this.f10162d = d3;
            } else {
                throw Iea.f();
            }
        } else {
            int i2 = this.f10160b & 7;
            if (i2 == 2) {
                int m2 = this.f10159a.m();
                c(m2);
                int t2 = this.f10159a.t() + m2;
                do {
                    list.add(Float.valueOf(this.f10159a.b()));
                } while (this.f10159a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f10159a.b()));
                    if (!this.f10159a.s()) {
                        d2 = this.f10159a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10160b);
                this.f10162d = d2;
            } else {
                throw Iea.f();
            }
        }
    }

    public final void q(List<Lda> list) {
        int d2;
        if ((this.f10160b & 7) == 2) {
            do {
                list.add(l());
                if (!this.f10159a.s()) {
                    d2 = this.f10159a.d();
                } else {
                    return;
                }
            } while (d2 == this.f10160b);
            this.f10162d = d2;
            return;
        }
        throw Iea.f();
    }

    public final double readDouble() {
        a(1);
        return this.f10159a.a();
    }

    public final float readFloat() {
        a(5);
        return this.f10159a.b();
    }

    public final String readString() {
        a(2);
        return this.f10159a.c();
    }
}
