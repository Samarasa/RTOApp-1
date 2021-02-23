package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.vfa  reason: case insensitive filesystem */
final class C2794vfa {

    /* renamed from: a  reason: collision with root package name */
    private static final C2794vfa f12518a = new C2794vfa();

    /* renamed from: b  reason: collision with root package name */
    private final Ffa f12519b = new Wea();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Cfa<?>> f12520c = new ConcurrentHashMap();

    private C2794vfa() {
    }

    public static C2794vfa a() {
        return f12518a;
    }

    public final <T> Cfa<T> a(Class<T> cls) {
        Aea.a(cls, "messageType");
        Cfa<T> cfa = (Cfa) this.f12520c.get(cls);
        if (cfa != null) {
            return cfa;
        }
        Cfa<T> a2 = this.f12519b.a(cls);
        Aea.a(cls, "messageType");
        Aea.a(a2, "schema");
        Cfa<T> putIfAbsent = this.f12520c.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }

    public final <T> Cfa<T> a(T t) {
        return a(t.getClass());
    }
}
