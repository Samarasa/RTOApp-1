package c.a.a.g.a;

import c.a.a.i.k;

@Deprecated
public abstract class f<Z> extends a<Z> {

    /* renamed from: b  reason: collision with root package name */
    private final int f3573b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3574c;

    public f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public f(int i, int i2) {
        this.f3573b = i;
        this.f3574c = i2;
    }

    public void a(g gVar) {
    }

    public final void b(g gVar) {
        if (k.b(this.f3573b, this.f3574c)) {
            gVar.a(this.f3573b, this.f3574c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f3573b + " and height: " + this.f3574c + ", either provide dimensions in the constructor or call override()");
    }
}
