package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bca  reason: case insensitive filesystem */
public enum C1371bca implements C3076zea {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    private static final Cea<C1371bca> f9922f = null;

    /* renamed from: h  reason: collision with root package name */
    private final int f9924h;

    static {
        f9922f = new C1300aca();
    }

    private C1371bca(int i) {
        this.f9924h = i;
    }

    public static C1371bca a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f9924h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C1371bca.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
