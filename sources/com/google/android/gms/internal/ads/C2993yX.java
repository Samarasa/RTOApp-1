package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.yX  reason: case insensitive filesystem */
public abstract class C2993yX<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map.Entry<?, ?>[] f12922a = new Map.Entry[0];

    /* renamed from: b  reason: collision with root package name */
    private transient BX<Map.Entry<K, V>> f12923b;

    /* renamed from: c  reason: collision with root package name */
    private transient BX<K> f12924c;

    /* renamed from: d  reason: collision with root package name */
    private transient C2638tX<V> f12925d;

    C2993yX() {
    }

    public static <K, V> C2993yX<K, V> a(K k, V v) {
        C2284oX.a((Object) k, (Object) v);
        return HX.a(1, new Object[]{k, v});
    }

    public static <K, V> C2993yX<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C2284oX.a((Object) k, (Object) v);
        C2284oX.a((Object) k2, (Object) v2);
        C2284oX.a((Object) k3, (Object) v3);
        C2284oX.a((Object) k4, (Object) v4);
        return HX.a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* access modifiers changed from: package-private */
    public abstract BX<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract BX<K> b();

    /* access modifiers changed from: package-private */
    public abstract C2638tX<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((C2638tX) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        BX<Map.Entry<K, V>> bx = this.f12923b;
        if (bx != null) {
            return bx;
        }
        BX<Map.Entry<K, V>> a2 = a();
        this.f12923b = a2;
        return a2;
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
        return OX.a((BX) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        BX<K> bx = this.f12924c;
        if (bx != null) {
            return bx;
        }
        BX<K> b2 = b();
        this.f12924c = b2;
        return b2;
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
        C2284oX.a(size, "size");
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

    public /* synthetic */ Collection values() {
        C2638tX<V> tXVar = this.f12925d;
        if (tXVar != null) {
            return tXVar;
        }
        C2638tX<V> c2 = c();
        this.f12925d = c2;
        return c2;
    }
}
