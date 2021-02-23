package g.a.c;

import g.B;
import g.H;
import g.K;
import g.a.b.c;
import g.a.b.g;
import g.a.e;
import h.f;
import h.p;
import java.net.ProtocolException;

public final class b implements B {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14986a;

    public b(boolean z) {
        this.f14986a = z;
    }

    public K a(B.a aVar) {
        K k;
        h hVar = (h) aVar;
        c b2 = hVar.b();
        g c2 = hVar.c();
        c cVar = (c) hVar.a();
        H request = hVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        b2.a(request);
        K.a aVar2 = null;
        if (g.b(request.e()) && request.a() != null) {
            if ("100-continue".equalsIgnoreCase(request.a("Expect"))) {
                b2.b();
                aVar2 = b2.a(true);
            }
            if (aVar2 == null) {
                f a2 = p.a(b2.a(request, request.a().a()));
                request.a().a(a2);
                a2.close();
            } else if (!cVar.c()) {
                c2.d();
            }
        }
        b2.a();
        if (aVar2 == null) {
            aVar2 = b2.a(false);
        }
        aVar2.a(request);
        aVar2.a(c2.b().b());
        aVar2.b(currentTimeMillis);
        aVar2.a(System.currentTimeMillis());
        K a3 = aVar2.a();
        int s = a3.s();
        if (!this.f14986a || s != 101) {
            K.a v = a3.v();
            v.a(b2.a(a3));
            k = v.a();
        } else {
            K.a v2 = a3.v();
            v2.a(e.f15035c);
            k = v2.a();
        }
        if ("close".equalsIgnoreCase(k.x().a("Connection")) || "close".equalsIgnoreCase(k.e("Connection"))) {
            c2.d();
        }
        if ((s != 204 && s != 205) || k.a().a() <= 0) {
            return k;
        }
        throw new ProtocolException("HTTP " + s + " had non-zero Content-Length: " + k.a().a());
    }
}
