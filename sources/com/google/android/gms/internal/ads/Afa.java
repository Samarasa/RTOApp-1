package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class Afa implements Iterator<Xda> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<C3078zfa> f6158a;

    /* renamed from: b  reason: collision with root package name */
    private Xda f6159b;

    private Afa(Lda lda) {
        Xda xda;
        if (lda instanceof C3078zfa) {
            C3078zfa zfa = (C3078zfa) lda;
            this.f6158a = new ArrayDeque<>(zfa.i());
            this.f6158a.push(zfa);
            xda = a(zfa.f13090g);
        } else {
            this.f6158a = null;
            xda = (Xda) lda;
        }
        this.f6159b = xda;
    }

    /* synthetic */ Afa(Lda lda, C3007yfa yfa) {
        this(lda);
    }

    private final Xda a(Lda lda) {
        while (lda instanceof C3078zfa) {
            C3078zfa zfa = (C3078zfa) lda;
            this.f6158a.push(zfa);
            lda = zfa.f13090g;
        }
        return (Xda) lda;
    }

    public final boolean hasNext() {
        return this.f6159b != null;
    }

    public final /* synthetic */ Object next() {
        Xda xda;
        Xda xda2 = this.f6159b;
        if (xda2 != null) {
            while (true) {
                ArrayDeque<C3078zfa> arrayDeque = this.f6158a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    xda = a(this.f6158a.pop().f13091h);
                    if (!xda.isEmpty()) {
                        break;
                    }
                } else {
                    xda = null;
                }
            }
            xda = null;
            this.f6159b = xda;
            return xda2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
