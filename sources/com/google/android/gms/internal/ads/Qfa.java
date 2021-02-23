package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class Qfa implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f8367a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8368b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f8369c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Hfa f8370d;

    private Qfa(Hfa hfa) {
        this.f8370d = hfa;
        this.f8367a = -1;
    }

    /* synthetic */ Qfa(Hfa hfa, Gfa gfa) {
        this(hfa);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f8369c == null) {
            this.f8369c = this.f8370d.f7170c.entrySet().iterator();
        }
        return this.f8369c;
    }

    public final boolean hasNext() {
        return this.f8367a + 1 < this.f8370d.f7169b.size() || (!this.f8370d.f7170c.isEmpty() && b().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f8368b = true;
        int i = this.f8367a + 1;
        this.f8367a = i;
        return (Map.Entry) (i < this.f8370d.f7169b.size() ? this.f8370d.f7169b.get(this.f8367a) : b().next());
    }

    public final void remove() {
        if (this.f8368b) {
            this.f8368b = false;
            this.f8370d.f();
            if (this.f8367a < this.f8370d.f7169b.size()) {
                Hfa hfa = this.f8370d;
                int i = this.f8367a;
                this.f8367a = i - 1;
                Object unused = hfa.c(i);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
