package h;

final class s {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f15356a;

    /* renamed from: b  reason: collision with root package name */
    int f15357b;

    /* renamed from: c  reason: collision with root package name */
    int f15358c;

    /* renamed from: d  reason: collision with root package name */
    boolean f15359d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15360e;

    /* renamed from: f  reason: collision with root package name */
    s f15361f;

    /* renamed from: g  reason: collision with root package name */
    s f15362g;

    s() {
        this.f15356a = new byte[8192];
        this.f15360e = true;
        this.f15359d = false;
    }

    s(s sVar) {
        this(sVar.f15356a, sVar.f15357b, sVar.f15358c);
        sVar.f15359d = true;
    }

    s(byte[] bArr, int i, int i2) {
        this.f15356a = bArr;
        this.f15357b = i;
        this.f15358c = i2;
        this.f15360e = false;
        this.f15359d = true;
    }

    public s a(int i) {
        s sVar;
        if (i <= 0 || i > this.f15358c - this.f15357b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            sVar = new s(this);
        } else {
            sVar = t.a();
            System.arraycopy(this.f15356a, this.f15357b, sVar.f15356a, 0, i);
        }
        sVar.f15358c = sVar.f15357b + i;
        this.f15357b += i;
        this.f15362g.a(sVar);
        return sVar;
    }

    public s a(s sVar) {
        sVar.f15362g = this;
        sVar.f15361f = this.f15361f;
        this.f15361f.f15362g = sVar;
        this.f15361f = sVar;
        return sVar;
    }

    public void a() {
        s sVar = this.f15362g;
        if (sVar == this) {
            throw new IllegalStateException();
        } else if (sVar.f15360e) {
            int i = this.f15358c - this.f15357b;
            if (i <= (8192 - sVar.f15358c) + (sVar.f15359d ? 0 : sVar.f15357b)) {
                a(this.f15362g, i);
                b();
                t.a(this);
            }
        }
    }

    public void a(s sVar, int i) {
        if (sVar.f15360e) {
            int i2 = sVar.f15358c;
            if (i2 + i > 8192) {
                if (!sVar.f15359d) {
                    int i3 = sVar.f15357b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sVar.f15356a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        sVar.f15358c -= sVar.f15357b;
                        sVar.f15357b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f15356a, this.f15357b, sVar.f15356a, sVar.f15358c, i);
            sVar.f15358c += i;
            this.f15357b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public s b() {
        s sVar = this.f15361f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f15362g;
        sVar2.f15361f = this.f15361f;
        this.f15361f.f15362g = sVar2;
        this.f15361f = null;
        this.f15362g = null;
        return sVar;
    }
}
