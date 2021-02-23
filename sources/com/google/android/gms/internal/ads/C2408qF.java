package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qF  reason: case insensitive filesystem */
public enum C2408qF implements C3076zea {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: e  reason: collision with root package name */
    private static final Cea<C2408qF> f11824e = null;

    /* renamed from: g  reason: collision with root package name */
    private final int f11826g;

    static {
        f11824e = new SG();
    }

    private C2408qF(int i) {
        this.f11826g = i;
    }

    public static C2408qF a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static Bea c() {
        return C2479rG.f11944a;
    }

    public final int a() {
        return this.f11826g;
    }

    public final String toString() {
        return "<" + C2408qF.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11826g + " name=" + name() + '>';
    }
}
