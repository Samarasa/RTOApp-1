package c.a.a.c.c;

import c.a.a.c.a.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import c.a.a.h.c;

public class C<Model> implements u<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    private static final C<?> f3256a = new C<>();

    public static class a<Model> implements v<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        private static final a<?> f3257a = new a<>();

        public static <T> a<T> a() {
            return f3257a;
        }

        public u<Model, Model> a(y yVar) {
            return C.a();
        }
    }

    private static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        private final Model f3258a;

        b(Model model) {
            this.f3258a = model;
        }

        public Class<Model> a() {
            return this.f3258a.getClass();
        }

        public void a(h hVar, d.a<? super Model> aVar) {
            aVar.a(this.f3258a);
        }

        public void b() {
        }

        public c.a.a.c.a c() {
            return c.a.a.c.a.LOCAL;
        }

        public void cancel() {
        }
    }

    public static <T> C<T> a() {
        return f3256a;
    }

    public u.a<Model> a(Model model, int i, int i2, k kVar) {
        return new u.a<>(new c(model), new b(model));
    }

    public boolean a(Model model) {
        return true;
    }
}
