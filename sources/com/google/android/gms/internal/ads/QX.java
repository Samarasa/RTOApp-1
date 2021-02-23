package com.google.android.gms.internal.ads;

import java.util.Iterator;

public abstract class QX<E> implements Iterator<E> {
    protected QX() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
