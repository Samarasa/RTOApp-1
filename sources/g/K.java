package g;

import g.z;
import java.io.Closeable;

public final class K implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final H f14898a;

    /* renamed from: b  reason: collision with root package name */
    final F f14899b;

    /* renamed from: c  reason: collision with root package name */
    final int f14900c;

    /* renamed from: d  reason: collision with root package name */
    final String f14901d;

    /* renamed from: e  reason: collision with root package name */
    final y f14902e;

    /* renamed from: f  reason: collision with root package name */
    final z f14903f;

    /* renamed from: g  reason: collision with root package name */
    final M f14904g;

    /* renamed from: h  reason: collision with root package name */
    final K f14905h;
    final K i;
    final K j;
    final long k;
    final long l;
    private volatile C3344e m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        H f14906a;

        /* renamed from: b  reason: collision with root package name */
        F f14907b;

        /* renamed from: c  reason: collision with root package name */
        int f14908c;

        /* renamed from: d  reason: collision with root package name */
        String f14909d;

        /* renamed from: e  reason: collision with root package name */
        y f14910e;

        /* renamed from: f  reason: collision with root package name */
        z.a f14911f;

        /* renamed from: g  reason: collision with root package name */
        M f14912g;

        /* renamed from: h  reason: collision with root package name */
        K f14913h;
        K i;
        K j;
        long k;
        long l;

        public a() {
            this.f14908c = -1;
            this.f14911f = new z.a();
        }

        a(K k2) {
            this.f14908c = -1;
            this.f14906a = k2.f14898a;
            this.f14907b = k2.f14899b;
            this.f14908c = k2.f14900c;
            this.f14909d = k2.f14901d;
            this.f14910e = k2.f14902e;
            this.f14911f = k2.f14903f.a();
            this.f14912g = k2.f14904g;
            this.f14913h = k2.f14905h;
            this.i = k2.i;
            this.j = k2.j;
            this.k = k2.k;
            this.l = k2.l;
        }

        private void a(String str, K k2) {
            if (k2.f14904g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (k2.f14905h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (k2.i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (k2.j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        private void d(K k2) {
            if (k2.f14904g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(int i2) {
            this.f14908c = i2;
            return this;
        }

        public a a(long j2) {
            this.l = j2;
            return this;
        }

        public a a(F f2) {
            this.f14907b = f2;
            return this;
        }

        public a a(H h2) {
            this.f14906a = h2;
            return this;
        }

        public a a(K k2) {
            if (k2 != null) {
                a("cacheResponse", k2);
            }
            this.i = k2;
            return this;
        }

        public a a(M m) {
            this.f14912g = m;
            return this;
        }

        public a a(y yVar) {
            this.f14910e = yVar;
            return this;
        }

        public a a(z zVar) {
            this.f14911f = zVar.a();
            return this;
        }

        public a a(String str) {
            this.f14909d = str;
            return this;
        }

        public a a(String str, String str2) {
            this.f14911f.a(str, str2);
            return this;
        }

        public K a() {
            if (this.f14906a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f14907b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f14908c >= 0) {
                return new K(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.f14908c);
            }
        }

        public a b(long j2) {
            this.k = j2;
            return this;
        }

        public a b(K k2) {
            if (k2 != null) {
                a("networkResponse", k2);
            }
            this.f14913h = k2;
            return this;
        }

        public a c(K k2) {
            if (k2 != null) {
                d(k2);
            }
            this.j = k2;
            return this;
        }
    }

    K(a aVar) {
        this.f14898a = aVar.f14906a;
        this.f14899b = aVar.f14907b;
        this.f14900c = aVar.f14908c;
        this.f14901d = aVar.f14909d;
        this.f14902e = aVar.f14910e;
        this.f14903f = aVar.f14911f.a();
        this.f14904g = aVar.f14912g;
        this.f14905h = aVar.f14913h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public M a() {
        return this.f14904g;
    }

    public String a(String str, String str2) {
        String a2 = this.f14903f.a(str);
        return a2 != null ? a2 : str2;
    }

    public void close() {
        this.f14904g.close();
    }

    public String e(String str) {
        return a(str, (String) null);
    }

    public C3344e r() {
        C3344e eVar = this.m;
        if (eVar != null) {
            return eVar;
        }
        C3344e a2 = C3344e.a(this.f14903f);
        this.m = a2;
        return a2;
    }

    public int s() {
        return this.f14900c;
    }

    public y t() {
        return this.f14902e;
    }

    public String toString() {
        return "Response{protocol=" + this.f14899b + ", code=" + this.f14900c + ", message=" + this.f14901d + ", url=" + this.f14898a.g() + '}';
    }

    public z u() {
        return this.f14903f;
    }

    public a v() {
        return new a(this);
    }

    public long w() {
        return this.l;
    }

    public H x() {
        return this.f14898a;
    }

    public long y() {
        return this.k;
    }
}
