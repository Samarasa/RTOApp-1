package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class Ld implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hd f13345a;

    Ld(Hd hd) {
        this.f13345a = hd;
    }

    public final void run() {
        C3196od odVar = this.f13345a.f13291c;
        Context f2 = odVar.f();
        this.f13345a.f13291c.i();
        odVar.a(new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
