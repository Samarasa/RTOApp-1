package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class GW<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f7034a = JW.f7420b;

    /* renamed from: b  reason: collision with root package name */
    private T f7035b;

    protected GW() {
    }

    /* access modifiers changed from: protected */
    public abstract T b();

    /* access modifiers changed from: protected */
    public final T c() {
        this.f7034a = JW.f7421c;
        return null;
    }

    public final boolean hasNext() {
        if (this.f7034a != JW.f7422d) {
            int i = KW.f7560a[this.f7034a - 1];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f7034a = JW.f7422d;
            this.f7035b = b();
            if (this.f7034a == JW.f7421c) {
                return false;
            }
            this.f7034a = JW.f7419a;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f7034a = JW.f7420b;
            T t = this.f7035b;
            this.f7035b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
