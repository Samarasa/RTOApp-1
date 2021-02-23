package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.tX  reason: case insensitive filesystem */
public abstract class C2638tX<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f12208a = new Object[0];

    C2638tX() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        QX qx = (QX) iterator();
        while (qx.hasNext()) {
            objArr[i] = qx.next();
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

    /* renamed from: c */
    public abstract QX<E> iterator();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    public C2709uX<E> g() {
        return isEmpty() ? C2709uX.i() : C2709uX.b(toArray());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean h();

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
        return toArray(f12208a);
    }

    public final <T> T[] toArray(T[] tArr) {
        C1434cX.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d2 = d();
            if (d2 != null) {
                return Arrays.copyOfRange(d2, e(), f(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
