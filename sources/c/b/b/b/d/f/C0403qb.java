package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.qb  reason: case insensitive filesystem */
public abstract class C0403qb {

    /* renamed from: a  reason: collision with root package name */
    int f4537a;

    /* renamed from: b  reason: collision with root package name */
    private int f4538b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4539c;

    private C0403qb() {
        this.f4537a = 100;
        this.f4538b = Integer.MAX_VALUE;
        this.f4539c = false;
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static C0403qb a(byte[] bArr, int i, int i2, boolean z) {
        C0416sb sbVar = new C0416sb(bArr, 0, i2, false);
        try {
            sbVar.b(i2);
            return sbVar;
        } catch (Wb e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
