package c.b.b.b.d.f;

public final class He implements De {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4179a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4180b;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4179a = ca.a("measurement.collection.efficient_engagement_reporting_enabled", false);
        f4180b = ca.a("measurement.collection.redundant_engagement_removal_enabled", false);
    }

    public final boolean a() {
        return f4179a.c().booleanValue();
    }

    public final boolean b() {
        return f4180b.c().booleanValue();
    }
}
