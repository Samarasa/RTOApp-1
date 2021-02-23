package com.google.android.gms.internal.ads;

public enum TH implements C3076zea {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: e  reason: collision with root package name */
    private static final Cea<TH> f8758e = null;

    /* renamed from: g  reason: collision with root package name */
    private final int f8760g;

    static {
        f8758e = new C2551sH();
    }

    private TH(int i) {
        this.f8760g = i;
    }

    public static Bea a() {
        return C2623tI.f12173a;
    }

    public static TH a(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public final String toString() {
        return "<" + TH.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8760g + " name=" + name() + '>';
    }
}
