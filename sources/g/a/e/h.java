package g.a.e;

import g.a.b;
import java.io.IOException;

class h extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f15092b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f15093c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f15094d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(n nVar, String str, Object[] objArr, int i, long j) {
        super(str, objArr);
        this.f15094d = nVar;
        this.f15092b = i;
        this.f15093c = j;
    }

    public void b() {
        try {
            this.f15094d.s.b(this.f15092b, this.f15093c);
        } catch (IOException unused) {
        }
    }
}
