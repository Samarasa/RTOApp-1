package c.b.b.b.d.f;

public final class Ze implements We {

    /* renamed from: a  reason: collision with root package name */
    private static final C0443wa<Boolean> f4356a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0443wa<Boolean> f4357b;

    static {
        Ca ca = new Ca(C0450xa.a("com.google.android.gms.measurement"));
        f4356a = ca.a("measurement.personalized_ads_signals_collection_enabled", true);
        f4357b = ca.a("measurement.personalized_ads_property_translation_enabled", true);
    }

    public final boolean a() {
        return f4356a.c().booleanValue();
    }

    public final boolean b() {
        return f4357b.c().booleanValue();
    }
}
