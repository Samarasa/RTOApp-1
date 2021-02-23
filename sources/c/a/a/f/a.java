package c.a.a.f;

import c.a.a.c.d;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0054a<?>> f3552a = new ArrayList();

    /* renamed from: c.a.a.f.a$a  reason: collision with other inner class name */
    private static final class C0054a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f3553a;

        /* renamed from: b  reason: collision with root package name */
        final d<T> f3554b;

        C0054a(Class<T> cls, d<T> dVar) {
            this.f3553a = cls;
            this.f3554b = dVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.f3553a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> d<T> a(Class<T> cls) {
        for (C0054a next : this.f3552a) {
            if (next.a(cls)) {
                return next.f3554b;
            }
        }
        return null;
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.f3552a.add(new C0054a(cls, dVar));
    }
}
