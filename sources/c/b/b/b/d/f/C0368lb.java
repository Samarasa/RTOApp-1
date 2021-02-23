package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.lb  reason: case insensitive filesystem */
final class C0368lb extends C0389ob {

    /* renamed from: f  reason: collision with root package name */
    private final int f4502f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4503g;

    C0368lb(byte[] bArr, int i, int i2) {
        super(bArr);
        C0320eb.b(i, i + i2, bArr.length);
        this.f4502f = i;
        this.f4503g = i2;
    }

    public final byte a(int i) {
        int a2 = a();
        if (((a2 - (i + 1)) | i) >= 0) {
            return this.f4523e[this.f4502f + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(a2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int a() {
        return this.f4503g;
    }

    /* access modifiers changed from: package-private */
    public final byte b(int i) {
        return this.f4523e[this.f4502f + i];
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return this.f4502f;
    }
}
