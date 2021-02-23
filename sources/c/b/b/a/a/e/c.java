package c.b.b.a.a.e;

import d.a.b;
import d.a.d;

public final class c implements b<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final c f3809a = new c();

    public static c a() {
        return f3809a;
    }

    public static a b() {
        a a2 = b.a();
        d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public a get() {
        return b();
    }
}
