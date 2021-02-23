package c.b.b.b.d.d;

/* renamed from: c.b.b.b.d.d.y  reason: case insensitive filesystem */
final class C0288y extends C0286w<E> {

    /* renamed from: c  reason: collision with root package name */
    private final transient int f4062c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f4063d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C0286w f4064e;

    C0288y(C0286w wVar, int i, int i2) {
        this.f4064e = wVar;
        this.f4062c = i;
        this.f4063d = i2;
    }

    /* renamed from: a */
    public final C0286w<E> subList(int i, int i2) {
        C0277m.a(i, i2, this.f4063d);
        C0286w wVar = this.f4064e;
        int i3 = this.f4062c;
        return (C0286w) wVar.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: package-private */
    public final Object[] c() {
        return this.f4064e.c();
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f4064e.d() + this.f4062c;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.f4064e.d() + this.f4062c + this.f4063d;
    }

    public final E get(int i) {
        C0277m.a(i, this.f4063d);
        return this.f4064e.get(i + this.f4062c);
    }

    public final int size() {
        return this.f4063d;
    }
}
