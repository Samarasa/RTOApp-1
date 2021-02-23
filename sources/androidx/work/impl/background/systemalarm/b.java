package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.c.o;
import java.util.HashMap;
import java.util.Map;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1794a = h.a("CommandHandler");

    /* renamed from: b  reason: collision with root package name */
    private final Context f1795b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, a> f1796c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Object f1797d = new Object();

    b(Context context) {
        this.f1795b = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    private static boolean a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void b(Intent intent, int i, g gVar) {
        h.a().a(f1794a, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new d(this.f1795b, i, gVar).a();
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void c(Intent intent, int i, g gVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f1797d) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            h.a().a(f1794a, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f1796c.containsKey(string)) {
                e eVar = new e(this.f1795b, i, string, gVar);
                this.f1796c.put(string, eVar);
                eVar.a();
            } else {
                h.a().a(f1794a, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void d(Intent intent, int i, g gVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        h.a().a(f1794a, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        a(string, z);
    }

    private void e(Intent intent, int i, g gVar) {
        h.a().a(f1794a, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        gVar.d().j();
    }

    private void f(Intent intent, int i, g gVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h.a().a(f1794a, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase g2 = gVar.d().g();
        g2.c();
        try {
            o d2 = g2.r().d(string);
            if (d2 == null) {
                h a2 = h.a();
                String str = f1794a;
                a2.e(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (d2.f1891d.a()) {
                h a3 = h.a();
                String str2 = f1794a;
                a3.e(str2, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                g2.e();
            } else {
                long a4 = d2.a();
                if (!d2.b()) {
                    h.a().a(f1794a, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                    a.a(this.f1795b, gVar.d(), string, a4);
                } else {
                    h.a().a(f1794a, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                    a.a(this.f1795b, gVar.d(), string, a4);
                    gVar.a((Runnable) new g.a(gVar, a(this.f1795b), i));
                }
                g2.k();
                g2.e();
            }
        } finally {
            g2.e();
        }
    }

    private void g(Intent intent, int i, g gVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h.a().a(f1794a, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        gVar.d().c(string);
        a.a(this.f1795b, gVar.d(), string);
        gVar.a(string, false);
    }

    /* access modifiers changed from: package-private */
    public void a(Intent intent, int i, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b(intent, i, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            e(intent, i, gVar);
        } else if (!a(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            h.a().b(f1794a, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            f(intent, i, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            c(intent, i, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            g(intent, i, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            d(intent, i, gVar);
        } else {
            h.a().e(f1794a, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }

    public void a(String str, boolean z) {
        synchronized (this.f1797d) {
            a remove = this.f1796c.remove(str);
            if (remove != null) {
                remove.a(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        boolean z;
        synchronized (this.f1797d) {
            z = !this.f1796c.isEmpty();
        }
        return z;
    }
}
