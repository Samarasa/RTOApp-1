package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.bb  reason: case insensitive filesystem */
final class C0299bb {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f4375a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f4376b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a() {
        return f4375a != null && !f4376b;
    }

    static Class<?> b() {
        return f4375a;
    }
}
