package com.google.android.gms.internal.ads;

import java.util.Map;

final class Lea<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, Jea> f7696a;

    private Lea(Map.Entry<K, Jea> entry) {
        this.f7696a = entry;
    }

    public final K getKey() {
        return this.f7696a.getKey();
    }

    public final Object getValue() {
        if (this.f7696a.getValue() == null) {
            return null;
        }
        Jea.c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C1872ifa) {
            return this.f7696a.getValue().a((C1872ifa) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
