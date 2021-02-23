package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.Hf;

final class Fc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hf f13245a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3192o f13246b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13247c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f13248d;

    Fc(AppMeasurementDynamiteService appMeasurementDynamiteService, Hf hf, C3192o oVar, String str) {
        this.f13248d = appMeasurementDynamiteService;
        this.f13245a = hf;
        this.f13246b = oVar;
        this.f13247c = str;
    }

    public final void run() {
        this.f13248d.f13179a.E().a(this.f13245a, this.f13246b, this.f13247c);
    }
}
