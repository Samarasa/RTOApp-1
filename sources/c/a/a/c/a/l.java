package c.a.a.c.a;

import c.a.a.c.a.e;
import c.a.a.c.b.a.b;
import c.a.a.c.d.a.t;
import java.io.InputStream;

public final class l implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final t f2984a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final b f2985a;

        public a(b bVar) {
            this.f2985a = bVar;
        }

        public e<InputStream> a(InputStream inputStream) {
            return new l(inputStream, this.f2985a);
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }
    }

    l(InputStream inputStream, b bVar) {
        this.f2984a = new t(inputStream, bVar);
        this.f2984a.mark(5242880);
    }

    public InputStream a() {
        this.f2984a.reset();
        return this.f2984a;
    }

    public void b() {
        this.f2984a.r();
    }
}
