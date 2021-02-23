package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.Hf;

final class Fd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hf f13249a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13250b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13251c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f13252d;

    Fd(AppMeasurementDynamiteService appMeasurementDynamiteService, Hf hf, String str, String str2) {
        this.f13252d = appMeasurementDynamiteService;
        this.f13249a = hf;
        this.f13250b = str;
        this.f13251c = str2;
    }

    public final void run() {
        this.f13252d.f13179a.E().a(this.f13249a, this.f13250b, this.f13251c);
    }
}
