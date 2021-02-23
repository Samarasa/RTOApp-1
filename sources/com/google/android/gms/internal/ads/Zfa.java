package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class Zfa implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f9574a = this.f9576c.f9678a.listIterator(this.f9575b);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f9575b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ _fa f9576c;

    Zfa(_fa _fa, int i) {
        this.f9576c = _fa;
        this.f9575b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f9574a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f9574a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f9574a.next();
    }

    public final int nextIndex() {
        return this.f9574a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f9574a.previous();
    }

    public final int previousIndex() {
        return this.f9574a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
