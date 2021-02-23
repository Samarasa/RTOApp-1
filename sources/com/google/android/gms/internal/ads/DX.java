package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class DX extends QX<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6564a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Object f6565b;

    DX(Object obj) {
        this.f6565b = obj;
    }

    public final boolean hasNext() {
        return !this.f6564a;
    }

    public final T next() {
        if (!this.f6564a) {
            this.f6564a = true;
            return this.f6565b;
        }
        throw new NoSuchElementException();
    }
}
