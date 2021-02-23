package c.b.e;

import java.util.ArrayList;
import java.util.List;

final class v<E> extends C0478c<E> {

    /* renamed from: b  reason: collision with root package name */
    private static final v<Object> f5068b = new v<>();

    /* renamed from: c  reason: collision with root package name */
    private final List<E> f5069c;

    static {
        f5068b.p();
    }

    v() {
        this(new ArrayList(10));
    }

    private v(List<E> list) {
        this.f5069c = list;
    }

    public static <E> v<E> d() {
        return f5068b;
    }

    public void add(int i, E e2) {
        c();
        this.f5069c.add(i, e2);
        this.modCount++;
    }

    public v<E> d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f5069c);
            return new v<>(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public E get(int i) {
        return this.f5069c.get(i);
    }

    public E remove(int i) {
        c();
        E remove = this.f5069c.remove(i);
        this.modCount++;
        return remove;
    }

    public E set(int i, E e2) {
        c();
        E e3 = this.f5069c.set(i, e2);
        this.modCount++;
        return e3;
    }

    public int size() {
        return this.f5069c.size();
    }
}
