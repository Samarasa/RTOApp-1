package c.b.b.b.d.f;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class Fc {

    /* renamed from: a  reason: collision with root package name */
    private static final Fc f4155a = new Fc();

    /* renamed from: b  reason: collision with root package name */
    private final Mc f4156b = new C0355jc();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Kc<?>> f4157c = new ConcurrentHashMap();

    private Fc() {
    }

    public static Fc a() {
        return f4155a;
    }

    public final <T> Kc<T> a(Class<T> cls) {
        Nb.a(cls, "messageType");
        Kc<T> kc = (Kc) this.f4157c.get(cls);
        if (kc != null) {
            return kc;
        }
        Kc<T> b2 = this.f4156b.b(cls);
        Nb.a(cls, "messageType");
        Nb.a(b2, "schema");
        Kc<T> putIfAbsent = this.f4157c.putIfAbsent(cls, b2);
        return putIfAbsent != null ? putIfAbsent : b2;
    }

    public final <T> Kc<T> a(T t) {
        return a(t.getClass());
    }
}
