package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class _fa extends AbstractList<String> implements Pea, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Pea f9678a;

    public _fa(Pea pea) {
        this.f9678a = pea;
    }

    public final void a(Lda lda) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f9678a.get(i);
    }

    public final Object i(int i) {
        return this.f9678a.i(i);
    }

    public final Iterator<String> iterator() {
        return new C1379bga(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new Zfa(this, i);
    }

    public final List<?> r() {
        return this.f9678a.r();
    }

    public final Pea s() {
        return this;
    }

    public final int size() {
        return this.f9678a.size();
    }
}
