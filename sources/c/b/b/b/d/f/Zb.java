package c.b.b.b.d.f;

import java.util.Map;

final class Zb<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, Xb> f4355a;

    private Zb(Map.Entry<K, Xb> entry) {
        this.f4355a = entry;
    }

    public final K getKey() {
        return this.f4355a.getKey();
    }

    public final Object getValue() {
        if (this.f4355a.getValue() == null) {
            return null;
        }
        Xb.c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C0445wc) {
            return this.f4355a.getValue().a((C0445wc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
