package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.c.C0193e;
import androidx.work.impl.c.C0194f;
import androidx.work.impl.m;
import androidx.work.impl.utils.e;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1793a = h.a("Alarms");

    public static void a(Context context, m mVar, String str) {
        C0194f p = mVar.g().p();
        C0193e a2 = p.a(str);
        if (a2 != null) {
            a(context, str, a2.f1877b);
            h.a().a(f1793a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            p.b(str);
        }
    }

    public static void a(Context context, m mVar, String str, long j) {
        C0194f p = mVar.g().p();
        C0193e a2 = p.a(str);
        if (a2 != null) {
            a(context, str, a2.f1877b);
            a(context, str, a2.f1877b, j);
            return;
        }
        int a3 = new e(context).a();
        p.a(new C0193e(str, a3));
        a(context, str, a3, j);
    }

    private static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, i, b.a(context, str), 536870912);
        if (service2 != null && alarmManager != null) {
            h.a().a(f1793a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service2);
        }
    }

    private static void a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, i, b.a(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service2);
        } else {
            alarmManager.set(0, j, service2);
        }
    }
}
