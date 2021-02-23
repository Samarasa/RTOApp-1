package c.b.b.b.d.f;

public final class yf implements zf {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4645a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4646b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4647c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0443wa<Boolean> f4648d;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4645a = ca.a("measurement.client.sessions.background_sessions_enabled", true);
        f4646b = ca.a("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f4647c = ca.a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f4648d = ca.a("measurement.client.sessions.session_id_enabled", true);
    }

    public final boolean a() {
        return f4645a.c().booleanValue();
    }

    public final boolean b() {
        return f4647c.c().booleanValue();
    }

    public final boolean l() {
        return f4648d.c().booleanValue();
    }
}
