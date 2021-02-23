package g.a.c;

import g.B;
import g.C;
import g.C3354o;
import g.H;
import g.J;
import g.K;
import g.M;
import g.a.e;
import g.a.f;
import g.q;
import g.z;
import h.k;
import h.p;
import h.w;
import java.util.List;
import org.jsoup.helper.HttpConnection;

public final class a implements B {

    /* renamed from: a  reason: collision with root package name */
    private final q f14985a;

    public a(q qVar) {
        this.f14985a = qVar;
    }

    private String a(List<C3354o> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C3354o oVar = list.get(i);
            sb.append(oVar.a());
            sb.append('=');
            sb.append(oVar.b());
        }
        return sb.toString();
    }

    public K a(B.a aVar) {
        H request = aVar.request();
        H.a f2 = request.f();
        J a2 = request.a();
        if (a2 != null) {
            C b2 = a2.b();
            if (b2 != null) {
                f2.a("Content-Type", b2.toString());
            }
            long a3 = a2.a();
            if (a3 != -1) {
                f2.a("Content-Length", Long.toString(a3));
                f2.a("Transfer-Encoding");
            } else {
                f2.a("Transfer-Encoding", "chunked");
                f2.a("Content-Length");
            }
        }
        boolean z = false;
        if (request.a("Host") == null) {
            f2.a("Host", e.a(request.g(), false));
        }
        if (request.a("Connection") == null) {
            f2.a("Connection", "Keep-Alive");
        }
        if (request.a("Accept-Encoding") == null && request.a("Range") == null) {
            z = true;
            f2.a("Accept-Encoding", "gzip");
        }
        List<C3354o> a4 = this.f14985a.a(request.g());
        if (!a4.isEmpty()) {
            f2.a("Cookie", a(a4));
        }
        if (request.a("User-Agent") == null) {
            f2.a("User-Agent", f.a());
        }
        K a5 = aVar.a(f2.a());
        f.a(this.f14985a, request.g(), a5.u());
        K.a v = a5.v();
        v.a(request);
        if (z && "gzip".equalsIgnoreCase(a5.e(HttpConnection.CONTENT_ENCODING)) && f.b(a5)) {
            k kVar = new k(a5.a().s());
            z.a a6 = a5.u().a();
            a6.b(HttpConnection.CONTENT_ENCODING);
            a6.b("Content-Length");
            z a7 = a6.a();
            v.a(a7);
            v.a((M) new i(a7, p.a((w) kVar)));
        }
        return v.a();
    }
}
