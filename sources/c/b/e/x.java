package c.b.e;

import java.util.Iterator;
import java.util.NoSuchElementException;

class x implements Iterator<Object> {
    x() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
