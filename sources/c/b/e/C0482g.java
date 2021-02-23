package c.b.e;

/* renamed from: c.b.e.g  reason: case insensitive filesystem */
final class C0482g {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f5021a = b();

    public static C0483h a() {
        if (f5021a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0483h.f5023b;
    }

    private static final C0483h a(String str) {
        return (C0483h) f5021a.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
