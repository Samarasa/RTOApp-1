package g.a.e;

import g.a.b;
import g.a.e.n;
import java.io.IOException;

class r extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f15136b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n.c f15137c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(n.c cVar, String str, Object[] objArr, z zVar) {
        super(str, objArr);
        this.f15137c = cVar;
        this.f15136b = zVar;
    }

    public void b() {
        try {
            n.this.s.a(this.f15136b);
        } catch (IOException unused) {
        }
    }
}
