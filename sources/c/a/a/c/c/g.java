package c.a.a.c.c;

import c.a.a.c.a.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import java.io.IOException;
import java.io.InputStream;

public final class g<Model, Data> implements u<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Data> f3287a;

    public interface a<Data> {
        Class<Data> a();

        void a(Data data);

        Data decode(String str);
    }

    private static final class b<Data> implements d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final String f3288a;

        /* renamed from: b  reason: collision with root package name */
        private final a<Data> f3289b;

        /* renamed from: c  reason: collision with root package name */
        private Data f3290c;

        b(String str, a<Data> aVar) {
            this.f3288a = str;
            this.f3289b = aVar;
        }

        public Class<Data> a() {
            return this.f3289b.a();
        }

        public void a(h hVar, d.a<? super Data> aVar) {
            try {
                this.f3290c = this.f3289b.decode(this.f3288a);
                aVar.a(this.f3290c);
            } catch (IllegalArgumentException e2) {
                aVar.a((Exception) e2);
            }
        }

        public void b() {
            try {
                this.f3289b.a(this.f3290c);
            } catch (IOException unused) {
            }
        }

        public c.a.a.c.a c() {
            return c.a.a.c.a.LOCAL;
        }

        public void cancel() {
        }
    }

    public static final class c<Model> implements v<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final a<InputStream> f3291a = new h(this);

        public u<Model, InputStream> a(y yVar) {
            return new g(this.f3291a);
        }
    }

    public g(a<Data> aVar) {
        this.f3287a = aVar;
    }

    public u.a<Data> a(Model model, int i, int i2, k kVar) {
        return new u.a<>(new c.a.a.h.c(model), new b(model.toString(), this.f3287a));
    }

    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
