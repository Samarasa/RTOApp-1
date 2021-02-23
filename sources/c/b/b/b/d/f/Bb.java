package c.b.b.b.d.f;

final class Bb {

    /* renamed from: a  reason: collision with root package name */
    private static final Ab<?> f4098a = new Cb();

    /* renamed from: b  reason: collision with root package name */
    private static final Ab<?> f4099b = c();

    static Ab<?> a() {
        return f4098a;
    }

    static Ab<?> b() {
        Ab<?> ab = f4099b;
        if (ab != null) {
            return ab;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static Ab<?> c() {
        try {
            return (Ab) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
