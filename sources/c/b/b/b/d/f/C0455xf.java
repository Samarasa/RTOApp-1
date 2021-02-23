package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.xf  reason: case insensitive filesystem */
public final class C0455xf implements C0434uf {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4631a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4632b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4633c;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4631a = ca.a("measurement.service.sessions.remove_disabled_session_number", true);
        f4632b = ca.a("measurement.service.sessions.session_number_enabled", true);
        f4633c = ca.a("measurement.service.sessions.session_number_backfill_enabled", true);
    }

    public final boolean a() {
        return f4631a.c().booleanValue();
    }

    public final boolean b() {
        return f4632b.c().booleanValue();
    }

    public final boolean l() {
        return f4633c.c().booleanValue();
    }
}
