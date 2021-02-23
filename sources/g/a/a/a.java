package g.a.a;

import h.e;
import h.f;
import h.g;
import h.w;
import h.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

class a implements w {

    /* renamed from: a  reason: collision with root package name */
    boolean f14936a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f14937b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f14938c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f f14939d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b f14940e;

    a(b bVar, g gVar, c cVar, f fVar) {
        this.f14940e = bVar;
        this.f14937b = gVar;
        this.f14938c = cVar;
        this.f14939d = fVar;
    }

    public long a(e eVar, long j) {
        try {
            long a2 = this.f14937b.a(eVar, j);
            if (a2 == -1) {
                if (!this.f14936a) {
                    this.f14936a = true;
                    this.f14939d.close();
                }
                return -1;
            }
            eVar.a(this.f14939d.b(), eVar.o() - a2, a2);
            this.f14939d.j();
            return a2;
        } catch (IOException e2) {
            if (!this.f14936a) {
                this.f14936a = true;
                this.f14938c.abort();
            }
            throw e2;
        }
    }

    public void close() {
        if (!this.f14936a && !g.a.e.a((w) this, 100, TimeUnit.MILLISECONDS)) {
            this.f14936a = true;
            this.f14938c.abort();
        }
        this.f14937b.close();
    }

    public y timeout() {
        return this.f14937b.timeout();
    }
}
