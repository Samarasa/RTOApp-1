package c.a.a.f;

import c.a.a.c.m;
import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f3566a = new ArrayList();

    private static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f3567a;

        /* renamed from: b  reason: collision with root package name */
        final m<T> f3568b;

        a(Class<T> cls, m<T> mVar) {
            this.f3567a = cls;
            this.f3568b = mVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.f3567a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> m<Z> a(Class<Z> cls) {
        int size = this.f3566a.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f3566a.get(i);
            if (aVar.a(cls)) {
                return aVar.f3568b;
            }
        }
        return null;
    }

    public synchronized <Z> void a(Class<Z> cls, m<Z> mVar) {
        this.f3566a.add(new a(cls, mVar));
    }
}
