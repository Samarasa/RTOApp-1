package g;

import h.f;

class I extends J {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C f14894a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f14895b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ byte[] f14896c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f14897d;

    I(C c2, int i, byte[] bArr, int i2) {
        this.f14894a = c2;
        this.f14895b = i;
        this.f14896c = bArr;
        this.f14897d = i2;
    }

    public long a() {
        return (long) this.f14895b;
    }

    public void a(f fVar) {
        fVar.write(this.f14896c, this.f14897d, this.f14895b);
    }

    public C b() {
        return this.f14894a;
    }
}
