package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import c.b.b.b.d.f.Tf;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.measurement.internal.Rd;

public final class Nd<T extends Context & Rd> {

    /* renamed from: a  reason: collision with root package name */
    private final T f13370a;

    public Nd(T t) {
        C0563t.a(t);
        this.f13370a = t;
    }

    private final void a(Runnable runnable) {
        C3176ke a2 = C3176ke.a((Context) this.f13370a);
        a2.g().a((Runnable) new Sd(this, a2, runnable));
    }

    private final Bb c() {
        return C3144fc.a((Context) this.f13370a, (Tf) null).h();
    }

    public final int a(Intent intent, int i, int i2) {
        C3144fc a2 = C3144fc.a((Context) this.f13370a, (Tf) null);
        Bb h2 = a2.h();
        if (intent == null) {
            h2.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.i();
        h2.B().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a((Runnable) new Qd(this, i2, h2, intent));
        }
        return 2;
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            c().t().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C3150gc(C3176ke.a((Context) this.f13370a));
        }
        c().w().a("onBind received unknown action", action);
        return null;
    }

    public final void a() {
        C3144fc a2 = C3144fc.a((Context) this.f13370a, (Tf) null);
        Bb h2 = a2.h();
        a2.i();
        h2.B().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Bb bb, Intent intent) {
        if (((Rd) this.f13370a).a(i)) {
            bb.B().a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            c().B().a("Completed wakeful intent.");
            ((Rd) this.f13370a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bb bb, JobParameters jobParameters) {
        bb.B().a("AppMeasurementJobService processed last upload request.");
        ((Rd) this.f13370a).a(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean a(JobParameters jobParameters) {
        C3144fc a2 = C3144fc.a((Context) this.f13370a, (Tf) null);
        Bb h2 = a2.h();
        String string = jobParameters.getExtras().getString("action");
        a2.i();
        h2.B().a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a((Runnable) new Pd(this, h2, jobParameters));
        return true;
    }

    public final void b() {
        C3144fc a2 = C3144fc.a((Context) this.f13370a, (Tf) null);
        Bb h2 = a2.h();
        a2.i();
        h2.B().a("Local AppMeasurementService is shutting down");
    }

    public final boolean b(Intent intent) {
        if (intent == null) {
            c().t().a("onUnbind called with null intent");
            return true;
        }
        c().B().a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void c(Intent intent) {
        if (intent == null) {
            c().t().a("onRebind called with null intent");
            return;
        }
        c().B().a("onRebind called. action", intent.getAction());
    }
}
