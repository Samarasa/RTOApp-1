package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import c.b.b.b.d.f.Gc;
import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.measurement.internal.ge  reason: case insensitive filesystem */
public final class C3152ge extends C3158he {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f13591d = ((AlarmManager) f().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private final C3147g f13592e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f13593f;

    protected C3152ge(C3176ke keVar) {
        super(keVar);
        this.f13592e = new C3140ee(this, keVar.t(), keVar);
    }

    @TargetApi(24)
    private final void v() {
        int w = w();
        h().B().a("Cancelling job. JobID", Integer.valueOf(w));
        ((JobScheduler) f().getSystemService("jobscheduler")).cancel(w);
    }

    private final int w() {
        if (this.f13593f == null) {
            String valueOf = String.valueOf(f().getPackageName());
            this.f13593f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f13593f.intValue();
    }

    private final PendingIntent x() {
        Context f2 = f();
        return PendingIntent.getBroadcast(f2, 0, new Intent().setClassName(f2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final void a(long j) {
        r();
        i();
        Context f2 = f();
        if (!Wb.a(f2)) {
            h().A().a("Receiver not registered/enabled");
        }
        if (!se.a(f2, false)) {
            h().A().a("Service not registered/enabled");
        }
        u();
        long b2 = j().b() + j;
        if (j < Math.max(0, C3202q.z.a(null).longValue()) && !this.f13592e.b()) {
            h().B().a("Scheduling upload with DelayedRunnable");
            this.f13592e.a(j);
        }
        i();
        if (Build.VERSION.SDK_INT >= 24) {
            h().B().a("Scheduling upload with JobScheduler");
            Context f3 = f();
            ComponentName componentName = new ComponentName(f3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int w = w();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            h().B().a("Scheduling job. JobID", Integer.valueOf(w));
            Gc.a(f3, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        h().B().a("Scheduling upload with AlarmManager");
        this.f13591d.setInexactRepeating(2, b2, Math.max(C3202q.u.a(null).longValue(), j), x());
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ oe n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C3129d o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        this.f13591d.cancel(x());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        v();
        return false;
    }

    public final void u() {
        r();
        this.f13591d.cancel(x());
        this.f13592e.c();
        if (Build.VERSION.SDK_INT >= 24) {
            v();
        }
    }
}
