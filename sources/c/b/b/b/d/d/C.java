package c.b.b.b.d.d;

final class C<E> extends C0286w<E> {

    /* renamed from: c  reason: collision with root package name */
    static final C0286w<Object> f3953c = new C(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f3954d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f3955e;

    C(Object[] objArr, int i) {
        this.f3954d = objArr;
        this.f3955e = i;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.f3954d, 0, objArr, i, this.f3955e);
        return i + this.f3955e;
    }

    /* access modifiers changed from: package-private */
    public final Object[] c() {
        return this.f3954d;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.f3955e;
    }

    public final E get(int i) {
        C0277m.a(i, this.f3955e);
        return this.f3954d[i];
    }

    public final int size() {
        return this.f3955e;
    }
}
