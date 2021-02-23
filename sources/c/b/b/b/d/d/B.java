package c.b.b.b.d.d;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class B<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map.Entry<?, ?>[] f3941a = new Map.Entry[0];

    /* renamed from: b  reason: collision with root package name */
    private transient D<Map.Entry<K, V>> f3942b;

    /* renamed from: c  reason: collision with root package name */
    private transient D<K> f3943c;

    /* renamed from: d  reason: collision with root package name */
    private transient C0287x<V> f3944d;

    B() {
    }

    public static <K, V> B<K, V> a() {
        return F.f3961e;
    }

    /* access modifiers changed from: package-private */
    public abstract D<Map.Entry<K, V>> b();

    /* access modifiers changed from: package-private */
    public abstract D<K> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((C0287x) values()).contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract C0287x<V> d();

    public /* synthetic */ Set entrySet() {
        D<Map.Entry<K, V>> d2 = this.f3942b;
        if (d2 != null) {
            return d2;
        }
        D<Map.Entry<K, V>> b2 = b();
        this.f3942b = b2;
        return b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return I.a((D) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        D<K> d2 = this.f3943c;
        if (d2 != null) {
            return d2;
        }
        D<K> c2 = c();
        this.f3943c = c2;
        return c2;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Collection values() {
        C0287x<V> xVar = this.f3944d;
        if (xVar != null) {
            return xVar;
        }
        C0287x<V> d2 = d();
        this.f3944d = d2;
        return d2;
    }
}
