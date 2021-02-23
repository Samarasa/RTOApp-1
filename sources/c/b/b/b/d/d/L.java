package c.b.b.b.d.d;

import java.util.Iterator;

public abstract class L<E> implements Iterator<E> {
    protected L() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
