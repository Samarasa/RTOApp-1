package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jia  reason: case insensitive filesystem */
public enum C1949jia implements C3076zea {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    UNKNOWN(999);
    

    /* renamed from: g  reason: collision with root package name */
    private static final Cea<C1949jia> f10981g = null;
    private final int i;

    static {
        f10981g = new C2162mia();
    }

    private C1949jia(int i2) {
        this.i = i2;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return "<" + C1949jia.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.i + " name=" + name() + '>';
    }
}
