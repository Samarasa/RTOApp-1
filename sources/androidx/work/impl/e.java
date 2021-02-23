package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.c;
import androidx.work.impl.c.o;
import androidx.work.impl.c.p;
import androidx.work.impl.utils.f;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1915a = h.a("Schedulers");

    private static d a(Context context) {
        try {
            d dVar = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            h.a().a(f1915a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return dVar;
        } catch (Throwable th) {
            h.a().a(f1915a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }

    static d a(Context context, m mVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            c cVar = new c(context, mVar);
            f.a(context, SystemJobService.class, true);
            h.a().a(f1915a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return cVar;
        }
        d a2 = a(context);
        if (a2 != null) {
            return a2;
        }
        androidx.work.impl.background.systemalarm.h hVar = new androidx.work.impl.background.systemalarm.h(context);
        f.a(context, SystemAlarmService.class, true);
        h.a().a(f1915a, "Created SystemAlarmScheduler", new Throwable[0]);
        return hVar;
    }

    public static void a(b bVar, WorkDatabase workDatabase, List<d> list) {
        if (list != null && list.size() != 0) {
            p r = workDatabase.r();
            workDatabase.c();
            try {
                List<o> a2 = r.a(bVar.c());
                if (a2 != null && a2.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (o oVar : a2) {
                        r.a(oVar.f1890c, currentTimeMillis);
                    }
                }
                workDatabase.k();
                if (a2 != null && a2.size() > 0) {
                    o[] oVarArr = (o[]) a2.toArray(new o[0]);
                    for (d a3 : list) {
                        a3.a(oVarArr);
                    }
                }
            } finally {
                workDatabase.e();
            }
        }
    }
}
