package c.a.a.c.c;

import b.h.i.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final y f3329a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3330b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C0051a<?>> f3331a = new HashMap();

        /* renamed from: c.a.a.c.c.w$a$a  reason: collision with other inner class name */
        private static class C0051a<Model> {

            /* renamed from: a  reason: collision with root package name */
            final List<u<Model, ?>> f3332a;

            public C0051a(List<u<Model, ?>> list) {
                this.f3332a = list;
            }
        }

        a() {
        }

        public <Model> List<u<Model, ?>> a(Class<Model> cls) {
            C0051a aVar = this.f3331a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f3332a;
        }

        public void a() {
            this.f3331a.clear();
        }

        public <Model> void a(Class<Model> cls, List<u<Model, ?>> list) {
            if (this.f3331a.put(cls, new C0051a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public w(d<List<Throwable>> dVar) {
        this(new y(dVar));
    }

    private w(y yVar) {
        this.f3330b = new a();
        this.f3329a = yVar;
    }

    private static <A> Class<A> b(A a2) {
        return a2.getClass();
    }

    private synchronized <A> List<u<A, ?>> b(Class<A> cls) {
        List<u<A, ?>> a2;
        a2 = this.f3330b.a(cls);
        if (a2 == null) {
            a2 = Collections.unmodifiableList(this.f3329a.a(cls));
            this.f3330b.a(cls, a2);
        }
        return a2;
    }

    public synchronized List<Class<?>> a(Class<?> cls) {
        return this.f3329a.b(cls);
    }

    public <A> List<u<A, ?>> a(A a2) {
        List b2 = b(b(a2));
        int size = b2.size();
        List<u<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            u uVar = (u) b2.get(i);
            if (uVar.a(a2)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(uVar);
            }
        }
        return emptyList;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, v<? extends Model, ? extends Data> vVar) {
        this.f3329a.a(cls, cls2, vVar);
        this.f3330b.a();
    }
}
