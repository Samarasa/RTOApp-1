package g.a.a;

import g.B;
import g.F;
import g.H;
import g.K;
import g.M;
import g.a.a;
import g.a.a.d;
import g.a.c.f;
import g.a.c.g;
import g.a.c.i;
import g.a.e;
import g.z;
import h.p;
import h.v;
import h.w;
import java.io.Closeable;
import java.io.IOException;

public final class b implements B {

    /* renamed from: a  reason: collision with root package name */
    final e f14941a;

    public b(e eVar) {
        this.f14941a = eVar;
    }

    private static K a(K k) {
        if (k == null || k.a() == null) {
            return k;
        }
        K.a v = k.v();
        v.a((M) null);
        return v.a();
    }

    private K a(c cVar, K k) {
        v body;
        if (cVar == null || (body = cVar.body()) == null) {
            return k;
        }
        a aVar = new a(this, k.a().s(), cVar, p.a(body));
        K.a v = k.v();
        v.a((M) new i(k.u(), p.a((w) aVar)));
        return v.a();
    }

    private static z a(z zVar, z zVar2) {
        z.a aVar = new z.a();
        int b2 = zVar.b();
        for (int i = 0; i < b2; i++) {
            String a2 = zVar.a(i);
            String b3 = zVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b3.startsWith("1")) && (!a(a2) || zVar2.a(a2) == null)) {
                a.f14935a.a(aVar, a2, b3);
            }
        }
        int b4 = zVar2.b();
        for (int i2 = 0; i2 < b4; i2++) {
            String a3 = zVar2.a(i2);
            if (!"Content-Length".equalsIgnoreCase(a3) && a(a3)) {
                a.f14935a.a(aVar, a3, zVar2.b(i2));
            }
        }
        return aVar.a();
    }

    static boolean a(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public K a(B.a aVar) {
        e eVar = this.f14941a;
        K b2 = eVar != null ? eVar.b(aVar.request()) : null;
        d a2 = new d.a(System.currentTimeMillis(), aVar.request(), b2).a();
        H h2 = a2.f14942a;
        K k = a2.f14943b;
        e eVar2 = this.f14941a;
        if (eVar2 != null) {
            eVar2.a(a2);
        }
        if (b2 != null && k == null) {
            e.a((Closeable) b2.a());
        }
        if (h2 == null && k == null) {
            K.a aVar2 = new K.a();
            aVar2.a(aVar.request());
            aVar2.a(F.HTTP_1_1);
            aVar2.a(504);
            aVar2.a("Unsatisfiable Request (only-if-cached)");
            aVar2.a(e.f15035c);
            aVar2.b(-1);
            aVar2.a(System.currentTimeMillis());
            return aVar2.a();
        } else if (h2 == null) {
            K.a v = k.v();
            v.a(a(k));
            return v.a();
        } else {
            try {
                K a3 = aVar.a(h2);
                if (a3 == null && b2 != null) {
                }
                if (k != null) {
                    if (a3.s() == 304) {
                        K.a v2 = k.v();
                        v2.a(a(k.u(), a3.u()));
                        v2.b(a3.y());
                        v2.a(a3.w());
                        v2.a(a(k));
                        v2.b(a(a3));
                        K a4 = v2.a();
                        a3.a().close();
                        this.f14941a.a();
                        this.f14941a.a(k, a4);
                        return a4;
                    }
                    e.a((Closeable) k.a());
                }
                K.a v3 = a3.v();
                v3.a(a(k));
                v3.b(a(a3));
                K a5 = v3.a();
                if (this.f14941a != null) {
                    if (f.b(a5) && d.a(a5, h2)) {
                        return a(this.f14941a.a(a5), a5);
                    }
                    if (g.a(h2.e())) {
                        try {
                            this.f14941a.a(h2);
                        } catch (IOException unused) {
                        }
                    }
                }
                return a5;
            } finally {
                if (b2 != null) {
                    e.a((Closeable) b2.a());
                }
            }
        }
    }
}
