package c.b.b.a.a.e;

import d.a.b;

public final class d implements b<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final d f3810a = new d();

    public static d a() {
        return f3810a;
    }

    public static a b() {
        a b2 = b.b();
        d.a.d.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public a get() {
        return b();
    }
}
