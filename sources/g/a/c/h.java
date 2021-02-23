package g.a.c;

import g.B;
import g.C3350k;
import g.H;
import g.K;
import g.a.b.c;
import g.a.b.g;
import java.util.List;

public final class h implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<B> f14991a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14992b;

    /* renamed from: c  reason: collision with root package name */
    private final c f14993c;

    /* renamed from: d  reason: collision with root package name */
    private final c f14994d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14995e;

    /* renamed from: f  reason: collision with root package name */
    private final H f14996f;

    /* renamed from: g  reason: collision with root package name */
    private int f14997g;

    public h(List<B> list, g gVar, c cVar, c cVar2, int i, H h2) {
        this.f14991a = list;
        this.f14994d = cVar2;
        this.f14992b = gVar;
        this.f14993c = cVar;
        this.f14995e = i;
        this.f14996f = h2;
    }

    public K a(H h2) {
        return a(h2, this.f14992b, this.f14993c, this.f14994d);
    }

    public K a(H h2, g gVar, c cVar, c cVar2) {
        if (this.f14995e < this.f14991a.size()) {
            this.f14997g++;
            if (this.f14993c != null && !this.f14994d.a(h2.g())) {
                throw new IllegalStateException("network interceptor " + this.f14991a.get(this.f14995e - 1) + " must retain the same host and port");
            } else if (this.f14993c == null || this.f14997g <= 1) {
                h hVar = new h(this.f14991a, gVar, cVar, cVar2, this.f14995e + 1, h2);
                B b2 = this.f14991a.get(this.f14995e);
                K a2 = b2.a(hVar);
                if (cVar != null && this.f14995e + 1 < this.f14991a.size() && hVar.f14997g != 1) {
                    throw new IllegalStateException("network interceptor " + b2 + " must call proceed() exactly once");
                } else if (a2 != null) {
                    return a2;
                } else {
                    throw new NullPointerException("interceptor " + b2 + " returned null");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f14991a.get(this.f14995e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public C3350k a() {
        return this.f14994d;
    }

    public c b() {
        return this.f14993c;
    }

    public g c() {
        return this.f14992b;
    }

    public H request() {
        return this.f14996f;
    }
}
