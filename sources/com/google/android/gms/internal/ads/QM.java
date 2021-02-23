package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class QM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final double f8320a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8321b;

    public QM(double d2, boolean z) {
        this.f8320a = d2;
        this.f8321b = z;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a2 = C1359bT.a(bundle, "device");
        bundle.putBundle("device", a2);
        Bundle a3 = C1359bT.a(a2, "battery");
        a2.putBundle("battery", a3);
        a3.putBoolean("is_charging", this.f8321b);
        a3.putDouble("battery_level", this.f8320a);
    }
}
