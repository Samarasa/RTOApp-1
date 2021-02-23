package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.Hf;

/* renamed from: com.google.android.gms.measurement.internal.ed  reason: case insensitive filesystem */
final class C3139ed implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hf f13557a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f13558b;

    C3139ed(AppMeasurementDynamiteService appMeasurementDynamiteService, Hf hf) {
        this.f13558b = appMeasurementDynamiteService;
        this.f13557a = hf;
    }

    public final void run() {
        this.f13558b.f13179a.E().a(this.f13557a);
    }
}
