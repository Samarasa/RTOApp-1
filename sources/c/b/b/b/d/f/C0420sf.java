package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.sf  reason: case insensitive filesystem */
public final class C0420sf implements C0427tf {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4571a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4572b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4573c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0443wa<Boolean> f4574d;

    /* renamed from: e  reason: collision with root package name */
    private static final C0443wa<Boolean> f4575e;

    /* renamed from: f  reason: collision with root package name */
    private static final C0443wa<Boolean> f4576f;

    /* renamed from: g  reason: collision with root package name */
    private static final C0443wa<Long> f4577g;

    /* renamed from: h  reason: collision with root package name */
    private static final C0443wa<Boolean> f4578h;
    private static final C0443wa<Boolean> i;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4571a = ca.a("measurement.service.audience.scoped_filters_v27", false);
        f4572b = ca.a("measurement.service.audience.session_scoped_user_engagement", false);
        f4573c = ca.a("measurement.client.audience.scoped_engagement_removal_when_session_expired", true);
        f4574d = ca.a("measurement.service.audience.scoped_engagement_removal_when_session_expired", true);
        f4575e = ca.a("measurement.service.audience.session_scoped_event_aggregates", false);
        f4576f = ca.a("measurement.service.audience.use_bundle_timestamp_for_property_filters", false);
        f4577g = ca.a("measurement.id.scoped_audience_filters", 0);
        f4578h = ca.a("measurement.service.audience.fix_prepending_previous_sequence_timestamp", false);
        i = ca.a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f4571a.c().booleanValue();
    }

    public final boolean d() {
        return f4574d.c().booleanValue();
    }

    public final boolean e() {
        return f4573c.c().booleanValue();
    }

    public final boolean l() {
        return f4572b.c().booleanValue();
    }

    public final boolean m() {
        return f4578h.c().booleanValue();
    }

    public final boolean n() {
        return i.c().booleanValue();
    }

    public final boolean o() {
        return f4575e.c().booleanValue();
    }

    public final boolean p() {
        return f4576f.c().booleanValue();
    }
}
