package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class Jfa implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f7450a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f7451b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Hfa f7452c;

    private Jfa(Hfa hfa) {
        this.f7452c = hfa;
        this.f7450a = this.f7452c.f7169b.size();
    }

    /* synthetic */ Jfa(Hfa hfa, Gfa gfa) {
        this(hfa);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f7451b == null) {
            this.f7451b = this.f7452c.f7173f.entrySet().iterator();
        }
        return this.f7451b;
    }

    public final boolean hasNext() {
        int i = this.f7450a;
        return (i > 0 && i <= this.f7452c.f7169b.size()) || b().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (b().hasNext()) {
            obj = b().next();
        } else {
            List b2 = this.f7452c.f7169b;
            int i = this.f7450a - 1;
            this.f7450a = i;
            obj = b2.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
