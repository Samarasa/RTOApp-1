package g.a.e;

import g.a.b;
import java.io.IOException;
import java.util.List;

class j extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f15100b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f15101c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f15102d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(n nVar, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f15102d = nVar;
        this.f15100b = i;
        this.f15101c = list;
    }

    public void b() {
        if (this.f15102d.k.a(this.f15100b, (List<c>) this.f15101c)) {
            try {
                this.f15102d.s.a(this.f15100b, b.CANCEL);
                synchronized (this.f15102d) {
                    this.f15102d.u.remove(Integer.valueOf(this.f15100b));
                }
            } catch (IOException unused) {
            }
        }
    }
}
