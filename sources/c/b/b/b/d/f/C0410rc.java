package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.rc  reason: case insensitive filesystem */
final class C0410rc {

    /* renamed from: a  reason: collision with root package name */
    private static final C0397pc f4548a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final C0397pc f4549b = new C0417sc();

    static C0397pc a() {
        return f4548a;
    }

    static C0397pc b() {
        return f4549b;
    }

    private static C0397pc c() {
        try {
            return (C0397pc) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
