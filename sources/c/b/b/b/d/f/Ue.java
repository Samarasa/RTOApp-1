package c.b.b.b.d.f;

public final class Ue implements Ve {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4304a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4305b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4306c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0443wa<Long> f4307d;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4304a = ca.a("measurement.lifecycle.app_backgrounded_engagement", false);
        f4305b = ca.a("measurement.lifecycle.app_backgrounded_tracking", false);
        f4306c = ca.a("measurement.lifecycle.app_in_background_parameter", false);
        f4307d = ca.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean a() {
        return f4304a.c().booleanValue();
    }

    public final boolean b() {
        return f4305b.c().booleanValue();
    }

    public final boolean l() {
        return f4306c.c().booleanValue();
    }
}
