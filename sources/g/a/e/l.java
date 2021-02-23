package g.a.e;

import g.a.b;
import h.e;
import java.io.IOException;

class l extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f15107b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f15108c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f15109d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f15110e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ n f15111f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(n nVar, String str, Object[] objArr, int i, e eVar, int i2, boolean z) {
        super(str, objArr);
        this.f15111f = nVar;
        this.f15107b = i;
        this.f15108c = eVar;
        this.f15109d = i2;
        this.f15110e = z;
    }

    public void b() {
        try {
            boolean a2 = this.f15111f.k.a(this.f15107b, this.f15108c, this.f15109d, this.f15110e);
            if (a2) {
                this.f15111f.s.a(this.f15107b, b.CANCEL);
            }
            if (a2 || this.f15110e) {
                synchronized (this.f15111f) {
                    this.f15111f.u.remove(Integer.valueOf(this.f15107b));
                }
            }
        } catch (IOException unused) {
        }
    }
}
