package androidx.work.impl.c;

import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import java.util.List;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1888a = h.a("WorkSpec");

    /* renamed from: b  reason: collision with root package name */
    public static final b.b.a.c.a<List<Object>, List<Object>> f1889b = new n();

    /* renamed from: c  reason: collision with root package name */
    public String f1890c;

    /* renamed from: d  reason: collision with root package name */
    public androidx.work.o f1891d = androidx.work.o.ENQUEUED;

    /* renamed from: e  reason: collision with root package name */
    public String f1892e;

    /* renamed from: f  reason: collision with root package name */
    public String f1893f;

    /* renamed from: g  reason: collision with root package name */
    public e f1894g;

    /* renamed from: h  reason: collision with root package name */
    public e f1895h;
    public long i;
    public long j;
    public long k;
    public c l;
    public int m;
    public androidx.work.a n;
    public long o;
    public long p;
    public long q;
    public long r;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f1896a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.work.o f1897b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1897b != aVar.f1897b) {
                return false;
            }
            return this.f1896a.equals(aVar.f1896a);
        }

        public int hashCode() {
            return (this.f1896a.hashCode() * 31) + this.f1897b.hashCode();
        }
    }

    public o(o oVar) {
        e eVar = e.f1728b;
        this.f1894g = eVar;
        this.f1895h = eVar;
        this.l = c.f1708a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000;
        this.r = -1;
        this.f1890c = oVar.f1890c;
        this.f1892e = oVar.f1892e;
        this.f1891d = oVar.f1891d;
        this.f1893f = oVar.f1893f;
        this.f1894g = new e(oVar.f1894g);
        this.f1895h = new e(oVar.f1895h);
        this.i = oVar.i;
        this.j = oVar.j;
        this.k = oVar.k;
        this.l = new c(oVar.l);
        this.m = oVar.m;
        this.n = oVar.n;
        this.o = oVar.o;
        this.p = oVar.p;
        this.q = oVar.q;
        this.r = oVar.r;
    }

    public o(String str, String str2) {
        e eVar = e.f1728b;
        this.f1894g = eVar;
        this.f1895h = eVar;
        this.l = c.f1708a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000;
        this.r = -1;
        this.f1890c = str;
        this.f1892e = str2;
    }

    public long a() {
        boolean z = false;
        if (c()) {
            if (this.n == androidx.work.a.LINEAR) {
                z = true;
            }
            return this.p + Math.min(18000000, z ? this.o * ((long) this.m) : (long) Math.scalb((float) this.o, this.m - 1));
        }
        long j2 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.p;
            if (j3 == 0) {
                j3 = this.i + currentTimeMillis;
            }
            if (this.k != this.j) {
                z = true;
            }
            if (z) {
                if (this.p == 0) {
                    j2 = this.k * -1;
                }
                return j3 + this.j + j2;
            }
            if (this.p != 0) {
                j2 = this.j;
            }
            return j3 + j2;
        }
        long j4 = this.p;
        if (j4 == 0) {
            j4 = System.currentTimeMillis();
        }
        return j4 + this.i;
    }

    public boolean b() {
        return !c.f1708a.equals(this.l);
    }

    public boolean c() {
        return this.f1891d == androidx.work.o.ENQUEUED && this.m > 0;
    }

    public boolean d() {
        return this.j != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.i != oVar.i || this.j != oVar.j || this.k != oVar.k || this.m != oVar.m || this.o != oVar.o || this.p != oVar.p || this.q != oVar.q || this.r != oVar.r || !this.f1890c.equals(oVar.f1890c) || this.f1891d != oVar.f1891d || !this.f1892e.equals(oVar.f1892e)) {
            return false;
        }
        String str = this.f1893f;
        if (str == null ? oVar.f1893f == null : str.equals(oVar.f1893f)) {
            return this.f1894g.equals(oVar.f1894g) && this.f1895h.equals(oVar.f1895h) && this.l.equals(oVar.l) && this.n == oVar.n;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f1890c.hashCode() * 31) + this.f1891d.hashCode()) * 31) + this.f1892e.hashCode()) * 31;
        String str = this.f1893f;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j2 = this.i;
        long j3 = this.j;
        long j4 = this.k;
        long j5 = this.o;
        long j6 = this.p;
        long j7 = this.q;
        long j8 = this.r;
        return ((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f1894g.hashCode()) * 31) + this.f1895h.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "{WorkSpec: " + this.f1890c + "}";
    }
}
