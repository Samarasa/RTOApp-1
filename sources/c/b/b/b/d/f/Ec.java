package c.b.b.b.d.f;

final class Ec {

    /* renamed from: a  reason: collision with root package name */
    private static final Cc f4142a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final Cc f4143b = new Bc();

    static Cc a() {
        return f4142a;
    }

    static Cc b() {
        return f4143b;
    }

    private static Cc c() {
        try {
            return (Cc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
