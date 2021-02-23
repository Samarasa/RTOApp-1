package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.c;
import androidx.work.impl.c.o;
import androidx.work.impl.c.p;
import androidx.work.impl.e;
import androidx.work.impl.m;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1958a = h.a("ForceStopRunnable");

    /* renamed from: b  reason: collision with root package name */
    private static final long f1959b = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c  reason: collision with root package name */
    private final Context f1960c;

    /* renamed from: d  reason: collision with root package name */
    private final m f1961d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f1962a = h.a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                h.a().d(f1962a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.b(context);
            }
        }
    }

    public ForceStopRunnable(Context context, m mVar) {
        this.f1960c = context.getApplicationContext();
        this.f1961d = mVar;
    }

    private static PendingIntent a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, a(context), i);
    }

    static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a2 = a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f1959b;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, a2);
        } else {
            alarmManager.set(0, currentTimeMillis, a2);
        }
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            c.b(this.f1960c);
        }
        WorkDatabase g2 = this.f1961d.g();
        p r = g2.r();
        g2.c();
        try {
            List<o> b2 = r.b();
            boolean z = b2 != null && !b2.isEmpty();
            if (z) {
                for (o next : b2) {
                    r.a(androidx.work.o.ENQUEUED, next.f1890c);
                    r.a(next.f1890c, -1);
                }
            }
            g2.k();
            return z;
        } finally {
            g2.e();
        }
    }

    public boolean b() {
        if (a(this.f1960c, 536870912) != null) {
            return false;
        }
        b(this.f1960c);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f1961d.d().a();
    }

    public void run() {
        h.a().a(f1958a, "Performing cleanup operations.", new Throwable[0]);
        boolean a2 = a();
        if (c()) {
            h.a().a(f1958a, "Rescheduling Workers.", new Throwable[0]);
            this.f1961d.j();
            this.f1961d.d().a(false);
        } else if (b()) {
            h.a().a(f1958a, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f1961d.j();
        } else if (a2) {
            h.a().a(f1958a, "Found unfinished work, scheduling it.", new Throwable[0]);
            e.a(this.f1961d.b(), this.f1961d.g(), this.f1961d.f());
        }
        this.f1961d.i();
    }
}
