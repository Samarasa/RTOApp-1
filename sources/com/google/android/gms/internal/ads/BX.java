package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class BX<E> extends C2638tX<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient C2709uX<E> f6300b;

    BX() {
    }

    public static <E> BX<E> a(E e2) {
        return new NX(e2);
    }

    @SafeVarargs
    public static <E> BX<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        C1434cX.a(eArr.length <= 2147483641, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return b(objArr.length, objArr);
    }

    /* access modifiers changed from: private */
    public static <E> BX<E> b(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return a(objArr[0]);
            }
            int j = j(i);
            Object[] objArr2 = new Object[j];
            int i2 = j - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                FX.a(obj, i5);
                int hashCode = obj.hashCode();
                int a2 = C2426qX.a(hashCode);
                while (true) {
                    int i6 = a2 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a2++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new NX(objArr[0], i3);
            }
            if (j(i4) < j / 2) {
                i = i4;
            } else {
                if (b(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new LX(objArr, i3, objArr2, i2, i4);
            }
        }
        return LX.f7679c;
    }

    /* access modifiers changed from: private */
    public static boolean b(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int j(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d2 = (double) highestOneBit;
                Double.isNaN(d2);
                if (d2 * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C1434cX.a(z, (Object) "collection too large");
            return 1073741824;
        }
    }

    public static <E> AX<E> k(int i) {
        C2284oX.a(i, "expectedSize");
        return new AX<>(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BX) || !i() || !((BX) obj).i() || hashCode() == obj.hashCode()) {
            return OX.a(this, obj);
        }
        return false;
    }

    public C2709uX<E> g() {
        C2709uX<E> uXVar = this.f6300b;
        if (uXVar != null) {
            return uXVar;
        }
        C2709uX<E> j = j();
        this.f6300b = j;
        return j;
    }

    public int hashCode() {
        return OX.a(this);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public C2709uX<E> j() {
        return C2709uX.b(toArray());
    }
}
