package g;

import g.a.c.g;
import g.z;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    final A f14883a;

    /* renamed from: b  reason: collision with root package name */
    final String f14884b;

    /* renamed from: c  reason: collision with root package name */
    final z f14885c;

    /* renamed from: d  reason: collision with root package name */
    final J f14886d;

    /* renamed from: e  reason: collision with root package name */
    final Object f14887e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C3344e f14888f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        A f14889a;

        /* renamed from: b  reason: collision with root package name */
        String f14890b;

        /* renamed from: c  reason: collision with root package name */
        z.a f14891c;

        /* renamed from: d  reason: collision with root package name */
        J f14892d;

        /* renamed from: e  reason: collision with root package name */
        Object f14893e;

        public a() {
            this.f14890b = "GET";
            this.f14891c = new z.a();
        }

        a(H h2) {
            this.f14889a = h2.f14883a;
            this.f14890b = h2.f14884b;
            this.f14892d = h2.f14886d;
            this.f14893e = h2.f14887e;
            this.f14891c = h2.f14885c.a();
        }

        public a a(A a2) {
            if (a2 != null) {
                this.f14889a = a2;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(J j) {
            a("POST", j);
            return this;
        }

        public a a(z zVar) {
            this.f14891c = zVar.a();
            return this;
        }

        public a a(String str) {
            this.f14891c.b(str);
            return this;
        }

        public a a(String str, J j) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (j != null && !g.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (j != null || !g.e(str)) {
                this.f14890b = str;
                this.f14892d = j;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a a(String str, String str2) {
            this.f14891c.c(str, str2);
            return this;
        }

        public H a() {
            if (this.f14889a != null) {
                return new H(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g.H.a b(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0060
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x0026
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                r0.append(r1)
                r1 = 3
            L_0x001a:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L_0x003f
            L_0x0026:
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 4
                java.lang.String r3 = "wss:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x003f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                r0.append(r1)
                r1 = 4
                goto L_0x001a
            L_0x003f:
                g.A r0 = g.A.c(r7)
                if (r0 == 0) goto L_0x0049
                r6.a((g.A) r0)
                return r6
            L_0x0049:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L_0x0060:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                goto L_0x0069
            L_0x0068:
                throw r7
            L_0x0069:
                goto L_0x0068
            */
            throw new UnsupportedOperationException("Method not decompiled: g.H.a.b(java.lang.String):g.H$a");
        }
    }

    H(a aVar) {
        this.f14883a = aVar.f14889a;
        this.f14884b = aVar.f14890b;
        this.f14885c = aVar.f14891c.a();
        this.f14886d = aVar.f14892d;
        Object obj = aVar.f14893e;
        this.f14887e = obj == null ? this : obj;
    }

    public J a() {
        return this.f14886d;
    }

    public String a(String str) {
        return this.f14885c.a(str);
    }

    public C3344e b() {
        C3344e eVar = this.f14888f;
        if (eVar != null) {
            return eVar;
        }
        C3344e a2 = C3344e.a(this.f14885c);
        this.f14888f = a2;
        return a2;
    }

    public z c() {
        return this.f14885c;
    }

    public boolean d() {
        return this.f14883a.h();
    }

    public String e() {
        return this.f14884b;
    }

    public a f() {
        return new a(this);
    }

    public A g() {
        return this.f14883a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f14884b);
        sb.append(", url=");
        sb.append(this.f14883a);
        sb.append(", tag=");
        Object obj = this.f14887e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
