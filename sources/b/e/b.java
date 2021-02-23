package b.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class b<K, V> extends i<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    h<K, V> f2195h;

    public b() {
    }

    public b(int i) {
        super(i);
    }

    public b(i iVar) {
        super(iVar);
    }

    private h<K, V> b() {
        if (this.f2195h == null) {
            this.f2195h = new a(this);
        }
        return this.f2195h;
    }

    public boolean a(Collection<?> collection) {
        return h.c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    public Set<K> keySet() {
        return b().e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f2242g + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return b().f();
    }
}
