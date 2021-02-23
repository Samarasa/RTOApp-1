package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.impl.c.o;
import androidx.work.impl.d;

public class h implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1828a = androidx.work.h.a("SystemAlarmScheduler");

    /* renamed from: b  reason: collision with root package name */
    private final Context f1829b;

    public h(Context context) {
        this.f1829b = context.getApplicationContext();
    }

    private void a(o oVar) {
        androidx.work.h.a().a(f1828a, String.format("Scheduling work with workSpecId %s", new Object[]{oVar.f1890c}), new Throwable[0]);
        this.f1829b.startService(b.b(this.f1829b, oVar.f1890c));
    }

    public void a(String str) {
        this.f1829b.startService(b.c(this.f1829b, str));
    }

    public void a(o... oVarArr) {
        for (o a2 : oVarArr) {
            a(a2);
        }
    }
}
