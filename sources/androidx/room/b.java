package androidx.room;

import b.p.a.f;

public abstract class b<T> extends w {
    public b(s sVar) {
        super(sVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(f fVar, T t);

    public final void a(T t) {
        f a2 = a();
        try {
            a(a2, t);
            a2.d();
        } finally {
            a(a2);
        }
    }
}
