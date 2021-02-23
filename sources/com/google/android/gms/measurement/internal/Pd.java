package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

final /* synthetic */ class Pd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Nd f13385a;

    /* renamed from: b  reason: collision with root package name */
    private final Bb f13386b;

    /* renamed from: c  reason: collision with root package name */
    private final JobParameters f13387c;

    Pd(Nd nd, Bb bb, JobParameters jobParameters) {
        this.f13385a = nd;
        this.f13386b = bb;
        this.f13387c = jobParameters;
    }

    public final void run() {
        this.f13385a.a(this.f13386b, this.f13387c);
    }
}
