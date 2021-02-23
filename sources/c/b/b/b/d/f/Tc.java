package c.b.b.b.d.f;

import java.util.Map;

final class Tc implements Comparable<Tc>, Map.Entry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f4285a;

    /* renamed from: b  reason: collision with root package name */
    private V f4286b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Oc f4287c;

    Tc(Oc oc, K k, V v) {
        this.f4287c = oc;
        this.f4285a = k;
        this.f4286b = v;
    }

    Tc(Oc oc, Map.Entry<K, V> entry) {
        this(oc, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((Tc) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f4285a, entry.getKey()) && a(this.f4286b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f4285a;
    }

    public final V getValue() {
        return this.f4286b;
    }

    public final int hashCode() {
        K k = this.f4285a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f4286b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f4287c.f();
        V v2 = this.f4286b;
        this.f4286b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4285a);
        String valueOf2 = String.valueOf(this.f4286b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
