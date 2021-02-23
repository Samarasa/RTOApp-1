package c.b.b.b.d.d;

import java.util.Map;

final class E<K, V> extends D<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final transient B<K, V> f3957c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f3958d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f3959e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final transient int f3960f;

    E(B<K, V> b2, Object[] objArr, int i, int i2) {
        this.f3957c = b2;
        this.f3958d = objArr;
        this.f3960f = i2;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return f().a(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final C0286w<Map.Entry<K, V>> a() {
        return new H(this);
    }

    /* renamed from: b */
    public final L<Map.Entry<K, V>> iterator() {
        return (L) f().iterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f3957c.get(key));
        }
    }

    public final int size() {
        return this.f3960f;
    }
}
