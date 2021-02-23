package c.b.b.b.d.f;

public final class Be implements Ce {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4102a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4103b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4104c;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4102a = ca.a("measurement.client.sessions.check_on_reset_and_enable", false);
        f4103b = ca.a("measurement.client.sessions.check_on_startup", true);
        f4104c = ca.a("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f4102a.c().booleanValue();
    }

    public final boolean e() {
        return f4104c.c().booleanValue();
    }

    public final boolean l() {
        return f4103b.c().booleanValue();
    }
}
