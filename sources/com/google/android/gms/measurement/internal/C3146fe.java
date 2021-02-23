package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.Hf;

/* renamed from: com.google.android.gms.measurement.internal.fe  reason: case insensitive filesystem */
final class C3146fe implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hf f13571a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13572b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13573c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f13574d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f13575e;

    C3146fe(AppMeasurementDynamiteService appMeasurementDynamiteService, Hf hf, String str, String str2, boolean z) {
        this.f13575e = appMeasurementDynamiteService;
        this.f13571a = hf;
        this.f13572b = str;
        this.f13573c = str2;
        this.f13574d = z;
    }

    public final void run() {
        this.f13575e.f13179a.E().a(this.f13571a, this.f13572b, this.f13573c, this.f13574d);
    }
}
