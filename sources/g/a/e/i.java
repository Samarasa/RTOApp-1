package g.a.e;

import g.a.b;
import java.io.IOException;

class i extends b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f15095b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f15096c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f15097d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w f15098e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ n f15099f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(n nVar, String str, Object[] objArr, boolean z, int i, int i2, w wVar) {
        super(str, objArr);
        this.f15099f = nVar;
        this.f15095b = z;
        this.f15096c = i;
        this.f15097d = i2;
        this.f15098e = wVar;
    }

    public void b() {
        try {
            this.f15099f.a(this.f15095b, this.f15096c, this.f15097d, this.f15098e);
        } catch (IOException unused) {
        }
    }
}
