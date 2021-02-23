package c.b.b.b.d.f;

public final class Te implements Qe {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4288a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4289b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4290c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0443wa<Boolean> f4291d;

    /* renamed from: e  reason: collision with root package name */
    private static final C0443wa<Long> f4292e;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4288a = ca.a("measurement.sdk.collection.last_deep_link_referrer", false);
        f4289b = ca.a("measurement.sdk.collection.last_deep_link_referrer_campaign", false);
        f4290c = ca.a("measurement.sdk.collection.last_gclid_from_referrer", false);
        f4291d = ca.a("measurement.sdk.collection.worker_thread_referrer", true);
        f4292e = ca.a("measurement.id.sdk.collection.last_deep_link_referrer", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f4288a.c().booleanValue();
    }

    public final boolean d() {
        return f4291d.c().booleanValue();
    }

    public final boolean e() {
        return f4290c.c().booleanValue();
    }

    public final boolean l() {
        return f4289b.c().booleanValue();
    }
}
