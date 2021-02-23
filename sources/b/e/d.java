package b.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f2197a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Object[] f2198b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    private static Object[] f2199c;

    /* renamed from: d  reason: collision with root package name */
    private static int f2200d;

    /* renamed from: e  reason: collision with root package name */
    private static Object[] f2201e;

    /* renamed from: f  reason: collision with root package name */
    private static int f2202f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f2203g;

    /* renamed from: h  reason: collision with root package name */
    Object[] f2204h;
    int i;
    private h<E, E> j;

    public d() {
        this(0);
    }

    public d(int i2) {
        if (i2 == 0) {
            this.f2203g = f2197a;
            this.f2204h = f2198b;
        } else {
            m(i2);
        }
        this.i = 0;
    }

    private int a(Object obj, int i2) {
        int i3 = this.i;
        if (i3 == 0) {
            return -1;
        }
        int a2 = e.a(this.f2203g, i3, i2);
        if (a2 < 0 || obj.equals(this.f2204h[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f2203g[i4] == i2) {
            if (obj.equals(this.f2204h[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f2203g[i5] == i2) {
            if (obj.equals(this.f2204h[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f2202f < 10) {
                    objArr[0] = f2201e;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2201e = objArr;
                    f2202f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f2200d < 10) {
                    objArr[0] = f2199c;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2199c = objArr;
                    f2200d++;
                }
            }
        }
    }

    private h<E, E> c() {
        if (this.j == null) {
            this.j = new c(this);
        }
        return this.j;
    }

    private int d() {
        int i2 = this.i;
        if (i2 == 0) {
            return -1;
        }
        int a2 = e.a(this.f2203g, i2, 0);
        if (a2 < 0 || this.f2204h[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f2203g[i3] == 0) {
            if (this.f2204h[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f2203g[i4] == 0) {
            if (this.f2204h[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private void m(int i2) {
        if (i2 == 8) {
            synchronized (d.class) {
                if (f2201e != null) {
                    Object[] objArr = f2201e;
                    this.f2204h = objArr;
                    f2201e = (Object[]) objArr[0];
                    this.f2203g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2202f--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (d.class) {
                if (f2199c != null) {
                    Object[] objArr2 = f2199c;
                    this.f2204h = objArr2;
                    f2199c = (Object[]) objArr2[0];
                    this.f2203g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2200d--;
                    return;
                }
            }
        }
        this.f2203g = new int[i2];
        this.f2204h = new Object[i2];
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = d();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = a(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.i;
        if (i5 >= this.f2203g.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f2203g;
            Object[] objArr = this.f2204h;
            m(i6);
            int[] iArr2 = this.f2203g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2204h, 0, objArr.length);
            }
            a(iArr, objArr, this.i);
        }
        int i7 = this.i;
        if (i4 < i7) {
            int[] iArr3 = this.f2203g;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f2204h;
            System.arraycopy(objArr2, i4, objArr2, i8, this.i - i4);
        }
        this.f2203g[i4] = i2;
        this.f2204h[i4] = e2;
        this.i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        j(this.i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i2 = this.i;
        if (i2 != 0) {
            a(this.f2203g, this.f2204h, i2);
            this.f2203g = f2197a;
            this.f2204h = f2198b;
            this.i = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.i) {
                try {
                    if (!set.contains(l(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f2203g;
        int i2 = this.i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? d() : a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.i <= 0;
    }

    public Iterator<E> iterator() {
        return c().e().iterator();
    }

    public void j(int i2) {
        int[] iArr = this.f2203g;
        if (iArr.length < i2) {
            Object[] objArr = this.f2204h;
            m(i2);
            int i3 = this.i;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f2203g, 0, i3);
                System.arraycopy(objArr, 0, this.f2204h, 0, this.i);
            }
            a(iArr, objArr, this.i);
        }
    }

    public E k(int i2) {
        E[] eArr = this.f2204h;
        E e2 = eArr[i2];
        int i3 = this.i;
        if (i3 <= 1) {
            a(this.f2203g, eArr, i3);
            this.f2203g = f2197a;
            this.f2204h = f2198b;
            this.i = 0;
        } else {
            int[] iArr = this.f2203g;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                this.i--;
                int i5 = this.i;
                if (i2 < i5) {
                    int[] iArr2 = this.f2203g;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.f2204h;
                    System.arraycopy(objArr, i6, objArr, i2, this.i - i2);
                }
                this.f2204h[this.i] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f2203g;
                Object[] objArr2 = this.f2204h;
                m(i4);
                this.i--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f2203g, 0, i2);
                    System.arraycopy(objArr2, 0, this.f2204h, 0, i2);
                }
                int i7 = this.i;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f2203g, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.f2204h, i2, this.i - i2);
                }
            }
        }
        return e2;
    }

    public E l(int i2) {
        return this.f2204h[i2];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        k(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.i - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2204h[i2])) {
                k(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.i;
    }

    public Object[] toArray() {
        int i2 = this.i;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2204h, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.i);
        }
        System.arraycopy(this.f2204h, 0, tArr, 0, this.i);
        int length = tArr.length;
        int i2 = this.i;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object l = l(i2);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
