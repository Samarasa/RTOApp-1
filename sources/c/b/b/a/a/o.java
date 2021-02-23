package c.b.b.a.a;

import c.b.b.a.a.d;
import c.b.b.a.b;
import c.b.b.a.c;
import c.b.b.a.e;

abstract class o {

    public static abstract class a {
        public abstract a a(p pVar);

        /* access modifiers changed from: package-private */
        public abstract a a(b bVar);

        /* access modifiers changed from: package-private */
        public abstract a a(c<?> cVar);

        /* access modifiers changed from: package-private */
        public abstract a a(e<?, byte[]> eVar);

        public abstract a a(String str);

        public abstract o a();
    }

    o() {
    }

    public static a a() {
        return new d.a();
    }

    public abstract b b();

    /* access modifiers changed from: package-private */
    public abstract c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
