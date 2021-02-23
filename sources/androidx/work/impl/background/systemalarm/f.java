package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.utils.k;

class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f1815a;

    f(g gVar) {
        this.f1815a = gVar;
    }

    public void run() {
        g.c cVar;
        g gVar;
        synchronized (this.f1815a.i) {
            this.f1815a.j = this.f1815a.i.get(0);
        }
        Intent intent = this.f1815a.j;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f1815a.j.getIntExtra("KEY_START_ID", 0);
            h.a().a(g.f1816a, String.format("Processing command %s, %s", new Object[]{this.f1815a.j, Integer.valueOf(intExtra)}), new Throwable[0]);
            PowerManager.WakeLock a2 = k.a(this.f1815a.f1817b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
            try {
                h.a().a(g.f1816a, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a2}), new Throwable[0]);
                a2.acquire();
                this.f1815a.f1822g.a(this.f1815a.j, intExtra, this.f1815a);
                h.a().a(g.f1816a, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2}), new Throwable[0]);
                a2.release();
                gVar = this.f1815a;
                cVar = new g.c(gVar);
            } catch (Throwable th) {
                h.a().a(g.f1816a, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2}), new Throwable[0]);
                a2.release();
                g gVar2 = this.f1815a;
                gVar2.a((Runnable) new g.c(gVar2));
                throw th;
            }
            gVar.a((Runnable) cVar);
        }
    }
}
