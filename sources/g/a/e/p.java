package g.a.e;

import g.a.b;
import g.a.e.n;
import g.a.f.e;
import java.io.IOException;

class p extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f15133b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n.c f15134c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(n.c cVar, String str, Object[] objArr, t tVar) {
        super(str, objArr);
        this.f15134c = cVar;
        this.f15133b = tVar;
    }

    public void b() {
        try {
            n.this.f15117c.a(this.f15133b);
        } catch (IOException e2) {
            e a2 = e.a();
            a2.a(4, "Http2Connection.Listener failure for " + n.this.f15119e, (Throwable) e2);
            try {
                this.f15133b.a(b.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
