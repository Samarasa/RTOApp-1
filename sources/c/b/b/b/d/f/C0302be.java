package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.be  reason: case insensitive filesystem */
public final class C0302be implements Zd {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4379a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4380b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0443wa<Boolean> f4381c;

    /* renamed from: d  reason: collision with root package name */
    private static final C0443wa<Long> f4382d;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4379a = ca.a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        f4380b = ca.a("measurement.collection.init_params_control_enabled", true);
        f4381c = ca.a("measurement.sdk.dynamite.use_dynamite2", false);
        f4382d = ca.a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean a() {
        return f4379a.c().booleanValue();
    }

    public final boolean b() {
        return f4381c.c().booleanValue();
    }
}
