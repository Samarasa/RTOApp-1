package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class Pga implements Iterator<E> {

    /* renamed from: a  reason: collision with root package name */
    private int f8235a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Mga f8236b;

    Pga(Mga mga) {
        this.f8236b = mga;
    }

    public final boolean hasNext() {
        return this.f8235a < this.f8236b.f7876b.size() || this.f8236b.f7877c.hasNext();
    }

    public final E next() {
        while (this.f8235a >= this.f8236b.f7876b.size()) {
            Mga mga = this.f8236b;
            mga.f7876b.add(mga.f7877c.next());
        }
        List<E> list = this.f8236b.f7876b;
        int i = this.f8235a;
        this.f8235a = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
