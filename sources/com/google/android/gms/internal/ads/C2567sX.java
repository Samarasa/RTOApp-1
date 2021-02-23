package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.sX  reason: case insensitive filesystem */
class C2567sX<E> extends C2780vX<E> {

    /* renamed from: a  reason: collision with root package name */
    Object[] f12092a;

    /* renamed from: b  reason: collision with root package name */
    int f12093b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f12094c;

    C2567sX(int i) {
        C2284oX.a(i, "initialCapacity");
        this.f12092a = new Object[i];
    }

    private final void a(int i) {
        Object[] objArr = this.f12092a;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.f12092a = Arrays.copyOf(objArr, i2);
                this.f12094c = false;
                return;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else if (this.f12094c) {
            this.f12092a = (Object[]) objArr.clone();
            this.f12094c = false;
        }
    }

    public C2780vX<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(this.f12093b + collection.size());
            if (collection instanceof C2638tX) {
                this.f12093b = ((C2638tX) collection).a(this.f12092a, this.f12093b);
                return this;
            }
        }
        super.a(iterable);
        return this;
    }

    public C2567sX<E> b(E e2) {
        C1434cX.a(e2);
        a(this.f12093b + 1);
        Object[] objArr = this.f12092a;
        int i = this.f12093b;
        this.f12093b = i + 1;
        objArr[i] = e2;
        return this;
    }
}
