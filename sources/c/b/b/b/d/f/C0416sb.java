package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.sb  reason: case insensitive filesystem */
final class C0416sb extends C0403qb {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f4564d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4565e;

    /* renamed from: f  reason: collision with root package name */
    private int f4566f;

    /* renamed from: g  reason: collision with root package name */
    private int f4567g;

    /* renamed from: h  reason: collision with root package name */
    private int f4568h;
    private int i;
    private int j;

    private C0416sb(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.j = Integer.MAX_VALUE;
        this.f4564d = bArr;
        this.f4566f = i3 + i2;
        this.f4568h = i2;
        this.i = this.f4568h;
        this.f4565e = z;
    }

    private final void b() {
        this.f4566f += this.f4567g;
        int i2 = this.f4566f;
        int i3 = i2 - this.i;
        int i4 = this.j;
        if (i3 > i4) {
            this.f4567g = i3 - i4;
            this.f4566f = i2 - this.f4567g;
            return;
        }
        this.f4567g = 0;
    }

    public final int a() {
        return this.f4568h - this.i;
    }

    public final int b(int i2) {
        if (i2 >= 0) {
            int a2 = i2 + a();
            int i3 = this.j;
            if (a2 <= i3) {
                this.j = a2;
                b();
                return i3;
            }
            throw Wb.a();
        }
        throw Wb.b();
    }
}
