package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Nd;
import com.google.android.gms.measurement.internal.Rd;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements Rd {

    /* renamed from: a  reason: collision with root package name */
    private Nd<AppMeasurementJobService> f13151a;

    private final Nd<AppMeasurementJobService> a() {
        if (this.f13151a == null) {
            this.f13151a = new Nd<>(this);
        }
        return this.f13151a;
    }

    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final void a(Intent intent) {
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().c(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return a().a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return a().b(intent);
    }
}
