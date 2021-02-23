package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class Rc implements Iterator<Object> {
    Rc() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
