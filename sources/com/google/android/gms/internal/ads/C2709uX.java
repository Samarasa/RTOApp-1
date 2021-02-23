package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.uX  reason: case insensitive filesystem */
public abstract class C2709uX<E> extends C2638tX<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final PX<Object> f12334b = new C2851wX(EX.f6704c, 0);

    C2709uX() {
    }

    public static <E> C2709uX<E> a(Iterable<? extends E> iterable) {
        C1434cX.a(iterable);
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return EX.f6704c;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a(next);
        }
        C2922xX xXVar = new C2922xX();
        xXVar.a((Object) next);
        C2922xX xXVar2 = xXVar;
        xXVar2.a((Iterator) it);
        C2922xX xXVar3 = xXVar2;
        xXVar3.f12094c = true;
        return b(xXVar3.f12092a, xXVar3.f12093b);
    }

    public static <E> C2709uX<E> a(E e2) {
        Object[] objArr = {e2};
        for (int i = 0; i <= 0; i++) {
            FX.a(objArr[0], 0);
        }
        return b(objArr, 1);
    }

    public static <E> C2709uX<E> a(Collection<? extends E> collection) {
        if (collection instanceof C2638tX) {
            C2709uX<E> g2 = ((C2638tX) collection).g();
            if (!g2.h()) {
                return g2;
            }
            Object[] array = g2.toArray();
            return b(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            FX.a(array2[i], i);
        }
        return b(array2, array2.length);
    }

    public static <E> C2709uX<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return EX.f6704c;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            FX.a(objArr[i], i);
        }
        return b(objArr, objArr.length);
    }

    static <E> C2709uX<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> C2709uX<E> b(Object[] objArr, int i) {
        return i == 0 ? EX.f6704c : new EX(objArr, i);
    }

    public static <E> C2709uX<E> i() {
        return EX.f6704c;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public C2709uX<E> subList(int i, int i2) {
        C1434cX.a(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? EX.f6704c : new C3064zX(this, i, i3);
    }

    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final QX<E> iterator() {
        return (PX) listIterator();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        C1434cX.a(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (_W.a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i2);
                        i2++;
                        if (!_W.a(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final C2709uX<E> g() {
        return this;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (PX) listIterator(0);
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        C1434cX.b(i, size());
        return isEmpty() ? f12334b : new C2851wX(this, i);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }
}
