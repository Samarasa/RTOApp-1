package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.Hf;

final class we implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hf f13810a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f13811b;

    we(AppMeasurementDynamiteService appMeasurementDynamiteService, Hf hf) {
        this.f13811b = appMeasurementDynamiteService;
        this.f13810a = hf;
    }

    public final void run() {
        this.f13811b.f13179a.v().a(this.f13810a, this.f13811b.f13179a.b());
    }
}
