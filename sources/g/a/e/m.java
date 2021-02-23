package g.a.e;

import g.a.b;

class m extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f15112b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f15113c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f15114d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(n nVar, String str, Object[] objArr, int i, b bVar) {
        super(str, objArr);
        this.f15114d = nVar;
        this.f15112b = i;
        this.f15113c = bVar;
    }

    public void b() {
        this.f15114d.k.a(this.f15112b, this.f15113c);
        synchronized (this.f15114d) {
            this.f15114d.u.remove(Integer.valueOf(this.f15112b));
        }
    }
}
