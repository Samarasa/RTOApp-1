package g.a.b;

import g.B;
import g.E;
import g.H;
import g.K;
import g.a.c.h;

public final class a implements B {

    /* renamed from: a  reason: collision with root package name */
    public final E f14953a;

    public a(E e2) {
        this.f14953a = e2;
    }

    public K a(B.a aVar) {
        h hVar = (h) aVar;
        H request = hVar.request();
        g c2 = hVar.c();
        return hVar.a(request, c2, c2.a(this.f14953a, !request.e().equals("GET")), c2.b());
    }
}
