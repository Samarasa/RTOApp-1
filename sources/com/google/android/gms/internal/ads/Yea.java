package com.google.android.gms.internal.ads;

final class Yea implements C1660ffa {

    /* renamed from: a  reason: collision with root package name */
    private C1660ffa[] f9426a;

    Yea(C1660ffa... ffaArr) {
        this.f9426a = ffaArr;
    }

    public final C1731gfa a(Class<?> cls) {
        for (C1660ffa ffa : this.f9426a) {
            if (ffa.b(cls)) {
                return ffa.a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        for (C1660ffa b2 : this.f9426a) {
            if (b2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
