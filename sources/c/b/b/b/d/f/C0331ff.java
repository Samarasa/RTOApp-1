package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.ff  reason: case insensitive filesystem */
public final class C0331ff implements C0345hf {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4431a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Double> f4432b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Long> f4433c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0443wa<Long> f4434d;

    /* renamed from: e  reason: collision with root package name */
    private static final C0443wa<String> f4435e;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4431a = ca.a("measurement.test.boolean_flag", false);
        f4432b = ca.a("measurement.test.double_flag", -3.0d);
        f4433c = ca.a("measurement.test.int_flag", -2);
        f4434d = ca.a("measurement.test.long_flag", -1);
        f4435e = ca.a("measurement.test.string_flag", "---");
    }

    public final boolean a() {
        return f4431a.c().booleanValue();
    }

    public final double b() {
        return f4432b.c().doubleValue();
    }

    public final String d() {
        return f4435e.c();
    }

    public final long e() {
        return f4434d.c().longValue();
    }

    public final long l() {
        return f4433c.c().longValue();
    }
}
