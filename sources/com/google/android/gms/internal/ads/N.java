package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;

public final class N {
    public static Q a(T t) {
        if (t == null) {
            return null;
        }
        return t.a(p.j().b());
    }

    public static boolean a(T t, Q q, String... strArr) {
        if (t == null || q == null || !t.f8722a || q == null) {
            return false;
        }
        return t.a(q, p.j().b(), strArr);
    }
}
