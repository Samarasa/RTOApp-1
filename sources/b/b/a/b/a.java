package b.b.a.b;

import b.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f2147e = new HashMap<>();

    /* access modifiers changed from: protected */
    public b.c<K, V> a(K k) {
        return this.f2147e.get(k);
    }

    public V b(K k, V v) {
        b.c a2 = a(k);
        if (a2 != null) {
            return a2.f2153b;
        }
        this.f2147e.put(k, a(k, v));
        return null;
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.f2147e.get(k).f2155d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f2147e.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f2147e.remove(k);
        return remove;
    }
}
