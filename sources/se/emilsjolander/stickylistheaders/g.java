package se.emilsjolander.stickylistheaders;

import java.util.HashMap;

class g<TKey, TValue> {

    /* renamed from: a  reason: collision with root package name */
    HashMap<TKey, TValue> f15600a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    HashMap<TValue, TKey> f15601b = new HashMap<>();

    g() {
    }

    public TValue a(TKey tkey) {
        return this.f15600a.get(tkey);
    }

    public void a(TKey tkey, TValue tvalue) {
        c(tkey);
        d(tvalue);
        this.f15600a.put(tkey, tvalue);
        this.f15601b.put(tvalue, tkey);
    }

    public TKey b(TValue tvalue) {
        return this.f15601b.get(tvalue);
    }

    public void c(TKey tkey) {
        if (a(tkey) != null) {
            this.f15601b.remove(a(tkey));
        }
        this.f15600a.remove(tkey);
    }

    public void d(TValue tvalue) {
        if (b(tvalue) != null) {
            this.f15600a.remove(b(tvalue));
        }
        this.f15601b.remove(tvalue);
    }
}
