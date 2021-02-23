package g.a.e;

import g.a.b;
import java.io.IOException;
import java.util.List;

class k extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f15103b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f15104c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f15105d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n f15106e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(n nVar, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f15106e = nVar;
        this.f15103b = i;
        this.f15104c = list;
        this.f15105d = z;
    }

    public void b() {
        boolean a2 = this.f15106e.k.a(this.f15103b, this.f15104c, this.f15105d);
        if (a2) {
            try {
                this.f15106e.s.a(this.f15103b, b.CANCEL);
            } catch (IOException unused) {
                return;
            }
        }
        if (a2 || this.f15105d) {
            synchronized (this.f15106e) {
                this.f15106e.u.remove(Integer.valueOf(this.f15103b));
            }
        }
    }
}
