package c.b.e;

import c.b.e.C0480e;
import java.util.NoSuchElementException;

/* renamed from: c.b.e.d  reason: case insensitive filesystem */
class C0479d implements C0480e.d {

    /* renamed from: a  reason: collision with root package name */
    private int f5004a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f5005b = this.f5006c.size();

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0480e f5006c;

    C0479d(C0480e eVar) {
        this.f5006c = eVar;
    }

    public byte a() {
        try {
            C0480e eVar = this.f5006c;
            int i = this.f5004a;
            this.f5004a = i + 1;
            return eVar.j(i);
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f5004a < this.f5005b;
    }

    public Byte next() {
        return Byte.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
