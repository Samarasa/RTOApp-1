package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Mga<E> extends AbstractList<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final Oga f7875a = Oga.a(Mga.class);

    /* renamed from: b  reason: collision with root package name */
    List<E> f7876b;

    /* renamed from: c  reason: collision with root package name */
    Iterator<E> f7877c;

    public Mga(List<E> list, Iterator<E> it) {
        this.f7876b = list;
        this.f7877c = it;
    }

    public E get(int i) {
        if (this.f7876b.size() > i) {
            return this.f7876b.get(i);
        }
        if (this.f7877c.hasNext()) {
            this.f7876b.add(this.f7877c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new Pga(this);
    }

    public int size() {
        f7875a.a("potentially expensive size() call");
        f7875a.a("blowup running");
        while (this.f7877c.hasNext()) {
            this.f7876b.add(this.f7877c.next());
        }
        return this.f7876b.size();
    }
}
