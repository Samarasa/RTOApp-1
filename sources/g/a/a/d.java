package g.a.a;

import g.C3344e;
import g.H;
import g.K;
import g.a.c.e;
import g.a.c.f;
import g.z;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final H f14942a;

    /* renamed from: b  reason: collision with root package name */
    public final K f14943b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long f14944a;

        /* renamed from: b  reason: collision with root package name */
        final H f14945b;

        /* renamed from: c  reason: collision with root package name */
        final K f14946c;

        /* renamed from: d  reason: collision with root package name */
        private Date f14947d;

        /* renamed from: e  reason: collision with root package name */
        private String f14948e;

        /* renamed from: f  reason: collision with root package name */
        private Date f14949f;

        /* renamed from: g  reason: collision with root package name */
        private String f14950g;

        /* renamed from: h  reason: collision with root package name */
        private Date f14951h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long j2, H h2, K k2) {
            this.f14944a = j2;
            this.f14945b = h2;
            this.f14946c = k2;
            if (k2 != null) {
                this.i = k2.y();
                this.j = k2.w();
                z u = k2.u();
                int b2 = u.b();
                for (int i2 = 0; i2 < b2; i2++) {
                    String a2 = u.a(i2);
                    String b3 = u.b(i2);
                    if ("Date".equalsIgnoreCase(a2)) {
                        this.f14947d = e.a(b3);
                        this.f14948e = b3;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.f14951h = e.a(b3);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f14949f = e.a(b3);
                        this.f14950g = b3;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.k = b3;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.l = f.a(b3, -1);
                    }
                }
            }
        }

        private static boolean a(H h2) {
            return (h2.a("If-Modified-Since") == null && h2.a("If-None-Match") == null) ? false : true;
        }

        private long b() {
            Date date = this.f14947d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.j - date.getTime());
            }
            int i2 = this.l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.j;
            return j2 + (j3 - this.i) + (this.f14944a - j3);
        }

        private long c() {
            C3344e r = this.f14946c.r();
            if (r.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) r.c());
            }
            if (this.f14951h != null) {
                Date date = this.f14947d;
                long time = this.f14951h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f14949f == null || this.f14946c.x().g().k() != null) {
                return 0;
            } else {
                Date date2 = this.f14947d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f14949f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private d d() {
            if (this.f14946c == null) {
                return new d(this.f14945b, (K) null);
            }
            if (this.f14945b.d() && this.f14946c.t() == null) {
                return new d(this.f14945b, (K) null);
            }
            if (!d.a(this.f14946c, this.f14945b)) {
                return new d(this.f14945b, (K) null);
            }
            C3344e b2 = this.f14945b.b();
            if (b2.g() || a(this.f14945b)) {
                return new d(this.f14945b, (K) null);
            }
            long b3 = b();
            long c2 = c();
            if (b2.c() != -1) {
                c2 = Math.min(c2, TimeUnit.SECONDS.toMillis((long) b2.c()));
            }
            long j2 = 0;
            long millis = b2.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.e()) : 0;
            C3344e r = this.f14946c.r();
            if (!r.f() && b2.d() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (!r.g()) {
                long j3 = millis + b3;
                if (j3 < j2 + c2) {
                    K.a v = this.f14946c.v();
                    if (j3 >= c2) {
                        v.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b3 > 86400000 && e()) {
                        v.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new d((H) null, v.a());
                }
            }
            String str = this.k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f14949f != null) {
                str = this.f14950g;
            } else if (this.f14947d == null) {
                return new d(this.f14945b, (K) null);
            } else {
                str = this.f14948e;
            }
            z.a a2 = this.f14945b.c().a();
            g.a.a.f14935a.a(a2, str2, str);
            H.a f2 = this.f14945b.f();
            f2.a(a2.a());
            return new d(f2.a(), this.f14946c);
        }

        private boolean e() {
            return this.f14946c.r().c() == -1 && this.f14951h == null;
        }

        public d a() {
            d d2 = d();
            return (d2.f14942a == null || !this.f14945b.b().i()) ? d2 : new d((H) null, (K) null);
        }
    }

    d(H h2, K k) {
        this.f14942a = h2;
        this.f14943b = k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.r().a() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(g.K r3, g.H r4) {
        /*
            int r0 = r3.s()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.e(r0)
            if (r0 != 0) goto L_0x005a
            g.e r0 = r3.r()
            int r0 = r0.c()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            g.e r0 = r3.r()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x005a
            g.e r0 = r3.r()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            g.e r3 = r3.r()
            boolean r3 = r3.h()
            if (r3 != 0) goto L_0x006f
            g.e r3 = r4.b()
            boolean r3 = r3.h()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.d.a(g.K, g.H):boolean");
    }
}
