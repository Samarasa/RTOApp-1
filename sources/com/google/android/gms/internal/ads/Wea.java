package com.google.android.gms.internal.ads;

final class Wea implements Ffa {

    /* renamed from: a  reason: collision with root package name */
    private static final C1660ffa f9151a = new Zea();

    /* renamed from: b  reason: collision with root package name */
    private final C1660ffa f9152b;

    public Wea() {
        this(new Yea(C2792vea.a(), a()));
    }

    private Wea(C1660ffa ffa) {
        Aea.a(ffa, "messageInfoFactory");
        this.f9152b = ffa;
    }

    private static C1660ffa a() {
        try {
            return (C1660ffa) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f9151a;
        }
    }

    private static boolean a(C1731gfa gfa) {
        return gfa.a() == C2581sfa.f12118a;
    }

    public final <T> Cfa<T> a(Class<T> cls) {
        Efa.a((Class<?>) cls);
        C1731gfa a2 = this.f9152b.a(cls);
        if (a2.b()) {
            return C2934xea.class.isAssignableFrom(cls) ? C2156mfa.a(Efa.c(), C2296oea.a(), a2.c()) : C2156mfa.a(Efa.a(), C2296oea.b(), a2.c());
        }
        if (C2934xea.class.isAssignableFrom(cls)) {
            if (a(a2)) {
                return C2085lfa.a(cls, a2, C2510rfa.b(), Tea.b(), Efa.c(), C2296oea.a(), C1519dfa.b());
            }
            return C2085lfa.a(cls, a2, C2510rfa.b(), Tea.b(), Efa.c(), (C2154mea<?>) null, C1519dfa.b());
        } else if (a(a2)) {
            return C2085lfa.a(cls, a2, C2510rfa.a(), Tea.a(), Efa.a(), C2296oea.b(), C1519dfa.a());
        } else {
            return C2085lfa.a(cls, a2, C2510rfa.a(), Tea.a(), Efa.b(), (C2154mea<?>) null, C1519dfa.a());
        }
    }
}
