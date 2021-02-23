package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Q> f8850a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final T f8851b;

    public U(T t) {
        this.f8851b = t;
    }

    public final T a() {
        return this.f8851b;
    }

    public final void a(String str, Q q) {
        this.f8850a.put(str, q);
    }

    public final void a(String str, String str2, long j) {
        T t = this.f8851b;
        Q q = this.f8850a.get(str2);
        String[] strArr = {str};
        if (!(t == null || q == null)) {
            t.a(q, j, strArr);
        }
        Map<String, Q> map = this.f8850a;
        T t2 = this.f8851b;
        map.put(str, t2 == null ? null : t2.a(j));
    }
}
