package g.a.e;

import g.a.b;
import java.io.IOException;

class g extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f15089b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f15090c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f15091d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(n nVar, String str, Object[] objArr, int i, b bVar) {
        super(str, objArr);
        this.f15091d = nVar;
        this.f15089b = i;
        this.f15090c = bVar;
    }

    public void b() {
        try {
            this.f15091d.b(this.f15089b, this.f15090c);
        } catch (IOException unused) {
        }
    }
}
