package c.b.b.b.d.d;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: c.b.b.b.d.d.x  reason: case insensitive filesystem */
public abstract class C0287x<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f4060a = new Object[0];

    C0287x() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        L l = (L) iterator();
        while (l.hasNext()) {
            objArr[i] = l.next();
            i++;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract L<E> iterator();

    /* access modifiers changed from: package-private */
    public Object[] c() {
        return null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f4060a);
    }

    public final <T> T[] toArray(T[] tArr) {
        C0277m.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] c2 = c();
            if (c2 != null) {
                return Arrays.copyOfRange(c2, d(), e(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
