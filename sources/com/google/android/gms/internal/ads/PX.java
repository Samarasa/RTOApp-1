package com.google.android.gms.internal.ads;

import java.util.ListIterator;

public abstract class PX<E> extends QX<E> implements ListIterator<E> {
    protected PX() {
    }

    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
