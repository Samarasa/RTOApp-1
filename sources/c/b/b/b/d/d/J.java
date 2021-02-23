package c.b.b.b.d.d;

final class J extends C0286w<Object> {

    /* renamed from: c  reason: collision with root package name */
    private final transient Object[] f3970c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f3971d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f3972e;

    J(Object[] objArr, int i, int i2) {
        this.f3970c = objArr;
        this.f3971d = i;
        this.f3972e = i2;
    }

    public final Object get(int i) {
        C0277m.a(i, this.f3972e);
        return this.f3970c[(i * 2) + this.f3971d];
    }

    public final int size() {
        return this.f3972e;
    }
}
