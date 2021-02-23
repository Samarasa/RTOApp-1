package c.b.b.b.d.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.b.b.b.d.d.c  reason: case insensitive filesystem */
abstract class C0260c<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f3989a = C0264e.f3994b;

    /* renamed from: b  reason: collision with root package name */
    private T f3990b;

    protected C0260c() {
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T b() {
        this.f3989a = C0264e.f3995c;
        return null;
    }

    public final boolean hasNext() {
        if (this.f3989a != C0264e.f3996d) {
            int i = C0258b.f3987a[this.f3989a - 1];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f3989a = C0264e.f3996d;
            this.f3990b = a();
            if (this.f3989a == C0264e.f3995c) {
                return false;
            }
            this.f3989a = C0264e.f3993a;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f3989a = C0264e.f3994b;
            T t = this.f3990b;
            this.f3990b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
