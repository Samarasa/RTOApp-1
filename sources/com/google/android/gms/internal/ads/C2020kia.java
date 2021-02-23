package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.kia  reason: case insensitive filesystem */
public final class C2020kia<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f11088a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f11088a.containsKey(str)) {
                this.f11088a.put(str, new AtomicReference());
            }
        }
        return this.f11088a.get(str);
    }
}
