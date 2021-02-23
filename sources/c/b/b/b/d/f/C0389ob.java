package c.b.b.b.d.f;

import java.nio.charset.Charset;

/* renamed from: c.b.b.b.d.f.ob  reason: case insensitive filesystem */
class C0389ob extends C0396pb {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f4523e;

    C0389ob(byte[] bArr) {
        if (bArr != null) {
            this.f4523e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    public byte a(int i) {
        return this.f4523e[i];
    }

    public int a() {
        return this.f4523e.length;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        return Nb.a(i, this.f4523e, e(), i3);
    }

    public final C0320eb a(int i, int i2) {
        int b2 = C0320eb.b(0, i2, a());
        return b2 == 0 ? C0320eb.f4416a : new C0368lb(this.f4523e, e(), b2);
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.f4523e, e(), a(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void a(C0327fb fbVar) {
        fbVar.a(this.f4523e, e(), a());
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C0320eb ebVar, int i, int i2) {
        if (i2 > ebVar.a()) {
            int a2 = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > ebVar.a()) {
            int a3 = ebVar.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(ebVar instanceof C0389ob)) {
            return ebVar.a(0, i2).equals(a(0, i2));
        } else {
            C0389ob obVar = (C0389ob) ebVar;
            byte[] bArr = this.f4523e;
            byte[] bArr2 = obVar.f4523e;
            int e2 = e() + i2;
            int e3 = e();
            int e4 = obVar.e();
            while (e3 < e2) {
                if (bArr[e3] != bArr2[e4]) {
                    return false;
                }
                e3++;
                e4++;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public byte b(int i) {
        return this.f4523e[i];
    }

    public final boolean c() {
        int e2 = e();
        return C0356jd.a(this.f4523e, e2, a() + e2);
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0320eb) || a() != ((C0320eb) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof C0389ob)) {
            return obj.equals(this);
        }
        C0389ob obVar = (C0389ob) obj;
        int d2 = d();
        int d3 = obVar.d();
        if (d2 == 0 || d3 == 0 || d2 == d3) {
            return a((C0320eb) obVar, 0, a());
        }
        return false;
    }
}
