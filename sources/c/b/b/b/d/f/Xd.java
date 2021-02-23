package c.b.b.b.d.f;

public final class Xd implements Yd {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4331a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Long> f4332b;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4331a = ca.a("measurement.upload_dsid_enabled", true);
        f4332b = ca.a("measurement.id.upload_dsid_enabled", 0);
    }

    public final boolean a() {
        return f4331a.c().booleanValue();
    }
}
