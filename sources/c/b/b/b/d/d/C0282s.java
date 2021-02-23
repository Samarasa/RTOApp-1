package c.b.b.b.d.d;

import java.util.NoSuchElementException;

/* renamed from: c.b.b.b.d.d.s  reason: case insensitive filesystem */
abstract class C0282s<E> extends K<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4046a;

    /* renamed from: b  reason: collision with root package name */
    private int f4047b;

    protected C0282s(int i, int i2) {
        C0277m.b(i2, i);
        this.f4046a = i;
        this.f4047b = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.f4047b < this.f4046a;
    }

    public final boolean hasPrevious() {
        return this.f4047b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f4047b;
            this.f4047b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f4047b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f4047b - 1;
            this.f4047b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f4047b - 1;
    }
}
