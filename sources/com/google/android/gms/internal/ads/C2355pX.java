package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.pX  reason: case insensitive filesystem */
abstract class C2355pX<E> extends PX<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f11726a;

    /* renamed from: b  reason: collision with root package name */
    private int f11727b;

    protected C2355pX(int i, int i2) {
        C1434cX.b(i2, i);
        this.f11726a = i;
        this.f11727b = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.f11727b < this.f11726a;
    }

    public final boolean hasPrevious() {
        return this.f11727b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f11727b;
            this.f11727b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f11727b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f11727b - 1;
            this.f11727b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f11727b - 1;
    }
}
