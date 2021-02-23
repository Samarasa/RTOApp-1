package c.b.b.b.d.f;

import java.util.List;
import java.util.RandomAccess;

public interface Tb<E> extends List<E>, RandomAccess {
    Tb<E> a(int i);

    boolean a();

    void m();
}
