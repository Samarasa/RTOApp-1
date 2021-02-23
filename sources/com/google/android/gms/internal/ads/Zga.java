package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Zga<K, V> extends Uga<K, V, V> {

    /* renamed from: b  reason: collision with root package name */
    private static final C1876iha<Map<Object, Object>> f9580b = _ga.a(Collections.emptyMap());

    private Zga(Map<K, C1876iha<V>> map) {
        super(map);
    }

    public static <K, V> C1310aha<K, V> a(int i) {
        return new C1310aha<>(i);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap c2 = Wga.c(a().size());
        for (Map.Entry entry : a().entrySet()) {
            c2.put(entry.getKey(), ((C1876iha) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(c2);
    }
}
