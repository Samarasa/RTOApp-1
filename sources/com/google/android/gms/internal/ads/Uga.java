package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

abstract class Uga<K, V, V2> implements Xga<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, C1876iha<V>> f8916a;

    Uga(Map<K, C1876iha<V>> map) {
        this.f8916a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, C1876iha<V>> a() {
        return this.f8916a;
    }
}
