package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class Oea<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f8121a;

    public Oea(Iterator<Map.Entry<K, Object>> it) {
        this.f8121a = it;
    }

    public final boolean hasNext() {
        return this.f8121a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f8121a.next();
        return next.getValue() instanceof Jea ? new Lea(next) : next;
    }

    public final void remove() {
        this.f8121a.remove();
    }
}
