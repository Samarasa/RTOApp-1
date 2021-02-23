package com.google.firebase.components;

import c.b.d.e.a;

public class v<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14478a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f14479b = f14478a;

    /* renamed from: c  reason: collision with root package name */
    private volatile a<T> f14480c;

    public v(a<T> aVar) {
        this.f14480c = aVar;
    }

    public T get() {
        T t = this.f14479b;
        if (t == f14478a) {
            synchronized (this) {
                t = this.f14479b;
                if (t == f14478a) {
                    t = this.f14480c.get();
                    this.f14479b = t;
                    this.f14480c = null;
                }
            }
        }
        return t;
    }
}
