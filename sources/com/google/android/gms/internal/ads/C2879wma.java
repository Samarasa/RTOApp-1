package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wma  reason: case insensitive filesystem */
public final class C2879wma {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f12681a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f12682b;

    public final synchronized Map<String, String> a() {
        if (this.f12682b == null) {
            this.f12682b = Collections.unmodifiableMap(new HashMap(this.f12681a));
        }
        return this.f12682b;
    }
}
