package c.b.e;

import java.util.Iterator;
import java.util.Map;

public class p extends q {

    /* renamed from: f  reason: collision with root package name */
    private final r f5060f;

    static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, p> f5061a;

        private a(Map.Entry<K, p> entry) {
            this.f5061a = entry;
        }

        public K getKey() {
            return this.f5061a.getKey();
        }

        public Object getValue() {
            p value = this.f5061a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof r) {
                return this.f5061a.getValue().c((r) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f5062a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f5062a = it;
        }

        public boolean hasNext() {
            return this.f5062a.hasNext();
        }

        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f5062a.next();
            return next.getValue() instanceof p ? new a(next) : next;
        }

        public void remove() {
            this.f5062a.remove();
        }
    }

    public r a() {
        return b(this.f5060f);
    }

    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
