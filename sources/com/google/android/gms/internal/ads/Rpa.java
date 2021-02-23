package com.google.android.gms.internal.ads;

public enum Rpa implements C3076zea {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: d  reason: collision with root package name */
    private static final Cea<Rpa> f8547d = null;

    /* renamed from: f  reason: collision with root package name */
    private final int f8549f;

    static {
        f8547d = new Qpa();
    }

    private Rpa(int i) {
        this.f8549f = i;
    }

    public static Rpa a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static Bea c() {
        return Spa.f8692a;
    }

    public final int a() {
        return this.f8549f;
    }

    public final String toString() {
        return "<" + Rpa.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8549f + " name=" + name() + '>';
    }
}
