package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uga  reason: case insensitive filesystem */
public enum C2725uga implements C3076zea {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);
    

    /* renamed from: f  reason: collision with root package name */
    private static final Cea<C2725uga> f12370f = null;

    /* renamed from: h  reason: collision with root package name */
    private final int f12372h;

    static {
        f12370f = new C2867wga();
    }

    private C2725uga(int i) {
        this.f12372h = i;
    }

    public static Bea a() {
        return C2938xga.f12799a;
    }

    public static C2725uga a(int i) {
        if (i == 0) {
            return SAFE;
        }
        if (i == 1) {
            return DANGEROUS;
        }
        if (i == 2) {
            return UNKNOWN;
        }
        if (i == 3) {
            return POTENTIALLY_UNWANTED;
        }
        if (i != 4) {
            return null;
        }
        return DANGEROUS_HOST;
    }

    public final String toString() {
        return "<" + C2725uga.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12372h + " name=" + name() + '>';
    }
}
