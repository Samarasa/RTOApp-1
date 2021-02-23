package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fz  reason: case insensitive filesystem */
public enum C1692fz implements C3076zea {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: f  reason: collision with root package name */
    private static final Cea<C1692fz> f10486f = null;

    /* renamed from: h  reason: collision with root package name */
    private final int f10488h;

    static {
        f10486f = new C1694gA();
    }

    private C1692fz(int i) {
        this.f10488h = i;
    }

    public static Bea a() {
        return C0747Gz.f7114a;
    }

    public static C1692fz a(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public final String toString() {
        return "<" + C1692fz.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10488h + " name=" + name() + '>';
    }
}
