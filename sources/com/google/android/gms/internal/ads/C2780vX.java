package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.vX  reason: case insensitive filesystem */
public abstract class C2780vX<E> {
    C2780vX() {
    }

    public C2780vX<E> a(Iterable<? extends E> iterable) {
        for (Object a2 : iterable) {
            a(a2);
        }
        return this;
    }

    public abstract C2780vX<E> a(E e2);

    public C2780vX<E> a(Iterator<? extends E> it) {
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
