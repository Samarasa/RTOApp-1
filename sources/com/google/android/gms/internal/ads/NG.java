package com.google.android.gms.internal.ads;

public final class NG implements C2963xu, C1900iv {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f7939a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f7940b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final XG f7941c;

    public NG(XG xg) {
        this.f7941c = xg;
    }

    private final void a(boolean z) {
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue() && a()) {
            this.f7941c.a(z);
            synchronized (f7939a) {
                f7940b++;
            }
        }
    }

    private static boolean a() {
        boolean z;
        synchronized (f7939a) {
            z = f7940b < ((Integer) Qqa.e().a(F.Ae)).intValue();
        }
        return z;
    }

    public final void H() {
        a(true);
    }

    public final void a(C1824hqa hqa) {
        a(false);
    }
}
