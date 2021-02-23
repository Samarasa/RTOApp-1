package c.b.b.b.d.f;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class Vc extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Oc f4309a;

    private Vc(Oc oc) {
        this.f4309a = oc;
    }

    /* synthetic */ Vc(Oc oc, Nc nc) {
        this(oc);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f4309a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f4309a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4309a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new Wc(this.f4309a, (Nc) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f4309a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f4309a.size();
    }
}
