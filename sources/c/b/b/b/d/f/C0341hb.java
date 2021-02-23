package c.b.b.b.d.f;

import java.util.NoSuchElementException;

/* renamed from: c.b.b.b.d.f.hb  reason: case insensitive filesystem */
final class C0341hb extends C0354jb {

    /* renamed from: a  reason: collision with root package name */
    private int f4467a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f4468b = this.f4469c.a();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0320eb f4469c;

    C0341hb(C0320eb ebVar) {
        this.f4469c = ebVar;
    }

    public final byte a() {
        int i = this.f4467a;
        if (i < this.f4468b) {
            this.f4467a = i + 1;
            return this.f4469c.b(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f4467a < this.f4468b;
    }
}
