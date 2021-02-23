package com.google.android.gms.internal.ads;

import java.util.Map;

final class GX<K, V> extends BX<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final transient C2993yX<K, V> f7036c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f7037d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f7038e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final transient int f7039f;

    GX(C2993yX<K, V> yXVar, Object[] objArr, int i, int i2) {
        this.f7036c = yXVar;
        this.f7037d = objArr;
        this.f7039f = i2;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return g().a(objArr, i);
    }

    /* renamed from: c */
    public final QX<Map.Entry<K, V>> iterator() {
        return (QX) g().iterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f7036c.get(key));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final C2709uX<Map.Entry<K, V>> j() {
        return new KX(this);
    }

    public final int size() {
        return this.f7039f;
    }
}
