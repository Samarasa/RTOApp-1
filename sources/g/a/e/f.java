package g.a.e;

import g.E;
import g.F;
import g.H;
import g.K;
import g.M;
import g.a.b.g;
import g.a.c.c;
import g.a.c.j;
import g.a.c.l;
import g.a.e;
import g.z;
import h.h;
import h.i;
import h.p;
import h.v;
import h.w;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final h f15080a = h.b("connection");

    /* renamed from: b  reason: collision with root package name */
    private static final h f15081b = h.b("host");

    /* renamed from: c  reason: collision with root package name */
    private static final h f15082c = h.b("keep-alive");

    /* renamed from: d  reason: collision with root package name */
    private static final h f15083d = h.b("proxy-connection");

    /* renamed from: e  reason: collision with root package name */
    private static final h f15084e = h.b("transfer-encoding");

    /* renamed from: f  reason: collision with root package name */
    private static final h f15085f = h.b("te");

    /* renamed from: g  reason: collision with root package name */
    private static final h f15086g = h.b("encoding");

    /* renamed from: h  reason: collision with root package name */
    private static final h f15087h = h.b("upgrade");
    private static final List<h> i = e.a((T[]) new h[]{f15080a, f15081b, f15082c, f15083d, f15085f, f15084e, f15086g, f15087h, c.f15052c, c.f15053d, c.f15054e, c.f15055f});
    private static final List<h> j = e.a((T[]) new h[]{f15080a, f15081b, f15082c, f15083d, f15085f, f15084e, f15086g, f15087h});
    private final E k;
    final g l;
    private final n m;
    private t n;

    class a extends i {
        public a(w wVar) {
            super(wVar);
        }

        public void close() {
            f fVar = f.this;
            fVar.l.a(false, (c) fVar);
            super.close();
        }
    }

    public f(E e2, g gVar, n nVar) {
        this.k = e2;
        this.l = gVar;
        this.m = nVar;
    }

    public static K.a a(List<c> list) {
        z.a aVar = new z.a();
        int size = list.size();
        z.a aVar2 = aVar;
        l lVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = list.get(i2);
            if (cVar != null) {
                h hVar = cVar.f15056g;
                String q = cVar.f15057h.q();
                if (hVar.equals(c.f15051b)) {
                    lVar = l.a("HTTP/1.1 " + q);
                } else if (!j.contains(hVar)) {
                    g.a.a.f14935a.a(aVar2, hVar.q(), q);
                }
            } else if (lVar != null && lVar.f15006b == 100) {
                aVar2 = new z.a();
                lVar = null;
            }
        }
        if (lVar != null) {
            K.a aVar3 = new K.a();
            aVar3.a(F.HTTP_2);
            aVar3.a(lVar.f15006b);
            aVar3.a(lVar.f15007c);
            aVar3.a(aVar2.a());
            return aVar3;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<c> b(H h2) {
        z c2 = h2.c();
        ArrayList arrayList = new ArrayList(c2.b() + 4);
        arrayList.add(new c(c.f15052c, h2.e()));
        arrayList.add(new c(c.f15053d, j.a(h2.g())));
        String a2 = h2.a("Host");
        if (a2 != null) {
            arrayList.add(new c(c.f15055f, a2));
        }
        arrayList.add(new c(c.f15054e, h2.g().m()));
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            h b3 = h.b(c2.a(i2).toLowerCase(Locale.US));
            if (!i.contains(b3)) {
                arrayList.add(new c(b3, c2.b(i2)));
            }
        }
        return arrayList;
    }

    public K.a a(boolean z) {
        K.a a2 = a(this.n.j());
        if (!z || g.a.a.f14935a.a(a2) != 100) {
            return a2;
        }
        return null;
    }

    public M a(K k2) {
        return new g.a.c.i(k2.u(), p.a((w) new a(this.n.e())));
    }

    public v a(H h2, long j2) {
        return this.n.d();
    }

    public void a() {
        this.n.d().close();
    }

    public void a(H h2) {
        if (this.n == null) {
            this.n = this.m.a(b(h2), h2.a() != null);
            this.n.h().a((long) this.k.v(), TimeUnit.MILLISECONDS);
            this.n.l().a((long) this.k.z(), TimeUnit.MILLISECONDS);
        }
    }

    public void b() {
        this.m.flush();
    }
}
