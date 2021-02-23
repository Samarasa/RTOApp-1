package com.google.android.gms.internal.ads;

public enum QE implements C3076zea {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);
    

    /* renamed from: g  reason: collision with root package name */
    private static final Cea<QE> f8308g = null;
    private final int i;

    static {
        f8308g = new C2336pE();
    }

    private QE(int i2) {
        this.i = i2;
    }

    public static QE a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 == 3) {
            return UNENCRYPTED;
        }
        if (i2 == 4) {
            return DG;
        }
        if (i2 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    public static Bea c() {
        return RF.f8452a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return "<" + QE.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.i + " name=" + name() + '>';
    }
}
