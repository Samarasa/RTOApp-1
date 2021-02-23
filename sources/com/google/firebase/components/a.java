package com.google.firebase.components;

import java.util.Set;

abstract class a implements f {
    a() {
    }

    public <T> T a(Class<T> cls) {
        c.b.d.e.a<T> b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }

    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
