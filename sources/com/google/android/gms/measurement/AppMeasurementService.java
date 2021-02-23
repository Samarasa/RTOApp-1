package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import b.l.a.a;
import com.google.android.gms.measurement.internal.Nd;
import com.google.android.gms.measurement.internal.Rd;

public final class AppMeasurementService extends Service implements Rd {

    /* renamed from: a  reason: collision with root package name */
    private Nd<AppMeasurementService> f13153a;

    private final Nd<AppMeasurementService> a() {
        if (this.f13153a == null) {
            this.f13153a = new Nd<>(this);
        }
        return this.f13153a;
    }

    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        a.a(intent);
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return a().a(intent);
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

    public final int onStartCommand(Intent intent, int i, int i2) {
        return a().a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return a().b(intent);
    }
}
