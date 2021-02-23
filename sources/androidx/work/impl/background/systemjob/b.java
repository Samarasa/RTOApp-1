package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.c;
import androidx.work.d;
import androidx.work.h;
import androidx.work.i;
import androidx.work.impl.c.o;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1844a = h.a("SystemJobInfoConverter");

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1845b;

    b(Context context) {
        this.f1845b = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    static int a(i iVar) {
        int i = a.f1843a[iVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        h.a().a(f1844a, String.format("API version too low. Cannot convert network type value %s", new Object[]{iVar}), new Throwable[0]);
        return 1;
    }

    private static JobInfo.TriggerContentUri a(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(o oVar, int i) {
        c cVar = oVar.l;
        int a2 = a(cVar.b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.f1890c);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f1845b).setRequiredNetworkType(a2).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        if (!cVar.h()) {
            extras.setBackoffCriteria(oVar.o, oVar.n == a.LINEAR ? 0 : 1);
        }
        extras.setMinimumLatency(Math.max(oVar.a() - System.currentTimeMillis(), 0));
        if (Build.VERSION.SDK_INT >= 24 && cVar.e()) {
            for (d.a a3 : cVar.a().a()) {
                extras.addTriggerContentUri(a(a3));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        return extras.build();
    }
}
